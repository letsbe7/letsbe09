package com.sjh.spring.letsbe09.srMng.service

import com.google.common.base.Preconditions
import com.sjh.spring.letsbe09.srMng.dao.SrMngDao
import com.sjh.spring.letsbe09.srMng.entity.SrMng
import com.sjh.spring.letsbe09.srMng.mapper.SrMngMapper
import com.sjh.spring.letsbe09.utils.StringUtil
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

import java.text.SimpleDateFormat

@Service
class SrMngService {

    @Autowired
    SrMngMapper srMngMapper

    @Autowired
    SrMngDao srMngDao


    @Transactional
    SrMng getSrMngBySrNo (String srNo) {
        //  return srMngMapper.findOneBySrNo(srNo)
        return srMngDao.findOneBySrNo(srNo)
    }

    @Transactional
    def insert () {
        SrMng lastSrMng = srMngDao.findOneOrderBySrNoDesc()
        def seq = lastSrMng.srNo.split('_')[1]
        seq = Integer.parseInt(seq) + 1
        seq = StringUtil.lpad("${seq}", 3, '0')

        def srNo = "T${new SimpleDateFormat('yyMMdd').format(new Date())}_${seq}"

        SrMng srMng = new SrMng(srNo: srNo, srProgStat: '1001', srTpSeq: '2001')
        int result = srMngDao.insertSrMng(srMng)
        Preconditions.checkArgument(result == 1, "${result}가 결과다.")

        "${result}"
    }



}
