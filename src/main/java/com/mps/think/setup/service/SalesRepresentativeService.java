package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.SalesRepresentative;
import com.mps.think.setup.vo.SalesRepresentativeVO;

public interface SalesRepresentativeService {

	public List<SalesRepresentative> findAllSalesRepresentative();

	public SalesRepresentativeVO saveSalesRepresentative(SalesRepresentativeVO salesRepresentativeVO);
	
	public SalesRepresentativeVO updateSalesRepresentative(SalesRepresentativeVO salesRepresentativeVO);

	public SalesRepresentative findbySalesRepresentativeId(Integer contactId);
	
	public List<SalesRepresentative> findAllSalesRepresentativeByPubId(Integer pubId);

	SalesRepresentative findbytId(Integer contactId);
	
	public SalesRepresentative deleteBySalesRepresentativeId(Integer salesRepID);

	public List<SalesRepresentative> getAllSalesRepresentative();

}
