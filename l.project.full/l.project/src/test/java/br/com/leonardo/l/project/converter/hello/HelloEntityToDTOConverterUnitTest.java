package br.com.leonardo.l.project.converter.hello;

import br.com.leonardo.l.project.dto.hello.HelloDTO;
import br.com.leonardo.l.project.model.hello.HelloEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static br.com.leonardo.l.project.assertions.HelloDTOAssert.assertThat;

public class HelloEntityToDTOConverterUnitTest {

    private HelloEntityToDTOConverter helloEntityToDTOConverterTest;

    @BeforeEach
    public void initUseCase() {
        helloEntityToDTOConverterTest = new HelloEntityToDTOConverter();
    }

    @Test
    public void convertEntitySucess() {
        HelloDTO dto = helloEntityToDTOConverterTest.convert(getEntity());
        assertThat(dto).hasMessage().hasSameMessage(getEntity().getMessage()).isSameObject(getDto());

    }

    private HelloEntity getEntity() {
        return HelloEntity.builder().message("msg").build();
    }

    private HelloDTO getDto() {
        return HelloDTO.builder().message("msg").build();
    }

}
