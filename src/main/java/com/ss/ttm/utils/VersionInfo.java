package com.ss.ttm.utils;

import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class VersionInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static String[] mVersion;

    public static String[] getVersion() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 91163, new Class[0], String[].class)) {
            return (String[]) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 91163, new Class[0], String[].class);
        }
        if (mVersion == null) {
            String[] strArr = {"null", "null", "null", "null"};
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/version"), 8192);
                strArr[0] = bufferedReader.readLine().split("\\s+")[2];
                bufferedReader.close();
            } catch (IOException unused) {
            }
            strArr[1] = Build.VERSION.RELEASE;
            strArr[2] = Build.MODEL;
            strArr[3] = Build.DISPLAY;
            mVersion = strArr;
        }
        return mVersion;
    }
}
