package br.com.leonardo.l.project.dto.hello;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class HelloDTO {
    private String message;
}
