package View;

import java.util.Locale;
import java.util.ResourceBundle;


public class View {

    // Resource Bundle Installation's
    private static String MESSAGES_BUNDLE_NAME = "messages";
    private static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    new Locale("ua", "UA"));  // Ukrainian
//                    new Locale("en"));        // English

    public void printMessages(String... messages) {
        for (String message : messages) {
            System.out.print(message);
        }
        System.out.print("\n");
    }

    public String getBundleString(String message) {
        return bundle.getString(message);
    }

}