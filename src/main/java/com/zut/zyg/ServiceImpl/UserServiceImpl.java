package com.zut.zyg.ServiceImpl;

import com.zut.zyg.Dao.UserDao;
import com.zut.zyg.Service.UserService;
import com.zut.zyg.mapper.CountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    CountMapper countMapper;
    @Override
    public void alertInfo() {
        System.out.println(countMapper.selectAll().size());
    }

//    @Override
//    public void deleteInfo() {
//        userDaoImpl.deleteInfo();
//    }
}
