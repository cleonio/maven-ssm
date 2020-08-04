package cn.itcast.service.impl;

import cn.itcast.dao.LogInfoMapper;
import cn.itcast.domain.LogInfo;
import cn.itcast.domain.RtnInfo;
import cn.itcast.service.LogInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author xiongyang
 * @date 2020/7/24 15:20
 * @Description:
 */
@Service
public class LogInfoServiceImpl implements LogInfoService {

    @Autowired
    LogInfoMapper logInfoMapper;

    @Override
    public RtnInfo saveLogInfo(LogInfo logInfo) {

        String tableName = String.format("%s_%s","log_info",
                new SimpleDateFormat("yyyyMMdd").format(new Date()));
        int count = logInfoMapper.isTableExist(tableName);
        if (count<=0){
            logInfoMapper.creatTable(tableName);
        }
        logInfo.setTableName(tableName);
        logInfoMapper.saveLogInfo(logInfo);
        try {
            throw new RuntimeException("kkk");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return RtnInfo.SUCCESS;
    }
}
