package com.qx.controller;

import com.baomidou.mybatisplus.autoconfigure.MybatisPlusAutoConfiguration;
import com.qx.repository.dao.mapper.BaseUserInfoMapper;
import com.qx.repository.dao.model.BaseUserInfo;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import javax.activation.DataSource;
import javax.annotation.Resource;

@SpringBootTest(classes = {
        BaseUserInfoMapper.class,
        DataSourceAutoConfiguration.class,
        MybatisPlusAutoConfiguration.class
})
@MapperScan("com.qx.repository.dao.mapper")
class GameServer203ApplicationTests {

    @Resource
    private BaseUserInfoMapper baseUserInfoMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void testMapper() {
        BaseUserInfo baseUserInfo = BaseUserInfo.builder()
                .nickName("lisi")
                .passWord("123")
                .gender(10)
                .status(10)
                .deviceId(2L)
                .build();

        baseUserInfoMapper.insert(baseUserInfo);
    }

    @Test
    public void testMapperGet() {
        System.out.println(baseUserInfoMapper.selectById(3L));
    }

}
