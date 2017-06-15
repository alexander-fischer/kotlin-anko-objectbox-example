package de.alexfi.kotlinankoobjectbox

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import org.jetbrains.anko.*

class NoteAdapter(list: List<Note>) : BaseAdapter() {
    val notes = list

    override fun getView(i: Int, v: View?, parent: ViewGroup?): View {
        val item = getItem(i)
        return with(parent!!.context) {
            linearLayout {
                textView(item.id.toString()) {
                    textSize = 20f
                }
                textView(item.text) {
                    textSize = 20f
                    horizontalPadding = dip(20)
                }
            }
        }
    }

    override fun getItem(position: Int): Note {
        return notes[position]
    }

    override fun getCount(): Int {
        return notes.size
    }

    override fun getItemId(position: Int): Long {
        return getItem(position).id
    }

}
