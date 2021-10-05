package base.patterns.com.Factory.DeveloperFactory;

import base.patterns.com.Factory.Developer.CppDeveloper;
import base.patterns.com.Factory.Developer.Developer;
import base.patterns.com.Factory.Developer.JavaDeveloper;


public class DeveloperFactory {
    static public Developer createDeveloper(Class<?> clazz) {
        if (clazz == JavaDeveloper.class) {
            return new JavaDeveloper();
        } else if (clazz == CppDeveloper.class) {
            return new CppDeveloper();
        }
        return null;
    }
}
