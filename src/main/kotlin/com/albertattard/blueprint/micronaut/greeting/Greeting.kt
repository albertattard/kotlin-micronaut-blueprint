package com.albertattard.blueprint.micronaut.greeting

import io.micronaut.core.annotation.Introspected

@Introspected
data class Greeting(val greeting: String)
