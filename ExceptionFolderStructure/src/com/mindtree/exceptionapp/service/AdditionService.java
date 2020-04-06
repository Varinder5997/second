package com.mindtree.exceptionapp.service;

import com.mindtree.exceptionapp.exception.service.AddByFiveException;
import com.mindtree.exceptionapp.exception.service.AdditionAppServiceException;

public class AdditionService {
	public int addNumber(int fNumber, int sNumber) throws AdditionAppServiceException {
		if (sNumber == 5)
			throw new AddByFiveException("Number Does not added By 5");

		return fNumber + sNumber;
	}
}
