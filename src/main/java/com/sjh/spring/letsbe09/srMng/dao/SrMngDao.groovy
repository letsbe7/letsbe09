package com.sjh.spring.letsbe09.srMng.dao

import com.sjh.spring.letsbe09.srMng.entity.SrMng

interface SrMngDao {

    SrMng findOneBySrNo (String srNo)

    SrMng findOneOrderBySrNoDesc ()

    int insertSrMng(SrMng srMng)
}
