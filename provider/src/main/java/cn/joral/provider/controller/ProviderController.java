package cn.joral.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangliang
 * @date 2020/11/11
 */
@RestController
@RequestMapping("/provider")
public class ProviderController {

    @GetMapping("/helloProvider")
    public String helloProvider(){
        return "你好,我是服务提供者";
    }
}
