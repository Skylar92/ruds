package com.skylar.ruds.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class WelcomeController {

    @GetMapping(value = ["/"])
    fun welcome() = "index"

}