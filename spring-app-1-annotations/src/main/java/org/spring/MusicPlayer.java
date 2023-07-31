package org.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    public String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private List<Music> musicList = new ArrayList<>();
    private Music music1;
    private Music music2;
    private Music music3;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2,
                       @Qualifier("rapMusic") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    @PostConstruct
    public void init() {
        System.out.println(this.getClass().getSimpleName() + ": initialization");
    }

    @PreDestroy
    public void destroy() {
        System.out.println(this.getClass().getSimpleName() + ": destruction");
    }

    public void playMusic() {
        System.out.println("Playing " + music1.getSong() + "\nPlaying " + music2.getSong() + "\nPlaying " + music3.getSong());
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
