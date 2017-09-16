package com.sjh.spring.letsbe09.mapper

import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface CommonMapper {

    @Select(""" select sysdate from dual """)
    String getCurrentDateTime()

}
