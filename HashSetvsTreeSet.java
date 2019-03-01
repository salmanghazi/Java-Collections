{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf200
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 public static void main(String[] args) \{\
        \
        \
       //**********TreeSet***********\
    	TreeSet<String> app=new TreeSet<>();//it's a child class of SortSet and Navigable set\
        //works in the same manner\
        app.add("This is the First element of SortedSet");\
        app.add("This is the Second element of SortedSet");\
        app.add("This is the Third element of SortedSet");\
        \
        //**********HashSet***********\
        HashSet<String> app2= new HashSet<>();  \
       \
        app2.add("This is the First element of HashSet");\
        app2.add("This is the Second element of HashSet");\
        app2.add("This is the First element of HashSet");\
        \
        System.out.println(app.first());\
        System.out.println(app.last());\
        \
        \
    	System.out.println(); \
        Iterator<String> i=app2.iterator();\
        while (i.hasNext()) \{\
            System.out.println(i.next());//it wont print duplicate\
        \}\
        \
    \}}