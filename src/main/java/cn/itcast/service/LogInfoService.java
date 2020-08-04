package cn.itcast.service;

import cn.itcast.domain.LogInfo;
import cn.itcast.domain.RtnInfo;

public interface LogInfoService {

    RtnInfo saveLogInfo(LogInfo logInfo);
}
