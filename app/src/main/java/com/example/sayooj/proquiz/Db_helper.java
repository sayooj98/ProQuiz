package com.example.sayooj.proquiz;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Sayooj on 30-10-2017.
 */

public class Db_helper extends SQLiteOpenHelper {
    public static final String DB_NAME =  "quiz.db";
    public static final String TABLE_NAME =  "questions";
    public static final String COL1 =  "level";
    public static final String COL2 =  "id";
    public static final String COL3 =  "question";
    public static final String COL4 =  "option1";
    public static final String COL5 =  "option2";
    public static final String COL6 =  "option3";
    public static final String COL7 =  "option4";
    public static final String COL8 =  "answer";

    public Db_helper(Context context) {
        super(context,DB_NAME,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + " (level INTEGER,id INTEGER,question TEXT,option1 TEXT,option2 TEXT,option3 TEXT,option4 TEXT,answer INTEGER) ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }

    public boolean insert(){
        SQLiteDatabase db = this.getWritableDatabase();
        long result;
        ContentValues cv = new ContentValues();
        cv.put(COL1,1);
        cv.put(COL2,1);
        cv.put(COL3,"Ricky Ponting is also known as what?");
        cv.put(COL4,"Rickster");
        cv.put(COL5,"Ponts");
        cv.put(COL6,"Ponter");
        cv.put(COL7,"Punter");
        cv.put(COL8,4);
        result = db.insert(TABLE_NAME,null,cv);

        cv.put(COL1,1);
        cv.put(COL2,2);
        cv.put(COL3,"Who is the Father of Geometry?");
        cv.put(COL4,"Aristotle");
        cv.put(COL5,"Euclid");
        cv.put(COL6,"Pythagoras");
        cv.put(COL7,"Kepler");
        cv.put(COL8,2);
        result = db.insert(TABLE_NAME,null,cv);


        cv.put(COL1,1);
        cv.put(COL2,3);
        cv.put(COL3,"Which Country won Euro 2016?");
        cv.put(COL4,"France");
        cv.put(COL5,"Portugal");
        cv.put(COL6,"Greece");
        cv.put(COL7,"England");
        cv.put(COL8,2);
        result = db.insert(TABLE_NAME,null,cv);

        cv.put(COL1,1);
        cv.put(COL2,4);
        cv.put(COL3,"Tajmahal is on the banks of which river?");
        cv.put(COL4,"Ganga");
        cv.put(COL5,"Yamuna");
        cv.put(COL6,"Godavari");
        cv.put(COL7,"Kaveri");
        cv.put(COL8,2);
        result = db.insert(TABLE_NAME,null,cv);

        cv.put(COL1,1);
        cv.put(COL2,5);
        cv.put(COL3,"Which crop is sown on the largest area in India?");
        cv.put(COL4,"Rice");
        cv.put(COL5,"Wheat");
        cv.put(COL6,"Sugarcane");
        cv.put(COL7,"Maize");
        cv.put(COL8,1);
        result = db.insert(TABLE_NAME,null,cv);

        cv.put(COL1,2);
        cv.put(COL2,1);
        cv.put(COL3,"Who won gold in women's badminton in 2016 Rio Olympics?");
        cv.put(COL4,"P V Sindhu");
        cv.put(COL5,"Saina Nehwal");
        cv.put(COL6,"Ratchanok Intanon");
        cv.put(COL7,"Carolina Marin");
        cv.put(COL8,4);
        result = db.insert(TABLE_NAME,null,cv);

        cv.put(COL1,2);
        cv.put(COL2,2);
        cv.put(COL3,"The radioactive element radium was invented by which of the following scientists?");
        cv.put(COL4,"Marie Curie");
        cv.put(COL5,"Benjamin Franklin");
        cv.put(COL6,"Albert Einstein");
        cv.put(COL7,"Isaac Newton");
        cv.put(COL8,1);
        result = db.insert(TABLE_NAME,null,cv);

        cv.put(COL1,2);
        cv.put(COL2,3);
        cv.put(COL3,"The largest Gland in the human body is?");
        cv.put(COL4,"Liver");
        cv.put(COL5,"Adrenal");
        cv.put(COL6,"Pituitary");
        cv.put(COL7,"Thyroid");
        cv.put(COL8,1);
        result = db.insert(TABLE_NAME,null,cv);

        cv.put(COL1,2);
        cv.put(COL2,4);
        cv.put(COL3,"Mount Everest is located in which country?");
        cv.put(COL4,"India");
        cv.put(COL5,"Nepal");
        cv.put(COL6,"Tibet");
        cv.put(COL7,"China");
        cv.put(COL8,2);
        result = db.insert(TABLE_NAME,null,cv);

        cv.put(COL1,2);
        cv.put(COL2,5);
        cv.put(COL3,"Which team won the EPL in 2017?");
        cv.put(COL4,"Chelsea");
        cv.put(COL5,"Manchester United");
        cv.put(COL6,"Manchester City");
        cv.put(COL7,"Leicester City");
        cv.put(COL8,1);
        result = db.insert(TABLE_NAME,null,cv);


        cv.put(COL1,3);
        cv.put(COL2,1);
        cv.put(COL3,"Who scored the winning goal in Euro 2016?");
        cv.put(COL4,"Cristiano Ronaldo");
        cv.put(COL5,"Ricardo Quaresma");
        cv.put(COL6,"Renato Sanches");
        cv.put(COL7,"Eder");
        cv.put(COL8,4);
        result = db.insert(TABLE_NAME,null,cv);

        cv.put(COL1,3);
        cv.put(COL2,2);
        cv.put(COL3,"Which player has scored 100 Champions League Goals?");
        cv.put(COL4,"Lionel Messi");
        cv.put(COL5,"Cristiano Ronaldo");
        cv.put(COL6,"Karim Benzema");
        cv.put(COL7,"Luis Suarez");
        cv.put(COL8,2);
        result = db.insert(TABLE_NAME,null,cv);

        cv.put(COL1,3);
        cv.put(COL2,3);
        cv.put(COL3,"The longest mountain range in the world is?");
        cv.put(COL4,"The Alps");
        cv.put(COL5,"The Himalayas");
        cv.put(COL6,"The Andes");
        cv.put(COL7,"The Rockies");
        cv.put(COL8,3);
        result = db.insert(TABLE_NAME,null,cv);

        cv.put(COL1,3);
        cv.put(COL2,4);
        cv.put(COL3,"Indian player Jude Felix is popular for which sport?");
        cv.put(COL4,"Volleyball");
        cv.put(COL5,"Football");
        cv.put(COL6,"Hockey");
        cv.put(COL7,"Tennis");
        cv.put(COL8,3);
        result = db.insert(TABLE_NAME,null,cv);


        cv.put(COL1,3);
        cv.put(COL2,5);
        cv.put(COL3,"The state which leads in agricultural production is?");
        cv.put(COL4,"Haryana");
        cv.put(COL5,"Punjab");
        cv.put(COL6,"Karnataka");
        cv.put(COL7,"Tamil Nadu");
        cv.put(COL8,2);
        result = db.insert(TABLE_NAME,null,cv);

        cv.put(COL1,4);
        cv.put(COL2,1);
        cv.put(COL3,"The highest peak in South India is?");
        cv.put(COL4,"Dhottabetta");
        cv.put(COL5,"Nandadevi");
        cv.put(COL6,"Anaimudi");
        cv.put(COL7,"Mt.Abu");
        cv.put(COL8,3);
        result = db.insert(TABLE_NAME,null,cv);

        cv.put(COL1,4);
        cv.put(COL2,2);
        cv.put(COL3,"Which one of the following is the softest?");
        cv.put(COL4,"Iron");
        cv.put(COL5,"Aluminium");
        cv.put(COL6,"Calcium");
        cv.put(COL7,"Lithium");
        cv.put(COL8,1);
        result = db.insert(TABLE_NAME,null,cv);

        cv.put(COL1,4);
        cv.put(COL2,3);
        cv.put(COL3,"The Battle of Plassey was fought in?");
        cv.put(COL4,"1757");
        cv.put(COL5,"1782");
        cv.put(COL6,"1748");
        cv.put(COL7,"1764");
        cv.put(COL8,1);
        result = db.insert(TABLE_NAME,null,cv);

        cv.put(COL1,4);
        cv.put(COL2,4);
        cv.put(COL3,"Who is the first Asian Winner of Nobel Prize?");
        cv.put(COL4,"C.V.Raman");
        cv.put(COL5,"Rajiv Gandhi");
        cv.put(COL6,"Rabindranath Tagore");
        cv.put(COL7,"Sarojini Naidu");
        cv.put(COL8,3);
        result = db.insert(TABLE_NAME,null,cv);

        cv.put(COL1,4);
        cv.put(COL2,5);
        cv.put(COL3,"The first Indian to receive Noble Prize in Literature was?");
        cv.put(COL4,"Mother Teresa");
        cv.put(COL5,"Salman Rushdie");
        cv.put(COL6,"Sarojini Naidu");
        cv.put(COL7,"Rabindranath Tagore");
        cv.put(COL8,4);
        result = db.insert(TABLE_NAME,null,cv);

        cv.put(COL1,5);
        cv.put(COL2,1);
        cv.put(COL3,"B. C. Roy Award is given in which field?");
        cv.put(COL4,"Music");
        cv.put(COL5,"Journalism");
        cv.put(COL6,"Medicine");
        cv.put(COL7,"Environment");
        cv.put(COL8,3);
        result = db.insert(TABLE_NAME,null,cv);

        cv.put(COL1,5);
        cv.put(COL2,2);
        cv.put(COL3,"The first recipient of Rajiv Gandhi's 'Khel Ratna' award is?");
        cv.put(COL4,"Vishwanathan Anand");
        cv.put(COL5,"Leander Paes");
        cv.put(COL6,"Kapil Dev");
        cv.put(COL7,"Limba Ram");
        cv.put(COL8,1);
        result = db.insert(TABLE_NAME,null,cv);

        cv.put(COL1,5);
        cv.put(COL2,3);
        cv.put(COL3,"Which was the 1st non Test playing country to beat India in an international match?");
        cv.put(COL4,"Pakitan");
        cv.put(COL5,"Sri Lanka");
        cv.put(COL6,"Bangladesh");
        cv.put(COL7,"South Africa");
        cv.put(COL8,2);
        result = db.insert(TABLE_NAME,null,cv);

        cv.put(COL1,5);
        cv.put(COL2,4);
        cv.put(COL3,"Track and field star Carl Lewis won how many gold medals at the 1984 Olympic games?");
        cv.put(COL4,"Two");
        cv.put(COL5,"Three");
        cv.put(COL6,"Four");
        cv.put(COL7,"Five");
        cv.put(COL8,3);
        result = db.insert(TABLE_NAME,null,cv);

        cv.put(COL1,5);
        cv.put(COL2,5);
        cv.put(COL3,"Eritrea, which became the 182nd member of the UN in 1993, is in the continent of?");
        cv.put(COL4,"Asia");
        cv.put(COL5,"Africa");
        cv.put(COL6,"Europe");
        cv.put(COL7,"Australia");
        cv.put(COL8,2);
        result = db.insert(TABLE_NAME,null,cv);

        cv.put(COL1,6);
        cv.put(COL2,1);
        cv.put(COL3,"Which county did Ravi Shastri play for?");
        cv.put(COL4,"Glamorgan");
        cv.put(COL5,"Leicestershire");
        cv.put(COL6,"Gloucestershire");
        cv.put(COL7,"Lancashire");
        cv.put(COL8,1);
        result = db.insert(TABLE_NAME,null,cv);

        cv.put(COL1,6);
        cv.put(COL2,2);
        cv.put(COL3,"Grand Central Terminal, Park Avenue, New York is the world's?");
        cv.put(COL4,"Largest railway station");
        cv.put(COL5,"Highest railway station");
        cv.put(COL6,"Longest railway station");
        cv.put(COL7,"None of the above");
        cv.put(COL8,1);
        result = db.insert(TABLE_NAME,null,cv);

        cv.put(COL1,6);
        cv.put(COL2,3);
        cv.put(COL3,"Entomology is the science that studies?");
        cv.put(COL4,"Behavior Of human beings");
        cv.put(COL5,"Insects");
        cv.put(COL6,"The origin and history of technical and scientific terms");
        cv.put(COL7,"The formation of rocks");
        cv.put(COL8,2);
        result = db.insert(TABLE_NAME,null,cv);

        cv.put(COL1,6);
        cv.put(COL2,4);
        cv.put(COL3,"The first English Newspaper in India was started by?");
        cv.put(COL4,"Dadabhai Noroji");
        cv.put(COL5,"J.A.HIckey");
        cv.put(COL6,"Lord William Bentinck");
        cv.put(COL7,"Rabindranath Tagore");
        cv.put(COL8,2);
        result = db.insert(TABLE_NAME,null,cv);

        cv.put(COL1,6);
        cv.put(COL2,5);
        cv.put(COL3,"The first President of USA to visit India was?");
        cv.put(COL4,"Thomas Jefferson");
        cv.put(COL5,"John F Kennedy");
        cv.put(COL6,"D.W.Einsenhower");
        cv.put(COL7,"George Washington");
        cv.put(COL8,3);
        result = db.insert(TABLE_NAME,null,cv);

        cv.put(COL1,7);
        cv.put(COL2,1);
        cv.put(COL3,"The first person to conduct heart transplantation in India is?");
        cv.put(COL4,"Dr.PKK Ayyangar");
        cv.put(COL5,"Dr.R.Valiathan");
        cv.put(COL6,"Dr.P.Venugopal");
        cv.put(COL7,"Dr.R.Kesavan Nair");
        cv.put(COL8,3);
        result = db.insert(TABLE_NAME,null,cv);

        cv.put(COL1,7);
        cv.put(COL2,2);
        cv.put(COL3,"Who among the following has received a Nobel Prize in literature 1953?");
        cv.put(COL4,"Pablo Neruda");
        cv.put(COL5,"Derek Walcott");
        cv.put(COL6,"Ernest Hemingway");
        cv.put(COL7,"Winston Churchill");
        cv.put(COL8,4);
        result = db.insert(TABLE_NAME,null,cv);

        cv.put(COL1,7);
        cv.put(COL2,3);
        cv.put(COL3,"Which football teams among these did Arsene Wenger coach?");
        cv.put(COL4,"Kashima Antlers");
        cv.put(COL5,"Urawa Red Diamonds");
        cv.put(COL6,"FC Tokyo");
        cv.put(COL7,"Nagoya Grampus Eight");
        cv.put(COL8,4);
        result = db.insert(TABLE_NAME,null,cv);

        cv.put(COL1,7);
        cv.put(COL2,4);
        cv.put(COL3,"Tetraethyl lead is used as?");
        cv.put(COL4,"Pain killer");
        cv.put(COL5,"Fire Extinguisher");
        cv.put(COL6,"Mosquito Repellent");
        cv.put(COL7,"Petrol Additive");
        cv.put(COL8,4);
        result = db.insert(TABLE_NAME,null,cv);

        cv.put(COL1,7);
        cv.put(COL2,5);
        cv.put(COL3,"The only private sector refinery set up by Reliance Petroleum Ltd. is located at?");
        cv.put(COL4,"Guwahati");
        cv.put(COL5,"Jamnagar");
        cv.put(COL6,"Mumbai");
        cv.put(COL7,"Chennai");
        cv.put(COL8,2);
        result = db.insert(TABLE_NAME,null,cv);



        if(result==-1)
            return false;
        else
            return true;
    }

    public Cursor getData(int level,int id){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from "+TABLE_NAME+" where level = "+level+" and id = "+id,null);
        return res;
    }
}
