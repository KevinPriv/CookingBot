package me.kbrewster.cookingbot.commands

import me.kbrewster.cookingbot.config.Config.PREFIX
import me.kbrewster.cookingbot.launch.bot
import net.dv8tion.jda.core.events.message.MessageReceivedEvent
import net.dv8tion.jda.core.hooks.ListenerAdapter

abstract class Command : ListenerAdapter() {

    val commands = bot.commands

    val manifest = javaClass.getAnnotation(Manifest::class.java)

    abstract fun execute(event: MessageReceivedEvent, args: List<String>)

    override fun onMessageReceived(e: MessageReceivedEvent) {
        val message = e.message.content
        val args = message.split(" ")
        manifest.analysis.forEach { cmdName ->
            if (args[0] == "${PREFIX.value}$cmdName") {
                execute(e, args)
            }
        }
    }

    //TODO: Admin Only Check
    @Retention(AnnotationRetention.RUNTIME)
    annotation class AdminOnly
    @Retention(AnnotationRetention.RUNTIME)
    annotation class Manifest(val analysis: Array<String>)
}
