package base.patterns.com.Factory;

import base.patterns.com.Factory.Developer.CppDeveloper;
import base.patterns.com.Factory.Developer.Developer;
import base.patterns.com.Factory.DeveloperFactory.DeveloperFactory;

public class Program {

    public static void main(String[] args) {
        Developer developer = DeveloperFactory.createDeveloper(CppDeveloper.class);

        assert developer != null;
        developer.writeCode();
    }
}

