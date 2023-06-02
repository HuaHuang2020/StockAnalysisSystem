package com.hh.service;

import com.hh.entity.Stock_ta;
import com.hh.entity.Stock_tv;

import java.util.List;

/**
 * @Author HH
 * @Date 2023/6/2 13:48
 */
public interface TaService {
    List<String> getStockNameList();
    List<Stock_ta> getStockDataByName(String name);
}
