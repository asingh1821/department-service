package com.demo.department.departmentService;

import com.demo.department.departmentReopsitory.DepartmentRepository;
import com.demo.department.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class DepartmentServiceImp implements DepartmentService{


    @Autowired
    private DepartmentRepository departmentRepository;

    public DepartmentServiceImp(DepartmentRepository departmentRepository){
        this.departmentRepository = departmentRepository;
    }


    @Override
    public String saveDepartment(Department department) {
        departmentRepository.save(department);
        return  "department saved successfully";
    }

    @Override
    public Department findByDepartmentId(long departmentId) {
        return departmentRepository.findById(departmentId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

}
