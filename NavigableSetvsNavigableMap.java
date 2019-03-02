 public static void main(String[] args) {
        
        
       //**********NavigableSet***********
    	NavigableSet<String> app=new TreeSet<>();//when sorted order is required
        app.add("This is the First element of SortedSet");
        app.add("This is the Second element of SortedSet");
        app.add("This is the Third element of SortedSet");
        
        app=app.descendingSet();//will print in reverse order now
        
        
        //**********NavigableMap***********
        NavigableMap<String,String> app2= new TreeMap<String,String>();  
        String key1="firstkey";
        String key2="secondkey";
        String key3="thirdkey";
        
        app2.put(key1,"This is the First element of NavigableMap");
        app2.put(key2,"This is the Second element of NavigableMap");
        app2.put(key3,"This is the First element of NavigableMap");
        
        System.out.println(app);
    	System.out.println(); 
        System.out.println(app2.get(key1)); 
        System.out.println(app2.get(key2)); 
        System.out.println(app2.get(key3)); 
        
    }