package org.luca.portal.module.system.employee.controller;

import org.luca.portal.module.system.employee.domain.entity.EmployeeEntity;
import org.luca.portal.module.system.employee.service.IEmployeeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class EmployeeController {
    @Resource
    private IEmployeeService employeeService;

    @RequestMapping("employee/getOne")
    public String getOne(Integer id){
        EmployeeEntity item = employeeService.getById(id);
        return item.getEmail();
    }

}
