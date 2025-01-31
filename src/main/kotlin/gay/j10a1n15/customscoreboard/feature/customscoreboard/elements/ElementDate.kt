package gay.j10a1n15.customscoreboard.feature.customscoreboard.elements

import gay.j10a1n15.customscoreboard.config.categories.LinesConfig
import gay.j10a1n15.customscoreboard.utils.Utils.getColoredName
import gay.j10a1n15.customscoreboard.utils.Utils.ordinal
import tech.thatgravyboat.skyblockapi.api.datetime.DateTimeAPI

object ElementDate : Element() {
    override fun getDisplay() =
        DateTimeAPI.season?.run { if (LinesConfig.coloredMonth) getColoredName() else toString() } + " " + DateTimeAPI.day.ordinal()

    override fun showWhen() = DateTimeAPI.season != null

    override val configLine = "Date"
}
