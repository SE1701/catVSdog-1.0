import character.CharacterTest;
import controller.ControllerTest;
import interact.InteractTest;
import weapon.WeaponNWindTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        /**
         * 此处类的配置顺序会影响执行顺序
         */
        CharacterTest.class,
        ControllerTest.class,
        InteractTest.class,
        WeaponNWindTest.class
})

public class TestAll {
}
