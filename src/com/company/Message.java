package com.company;

enum Message {
    TITLE("--- Connecta 4 ---"),
    TOKEN_COORDINATE("Enter the row where you want tu put your token:"),
    VICTORY("Player #player you win!!!!!!"),
    RESUME("Do you want to play againg?");

   private String message;

   Message(String message){
       this.message = message;
   }

   public void write(){
       System.out.println(this.message);
   }

   public void writeLine(String player){
       assert this == Message.VICTORY;

       System.out.println(this.message.replaceAll("#player",""+player));

   }
}
