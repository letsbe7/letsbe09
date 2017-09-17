package com.sjh.spring.letsbe09.srMng.dao

import com.sjh.spring.letsbe09.srMng.entity.SrMng
import org.mybatis.spring.SqlSessionTemplate
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class SrMngDaoImpl implements SrMngDao {

    private final String namespace = 'com.sjh.spring.letsbe09.srMng.dao.SrMngDao'

    @Autowired
    private SqlSessionTemplate sessionTemplate

    SrMngDaoImpl () {
        println """${sessionTemplate} autowired"""
    }

    @Override
    SrMng findOneBySrNo(String srNo) {
        return sessionTemplate.selectOne("""${namespace}.findOneBySrNo""", srNo)
    }
}
