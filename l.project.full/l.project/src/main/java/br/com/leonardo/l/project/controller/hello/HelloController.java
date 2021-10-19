package br.com.leonardo.l.project.controller.hello;

import br.com.leonardo.l.project.controller.AbstractController;
import br.com.leonardo.l.project.dto.hello.HelloDTO;
import br.com.leonardo.l.project.service.hello.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.ConversionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("hello")
@RequiredArgsConstructor
@RestController
public class HelloController extends AbstractController {

    private final ConversionService conversionService;
    private final HelloService helloService;

    @GetMapping
    public HelloDTO getHello() {
        return conversionService.convert(helloService.getHello(), HelloDTO.class);
    }

}
