package ru.dm.contacts.preloads

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
import ru.dm.contacts.entity.User
import ru.dm.contacts.repository.UserRepository

@Component
class Defaults(val userRepository : UserRepository) : CommandLineRunner {
    override fun run(vararg args: String?) {
        userRepository.save(User("ivan", "Ivan", "Ivanovich", "admin"))
        userRepository.save(User("eva", "Eva", "Ivanovna", "user"))
    }
}