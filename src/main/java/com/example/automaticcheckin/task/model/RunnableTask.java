package com.example.automaticcheckin.task.model;

import com.example.automaticcheckin.service.WorkingService;

/**
 * 任务模型
 * @author 疆戟
 * @date 2023/2/23 17:28
 */
public class RunnableTask implements Runnable{
    private String taskName;
    private WorkingService workingService;
    
    public RunnableTask(String taskName, WorkingService workingService){
        this.taskName = taskName;
        this.workingService = workingService;
    }
    
    @Override
    public void run(){
        workingService.work(taskName);
    }
}