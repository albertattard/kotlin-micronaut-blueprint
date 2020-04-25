package com.albertattard.blueprint.micronaut.greeting

import javax.inject.Singleton

@Singleton
class DefaultGreetingService : GreetingService {

    override fun greet() =
        Greeting("Hello World")
}
