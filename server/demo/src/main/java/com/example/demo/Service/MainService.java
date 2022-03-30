package com.example.demo.Service;

import com.example.demo.VO.DataVO;

import org.springframework.stereotype.Service;

@Service
public class MainService {
    
    public DataVO getData() throws Exception {
        DataVO vo = new DataVO();
        vo.setId(1);
        vo.setData("123123");

        return vo;
        //return mainMapper.getData()
    }
}
