package com.demo.department.departmentController;


import com.demo.department.departmentService.DepartmentService;
import com.demo.department.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/department_service")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    public DepartmentController(DepartmentService departmentService){
        this.departmentService = departmentService;
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveDepartment(@RequestBody Department department){
         String msg = departmentService.saveDepartment(department);
         return ResponseEntity.ok(msg);
    }
    @GetMapping("/find/{departmentId}")
    public ResponseEntity<Department> findByDepartmentId(@PathVariable Long departmentId){
        Department dep = departmentService.findByDepartmentId(departmentId);
        return new ResponseEntity<>(dep,HttpStatus.OK);
    }
}
