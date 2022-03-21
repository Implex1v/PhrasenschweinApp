package de.implex1v.phrasenschweinapp.service

import de.implex1v.phrasenschweinapp.model.Group
import de.implex1v.phrasenschweinapp.repository.GroupRepository
import org.springframework.stereotype.Component
import java.util.UUID

@Component
class GroupService(
    private val repository: GroupRepository
) {
    fun get(uuid: UUID): Group? = repository.findById(uuid).orElse(null)

    fun create(group: Group): Group = repository.save(group)
}