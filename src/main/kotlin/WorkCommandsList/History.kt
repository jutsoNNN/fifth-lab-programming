package WorkCommandsList

import Controllers.WorkWithCollection
import UsersView.AnswerToUser

class History: Command {
    override fun execute(str: String) {
        val workWithCollection: WorkWithCollection = WorkWithCollection()
        val answerToUser: AnswerToUser = AnswerToUser()

        val collection = workWithCollection.getHistory()
        answerToUser.writeToConsoleLn("История команд: ")
        for (i in 0..collection.size - 1){
            answerToUser.writeToConsole(collection[i] + " ")
        }
        answerToUser.writeToConsoleLn("Успешно!")
    }
}