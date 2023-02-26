package workCommandsList

import controllers.WorkWithCollection
import usersView.AnswerToUser
import kotlin.system.exitProcess

class Exit: Command{
    override fun execute(str: List<Any>, workWithCollection: WorkWithCollection) {
        val answerToUser: AnswerToUser = AnswerToUser()
        answerToUser.writeToConsoleLn("Завершение программы.")
        exitProcess(0)
    }
}