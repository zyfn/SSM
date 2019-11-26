package com.zut.zyg.mapper;

import com.zut.zyg.pojo.Items;
import com.zut.zyg.pojo.Orders;
import com.zut.zyg.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface UserMapper {
//    查询
    public User selectById(@Param("id") Integer id);
    public List<User> selectByListId(@Param("listId") List<Integer> listId, RowBounds rowBounds);
    public List<User> selectByUserName(@Param("username") String username);
//    修改
    public void updateUser(User user);
//    添加
    public void insertUser(User user);
//    关联映射
    public User selectUserByOrderId(@Param("id") Integer id);

    public List<Orders> selectOrderByUserName(@Param("username") String username);

    public List<Items> selectWoodByUserName(@Param("username") String username);
}
