
class Task{
    String Description;
    String dueDate ;
    String Status;
    String Name;
    String strDate;
    
    Task(String des,String due,String status,String name){
        this.Description = des;
        this.dueDate = due;
        this.Status = status;
        this.Name = name;

    }
    public String toString(){
        return  "Name:" + this.Name+", Description: "+this.Description+", Due Date: "+this.dueDate+", Status: "+this.Status;
    }

    }
