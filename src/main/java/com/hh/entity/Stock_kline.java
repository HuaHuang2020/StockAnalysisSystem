package com.hh.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author HH
 * @Date 2023/6/2 14:20
 */
@Data
@TableName("analysis_03")
public class Stock_kline {
    String stock_name;
    String stock_date;
    Integer opening_price;
    Integer closing_price;
    Integer highest_price;
    Integer lowest_price;
}
