package com.hh.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author HH
 * @Date 2023/6/2 13:47
 *  用于统计股票每年总成交额的实体类
 */
@Data
@TableName("analysis_02")
public class Stock_ta {
    String stock_id;
    String stock_name;
    String year;
    Double transaction_amount;
}
