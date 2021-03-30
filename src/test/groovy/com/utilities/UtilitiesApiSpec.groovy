package com.utilities

import io.micronaut.runtime.EmbeddedApplication
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import spock.lang.Specification
import javax.inject.Inject

@MicronautTest
class UtilitiesApiSpec extends Specification {

    @Inject
    EmbeddedApplication<?> application

    void 'test it works'() {
        expect:
        application.running
    }

}
