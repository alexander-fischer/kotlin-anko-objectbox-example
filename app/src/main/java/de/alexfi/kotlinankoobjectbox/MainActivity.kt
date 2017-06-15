package de.alexfi.kotlinankoobjectbox

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import org.jetbrains.anko.*
import org.jetbrains.anko.appcompat.v7.toolbar

class MainActivity : AppCompatActivity() {
    val dbLayer: DatabaseLayer by lazy {
        DatabaseLayer.getInstance(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupData()
        setupUi()
    }

    fun setupData() {
        val note1 = Note()
        note1.text = "Hello World"
        note1.save(this)

        val note2 = Note()
        note2.text = "Hallo Welt"
        note2.save(this)
    }

    fun setupUi() {
        val notes = dbLayer.getAll(Note::class.java)
        val noteAdapter = NoteAdapter(notes)

        verticalLayout {
            toolbar {
                id = R.id.toolbar
                title = "Notes"
            }
            listView {
                adapter = noteAdapter
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.action_settings) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }
}
