package de.alexfi.kotlinankoobjectbox;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.annotation.Generated;
import io.objectbox.annotation.apihint.Internal;

@Entity
public class Note extends AbstractModel {
    @Id
    long id;

    String text;

    @Generated(532843572)
    @Internal
    /** This constructor was generated by ObjectBox and may change any time. */
    public Note(long id, String text) {
        this.id = id;
        this.text = text;
    }

    @Generated(1272611929)
    public Note() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }
}