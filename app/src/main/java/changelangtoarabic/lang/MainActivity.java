package changelangtoarabic.lang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    @Override
//    protected void onSaveInstanceState(Bundle outState) {
////        String lang = PreferenceManager.getDefaultSharedPreferences(this).getString("languagePref", "default");
//        String lang = "ar";
//        Configuration config = getResources().getConfiguration();
//        if( lang.equals("default") ) lang = Locale.getDefault().getLanguage();
//        config.locale = new Locale(lang);
//        getResources().updateConfiguration(config, getResources().getDisplayMetrics());
//        super.onSaveInstanceState(outState);
//    }


    public void otherActivity(View view) {
        startActivity(new Intent(this, Main2Activity.class));
    }
}
