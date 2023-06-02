package com.hh.service;

import com.hh.entity.Stock_ad;
import com.hh.entity.Stock_tv;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ronin26
 */
public interface AdService {
    List<String> getStockAdNameList();
    List<Stock_ad> getStockAdByName(String name);
    List<Stock_ad> getStockAdList();
}
