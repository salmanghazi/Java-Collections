public static void main(String[] args) {
        
        
       //**********SortedSet***********
    	SortedSet<String> app=new TreeSet<>();//when sorted order is required
        app.add("This is the First element of SortedSet");
        app.add("This is the Second element of SortedSet");
        app.add("This is the Third element of SortedSet");
        
        //**********HashSet***********
        HashSet<String> app2= new HashSet<>();  
       
        app2.add("This is the First element of HashSet");
        app2.add("This is the Second element of HashSet");
        app2.add("This is the First element of HashSet");
        
        System.out.println(app.first());
        System.out.println(app.last());
        
        
    	System.out.println(); 
        Iterator<String> i=app2.iterator();
        while(i.hasNext()){
            System.out.println(i.next());//it wont print duplicate
        }
        
        }