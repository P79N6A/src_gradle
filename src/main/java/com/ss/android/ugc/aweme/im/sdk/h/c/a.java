package com.ss.android.ugc.aweme.im.sdk.h.c;

import android.content.ContentValues;
import android.database.Cursor;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.h.a.b;
import com.ss.android.ugc.aweme.im.sdk.utils.l;
import com.ss.android.ugc.aweme.im.sdk.utils.m;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.List;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51684a;

    /* renamed from: b  reason: collision with root package name */
    private static a f51685b;

    public static String c() {
        return "SIMPLE_USER";
    }

    public final boolean a(IMUser iMUser) {
        if (PatchProxy.isSupport(new Object[]{iMUser}, this, f51684a, false, 53259, new Class[]{IMUser.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{iMUser}, this, f51684a, false, 53259, new Class[]{IMUser.class}, Boolean.TYPE)).booleanValue();
        } else if (iMUser == null || IMUser.isInvalidUser(iMUser.getUid())) {
            return false;
        } else {
            b(iMUser);
            return b.a().a("SIMPLE_USER", (String) null, c(iMUser)) > 0;
        }
    }

    public static String d() {
        if (PatchProxy.isSupport(new Object[0], null, f51684a, true, 53255, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f51684a, true, 53255, new Class[0], String.class);
        }
        return com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_FOLLOW_STATUS.key + " == 2";
    }

    public static String e() {
        if (PatchProxy.isSupport(new Object[0], null, f51684a, true, 53257, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f51684a, true, 53257, new Class[0], String.class);
        }
        return com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_FOLLOW_STATUS.key + " != 0";
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f51684a, false, 53264, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51684a, false, 53264, new Class[0], Void.TYPE);
            return;
        }
        b.a().a("SIMPLE_USER", (String) null, (String[]) null);
    }

    public static a a() {
        if (PatchProxy.isSupport(new Object[0], null, f51684a, true, 53253, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f51684a, true, 53253, new Class[0], a.class);
        }
        if (f51685b == null) {
            synchronized (a.class) {
                if (f51685b == null) {
                    f51685b = new a();
                }
            }
        }
        return f51685b;
    }

    public static String b() {
        if (PatchProxy.isSupport(new Object[0], null, f51684a, true, 53254, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f51684a, true, 53254, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists SIMPLE_USER (");
        for (com.ss.android.ugc.aweme.im.sdk.h.b.a aVar : com.ss.android.ugc.aweme.im.sdk.h.b.a.values()) {
            sb.append(aVar.key);
            sb.append(" ");
            sb.append(aVar.type);
            sb.append(",");
        }
        String sb2 = sb.toString();
        return sb2.substring(0, sb2.length() - 1) + ");";
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f51684a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r4 = 0
            r5 = 53265(0xd011, float:7.464E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002c
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f51684a
            r5 = 0
            r6 = 53265(0xd011, float:7.464E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x002c:
            r1 = 1
            r2 = 0
            java.lang.String r3 = "select * from SIMPLE_USER"
            com.ss.android.ugc.aweme.im.sdk.h.a.b r4 = com.ss.android.ugc.aweme.im.sdk.h.a.b.a()     // Catch:{ Exception -> 0x0059, all -> 0x0052 }
            android.database.Cursor r3 = r4.a(r3, r2)     // Catch:{ Exception -> 0x0059, all -> 0x0052 }
            if (r3 == 0) goto L_0x004c
            int r2 = r3.getCount()     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            if (r2 != 0) goto L_0x0041
            r0 = 1
        L_0x0041:
            if (r3 == 0) goto L_0x0046
            r3.close()
        L_0x0046:
            return r0
        L_0x0047:
            r0 = move-exception
            r2 = r3
            goto L_0x0053
        L_0x004a:
            r2 = r3
            goto L_0x0059
        L_0x004c:
            if (r3 == 0) goto L_0x005e
            r3.close()
            goto L_0x005e
        L_0x0052:
            r0 = move-exception
        L_0x0053:
            if (r2 == 0) goto L_0x0058
            r2.close()
        L_0x0058:
            throw r0
        L_0x0059:
            if (r2 == 0) goto L_0x005e
            r2.close()
        L_0x005e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.h.c.a.g():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> h() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f51684a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r4 = 0
            r5 = 53267(0xd013, float:7.4643E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f51684a
            r5 = 0
            r6 = 53267(0xd013, float:7.4643E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.util.List> r8 = java.util.List.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x0028:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0077, all -> 0x0070 }
            r2.<init>()     // Catch:{ Exception -> 0x0077, all -> 0x0070 }
            java.lang.String r3 = "select * from SIMPLE_USER"
            r2.append(r3)     // Catch:{ Exception -> 0x0077, all -> 0x0070 }
            java.lang.String r3 = " where "
            r2.append(r3)     // Catch:{ Exception -> 0x0077, all -> 0x0070 }
            com.ss.android.ugc.aweme.im.sdk.h.b.a r3 = com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_FOLLOW_STATUS     // Catch:{ Exception -> 0x0077, all -> 0x0070 }
            java.lang.String r3 = r3.key     // Catch:{ Exception -> 0x0077, all -> 0x0070 }
            r2.append(r3)     // Catch:{ Exception -> 0x0077, all -> 0x0070 }
            java.lang.String r3 = " != 0"
            r2.append(r3)     // Catch:{ Exception -> 0x0077, all -> 0x0070 }
            com.ss.android.ugc.aweme.im.sdk.h.a.b r3 = com.ss.android.ugc.aweme.im.sdk.h.a.b.a()     // Catch:{ Exception -> 0x0077, all -> 0x0070 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0077, all -> 0x0070 }
            android.database.Cursor r2 = r3.a(r2, r1)     // Catch:{ Exception -> 0x0077, all -> 0x0070 }
            if (r2 == 0) goto L_0x006a
        L_0x0057:
            boolean r1 = r2.moveToNext()     // Catch:{ Exception -> 0x0068, all -> 0x0065 }
            if (r1 == 0) goto L_0x006a
            com.ss.android.ugc.aweme.im.service.model.IMUser r1 = r9.a((android.database.Cursor) r2)     // Catch:{ Exception -> 0x0068, all -> 0x0065 }
            r0.add(r1)     // Catch:{ Exception -> 0x0068, all -> 0x0065 }
            goto L_0x0057
        L_0x0065:
            r0 = move-exception
            r1 = r2
            goto L_0x0071
        L_0x0068:
            r1 = r2
            goto L_0x0077
        L_0x006a:
            if (r2 == 0) goto L_0x007c
            r2.close()
            goto L_0x007c
        L_0x0070:
            r0 = move-exception
        L_0x0071:
            if (r1 == 0) goto L_0x0076
            r1.close()
        L_0x0076:
            throw r0
        L_0x0077:
            if (r1 == 0) goto L_0x007c
            r1.close()
        L_0x007c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.h.c.a.h():java.util.List");
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f51684a, false, 53263, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f51684a, false, 53263, new Class[]{String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            b a2 = b.a();
            a2.a("delete from SIMPLE_USER where " + com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_UID.key + " = " + str2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007c, code lost:
        if (r2 != null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008b, code lost:
        if (r2 == null) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008d, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0090, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.im.service.model.IMUser b(java.lang.String r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f51684a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMUser> r8 = com.ss.android.ugc.aweme.im.service.model.IMUser.class
            r5 = 0
            r6 = 53266(0xd012, float:7.4642E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0039
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f51684a
            r13 = 0
            r14 = 53266(0xd012, float:7.4642E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMUser> r16 = com.ss.android.ugc.aweme.im.service.model.IMUser.class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = (com.ss.android.ugc.aweme.im.service.model.IMUser) r0
            return r0
        L_0x0039:
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0088, all -> 0x007f }
            java.lang.String r3 = "select * from SIMPLE_USER where "
            r2.<init>(r3)     // Catch:{ Exception -> 0x0088, all -> 0x007f }
            com.ss.android.ugc.aweme.im.sdk.h.b.a r3 = com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_UID     // Catch:{ Exception -> 0x0088, all -> 0x007f }
            java.lang.String r3 = r3.key     // Catch:{ Exception -> 0x0088, all -> 0x007f }
            r2.append(r3)     // Catch:{ Exception -> 0x0088, all -> 0x007f }
            java.lang.String r3 = " = "
            r2.append(r3)     // Catch:{ Exception -> 0x0088, all -> 0x007f }
            r2.append(r0)     // Catch:{ Exception -> 0x0088, all -> 0x007f }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0088, all -> 0x007f }
            com.ss.android.ugc.aweme.im.sdk.h.a.b r2 = com.ss.android.ugc.aweme.im.sdk.h.a.b.a()     // Catch:{ Exception -> 0x0088, all -> 0x007f }
            android.database.Cursor r2 = r2.a(r0, r1)     // Catch:{ Exception -> 0x0088, all -> 0x007f }
            if (r2 == 0) goto L_0x007a
            boolean r0 = r2.moveToNext()     // Catch:{ Exception -> 0x0077, all -> 0x0072 }
            if (r0 == 0) goto L_0x007a
            r3 = r17
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = r3.a((android.database.Cursor) r2)     // Catch:{ Exception -> 0x008b, all -> 0x0070 }
            if (r2 == 0) goto L_0x006f
            r2.close()
        L_0x006f:
            return r0
        L_0x0070:
            r0 = move-exception
            goto L_0x0075
        L_0x0072:
            r0 = move-exception
            r3 = r17
        L_0x0075:
            r1 = r2
            goto L_0x0082
        L_0x0077:
            r3 = r17
            goto L_0x008b
        L_0x007a:
            r3 = r17
            if (r2 == 0) goto L_0x0090
            goto L_0x008d
        L_0x007f:
            r0 = move-exception
            r3 = r17
        L_0x0082:
            if (r1 == 0) goto L_0x0087
            r1.close()
        L_0x0087:
            throw r0
        L_0x0088:
            r3 = r17
            r2 = r1
        L_0x008b:
            if (r2 == 0) goto L_0x0090
        L_0x008d:
            r2.close()
        L_0x0090:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.h.c.a.b(java.lang.String):com.ss.android.ugc.aweme.im.service.model.IMUser");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> c(java.lang.String r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f51684a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class<java.util.List> r8 = java.util.List.class
            r5 = 0
            r6 = 53268(0xd014, float:7.4644E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0039
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f51684a
            r13 = 0
            r14 = 53268(0xd014, float:7.4644E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class<java.util.List> r16 = java.util.List.class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x0039:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00af, all -> 0x00a6 }
            r3.<init>()     // Catch:{ Exception -> 0x00af, all -> 0x00a6 }
            java.lang.String r4 = "select * from SIMPLE_USER"
            r3.append(r4)     // Catch:{ Exception -> 0x00af, all -> 0x00a6 }
            java.lang.String r4 = " where "
            r3.append(r4)     // Catch:{ Exception -> 0x00af, all -> 0x00a6 }
            r3.append(r0)     // Catch:{ Exception -> 0x00af, all -> 0x00a6 }
            java.lang.String r0 = " and "
            r3.append(r0)     // Catch:{ Exception -> 0x00af, all -> 0x00a6 }
            com.ss.android.ugc.aweme.im.sdk.h.b.a r0 = com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_SORT_WEIGHT     // Catch:{ Exception -> 0x00af, all -> 0x00a6 }
            java.lang.String r0 = r0.key     // Catch:{ Exception -> 0x00af, all -> 0x00a6 }
            r3.append(r0)     // Catch:{ Exception -> 0x00af, all -> 0x00a6 }
            java.lang.String r0 = " is not null  and "
            r3.append(r0)     // Catch:{ Exception -> 0x00af, all -> 0x00a6 }
            com.ss.android.ugc.aweme.im.sdk.h.b.a r0 = com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_INITIAL_LETTER     // Catch:{ Exception -> 0x00af, all -> 0x00a6 }
            java.lang.String r0 = r0.key     // Catch:{ Exception -> 0x00af, all -> 0x00a6 }
            r3.append(r0)     // Catch:{ Exception -> 0x00af, all -> 0x00a6 }
            java.lang.String r0 = " is not null  order by "
            r3.append(r0)     // Catch:{ Exception -> 0x00af, all -> 0x00a6 }
            com.ss.android.ugc.aweme.im.sdk.h.b.a r0 = com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_SORT_WEIGHT     // Catch:{ Exception -> 0x00af, all -> 0x00a6 }
            java.lang.String r0 = r0.key     // Catch:{ Exception -> 0x00af, all -> 0x00a6 }
            r3.append(r0)     // Catch:{ Exception -> 0x00af, all -> 0x00a6 }
            com.ss.android.ugc.aweme.im.sdk.h.a.b r0 = com.ss.android.ugc.aweme.im.sdk.h.a.b.a()     // Catch:{ Exception -> 0x00af, all -> 0x00a6 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00af, all -> 0x00a6 }
            android.database.Cursor r3 = r0.a(r3, r2)     // Catch:{ Exception -> 0x00af, all -> 0x00a6 }
            if (r3 == 0) goto L_0x009e
        L_0x0083:
            boolean r0 = r3.moveToNext()     // Catch:{ Exception -> 0x009a, all -> 0x0095 }
            if (r0 == 0) goto L_0x009e
            r4 = r17
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = r4.a((android.database.Cursor) r3)     // Catch:{ Exception -> 0x009c, all -> 0x0093 }
            r1.add(r0)     // Catch:{ Exception -> 0x009c, all -> 0x0093 }
            goto L_0x0083
        L_0x0093:
            r0 = move-exception
            goto L_0x0098
        L_0x0095:
            r0 = move-exception
            r4 = r17
        L_0x0098:
            r2 = r3
            goto L_0x00a9
        L_0x009a:
            r4 = r17
        L_0x009c:
            r2 = r3
            goto L_0x00b1
        L_0x009e:
            r4 = r17
            if (r3 == 0) goto L_0x00b6
            r3.close()
            goto L_0x00b6
        L_0x00a6:
            r0 = move-exception
            r4 = r17
        L_0x00a9:
            if (r2 == 0) goto L_0x00ae
            r2.close()
        L_0x00ae:
            throw r0
        L_0x00af:
            r4 = r17
        L_0x00b1:
            if (r2 == 0) goto L_0x00b6
            r2.close()
        L_0x00b6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.h.c.a.c(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e5  */
    @android.support.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> d(java.lang.String r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f51684a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class<java.util.List> r8 = java.util.List.class
            r5 = 0
            r6 = 53269(0xd015, float:7.4646E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0039
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f51684a
            r13 = 0
            r14 = 53269(0xd015, float:7.4646E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class<java.util.List> r16 = java.util.List.class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x0039:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e1, all -> 0x00d8 }
            java.lang.String r4 = "select * from SIMPLE_USER where "
            r3.<init>(r4)     // Catch:{ Exception -> 0x00e1, all -> 0x00d8 }
            com.ss.android.ugc.aweme.im.sdk.h.b.a r4 = com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_FOLLOW_STATUS     // Catch:{ Exception -> 0x00e1, all -> 0x00d8 }
            java.lang.String r4 = r4.key     // Catch:{ Exception -> 0x00e1, all -> 0x00d8 }
            r3.append(r4)     // Catch:{ Exception -> 0x00e1, all -> 0x00d8 }
            java.lang.String r4 = " != 0"
            r3.append(r4)     // Catch:{ Exception -> 0x00e1, all -> 0x00d8 }
            java.lang.String r4 = " and ("
            r3.append(r4)     // Catch:{ Exception -> 0x00e1, all -> 0x00d8 }
            com.ss.android.ugc.aweme.im.sdk.h.b.a r4 = com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_REMARK_NAME     // Catch:{ Exception -> 0x00e1, all -> 0x00d8 }
            java.lang.String r4 = r4.key     // Catch:{ Exception -> 0x00e1, all -> 0x00d8 }
            r3.append(r4)     // Catch:{ Exception -> 0x00e1, all -> 0x00d8 }
            java.lang.String r4 = " like '%"
            r3.append(r4)     // Catch:{ Exception -> 0x00e1, all -> 0x00d8 }
            r3.append(r0)     // Catch:{ Exception -> 0x00e1, all -> 0x00d8 }
            java.lang.String r4 = "%' or "
            r3.append(r4)     // Catch:{ Exception -> 0x00e1, all -> 0x00d8 }
            com.ss.android.ugc.aweme.im.sdk.h.b.a r4 = com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_NICK_NAME     // Catch:{ Exception -> 0x00e1, all -> 0x00d8 }
            java.lang.String r4 = r4.key     // Catch:{ Exception -> 0x00e1, all -> 0x00d8 }
            r3.append(r4)     // Catch:{ Exception -> 0x00e1, all -> 0x00d8 }
            java.lang.String r4 = " like '%"
            r3.append(r4)     // Catch:{ Exception -> 0x00e1, all -> 0x00d8 }
            r3.append(r0)     // Catch:{ Exception -> 0x00e1, all -> 0x00d8 }
            java.lang.String r4 = "%' or "
            r3.append(r4)     // Catch:{ Exception -> 0x00e1, all -> 0x00d8 }
            com.ss.android.ugc.aweme.im.sdk.h.b.a r4 = com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_UID     // Catch:{ Exception -> 0x00e1, all -> 0x00d8 }
            java.lang.String r4 = r4.key     // Catch:{ Exception -> 0x00e1, all -> 0x00d8 }
            r3.append(r4)     // Catch:{ Exception -> 0x00e1, all -> 0x00d8 }
            java.lang.String r4 = " like '%"
            r3.append(r4)     // Catch:{ Exception -> 0x00e1, all -> 0x00d8 }
            r3.append(r0)     // Catch:{ Exception -> 0x00e1, all -> 0x00d8 }
            java.lang.String r4 = "%' or "
            r3.append(r4)     // Catch:{ Exception -> 0x00e1, all -> 0x00d8 }
            com.ss.android.ugc.aweme.im.sdk.h.b.a r4 = com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_UNIQUE_ID     // Catch:{ Exception -> 0x00e1, all -> 0x00d8 }
            java.lang.String r4 = r4.key     // Catch:{ Exception -> 0x00e1, all -> 0x00d8 }
            r3.append(r4)     // Catch:{ Exception -> 0x00e1, all -> 0x00d8 }
            java.lang.String r4 = " like '%"
            r3.append(r4)     // Catch:{ Exception -> 0x00e1, all -> 0x00d8 }
            r3.append(r0)     // Catch:{ Exception -> 0x00e1, all -> 0x00d8 }
            java.lang.String r0 = "%');"
            r3.append(r0)     // Catch:{ Exception -> 0x00e1, all -> 0x00d8 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x00e1, all -> 0x00d8 }
            com.ss.android.ugc.aweme.im.sdk.h.a.b r3 = com.ss.android.ugc.aweme.im.sdk.h.a.b.a()     // Catch:{ Exception -> 0x00e1, all -> 0x00d8 }
            android.database.Cursor r3 = r3.a(r0, r2)     // Catch:{ Exception -> 0x00e1, all -> 0x00d8 }
            if (r3 == 0) goto L_0x00d0
        L_0x00b5:
            boolean r0 = r3.moveToNext()     // Catch:{ Exception -> 0x00cc, all -> 0x00c7 }
            if (r0 == 0) goto L_0x00d0
            r4 = r17
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = r4.a((android.database.Cursor) r3)     // Catch:{ Exception -> 0x00ce, all -> 0x00c5 }
            r1.add(r0)     // Catch:{ Exception -> 0x00ce, all -> 0x00c5 }
            goto L_0x00b5
        L_0x00c5:
            r0 = move-exception
            goto L_0x00ca
        L_0x00c7:
            r0 = move-exception
            r4 = r17
        L_0x00ca:
            r2 = r3
            goto L_0x00db
        L_0x00cc:
            r4 = r17
        L_0x00ce:
            r2 = r3
            goto L_0x00e3
        L_0x00d0:
            r4 = r17
            if (r3 == 0) goto L_0x00e8
            r3.close()
            goto L_0x00e8
        L_0x00d8:
            r0 = move-exception
            r4 = r17
        L_0x00db:
            if (r2 == 0) goto L_0x00e0
            r2.close()
        L_0x00e0:
            throw r0
        L_0x00e1:
            r4 = r17
        L_0x00e3:
            if (r2 == 0) goto L_0x00e8
            r2.close()
        L_0x00e8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.h.c.a.d(java.lang.String):java.util.List");
    }

    private IMUser a(Cursor cursor) {
        Cursor cursor2 = cursor;
        if (PatchProxy.isSupport(new Object[]{cursor2}, this, f51684a, false, 53271, new Class[]{Cursor.class}, IMUser.class)) {
            return (IMUser) PatchProxy.accessDispatch(new Object[]{cursor2}, this, f51684a, false, 53271, new Class[]{Cursor.class}, IMUser.class);
        } else if (cursor2 == null) {
            return null;
        } else {
            IMUser iMUser = new IMUser();
            iMUser.setUid(cursor2.getString(cursor2.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_UID.key)));
            iMUser.setSecUid(cursor2.getString(cursor2.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_SEC_UID.key)));
            iMUser.setNickName(cursor2.getString(cursor2.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_NICK_NAME.key)));
            iMUser.setSignature(cursor2.getString(cursor2.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_SIGNATURE.key)));
            iMUser.setAvatarStr(cursor2.getString(cursor2.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_AVATAR_THUMB.key)));
            iMUser.setFollowStatus(cursor2.getInt(cursor2.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_FOLLOW_STATUS.key)));
            iMUser.setUniqueId(cursor2.getString(cursor2.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_UNIQUE_ID.key)));
            iMUser.setWeiboVerify(cursor2.getString(cursor2.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_WEIBO_VERIFY.key)));
            iMUser.setCustomVerify(cursor2.getString(cursor2.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_CUSTOM_VERIFY.key)));
            iMUser.setEnterpriseVerifyReason(cursor2.getString(cursor2.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_ENTERPRISE_VERIFY_REASON.key)));
            iMUser.setVerificationType(cursor2.getInt(cursor2.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_VERIFICATION_TYPE.key)));
            iMUser.setRemarkName(cursor2.getString(cursor2.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_REMARK_NAME.key)));
            iMUser.setSortWeight(cursor2.getString(cursor2.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_SORT_WEIGHT.key)));
            iMUser.setInitialLetter(cursor2.getString(cursor2.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_INITIAL_LETTER.key)));
            iMUser.setShortId(cursor2.getString(cursor2.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_SHORT_ID.key)));
            iMUser.setRemarkPinyin(cursor2.getString(cursor2.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_REMARK_PINYIN.key)));
            iMUser.setRemarkInitial(cursor2.getString(cursor2.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_REMARK_INITIAL.key)));
            iMUser.setNickNamePinyin(cursor2.getString(cursor2.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_NICK_NAME_PINYIN.key)));
            iMUser.setNickNameInitial(cursor2.getString(cursor2.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_NICK_NAME_INITIAL.key)));
            iMUser.setCommerceUserLevel(cursor2.getInt(cursor2.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_COMMERCE_USER_LEVEL.key)));
            iMUser.setContactName(cursor2.getString(cursor2.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_CONTACT_NAME.key)));
            iMUser.setContactNamePinyin(cursor2.getString(cursor2.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_CONTACT_NAME_PINYIN.key)));
            iMUser.setContactNameInitial(cursor2.getString(cursor2.getColumnIndex(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_CONTACT_NAME_INITIAL.key)));
            return iMUser;
        }
    }

    private ContentValues c(IMUser iMUser) {
        if (PatchProxy.isSupport(new Object[]{iMUser}, this, f51684a, false, 53272, new Class[]{IMUser.class}, ContentValues.class)) {
            return (ContentValues) PatchProxy.accessDispatch(new Object[]{iMUser}, this, f51684a, false, 53272, new Class[]{IMUser.class}, ContentValues.class);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_UID.key, iMUser.getUid());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_SEC_UID.key, iMUser.getSecUid());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_NICK_NAME.key, iMUser.getNickName());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_SIGNATURE.key, iMUser.getSignature());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_AVATAR_THUMB.key, iMUser.getAvatarStr());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_FOLLOW_STATUS.key, Integer.valueOf(iMUser.getFollowStatus()));
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_UNIQUE_ID.key, iMUser.getUniqueId());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_WEIBO_VERIFY.key, iMUser.getWeiboVerify());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_CUSTOM_VERIFY.key, iMUser.getCustomVerify());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_ENTERPRISE_VERIFY_REASON.key, iMUser.getEnterpriseVerifyReason());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_VERIFICATION_TYPE.key, Integer.valueOf(iMUser.getVerificationType()));
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_REMARK_NAME.key, iMUser.getRemarkName());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_SORT_WEIGHT.key, iMUser.getSortWeight());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_INITIAL_LETTER.key, iMUser.getInitialLetter());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_SHORT_ID.key, iMUser.getShortId());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_REMARK_PINYIN.key, iMUser.getRemarkPinyin());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_REMARK_INITIAL.key, iMUser.getRemarkInitial());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_NICK_NAME_PINYIN.key, iMUser.getNickNamePinyin());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_NICK_NAME_INITIAL.key, iMUser.getNickNameInitial());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_COMMERCE_USER_LEVEL.key, Integer.valueOf(iMUser.getCommerceUserLevel()));
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_CONTACT_NAME.key, iMUser.getContactName());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_CONTACT_NAME_PINYIN.key, iMUser.getContactNamePinyin());
        contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_CONTACT_NAME_INITIAL.key, iMUser.getContactNameInitial());
        return contentValues;
    }

    public final void b(@NonNull IMUser iMUser) {
        IMUser iMUser2 = iMUser;
        if (PatchProxy.isSupport(new Object[]{iMUser2}, this, f51684a, false, 53260, new Class[]{IMUser.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMUser2}, this, f51684a, false, 53260, new Class[]{IMUser.class}, Void.TYPE);
            return;
        }
        String c2 = com.ss.android.ugc.aweme.im.sdk.relations.a.a.c(iMUser.getDisplayName());
        iMUser2.setSortWeight(com.ss.android.ugc.aweme.im.sdk.relations.a.b.a().b(c2));
        iMUser2.setInitialLetter(com.ss.android.ugc.aweme.im.sdk.relations.a.b.a().a(c2));
        try {
            iMUser2.setAvatarStr(l.a(iMUser.getAvatarThumb()));
        } catch (Exception unused) {
        }
        if (!m.a()) {
            iMUser2.setRemarkPinyin(com.ss.android.ugc.aweme.im.sdk.relations.a.a.c(iMUser.getRemarkName()).toLowerCase());
            iMUser2.setRemarkInitial(com.ss.android.ugc.aweme.im.sdk.relations.a.a.b(iMUser.getRemarkName()).toLowerCase());
            iMUser2.setNickNamePinyin(com.ss.android.ugc.aweme.im.sdk.relations.a.a.c(iMUser.getNickName()).toLowerCase());
            iMUser2.setNickNameInitial(com.ss.android.ugc.aweme.im.sdk.relations.a.a.b(iMUser.getNickName()).toLowerCase());
            iMUser2.setContactNamePinyin(com.ss.android.ugc.aweme.im.sdk.relations.a.a.c(iMUser.getContactName()).toLowerCase());
            iMUser2.setContactNameInitial(com.ss.android.ugc.aweme.im.sdk.relations.a.a.b(iMUser.getContactName()).toLowerCase());
        }
    }

    public final void b(List<IMUser> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f51684a, false, 53261, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f51684a, false, 53261, new Class[]{List.class}, Void.TYPE);
        } else if (!list.isEmpty()) {
            b.a().b();
            for (IMUser next : list) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_UID.key, next.getUid());
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_SEC_UID.key, next.getSecUid());
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_NICK_NAME.key, next.getNickName());
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_SIGNATURE.key, next.getSignature());
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_FOLLOW_STATUS.key, Integer.valueOf(next.getFollowStatus()));
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_UNIQUE_ID.key, next.getUniqueId());
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_WEIBO_VERIFY.key, next.getWeiboVerify());
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_CUSTOM_VERIFY.key, next.getCustomVerify());
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_ENTERPRISE_VERIFY_REASON.key, next.getEnterpriseVerifyReason());
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_VERIFICATION_TYPE.key, Integer.valueOf(next.getVerificationType()));
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_REMARK_NAME.key, next.getRemarkName());
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_COMMERCE_USER_LEVEL.key, Integer.valueOf(next.getCommerceUserLevel()));
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_CONTACT_NAME.key, next.getContactName());
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_CONTACT_NAME_PINYIN.key, next.getContactNamePinyin());
                contentValues.put(com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_CONTACT_NAME_INITIAL.key, next.getContactNameInitial());
                b a2 = b.a();
                a2.a("SIMPLE_USER", contentValues, com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_UID.key + "=?", new String[]{next.getUid()});
            }
            b.a().c();
        }
    }

    public final void a(List<IMUser> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f51684a, false, 53258, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f51684a, false, 53258, new Class[]{List.class}, Void.TYPE);
        } else if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                b(list.get(i));
            }
            b.a().b();
            for (IMUser next : list) {
                if (next != null && !IMUser.isInvalidUser(next.getUid())) {
                    b.a().a("SIMPLE_USER", (String) null, c(next));
                }
            }
            b.a().c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0101, code lost:
        if (r1 != null) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0110, code lost:
        if (r1 != null) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0112, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0115, code lost:
        return r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> a(java.util.List<java.lang.String> r24, int r25, int r26, java.lang.String r27) {
        /*
            r23 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = 4
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r12 = 0
            r5[r12] = r0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r25)
            r13 = 1
            r5[r13] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r26)
            r14 = 2
            r5[r14] = r6
            r15 = 3
            r5[r15] = r3
            com.meituan.robust.ChangeQuickRedirect r7 = f51684a
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r10[r12] = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            r10[r13] = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            r10[r14] = r6
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r10[r15] = r6
            java.lang.Class<java.util.List> r11 = java.util.List.class
            r8 = 0
            r9 = 53270(0xd016, float:7.4647E-41)
            r6 = r23
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r5 == 0) goto L_0x007b
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r12] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r25)
            r5[r13] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r26)
            r5[r14] = r0
            r5[r15] = r3
            com.meituan.robust.ChangeQuickRedirect r18 = f51684a
            r19 = 0
            r20 = 53270(0xd016, float:7.4647E-41)
            java.lang.Class[] r0 = new java.lang.Class[r4]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r0[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r14] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r15] = r1
            java.lang.Class<java.util.List> r22 = java.util.List.class
            r16 = r5
            r17 = r23
            r21 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x007b:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010d, all -> 0x0104 }
            r6.<init>()     // Catch:{ Exception -> 0x010d, all -> 0x0104 }
            java.lang.String r7 = "select * from SIMPLE_USER"
            r6.append(r7)     // Catch:{ Exception -> 0x010d, all -> 0x0104 }
            java.lang.String r7 = " where "
            r6.append(r7)     // Catch:{ Exception -> 0x010d, all -> 0x0104 }
            r6.append(r3)     // Catch:{ Exception -> 0x010d, all -> 0x0104 }
            if (r0 == 0) goto L_0x00c3
            boolean r3 = r24.isEmpty()     // Catch:{ Exception -> 0x010d, all -> 0x0104 }
            if (r3 != 0) goto L_0x00c3
            java.lang.String r3 = " and uid not in ("
            r6.append(r3)     // Catch:{ Exception -> 0x010d, all -> 0x0104 }
        L_0x00a0:
            int r3 = r24.size()     // Catch:{ Exception -> 0x010d, all -> 0x0104 }
            if (r12 >= r3) goto L_0x00be
            java.lang.Object r3 = r0.get(r12)     // Catch:{ Exception -> 0x010d, all -> 0x0104 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x010d, all -> 0x0104 }
            r6.append(r3)     // Catch:{ Exception -> 0x010d, all -> 0x0104 }
            int r3 = r24.size()     // Catch:{ Exception -> 0x010d, all -> 0x0104 }
            int r3 = r3 - r13
            if (r12 == r3) goto L_0x00bb
            java.lang.String r3 = ","
            r6.append(r3)     // Catch:{ Exception -> 0x010d, all -> 0x0104 }
        L_0x00bb:
            int r12 = r12 + 1
            goto L_0x00a0
        L_0x00be:
            java.lang.String r0 = ")"
            r6.append(r0)     // Catch:{ Exception -> 0x010d, all -> 0x0104 }
        L_0x00c3:
            if (r1 <= 0) goto L_0x00cd
            java.lang.String r0 = " limit "
            r6.append(r0)     // Catch:{ Exception -> 0x010d, all -> 0x0104 }
            r6.append(r1)     // Catch:{ Exception -> 0x010d, all -> 0x0104 }
        L_0x00cd:
            if (r2 <= 0) goto L_0x00d7
            java.lang.String r0 = " offset "
            r6.append(r0)     // Catch:{ Exception -> 0x010d, all -> 0x0104 }
            r6.append(r2)     // Catch:{ Exception -> 0x010d, all -> 0x0104 }
        L_0x00d7:
            com.ss.android.ugc.aweme.im.sdk.h.a.b r0 = com.ss.android.ugc.aweme.im.sdk.h.a.b.a()     // Catch:{ Exception -> 0x010d, all -> 0x0104 }
            java.lang.String r1 = r6.toString()     // Catch:{ Exception -> 0x010d, all -> 0x0104 }
            android.database.Cursor r1 = r0.a(r1, r5)     // Catch:{ Exception -> 0x010d, all -> 0x0104 }
            if (r1 == 0) goto L_0x00ff
        L_0x00e5:
            boolean r0 = r1.moveToNext()     // Catch:{ Exception -> 0x00fc, all -> 0x00f7 }
            if (r0 == 0) goto L_0x00ff
            r2 = r23
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = r2.a((android.database.Cursor) r1)     // Catch:{ Exception -> 0x0110, all -> 0x00f5 }
            r4.add(r0)     // Catch:{ Exception -> 0x0110, all -> 0x00f5 }
            goto L_0x00e5
        L_0x00f5:
            r0 = move-exception
            goto L_0x00fa
        L_0x00f7:
            r0 = move-exception
            r2 = r23
        L_0x00fa:
            r5 = r1
            goto L_0x0107
        L_0x00fc:
            r2 = r23
            goto L_0x0110
        L_0x00ff:
            r2 = r23
            if (r1 == 0) goto L_0x0115
            goto L_0x0112
        L_0x0104:
            r0 = move-exception
            r2 = r23
        L_0x0107:
            if (r5 == 0) goto L_0x010c
            r5.close()
        L_0x010c:
            throw r0
        L_0x010d:
            r2 = r23
            r1 = r5
        L_0x0110:
            if (r1 == 0) goto L_0x0115
        L_0x0112:
            r1.close()
        L_0x0115:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.h.c.a.a(java.util.List, int, int, java.lang.String):java.util.List");
    }
}
