package com.hh.controller;

import com.hh.entity.Stock_kline;
import com.hh.entity.Stock_ta;
import com.hh.entity.Stock_tv;
import com.hh.service.KLineService;
import com.hh.service.TaService;
import com.hh.service.TvService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author HH
 * @Date 2023/6/2 10:43
 */

@Api(tags = "接口管理")
@RestController
@RequestMapping("/")
public class IndexController {

    @Autowired
    private TvService tvService;
    @Autowired
    private TaService taService;
    @Autowired
    private KLineService kLineService;

    @ApiOperation("查询所有股票的名字")
    @GetMapping("/list")
    public List<String> getStockNameList(){
        return tvService.getStockNameList();
    }

    @ApiOperation("返回该名字的所有股票成交量数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "name" , value = "股票名" )
    })
    @GetMapping("/{name}/tv")
    public List<Stock_tv> getStockDataByName(@PathVariable String name){
       return tvService.getStockDataByName(name);
    }

    @ApiOperation("返回该名字的所有股票总成交额数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name" , value = "股票名" )
    })
    @GetMapping("/{name}/ta")
    public List<Stock_ta> getStockDataByName2(@PathVariable String name){
        return taService.getStockDataByName(name);
    }


    @ApiOperation("返回股票名对应的k线图数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name" , value = "股票名" )
    })
    @GetMapping("/{name}/kline")
    public List<Stock_kline> getKLineDataByName3(@PathVariable String name){
        return kLineService.getDataByName(name);
    }


}
