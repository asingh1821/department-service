package com.demo.department.departmentService;

import com.demo.department.entity.Department;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface DepartmentService {


    String saveDepartment(Department department);

    Department findByDepartmentId(long departmentId);


}
