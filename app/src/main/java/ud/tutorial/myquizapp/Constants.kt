package ud.tutorial.myquizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTION : String = "total_question"
    const val CORECT_ANSWER : String = "corect_answer"

    fun getQuestion(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        // 1
        val que1 = Questions(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia", "Armenia", "Austria",
            1
        )
        questionsList.add(que1)

        val que2 = Questions(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Angola", "Austria", "Australia", "Armenia",
            3
        )
        questionsList.add(que2)

        val que3 = Questions(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Belarus", "Belize", "Brunei", "Brazil",
            4
        )
        questionsList.add(que3)

        val que4 = Questions(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Bahamas", "Belgium", "Barbados", "Belize",
            2
        )
        questionsList.add(que4)

        val que5 = Questions(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Gabon", "France", "Fiji", "Findlan",
            3
        )
        questionsList.add(que5)

        val que6 = Questions(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Germany", "Georgia", "Greece", "none of these",
            1
        )
        questionsList.add(que6)

        val que7 = Questions(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Dominica", "Egypt", "Denmark", "Ethiopia",
            3
        )
        questionsList.add(que7)

        val que8 = Questions(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Ireland", "Iran", "Hungary", "India",
            4
        )
        questionsList.add(que8)

        val que9 = Questions(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "New Zealand", "Jordan", "Sudan", "Palestine",
            1
        )
        questionsList.add(que9)

        val que10 = Questions(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Maccah", "Kuwait", "Banglades", "India",
            2
        )
        questionsList.add(que10)

        return questionsList
    }
}