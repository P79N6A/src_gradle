package com.bytedance.frameworks.plugin.b;

import android.content.Context;
import android.os.Build;
import com.bytedance.frameworks.plugin.e;
import com.bytedance.frameworks.plugin.e.a;
import java.io.File;

public final class c {
    public static void a(Context context) {
        try {
            e.a().getExternalFilesDir(null);
            Context context2 = (Context) a.a((Object) e.a(), "mBase");
            if (Build.VERSION.SDK_INT < 14 || Build.VERSION.SDK_INT >= 19) {
                if (Build.VERSION.SDK_INT >= 19) {
                    File[] fileArr = (File[]) a.a((Object) context2, "mExternalFilesDirs");
                    if (fileArr != null && fileArr.length > 0) {
                        File[] fileArr2 = new File[fileArr.length];
                        File[] fileArr3 = new File[fileArr.length];
                        for (int i = 0; i < fileArr.length; i++) {
                            File file = fileArr[i];
                            if (file != null) {
                                fileArr2[i] = new File(file, String.format("plugins/%s/files", new Object[]{context.getPackageName()}));
                                fileArr3[i] = new File(file, String.format("plugins/%s/cache", new Object[]{context.getPackageName()}));
                            }
                        }
                        a.a((Object) context, "mExternalFilesDirs", (Object) fileArr2);
                        a.a((Object) context, "mExternalCacheDirs", (Object) fileArr3);
                    }
                }
                return;
            }
            File file2 = (File) a.a((Object) context2, "mExternalFilesDir");
            if (file2 != null) {
                File file3 = new File(file2, String.format("plugins/%s/files", new Object[]{context.getPackageName()}));
                File file4 = new File(file2, String.format("plugins/%s/cache", new Object[]{context.getPackageName()}));
                a.a((Object) context, "mExternalFilesDir", (Object) file3);
                a.a((Object) context, "mExternalCacheDir", (Object) file4);
            }
        } catch (Exception unused) {
        }
    }
}
