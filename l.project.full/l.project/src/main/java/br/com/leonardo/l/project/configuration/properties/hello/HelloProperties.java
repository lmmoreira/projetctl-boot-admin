package br.com.leonardo.l.project.configuration.properties.hello;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

import javax.validation.constraints.NotBlank;

@ConfigurationProperties(prefix = "hello")
@ConstructorBinding
@Getter
@AllArgsConstructor
public class HelloProperties {
    @NotBlank
    private final String message;
}
