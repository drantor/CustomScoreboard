package gay.j10a1n15.customscoreboard.feature.customscoreboard.events

import gay.j10a1n15.customscoreboard.utils.TextUtils.anyMatch
import net.minecraft.network.chat.Component
import tech.thatgravyboat.skyblockapi.api.events.base.Subscription
import tech.thatgravyboat.skyblockapi.api.events.info.ScoreboardUpdateEvent
import tech.thatgravyboat.skyblockapi.utils.regex.component.ComponentRegex
import tech.thatgravyboat.skyblockapi.utils.regex.component.anyMatch

object EventServerRestart : Event() {
    override fun getDisplay() = formattedLine

    override val configLine = "Server Restart"


    private var formattedLine: Component? = null

    private val restartRegex = ComponentRegex("Server closing.*")

    @Subscription
    fun onScoreboardUpdate(event: ScoreboardUpdateEvent) {
        if (restartRegex.regex().anyMatch(event.removed)) {
            formattedLine = null
        }

        restartRegex.anyMatch(event.addedComponents) {
            formattedLine = it.component
        }

    }
}
