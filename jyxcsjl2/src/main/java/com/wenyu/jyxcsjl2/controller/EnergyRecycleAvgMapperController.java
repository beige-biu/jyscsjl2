package com.wenyu.jyxcsjl2.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wenyu.jyxcsjl2.model.EnergyRecycleAvg;
import com.wenyu.jyxcsjl2.service.EnergyRecycleAvgService;
import com.wenyu.jyxcsjl2.util.PageHelpUtil;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Author:wenyu
 * 2021/5/12
 */
@Controller


public class EnergyRecycleAvgMapperController {

@Resource
private EnergyRecycleAvgService energyRecycleAvgService;

    //定义每页显示多少行
    private int pageSize = 3;

    @RequestMapping(value = {"/index","/"})
    //public String index(Model model,@RequestParam(defaultValue = "1",name="page") int pageNum){
    public String index(Model model,@RequestParam(defaultValue = "1") int pageNum){
       /* PageHelper.startPage(pageNum,pageSize);
        List<EnergyRecycleAvg> energyRecycleAvgs = energyRecycleAvgService.selectAll();
        PageInfo<List<EnergyRecycleAvg>> pageInfo = new PageInfo<>();
        model.addAttribute("energyRecycleAvgsList", pageInfo.getList());
        //model.addAttribute("energyRecycleAvgsList",energyRecycleAvgs);
        String pagenation = PageHelpUtil.page("list", pageInfo,null);
        model.addAttribute("pagenation",pagenation);
        return "EnergyRecycleAvgMapper";*/
      /*  PageHelper.startPage(pageNum,pageSize);
        List<EnergyRecycleAvg> energyRecycleAvgs = energyRecycleAvgService.selectAll();
        PageInfo<Map<String,EnergyRecycleAvg>> pageInfo =new PageInfo<>(energyRecycleAvgs);

        model.addAttribute("energyRecycleAvgsList", pageInfo.getList());
        Map<String,Object> paramMap = new HashMap<>();

        String pagenation = PageHelpUtil.page("list", pageInfo, paramMap);
        model.addAttribute("pagenation",pagenation);*/




       // List<EnergyRecycleAvg> energyRecycleAvgPageInfo = energyRecycleAvgService.findAllEneryRecycleAvgByPageF(1, 5);
       //model.addAttribute("energyRecycleAvgsList",energyRecycleAvgPageInfo);

        PageHelper.startPage(1, 3);
        List<EnergyRecycleAvg> list = energyRecycleAvgService.selectAll();
        PageInfo<EnergyRecycleAvg> pageInfo = new PageInfo<>(list);
        //PageInfo<List<EnergyRecycleAvg>> pageInfo = new PageInfo<List<EnergyRecycleAvg>>(Collections.singletonList(energyRecycleAvgs));
        model.addAttribute("energyRecycleAvgsList",pageInfo.getList());
        String pagenation = PageHelpUtil.page("index", pageInfo, null);
        model.addAttribute("pagenation", pagenation);
        return "EnergyRecycleAvgMapper";

    }

    @RequestMapping("/testPageHelper1")
    public PageInfo<EnergyRecycleAvg> testPageHelper1(){
        PageInfo<EnergyRecycleAvg> queryResult = energyRecycleAvgService.findAllEnergyRecycleAvgByPageS(1, 5);
        return queryResult;
    }




    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date recordDate;
    @RequestMapping("delete/{recordDate}")
    public String delete(@PathVariable("recordDate") Date recordDate ) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format1 = format.format(recordDate);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = dateFormat.parse(format1);
            Date date1 = new Date(date .getTime() - 14*60*60*1000);
            date = date1;
        } catch (ParseException e) {
            e.printStackTrace();
        }

        energyRecycleAvgService.deletebyRecordDate(date);
        return "redirect:/index";
    }
}
