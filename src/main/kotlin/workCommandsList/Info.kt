package workCommandsList

import controllers.WorkWithCollection
import usersView.AnswerToUser

class Info: Command {
    override fun execute(str: List<Any>, workWithCollection: WorkWithCollection) {

        val answerToUser: AnswerToUser = AnswerToUser()

        val collection = workWithCollection.getCollection()

        answerToUser.writeToConsoleLn("Тип коллекции: ${collection.javaClass}, размер коллекции: ${collection.size}, дата создания: ${workWithCollection.getInitDate()}")
    }
}