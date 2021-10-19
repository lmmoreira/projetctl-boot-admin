package br.com.leonardo.l.project.assertions;

import br.com.leonardo.l.project.dto.hello.HelloDTO;
import org.assertj.core.api.AbstractAssert;

public class HelloDTOAssert extends AbstractAssert<HelloDTOAssert, HelloDTO> {

    public HelloDTOAssert(HelloDTO actual) {
        super(actual, HelloDTOAssert.class);
    }

    public static HelloDTOAssert assertThat(HelloDTO actual) {
        return new HelloDTOAssert(actual);
    }

    public HelloDTOAssert hasMessage() {
        isNotNull();

        if (actual.getMessage().isEmpty()) {
            failWithMessage("Message must be filled, but was %s", actual.getMessage());
        }

        return this;
    }

    public HelloDTOAssert hasSameMessage(final String message) {
        isNotNull();

        if (!actual.getMessage().equals(message)) {
            failWithMessage("Expected message %s but was %s", message, actual.getMessage());
        }

        return this;
    }

    public HelloDTOAssert isSameObject(final HelloDTO helloDTO) {
        isNotNull();

        if (!actual.equals(helloDTO)) {
            failWithMessage("Expected object %s but was %s", helloDTO, actual);
        }

        return this;
    }

}

