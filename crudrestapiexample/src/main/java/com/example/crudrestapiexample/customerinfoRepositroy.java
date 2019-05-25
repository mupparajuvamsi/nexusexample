package com.example.crudrestapiexample;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface customerinfoRepositroy extends JpaRepository<customerinfo, Long> {
	@Query("select c from customerinfo c where c.mobileno=?1")
	customerinfo getAmountByMobileNumber(String mobileno);
	
	@Query("select c from customerinfo c where c.amount=?1")
	customerinfo getMobileNumberFromAmount(String amount);
}
