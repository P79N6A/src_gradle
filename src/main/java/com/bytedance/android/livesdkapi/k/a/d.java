package com.bytedance.android.livesdkapi.k.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18831a;

    private static String a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f18831a, true, 15144, new Class[]{String.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f18831a, true, 15144, new Class[]{String.class, String.class}, String.class);
        } else if (str4 == null) {
            try {
                return URLEncoder.encode(str3, "ISO-8859-1");
            } catch (UnsupportedEncodingException e2) {
                throw new IllegalArgumentException(e2);
            }
        } else if (str4.equals("null_encoding")) {
            return str3;
        } else {
            return URLEncoder.encode(str, str2);
        }
    }

    public static String a(List<? extends c> list, String str) {
        String str2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{list, str3}, null, f18831a, true, 15142, new Class[]{List.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{list, str3}, null, f18831a, true, 15142, new Class[]{List.class, String.class}, String.class);
        }
        StringBuilder sb = new StringBuilder();
        for (c cVar : list) {
            String a2 = a(cVar.a(), str3);
            String b2 = cVar.b();
            if (b2 != null) {
                str2 = a(b2, str3);
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
