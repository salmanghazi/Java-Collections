{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf200
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 public static void main(String[] args) \{\
        \
        \
       //**********LIST***********\
    	List<String> app=new ArrayList<>();//WE dont have to make size fixed\
        app.add("This is the First element of List");\
        app.add("This is the Second element of List");\
        app.add("This is the Third element of List");\
        \
        //**********Set***********\
        Set<String> app2=new HashSet<>();//WE have to make size fixed unlike List\
        app2.add("This is the First element of Set");\
        app2.add("This is the Second element of Set");\
        app2.add("This is the Third element of Set");\
        \
        \
        for (int i = 0; i < app.size(); i++) \{\
            System.out.println(app.get(i)); \
        \}\
    	System.out.println(); \
        //to iterate through Set, we have to make iterator\
        Iterator<String> i=app2.iterator();\
        while(i.hasNext())\{\
         System.out.println(i.next());\
        \}\
    \}}