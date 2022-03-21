package de.implex1v.phrasenschweinapp.model

import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class GroupMember {

    @Id
    @GeneratedValue
    var id: UUID = UUID.randomUUID()

    @Column(nullable = false)
    var name: String = ""

    @Column(nullable = false)
    var points: Int = 0
}