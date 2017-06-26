package com.dgit.ex00;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class SampleControllerTest {
	private static final Logger logger = LoggerFactory.getLogger(SampleControllerTest.class);
			
	@Inject
	private WebApplicationContext wac;
	
	private MockMvc mocMvc;
	
	@Before
	public void setUp(){
		this.mocMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}
	
//이 위에까지는 꼭 필수
	
	@Test
	public void testDoA() throws Exception {
		//doA 명령어를 get으로 싷행시킴
		mocMvc.perform(MockMvcRequestBuilders.get("/doA"));
	}
}
