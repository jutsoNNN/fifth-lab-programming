package WorkCommandsList

import Controllers.WorkWithCollection
import UsersView.AnswerToUser

class Info: Command {
    override fun execute(str: String) {
        val workWithCollection: WorkWithCollection = WorkWithCollection()
        val answerToUser: AnswerToUser = AnswerToUser()

        val collection = workWithCollection.getCollection()

        answerToUser.writeToConsoleLn("Тип коллекции: ${collection.javaClass}, размер коллекции: ${collection.size}, дата создания: ${workWithCollection.getInitDate()}")
    }
}