package com.zut.zyg.ServiceImpl;

import com.zut.zyg.Dao.UserDao;
import com.zut.zyg.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDaoImpl;
    @Override
    public void alertInfo() {
        userDaoImpl.alertInfo();
    }

    @Override
    public void deleteInfo() {
        userDaoImpl.deleteInfo();
    }
}
