package com.databaseconnection;

import com.emppayroll.EmpDeptDetails;
import com.emppayroll.EmpPayDetails;
import com.emppayroll.Employee;

public class IEmpDetails {
	 	void getEmployeeDetails(int id);
	    void addEmployeePersonalDetails(Employee employee);
	    void addEmployeePayDetails(EmpPayDetails employeePayDetails);
	    void addEmployeeDepartmentDetails(EmpDeptDetails employee_department_details);
}
