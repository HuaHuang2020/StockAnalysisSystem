package com.hh.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hh.entity.Stock_ad;
import com.hh.entity.Stock_ta;
import com.hh.entity.Stock_tv;
import com.hh.mapper.StockAdMapper;
import com.hh.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ronin26
 */
@Service
public class AdServiceImpl implements AdService {
    @Autowired
    private StockAdMapper stockAdMapper;
    @Override
    public List<String> getStockAdNameList() {
        List<Stock_ad> distinctStockName = stockAdMapper.selectList(new QueryWrapper<Stock_ad>()
                .select("DISTINCT stock_name"));
        List<String> nameList = distinctStockName
                .stream()
                .map(Stock_ad::getStock_name)
                .collect(Collectors.toList());
        return nameList;
    }

    @Override
    public List<Stock_ad> getStockAdByName(String name) {
        return stockAdMapper.selectList(new QueryWrapper<Stock_ad>().eq("stock_name", name));
    }

    @Override
    public List<Stock_ad> getStockAdList() {
        return stockAdMapper.selectList(null);
    }
}
