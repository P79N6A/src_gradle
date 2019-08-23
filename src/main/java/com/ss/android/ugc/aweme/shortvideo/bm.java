package com.ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;

public final class bm {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65812a;

    public static boolean a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f65812a, true, 74114, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f65812a, true, 74114, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(str)) {
            return false;
        } else {
            return new File(str2).exists();
        }
    }

    public static File a(String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, (byte) 0}, null, f65812a, true, 74115, new Class[]{String.class, Boolean.TYPE}, File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[]{str2, (byte) 0}, null, f65812a, true, 74115, new Class[]{String.class, Boolean.TYPE}, File.class);
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            File file = new File(str2);
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }
}
