package me.kbrewster.cookingbot

import me.kbrewster.cookingbot.commands.Command
import me.kbrewster.cookingbot.config.Config
import me.kbrewster.cookingbot.manager.Manager
import net.dv8tion.jda.core.JDABuilder

class CookingBot(private val token: Config) {

    val commands = Manager<Command>()

    infix fun start(jda: JDABuilder) {
        jda.setToken(this.token.value.toString())
        commands.values.forEach {
            hook -> jda.addEventListener(hook)
        }
        jda.buildBlocking()
    }

}