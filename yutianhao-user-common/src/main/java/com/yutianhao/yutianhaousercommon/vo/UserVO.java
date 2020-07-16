package com.yutianhao.yutianhaousercommon.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.yutianhao.yutianhaousercommon.entity.User;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author thyu
 * @title: UserVO
 * @projectName yutianhao-eureka-user
 * @description: TODO
 * @date 2020/7/16 23:58
 */
@Data
public class UserVO extends User implements Serializable {
    private static final long serialVersionUID=2L;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date startDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date endDate;
}
