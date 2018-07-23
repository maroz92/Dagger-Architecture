package pl.mrozok.daggerarchitecture.random

import java.util.*

class RandomContent {

    fun getRandomEmoji(): String {
        Random().run {
            val random = nextInt(77) + 13
            val emoji = "1285$random".toInt()
            return String(Character.toChars(emoji))
        }
    }
}