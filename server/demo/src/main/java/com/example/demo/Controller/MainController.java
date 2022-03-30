package com.example.demo.Controller;

import com.example.demo.Service.MainService;
import com.example.demo.VO.DataVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//front(화면)-back(서버)간 데이터 전달
//[step2] front에서 호출된 url이 controller에 매핑됨 (api)
@RestController
@RequestMapping(value = "/api")
public class MainController {

    @Autowired
    private MainService mainService;
    
    //[step2] front에서 호출된 url이 controller에 매핑됨 (api/main)
    @GetMapping
    @RequestMapping(value = "/main")
    private @ResponseBody DataVO main() throws Exception { //return 타입을 responseBody로 선언하여 호출된 페이지로 리턴되도록함
        DataVO resultVO = mainService.getData(); //[step3] service단에서 데이터를 꺼내어 가져옴(이때 mybatis일시 mapper로 연결, DB까지 연결되어 데이터 가져옴)
        return resultVO; //[step4] 데이터 리턴
        //return "server전달데이터";

    }
}
