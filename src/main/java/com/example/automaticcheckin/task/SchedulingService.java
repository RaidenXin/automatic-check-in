package com.example.automaticcheckin.task;

import com.example.automaticcheckin.service.WorkingService;
import com.example.automaticcheckin.task.model.RunnableTask;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Service;

@Service
public class SchedulingService {

    /**
     * 可直接注入TaskScheduler的Bean
     */
    private final TaskScheduler taskScheduler;
    private final WorkingService workingService;

    /**
     * 构造器注入，免@Autowired
     */
    public SchedulingService(TaskScheduler taskScheduler, WorkingService workingService){
        this.taskScheduler = taskScheduler;
        this.workingService = workingService;
    }

    public void schedule(String taskName, String cronExpression){
        //RunnableTask不是一个Bean，不能直接注入workingService，在它的构造器直接传入
        RunnableTask task = new RunnableTask(taskName, workingService);
        CronTrigger cronTrigger = new CronTrigger(cronExpression);
       //api接受实际执行的任务，和定时启动的cron表达式
        taskScheduler.schedule(task,cronTrigger);
    }

    public void scheduleAtFixedRate(String taskName, long period){
        RunnableTask task = new RunnableTask(taskName,workingService);
       //api接受实际执行的任务，和间隔时间
        taskScheduler.scheduleAtFixedRate(task, period);
    }

    public void scheduleWithFixedDelay(String taskName, long delay){
        RunnableTask task = new RunnableTask(taskName,workingService);
       //api接受实际执行的任务，和延迟时间
        taskScheduler.scheduleWithFixedDelay(task, delay);
    }
}