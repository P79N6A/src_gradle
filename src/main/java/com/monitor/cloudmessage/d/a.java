package com.monitor.cloudmessage.d;

import android.text.TextUtils;
import com.monitor.cloudmessage.d.b.b;
import com.taobao.android.dexposed.ClassUtils;
import java.util.ArrayList;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static ArrayList<com.monitor.cloudmessage.d.b.a> f27342a = new ArrayList<>();

    public static void a(b bVar) {
        if (!TextUtils.isEmpty(bVar.k)) {
            com.monitor.cloudmessage.d.c.a.a(bVar);
        }
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(ClassUtils.PACKAGE_SEPARATOR);
        if (lastIndexOf == -1) {
            return str + ".zip";
        }
        return str.substring(0, lastIndexOf) + ".zip";
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.monitor.cloudmessage.d.b.a r8) {
        /*
            com.monitor.cloudmessage.d.a.a r0 = r8.f27344b
            if (r0 == 0) goto L_0x0135
            com.monitor.cloudmessage.d.a.a r0 = r8.f27344b
            java.util.List r0 = r0.b()
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0012
            goto L_0x0135
        L_0x0012:
            boolean r0 = r8.j
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001a
        L_0x0018:
            r0 = 0
            goto L_0x003b
        L_0x001a:
            boolean r0 = r8.f27345c
            if (r0 != 0) goto L_0x002c
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r8.i
            long r3 = r3 - r5
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x002c
            goto L_0x0018
        L_0x002c:
            com.monitor.cloudmessage.a.a()
            android.content.Context r0 = com.monitor.cloudmessage.a.b()
            boolean r0 = com.monitor.cloudmessage.e.d.b(r0)
            if (r0 != 0) goto L_0x003a
            goto L_0x0018
        L_0x003a:
            r0 = 1
        L_0x003b:
            if (r0 != 0) goto L_0x003e
            return
        L_0x003e:
            boolean r0 = r8.f27346d
            if (r0 != 0) goto L_0x004c
            com.monitor.cloudmessage.d.a.a r0 = r8.f27344b
            java.util.List r0 = r0.b()
            r8.h = r0
            goto L_0x0105
        L_0x004c:
            com.monitor.cloudmessage.d.a.a r0 = r8.f27344b
            java.util.List r0 = r0.b()
            int r0 = r0.size()
            if (r0 == r1) goto L_0x00ad
            boolean r0 = r8.f27347e
            if (r0 == 0) goto L_0x005d
            goto L_0x00ad
        L_0x005d:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.monitor.cloudmessage.d.a.a r3 = r8.f27344b
            java.util.List r3 = r3.b()
            java.util.Iterator r3 = r3.iterator()
        L_0x006c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00aa
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.io.File r5 = new java.io.File
            r5.<init>(r4)
            java.io.File r6 = new java.io.File
            java.lang.String r7 = r5.getParent()
            java.lang.String r5 = r5.getName()
            java.lang.String r5 = a((java.lang.String) r5)
            r6.<init>(r7, r5)
            boolean r5 = r6.exists()
            if (r5 == 0) goto L_0x0097
            r6.delete()
        L_0x0097:
            java.lang.String r5 = r6.getAbsolutePath()
            java.lang.String[] r7 = new java.lang.String[r1]
            r7[r2] = r4
            com.monitor.cloudmessage.e.b.a((java.lang.String) r5, (java.lang.String[]) r7)
            java.lang.String r4 = r6.getAbsolutePath()
            r0.add(r4)
            goto L_0x006c
        L_0x00aa:
            r8.h = r0
            goto L_0x0105
        L_0x00ad:
            java.io.File r0 = new java.io.File
            com.monitor.cloudmessage.d.a.a r3 = r8.f27344b
            java.util.List r3 = r3.b()
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r0.<init>(r2)
            java.io.File r2 = new java.io.File
            java.lang.String r3 = r0.getParent()
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = a((java.lang.String) r0)
            r2.<init>(r3, r0)
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x00d8
            r2.delete()
        L_0x00d8:
            com.monitor.cloudmessage.d.a.a r0 = r8.f27344b
            java.util.List r0 = r0.b()
            int r0 = r0.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            com.monitor.cloudmessage.d.a.a r3 = r8.f27344b
            java.util.List r3 = r3.b()
            java.lang.Object[] r0 = r3.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.lang.String r3 = r2.getAbsolutePath()
            com.monitor.cloudmessage.e.b.a((java.lang.String) r3, (java.lang.String[]) r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            java.lang.String r1 = r2.getAbsolutePath()
            r0.add(r1)
            r8.h = r0
        L_0x0105:
            boolean r0 = com.monitor.cloudmessage.d.c.a.a((com.monitor.cloudmessage.d.b.a) r8)
            boolean r1 = r8.f27348f
            if (r1 == 0) goto L_0x0134
            if (r0 == 0) goto L_0x0134
            com.monitor.cloudmessage.d.a.a r8 = r8.f27344b
            java.util.List r8 = r8.b()
            java.util.Iterator r8 = r8.iterator()
        L_0x0119:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0134
            java.lang.Object r0 = r8.next()
            java.lang.String r0 = (java.lang.String) r0
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0119
            r1.delete()
            goto L_0x0119
        L_0x0134:
            return
        L_0x0135:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.monitor.cloudmessage.d.a.a(com.monitor.cloudmessage.d.b.a):void");
    }
}
