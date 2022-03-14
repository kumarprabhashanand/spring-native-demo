package com.springnative.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class NativeControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void noParameterGreeting_getHelloStrangerMessage() throws Exception {
        this.mockMvc.perform(get("/greet")).andExpect(status().isOk())
                .andExpect(content().string("Hello Stranger"));
    }

    @Test
    public void parameterizedGreeting_getHelloWithNameMessage() throws Exception {
        this.mockMvc.perform(get("/greet").param("name", "Nik")).andExpect(status().isOk())
                .andExpect(content().string("Hello Nik"));
    }

}
