package com.wenyu.jyxcsjl2.service;

import com.github.pagehelper.PageInfo;
import com.wenyu.jyxcsjl2.model.EnergyRecycleAvg;

import java.util.Date;
import java.util.List;

/**
 * Author:wenyu
 * 2021/5/12
 */
public interface EnergyRecycleAvgService {
    List<EnergyRecycleAvg> selectAll();

    void deletebyRecordDate(Date recordDate);


    List<EnergyRecycleAvg> findAllEneryRecycleAvgByPageF(int pageNum,int pageSize);

    PageInfo<EnergyRecycleAvg> findAllEnergyRecycleAvgByPageS(int pageNum, int pageSize);
}
