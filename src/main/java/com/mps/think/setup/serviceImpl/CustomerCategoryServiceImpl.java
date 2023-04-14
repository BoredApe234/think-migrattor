package com.mps.think.setup.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import com.mps.think.setup.model.CustomerCategory;
import com.mps.think.setup.model.Publisher;
import com.mps.think.setup.repo.CustomerCategoryRepo;
import com.mps.think.setup.service.CustomerCategoryService;
import com.mps.think.setup.vo.CustomerCategoryVO;
@Service
public class CustomerCategoryServiceImpl implements CustomerCategoryService {

	@Autowired
	CustomerCategoryRepo CustomerCategoryRepo;
	@Override
	public List<CustomerCategory> findAllCustomerCategory() {
		List<CustomerCategory> ccList = CustomerCategoryRepo.findAll();
		if (ccList.isEmpty()) {
			throw new NotFoundException("No Customer category present, please add Customer category!");
		}
		return ccList;
	}

	@Override
	public CustomerCategoryVO saveCustomerCategory(CustomerCategoryVO customerCategory) {
		CustomerCategory data= new CustomerCategory();
		data.setStatus(customerCategory.getStatus());
		Publisher publisher=new Publisher();
		publisher.setId(customerCategory.getPubId().getId());
		data.setPubId(publisher);
		data.setThinkCategory(customerCategory.getThinkCategory());
		data.setCustCategory(customerCategory.getCustCategory());
		data.setDefaultcc(customerCategory.getDefaultcc());
		CustomerCategoryRepo.saveAndFlush(data);
		customerCategory.setCustomerCategoryId(data.getCustomerCategoryId());	
		return customerCategory;
	}
	
	private void makeOtherCustomerCategoriesFalse(Integer pubId) {
		List<CustomerCategory> customerCategories = CustomerCategoryRepo.findAllCustomerCategoryByPubId(pubId);
		customerCategories.stream().filter(cc -> cc.getDefaultcc() == null || cc.getDefaultcc()).forEach(c -> {
			c.setDefaultcc(false);
		});
		CustomerCategoryRepo.saveAllAndFlush(customerCategories);
	}

	@Override
	public CustomerCategoryVO updateCustomerCategory(CustomerCategoryVO customerCategory) {
		CustomerCategory data= new CustomerCategory();
		data.setCustomerCategoryId(customerCategory.getCustomerCategoryId());
		data.setStatus(customerCategory.getStatus());
		Publisher publisher=new Publisher();
		publisher.setId(customerCategory.getPubId().getId());
		data.setPubId(publisher);
		data.setThinkCategory(customerCategory.getThinkCategory());
		data.setCustCategory(customerCategory.getCustCategory());
		data.setDefaultcc(customerCategory.getDefaultcc());
		if(customerCategory.getDefaultcc() != null && customerCategory.getDefaultcc()) {
			makeOtherCustomerCategoriesFalse(customerCategory.getPubId().getId());			
		}
		CustomerCategoryRepo.saveAndFlush(data);
		return customerCategory;
	}


	@Override
	public CustomerCategory findbyCustomerCategoryId(Integer customerCategoryId) {
		Optional<CustomerCategory> cc = CustomerCategoryRepo.findById(customerCategoryId);
		
		if(!cc.isPresent()) {
			throw new NotFoundException("Customer category Id : "+customerCategoryId+" does not exist!");
		}
		return cc.get();
	}

	@Override
	public CustomerCategory deleteByCustomerCategoryId(Integer customerCategoryId) {
		CustomerCategory delete = findbyCustomerCategoryId(customerCategoryId);
		CustomerCategoryRepo.delete(delete);
		return delete;
	}

	@Override
	public List<CustomerCategory> findAllCustomerCategoryByPubId(Integer pubId) {
		return CustomerCategoryRepo.findAllCustomerCategoryByPubId(pubId);
	}

}
