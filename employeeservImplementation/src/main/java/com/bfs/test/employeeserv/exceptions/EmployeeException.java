package com.bfs.test.employeeserv.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

/**
 * <File Description>.
 *
 * @author sudha.narayanan
 */
public class EmployeeException extends ResponseStatusException {
    public EmployeeException(HttpStatus code, String message){
        super(code,message);
    }
}
