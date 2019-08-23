package com.bytedance.android.livesdk.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17619a;

    public static boolean a(File file) {
        if (PatchProxy.isSupport(new Object[]{file}, null, f17619a, true, 13653, new Class[]{File.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{file}, null, f17619a, true, 13653, new Class[]{File.class}, Boolean.TYPE)).booleanValue();
        } else if (!file.isDirectory()) {
            return file.delete();
        } else {
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                return file.delete();
            }
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    a(file2);
                } else {
                    file2.delete();
                }
            }
            return file.delete();
        }
    }
}
