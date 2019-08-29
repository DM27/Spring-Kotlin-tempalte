package ru.dm.contacts

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@Controller
class MainController() {

    @GetMapping("/")
    fun index() = "index.html"
}
