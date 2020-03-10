package day47_inheritance_02;

public class SlackUser {
    /*
    Warm up task:
    Create a package day47_inheritance_02
    Create a class:
        SlackUser
        - String name
        - String status
        Methods:
        - sendMessage(String msg)
            SlackUser name is typing ... msg
        - callSomeone
           SlackUser name is calling ...
        - addEmoji(String emoji)
            SlackUser name adding emoji
     Create a class:
        SlackAdminUser extends SlackUser
        int adminID
        sendAtChannelMessage(String msg)
            SlackAdmin name sending @channel msg...
        deleteMessage
            SlackAdmin name deleting message...
=================================
SlackWorkspace main
================================
     */

        String name;
        String status;
        public void sendMessage(String msg){
            System.out.println("SlackUser ["+name+"] with status ["+status+"] is typing...[" + msg +"]");
        }
        public void callSomeone(){
            System.out.println("SlackUser ["+name+"] is calling...");
        }
        public void addEmoji(String emoji) {
            System.out.println("SlackUser [" + name + "] is adding emoji...[" + emoji + "]");
        }}
