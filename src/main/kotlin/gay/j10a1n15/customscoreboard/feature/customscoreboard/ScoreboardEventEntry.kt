package gay.j10a1n15.customscoreboard.feature.customscoreboard

import gay.j10a1n15.customscoreboard.feature.customscoreboard.events.Event
import gay.j10a1n15.customscoreboard.feature.customscoreboard.events.EventVoting

enum class ScoreboardEventEntry(val event: Event) {
    VOTING(EventVoting),

//     SERVER_CLOSE(ScoreboardEventServerClose),
//     DUNGEONS(ScoreboardEventDungeons),
//     KUUDRA(ScoreboardEventKuudra),
//     DOJO(ScoreboardEventDojo),
//     DARK_AUCTION(ScoreboardEventDarkAuction),
//     JACOB_CONTEST(ScoreboardEventJacobContest),
//     JACOB_MEDALS(ScoreboardEventJacobMedals),
//     TRAPPER(ScoreboardEventTrapper),
//     GARDEN(ScoreboardEventGarden),
//     FLIGHT_DURATION(ScoreboardEventFlightDuration),
//     WINTER(ScoreboardEventWinter),
//     NEW_YEAR(ScoreboardEventNewYear),
//     SPOOKY(ScoreboardEventSpooky),
//     BROODMOTHER(ScoreboardEventBroodmother),
//     MINING_EVENTS(ScoreboardEventMining),
//     DAMAGE(ScoreboardEventDamage),
//     MAGMA_BOSS(ScoreboardEventMagmaBoss),
//     CARNIVAL(ScoreboardEventCarnival),
//     RIFT(ScoreboardEventRift),
//     ESSENCE(ScoreboardEventEssence),
//     QUEUE(ScoreboardEventQueue),
//     REDSTONE(ScoreboardEventRedstone),


//     ACTIVE_TABLIST_EVENTS(ScoreboardEventActiveTablist),
//     STARTING_SOON_TABLIST_EVENTS(ScoreboardEventStartingSoonTablist),
    ;

    override fun toString() = event.configLine
}