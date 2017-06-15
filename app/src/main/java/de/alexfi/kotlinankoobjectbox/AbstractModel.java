package de.alexfi.kotlinankoobjectbox;

import android.app.Activity;

import io.objectbox.Box;

public class AbstractModel {

    /**
     * Generic method to save every ObjectBox model.
     *
     * @param activity Activity.
     */
    public void save(Activity activity) {
        DatabaseLayer layer = DatabaseLayer.getInstance(activity);
        Box box = layer.getBoxFor(this.getClass());
        box.put(this);
    }
}
