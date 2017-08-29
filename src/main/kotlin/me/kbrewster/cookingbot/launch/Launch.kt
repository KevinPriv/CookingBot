package me.kbrewster.cookingbot.launch

import me.kbrewster.cookingbot.CookingBot
import me.kbrewster.cookingbot.config.Config
import me.kbrewster.cookingbot.manager.Loader
import net.dv8tion.jda.core.AccountType.BOT
import net.dv8tion.jda.core.JDABuilder

val bot: CookingBot by lazy { CookingBot(Config.TOKEN) }

fun main(args : Array<String>) {

    Config.load()
    Loader.loadCommands()
    bot start JDABuilder(BOT)
}