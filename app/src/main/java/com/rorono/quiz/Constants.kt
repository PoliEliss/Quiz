package com.rorono.quiz

object Constants {
    fun getQuestions(): ArrayList<Qustion> {
        val qestionsList = ArrayList<Qustion>()
        val que1 =Qustion(
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
        return qestionsList
    }
}