package com.bytedance.ttnet.config;

import com.bytedance.common.utility.StringUtils;
import java.util.ArrayList;
import java.util.List;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private static volatile i f22617a;

    public static i a() {
        if (f22617a == null) {
            synchronized (i.class) {
                if (f22617a == null) {
                    f22617a = new i();
                }
            }
        }
        return f22617a;
    }

    private static List<String> a(String str) {
        ArrayList arrayList = new ArrayList();
        if (StringUtils.isEmpty(str)) {
            return arrayList;
        }
        for (String str2 : str.split(",")) {
            if (!StringUtils.isEmpty(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    private static List<String> a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String split : list) {
            for (String str : split.split(";")) {
                if (!StringUtils.isEmpty(str)) {
                    arrayList.add(str.trim());
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: java.util.List} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            java.net.CookieHandler r0 = java.net.CookieHandler.getDefault()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.util.List r9 = a((java.lang.String) r9)
            java.util.List r10 = a((java.lang.String) r10)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x001d:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x0037
            java.lang.Object r3 = r10.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = com.bytedance.ttnet.utils.f.a(r3, r9)
            if (r4 == 0) goto L_0x0033
            r1.add(r3)
            goto L_0x001d
        L_0x0033:
            r2.add(r3)
            goto L_0x001d
        L_0x0037:
            boolean r9 = r2.isEmpty()
            if (r9 == 0) goto L_0x003e
            return
        L_0x003e:
            boolean r9 = r1.isEmpty()
            if (r9 != 0) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            r1 = r2
        L_0x0046:
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.util.Iterator r10 = r1.iterator()
        L_0x004f:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0084
            java.lang.Object r1 = r10.next()
            java.lang.String r1 = (java.lang.String) r1
            java.net.URI r3 = new java.net.URI     // Catch:{ Throwable -> 0x0082 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0082 }
            java.lang.String r5 = "http://"
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0082 }
            r4.append(r1)     // Catch:{ Throwable -> 0x0082 }
            java.lang.String r1 = "/"
            r4.append(r1)     // Catch:{ Throwable -> 0x0082 }
            java.lang.String r1 = r4.toString()     // Catch:{ Throwable -> 0x0082 }
            r3.<init>(r1)     // Catch:{ Throwable -> 0x0082 }
            r1 = 0
            java.util.Map r1 = r0.get(r3, r1)     // Catch:{ Throwable -> 0x0082 }
            int r9 = r1.size()     // Catch:{ Throwable -> 0x0080 }
            if (r9 <= 0) goto L_0x0080
            r9 = r1
            goto L_0x0084
        L_0x0080:
            r9 = r1
            goto L_0x004f
        L_0x0082:
            goto L_0x004f
        L_0x0084:
            if (r9 == 0) goto L_0x0121
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L_0x008e
            goto L_0x0121
        L_0x008e:
            java.lang.String r10 = "Cookie"
            java.lang.Object r10 = r9.get(r10)
            java.util.List r10 = (java.util.List) r10
            if (r10 == 0) goto L_0x009e
            boolean r1 = r10.isEmpty()
            if (r1 == 0) goto L_0x00b0
        L_0x009e:
            java.lang.String r10 = "cookie"
            java.lang.Object r9 = r9.get(r10)
            r10 = r9
            java.util.List r10 = (java.util.List) r10
            if (r10 == 0) goto L_0x0120
            boolean r9 = r10.isEmpty()
            if (r9 == 0) goto L_0x00b0
            goto L_0x0120
        L_0x00b0:
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            java.util.List r10 = a((java.util.List<java.lang.String>) r10)
            java.util.Iterator r1 = r2.iterator()
        L_0x00bd:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x011f
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.net.URI r4 = new java.net.URI     // Catch:{ Throwable -> 0x011d }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x011d }
            java.lang.String r6 = "http://"
            r5.<init>(r6)     // Catch:{ Throwable -> 0x011d }
            r5.append(r2)     // Catch:{ Throwable -> 0x011d }
            java.lang.String r6 = "/"
            r5.append(r6)     // Catch:{ Throwable -> 0x011d }
            java.lang.String r5 = r5.toString()     // Catch:{ Throwable -> 0x011d }
            r4.<init>(r5)     // Catch:{ Throwable -> 0x011d }
            java.util.Iterator r5 = r10.iterator()     // Catch:{ Throwable -> 0x011d }
        L_0x00ea:
            boolean r6 = r5.hasNext()     // Catch:{ Throwable -> 0x011d }
            if (r6 == 0) goto L_0x0114
            java.lang.Object r6 = r5.next()     // Catch:{ Throwable -> 0x011d }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Throwable -> 0x011d }
            boolean r7 = com.bytedance.common.utility.StringUtils.isEmpty(r6)     // Catch:{ Throwable -> 0x011d }
            if (r7 != 0) goto L_0x00ea
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x011d }
            r7.<init>()     // Catch:{ Throwable -> 0x011d }
            r7.append(r6)     // Catch:{ Throwable -> 0x011d }
            java.lang.String r6 = "; Domain="
            r7.append(r6)     // Catch:{ Throwable -> 0x011d }
            r7.append(r2)     // Catch:{ Throwable -> 0x011d }
            java.lang.String r6 = r7.toString()     // Catch:{ Throwable -> 0x011d }
            r3.add(r6)     // Catch:{ Throwable -> 0x011d }
            goto L_0x00ea
        L_0x0114:
            java.lang.String r2 = "Set-Cookie"
            r9.put(r2, r3)     // Catch:{ Throwable -> 0x011d }
            r0.put(r4, r9)     // Catch:{ Throwable -> 0x011d }
            goto L_0x00bd
        L_0x011d:
            goto L_0x00bd
        L_0x011f:
            return
        L_0x0120:
            return
        L_0x0121:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.config.i.a(java.lang.String, java.lang.String):void");
    }
}
