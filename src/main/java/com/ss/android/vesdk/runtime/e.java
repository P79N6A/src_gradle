package com.ss.android.vesdk.runtime;

import com.ss.android.vesdk.r;
import java.io.File;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private String f78133a = VERuntime.a().f78083e.f78102a;

    public static String a(String str, String str2) throws r {
        File file = new File(str, str2);
        if (file.exists() || file.mkdirs()) {
            return file.getAbsolutePath();
        }
        throw new r(-100, "mkdirs failed, workspace path: " + str);
    }
}
