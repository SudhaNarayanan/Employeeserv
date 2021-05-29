package com.bfs.test.employeeserv.model;

import com.bfs.test.employeeserv.api.model.Employee;
import org.springframework.http.HttpStatus;

/**
 * <File Description>.
 *
 * @author sudha.narayanan
 */
public class EmployeeResponse {
    HttpStatus status;
    Employee emp;
    String errorMessage;
    public EmployeeResponse(Employee emp, String errorMessage){
        this.emp = emp;
        this.errorMessage =errorMessage;
    }
}
