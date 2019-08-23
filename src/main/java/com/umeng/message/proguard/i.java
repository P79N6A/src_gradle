package com.umeng.message.proguard;

import java.net.URLEncoder;
import java.util.Map;
import java.util.Set;

public class i {
    public static String a(Map<String, Object> map, String str) {
        String str2;
        if (map == null || map.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        Set<String> keySet = map.keySet();
        if (!str.endsWith("?")) {
            sb.append("?");
        }
        for (String next : keySet) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(URLEncoder.encode(next));
            sb2.append("=");
            if (map.get(next) == null) {
                str2 = "";
            } else {
                str2 = map.get(next).toString();
            }
            sb2.append(URLEncoder.encode(str2));
            sb2.append("&");
            sb.append(sb2.toString());
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
