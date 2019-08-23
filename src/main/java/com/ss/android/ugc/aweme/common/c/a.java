package com.ss.android.ugc.aweme.common.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.util.Set;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40198a;

    public static void a(String str, Set<String> set) throws Exception {
        String str2 = str;
        Set<String> set2 = set;
        if (PatchProxy.isSupport(new Object[]{str2, set2}, null, f40198a, true, 33426, new Class[]{String.class, Set.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, set2}, null, f40198a, true, 33426, new Class[]{String.class, Set.class}, Void.TYPE);
            return;
        }
        File file = new File(str2);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                if (listFiles[i].isDirectory()) {
                    a(listFiles[i].getAbsolutePath(), set2);
                } else {
                    String name = listFiles[i].getName();
                    if (set2 == null || !set2.contains(name)) {
                        listFiles[i].delete();
                    }
                }
            }
        }
    }
}
