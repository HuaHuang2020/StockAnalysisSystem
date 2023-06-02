package com.hh.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hh.entity.Stock_tv;
import com.hh.mapper.StockTvMapper;
import com.hh.service.TvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author HH
 * @Date 2023/6/2 12:21
 */

@Service
public class TvServiceImpl implements TvService {
    @Autowired
    private StockTvMapper stockMapper;

    @Override
    public List<String> getStockNameList() {
        List<Stock_tv> distinct_stock_name
                = stockMapper.selectList(new QueryWrapper<Stock_tv>().select("DISTINCT stock_name"));
        List<String> nameList = distinct_stock_name.stream().map(Stock_tv::getStock_name).collect(Collectors.toList());
        return nameList ;
    }

    @Override
    public List<Stock_tv> getStockDataByName(String name) {
        List<Stock_tv> stockData
                = stockMapper.selectList(new QueryWrapper<Stock_tv>().eq("stock_name",name));
        return stockData;
    }


}
