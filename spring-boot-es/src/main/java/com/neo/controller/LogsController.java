package com.neo.controller;

import com.neo.entity.LogsIndex;
import com.neo.service.LogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Company
 * @Discription
 * @Author guoxiaojing
 * @CreateDate 2018/3/9 10:40
 * @Version 1.0
 */
@Controller
public class LogsController {

    @Autowired
    private LogsService logsService;

    @ResponseBody
    @RequestMapping("/logs")
    public LogsIndex getLogIndex() {
        return logsService.saveLog();
    }
}
