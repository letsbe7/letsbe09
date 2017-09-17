package com.sjh.spring.letsbe09.srMng.service

import com.sjh.spring.letsbe09.srMng.dao.SrMngDao
import com.sjh.spring.letsbe09.srMng.entity.SrMng
import com.sjh.spring.letsbe09.srMng.mapper.SrMngMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class SrMngService {

    @Autowired
    SrMngMapper srMngMapper

    @Autowired
    SrMngDao srMngDao


    @Transactional
    SrMng getSrMngBySrNo (String srNo) {
        //  return srMngMapper.findOneBySrNo(srNo)
        System.out.println("dao version");
        return srMngDao.findOneBySrNo(srNo)
    }


}
