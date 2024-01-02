package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DishFlavorMapper {



    void insertBatch(List<DishFlavor> flavors);

    /**
     * 根据菜品id删除口味表中的数据
     * @param dishId
     */
    @Delete("delete from dish_flavor where dish_id = #{dishId}")
    void deleteByDishId(Long dishId);


    void deleteByDishIds(List<Long> dishIds);

    @Select("select * from dish_flavor where dish_id = #{dishId}")
    List<DishFlavor> getById(Long dishId);
}
