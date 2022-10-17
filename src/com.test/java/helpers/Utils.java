package helpers;

import org.aeonbits.owner.ConfigFactory;
import org.apache.commons.lang3.RandomStringUtils;

public class Utils {
    public static final PropsConfig PROPS = ConfigFactory.create(PropsConfig.class);
    private static final String usernameBase = "username ";
    private static final String passwordBase = "password";

    public static String getRandomUsername() {
        return usernameBase + RandomStringUtils.randomAlphanumeric(5);
    }

    public static String getRandomPassword() {
        return passwordBase + RandomStringUtils.randomAlphanumeric(5);
    }
}
