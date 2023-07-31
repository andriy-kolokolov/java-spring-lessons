package org.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
//        player.playMusic();
        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(player.getName());
        System.out.println(player.getVolume());

        context.close();
    }
}
