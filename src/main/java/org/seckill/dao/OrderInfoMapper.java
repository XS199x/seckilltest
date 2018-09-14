package org.seckill.dao;

import org.seckill.model.OrderInfo;
import org.seckill.model.SeckillOrder;

public interface OrderInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderInfo record);

    int insertSelective(OrderInfo record);

    OrderInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderInfo record);

    int updateByPrimaryKey(OrderInfo record);

	void insertSeckillOrder(SeckillOrder seckillOrder);
}