package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mps.think.setup.model.Countries;
import com.mps.think.setup.model.CurrencyExchange;
import com.mps.think.setup.model.Publisher;
import com.mps.think.setup.repo.CurrencyExchangeRepo;
import com.mps.think.setup.service.CurrencyExchangeService;
import com.mps.think.setup.vo.CurrencyExchangeVO;

@Service
public class CurrencyExchangeServiceImpl implements CurrencyExchangeService {

	@Autowired
	CurrencyExchangeRepo currencyExchangeRepo;
	
	@Autowired
	private ObjectMapper mapper;

	@Override
	public List<CurrencyExchange> findAllCurrencyExchange() {
		return currencyExchangeRepo.findAll();
	}

	@Override
	public CurrencyExchange findbyId(Integer currrncyExcId) {
		return currencyExchangeRepo.findById(currrncyExcId).get();
	}

	@Override
	public List<CurrencyExchange> getAllCurrencyExchange() {
		return currencyExchangeRepo.findAll();
	}

	@Override
	public List<CurrencyExchange> findAllCurrencyExchangeForPublisher(Integer pubId) {
		return currencyExchangeRepo.findByPubIdId(pubId);
	}

	@Override
	public CurrencyExchange deleteByCurrencyExchangeId(Integer id) {
		CurrencyExchange delete = findbyId(id);
		currencyExchangeRepo.delete(delete);
		return delete;
	}



	@Override
	public CurrencyExchange saveCurrencyExchange(CurrencyExchange currrncyExc) {
		return currencyExchangeRepo.saveAndFlush(mapper.convertValue(currrncyExc, CurrencyExchange.class));
	}



	@Override
	public CurrencyExchange updateCurrencyExchange(CurrencyExchange currrncyExc) {
		return currencyExchangeRepo.saveAndFlush(mapper.convertValue(currrncyExc, CurrencyExchange.class));
	}

}
