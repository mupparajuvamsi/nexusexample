package com.example.crudrestapiexample;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class customerinfoController {
	@Autowired
	customerinfoRepositroy customerinfoRepositroy;

//method for saving employee details
	@RequestMapping(value = "/createcustomerinfo", method = RequestMethod.POST)
	public void createEmployee(@RequestBody customerinfo employee) {
		customerinfoRepositroy.save(employee);

	}

	@RequestMapping(value = "/getAmountByMobileNumber", method = RequestMethod.GET)
	public String getAmountByMobileNumber(@RequestParam("mobileno") String mobileno) {
		customerinfo customerinfo = customerinfoRepositroy.getAmountByMobileNumber(mobileno);
		return customerinfo.getAmount();
	}
	
	@RequestMapping(value = "/getMobileNumberFromAmount", method = RequestMethod.GET)
	public String getMobileNumberFromAmount(@RequestParam("amount") String amount) {
		customerinfo customerinfo = customerinfoRepositroy.getMobileNumberFromAmount(amount);
		return customerinfo.getMobileno();
	}
	// method for getting all employee details
		@RequestMapping(value = "/getAllcustomerinfo", method = RequestMethod.GET)
		public List<customerinfo> getAllStudents() {
			return customerinfoRepositroy.findAll();
		}

	
	
}
