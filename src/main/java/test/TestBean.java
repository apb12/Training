package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestBean {
    @Autowired
    private Music music;

    public String pMusic() {
        return music.playMusic();


    }
}
