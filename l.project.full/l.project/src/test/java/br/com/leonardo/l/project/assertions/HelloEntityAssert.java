package br.com.leonardo.l.project.assertions;

import br.com.leonardo.l.project.model.hello.HelloEntity;
import org.assertj.core.api.AbstractAssert;

public class HelloEntityAssert extends AbstractAssert<HelloEntityAssert, HelloEntity> {

    public HelloEntityAssert(HelloEntity actual) {
        super(actual, HelloEntity.class);
    }

    public static HelloEntityAssert assertThat(HelloEntity actual) {
        return new HelloEntityAssert(actual);
    }

    public HelloEntityAssert hasMessage() {
        isNotNull();

        if (actual.getMessage().isEmpty()) {
            failWithMessage("Message must be filled, but was %s", actual.getMessage());
        }

        return this;
    }

}

