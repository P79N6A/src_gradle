package com.bytedance.ttnet.config;

import android.webkit.CookieManager;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.frameworks.baselib.network.http.b.a;
import com.bytedance.frameworks.baselib.network.http.e;
import com.bytedance.ttnet.TTNetInit;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class d implements e.h {
    public final List<String> d(String str) {
        String a2 = TTNetInit.getTTNetDepend().a(TTNetInit.getTTNetDepend().a(), "share_cookie_host_list", "");
        ArrayList arrayList = new ArrayList();
        for (String str2 : a2.split(",")) {
            if (!StringUtils.isEmpty(str2)) {
                arrayList.add(str2);
            }
        }
        String f2 = TTNetInit.getTTNetDepend().f();
        if (!StringUtils.isEmpty(f2) && !a(f2, arrayList)) {
            arrayList.add(f2);
        }
        if (a(str, arrayList)) {
            return arrayList;
        }
        return null;
    }

    private static boolean a(String str, List<String> list) {
        if (StringUtils.isEmpty(str) || Lists.isEmpty(list)) {
            return false;
        }
        for (String endsWith : list) {
            if (str.endsWith(endsWith)) {
                return true;
            }
        }
        return false;
    }

    public final List<String> a(CookieManager cookieManager, a aVar, URI uri) {
        String str;
        if (uri == null || (cookieManager == null && aVar == null)) {
            return null;
        }
        try {
            str = uri.getHost();
        } catch (Exception unused) {
            str = null;
        }
        String a2 = TTNetInit.getTTNetDepend().a(TTNetInit.getTTNetDepend().a(), "share_cookie_host_list", "");
        ArrayList arrayList = new ArrayList();
        for (String str2 : a2.split(",")) {
            if (!StringUtils.isEmpty(str2)) {
                arrayList.add(str2);
            }
        }
        if (StringUtils.isEmpty(str) || !a(str, arrayList)) {
            return null;
        }
        List arrayList2 = new ArrayList();
        if (cookieManager != null) {
            String cookie = cookieManager.getCookie(TTNetInit.getTTNetDepend().f());
            if (!StringUtils.isEmpty(cookie)) {
                arrayList2.add(cookie);
            }
        }
        if (Lists.isEmpty(arrayList2) && aVar != null) {
            try {
                Map<String, List<String>> map = aVar.get(URI.create(uri.getScheme() + "://" + TTNetInit.getTTNetDepend().f()), new LinkedHashMap());
                if (map != null && !map.isEmpty()) {
                    arrayList2 = map.get("Cookie");
                }
            } catch (Throwable unused2) {
            }
        }
        return arrayList2;
    }
}
