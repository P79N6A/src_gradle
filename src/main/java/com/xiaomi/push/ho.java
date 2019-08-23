package com.xiaomi.push;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ho {

    /* renamed from: a  reason: collision with root package name */
    private static ho f82194a;

    /* renamed from: a  reason: collision with other field name */
    private Map<String, Object> f499a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private Map<String, Object> f82195b = new ConcurrentHashMap();

    private ho() {
        a();
    }

    public static ho a() {
        ho hoVar;
        synchronized (ho.class) {
            try {
                if (f82194a == null) {
                    f82194a = new ho();
                }
                hoVar = f82194a;
            } catch (Throwable th) {
                Class<ho> cls = ho.class;
                throw th;
            }
        }
        return hoVar;
    }

    private String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(str);
        sb.append("/>");
        if (str != null) {
            sb.append("<");
            sb.append(str2);
            sb.append("/>");
        }
        return sb.toString();
    }

    /* renamed from: a  reason: collision with other method in class */
    private ClassLoader[] m372a() {
        ClassLoader[] classLoaderArr = {ho.class.getClassLoader(), Thread.currentThread().getContextClassLoader()};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            ClassLoader classLoader = classLoaderArr[i];
            if (classLoader != null) {
                arrayList.add(classLoader);
            }
        }
        return (ClassLoader[]) arrayList.toArray(new ClassLoader[arrayList.size()]);
    }

    /* renamed from: a  reason: collision with other method in class */
    public Object m373a(String str, String str2) {
        return this.f499a.get(a(str, str2));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:13|(3:15|(2:17|(3:19|20|(1:22)(2:24|(1:26))))(3:27|28|(2:30|(3:32|33|(1:35)(2:36|(1:38)))))|23)|39|40) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00f8 */
    /* renamed from: a  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m374a() {
        /*
            r10 = this;
            java.lang.ClassLoader[] r0 = r10.a()     // Catch:{ Exception -> 0x00fd }
            int r1 = r0.length     // Catch:{ Exception -> 0x00fd }
            r2 = 0
        L_0x0006:
            if (r2 >= r1) goto L_0x00fd
            r3 = r0[r2]     // Catch:{ Exception -> 0x00fd }
            java.lang.String r4 = "META-INF/smack.providers"
            java.util.Enumeration r3 = r3.getResources(r4)     // Catch:{ Exception -> 0x00fd }
        L_0x0010:
            boolean r4 = r3.hasMoreElements()     // Catch:{ Exception -> 0x00fd }
            if (r4 == 0) goto L_0x00f9
            java.lang.Object r4 = r3.nextElement()     // Catch:{ Exception -> 0x00fd }
            java.net.URL r4 = (java.net.URL) r4     // Catch:{ Exception -> 0x00fd }
            r5 = 0
            java.io.InputStream r4 = r4.openStream()     // Catch:{ all -> 0x00f3 }
            org.xmlpull.v1.XmlPullParserFactory r5 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch:{ all -> 0x00f1 }
            org.xmlpull.v1.XmlPullParser r5 = r5.newPullParser()     // Catch:{ all -> 0x00f1 }
            java.lang.String r6 = "http://xmlpull.org/v1/doc/features.html#process-namespaces"
            r7 = 1
            r5.setFeature(r6, r7)     // Catch:{ all -> 0x00f1 }
            java.lang.String r6 = "UTF-8"
            r5.setInput(r4, r6)     // Catch:{ all -> 0x00f1 }
            int r6 = r5.getEventType()     // Catch:{ all -> 0x00f1 }
        L_0x0038:
            r8 = 2
            if (r6 != r8) goto L_0x00e6
            java.lang.String r6 = r5.getName()     // Catch:{ all -> 0x00f1 }
            java.lang.String r8 = "iqProvider"
            boolean r6 = r6.equals(r8)     // Catch:{ all -> 0x00f1 }
            if (r6 == 0) goto L_0x0092
            r5.next()     // Catch:{ all -> 0x00f1 }
            r5.next()     // Catch:{ all -> 0x00f1 }
            java.lang.String r6 = r5.nextText()     // Catch:{ all -> 0x00f1 }
            r5.next()     // Catch:{ all -> 0x00f1 }
            r5.next()     // Catch:{ all -> 0x00f1 }
            java.lang.String r8 = r5.nextText()     // Catch:{ all -> 0x00f1 }
            r5.next()     // Catch:{ all -> 0x00f1 }
            r5.next()     // Catch:{ all -> 0x00f1 }
            java.lang.String r9 = r5.nextText()     // Catch:{ all -> 0x00f1 }
            java.lang.String r6 = r10.a((java.lang.String) r6, (java.lang.String) r8)     // Catch:{ all -> 0x00f1 }
            java.util.Map<java.lang.String, java.lang.Object> r8 = r10.f82195b     // Catch:{ all -> 0x00f1 }
            boolean r8 = r8.containsKey(r6)     // Catch:{ all -> 0x00f1 }
            if (r8 != 0) goto L_0x00e6
            java.lang.Class r8 = java.lang.Class.forName(r9)     // Catch:{ ClassNotFoundException -> 0x00e6 }
            java.lang.Class<com.xiaomi.push.hm> r9 = com.xiaomi.push.hm.class
            boolean r9 = r9.isAssignableFrom(r8)     // Catch:{ ClassNotFoundException -> 0x00e6 }
            if (r9 == 0) goto L_0x0087
            java.util.Map<java.lang.String, java.lang.Object> r9 = r10.f82195b     // Catch:{ ClassNotFoundException -> 0x00e6 }
            java.lang.Object r8 = r8.newInstance()     // Catch:{ ClassNotFoundException -> 0x00e6 }
        L_0x0083:
            r9.put(r6, r8)     // Catch:{ ClassNotFoundException -> 0x00e6 }
            goto L_0x00e6
        L_0x0087:
            java.lang.Class<com.xiaomi.push.hf> r9 = com.xiaomi.push.hf.class
            boolean r9 = r9.isAssignableFrom(r8)     // Catch:{ ClassNotFoundException -> 0x00e6 }
            if (r9 == 0) goto L_0x00e6
            java.util.Map<java.lang.String, java.lang.Object> r9 = r10.f82195b     // Catch:{ ClassNotFoundException -> 0x00e6 }
            goto L_0x0083
        L_0x0092:
            java.lang.String r6 = r5.getName()     // Catch:{ all -> 0x00f1 }
            java.lang.String r8 = "extensionProvider"
            boolean r6 = r6.equals(r8)     // Catch:{ all -> 0x00f1 }
            if (r6 == 0) goto L_0x00e6
            r5.next()     // Catch:{ all -> 0x00f1 }
            r5.next()     // Catch:{ all -> 0x00f1 }
            java.lang.String r6 = r5.nextText()     // Catch:{ all -> 0x00f1 }
            r5.next()     // Catch:{ all -> 0x00f1 }
            r5.next()     // Catch:{ all -> 0x00f1 }
            java.lang.String r8 = r5.nextText()     // Catch:{ all -> 0x00f1 }
            r5.next()     // Catch:{ all -> 0x00f1 }
            r5.next()     // Catch:{ all -> 0x00f1 }
            java.lang.String r9 = r5.nextText()     // Catch:{ all -> 0x00f1 }
            java.lang.String r6 = r10.a((java.lang.String) r6, (java.lang.String) r8)     // Catch:{ all -> 0x00f1 }
            java.util.Map<java.lang.String, java.lang.Object> r8 = r10.f499a     // Catch:{ all -> 0x00f1 }
            boolean r8 = r8.containsKey(r6)     // Catch:{ all -> 0x00f1 }
            if (r8 != 0) goto L_0x00e6
            java.lang.Class r8 = java.lang.Class.forName(r9)     // Catch:{ ClassNotFoundException -> 0x00e6 }
            java.lang.Class<com.xiaomi.push.hn> r9 = com.xiaomi.push.hn.class
            boolean r9 = r9.isAssignableFrom(r8)     // Catch:{ ClassNotFoundException -> 0x00e6 }
            if (r9 == 0) goto L_0x00db
            java.util.Map<java.lang.String, java.lang.Object> r9 = r10.f499a     // Catch:{ ClassNotFoundException -> 0x00e6 }
            java.lang.Object r8 = r8.newInstance()     // Catch:{ ClassNotFoundException -> 0x00e6 }
            goto L_0x0083
        L_0x00db:
            java.lang.Class<com.xiaomi.push.hi> r9 = com.xiaomi.push.hi.class
            boolean r9 = r9.isAssignableFrom(r8)     // Catch:{ ClassNotFoundException -> 0x00e6 }
            if (r9 == 0) goto L_0x00e6
            java.util.Map<java.lang.String, java.lang.Object> r9 = r10.f499a     // Catch:{ ClassNotFoundException -> 0x00e6 }
            goto L_0x0083
        L_0x00e6:
            int r6 = r5.next()     // Catch:{ all -> 0x00f1 }
            if (r6 != r7) goto L_0x0038
            r4.close()     // Catch:{ Exception -> 0x0010 }
            goto L_0x0010
        L_0x00f1:
            r0 = move-exception
            goto L_0x00f5
        L_0x00f3:
            r0 = move-exception
            r4 = r5
        L_0x00f5:
            r4.close()     // Catch:{ Exception -> 0x00f8 }
        L_0x00f8:
            throw r0     // Catch:{ Exception -> 0x00fd }
        L_0x00f9:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x00fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.ho.m374a():void");
    }

    public void a(String str, String str2, Object obj) {
        if ((obj instanceof hn) || (obj instanceof Class)) {
            this.f499a.put(a(str, str2), obj);
            return;
        }
        throw new IllegalArgumentException("Provider must be a PacketExtensionProvider or a Class instance.");
    }
}
