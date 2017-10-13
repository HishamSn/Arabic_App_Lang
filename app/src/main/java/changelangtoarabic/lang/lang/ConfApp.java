package changelangtoarabic.lang.lang;

import android.app.Activity;
import android.content.SharedPreferences;


/**
 * Created by Hisham Snaimeh on 8/31/2017.
 */

public class ConfApp {


    SharedPreferences sharedPreferences;

    Activity ctx;
    public ConfApp(Activity context){
        this.ctx = context;
    }


    private static final String LANGUAGE_APP = "LANGUAGE_APP";

    public static String getLanguageApplication() {
        return StartUp.getInstance().getPreferences().getString(LANGUAGE_APP, "en");
    }

    public static void setLanguageApplication(String language) {
        StartUp.getInstance().getPreferences().edit().putString(LANGUAGE_APP, language).apply();
    }


}
