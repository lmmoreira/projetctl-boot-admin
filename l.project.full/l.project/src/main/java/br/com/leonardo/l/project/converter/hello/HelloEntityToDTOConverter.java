package br.com.leonardo.l.project.converter.hello;

import br.com.leonardo.l.project.dto.hello.HelloDTO;
import br.com.leonardo.l.project.model.hello.HelloEntity;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class HelloEntityToDTOConverter implements Converter<HelloEntity, HelloDTO> {

    @Override
    public HelloDTO convert(HelloEntity entity) {
        return HelloDTO.builder().message(entity.getMessage()).build();
    }
}