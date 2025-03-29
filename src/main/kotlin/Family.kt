package org.songeun

class Family(
    private var name: String, // property as a constructor parameter
    private var leader: FamilyMember // ``
) {
    private var memberCount: Int = 1 // property that is not a constructor parameter
    private var members: List<FamilyMember> = listOf(leader) // ``

    fun printName () = println("Name: $name")
    fun printMemberCount () = println("MemberCount: $memberCount")
    fun printMembers() = members.listIterator().forEach { member -> println(member) }

    fun addMember(member: FamilyMember) {
        memberCount++;
        members = members + member;
    }

    fun getMemberCount() = memberCount
}