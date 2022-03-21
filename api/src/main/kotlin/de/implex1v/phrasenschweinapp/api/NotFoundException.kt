package de.implex1v.phrasenschweinapp.api

import org.springframework.http.HttpStatus
import org.springframework.web.server.ResponseStatusException

class NotFoundException(clazz: Class<*>): ResponseStatusException(
    HttpStatus.NOT_FOUND,
    ErrorMessage("${clazz.simpleName} not found").toJSON()
)
