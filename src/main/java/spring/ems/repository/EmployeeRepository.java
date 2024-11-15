package spring.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.ems.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
