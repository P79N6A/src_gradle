package com.ss.android.f;

import android.os.Environment;
import java.io.File;

public final class a {
    public static File a() {
        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/aweme_monitor");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }
}
