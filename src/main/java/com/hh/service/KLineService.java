package com.hh.service;

import com.hh.entity.Stock_kline;

import java.util.List;

/**
 * @Author HH
 * @Date 2023/6/2 16:35
 */
public interface KLineService {
    List<String> getStockNameList();
    List<Stock_kline> getDataByName(String name);
}
