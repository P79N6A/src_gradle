package com.aweme.storage;

import android.content.Context;
import com.aweme.storage.d;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class f {
    public static Map<String, Long> a(Context context, List<String> list) {
        File file;
        File file2;
        if (context == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (context.getCacheDir() == null) {
            file = null;
        } else {
            file = context.getCacheDir().getParentFile();
        }
        a(file, hashMap, list, d.b.p.name());
        a(context.getCacheDir(), hashMap, list, d.b.p.name() + "/cache");
        a(context.getFilesDir(), hashMap, list, d.b.p.name() + "/cache");
        if (context.getExternalCacheDir() == null) {
            file2 = null;
        } else {
            file2 = context.getExternalCacheDir().getParentFile();
        }
        a(file2, hashMap, list, d.b.e.name());
        a(context.getExternalCacheDir(), hashMap, list, d.b.e.name() + "/files");
        a(context.getExternalFilesDir(null), hashMap, list, d.b.e.name() + "/files");
        return hashMap;
    }

    private static void a(File file, Map<String, Long> map, List<String> list, String str) {
        if (file != null) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2 != null && file2.isDirectory() && file2.getAbsolutePath() != null && (list == null || !list.contains(file2.getName()))) {
                        String str2 = str + File.separator + file2.getName();
                        long a2 = (e.a(file2.getAbsolutePath()) / 1024) / 1024;
                        map.put(str2, Long.valueOf(a2));
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        sb.append(" ");
                        sb.append(a2);
                    }
                }
            }
        }
    }
}
