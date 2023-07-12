package org.luca.portal.module.system.employee.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.luca.portal.module.system.employee.dao.EmployeeDao;
import org.luca.portal.module.system.employee.domain.entity.EmployeeEntity;
import org.luca.portal.module.system.employee.service.IEmployeeService;
import org.springframework.stereotype.Service;

/**
 * @author 18504
 * @version 1.0
 * @description: 员工service接口实现类
 * @date 2023/7/11 13:46
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeDao, EmployeeEntity> implements IEmployeeService {
}
