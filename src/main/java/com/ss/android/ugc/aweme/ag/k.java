package com.ss.android.ugc.aweme.ag;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33252a;

    public static List<String> a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f33252a, true, 70976, new Class[]{String.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{str}, null, f33252a, true, 70976, new Class[]{String.class}, List.class);
        } else if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        } else {
            return Uri.parse(str).getPathSegments();
        }
    }

    public static String b(String str, String str2) {
        String str3 = str2;
        if (PatchProxy.isSupport(new Object[]{str, str3}, null, f33252a, true, 70978, new Class[]{String.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str, str3}, null, f33252a, true, 70978, new Class[]{String.class, String.class}, String.class);
        } else if (TextUtils.isEmpty(str)) {
            return "";
        } else {
            return Uri.parse(str).getQueryParameter(str3);
        }
    }

    public static boolean a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, null, f33252a, true, 70975, new Class[]{String.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, str2}, null, f33252a, true, 70975, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        } else {
            Uri parse = Uri.parse(str);
            Uri parse2 = Uri.parse(str2);
            if (!TextUtils.equals(parse.getScheme(), parse2.getScheme()) || !TextUtils.equals(parse.getHost(), parse2.getHost())) {
                return false;
            }
            List<String> pathSegments = parse.getPathSegments();
            List<String> pathSegments2 = parse2.getPathSegments();
            if (pathSegments.size() != pathSegments2.size()) {
                return false;
            }
            int size = pathSegments.size();
            for (int i = 0; i < size; i++) {
                if (!pathSegments.get(i).startsWith(":") && !pathSegments.get(i).equals(pathSegments2.get(i))) {
                    return false;
                }
            }
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames == null || queryParameterNames.size() == 0) {
                return true;
            }
            Set<String> queryParameterNames2 = parse2.getQueryParameterNames();
            Iterator<String> it2 = queryParameterNames2.iterator();
            for (String equals : queryParameterNames) {
                if (!it2.hasNext()) {
                    return false;
                }
                if (!TextUtils.equals(equals, it2.next())) {
                    return false;
                }
            }
            return true;
        }
    }
}
