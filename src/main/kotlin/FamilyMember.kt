package org.songeun

class FamilyMember (
    private var name : String,
    private var age : Int?,
    private var nationality : Nationality?
){
    override fun toString(): String {
        return "FamilyMember(name='$name')"
    }

    fun changeName(newName: String) {
        name = newName
    }

}