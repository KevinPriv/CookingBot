package me.kbrewster.cookingbot.manager

import me.kbrewster.cookingbot.commands.TestCommand
import me.kbrewster.cookingbot.launch.bot

object Loader {

    fun loadCommands() {
        bot.commands.addValue(TestCommand())
    }
}
