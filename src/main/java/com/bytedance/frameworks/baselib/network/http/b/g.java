package com.bytedance.frameworks.baselib.network.http.b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.frameworks.baselib.network.http.e;
import java.io.IOException;
import java.net.CookieManager;
import java.net.URI;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class g extends CookieManager {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f19766a;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f19767f;

    /* renamed from: b  reason: collision with root package name */
    private final android.webkit.CookieManager f19768b;

    /* renamed from: c  reason: collision with root package name */
    private final a f19769c;

    /* renamed from: d  reason: collision with root package name */
    private Pattern f19770d = Pattern.compile("(?<=Domain=)([^;]*)", 2);

    /* renamed from: e  reason: collision with root package name */
    private final a f19771e;

    public interface a {
    }

    private static List<String> a(Map<String, List<String>> map, String str) {
        if (map == null || TextUtils.isEmpty(str)) {
            return null;
        }
        List<String> list = map.get(str);
        if (list == null || list.isEmpty()) {
            list = map.get(str.toLowerCase());
        }
        return list;
    }

    private Map<String, List<String>> a(List<String> list, Map<String, List<String>> map) {
        Map<String, List<String>> emptyMap = Collections.emptyMap();
        if (f19766a) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (map != null) {
                List<String> a2 = a(map, "Cookie");
                if (a2 == null || a2.isEmpty()) {
                    linkedHashMap.put("Cookie", list);
                }
            } else {
                linkedHashMap.put("Cookie", list);
            }
            if (map != null) {
                List<String> a3 = a(map, "X-SS-Cookie");
                if (a3 != null && !a3.isEmpty()) {
                    return linkedHashMap;
                }
                linkedHashMap.put("X-SS-Cookie", list);
                return linkedHashMap;
            }
            linkedHashMap.put("X-SS-Cookie", list);
            return linkedHashMap;
        } else if (map == null) {
            return Collections.singletonMap("Cookie", list);
        } else {
            List<String> a4 = a(map, "Cookie");
            if (a4 == null || a4.isEmpty()) {
                return Collections.singletonMap("Cookie", list);
            }
            return emptyMap;
        }
    }

    private boolean a(URI uri, String str) {
        if (uri == null || StringUtils.isEmpty(str)) {
            return false;
        }
        try {
            String lowerCase = uri.getHost().toLowerCase();
            String str2 = "";
            Matcher matcher = this.f19770d.matcher(str);
            if (matcher.find()) {
                str2 = matcher.group().toLowerCase();
            }
            if (TextUtils.isEmpty(str2) || !lowerCase.endsWith(str2)) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0096 */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009a A[Catch:{ Throwable -> 0x00ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a0 A[Catch:{ Throwable -> 0x00ba }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> get(java.net.URI r5, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r6) throws java.io.IOException {
        /*
            r4 = this;
            r0 = 0
            java.lang.String r1 = r5.toString()     // Catch:{ Throwable -> 0x0052 }
            if (r6 == 0) goto L_0x002f
            java.lang.String r2 = "X-SS-No-Cookie"
            java.util.List r2 = a((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) r6, (java.lang.String) r2)     // Catch:{ Throwable -> 0x0053 }
            if (r2 == 0) goto L_0x002f
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Throwable -> 0x0053 }
        L_0x0013:
            boolean r3 = r2.hasNext()     // Catch:{ Throwable -> 0x0053 }
            if (r3 == 0) goto L_0x002f
            java.lang.Object r3 = r2.next()     // Catch:{ Throwable -> 0x0053 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Throwable -> 0x0053 }
            if (r3 == 0) goto L_0x0013
            boolean r3 = java.lang.Boolean.parseBoolean(r3)     // Catch:{ Throwable -> 0x0053 }
            if (r3 == 0) goto L_0x0013
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x0053 }
            java.util.Map r2 = java.util.Collections.emptyMap()     // Catch:{ Throwable -> 0x0053 }
            return r2
        L_0x002f:
            com.bytedance.frameworks.baselib.network.http.e$d r2 = com.bytedance.frameworks.baselib.network.http.e.j()     // Catch:{ Throwable -> 0x0053 }
            if (r2 == 0) goto L_0x0053
            java.util.Map r2 = r2.a()     // Catch:{ Throwable -> 0x0053 }
            if (r2 == 0) goto L_0x0053
            boolean r3 = r2.isEmpty()     // Catch:{ Throwable -> 0x0053 }
            if (r3 != 0) goto L_0x0053
            java.lang.String r3 = "Cookie"
            boolean r3 = r2.containsKey(r3)     // Catch:{ Throwable -> 0x0053 }
            if (r3 != 0) goto L_0x0051
            java.lang.String r3 = "X-SS-Cookie"
            boolean r3 = r2.containsKey(r3)     // Catch:{ Throwable -> 0x0053 }
            if (r3 == 0) goto L_0x0053
        L_0x0051:
            return r2
        L_0x0052:
            r1 = r0
        L_0x0053:
            if (r5 == 0) goto L_0x00bf
            android.webkit.CookieManager r2 = r4.f19768b
            if (r2 != 0) goto L_0x005a
            goto L_0x00bf
        L_0x005a:
            com.bytedance.frameworks.baselib.network.http.e$h r2 = com.bytedance.frameworks.baselib.network.http.e.i()     // Catch:{ Throwable -> 0x0078 }
            if (r2 == 0) goto L_0x0078
            boolean r3 = f19767f     // Catch:{ Throwable -> 0x0078 }
            if (r3 == 0) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            android.webkit.CookieManager r0 = r4.f19768b     // Catch:{ Throwable -> 0x0078 }
        L_0x0067:
            com.bytedance.frameworks.baselib.network.http.b.a r3 = r4.f19769c     // Catch:{ Throwable -> 0x0078 }
            java.util.List r0 = r2.a(r0, r3, r5)     // Catch:{ Throwable -> 0x0078 }
            boolean r2 = com.bytedance.common.utility.Lists.isEmpty(r0)     // Catch:{ Throwable -> 0x0078 }
            if (r2 != 0) goto L_0x0078
            java.util.Map r0 = r4.a((java.util.List<java.lang.String>) r0, (java.util.Map<java.lang.String, java.util.List<java.lang.String>>) r6)     // Catch:{ Throwable -> 0x0078 }
            return r0
        L_0x0078:
            boolean r0 = f19767f
            if (r0 != 0) goto L_0x0096
            android.webkit.CookieManager r0 = r4.f19768b     // Catch:{ Exception -> 0x0096 }
            java.lang.String r0 = r0.getCookie(r1)     // Catch:{ Exception -> 0x0096 }
            if (r0 == 0) goto L_0x0096
            int r1 = r0.length()     // Catch:{ Exception -> 0x0096 }
            if (r1 <= 0) goto L_0x0096
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Exception -> 0x0096 }
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ Exception -> 0x0096 }
            java.util.Map r0 = r4.a((java.util.List<java.lang.String>) r0, (java.util.Map<java.lang.String, java.util.List<java.lang.String>>) r6)     // Catch:{ Exception -> 0x0096 }
            return r0
        L_0x0096:
            com.bytedance.frameworks.baselib.network.http.b.a r0 = r4.f19769c     // Catch:{ Throwable -> 0x00ba }
            if (r6 != 0) goto L_0x00a0
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch:{ Throwable -> 0x00ba }
            r1.<init>()     // Catch:{ Throwable -> 0x00ba }
            goto L_0x00a1
        L_0x00a0:
            r1 = r6
        L_0x00a1:
            java.util.Map r5 = r0.get(r5, r1)     // Catch:{ Throwable -> 0x00ba }
            if (r5 == 0) goto L_0x00ba
            boolean r0 = r5.isEmpty()     // Catch:{ Throwable -> 0x00ba }
            if (r0 != 0) goto L_0x00ba
            java.lang.String r0 = "Cookie"
            java.lang.Object r5 = r5.get(r0)     // Catch:{ Throwable -> 0x00ba }
            java.util.List r5 = (java.util.List) r5     // Catch:{ Throwable -> 0x00ba }
            java.util.Map r5 = r4.a((java.util.List<java.lang.String>) r5, (java.util.Map<java.lang.String, java.util.List<java.lang.String>>) r6)     // Catch:{ Throwable -> 0x00ba }
            return r5
        L_0x00ba:
            java.util.Map r5 = java.util.Collections.emptyMap()
            return r5
        L_0x00bf:
            java.util.Map r5 = java.util.Collections.emptyMap()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.b.g.get(java.net.URI, java.util.Map):java.util.Map");
    }

    public final void put(URI uri, Map<String, List<String>> map) throws IOException {
        List<String> list;
        e.h i = e.i();
        if (i != null) {
            list = i.d(uri.getHost());
        } else {
            list = null;
        }
        if (!f19767f) {
            if (uri != null && map != null && this.f19768b != null) {
                String uri2 = uri.toString();
                for (String str : f19766a ? new String[]{"X-SS-Set-Cookie", "Set-Cookie"} : new String[]{"Set-Cookie"}) {
                    List<String> list2 = map.get(str);
                    if (list2 == null || list2.isEmpty()) {
                        list2 = map.get(str.toLowerCase());
                        if (list2 != null) {
                            if (list2.isEmpty()) {
                            }
                        }
                    }
                    for (String str2 : list2) {
                        this.f19768b.setCookie(uri2, str2);
                        try {
                            if (!Lists.isEmpty(list)) {
                                for (String next : list) {
                                    try {
                                        if (!StringUtils.isEmpty(next)) {
                                            if (!uri.getHost().endsWith(next)) {
                                                if (a(uri, str2)) {
                                                    String replaceFirst = this.f19770d.matcher(str2).replaceFirst(next);
                                                    if (!StringUtils.isEmpty(replaceFirst)) {
                                                        this.f19768b.setCookie(next, replaceFirst);
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Throwable unused) {
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
            if (f19766a && map.containsKey("X-SS-Set-Cookie") && !map.containsKey("Set-Cookie")) {
                linkedHashMap.put("Set-Cookie", map.get("X-SS-Set-Cookie"));
            }
            linkedHashMap.putAll(map);
            this.f19769c.put(uri, linkedHashMap);
            if (true ^ Lists.isEmpty(list)) {
                for (String next2 : list) {
                    try {
                        if (!StringUtils.isEmpty(next2)) {
                            if (!uri.getHost().endsWith(next2)) {
                                LinkedList linkedList = new LinkedList();
                                for (String str3 : map.get("Set-Cookie")) {
                                    if (a(uri, str3)) {
                                        String replaceFirst2 = this.f19770d.matcher(str3).replaceFirst(next2);
                                        if (!StringUtils.isEmpty(replaceFirst2)) {
                                            linkedList.add(replaceFirst2);
                                        }
                                    }
                                }
                                linkedHashMap.put("Set-Cookie", linkedList);
                                this.f19769c.put(URI.create(uri.getScheme() + "://" + next2), linkedHashMap);
                            }
                        }
                    } catch (Throwable unused3) {
                    }
                }
            }
        } catch (Throwable unused4) {
        }
    }

    public g(Context context, android.webkit.CookieManager cookieManager, a aVar) {
        this.f19769c = new a(new f(context), b.f19744a);
        this.f19768b = cookieManager;
        this.f19771e = aVar;
    }
}
