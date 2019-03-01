{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf200
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 public static void main(String[] args) \{\
        \
        \
       //**********ARRAYLIST***********\
    	ArrayList<String> app=new ArrayList<>();\
        \
	app.add("This is the First element of ArrayList");\
        app.add("This is the Second element of ArrayList");\
        app.add("This is the Third element of ArrayList");\
        \
        //**********Vector***********\
        Vector<String> app2= new Vector<String>();  \
        \
        app2.add("This is the First element of Vector");\
        app2.add("This is the Second element of Vector");\
        app2.add("This is the Third element of Vector");\
        \
        for (int i = 0; i < app.size(); i++) \{\
            System.out.println(app.get(i)); \
        \}\
\
    	System.out.println(); \
        for (int i = 0; i < app2.size(); i++) \{\
            System.out.println(app2.get(i)); \
        \}\
    \}}