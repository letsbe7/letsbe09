package com.sjh.spring.letsbe09.service

import com.sjh.spring.letsbe09.entity.SrMng
import com.sjh.spring.letsbe09.mapper.SrMngMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class SrMngService {

    @Autowired
    SrMngMapper srMngMapper

    @Transactional
    SrMng getSrMngBySrNo (String srNo) {
        return srMngMapper.findOneBySrNo(srNo)
    }


}
