class List{
    Task [] array = new Task[20];
    int count=0;
    public void addTask(Task t){
        array[this.count] = t;
        this.count++;
    }
    public void removeTask(Task t){
        String n = t.Name;
        for (int i=0; i<this.count; i++) {
            if (array[i].Name.equals(n)) {
                for (int j=i; j<this.count; j++) {
                    array[j] = array[j+1];
                }
                array[this.count-1] = null;
                this.count--;
            }
        
    }
}
    public void updateStatus(Task t1,String stat){
        String n = t1.Name;
        for( int i=0; i < this.count; i++){
            if(array[i].Name.equals(n)){
                array[i].Status = stat;
            }
        }

    }
    public Task getATask(String name){
        
        for(int i=0; i <this.count; i++){
            if(array[i]==null){
                System.out.println("Null came");
                return null;
            }
            if(array[i].Name.equals(name)){
                return array[i];
            }
                    }
                    return null;
    } 
    public Task [] displayIncomplete() {
        int c = 0;
        Task [] sample = new Task[this.count];
        for (int i=0; i<this.count; i++) {
            if (array[i].Status.equals("incomplete")) {
                sample[c] = array[i];
                c += 1;
            }
        }
        return sample;
    }

    public Task[] displayTaskBydate(String due){
            int c = 0;
            Task [] sample = new Task[this.count];
            for (int i=0; i<this.count; i++) {
                if (array[i].dueDate.equals(due)) {
                    sample[c] = array[i];
                    c += 1;
                }
            }
            return sample;
        }

        public Task [] getOverDue(String dueDate) {
            int c = 0;
            Task [] sample = new Task[this.count];
            int date = Integer.valueOf(dueDate.substring(0,2));
            int month = Integer.valueOf(dueDate.substring(3,5));
            for (int i=0; i<this.count; i++) {
                int d = Integer.valueOf(array[i].dueDate.substring(0,2));
                int m = Integer.valueOf(array[i].dueDate.substring(3,5));
                if(m<month){
                    sample[c] = array[i];
                    c += 1;
                } else if(m == month && d<=date){
                    sample[c] = array[i];
                    c += 1;
                }
                }
                return sample; 
            }
       
        
    public void displayAll(){
        for(int i=0; i < this.count; i++){
            System.out.println(array[i]);
        }
    }
    }
            

