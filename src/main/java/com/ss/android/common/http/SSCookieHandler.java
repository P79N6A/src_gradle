package com.ss.android.common.http;

import android.text.TextUtils;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import java.io.IOException;
import java.net.CookieManager;
import java.net.URI;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SSCookieHandler extends CookieManager {
    private static boolean USE_SS_COOKIE;
    public static ChangeQuickRedirect changeQuickRedirect;
    private final android.webkit.CookieManager mCookieMgr;
    private Pattern pattern = Pattern.compile("(?<=Domain=)([^;]*)", 2);

    public SSCookieHandler(android.webkit.CookieManager cookieManager) {
        this.mCookieMgr = cookieManager;
    }

    private boolean isDomainMatch(URI uri, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{uri, str2}, this, changeQuickRedirect, false, 15763, new Class[]{URI.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{uri, str2}, this, changeQuickRedirect, false, 15763, new Class[]{URI.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (uri == null || StringUtils.isEmpty(str)) {
            return false;
        } else {
            try {
                String lowerCase = uri.getHost().toLowerCase();
                String str3 = "";
                try {
                    Matcher matcher = this.pattern.matcher(str2);
                    if (matcher.find()) {
                        str3 = matcher.group().toLowerCase();
                    }
                    if (TextUtils.isEmpty(str3) || !lowerCase.endsWith(str3)) {
                        return false;
                    }
                    return true;
                } catch (Throwable unused) {
                    return false;
                }
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    public Map<String, List<String>> get(URI uri, Map<String, List<String>> map) throws IOException {
        if (PatchProxy.isSupport(new Object[]{uri, map}, this, changeQuickRedirect, false, 15760, new Class[]{URI.class, Map.class}, Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[]{uri, map}, this, changeQuickRedirect, false, 15760, new Class[]{URI.class, Map.class}, Map.class);
        } else if (uri == null || this.mCookieMgr == null) {
            return Collections.emptyMap();
        } else {
            try {
                String uri2 = uri.toString();
                if (map != null) {
                    List<String> list = map.get("X-SS-No-Cookie");
                    if (list != null) {
                        for (String str : list) {
                            if (str != null && Boolean.parseBoolean(str)) {
                                Logger.debug();
                                return Collections.emptyMap();
                            }
                        }
                    }
                }
                List<String> shareCookie = NetworkUtils.getShareCookie(this.mCookieMgr, uri2);
                HashMap hashMap = new HashMap();
                if (!Lists.isEmpty(shareCookie)) {
                    putCookie(hashMap, uri2, shareCookie);
                } else {
                    String cookie = this.mCookieMgr.getCookie(uri2);
                    if (!StringUtils.isEmpty(cookie)) {
                        putCookie(hashMap, uri2, Collections.singletonList(cookie));
                    }
                }
                return hashMap;
            } catch (Exception unused) {
                return Collections.emptyMap();
            }
        }
    }

    public void put(URI uri, Map<String, List<String>> map) throws IOException {
        if (PatchProxy.isSupport(new Object[]{uri, map}, this, changeQuickRedirect, false, 15762, new Class[]{URI.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{uri, map}, this, changeQuickRedirect, false, 15762, new Class[]{URI.class, Map.class}, Void.TYPE);
        } else if (uri != null && map != null && this.mCookieMgr != null) {
            String uri2 = uri.toString();
            String[] strArr = USE_SS_COOKIE ? new String[]{"Set-Cookie", "X-SS-Set-Cookie"} : new String[]{"Set-Cookie"};
            List<String> shareCookieHostList = NetworkUtils.getShareCookieHostList(uri.getHost());
            for (String str : strArr) {
                List<String> list = map.get(str);
                if (list != null) {
                    for (String str2 : list) {
                        if (isDomainMatch(uri, str2)) {
                            this.mCookieMgr.setCookie(uri2, str2);
                            if (!Lists.isEmpty(shareCookieHostList)) {
                                String replaceFirst = this.pattern.matcher(str2).replaceFirst(NetworkUtils.getShareCookieHost());
                                if (!StringUtils.isEmpty(replaceFirst)) {
                                    this.mCookieMgr.setCookie(NetworkUtils.getShareCookieHost(), replaceFirst);
                                    Logger.debug();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void putCookie(Map<String, List<String>> map, String str, List<String> list) {
        Map<String, List<String>> map2 = map;
        List<String> list2 = list;
        if (PatchProxy.isSupport(new Object[]{map2, str, list2}, this, changeQuickRedirect, false, 15761, new Class[]{Map.class, String.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map2, str, list2}, this, changeQuickRedirect, false, 15761, new Class[]{Map.class, String.class, List.class}, Void.TYPE);
            return;
        }
        if (Logger.debug()) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        if (USE_SS_COOKIE) {
            map2.put("Cookie", list2);
            map2.put("X-SS-Cookie", list2);
            return;
        }
        map2.put("Cookie", list2);
    }
}
