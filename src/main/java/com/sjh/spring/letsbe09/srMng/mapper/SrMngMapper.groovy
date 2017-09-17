package com.sjh.spring.letsbe09.srMng.mapper

import com.sjh.spring.letsbe09.srMng.entity.SrMng
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select

@Mapper
interface SrMngMapper {

    @Select("""
        select 
              SR_NO             as srNo
            , SR_PROG_STAT      as srProgStat
            , SR_TP_SEQ         as srTpSeq
            , REG_DTM           as regDtm
            from tb_sr_mng 
            where SR_NO = #{srNo}
    """)
    SrMng findOneBySrNo (@Param('srNo') String srNo)


    @Select("""
        select  
              SR_NO             as srNo
            , SR_PROG_STAT      as srProgStat
            , SR_TP_SEQ         as srTpSeq
            , REG_DTM           as regDtm
        from tb_sr_mng
    """)
    List<SrMng> findAll ()

}
