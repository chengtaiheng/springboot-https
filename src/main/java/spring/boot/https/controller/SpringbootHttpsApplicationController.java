package spring.boot.https.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: 程泰恒
 * @date: 2019/3/27 15:54
 */
@RestController
@RequestMapping("/https-request/test")
public class SpringbootHttpsApplicationController {

    @GetMapping
    public Map httpsRequest() {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("result", "请求成功");

        return resultMap;

    }
}
