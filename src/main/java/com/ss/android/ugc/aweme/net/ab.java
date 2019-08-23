package com.ss.android.ugc.aweme.net;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.frameworks.baselib.network.http.b.b;
import com.bytedance.frameworks.baselib.network.http.b.f;
import com.bytedance.frameworks.baselib.network.http.e;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.i18n.c;
import java.io.IOException;
import java.net.CookieManager;
import java.net.URI;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class ab extends CookieManager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56882a;
    private static boolean g;

    /* renamed from: b  reason: collision with root package name */
    private final android.webkit.CookieManager f56883b;

    /* renamed from: c  reason: collision with root package name */
    private final com.bytedance.frameworks.baselib.network.http.b.a f56884c;

    /* renamed from: d  reason: collision with root package name */
    private Context f56885d;

    /* renamed from: e  reason: collision with root package name */
    private Pattern f56886e = Pattern.compile("(?<=Domain=)([^;]*)", 2);

    /* renamed from: f  reason: collision with root package name */
    private final a f56887f;

    public interface a {
        void a(String str, String str2, JSONObject jSONObject);
    }

    private List<String> a(Map<String, List<String>> map, String str) {
        Map<String, List<String>> map2 = map;
        if (PatchProxy.isSupport(new Object[]{map2, str}, this, f56882a, false, 60791, new Class[]{Map.class, String.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{map2, str}, this, f56882a, false, 60791, new Class[]{Map.class, String.class}, List.class);
        } else if (map2 == null || TextUtils.isEmpty(str)) {
            return null;
        } else {
            List<String> list = map.get(str);
            if (list == null || list.isEmpty()) {
                list = map2.get(str.toLowerCase());
            }
            return list;
        }
    }

    private Map<String, List<String>> a(List<String> list, Map<String, List<String>> map) {
        List<String> list2 = list;
        Map<String, List<String>> map2 = map;
        if (PatchProxy.isSupport(new Object[]{list2, map2}, this, f56882a, false, 60792, new Class[]{List.class, Map.class}, Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[]{list2, map2}, this, f56882a, false, 60792, new Class[]{List.class, Map.class}, Map.class);
        }
        Map<String, List<String>> emptyMap = Collections.emptyMap();
        if (map2 != null) {
            List<String> a2 = a(map2, "Cookie");
            if (a2 == null || a2.isEmpty()) {
                emptyMap = Collections.singletonMap("Cookie", list2);
            }
        } else {
            emptyMap = Collections.singletonMap("Cookie", list2);
        }
        return emptyMap;
    }

    private boolean a(URI uri, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{uri, str2}, this, f56882a, false, 60795, new Class[]{URI.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{uri, str2}, this, f56882a, false, 60795, new Class[]{URI.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (uri == null || StringUtils.isEmpty(str)) {
            return false;
        } else {
            try {
                String lowerCase = uri.getHost().toLowerCase();
                String str3 = "";
                try {
                    Matcher matcher = this.f56886e.matcher(str2);
                    if (matcher.find()) {
                        str3 = matcher.group().toLowerCase();
                    }
                    return o.a(lowerCase, str3);
                } catch (Throwable unused) {
                    return false;
                }
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00d9 */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00dd A[Catch:{ Throwable -> 0x016b }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00e3 A[Catch:{ Throwable -> 0x016b }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0119 A[Catch:{ Throwable -> 0x016a }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0161 A[Catch:{ Throwable -> 0x016a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> get(java.net.URI r11, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r12) throws java.io.IOException {
        /*
            r10 = this;
            r7 = 2
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r11
            r9 = 1
            r0[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f56882a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<java.net.URI> r1 = java.net.URI.class
            r5[r8] = r1
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            r5[r9] = r1
            java.lang.Class<java.util.Map> r6 = java.util.Map.class
            r3 = 0
            r4 = 60793(0xed79, float:8.5189E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0042
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r11
            r0[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f56882a
            r3 = 0
            r4 = 60793(0xed79, float:8.5189E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<java.net.URI> r1 = java.net.URI.class
            r5[r8] = r1
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            r5[r9] = r1
            java.lang.Class<java.util.Map> r6 = java.util.Map.class
            r1 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.util.Map r0 = (java.util.Map) r0
            return r0
        L_0x0042:
            r0 = 0
            java.lang.String r1 = r11.toString()     // Catch:{ Throwable -> 0x0094 }
            if (r12 == 0) goto L_0x0071
            java.lang.String r2 = "X-SS-No-Cookie"
            java.util.List r2 = r10.a((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) r12, (java.lang.String) r2)     // Catch:{ Throwable -> 0x0095 }
            if (r2 == 0) goto L_0x0071
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Throwable -> 0x0095 }
        L_0x0055:
            boolean r3 = r2.hasNext()     // Catch:{ Throwable -> 0x0095 }
            if (r3 == 0) goto L_0x0071
            java.lang.Object r3 = r2.next()     // Catch:{ Throwable -> 0x0095 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Throwable -> 0x0095 }
            if (r3 == 0) goto L_0x0055
            boolean r3 = java.lang.Boolean.parseBoolean(r3)     // Catch:{ Throwable -> 0x0095 }
            if (r3 == 0) goto L_0x0055
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x0095 }
            java.util.Map r2 = java.util.Collections.emptyMap()     // Catch:{ Throwable -> 0x0095 }
            return r2
        L_0x0071:
            com.bytedance.frameworks.baselib.network.http.e$d r2 = com.bytedance.frameworks.baselib.network.http.e.j()     // Catch:{ Throwable -> 0x0095 }
            if (r2 == 0) goto L_0x0095
            java.util.Map r2 = r2.a()     // Catch:{ Throwable -> 0x0095 }
            if (r2 == 0) goto L_0x0095
            boolean r3 = r2.isEmpty()     // Catch:{ Throwable -> 0x0095 }
            if (r3 != 0) goto L_0x0095
            java.lang.String r3 = "Cookie"
            boolean r3 = r2.containsKey(r3)     // Catch:{ Throwable -> 0x0095 }
            if (r3 != 0) goto L_0x0093
            java.lang.String r3 = "X-SS-Cookie"
            boolean r3 = r2.containsKey(r3)     // Catch:{ Throwable -> 0x0095 }
            if (r3 == 0) goto L_0x0095
        L_0x0093:
            return r2
        L_0x0094:
            r1 = r0
        L_0x0095:
            if (r11 == 0) goto L_0x0170
            android.webkit.CookieManager r2 = r10.f56883b
            if (r2 != 0) goto L_0x009d
            goto L_0x0170
        L_0x009d:
            com.bytedance.frameworks.baselib.network.http.e$h r2 = com.bytedance.frameworks.baselib.network.http.e.i()     // Catch:{ Throwable -> 0x00bb }
            if (r2 == 0) goto L_0x00bb
            boolean r3 = g     // Catch:{ Throwable -> 0x00bb }
            if (r3 == 0) goto L_0x00a8
            goto L_0x00aa
        L_0x00a8:
            android.webkit.CookieManager r0 = r10.f56883b     // Catch:{ Throwable -> 0x00bb }
        L_0x00aa:
            com.bytedance.frameworks.baselib.network.http.b.a r3 = r10.f56884c     // Catch:{ Throwable -> 0x00bb }
            java.util.List r0 = r2.a(r0, r3, r11)     // Catch:{ Throwable -> 0x00bb }
            boolean r2 = com.bytedance.common.utility.Lists.isEmpty(r0)     // Catch:{ Throwable -> 0x00bb }
            if (r2 != 0) goto L_0x00bb
            java.util.Map r0 = r10.a((java.util.List<java.lang.String>) r0, (java.util.Map<java.lang.String, java.util.List<java.lang.String>>) r12)     // Catch:{ Throwable -> 0x00bb }
            return r0
        L_0x00bb:
            boolean r0 = g
            if (r0 != 0) goto L_0x00d9
            android.webkit.CookieManager r0 = r10.f56883b     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r0 = r0.getCookie(r1)     // Catch:{ Exception -> 0x00d9 }
            if (r0 == 0) goto L_0x00d9
            int r1 = r0.length()     // Catch:{ Exception -> 0x00d9 }
            if (r1 <= 0) goto L_0x00d9
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Exception -> 0x00d9 }
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ Exception -> 0x00d9 }
            java.util.Map r0 = r10.a((java.util.List<java.lang.String>) r0, (java.util.Map<java.lang.String, java.util.List<java.lang.String>>) r12)     // Catch:{ Exception -> 0x00d9 }
            return r0
        L_0x00d9:
            com.bytedance.frameworks.baselib.network.http.b.a r0 = r10.f56884c     // Catch:{ Throwable -> 0x016b }
            if (r12 != 0) goto L_0x00e3
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch:{ Throwable -> 0x016b }
            r1.<init>()     // Catch:{ Throwable -> 0x016b }
            goto L_0x00e4
        L_0x00e3:
            r1 = r12
        L_0x00e4:
            java.util.Map r0 = r0.get(r11, r1)     // Catch:{ Throwable -> 0x016b }
            if (r0 == 0) goto L_0x016b
            boolean r1 = r0.isEmpty()     // Catch:{ Throwable -> 0x016b }
            if (r1 != 0) goto L_0x016b
            java.lang.String r1 = "Cookie"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Throwable -> 0x016b }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Throwable -> 0x016b }
            java.util.Map r0 = r10.a((java.util.List<java.lang.String>) r0, (java.util.Map<java.lang.String, java.util.List<java.lang.String>>) r12)     // Catch:{ Throwable -> 0x016b }
            com.ss.android.ugc.aweme.net.ab$a r1 = r10.f56887f     // Catch:{ Throwable -> 0x016a }
            if (r1 == 0) goto L_0x016a
            boolean r1 = r0.isEmpty()     // Catch:{ Throwable -> 0x016a }
            if (r1 != 0) goto L_0x016a
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Throwable -> 0x016a }
            r1.<init>()     // Catch:{ Throwable -> 0x016a }
            java.util.Set r2 = r0.entrySet()     // Catch:{ Throwable -> 0x016a }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Throwable -> 0x016a }
        L_0x0113:
            boolean r3 = r2.hasNext()     // Catch:{ Throwable -> 0x016a }
            if (r3 == 0) goto L_0x0152
            java.lang.Object r3 = r2.next()     // Catch:{ Throwable -> 0x016a }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ Throwable -> 0x016a }
            if (r3 == 0) goto L_0x0113
            java.lang.Object r4 = r3.getKey()     // Catch:{ Throwable -> 0x016a }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Throwable -> 0x016a }
            java.lang.Object r3 = r3.getValue()     // Catch:{ Throwable -> 0x016a }
            java.util.List r3 = (java.util.List) r3     // Catch:{ Throwable -> 0x016a }
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ Throwable -> 0x016a }
            r5.<init>()     // Catch:{ Throwable -> 0x016a }
            if (r3 == 0) goto L_0x014e
            boolean r6 = r3.isEmpty()     // Catch:{ Throwable -> 0x016a }
            if (r6 != 0) goto L_0x014e
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Throwable -> 0x016a }
        L_0x013e:
            boolean r6 = r3.hasNext()     // Catch:{ Throwable -> 0x016a }
            if (r6 == 0) goto L_0x014e
            java.lang.Object r6 = r3.next()     // Catch:{ Throwable -> 0x016a }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Throwable -> 0x016a }
            r5.put(r6)     // Catch:{ Throwable -> 0x016a }
            goto L_0x013e
        L_0x014e:
            r1.put(r4, r5)     // Catch:{ Throwable -> 0x016a }
            goto L_0x0113
        L_0x0152:
            java.lang.String r2 = "url"
            java.lang.String r3 = r11.toString()     // Catch:{ Throwable -> 0x016a }
            r1.put(r2, r3)     // Catch:{ Throwable -> 0x016a }
            int r2 = r1.length()     // Catch:{ Throwable -> 0x016a }
            if (r2 <= 0) goto L_0x016a
            com.ss.android.ugc.aweme.net.ab$a r2 = r10.f56887f     // Catch:{ Throwable -> 0x016a }
            java.lang.String r3 = "get_cookie"
            java.lang.String r4 = "app_cookie_store"
            r2.a(r3, r4, r1)     // Catch:{ Throwable -> 0x016a }
        L_0x016a:
            return r0
        L_0x016b:
            java.util.Map r0 = java.util.Collections.emptyMap()
            return r0
        L_0x0170:
            java.util.Map r0 = java.util.Collections.emptyMap()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.net.ab.get(java.net.URI, java.util.Map):java.util.Map");
    }

    public final void put(URI uri, Map<String, List<String>> map) throws IOException {
        URI uri2 = uri;
        Map<String, List<String>> map2 = map;
        if (PatchProxy.isSupport(new Object[]{uri2, map2}, this, f56882a, false, 60794, new Class[]{URI.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{uri2, map2}, this, f56882a, false, 60794, new Class[]{URI.class, Map.class}, Void.TYPE);
            return;
        }
        List<String> list = null;
        e.h i = e.i();
        if (i != null) {
            list = i.d(uri.getHost());
        }
        if (list == null) {
            list = new CopyOnWriteArrayList<>();
        }
        List<String> list2 = list;
        List<String> d2 = com.bytedance.ttnet.config.a.a(this.f56885d).d(uri.getHost());
        if (d2 != null && d2.size() > 0) {
            for (String next : d2) {
                if (!list2.contains(next)) {
                    synchronized (com.bytedance.ttnet.config.a.a(this.f56885d)) {
                        list2.add(next);
                    }
                }
            }
        }
        if (list2.isEmpty() && c.a()) {
            if (!(uri2 == null || uri.getPath() == null || !uri.getPath().contains("passport/user/login"))) {
                MonitorUtils.monitorCommonLog("cookie_fail", new JSONObject());
            }
            list2.add(".tiktok.com");
        }
        if (!g) {
            if (uri2 != null && map2 != null && this.f56883b != null) {
                String uri3 = uri.toString();
                String[] strArr = {"Set-Cookie"};
                for (int i2 = 0; i2 <= 0; i2++) {
                    String str = strArr[i2];
                    List<String> list3 = map2.get(str);
                    if (list3 == null || list3.isEmpty()) {
                        list3 = map2.get(str.toLowerCase());
                        if (list3 != null) {
                            if (list3.isEmpty()) {
                            }
                        }
                    }
                    for (String str2 : list3) {
                        this.f56883b.setCookie(uri3, str2);
                        try {
                            if (!Lists.isEmpty(list2)) {
                                synchronized (com.bytedance.ttnet.config.a.a(this.f56885d)) {
                                    for (String next2 : list2) {
                                        try {
                                            if (!StringUtils.isEmpty(next2)) {
                                                if (!uri.getHost().endsWith(next2)) {
                                                    if (a(uri2, str2)) {
                                                        String replaceFirst = this.f56886e.matcher(str2).replaceFirst(next2);
                                                        if (!StringUtils.isEmpty(replaceFirst)) {
                                                            this.f56883b.setCookie(next2, replaceFirst);
                                                        }
                                                    }
                                                }
                                            }
                                        } catch (Throwable unused) {
                                        }
                                    }
                                }
                                Logger.debug();
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
            } else {
                return;
            }
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map2);
            this.f56884c.put(uri2, linkedHashMap);
            if (!Lists.isEmpty(list2)) {
                synchronized (com.bytedance.ttnet.config.a.a(this.f56885d)) {
                    for (String next3 : list2) {
                        try {
                            if (!StringUtils.isEmpty(next3)) {
                                if (!uri.getHost().endsWith(next3)) {
                                    LinkedList linkedList = new LinkedList();
                                    for (String str3 : map2.get("Set-Cookie")) {
                                        if (a(uri2, str3)) {
                                            String replaceFirst2 = this.f56886e.matcher(str3).replaceFirst(next3);
                                            if (!StringUtils.isEmpty(replaceFirst2)) {
                                                linkedList.add(replaceFirst2);
                                            }
                                        }
                                    }
                                    linkedHashMap.put("Set-Cookie", linkedList);
                                    com.bytedance.frameworks.baselib.network.http.b.a aVar = this.f56884c;
                                    aVar.put(URI.create(uri.getScheme() + "://" + next3), linkedHashMap);
                                }
                            }
                        } catch (Throwable unused3) {
                        }
                    }
                }
            }
        } catch (Throwable unused4) {
        }
    }

    public ab(Context context, android.webkit.CookieManager cookieManager, a aVar) {
        this.f56885d = context;
        this.f56884c = new com.bytedance.frameworks.baselib.network.http.b.a(new f(context), b.f19744a);
        this.f56883b = cookieManager;
        this.f56887f = aVar;
    }
}
