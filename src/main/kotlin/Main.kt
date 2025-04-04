package org.songeun

fun main() {
    // class, fun, properties
    val family = Family(name = "우리 가좍!!!!", FamilyMember(name = "딸기"))
    family.printName()
    family.printMembers()
    family.printMemberCount()
    family.addMember(FamilyMember(name = "체리"))
    family.printMembers()
    family.printMemberCount()

    // everything is an object
    val memberCount = family.getMemberCount()

    memberCount.times(2) // Multiple
    memberCount.plus(2)
    memberCount.minus(2)

    // enum
    Nationality.KOREA.printDescription()
    println(Nationality.KOREA.name) // name: Built-In properties
    println(Nationality.KOREA.ordinal) // ordinal: Built-In properties

    val name = Nationality.KOREA.name
    val nationality = Nationality.valueOf(name) // get enum from a String(name)
    println(nationality)

}