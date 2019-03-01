{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf200
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0  public static void main(String[] args) \{\
        \
        \
       //**********NavigableSet***********\
    	NavigableSet<String> app=new TreeSet<>();//when sorted order is required\
        app.add("This is the First element of SortedSet");\
        app.add("This is the Second element of SortedSet");\
        app.add("This is the Third element of SortedSet");\
        \
        app=app.descendingSet();//will print in reverse order now\
        \
        \
        //**********NavigableMap***********\
        NavigableMap<String,String> app2= new TreeMap<String,String>();  \
        String key1="firstkey";\
        String key2="secondkey";\
        String key3="thirdkey";\
        \
        app2.put(key1,"This is the First element of NavigableMap");\
        app2.put(key2,"This is the Second element of NavigableMap");\
        app2.put(key3,"This is the First element of NavigableMap");\
        \
        System.out.println(app);\
    	System.out.println(); \
        System.out.println(app2.get(key1)); \
        System.out.println(app2.get(key2)); \
        System.out.println(app2.get(key3)); \
        \
    \}}