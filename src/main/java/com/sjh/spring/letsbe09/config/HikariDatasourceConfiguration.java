package com.sjh.spring.letsbe09.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.tomcat.jdbc.pool.DataSourceFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
@MapperScan(
        basePackages = "com.sjh.spring.letsbe09",
        sqlSessionFactoryRef = "orcl_ssf",
        sqlSessionTemplateRef = "orcl_sst"
)
class HikariDatasourceConfiguration {

    @Autowired
    ApplicationContext applicationContext;

    @Bean(name = "orcl_hikari_ds")
    DataSource getDataSource() throws Exception {
        Properties prop = new Properties();
        prop.load(DataSourceFactory.class.getClassLoader().getResourceAsStream("orcl_hikari.properties"));
        return new HikariDataSource(new HikariConfig(prop));
    }

    @Bean(name = "orcl_ssf")
    SqlSessionFactory getSqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(getDataSource());
        sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:sqlMap/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }

    @Bean(name = "orcl_sst")
    SqlSessionTemplate getSqlSessionTemplate() throws Exception {
        return new SqlSessionTemplate(getSqlSessionFactory());
    }
}

