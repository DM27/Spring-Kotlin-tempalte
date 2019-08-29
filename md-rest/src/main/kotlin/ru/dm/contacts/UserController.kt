package ru.dm.contacts

import org.springframework.web.bind.annotation.*
import ru.dm.contacts.entity.User
import ru.dm.contacts.repository.UserRepository

@RestController
class UserController(private var userRepository: UserRepository) {

    @PostMapping("/add")
    fun addUser(@RequestParam(value = "name") name: String,
                @RequestParam(value = "firstname") firstname: String,
                @RequestParam(value = "lastname") lastname: String,
                @RequestParam(value = "description", required = false) description: String) {
        val user = User(name, firstname, lastname, description)
        userRepository.save(user)
    }

    @GetMapping("/all")
    fun getUsers() = userRepository.findAll()
}
