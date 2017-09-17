package com.sjh.spring.letsbe09;

import com.sjh.spring.letsbe09.srMng.entity.SrMng;
import com.sjh.spring.letsbe09.comm.service.CommonService;
import com.sjh.spring.letsbe09.srMng.service.SrMngService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Letsbe09Application implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(Letsbe09Application.class, args);
	}


	@Autowired
	SrMngService srMngService;

	@Autowired
	CommonService commonService;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("CommandLine Runner Started");
		SrMng dto = srMngService.getSrMngBySrNo("T170916_001");
		System.out.println(dto);
		System.out.println("datetime is: " + commonService.getSysdate());
		System.out.println("CommandLine Runner Ended");
	}
}
