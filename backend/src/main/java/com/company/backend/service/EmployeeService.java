package com.company.backend.service;

import com.company.backend.model.Employee;
import com.company.backend.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository repo;

    public EmployeeService(EmployeeRepository repo) {
        this.repo = repo;
    }

    public Employee save(Employee e) { return repo.save(e); }
    public List<Employee> findAll() { return repo.findAll(); }
}
