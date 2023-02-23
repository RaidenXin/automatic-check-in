package com.example.automaticcheckin.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WorkingService {

    public void work(String taskName){
        log.info("当前任务：" + taskName +" 在线程" + Thread.currentThread().getName() + "上运行");
    }
}