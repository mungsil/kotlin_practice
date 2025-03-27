package org.songeun

fun main() {
    val family = Family(name = "우리 가좍!!!!", FamilyMember(name = "딸기"))
    family.printName()
    family.printMembers()
    family.printMemberCount()
    family.addMember(FamilyMember(name = "체리"))
    family.printMembers()
    family.printMemberCount()
}