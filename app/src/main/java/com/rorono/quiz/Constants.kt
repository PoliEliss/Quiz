package com.rorono.quiz

object Constants {
    fun getQuestions(): ArrayList<Qustion> {
        val qestionsList = ArrayList<Qustion>()
        val que1 = Qustion(
            1,
            "What country does this flag below to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Australia",
            "Turkmenistan",
            "France",
            1
        )
        qestionsList.add(que1)
        val que2 = Qustion(
            2,
            "What country does this flag below to?",
            R.drawable.ic_flag_of_australia,
            "Argentina",
            "Australia",
            "Turkmenistan",
            "France",
            2
        )
        qestionsList.add(que2)
        val que3 = Qustion(
            3,
            "What country does this flag below to?",
            R.drawable.ic_flag_of_belgium,
            "Argentina",
            "Australia",
            "Turkmenistan",
            "Belgium",
            4
        )
        qestionsList.add(que3)
        val que4 = Qustion(
            4,
            "What country does this flag below to?",
            R.drawable.ic_flag_of_brazil,
            "Brazil",
            "Australia",
            "Turkmenistan",
            "France",
            1
        )
        qestionsList.add(que4)
        val que5 = Qustion(
            5,
            "What country does this flag below to?",
            R.drawable.ic_flag_of_denmark,
            "Argentina",
            "Sweden",
            "Denmark",
            "France",
            3
        )
        qestionsList.add(que5)
        val que6 = Qustion(
            6,
            "What country does this flag below to?",
            R.drawable.ic_flag_of_fiji,
            "Argentina",
            "Netherlands",
            "Fiji",
            "France",
            3
        )
        qestionsList.add(que6)
        val que7 = Qustion(
            7,
            "What country does this flag below to?",
            R.drawable.ic_flag_of_germany,
            "Germany",
            "Russia",
            "Turkmenistan",
            "Belarus",
            1
        )
        qestionsList.add(que7)
        val que8 = Qustion(
            8,
            "What country does this flag below to?",
            R.drawable.ic_flag_of_india,
            "Argentina",
            "India",
            "Poland",
            "Zimbabwe",
            2
        )
        qestionsList.add(que8)
        val que9 = Qustion(
            9,
            "What country does this flag below to?",
            R.drawable.ic_flag_of_kuwait,
            "Argentina",
            "Australia",
            "Kuwait",
            "France",
            3
        )
        qestionsList.add(que9)
        val que10 = Qustion(
            10,
            "What country does this flag below to?",
            R.drawable.ic_flag_of_new_zealand,
            "New Zealand",
            "Netherlands",
            "Naples",
            "France",
            1
        )
        qestionsList.add(que10)
        return qestionsList
    }
}