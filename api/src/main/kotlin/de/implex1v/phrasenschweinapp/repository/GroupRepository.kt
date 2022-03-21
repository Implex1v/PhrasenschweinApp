package de.implex1v.phrasenschweinapp.repository

import de.implex1v.phrasenschweinapp.model.Group
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface GroupRepository: CrudRepository<Group, UUID> {
}