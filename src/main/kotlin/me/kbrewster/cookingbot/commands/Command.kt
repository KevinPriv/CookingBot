package me.kbrewster.cookingbot.commands

import net.dv8tion.jda.core.events.message.MessageReceivedEvent
import net.dv8tion.jda.core.hooks.ListenerAdapter

abstract class Command : ListenerAdapter() {

    override fun onMessageReceived(e: MessageReceivedEvent) {

    }
}
