package com.umeng.commonsdk.framework;

import android.content.Context;
import java.util.HashMap;

public class UMModuleRegister {
    private static Context mModuleAppContext;
    private static HashMap<String, UMLogDataProtocol> mModuleMap;

    public static String eventType2ModuleName(int i) {
        String str = "analytics";
        if (i >= 16385 && i <= 20480) {
            str = "push";
        }
        if (i >= 24577 && i <= 28672) {
            str = "share";
        }
        if (i >= 32769 && i <= 36864) {
            str = "internal";
        }
        return (i < 36945 || i > 37120) ? str : "process";
    }

    public static Context getAppContext() {
        return mModuleAppContext;
    }

    public static void registerAppContext(Context context) {
        if (mModuleAppContext == null) {
            mModuleAppContext = context.getApplicationContext();
        }
    }

    public static UMLogDataProtocol getCallbackFromModuleName(String str) {
        if (mModuleMap.containsKey(str)) {
            return mModuleMap.get(str);
        }
        return null;
    }

    public static boolean registerCallback(int i, UMLogDataProtocol uMLogDataProtocol) {
        if (mModuleMap == null) {
            mModuleMap = new HashMap<>();
        }
        String eventType2ModuleName = eventType2ModuleName(i);
        if (!mModuleMap.containsKey(eventType2ModuleName)) {
            mModuleMap.put(eventType2ModuleName, uMLogDataProtocol);
        }
        return true;
    }
}
