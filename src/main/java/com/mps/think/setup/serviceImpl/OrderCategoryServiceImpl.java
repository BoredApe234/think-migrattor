package com.mps.think.setup.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import com.mps.think.setup.model.OrderCategory;
import com.mps.think.setup.model.Publisher;
import com.mps.think.setup.repo.OrderCategoryRepo;
import com.mps.think.setup.service.OrderCategoryService;
import com.mps.think.setup.vo.OrderCategoryVO;

@Service
public class OrderCategoryServiceImpl implements OrderCategoryService {
	@Autowired
	OrderCategoryRepo orderCategoryRepo;

	@Override
	public List<OrderCategory> findAllOrderCategory() {
		List<OrderCategory> ordList = orderCategoryRepo.findAll();
		if (ordList.isEmpty()) {
			throw new NotFoundException("No Order category present, please add Order category!");
		}
		return ordList;
	}

	@Override
	public OrderCategoryVO saveOrderCategory(OrderCategoryVO orderCategory) {
		OrderCategory data= new OrderCategory();
		data.setOrderCategory(orderCategory.getOrderCategory());
		data.setOrderDescription(orderCategory.getOrderDescription());
		Publisher publisher=new Publisher();
		publisher.setId(orderCategory.getPubId().getId());
		data.setPubId(publisher);
		orderCategoryRepo.saveAndFlush(data);
		orderCategory.setOrderCategoryId(data.getOrderCategoryId());	
		return orderCategory;
	}

	@Override
	public OrderCategoryVO updateOrderCategory(OrderCategoryVO orderCategory) {
		OrderCategory data= new OrderCategory();
		data.setOrderCategoryId(orderCategory.getOrderCategoryId());
		Publisher publisher=new Publisher();
		publisher.setId(orderCategory.getPubId().getId());
		data.setPubId(publisher);
		data.setOrderCategory(orderCategory.getOrderCategory());
		data.setOrderDescription(orderCategory.getOrderDescription());
		orderCategoryRepo.saveAndFlush(data);
		return orderCategory;
	}

	@Override
	public OrderCategory findbyOrderCategoryId(Integer orderCategoryId) {
        Optional<OrderCategory> cc = orderCategoryRepo.findById(orderCategoryId);
		if(!cc.isPresent()) {
			throw new NotFoundException("Order category Id : "+ orderCategoryId +" does not exist!");
		}
		return cc.get();
	}

	@Override
	public OrderCategory deleteByOrderCategoryId(Integer orderCategoryId) {
		OrderCategory Delete = orderCategoryRepo.findByOrderCategoryId(orderCategoryId);
		orderCategoryRepo.delete(Delete);
		return Delete;
	}

	@Override
	public List<OrderCategory> findAllOrderCategoryByPubId(Integer publisherId) {
		// TODO Auto-generated method stub
		return orderCategoryRepo.findByPubIdId(publisherId);
	}



	
  


}
