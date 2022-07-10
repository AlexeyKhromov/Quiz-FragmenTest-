package android.example.soccerquiz

class QuizItem {

var question: String
var answerList: List<String>

constructor(question: String, answer: List<String>){
    this.answerList = answer
    this.question = question
}

}