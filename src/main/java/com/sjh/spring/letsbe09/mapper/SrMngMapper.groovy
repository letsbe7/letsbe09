package com.sjh.spring.letsbe09.mapper

import com.sjh.spring.letsbe09.entity.SrMng
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select

@Mapper
interface SrMngMapper {

    @Select("""
        select * from tb_sr_mng where SR_NO = #{srNo}
    """)
    SrMng findOneBySrNo (@Param('srNo') String srNo)


    @Select("""
        select * from tb_sr_mng
    """)
    List<SrMng> findAll ()

}
