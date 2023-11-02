package com.mystudy.pract;

class MyTv{
    boolean isPowerOn;
    int channel;
    int volume;

    final int MAX_VOLUME=100;
    final int MIN_VOLUME=0;
    final int MAX_CHANNEL=100;
    final int MIN_CHANNEL=100;

    void turnOnOff(){           //isPowerOn의 값이 true 면 false, false 면 true
        isPowerOn=!isPowerOn;
    }

    void volumeUp(){            //volume값이 MAX 보다 작으면 +1
        if(volume<MAX_VOLUME)
            volume+=1;
    }

    void volumeDown(){          //volume값이 MIN 보다 크면 -1
        if(volume>MIN_VOLUME)
            volume-=1;
    }

    void channelUp(){           //ch값 +1  => ch이 MAX면 ch값을 MIN으로 변경
        channel+=1;
        if(channel==MAX_CHANNEL)
            channel=MIN_CHANNEL;
    }

    void channelDown(){         //ch값 -1 => ch이 MIN이면 ch값을 MAX로 변경
        channel-=1;
        if(channel==MAX_CHANNEL)
            channel=MAX_CHANNEL;
    }

}
public class ObjChange {
    public static void main(String[] args) {
        MyTv tv = new MyTv();

        tv.channel=100;
        tv.volume=0;
        System.out.println("CH:"+tv.channel+", VOL:"+tv.volume);

        tv.channelDown();
        tv.volumeDown();
        System.out.println("CH:"+tv.channel+", VOL:"+tv.volume);

        tv.volume=100;
        tv.channelUp();
        tv.volumeUp();
        System.out.println("CH:"+tv.channel+", VOL:"+tv.volume);
    }

}

