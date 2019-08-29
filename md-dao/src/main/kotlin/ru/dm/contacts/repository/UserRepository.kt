package ru.dm.contacts.repository

import org.springframework.data.jpa.repository.JpaRepository
import ru.dm.contacts.entity.User

interface UserRepository : JpaRepository<User, Long>