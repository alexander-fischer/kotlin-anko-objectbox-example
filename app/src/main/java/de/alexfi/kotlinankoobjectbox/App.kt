package de.alexfi.kotlinankoobjectbox

import android.app.Application
import io.objectbox.BoxStore

class App : Application() {
    lateinit var boxStore: BoxStore
        private set

    override fun onCreate() {
        super.onCreate()

        boxStore = MyObjectBox.builder().androidContext(this).build()
    }
}
