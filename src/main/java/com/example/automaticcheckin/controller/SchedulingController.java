package com.example.automaticcheckin.controller;

import com.example.automaticcheckin.model.dto.ScheduledTaskDto;
import com.example.automaticcheckin.task.SchedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 疆戟
 * @date 2023/2/23 17:41
 */
@RestController
@RequestMapping("scheduling")
public class SchedulingController {

    @Autowired
    private SchedulingService schedulingService;

    @PostMapping("addScheduledTask")
    public String addScheduledTask(@RequestBody ScheduledTaskDto taskDto) {
        schedulingService.schedule(taskDto.getTaskName(), taskDto.getCronExpression());
        return "success";
    }
}
