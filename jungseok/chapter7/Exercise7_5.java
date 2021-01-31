package javaTest.jungseok.chapter7;

class MyTv2{
    int channel;
    //int volume;
    int prevChannel;

    //final int MAX_VOLUME = 100;
    //final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;


    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if(channel>MAX_CHANNEL||channel<MIN_CHANNEL){
            return;
        }
        prevChannel = this.channel;
        this.channel = channel;
    }
    public void gotoPrevChannel(){
        setChannel(prevChannel);
    }
}

public class Exercise7_5 {
    public static void main(String args[]){
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH:" + t.getChannel());
        t.setChannel(20);
        System.out.println("CH:" + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:" + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:" + t.getChannel());
    }
}
