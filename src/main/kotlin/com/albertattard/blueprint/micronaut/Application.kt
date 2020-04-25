package com.albertattard.blueprint.micronaut

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build(*args)
                .mainClass(Application.javaClass)
                .start()
    }
}
