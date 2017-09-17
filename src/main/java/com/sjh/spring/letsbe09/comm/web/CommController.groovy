package com.sjh.spring.letsbe09.comm.web

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class CommController {

    @RequestMapping('/')
    String index () {
        return 'index'
    }

}
