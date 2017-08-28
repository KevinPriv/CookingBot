package me.kbrewster.cookingbot.launch

import me.kbrewster.cookingbot.CookingBot
import me.kbrewster.cookingbot.config.Config
import net.dv8tion.jda.core.AccountType
import net.dv8tion.jda.core.JDABuilder

fun main(args : Array<String>) {

    Config.load()
    println(Config.TOKEN.value)
   // println(Config.TOKEN.value)
    //Config.save()
  //  CookingBot(Config.TOKEN.name) start(JDABuilder(AccountType.BOT))

}