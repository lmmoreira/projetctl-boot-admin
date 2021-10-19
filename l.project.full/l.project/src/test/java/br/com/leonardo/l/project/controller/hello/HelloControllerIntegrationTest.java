package br.com.leonardo.l.project.controller.hello;

import br.com.leonardo.l.project.configuration.properties.hello.HelloProperties;
import br.com.leonardo.l.project.controller.ControllerIntegrationTest;
import br.com.leonardo.l.project.dto.hello.HelloDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class HelloControllerIntegrationTest extends ControllerIntegrationTest {

    @Autowired
    private HelloProperties helloProperties;

    @Test
    public void getHelloTest() throws Exception {
        final HelloDTO helloDTO = HelloDTO.builder().message(helloProperties.getMessage()).build();
        mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo(objectMapper.writeValueAsString(helloDTO))));
    }

}
