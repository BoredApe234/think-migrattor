package com.mps.think.setup.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.mps.think.setup.model.Address;
import com.mps.think.setup.vo.AddressVO;

@Service
public interface AddressessService {
	
	public List<Address> getAllAddress();

	public Address saveAddress(AddressVO address);

	public Address updateAddress(AddressVO address);

	public Address findbyAddressId(Integer id);

	public Address deleteByAddressId(Integer id);

	List<Address> findAllAddressForPublisher(Integer pubId);

}
