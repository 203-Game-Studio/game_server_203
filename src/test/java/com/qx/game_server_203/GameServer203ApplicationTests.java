package com.qx.game_server_203;

import com.qx.game_server_203.dao.mapper.BaseUserInfoMapper;
import com.qx.game_server_203.dao.model.BaseUserInfo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class GameServer203ApplicationTests {

    @Resource
    private BaseUserInfoMapper baseUserInfoMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void testMapper() {
        BaseUserInfo baseUserInfo = BaseUserInfo.builder()
                .nickName("zhangsan")
                .passWord("123")
                .gender(10)
                .status(10)
                .deviceId(1L)
                .build();

        baseUserInfoMapper.insert(baseUserInfo);
    }

}
