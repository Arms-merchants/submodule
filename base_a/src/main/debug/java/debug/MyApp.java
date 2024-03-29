package debug;

import android.app.Application;

import com.billy.cc.core.component.CC;

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CC.enableDebug(true);
        CC.enableVerboseLog(true);
        CC.enableRemoteCC(true);
    }
}