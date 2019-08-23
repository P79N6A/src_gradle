package com.bytedance.ies.b.c;

import android.text.TextUtils;
import com.bytedance.common.utility.DigestUtils;
import com.bytedance.ies.b.a.a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class b {
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            String md5Hex = DigestUtils.md5Hex(file);
            if (!TextUtils.isEmpty(md5Hex)) {
                return md5Hex.toLowerCase();
            }
        }
        return null;
    }

    public static String a(List<a> list, String str) {
        if (list == null || list.isEmpty() || TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) != null) {
                if (i != 0) {
                    sb.append(str);
                }
                sb.append(list.get(i).toString());
            }
        }
        return sb.toString();
    }

    public static List<a> a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        String[] split = str.split(str2);
        if (split != null) {
            for (String str3 : split) {
                if (!TextUtils.isEmpty(str3)) {
                    arrayList.add(new a(str3));
                }
            }
        }
        return arrayList;
    }
}
