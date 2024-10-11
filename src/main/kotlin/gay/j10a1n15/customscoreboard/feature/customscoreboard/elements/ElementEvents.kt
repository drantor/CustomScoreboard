package gay.j10a1n15.customscoreboard.feature.customscoreboard.elements

import gay.j10a1n15.customscoreboard.feature.customscoreboard.CustomScoreboardRenderer.currentIslandEvents

object ElementEvents : Element() {
    override fun getDisplay() = if (true) currentIslandEvents.mapNotNull { it.event.getLines().takeIf { !it.isEmpty() } }.flatten()
    else currentIslandEvents.firstNotNullOfOrNull { it.event.getLines().takeIf { !it.isEmpty() } }

    override val configLine = "Events"
}