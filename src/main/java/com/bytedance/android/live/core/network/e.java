package com.bytedance.android.live.core.network;

import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7865a;

    private static String a(String str, String str2) {
        String str3;
        String str4 = str;
        if (PatchProxy.isSupport(new Object[]{str4, str2}, null, f7865a, true, 413, new Class[]{String.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str4, str2}, null, f7865a, true, 413, new Class[]{String.class, String.class}, String.class);
        }
        if (str2 != null) {
            str3 = str2;
        } else {
            str3 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str4, str3);
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static String a(List<Pair<String, String>> list, String str) {
        String str2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{list, str3}, null, f7865a, true, 412, new Class[]{List.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{list, str3}, null, f7865a, true, 412, new Class[]{List.class, String.class}, String.class);
        }
        StringBuilder sb = new StringBuilder();
        for (Pair next : list) {
            String a2 = a((String) next.first, str3);
            String str4 = (String) next.second;
            if (str4 != null) {
                str2 = a(str4, str3);
            } else {
                str2 = "";
            }
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(a2);
            sb.append("=");
            sb.append(str2);
        }
        return sb.toString();
    }
}
