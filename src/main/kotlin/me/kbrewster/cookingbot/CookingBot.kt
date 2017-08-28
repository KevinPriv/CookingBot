package me.kbrewster.cookingbot

import me.kbrewster.cookingbot.commands.Command
import me.kbrewster.cookingbot.manager.Manager
import net.dv8tion.jda.core.AccountType
import net.dv8tion.jda.core.JDABuilder
import net.dv8tion.jda.core.JDA
import net.dv8tion.jda.core.exceptions.RateLimitedException
import javax.security.auth.login.LoginException



class CookingBot(val token: String) {

    //val instance: CookingBot by lazy { CookingBot() }

    val commands = Manager<Command>()

    infix fun start(jda: JDABuilder) {
        jda.setToken(this.token).buildBlocking()
        commands.getData().forEach {
            i -> jda.addEventListener(i)
        }
    }

}