public static void main(String[] args) {
        
        
       //**********LIST***********
    	List<String> app=new ArrayList<>();//WE dont have to make size fixed
        app.add("This is the First element of List");
        app.add("This is the Second element of List");
        app.add("This is the Third element of List");
        
        //**********Array***********
        String[] app2=new String[3];//WE have to make size fixed unlike List
        app2[0]="This is the First element of Array";
        app2[1]="This is the Second element of Array";
        app2[2]="This is the Third element of Array";//we cant add/access next element
        //app2[3]="This is the Fourth element of Array"; //we cant do that
        
        for (int i = 0; i < app.size(); i++) {
            System.out.println(app.get(i)); 
        }
    	System.out.println(); 
        for (int i = 0; i < 3; i++) {
            System.out.println(app2[i]); 
        }
    }