package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.CurrencyExchange;
import com.mps.think.setup.vo.CurrencyExchangeVO;

public interface CurrencyExchangeService {

	public List<CurrencyExchange> findAllCurrencyExchange();

	public CurrencyExchange saveCurrencyExchange(CurrencyExchange currrncyExc);

	public CurrencyExchange updateCurrencyExchange(CurrencyExchange currrncyExc);

	public CurrencyExchange findbyId(Integer currrncyExcId);

	public List<CurrencyExchange> getAllCurrencyExchange();
	
	List<CurrencyExchange> findAllCurrencyExchangeForPublisher(Integer pubId);
	
	public CurrencyExchange deleteByCurrencyExchangeId(Integer id);

}
