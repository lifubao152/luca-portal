package org.luca.portal.module.system.employee.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("employee")
public class EmployeeEntity {
  @TableId(type = IdType.AUTO)
  private Integer id;
  private String name;
  private String gender;
  private String mobile;
  private String telephone;
  private String email;
  private LocalDateTime birthday;
  private String status;
  private Integer isDeleted;
  private LocalDateTime gmtCreate;
  private LocalDateTime gmtUpdate;

}
