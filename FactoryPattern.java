package factorypattern;

public class FactoryPattern {

    public static void main(String[] args) {
        
        User standartUser = UserFactory.newUser(UserType.STANDART_USER);
        User admin = UserFactory.newUser(UserType.ADMINISTRATOR);
    }
    
}
