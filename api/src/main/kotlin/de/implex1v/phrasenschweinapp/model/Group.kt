package de.implex1v.phrasenschweinapp.model

import org.hibernate.annotations.GenericGenerator
import java.time.OffsetDateTime
import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity(name = "groups")
class Group {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator",
    )
    var id: UUID = UUID.randomUUID()

    @Column(nullable = false)
    var name: String = ""

    @Column(nullable = false)
    var createdAt: OffsetDateTime = OffsetDateTime.now()

    @OneToMany
    var members: MutableList<GroupMember> = mutableListOf()
}