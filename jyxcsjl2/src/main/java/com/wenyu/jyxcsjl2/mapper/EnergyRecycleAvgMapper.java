package com.wenyu.jyxcsjl2.mapper;

import com.wenyu.jyxcsjl2.model.EnergyRecycleAvg;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

@Mapper
public interface EnergyRecycleAvgMapper {
    int deleteByPrimaryKey(Date recordDate);

    int insert(EnergyRecycleAvg record);

    int insertSelective(EnergyRecycleAvg record);

    EnergyRecycleAvg selectByPrimaryKey(Date recordDate);

    int updateByPrimaryKeySelective(EnergyRecycleAvg record);

    int updateByPrimaryKey(EnergyRecycleAvg record);

    List<EnergyRecycleAvg> selectAll();
}