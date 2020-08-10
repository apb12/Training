package test;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ClassicMusic implements Music{
    @Override
    public String playMusic() {
        return "This is Classic Music";
    }
}
