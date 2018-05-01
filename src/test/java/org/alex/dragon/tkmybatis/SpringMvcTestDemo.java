package org.alex.dragon.tkmybatis;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class SpringMvcTestDemo {
	
	@Autowired
	private WebApplicationContext wac;
	private MockMvc mockMvc;
	
	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}
	
	@Test
	public void getUserByIdTest() {
//		mockMvc.perform(get("/user/101").accept);
		// 执行请求
//		mockMvc.perform(MockMvcRequestBuilders.get("/user/23").accept(MediaType.APPLICATION_JSON)).andExpect(MockMvcRequestBuilders.status().is(404)); // 400错误请求
		
		
		
		
		
		
		
		
		
		
//		mockMvc.perform(post("/secured/resources/incoterms/create").accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON)
//                .content("{\"code\" : \"EXW\", \"description\" : \"code exw\", \"locationQualifier\" : \"DEPARTURE\"}".getBytes()))
//                //.andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("id.value").exists())
//                .andExpect(jsonPath("id.value").value("6305ff33-295e-11e5-ae37-54ee7534021a"))
//                .andExpect(jsonPath("code").value("EXW"));
	}

}