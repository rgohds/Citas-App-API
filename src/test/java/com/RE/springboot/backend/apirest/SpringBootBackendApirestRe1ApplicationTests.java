package com.RE.springboot.backend.apirest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(
  webEnvironment = SpringBootTest.WebEnvironment.MOCK,
  classes = SpringBootBackendApirestRe1Application.class)
@AutoConfigureMockMvc
class SpringBootBackendApirestRe1ApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	void contextLoads1() throws Exception {
		mockMvc.perform(get("/api/instructores")).andExpect(status().isOk());
	}

	/*
	@Test
	void contextLoads2() throws Exception {
		mockMvc.perform(get("/api/instructores2")).andExpect(status().isOk());
	}*/

}
