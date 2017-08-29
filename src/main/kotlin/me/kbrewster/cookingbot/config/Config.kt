package me.kbrewster.cookingbot.config

import java.io.File

enum class Config(var value: Any) {

    TOKEN("/"),
    PREFIX("/");

    /**
     * Terrible Configruation System
     * TODO: Switch over to JSON :)
     */
    companion object {

        private val fileName: String = "bot.properties"
        private val splitter: Char = '='
        private val file: File = File(fileName)

        fun save() {
            if (file.delete() or !file.isFile) {
                Config.values().forEach { key-> file.appendText("$key$splitter${key.value}\n") }
            }
        }

        fun load() {
            if (file.isFile) {
                file.readLines().forEach {
                    val key = it.split(splitter)[0]
                    val value = it.split(splitter)[1]
                    Config.values().forEach {
                        if (key == it.name)
                            it.value = value }}
            } else {
                save()
                println("Please fill in $fileName")
            }
        }
    }
}

