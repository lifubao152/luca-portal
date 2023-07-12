package org.luca.portal.module.system.employee.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.luca.portal.module.system.employee.domain.entity.EmployeeEntity;

/**
 * @description: 员工 dao
 * @author lifubao
 * @date 2023-07-11 13:42:58
 * @version 1.0
 */
@Mapper
public interface EmployeeDao extends BaseMapper<EmployeeEntity> {
}
