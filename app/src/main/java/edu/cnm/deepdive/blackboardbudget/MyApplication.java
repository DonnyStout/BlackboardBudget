package edu.cnm.deepdive.blackboardbudget;

import android.app.Application;
import com.facebook.stetho.Stetho;
import edu.cnm.deepdive.blackboardbudget.db.BBBudgetDatabase;
import net.danlew.android.joda.JodaTimeAndroid;

public class MyApplication extends Application {


  @Override
  public void onCreate() {
    super.onCreate();
    BBBudgetDatabase.getInstance(this);
    Stetho.initializeWithDefaults(this);
    JodaTimeAndroid.init(this);
  }
}
