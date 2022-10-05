package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.bean.Feedback;
import com.dao.FeedbackDao;

@Service
public class FeedbackService {
	
	@Autowired
	FeedbackDao feedbackdao;
	
	public String storeFeedback(Feedback fee) {
		if(feedbackdao.storeFeedback(fee)>0) {
			return "Record stored";
		}else {
			return "Record didn't store";
		}
	}


}
