import java.text.*;
import java.util.*;
class TodoList{
    public static void main(String[] args){
        Task t1 = new Task("Module 5 Assign 1", "Need to finish Assignment", "24/09/2019", "incomplete");
        Task t2 = new Task("Module 6", "Understand how date should be handled", "23/09/2019", "complete");
        Task t3 = new Task("Module 7", "Understand arrays", "23/09/2019", "in process");
        Task t4 = new Task("Module 8", "Task Task", "11/11/2019", "incomplete");
        List listObj = new List();
        listObj.addTask(t1);
        listObj.addTask(t2);
        listObj.addTask(t3);
        listObj.addTask(t4);
        listObj.displayAll();
        listObj.removeTask(t3);
        System.out.println();
        listObj.displayAll();
        listObj.updateStatus(t4, "inprocess");
        System.out.println();
        listObj.displayAll();
        System.out.println();
        Task [] sampleTask = new Task[10];
        sampleTask = listObj.displayIncomplete();
        for (int i=0; i<sampleTask.length; i++) {
            if (sampleTask[i] != null){
                System.out.println(sampleTask[i]);
            }
        }
        listObj.addTask(t3);
        System.out.println();
        Task [] sampleTask1 = new Task[10];
    
        for (int i=0; i<sampleTask1.length; i++) {
            if (sampleTask1[i] != null){
                System.out.println(sampleTask1[i]);
            }
        }

        System.out.println();
        listObj.displayAll();
        System.out.println((listObj.getATask("Module 6")).Status);
        System.out.println();
        Task [] sampleTask2 = new Task[10];
        sampleTask2 = listObj.getOverDue("12/11/2019");
        for (int i=0; i<sampleTask2.length; i++) {
            if (sampleTask2[i] != null){
                System.out.println(sampleTask2[i]);
            }
        }
    } 
        
}


