package com.hh.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hh.entity.Stock_ta;
import com.hh.entity.Stock_tv;
import com.hh.mapper.StockTaMapper;
import com.hh.mapper.StockTvMapper;
import com.hh.service.TaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author HH
 * @Date 2023/6/2 13:49
 */
@Service
public class TaServiceImpl implements TaService {
    @Autowired
    private StockTaMapper stockTaMapper;

    @Override
    public List<String> getStockNameList() {
        List<Stock_ta> distinct_stock_name
                = stockTaMapper.selectList(new QueryWrapper<Stock_ta>().select("DISTINCT stock_name"));
        List<String> nameList = distinct_stock_name.stream().map(Stock_ta::getStock_name).collect(Collectors.toList());
        return nameList ;
    }


    @Override
    public List<Stock_ta> getStockDataByName(String name) {
        List<Stock_ta> stockData
                = stockTaMapper.selectList(new QueryWrapper<Stock_ta>().eq("stock_name",name));
        return stockData;
    }

}
