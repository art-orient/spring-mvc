package com.itvdn.lesson10;

import com.itvdn.lesson10.controllers.EmployeeController;
import com.itvdn.lesson10.dao.Employee;
import com.itvdn.lesson10.dao.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class EmployeeControllerTest {
    @InjectMocks
    private EmployeeController employeeController;

    @Mock
    private EmployeeRepository employeeRepository;

    @Test
    public void testAddEmployee() {
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

        Employee employee = new Employee("firstName", "lastName", "email");
        employee.setId(1);

        when(employeeRepository.save(any(Employee.class))).thenReturn(employee);

        Employee employeeToRequest = new Employee("Sasha", "Art", "artorient");
        ResponseEntity<Object> responseEntity = employeeController.addEmployee(employeeToRequest);

        assertThat(responseEntity.getStatusCodeValue()).isEqualTo(200);
    }

    @Test
    public void testFindAll() {
        Employee employee1 = new Employee("firstName0", "lastName0", "email0");
        Employee employee2 = new Employee("firstName1", "lastName1", "email1");

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);

        when(employeeRepository.findAll()).thenReturn(employees);

        List<Employee> result = employeeController.getEmployee();

        assertThat(result.size()).isEqualTo(2);
        assertThat(result.get(0).getFirstName()).isEqualTo(employee1.getFirstName());
        assertThat(result.get(1).getFirstName()).isEqualTo(employee2.getFirstName());
    }
}
