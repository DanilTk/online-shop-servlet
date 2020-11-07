package validation;


import org.apache.commons.lang3.StringUtils;

public class CredentialsValidator {

    public static boolean isLoginCorrect(String login) {

        if (StringUtils.countMatches(login, '@') == 1
                && StringUtils.countMatches(login, '.') >= 1) {

            return true;
        }
        return false;
    }

    public static boolean isPasswordCorrect(String password) {

        if (StringUtils.isAlphanumeric(password)) {

            return true;
        }

        return false;
    }
}
