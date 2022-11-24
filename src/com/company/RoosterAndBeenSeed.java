package com.company;

public class RoosterAndBeenSeed {
    public static void main(String[] args) {
        Hen hen=new Hen();
        Cow cow=new Cow();
        Mower mower=new Mower();
        hen.setNextHelper(cow);
        cow.setNextHelper(mower);


    }
}

abstract class Helper{
    Helper nextHelper;
    void setNextHelper(Helper helper){
        nextHelper=helper;
    }

    public  void  help(){
        sendMessage();
        if (nextHelper!=null)
            nextHelper.help();
    }

    protected abstract void sendMessage();

}
class Hen extends Helper{

    @Override
    protected void sendMessage() {
        System.out.println("курица - корове:дый маслица");

    }}

    class Cow extends Helper{

        @Override
        protected void sendMessage() {
            System.out.println("Корова косорям:дайте сена");

        }
}
class Mower extends Helper {

    @Override
    protected void sendMessage() {
        System.out.println("курица - корове:дый маслица");

    }
}

