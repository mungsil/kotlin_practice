package org.songeun

fun main() {
    // class, fun, properties
    val family = Family(name = "우리 가좍!!!!", FamilyMember(name = "딸기", age = 12, nationality = null))
    family.printName()
    family.printMembers()
    family.printMemberCount()
    family.addMember(FamilyMember(name = "체리", age = null, nationality = null))
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

    // nullable
    val idiot = FamilyMember("멍청이", 1111, nationality = nationality)
    changeName(idiot, null)
    println(idiot.toString())

    printNationality(null)
    printNationality(Nationality.FRANCE)
}

fun changeName(member: FamilyMember, newName: String?) {
    member.changeName(newName ?: "바보") // elvis operator
}

fun printNationality(nationality: Nationality?) {
    println(nationality?.name ?: "한국") // safe-call operator
}