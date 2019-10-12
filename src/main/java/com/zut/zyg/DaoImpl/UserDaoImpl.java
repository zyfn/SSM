package com.zut.zyg.DaoImpl;

import com.zut.zyg.Dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void alertInfo(){
        System.out.println("修改用户信息成功!");
    }

    @Override
    public void deleteInfo() {
        System.out.println("删除用户信息成功");
    }
}
