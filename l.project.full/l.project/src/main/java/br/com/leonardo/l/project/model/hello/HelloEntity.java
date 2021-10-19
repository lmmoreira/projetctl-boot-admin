package br.com.leonardo.l.project.model.hello;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class HelloEntity {
    private String message;
}
