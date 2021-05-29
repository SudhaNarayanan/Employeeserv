package com.bfs.test.employeeserv.repository;

import com.bfs.test.employeeserv.api.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <File Description>.
 *
 * @author sudha.narayanan
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
