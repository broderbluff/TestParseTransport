package eu.brimir.testparsetransport;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;

/**
 * Created by Patrik on 2015-07-18.
 */
public class TestParseTransportApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "61Bs7RakNha1xTxPJiUUS0WsoOf27EFlmpDD0r6s", "WEeEr2scRojOBAPLgIqdNRCJXuxDyEzR4fP17swV");

        ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL();
        defaultACL.setPublicReadAccess(true);

        ParseACL.setDefaultACL(defaultACL, true);
    }
}
