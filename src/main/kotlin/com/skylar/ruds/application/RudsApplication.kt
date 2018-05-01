package com.skylar.ruds.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RudsApplication

fun main(args: Array<String>) {
    runApplication<RudsApplication>(*args)
}
