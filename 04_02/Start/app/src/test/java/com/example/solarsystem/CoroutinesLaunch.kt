package com.example.solarsystem

import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import org.junit.Test

class CoroutinesLaunchTest {

    @Test
    fun startWithLaunchNoSleep() {
        println("Starting...")

        launch(CommonPool) {
            delay(1_000)
            println("Inside")
        }

        println("Stopping...")
    }

    @Test
    fun startWithLaunchSleep() {
        println("Starting...")

        launch(CommonPool) {
            delay(1_000)
            println("Inside")
        }

        Thread.sleep(1_500)

        println("Stopping...")
    }

    @Test
    fun startWithLaunchMultiple() {

    }

    @Test
    fun startWithLaunchLazy() {

    }

}
