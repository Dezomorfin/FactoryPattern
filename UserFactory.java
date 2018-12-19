package factorypattern;

public class UserFactory {
    
    public static User newUser(UserType userType) {
        
        User newUser = null;
        
        if (userType == UserType.STANDART_USER) {
            newUser = new UserStandard();
        }
        if (userType == UserType.ADMINISTRATOR) {
            newUser = new Administrator();
        }
        
        return newUser;
    }
    
}
