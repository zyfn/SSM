package com.zut.zyg.mapper;

import com.zut.zyg.pojo.Count;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountMapper {
    public List<Count> selectAll();
}
