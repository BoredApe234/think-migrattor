package com.mps.think.setup.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.mps.think.setup.model.Addresses;
import com.mps.think.setup.vo.AddressesVO;

@Service
public interface AddressService {
	
	public AddressesVO saveAddresses(AddressesVO addresses);

	public AddressesVO updateAddresses(AddressesVO addresses);

	public Addresses findbyAddressesId(Integer addressesId);
	
	public Addresses deleteByAddressesId(Integer addressesId);

//	Addresses updatePrimaryAddressbyCustId(Integer customerId, Integer addressId);
	
//	public List<Addresses> getAllAddressesByCustomerId(Integer cusId);
	
	public void setGivenAddressesNonPrimary(List<Integer> addressesIds);
	
	public void updateSelectedAddressAsPrimary(Integer addressId);

	public List<Addresses> getAllAddresses();
	
    public List<Addresses> getTodayAndYesterdayRecords();

}
