package me.kbrewster.cookingbot.manager

import java.util.ArrayList
import java.util.Arrays


class Manager<T> {


    /**
     * The list of all of the entries that this Manager contains
     */
    private val data = ArrayList<T>()


    /**
     * Resets all of the data in this manager
     */
    fun reset() {
        this.data.clear()
    }

    /**
     * Adds multiple entries into the data array
     *
     * @param data The entries
     */
    @SafeVarargs
    protected fun addData(vararg data: T) {
        this.data.addAll(Arrays.asList(*data))
    }

    /**
     * Adds a list of entries into the data array
     *
     * @param data The entries
     */
    protected fun addData(data: List<T>) {
        this.data.addAll(data)
    }

    /**
     * Removes an entry, if present, from the data array
     *
     * @param data The entry
     */
    protected fun removeData(data: T) {
        this.data.remove(data)
    }


    /**
     * @return All of the entries that this manager holds
     */
    fun getData(): List<T> {
        return ArrayList(this.data)
    }
}