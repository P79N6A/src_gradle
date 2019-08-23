package com.xiaomi.push;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Vector;
import org.xmlpull.v1.XmlPullParser;

public final class gw {

    /* renamed from: a  reason: collision with root package name */
    private static int f82128a = 5000;

    /* renamed from: a  reason: collision with other field name */
    private static Vector<String> f471a = new Vector<>();

    /* renamed from: b  reason: collision with root package name */
    private static int f82129b = 330000;

    /* renamed from: c  reason: collision with root package name */
    private static int f82130c = 600000;

    /* renamed from: d  reason: collision with root package name */
    private static int f82131d = 330000;

    /* JADX WARNING: Can't wrap try/catch for region: R(5:32|35|36|37|38) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0097 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00a3 */
    static {
        /*
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            f471a = r0
            java.lang.ClassLoader[] r0 = a()     // Catch:{ Exception -> 0x00aa }
            int r1 = r0.length     // Catch:{ Exception -> 0x00aa }
            r2 = 0
        L_0x000d:
            if (r2 >= r1) goto L_0x00aa
            r3 = r0[r2]     // Catch:{ Exception -> 0x00aa }
            java.lang.String r4 = "META-INF/smack-config.xml"
            java.util.Enumeration r3 = r3.getResources(r4)     // Catch:{ Exception -> 0x00aa }
        L_0x0017:
            boolean r4 = r3.hasMoreElements()     // Catch:{ Exception -> 0x00aa }
            if (r4 == 0) goto L_0x00a6
            java.lang.Object r4 = r3.nextElement()     // Catch:{ Exception -> 0x00aa }
            java.net.URL r4 = (java.net.URL) r4     // Catch:{ Exception -> 0x00aa }
            r5 = 0
            java.io.InputStream r4 = r4.openStream()     // Catch:{ Exception -> 0x00a4, all -> 0x009e }
            org.xmlpull.v1.XmlPullParserFactory r5 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch:{ Exception -> 0x0097, all -> 0x009c }
            org.xmlpull.v1.XmlPullParser r5 = r5.newPullParser()     // Catch:{ Exception -> 0x0097, all -> 0x009c }
            java.lang.String r6 = "http://xmlpull.org/v1/doc/features.html#process-namespaces"
            r7 = 1
            r5.setFeature(r6, r7)     // Catch:{ Exception -> 0x0097, all -> 0x009c }
            java.lang.String r6 = "UTF-8"
            r5.setInput(r4, r6)     // Catch:{ Exception -> 0x0097, all -> 0x009c }
            int r6 = r5.getEventType()     // Catch:{ Exception -> 0x0097, all -> 0x009c }
        L_0x003f:
            r8 = 2
            if (r6 != r8) goto L_0x0091
            java.lang.String r6 = r5.getName()     // Catch:{ Exception -> 0x0097, all -> 0x009c }
            java.lang.String r8 = "className"
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x0097, all -> 0x009c }
            if (r6 == 0) goto L_0x0052
            a(r5)     // Catch:{ Exception -> 0x0097, all -> 0x009c }
            goto L_0x0091
        L_0x0052:
            java.lang.String r6 = r5.getName()     // Catch:{ Exception -> 0x0097, all -> 0x009c }
            java.lang.String r8 = "packetReplyTimeout"
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x0097, all -> 0x009c }
            if (r6 == 0) goto L_0x0067
            int r6 = f82128a     // Catch:{ Exception -> 0x0097, all -> 0x009c }
            int r6 = a(r5, r6)     // Catch:{ Exception -> 0x0097, all -> 0x009c }
            f82128a = r6     // Catch:{ Exception -> 0x0097, all -> 0x009c }
            goto L_0x0091
        L_0x0067:
            java.lang.String r6 = r5.getName()     // Catch:{ Exception -> 0x0097, all -> 0x009c }
            java.lang.String r8 = "keepAliveInterval"
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x0097, all -> 0x009c }
            if (r6 == 0) goto L_0x007c
            int r6 = f82129b     // Catch:{ Exception -> 0x0097, all -> 0x009c }
            int r6 = a(r5, r6)     // Catch:{ Exception -> 0x0097, all -> 0x009c }
            f82129b = r6     // Catch:{ Exception -> 0x0097, all -> 0x009c }
            goto L_0x0091
        L_0x007c:
            java.lang.String r6 = r5.getName()     // Catch:{ Exception -> 0x0097, all -> 0x009c }
            java.lang.String r8 = "mechName"
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x0097, all -> 0x009c }
            if (r6 == 0) goto L_0x0091
            java.util.Vector<java.lang.String> r6 = f471a     // Catch:{ Exception -> 0x0097, all -> 0x009c }
            java.lang.String r8 = r5.nextText()     // Catch:{ Exception -> 0x0097, all -> 0x009c }
            r6.add(r8)     // Catch:{ Exception -> 0x0097, all -> 0x009c }
        L_0x0091:
            int r6 = r5.next()     // Catch:{ Exception -> 0x0097, all -> 0x009c }
            if (r6 != r7) goto L_0x003f
        L_0x0097:
            r4.close()     // Catch:{ Exception -> 0x0017 }
            goto L_0x0017
        L_0x009c:
            r0 = move-exception
            goto L_0x00a0
        L_0x009e:
            r0 = move-exception
            r4 = r5
        L_0x00a0:
            r4.close()     // Catch:{ Exception -> 0x00a3 }
        L_0x00a3:
            throw r0     // Catch:{ Exception -> 0x00aa }
        L_0x00a4:
            r4 = r5
            goto L_0x0097
        L_0x00a6:
            int r2 = r2 + 1
            goto L_0x000d
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.gw.<clinit>():void");
    }

    private gw() {
    }

    public static int a() {
        return f82129b;
    }

    private static int a(XmlPullParser xmlPullParser, int i) {
        try {
            return Integer.parseInt(xmlPullParser.nextText());
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static String m353a() {
        return "3.1.0";
    }

    private static void a(XmlPullParser xmlPullParser) {
        String nextText = xmlPullParser.nextText();
        try {
            Class.forName(nextText);
        } catch (ClassNotFoundException unused) {
            PrintStream printStream = System.err;
            printStream.println("Error! A startup class specified in smack-config.xml could not be loaded: " + nextText);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    private static ClassLoader[] m354a() {
        ClassLoader[] classLoaderArr = {gw.class.getClassLoader(), Thread.currentThread().getContextClassLoader()};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            ClassLoader classLoader = classLoaderArr[i];
            if (classLoader != null) {
                arrayList.add(classLoader);
            }
        }
        return (ClassLoader[]) arrayList.toArray(new ClassLoader[arrayList.size()]);
    }

    public static int b() {
        return f82130c;
    }
}
