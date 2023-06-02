package com.hh.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hh.entity.Stock_kline;
import com.hh.entity.Stock_ta;
import com.hh.mapper.KLineMapper;
import com.hh.service.KLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author HH
 * @Date 2023/6/2 16:36
 */
@Service
public class KLineServiceImpl implements KLineService {
    @Autowired
    private KLineMapper kLineMapper;

    @Override
    public List<String> getStockNameList() {
        List<Stock_kline> distinct_stock_name
                = kLineMapper.selectList(new QueryWrapper<Stock_kline>().select("DISTINCT stock_name"));
        List<String> nameList = distinct_stock_name.stream().map(Stock_kline::getStock_name).collect(Collectors.toList());
        return nameList ;
    }

    @Override
    public List<Stock_kline> getDataByName(String name) {
         return  kLineMapper.selectList(new QueryWrapper<Stock_kline>().eq("stock_name",name));
    }
}
