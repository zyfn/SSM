package com.zut.zyg.Service;

import com.zut.zyg.pojo.Items;
import com.zut.zyg.pojo.Orders;
import com.zut.zyg.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    //    public void alertInfo();
//    public void deleteInfo();
    public User selectById( Integer id);
    public List<User> selectByListId(List<Integer> listId);
    public List<User> selectByUserName(String username);

    public void updateUser(User user);

    public void insertUser(User user);

    public User selectUserByOrderId(Integer id);

    public List<Orders> selectOrderByUserName(String username);

    public List<Items> selectWoodByUserName(String username);
}
