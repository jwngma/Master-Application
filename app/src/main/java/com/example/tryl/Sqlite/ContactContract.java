package com.example.tryl.Sqlite;

public final class ContactContract {

    private ContactContract(){

    }


    public static  class contactEntry{
        public  static final  String TABLE_NAME="conatct_info";
        public  static  final  String CONTACT_ID="contact_id";
        public  static  final  String NAME="name";
        public  static  final  String EMAIL="email";
    }

}
