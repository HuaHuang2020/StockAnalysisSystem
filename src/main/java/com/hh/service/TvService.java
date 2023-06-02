package com.hh.service;

import com.hh.entity.Stock_tv;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @Author HH
 * @Date 2023/6/2 12:20
 */
public interface TvService {
    List<String> getStockNameList();
    List<Stock_tv> getStockDataByName(String name);
    List<Stock_tv> getStockDataList();

}
