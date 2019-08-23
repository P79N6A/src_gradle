package com.ss.android.ugc.aweme.main;

import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.experiencekit.b;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class bl {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54598a;

    /* renamed from: b  reason: collision with root package name */
    static List<String> f54599b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private static a f54600c;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        String f54601a;

        /* renamed from: b  reason: collision with root package name */
        String f54602b;

        /* renamed from: c  reason: collision with root package name */
        long f54603c;

        /* renamed from: d  reason: collision with root package name */
        long f54604d;

        /* renamed from: e  reason: collision with root package name */
        boolean f54605e;

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
        if (r0.equals("FOLLOW") == false) goto L_0x007c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.lang.String r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f54598a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = 0
            r5 = 1
            r6 = 57588(0xe0f4, float:8.0698E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f54598a
            r13 = 1
            r14 = 57588(0xe0f4, float:8.0698E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0037:
            if (r0 != 0) goto L_0x003b
            r0 = 0
            return r0
        L_0x003b:
            r2 = -1
            int r3 = r17.hashCode()
            r4 = -1382453013(0xffffffffad9970eb, float:-1.7444232E-11)
            if (r3 == r4) goto L_0x0072
            r4 = 2223327(0x21ecdf, float:3.115545E-39)
            if (r3 == r4) goto L_0x0068
            r4 = 2614219(0x27e3cb, float:3.663301E-39)
            if (r3 == r4) goto L_0x005e
            r4 = 2079338417(0x7bf02fb1, float:2.4942371E36)
            if (r3 == r4) goto L_0x0055
            goto L_0x007c
        L_0x0055:
            java.lang.String r3 = "FOLLOW"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x007c
            goto L_0x007d
        L_0x005e:
            java.lang.String r1 = "USER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007c
            r1 = 3
            goto L_0x007d
        L_0x0068:
            java.lang.String r1 = "HOME"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007c
            r1 = 0
            goto L_0x007d
        L_0x0072:
            java.lang.String r1 = "NOTIFICATION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007c
            r1 = 2
            goto L_0x007d
        L_0x007c:
            r1 = -1
        L_0x007d:
            switch(r1) {
                case 0: goto L_0x008c;
                case 1: goto L_0x0089;
                case 2: goto L_0x0086;
                case 3: goto L_0x0083;
                default: goto L_0x0080;
            }
        L_0x0080:
            java.lang.String r0 = ""
            return r0
        L_0x0083:
            java.lang.String r0 = "personal_homepage"
            return r0
        L_0x0086:
            java.lang.String r0 = "message"
            return r0
        L_0x0089:
            java.lang.String r0 = "homepage_follow"
            return r0
        L_0x008c:
            java.lang.String r0 = "homepage_hot"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.bl.a(java.lang.String):java.lang.String");
    }

    private static void a(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, null, f54598a, true, 57589, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, null, f54598a, true, 57589, new Class[]{a.class}, Void.TYPE);
        } else if (aVar2 != null) {
            r.a("change_page_tab", (Map) d.a().a("is_first", aVar2.f54605e ? 1 : 0).a("loading_time", aVar2.f54604d - aVar2.f54603c).a("enter_from", aVar2.f54602b).a("previous_page", aVar2.f54601a).f34114b);
        }
    }

    private static void a(com.ss.android.experiencekit.c.d dVar, String str) {
        com.ss.android.experiencekit.c.d dVar2 = dVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{dVar2, str2}, null, f54598a, true, 57587, new Class[]{com.ss.android.experiencekit.c.d.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2, str2}, null, f54598a, true, 57587, new Class[]{com.ss.android.experiencekit.c.d.class, String.class}, Void.TYPE);
        } else if (dVar2 == com.ss.android.experiencekit.c.d.BEGIN) {
            a aVar = new a((byte) 0);
            f54600c = aVar;
            aVar.f54601a = a(str);
            f54600c.f54603c = SystemClock.elapsedRealtime();
        } else {
            boolean z = !f54599b.contains(str2);
            if (z) {
                f54599b.add(str2);
            }
            if (f54600c != null) {
                f54600c.f54602b = a(str);
                f54600c.f54604d = SystemClock.elapsedRealtime();
                f54600c.f54605e = z;
                a(f54600c);
                f54600c = null;
            }
        }
    }

    public static void a(com.ss.android.experiencekit.c.d dVar, String str, String str2) {
        com.ss.android.experiencekit.c.d dVar2 = dVar;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{dVar2, str3, str4}, null, f54598a, true, 57586, new Class[]{com.ss.android.experiencekit.c.d.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2, str3, str4}, null, f54598a, true, 57586, new Class[]{com.ss.android.experiencekit.c.d.class, String.class, String.class}, Void.TYPE);
            return;
        }
        a(dVar2, str4);
        b.b().a(com.ss.android.experiencekit.c.a.j, dVar2, str3, str4);
    }
}
