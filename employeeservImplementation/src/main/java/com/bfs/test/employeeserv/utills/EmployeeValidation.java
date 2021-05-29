package com.bfs.test.employeeserv.utills;

import com.bfs.test.employeeserv.api.model.Employee;
import com.bfs.test.employeeserv.exceptions.EmployeeException;
import org.springframework.http.HttpStatus;

import java.util.Optional;

/**
 * <File Description>.
 *
 * @author sudha.narayanan
 */
public  class EmployeeValidation {
    public static void isValidEmployee(Employee emp)throws EmployeeException {
        isNull(emp);
        if (isNullOrEmpty(emp.getFirstName())) {
            throw new EmployeeException(HttpStatus.BAD_REQUEST, "Employee first name is required");
        }
        if (isNullOrEmpty(emp.getLastName())) {
            throw new EmployeeException(HttpStatus.BAD_REQUEST, "Employee last name is required");
        }
        if (isNullOrEmpty(emp.getAddressLine1())) {
            throw new EmployeeException(HttpStatus.BAD_REQUEST, " Address is required");
        }
        if (isNullOrEmpty(emp.getState())) {
            throw new EmployeeException(HttpStatus.BAD_REQUEST, " state is required");
        }
        if (isNullOrEmpty(emp.getCity())) {
            throw new EmployeeException(HttpStatus.BAD_REQUEST, " city is required");
        }
        if (isNullOrEmpty(emp.getCountry())) {
            throw new EmployeeException(HttpStatus.BAD_REQUEST, "country is required");
        }
        if (emp.getZipcode() == 0) {
            throw new EmployeeException(HttpStatus.BAD_REQUEST, "zipcode is required");
        }
        if (String.valueOf(emp.getZipcode()).length() <6) {
            throw new EmployeeException(HttpStatus.BAD_REQUEST, "invalid zipcode");
        }
    }
    public static void isNull(Employee emp) throws EmployeeException {
        if( emp == null){
            throw new EmployeeException(HttpStatus.BAD_REQUEST , "Employee is empty");
        }
    }
    public static boolean isNullOrEmpty(String obj){
        return obj ==null || obj.isEmpty();
    }
}
