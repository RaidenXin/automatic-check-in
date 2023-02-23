package com.example.automaticcheckin.model.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 计划任务Dto
 * @author 疆戟
 * @date 2023/2/23 18:00
 */
@Setter
@Getter
public class ScheduledTaskDto {

    private String taskName;
    private String cronExpression;

}
