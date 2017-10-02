package com.midas.business.order.mapper;

import com.midas.business.order.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by User on 2017/9/13.
 */
@Mapper
@Repository
public interface OrderMapper {

    @Select("select * from country")
    List<OrderEntity> getAll();



}
