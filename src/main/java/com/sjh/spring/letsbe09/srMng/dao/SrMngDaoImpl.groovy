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

    @Override
    SrMng findOneBySrNo(String srNo) {
        return sessionTemplate.selectOne("${namespace}.findOneBySrNo", srNo)
    }
    @Override
    SrMng findOneOrderBySrNoDesc() {
        return sessionTemplate.selectOne("${namespace}.findOneOrderBySrNoDesc", null)
    }
    @Override
    int insertSrMng(SrMng srMng) {
        return sessionTemplate.insert("${namespace}.insertSrMng", srMng)
    }
}
