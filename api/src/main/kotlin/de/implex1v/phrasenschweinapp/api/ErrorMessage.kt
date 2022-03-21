package de.implex1v.phrasenschweinapp.api

class ErrorMessage(private val message: String) {
    fun toJSON(): String = """{"message": "$message"}"""
}