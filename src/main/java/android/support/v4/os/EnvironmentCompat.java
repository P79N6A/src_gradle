package android.support.v4.os;

import android.os.Build;
import android.os.Environment;
import java.io.File;
import java.io.IOException;

public final class EnvironmentCompat {
    private EnvironmentCompat() {
    }

    public static String getStorageState(File file) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Environment.getStorageState(file);
        }
        try {
            if (file.getCanonicalPath().startsWith(Environment.getExternalStorageDirectory().getCanonicalPath())) {
                return Environment.getExternalStorageState();
            }
        } catch (IOException unused) {
        }
        return "unknown";
    }
}
