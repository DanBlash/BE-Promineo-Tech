package pet.store.service;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import pet.store.controller.model.PetStoreCustomer;
import pet.store.controller.model.PetStoreData;
import pet.store.controller.model.PetStoreEmployee;
import pet.store.dao.CustomerDao;
import pet.store.dao.EmployeeDao;
import pet.store.dao.PetStoreDao;
import pet.store.entity.Customer;
import pet.store.entity.Employee;
import pet.store.entity.PetStore;

@Service

public class PetStoreService {

	@Autowired
	private PetStoreDao petStoreDao;

	@Autowired
	private EmployeeDao employeeDao;

	@Autowired
	private CustomerDao customerDao;

	@Transactional(readOnly = false)
	public PetStoreData savePetStore(PetStoreData petStoreData) {
		Long petStoreId = petStoreData.getPetStoreId();
		PetStore petStore = findOrCreatePetStore(petStoreId);
		copyPetStoreFields(petStore, petStoreData);
		return new PetStoreData(petStoreDao.save(petStore));
	}

	private void copyPetStoreFields(PetStore petStore, PetStoreData petStoreData) {
		petStore.setPetStoreName(petStoreData.getPetStoreName());
		petStore.setPetStoreAddress(petStoreData.getPetStoreAddress());
		petStore.setPetStoreCity(petStoreData.getPetStoreCity());
		petStore.setPetStoreState(petStoreData.getPetStoreState());
		petStore.setPetStoreZip(petStoreData.getPetStoreZip());
		petStore.setPetStorePhone(petStoreData.getPetStorePhone());
	}

	private PetStore findOrCreatePetStore(Long petStoreId) {
		PetStore petStore;

		if (Objects.isNull(petStoreId)) {
			petStore = new PetStore();
		} else {
			petStore = findPetStoreById(petStoreId);
		}
		return petStore;
	}

	private PetStore findPetStoreById(Long petStoreId) {
		return petStoreDao.findById(petStoreId)
				.orElseThrow(() -> new NoSuchElementException("Pet Store with ID = " + petStoreId + " was not found."));

	}

	@Transactional(readOnly = false)
	public PetStoreEmployee saveEmployee(Long petStoreId, PetStoreEmployee petStoreEmployee) {

		PetStore petStore = findPetStoreById(petStoreId);
		Long employeeId = petStoreEmployee.getEmployeeId();
		Employee employee = findOrCreateEmployee(petStoreId, employeeId);

		copyEmployeeFields(employee, petStoreEmployee);

		employee.setPetStore(petStore);
		petStore.getEmployees().add(employee);

		return new PetStoreEmployee(employeeDao.save(employee));
	}

	private void copyEmployeeFields(Employee employee, PetStoreEmployee petStoreEmployee) {
		employee.setEmployeeFirstName(petStoreEmployee.getEmployeeFirstName());
		employee.setEmployeeLastName(petStoreEmployee.getEmployeeLastName());
		employee.setEmployeeJobTitle(petStoreEmployee.getEmployeeJobTitle());
		employee.setEmployeePhone(petStoreEmployee.getEmployeePhone());

	}

	private Employee findOrCreateEmployee(Long petStoreId, Long employeeId) {
		Employee employee;

		if (Objects.isNull(employeeId)) {
			employee = new Employee();
		} else {
			employee = findEmployeeById(petStoreId, employeeId);
		}
		return employee;
	}

	private Employee findEmployeeById(Long petStoreId, Long employeeId) {
		Employee employee = employeeDao.findById(employeeId)
				.orElseThrow(() -> new NoSuchElementException("Employee with ID = " + employeeId + " was not found."));

		if (petStoreId != employee.getPetStore().getPetStoreId()) {
			throw new IllegalArgumentException();
		}
		return employee;
	}

	public PetStoreCustomer saveCustomer(Long petStoreId, PetStoreCustomer petStoreCustomer) {

		PetStore petStore = findPetStoreById(petStoreId);
		Long customerId = petStoreCustomer.getCustomerId();
		Customer customer = findOrCreateCustomer(petStoreId, customerId);

		copyCustomerFields(customer, petStoreCustomer);
		
		customer.getPetStores().add(petStore);
		petStore.getCustomers().add(customer);

		return new PetStoreCustomer(customerDao.save(customer));
	}

	private void copyCustomerFields(Customer customer, PetStoreCustomer petStoreCustomer) {
		customer.setCustomerEmail(petStoreCustomer.getCustomerEmail());
		customer.setCustomerFirstName(petStoreCustomer.getCustomerFirstName());
		customer.setCustomerLastName(petStoreCustomer.getCustomerLastName());
	}

	private Customer findOrCreateCustomer(Long petStoreId, Long customerId) {
		Customer customer;

		if (Objects.isNull(customerId)) {
			customer = new Customer();
		} else {
			customer = findCustomerbyId(petStoreId, customerId);
		}
		return customer;
	}

	private Customer findCustomerbyId(Long petStoreId, Long customerId) {
		Customer customer = customerDao.findById(customerId)
				.orElseThrow(() -> new NoSuchElementException("Customer with ID = " + customerId + " was not found."));
		
		for (PetStore petstore : customer.getPetStores()) {
			if (petStoreId != petstore.getPetStoreId()) {
				throw new IllegalArgumentException();
			}
		}
		return customer;
	}
	
	@Transactional
	public List<PetStoreData> retrieveAllPetStores() {
		List<PetStoreData> result = new LinkedList<>();
		List<PetStore> petStores = petStoreDao.findAll();
		
		for (PetStore petStore : petStores) {
			PetStoreData psd = new PetStoreData(petStore);
			
			psd.getCustomers().clear();
			psd.getEmployees().clear();
			
			result.add(psd);
		}
		return result;
	}
	
	@Transactional
	public PetStoreData retrievePetStoreById(Long petStoreId) {
		PetStoreData results = new PetStoreData(findPetStoreById(petStoreId));
		return results;
	}
	

	public Map<String, String> deleteStoreById(Long petStoreId) {
		PetStore petStore = findPetStoreById(petStoreId);
		petStoreDao.delete(petStore);
		return Collections.singletonMap("Message", "Deleted succesfully"); 
	}

	
	
}
