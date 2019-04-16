import java.util.ArrayList

fun main(args: Array<String>) {
    val listToJoin1: List<Int> = listOf(1, 2, 3, 4, 5)
    val listToJoin2: List<String> = listOf("a", "b", "c", "d", "e")

    joinTwoLists(listToJoin1, listToJoin2)
}

fun joinTwoLists(list1: List<Int>, list2: List<String>) {
    val joinTwoLists = ArrayList<Any?>()

    joinTwoLists.addAll(list1)
    joinTwoLists.addAll(list2)

    println("List 1:\t\t${list1}\nList 2:\t\t${list2}\nJoined Lists:\t${joinTwoLists}")
}