package character;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        /**
         * 此处类的配置顺序会影响执行顺序
         */
        CatTest.class,
        DogTest.class,
        PlayerTest.class
})
public class CharacterTest {
}
