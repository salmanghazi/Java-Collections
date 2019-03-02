public static void main(String[] args) {
        
        
       //**********LIST***********
    	List<String> app=new ArrayList<>();//WE dont have to make size fixed
        app.add("This is the First element of List");
        app.add("This is the Second element of List");
        app.add("This is the Third element of List");
        
        //**********Set***********
        Set<String> app2=new HashSet<>();//WE have to make size fixed unlike List
        app2.add("This is the First element of Set");
        app2.add("This is the Second element of Set");
        app2.add("This is the Third element of Set");
        
        
        for (int i = 0; i < app.size(); i++) {
            System.out.println(app.get(i)); 
        }
    	System.out.println(); 
        //to iterate through Set, we have to make iterator
        Iterator<String> i=app2.iterator();
        while(i.hasNext()){
         System.out.println(i.next());
        }
    }