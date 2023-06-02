package com.hh.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @Author HH
 * @Date 2023/6/2 11:34
 * 用于统计股票每年总成交量的实体类
 */
@Data
@TableName("analysis_01")
public class Stock_tv {
    String stock_id;
    String stock_name;
    String year;
    Long trading_volume;

}
