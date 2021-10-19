package br.com.leonardo.l.project.service.hello;

import br.com.leonardo.l.project.configuration.properties.hello.HelloProperties;
import br.com.leonardo.l.project.model.hello.HelloEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HelloService {

    private final HelloProperties helloProperties;

    public HelloEntity getHello() {
        return HelloEntity.builder().message(helloProperties.getMessage()).build();
    }

}
