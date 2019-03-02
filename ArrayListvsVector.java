public static void main(String[] args) {
        
        
       //**********ARRAYLIST***********
    	ArrayList<String> app=new ArrayList<>();
        
	app.add("This is the First element of ArrayList");
        app.add("This is the Second element of ArrayList");
        app.add("This is the Third element of ArrayList");
        
        //**********Vector***********
        Vector<String> app2= new Vector<String>();  
        
        app2.add("This is the First element of Vector");
        app2.add("This is the Second element of Vector");
        app2.add("This is the Third element of Vector");
        
        for (int i = 0; i < app.size(); i++) {
            System.out.println(app.get(i)); 
        }

    	System.out.println(); 
        for (int i = 0; i < app2.size(); i++) {
            System.out.println(app2.get(i)); 
        }
    }