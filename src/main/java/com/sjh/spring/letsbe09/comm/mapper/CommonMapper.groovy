package com.sjh.spring.letsbe09.comm.mapper

import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface CommonMapper {

    @Select(""" select sysdate from dual """)
    String getCurrentDateTime()

}
