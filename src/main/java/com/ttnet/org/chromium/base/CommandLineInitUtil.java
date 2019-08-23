package com.ttnet.org.chromium.base;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.ttnet.org.chromium.base.annotations.SuppressFBWarnings;
import java.io.File;

public final class CommandLineInitUtil {
    private CommandLineInitUtil() {
    }

    @SuppressLint({"NewApi"})
    private static String getDebugAppJBMR1(Context context) {
        boolean z = true;
        if (Settings.Global.getInt(context.getContentResolver(), "adb_enabled", 0) != 1) {
            z = false;
        }
        if (z) {
            return Settings.Global.getString(context.getContentResolver(), "debug_app");
        }
        return null;
    }

    private static String getDebugAppPreJBMR1(Context context) {
        boolean z = true;
        if (Settings.System.getInt(context.getContentResolver(), "adb_enabled", 0) != 1) {
            z = false;
        }
        if (z) {
            return Settings.System.getString(context.getContentResolver(), "debug_app");
        }
        return null;
    }

    @SuppressFBWarnings({"DMI_HARDCODED_ABSOLUTE_FILENAME"})
    public static void initCommandLine(Context context, String str) {
        if (!CommandLine.isInitialized()) {
            File alternativeCommandLinePath = getAlternativeCommandLinePath(context, str);
            if (alternativeCommandLinePath != null) {
                Log.i("CommandLineInitUtil", "Using alternative command line file in " + alternativeCommandLinePath.getPath(), new Object[0]);
            } else {
                alternativeCommandLinePath = new File("/data/local", str);
            }
            CommandLine.initFromFile(alternativeCommandLinePath.getPath());
        }
    }

    @SuppressFBWarnings({"DMI_HARDCODED_ABSOLUTE_FILENAME"})
    private static File getAlternativeCommandLinePath(Context context, String str) {
        String str2;
        File file = new File("/data/local/tmp", str);
        if (!file.exists()) {
            return null;
        }
        try {
            if (!"eng".equals(Build.TYPE)) {
                if (!"userdebug".equals(Build.TYPE)) {
                    if (Build.VERSION.SDK_INT < 17) {
                        str2 = getDebugAppPreJBMR1(context);
                    } else {
                        str2 = getDebugAppJBMR1(context);
                    }
                    if (str2 == null || !str2.equals(context.getApplicationContext().getPackageName())) {
                        return null;
                    }
                    return file;
                }
            }
            return file;
        } catch (RuntimeException unused) {
            Log.e("CommandLineInitUtil", "Unable to detect alternative command line file", new Object[0]);
        }
    }
}
