package cn.itcast.controller;

import cn.itcast.domain.LogInfo;
import cn.itcast.domain.RtnInfo;
import cn.itcast.service.LogInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiongyang
 * @date 2020/7/24 16:15
 * @Description:
 */
@RestController
@RequestMapping("/logInfo")
public class LogInfoController {

    @Autowired
    LogInfoService logInfoService;

    @RequestMapping("/save")
    public RtnInfo saveLogInfo(@RequestBody LogInfo logInfo){
        return logInfoService.saveLogInfo(logInfo);
    }


}
