package com.bfs.test.employeeserv.controller;

import com.bfs.test.employeeserv.api.EmployeeResource;
import com.bfs.test.employeeserv.api.model.Employee;
import com.bfs.test.employeeserv.exceptions.EmployeeException;
import com.bfs.test.employeeserv.model.EmployeeResponse;
import com.bfs.test.employeeserv.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Implementation class for employee resource.
 */
@RestController
public class EmployeeResourceImpl  implements EmployeeResource {

    @Autowired
    EmployeeService service;
    @RequestMapping("/v1/bfs/employees/{id}")
    public ResponseEntity<Employee> employeeGetById(@PathVariable("id") String id) {
            Employee emp = service.getEmployee(Integer.parseInt(id));
            return new ResponseEntity<>(emp, HttpStatus.OK);

    }

    @RequestMapping(value = "/v1/bfs/employee",method = RequestMethod.POST)
    public ResponseEntity<?> save(@RequestBody final Employee employee) {
        try {
            service.save(employee);
            return new ResponseEntity<>(employee, HttpStatus.OK);
        }
        catch (EmployeeException ex){
            return new ResponseEntity<>(ex.getMessage(),ex.getStatus());
        }
    }
}
