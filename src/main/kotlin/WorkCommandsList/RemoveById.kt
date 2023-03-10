package WorkCommandsList

import Controllers.WorkWithCollection
import DataSet.Route
import DataSet.RouteComporator
import UsersView.AnswerToUser
import java.util.*

class RemoveById: Command {
    override fun execute(str: String) {
        val answerToUser: AnswerToUser = AnswerToUser()

        var checkId = str.toLong()

        val workWithCollection: WorkWithCollection = WorkWithCollection()
        val collection = PriorityQueue<Route>(RouteComporator())
        collection.addAll(workWithCollection.getCollection())

        if (collection.size == 0){
            answerToUser.writeToConsoleLn("Коллекция пуста")
        }else if(collection.size == 1){
            if (collection.peek().id == checkId){
                workWithCollection.getCollection().clear()
                answerToUser.writeToConsoleLn("Отчищено")
            }else{
                answerToUser.writeToConsoleLn("Нет id в списке")
            }
        }else{
            workWithCollection.getCollection().clear()
            for (i in 0..collection.size - 1){
                if (collection.peek().id == checkId){
                    collection.poll()
                    answerToUser.writeToConsoleLn("Отчищено")
                }else{
                    workWithCollection.getCollection().add(collection.peek())
                    collection.poll()
                }
            }
        }
    }
}