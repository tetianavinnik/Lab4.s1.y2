package lotr;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

import static org.reflections.scanners.Scanners.SubTypes;

public class CharacterFactory {
    @SneakyThrows
    public Character createCharacter() {
        Reflections reflections = new Reflections("lotr");
        Set<Class<?>> subTypes = reflections.get(SubTypes.of(Character.class).asClass());
        Object[] objects = subTypes.toArray();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i<objects.length; i++) {
            if (i!=1){
                arrayList.add(objects[i]);
            }
        }

        Class cls = (Class) arrayList.get(new Random().nextInt(subTypes.size()-1));

        Character character = (Character) cls.getDeclaredConstructor().newInstance();
        return character;
    }
}
