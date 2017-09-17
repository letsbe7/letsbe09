package com.sjh.spring.letsbe09.srMng.web

import com.sjh.spring.letsbe09.srMng.service.SrMngService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/srMng")
class SrMngController {

    @Autowired
    SrMngService srMngService

    @RequestMapping(value="/insert", method=RequestMethod.POST)
    def insertSrMng () {
        return srMngService.insert()
    }



}
