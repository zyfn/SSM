package com.zut.zyg.ServiceImpl;

import com.zut.zyg.Service.UserService;
import com.zut.zyg.mapper.CountMapper;
import com.zut.zyg.mapper.UserMapper;
import com.zut.zyg.pojo.Items;
import com.zut.zyg.pojo.Orders;
import com.zut.zyg.pojo.User;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
//    @Autowired
//    CountMapper countMapper;
//    @Override
//    public void alertInfo() {
//        System.out.println(countMapper.selectAll().size());
//    }

//    @Override
//    public void deleteInfo() {
//        userDaoImpl.deleteInfo();
//    }
    @Autowired
    UserMapper userMapper;

    @Override
    public User selectById(Integer id) {
        System.out.println("根据Id获取用户信息:"+userMapper.selectById(id).toString());
        return null;
    }

    @Override
    public List<User> selectByListId(List<Integer> listId) {
//        System.out.println("根据多个Id获取用户信息，共有结果:"+userMapper.selectByListId(listId).size()+"个");
        RowBounds rowBounds = new RowBounds(0,2);
        List<User> list = userMapper.selectByListId(listId,rowBounds);
        System.out.println("根据多个Id获取用户信息且分页，结果:"+list.toString());
        return null;
    }

    @Override
    public List<User> selectByUserName(String username) {
        System.out.println("根据用户名模糊查询，共有结果:"+userMapper.selectByUserName(username).size()+"个");
        return null;
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
        System.out.println("动态修改用户信息成功");
    }

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
        System.out.println("动态插入用户信息成功");
    }

    @Override
    public User selectUserByOrderId(Integer id) {
        System.out.println(userMapper.selectUserByOrderId(id).toString());
        return null;
    }

    @Override
    public List<Orders> selectOrderByUserName(String username) {
        System.out.println(userMapper.selectOrderByUserName(username).toString());
        return null;
    }

    @Override
    public List<Items> selectWoodByUserName(String username) {
        System.out.println(userMapper.selectWoodByUserName(username).toString());
        return null;
    }
}
