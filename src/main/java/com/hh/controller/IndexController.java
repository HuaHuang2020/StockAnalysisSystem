package com.hh.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hh.entity.Stock_tv;
import com.hh.mapper.StockMapper;
import com.hh.service.TvService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author HH
 * @Date 2023/6/2 10:43
 */

@Api(tags = "用户管理")
@RestController
@RequestMapping("/")
public class IndexController {

    @Autowired
    private TvService tvService;

    //查询所有股票的名字
    @RequestMapping("/list")
    public List<String> getStockNameList(){
        return tvService.getStockNameList();
    }

    //返回该名字的所有股票数据
    @RequestMapping("/{name}/tv")//该股票的总成交量统计
    public List<Stock_tv> getStockDataByName(@PathVariable String name){
       return tvService.getStockDataByName(name);
    }

}
