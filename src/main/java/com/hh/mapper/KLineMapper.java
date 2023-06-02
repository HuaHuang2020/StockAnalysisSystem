package com.hh.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hh.entity.Stock_kline;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author HH
 * @Date 2023/6/2 16:33
 */
@Mapper
public interface KLineMapper extends BaseMapper<Stock_kline> {

}
