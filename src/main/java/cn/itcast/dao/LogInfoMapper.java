package cn.itcast.dao;

import cn.itcast.domain.LogInfo;
import org.apache.ibatis.annotations.Param;

/**
 * @author xiongyang
 * @date 2020/7/24 15:21
 * @Description:
 */
public interface LogInfoMapper {

    int saveLogInfo(LogInfo logInfo);

    int isTableExist(@Param("tableName")String tableName);

    int creatTable(@Param("tableName")String tableName);


}
