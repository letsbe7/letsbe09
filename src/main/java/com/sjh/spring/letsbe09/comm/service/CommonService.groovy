package com.sjh.spring.letsbe09.comm.service

import com.sjh.spring.letsbe09.comm.mapper.CommonMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CommonService {

    @Autowired
    CommonMapper commonMapper

    String getSysdate () {
        return commonMapper.getCurrentDateTime();
    }

}
