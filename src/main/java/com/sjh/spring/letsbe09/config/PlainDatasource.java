package com.sjh.spring.letsbe09.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

//  @Configuration
@MapperScan(basePackages = "com.sjh.spring.letsbe09.mapper")
public class PlainDatasource {

    public PlainDatasource () {
        System.out.println("PLAIN DATASOURCE INITIALIZED");
    }


    @Bean
    public SqlSessionFactory sqlSessionFactory (DataSource ds) throws Exception {
        SqlSessionFactoryBean ssf = new SqlSessionFactoryBean();
        ssf.setDataSource(ds);
        return ssf.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSession (SqlSessionFactory ssf) {
        return new SqlSessionTemplate(ssf);
    }


}
