package com.wenyu.jyxcsjl2.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wenyu.jyxcsjl2.mapper.EnergyRecycleAvgMapper;
import com.wenyu.jyxcsjl2.model.EnergyRecycleAvg;
import com.wenyu.jyxcsjl2.service.EnergyRecycleAvgService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Author:wenyu
 * 2021/5/12
 */
@Service
public class EnergyRecycleAvgServiceImpl implements EnergyRecycleAvgService {

    @Resource
    private EnergyRecycleAvgMapper energyRecycleAvgMapper;
    @Override
    public List<EnergyRecycleAvg> selectAll() {
        return energyRecycleAvgMapper.selectAll();
    }
    @Override
    public void deletebyRecordDate(Date recordDate) {
        energyRecycleAvgMapper.deleteByPrimaryKey(recordDate);
    }

    @Override
    public List<EnergyRecycleAvg> findAllEneryRecycleAvgByPageF(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<EnergyRecycleAvg> lists = energyRecycleAvgMapper.selectAll();
        return lists;

    }

    @Override
    public PageInfo<EnergyRecycleAvg> findAllEnergyRecycleAvgByPageS(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<EnergyRecycleAvg> lists = energyRecycleAvgMapper.selectAll();
        PageInfo<EnergyRecycleAvg> pageInfo = new PageInfo<EnergyRecycleAvg>(lists);
        return pageInfo;
    }

}
