package com.hh.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("analysis_04")
public class Stock_ad {
    String stock_name;
    String stock_date;
    Double advance_decline;
}
