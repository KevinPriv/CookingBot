package me.kbrewster.cookingbot.manager

class Manager<T> {

    var values: ArrayList<T> = ArrayList<T>()

    infix fun addValues(value: List<T>) = this.values.addAll(value)

    fun addValues(vararg value: T) = this.values.addAll(value)

    infix fun addValue(value: T) = this.values.add(value)

    fun clearValue() = this.values.clear()

    infix fun removeValue(index: Int) = this.values.remove(values.elementAt(index))

    infix fun getValue(index: Int): T = this.values[index]

    infix fun getValue(type: T): T = getValue(this.values.indexOf(type))

}