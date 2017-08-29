package me.kbrewster.cookingbot.commands

import me.kbrewster.cookingbot.commands.Command.Manifest
import net.dv8tion.jda.core.events.message.MessageReceivedEvent
@Manifest(arrayOf("testcmd"))
class TestCommand: Command() {

    override fun execute(event: MessageReceivedEvent, args: List<String>) {
        event.textChannel.sendMessage("Hello World!").queue()
    }

}