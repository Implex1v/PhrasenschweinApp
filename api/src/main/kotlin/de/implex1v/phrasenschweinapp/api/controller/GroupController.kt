package de.implex1v.phrasenschweinapp.api.controller

import de.implex1v.phrasenschweinapp.api.NotFoundException
import de.implex1v.phrasenschweinapp.model.Group
import de.implex1v.phrasenschweinapp.service.GroupService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import java.util.UUID

@Controller
@RequestMapping("/api/groups")
class GroupController (
    private val service: GroupService
){
    @GetMapping("/{id}")
    fun get(@PathVariable id: String): Group {
        return service.get(UUID.fromString(id)) ?: throw NotFoundException(Group::class.java)
    }

    @PostMapping("/")
    fun create(@RequestBody group: Group): Group {
        return service.create(group)
    }
}