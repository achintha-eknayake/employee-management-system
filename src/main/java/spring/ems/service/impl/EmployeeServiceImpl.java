package spring.ems.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import spring.ems.dto.EmployeeDto;
import spring.ems.entity.Employee;
import spring.ems.exception.ResourceNotFoundException;
import spring.ems.mapper.EmployeeMapper;
import spring.ems.repository.EmployeeRepository;
import spring.ems.service.EmployeeService;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;


    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Employee is not exsist with a given id : " + employeeId));

        return EmployeeMapper.mapToEmployeeDto(employee);
    }
}
