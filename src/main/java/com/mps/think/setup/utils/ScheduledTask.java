package com.mps.think.setup.utils;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.mps.think.setup.serviceImpl.SuspendOrderServiceImpl;

@Component
public class ScheduledTask {
    
	@Autowired
	SuspendOrderServiceImpl suspendService;
	
    @Scheduled(cron = "0 0 1 * * *") // Cron expression for 1 am every day
    public void runTask() {
    	try {
    		suspendService.checkOrdersToContinue();
    		suspendService.checkOrdersToContinue();			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
}
