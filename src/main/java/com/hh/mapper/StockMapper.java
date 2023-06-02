package com.hh.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hh.entity.Stock_tv;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author HH
 * @Date 2023/6/2 11:32
 */

@Mapper
public interface StockMapper extends BaseMapper<Stock_tv> {

}
