package com.bfs.test.employeeserv.service;

import com.bfs.test.employeeserv.api.model.Employee;
import com.bfs.test.employeeserv.exceptions.EmployeeException;
import com.bfs.test.employeeserv.repository.EmployeeRepository;
import com.bfs.test.employeeserv.utills.EmployeeValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * <File Description>.
 *
 * @author sudha.narayanan
 */
@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository repository;

    public void save(Employee employee) throws EmployeeException {
        EmployeeValidation.isValidEmployee(employee);
        repository.save(employee);
    }
    public Employee getEmployee(Integer id){
        Optional<Employee> emp = repository.findById(id);
        if(emp.isPresent())
            return emp.get();
        else
            return null;
    }
}
