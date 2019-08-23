package com.ss.android.ugc.effectmanager.common.f;

import android.text.TextUtils;
import java.util.List;
import java.util.Map;

public final class f {
    public static <T> String a(List<T> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (list == null || list.isEmpty()) {
            sb.append("]");
            return sb.toString();
        }
        for (T next : list) {
            sb.append("\"");
            sb.append(next.toString());
            sb.append("\"");
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }

    public static String a(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append("?");
        if (map.size() > 0) {
            for (Map.Entry next : map.entrySet()) {
                String str2 = (String) next.getKey();
                String str3 = (String) next.getValue();
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                    sb.append("&");
                    sb.append(str2);
                    sb.append("=");
                    sb.append(str3);
                }
            }
        }
        return new String(sb);
    }
}
