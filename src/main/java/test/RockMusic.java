package test;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public String playMusic() {
        return "This is Rock music";
    }
}
