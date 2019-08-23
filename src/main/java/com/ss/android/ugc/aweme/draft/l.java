package com.ss.android.ugc.aweme.draft;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.google.gson.JsonParseException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.draft.a.b;
import com.ss.android.ugc.aweme.draft.a.c;
import com.ss.android.ugc.aweme.draft.a.h;
import com.ss.android.ugc.aweme.draft.a.k;
import com.ss.android.ugc.aweme.effect.EffectListModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.shortvideo.e;
import java.util.List;
import org.json.JSONObject;

public class l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43491a;

    /* renamed from: b  reason: collision with root package name */
    private static l f43492b;

    /* renamed from: c  reason: collision with root package name */
    private SQLiteDatabase f43493c = o.a().getWritableDatabase();

    /* renamed from: d  reason: collision with root package name */
    private SQLiteDatabase f43494d = o.a().getReadableDatabase();

    private l() {
    }

    private static String g() {
        if (PatchProxy.isSupport(new Object[0], null, f43491a, true, 38435, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f43491a, true, 38435, new Class[0], String.class);
        }
        return a.x.d();
    }

    public static l a() {
        if (PatchProxy.isSupport(new Object[0], null, f43491a, true, 38432, new Class[0], l.class)) {
            return (l) PatchProxy.accessDispatch(new Object[0], null, f43491a, true, 38432, new Class[0], l.class);
        }
        if (f43492b == null) {
            synchronized (l.class) {
                if (f43492b == null) {
                    f43492b = new l();
                }
            }
        }
        return f43492b;
    }

    private static String f() {
        if (PatchProxy.isSupport(new Object[0], null, f43491a, true, 38434, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f43491a, true, 38434, new Class[0], String.class);
        }
        return "local_draft' where user_id = '" + g() + "' or user_id" + " is null order by 'time" + "' desc";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        if (r2 != null) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        if (r2 != null) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0060, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.ss.android.ugc.aweme.draft.a.c> e() {
        /*
            r10 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f43491a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r4 = 0
            r5 = 38452(0x9634, float:5.3883E-41)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f43491a
            r5 = 0
            r6 = 38452(0x9634, float:5.3883E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.util.List> r8 = java.util.List.class
            r3 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x0028:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.f43494d     // Catch:{ Exception -> 0x0054, all -> 0x0051 }
            java.lang.String r3 = "select * from 'local_draft' order by 'time' desc"
            android.database.Cursor r2 = r2.rawQuery(r3, r1)     // Catch:{ Exception -> 0x0054, all -> 0x0051 }
            if (r2 == 0) goto L_0x004e
            int r1 = r2.getCount()     // Catch:{ Exception -> 0x004c }
            if (r1 <= 0) goto L_0x004e
        L_0x003e:
            boolean r1 = r2.moveToNext()     // Catch:{ Exception -> 0x004c }
            if (r1 == 0) goto L_0x004e
            com.ss.android.ugc.aweme.draft.a.c r1 = r10.a((android.database.Cursor) r2)     // Catch:{ Exception -> 0x004c }
            r0.add(r1)     // Catch:{ Exception -> 0x004c }
            goto L_0x003e
        L_0x004c:
            r1 = move-exception
            goto L_0x0058
        L_0x004e:
            if (r2 == 0) goto L_0x0060
            goto L_0x005d
        L_0x0051:
            r0 = move-exception
            r2 = r1
            goto L_0x0062
        L_0x0054:
            r2 = move-exception
            r9 = r2
            r2 = r1
            r1 = r9
        L_0x0058:
            com.ss.android.ugc.aweme.framework.a.a.a((java.lang.Exception) r1)     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x0060
        L_0x005d:
            r2.close()
        L_0x0060:
            return r0
        L_0x0061:
            r0 = move-exception
        L_0x0062:
            if (r2 == 0) goto L_0x0067
            r2.close()
        L_0x0067:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.draft.l.e():java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c() {
        /*
            r10 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f43491a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Integer.TYPE
            r4 = 0
            r5 = 38444(0x962c, float:5.3872E-41)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002c
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f43491a
            r5 = 0
            r6 = 38444(0x962c, float:5.3872E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Integer.TYPE
            r3 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x002c:
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.f43494d     // Catch:{ Exception -> 0x005d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005d }
            java.lang.String r4 = "select * from '"
            r3.<init>(r4)     // Catch:{ Exception -> 0x005d }
            java.lang.String r4 = f()     // Catch:{ Exception -> 0x005d }
            r3.append(r4)     // Catch:{ Exception -> 0x005d }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x005d }
            android.database.Cursor r2 = r2.rawQuery(r3, r1)     // Catch:{ Exception -> 0x005d }
            if (r2 != 0) goto L_0x0048
            goto L_0x004d
        L_0x0048:
            int r1 = r2.getCount()     // Catch:{ Exception -> 0x0056, all -> 0x0053 }
            r0 = r1
        L_0x004d:
            if (r2 == 0) goto L_0x0066
            r2.close()
            goto L_0x0066
        L_0x0053:
            r0 = move-exception
            r1 = r2
            goto L_0x0067
        L_0x0056:
            r1 = move-exception
            r9 = r2
            r2 = r1
            r1 = r9
            goto L_0x005e
        L_0x005b:
            r0 = move-exception
            goto L_0x0067
        L_0x005d:
            r2 = move-exception
        L_0x005e:
            com.ss.android.ugc.aweme.framework.a.a.a((java.lang.Exception) r2)     // Catch:{ all -> 0x005b }
            if (r1 == 0) goto L_0x0066
            r1.close()
        L_0x0066:
            return r0
        L_0x0067:
            if (r1 == 0) goto L_0x006c
            r1.close()
        L_0x006c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.draft.l.c():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.ss.android.ugc.aweme.draft.a.c> b() {
        /*
            r10 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f43491a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r4 = 0
            r5 = 38443(0x962b, float:5.387E-41)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f43491a
            r5 = 0
            r6 = 38443(0x962b, float:5.387E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.util.List> r8 = java.util.List.class
            r3 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x0028:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.f43494d     // Catch:{ Exception -> 0x006c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x006c }
            java.lang.String r4 = "select * from '"
            r3.<init>(r4)     // Catch:{ Exception -> 0x006c }
            java.lang.String r4 = f()     // Catch:{ Exception -> 0x006c }
            r3.append(r4)     // Catch:{ Exception -> 0x006c }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x006c }
            android.database.Cursor r2 = r2.rawQuery(r3, r1)     // Catch:{ Exception -> 0x006c }
            if (r2 == 0) goto L_0x0064
            int r1 = r2.getCount()     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            if (r1 <= 0) goto L_0x0064
        L_0x004e:
            boolean r1 = r2.moveToNext()     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            if (r1 == 0) goto L_0x0064
            com.ss.android.ugc.aweme.draft.a.c r1 = r10.a((android.database.Cursor) r2)     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            r0.add(r1)     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            goto L_0x004e
        L_0x005c:
            r0 = move-exception
            r1 = r2
            goto L_0x0076
        L_0x005f:
            r1 = move-exception
            r9 = r2
            r2 = r1
            r1 = r9
            goto L_0x006d
        L_0x0064:
            if (r2 == 0) goto L_0x0075
            r2.close()
            goto L_0x0075
        L_0x006a:
            r0 = move-exception
            goto L_0x0076
        L_0x006c:
            r2 = move-exception
        L_0x006d:
            com.ss.android.ugc.aweme.framework.a.a.a((java.lang.Exception) r2)     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x0075
            r1.close()
        L_0x0075:
            return r0
        L_0x0076:
            if (r1 == 0) goto L_0x007b
            r1.close()
        L_0x007b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.draft.l.b():java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x011e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.ss.android.ugc.aweme.draft.a.k> d() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f43491a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r4 = 0
            r5 = 38445(0x962d, float:5.3873E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f43491a
            r5 = 0
            r6 = 38445(0x962d, float:5.3873E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.util.List> r8 = java.util.List.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x0028:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "select * from local_draft where user_id = '"
            r1.<init>(r2)
            java.lang.String r2 = g()
            r1.append(r2)
            java.lang.String r2 = "' order by music_id"
            r1.append(r2)
            java.lang.String r2 = " desc"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            java.lang.String r4 = "DraftDBHelper before mReadableDataBase.rawQuery"
            com.ss.android.ugc.aweme.shortvideo.util.ai.a(r4)     // Catch:{ Exception -> 0x010f }
            android.database.sqlite.SQLiteDatabase r4 = r9.f43494d     // Catch:{ Exception -> 0x010f }
            android.database.Cursor r1 = r4.rawQuery(r1, r3)     // Catch:{ Exception -> 0x010f }
            java.lang.String r4 = "DraftDBHelper after mReadableDataBase.rawQuery"
            com.ss.android.ugc.aweme.shortvideo.util.ai.a(r4)     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            if (r1 == 0) goto L_0x0101
            int r4 = r1.getCount()     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            if (r4 <= 0) goto L_0x0101
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            java.lang.String r5 = "DraftDBHelper cursor.getCount:"
            r4.<init>(r5)     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            int r5 = r1.getCount()     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            r4.append(r5)     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            com.ss.android.ugc.aweme.shortvideo.util.ai.a(r4)     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
        L_0x0077:
            boolean r4 = r1.moveToNext()     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            if (r4 == 0) goto L_0x0101
            java.lang.String r4 = "DraftDBHelper cursor.moveToNext()"
            com.ss.android.ugc.aweme.shortvideo.util.ai.a(r4)     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            com.ss.android.ugc.aweme.draft.a.c r4 = r9.a((android.database.Cursor) r1)     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            if (r4 == 0) goto L_0x0077
            boolean r5 = r2.isEmpty()     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            if (r5 != 0) goto L_0x009b
            int r5 = r2.size()     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            int r5 = r5 + -1
            java.lang.Object r5 = r2.get(r5)     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            com.ss.android.ugc.aweme.draft.a.k r5 = (com.ss.android.ugc.aweme.draft.a.k) r5     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            goto L_0x009c
        L_0x009b:
            r5 = r3
        L_0x009c:
            if (r5 != 0) goto L_0x00ae
            com.ss.android.ugc.aweme.draft.a.k r5 = new com.ss.android.ugc.aweme.draft.a.k     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            r5.<init>()     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            com.ss.android.ugc.aweme.shortvideo.e r6 = r4.f43438f     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            r5.f43464b = r6     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            r5.a(r4)     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            r2.add(r5)     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            goto L_0x0077
        L_0x00ae:
            java.util.List r6 = r5.a()     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            if (r6 == 0) goto L_0x00f0
            java.util.List r6 = r5.a()     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            boolean r6 = r6.isEmpty()     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            if (r6 != 0) goto L_0x00f0
            java.util.List r6 = r5.a()     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            java.lang.Object r6 = r6.get(r0)     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            com.ss.android.ugc.aweme.draft.a.c r6 = (com.ss.android.ugc.aweme.draft.a.c) r6     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            com.ss.android.ugc.aweme.shortvideo.e r6 = r6.f43438f     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            if (r6 == 0) goto L_0x00f0
            com.ss.android.ugc.aweme.shortvideo.e r6 = r4.f43438f     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            if (r6 == 0) goto L_0x00f0
            java.util.List r6 = r5.a()     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            java.lang.Object r6 = r6.get(r0)     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            com.ss.android.ugc.aweme.draft.a.c r6 = (com.ss.android.ugc.aweme.draft.a.c) r6     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            com.ss.android.ugc.aweme.shortvideo.e r6 = r6.f43438f     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            java.lang.String r6 = r6.getPath()     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            com.ss.android.ugc.aweme.shortvideo.e r7 = r4.f43438f     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            java.lang.String r7 = r7.getPath()     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            boolean r6 = android.text.TextUtils.equals(r6, r7)     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            if (r6 == 0) goto L_0x00f0
            r5.a(r4)     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            goto L_0x0077
        L_0x00f0:
            com.ss.android.ugc.aweme.draft.a.k r5 = new com.ss.android.ugc.aweme.draft.a.k     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            r5.<init>()     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            com.ss.android.ugc.aweme.shortvideo.e r6 = r4.f43438f     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            r5.f43464b = r6     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            r5.a(r4)     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            r2.add(r5)     // Catch:{ Exception -> 0x0109, all -> 0x0107 }
            goto L_0x0077
        L_0x0101:
            if (r1 == 0) goto L_0x0118
            r1.close()
            goto L_0x0118
        L_0x0107:
            r0 = move-exception
            goto L_0x011c
        L_0x0109:
            r0 = move-exception
            r3 = r1
            goto L_0x0110
        L_0x010c:
            r0 = move-exception
            r1 = r3
            goto L_0x011c
        L_0x010f:
            r0 = move-exception
        L_0x0110:
            com.ss.android.ugc.aweme.framework.a.a.a((java.lang.Exception) r0)     // Catch:{ all -> 0x010c }
            if (r3 == 0) goto L_0x0118
            r3.close()
        L_0x0118:
            r9.a((java.util.List<com.ss.android.ugc.aweme.draft.a.k>) r2)
            return r2
        L_0x011c:
            if (r1 == 0) goto L_0x0121
            r1.close()
        L_0x0121:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.draft.l.d():java.util.List");
    }

    public static String a(c cVar) {
        if (!PatchProxy.isSupport(new Object[]{cVar}, null, f43491a, true, 38433, new Class[]{c.class}, String.class)) {
            return cVar.S();
        }
        return (String) PatchProxy.accessDispatch(new Object[]{cVar}, null, f43491a, true, 38433, new Class[]{c.class}, String.class);
    }

    private com.ss.android.ugc.aweme.draft.a.a b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f43491a, false, 38449, new Class[]{String.class}, com.ss.android.ugc.aweme.draft.a.a.class)) {
            return (com.ss.android.ugc.aweme.draft.a.a) PatchProxy.accessDispatch(new Object[]{str2}, this, f43491a, false, 38449, new Class[]{String.class}, com.ss.android.ugc.aweme.draft.a.a.class);
        }
        try {
            return (com.ss.android.ugc.aweme.draft.a.a) a.f61120c.fromJson(str2, com.ss.android.ugc.aweme.draft.a.a.class);
        } catch (JsonParseException e2) {
            com.ss.android.ugc.aweme.framework.a.a.a(str);
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return new com.ss.android.ugc.aweme.draft.a.a();
        } catch (Exception e3) {
            com.ss.android.ugc.aweme.framework.a.a.a(str);
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e3);
            return new com.ss.android.ugc.aweme.draft.a.a();
        }
    }

    private e c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f43491a, false, 38450, new Class[]{String.class}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{str2}, this, f43491a, false, 38450, new Class[]{String.class}, e.class);
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            try {
                return ((h) ServiceManager.get().getService(h.class)).a(str2);
            } catch (JsonParseException e2) {
                com.ss.android.ugc.aweme.framework.a.a.a(str);
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
                return new e();
            } catch (Exception e3) {
                com.ss.android.ugc.aweme.framework.a.a.a(str);
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e3);
                return new e();
            }
        }
    }

    private EffectListModel d(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f43491a, false, 38451, new Class[]{String.class}, EffectListModel.class)) {
            return (EffectListModel) PatchProxy.accessDispatch(new Object[]{str2}, this, f43491a, false, 38451, new Class[]{String.class}, EffectListModel.class);
        }
        try {
            return (EffectListModel) JSON.parseObject(str2, EffectListModel.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006e  */
    @android.support.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.draft.a.c a(java.lang.String r11) {
        /*
            r10 = this;
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r9 = 0
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f43491a
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r9] = r2
            java.lang.Class<com.ss.android.ugc.aweme.draft.a.c> r7 = com.ss.android.ugc.aweme.draft.a.c.class
            r4 = 0
            r5 = 38453(0x9635, float:5.3884E-41)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0035
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f43491a
            r4 = 0
            r5 = 38453(0x9635, float:5.3884E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r9] = r0
            java.lang.Class<com.ss.android.ugc.aweme.draft.a.c> r7 = com.ss.android.ugc.aweme.draft.a.c.class
            r2 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            com.ss.android.ugc.aweme.draft.a.c r0 = (com.ss.android.ugc.aweme.draft.a.c) r0
            return r0
        L_0x0035:
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x006b, all -> 0x0064 }
            java.lang.String r3 = "select * from local_draft where video_path = '"
            r2.<init>(r3)     // Catch:{ Exception -> 0x006b, all -> 0x0064 }
            r2.append(r11)     // Catch:{ Exception -> 0x006b, all -> 0x0064 }
            java.lang.String r0 = "'"
            r2.append(r0)     // Catch:{ Exception -> 0x006b, all -> 0x0064 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x006b, all -> 0x0064 }
            java.io.PrintStream r2 = java.lang.System.out     // Catch:{ Exception -> 0x006b, all -> 0x0064 }
            r2.println(r0)     // Catch:{ Exception -> 0x006b, all -> 0x0064 }
            android.database.sqlite.SQLiteDatabase r2 = r10.f43494d     // Catch:{ Exception -> 0x006b, all -> 0x0064 }
            android.database.Cursor r2 = r2.rawQuery(r0, r1)     // Catch:{ Exception -> 0x006b, all -> 0x0064 }
            r2.moveToNext()     // Catch:{ Exception -> 0x006c, all -> 0x0061 }
            com.ss.android.ugc.aweme.draft.a.c r0 = r10.a((android.database.Cursor) r2)     // Catch:{ Exception -> 0x006c, all -> 0x0061 }
            if (r2 == 0) goto L_0x0060
            r2.close()
        L_0x0060:
            return r0
        L_0x0061:
            r0 = move-exception
            r1 = r2
            goto L_0x0065
        L_0x0064:
            r0 = move-exception
        L_0x0065:
            if (r1 == 0) goto L_0x006a
            r1.close()
        L_0x006a:
            throw r0
        L_0x006b:
            r2 = r1
        L_0x006c:
            if (r2 == 0) goto L_0x0071
            r2.close()
        L_0x0071:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.draft.l.a(java.lang.String):com.ss.android.ugc.aweme.draft.a.c");
    }

    public final synchronized int b(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f43491a, false, 38437, new Class[]{c.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{cVar}, this, f43491a, false, 38437, new Class[]{c.class}, Integer.TYPE)).intValue();
        }
        String S = cVar.S();
        if (TextUtils.isEmpty(S)) {
            return 0;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("draft_extras", a.f61120c.toJson((Object) cVar.T));
        return this.f43493c.update("local_draft", contentValues, "video_path = ?", new String[]{S});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0064, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void d(com.ss.android.ugc.aweme.draft.a.c r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0065 }
            r9 = 0
            r1[r9] = r11     // Catch:{ all -> 0x0065 }
            com.meituan.robust.ChangeQuickRedirect r3 = f43491a     // Catch:{ all -> 0x0065 }
            r4 = 0
            r5 = 38440(0x9628, float:5.3866E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x0065 }
            java.lang.Class<com.ss.android.ugc.aweme.draft.a.c> r2 = com.ss.android.ugc.aweme.draft.a.c.class
            r6[r9] = r2     // Catch:{ all -> 0x0065 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0065 }
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0065 }
            if (r1 == 0) goto L_0x0034
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0065 }
            r1[r9] = r11     // Catch:{ all -> 0x0065 }
            com.meituan.robust.ChangeQuickRedirect r3 = f43491a     // Catch:{ all -> 0x0065 }
            r4 = 0
            r5 = 38440(0x9628, float:5.3866E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x0065 }
            java.lang.Class<com.ss.android.ugc.aweme.draft.a.c> r0 = com.ss.android.ugc.aweme.draft.a.c.class
            r6[r9] = r0     // Catch:{ all -> 0x0065 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0065 }
            r2 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0065 }
            monitor-exit(r10)
            return
        L_0x0034:
            if (r11 == 0) goto L_0x0063
            java.lang.String r1 = a((com.ss.android.ugc.aweme.draft.a.c) r11)     // Catch:{ all -> 0x0065 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0065 }
            if (r1 == 0) goto L_0x0041
            goto L_0x0063
        L_0x0041:
            android.database.sqlite.SQLiteDatabase r1 = r10.f43493c     // Catch:{ all -> 0x0065 }
            r1.beginTransaction()     // Catch:{ all -> 0x0065 }
            android.database.sqlite.SQLiteDatabase r1 = r10.f43493c     // Catch:{ all -> 0x0065 }
            java.lang.String r2 = "local_draft"
            java.lang.String r3 = "video_path = ?"
            java.lang.String[] r4 = new java.lang.String[r8]     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = a((com.ss.android.ugc.aweme.draft.a.c) r11)     // Catch:{ all -> 0x0065 }
            r4[r9] = r0     // Catch:{ all -> 0x0065 }
            r1.delete(r2, r3, r4)     // Catch:{ all -> 0x0065 }
            android.database.sqlite.SQLiteDatabase r0 = r10.f43493c     // Catch:{ all -> 0x0065 }
            r0.setTransactionSuccessful()     // Catch:{ all -> 0x0065 }
            android.database.sqlite.SQLiteDatabase r0 = r10.f43493c     // Catch:{ all -> 0x0065 }
            r0.endTransaction()     // Catch:{ all -> 0x0065 }
            monitor-exit(r10)
            return
        L_0x0063:
            monitor-exit(r10)
            return
        L_0x0065:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.draft.l.d(com.ss.android.ugc.aweme.draft.a.c):void");
    }

    private void a(List<k> list) {
        boolean z;
        List<k> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f43491a, false, 38446, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f43491a, false, 38446, new Class[]{List.class}, Void.TYPE);
            return;
        }
        int size = list.size();
        int i = 0;
        while (i < size - 1) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < size; i3++) {
                k kVar = list2.get(i3);
                k kVar2 = list2.get(i);
                if (PatchProxy.isSupport(new Object[]{kVar2}, kVar, k.f43463a, false, 38509, new Class[]{k.class}, Boolean.TYPE)) {
                    k kVar3 = kVar;
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{kVar2}, kVar3, k.f43463a, false, 38509, new Class[]{k.class}, Boolean.TYPE)).booleanValue();
                } else if (kVar.f43465c == null || kVar.f43465c.isEmpty() || kVar.f43465c.get(0) == null || kVar.f43465c.get(0).D == 0 || !(kVar2 == null || kVar2.f43465c == null || kVar2.f43465c.isEmpty() || kVar2.f43465c.get(0) == null || kVar2.f43465c.get(0).D == 0 || kVar.f43465c.get(0).D > ((c) kVar2.a().get(0)).D)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    list2.set(i, list2.get(i3));
                    list2.set(i3, list2.get(i));
                }
            }
            i = i2;
        }
    }

    private c a(Cursor cursor) {
        if (PatchProxy.isSupport(new Object[]{cursor}, this, f43491a, false, 38448, new Class[]{Cursor.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{cursor}, this, f43491a, false, 38448, new Class[]{Cursor.class}, c.class);
        }
        c cVar = new c();
        String string = cursor.getString(cursor.getColumnIndex("user_id"));
        if (TextUtils.isEmpty(string)) {
            string = g();
        }
        cVar.f43437e = cursor.getString(cursor.getColumnIndex("video_path"));
        cVar.C = string;
        cVar.f43435c = b(cursor.getString(cursor.getColumnIndex("aweme")));
        cVar.f43438f = c(cursor.getString(cursor.getColumnIndex("music")));
        cVar.h = cursor.getString(cursor.getColumnIndex("music_path"));
        cVar.j = cursor.getInt(cursor.getColumnIndex("video_volume"));
        cVar.k = cursor.getInt(cursor.getColumnIndex("music_volume"));
        cVar.l = cursor.getInt(cursor.getColumnIndex("filter"));
        cVar.m = cursor.getInt(cursor.getColumnIndex("music_start"));
        cVar.i = cursor.getString(cursor.getColumnIndex("voice_path"));
        cVar.D = cursor.getLong(cursor.getColumnIndex("time"));
        cVar.n = cursor.getInt(cursor.getColumnIndex("effect"));
        cVar.o = cursor.getInt(cursor.getColumnIndex("origin"));
        cVar.B = cursor.getInt(cursor.getColumnIndex("face_beauty"));
        cVar.E = cursor.getString(cursor.getColumnIndex("segment_video"));
        cVar.F = cursor.getInt(cursor.getColumnIndex("hard_encode"));
        cVar.G = cursor.getInt(cursor.getColumnIndex("special_points"));
        cVar.H = cursor.getString(cursor.getColumnIndex("sticker_path"));
        cVar.I = cursor.getString(cursor.getColumnIndex("sticker_id"));
        cVar.t = cursor.getInt(cursor.getColumnIndex("camera_poi"));
        cVar.s = cursor.getString(cursor.getColumnIndex("filter_label"));
        cVar.z = d(cursor.getString(cursor.getColumnIndex("effect_list")));
        cVar.u = cursor.getInt(cursor.getColumnIndex("beauty_label"));
        cVar.p = cursor.getString(cursor.getColumnIndex("reverse_path"));
        cVar.q = cursor.getString(cursor.getColumnIndex("video_speed"));
        cVar.y = cursor.getInt(cursor.getColumnIndex("is_private"));
        cVar.A = (long) cursor.getInt(cursor.getColumnIndex("max_duration"));
        cVar.r = (UrlModel) a.f61120c.fromJson(cursor.getString(cursor.getColumnIndex("audio_track")), UrlModel.class);
        cVar.c(cursor.getString(cursor.getColumnIndex("photo_movie")));
        cVar.e(cursor.getString(cursor.getColumnIndex("music_effect_segments")));
        cVar.f(cursor.getInt(cursor.getColumnIndex("new_version")));
        cVar.f(cursor.getString(cursor.getColumnIndex("output_wav_path")));
        cVar.a(cursor.getFloat(cursor.getColumnIndex("custom_cover_start")));
        cVar.O = cursor.getInt(cursor.getColumnIndex("video_width"));
        cVar.P = cursor.getInt(cursor.getColumnIndex("video_height"));
        cVar.Q = cursor.getString(cursor.getColumnIndex("duet_from"));
        cVar.R = cursor.getString(cursor.getColumnIndex("sync_platforms"));
        cVar.a((b) a.f61120c.fromJson(cursor.getString(cursor.getColumnIndex("draft_extras")), b.class));
        if (cVar.T == null || TextUtils.isEmpty(cVar.T.Q)) {
            cVar.b(cursor.getString(cursor.getColumnIndex("video_path")));
        }
        return cVar;
    }

    public final long c(c cVar) {
        String str;
        String str2;
        String str3;
        String jSONString;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f43491a, false, 38439, new Class[]{c.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{cVar2}, this, f43491a, false, 38439, new Class[]{c.class}, Long.TYPE)).longValue();
        }
        ContentValues contentValues = new ContentValues();
        if (cVar2.f43435c == null) {
            str = "";
        } else {
            str = JSON.toJSONString(cVar2.f43435c);
        }
        contentValues.put("aweme", str);
        contentValues.put("video_path", a(cVar));
        contentValues.put("music_path", cVar2.h);
        contentValues.put("video_volume", Integer.valueOf(cVar2.j));
        contentValues.put("music_volume", Integer.valueOf(cVar2.k));
        contentValues.put("voice_path", cVar2.i);
        if (cVar2.f43438f == null) {
            str2 = "";
        } else {
            str2 = JSON.toJSONString(cVar2.f43438f);
        }
        contentValues.put("music", str2);
        contentValues.put("filter", Integer.valueOf(cVar2.l));
        contentValues.put("music_start", Integer.valueOf(cVar2.m));
        contentValues.put("time", Long.valueOf(cVar2.D));
        contentValues.put("effect", Integer.valueOf(cVar2.n));
        contentValues.put("origin", Integer.valueOf(cVar2.o));
        contentValues.put("face_beauty", Integer.valueOf(cVar2.B));
        contentValues.put("user_id", cVar2.C);
        contentValues.put("segment_video", cVar2.E);
        contentValues.put("hard_encode", Integer.valueOf(cVar2.F));
        contentValues.put("special_points", Integer.valueOf(cVar2.G));
        contentValues.put("sticker_path", cVar2.H);
        contentValues.put("sticker_id", cVar2.I);
        contentValues.put("camera_poi", Integer.valueOf(cVar2.t));
        contentValues.put("filter_label", cVar2.s);
        contentValues.put("beauty_label", Integer.valueOf(cVar2.u));
        contentValues.put("reverse_path", cVar2.p);
        contentValues.put("video_speed", cVar2.q);
        contentValues.put("music_effect_segments", cVar2.K);
        contentValues.put("is_private", Integer.valueOf(cVar2.y));
        contentValues.put("max_duration", Long.valueOf(cVar2.A));
        contentValues.put("audio_track", a.f61120c.toJson((Object) cVar2.r));
        if (cVar2.f43436d == null) {
            str3 = "";
        } else {
            str3 = a.f61120c.toJson((Object) cVar2.f43436d);
        }
        contentValues.put("photo_movie", str3);
        String str4 = "";
        try {
            if (cVar2.z == null) {
                jSONString = "";
            } else {
                jSONString = JSON.toJSONString(cVar2.z);
            }
            str4 = jSONString;
        } catch (Exception unused) {
        }
        contentValues.put("effect_list", str4);
        String str5 = "";
        if (!(cVar2.f43438f == null || cVar2.f43438f.getMusicId() == null)) {
            str5 = cVar2.f43438f.getMusicId();
        }
        contentValues.put("music_id", str5);
        contentValues.put("new_version", Integer.valueOf(cVar2.L));
        contentValues.put("output_wav_path", cVar2.M);
        contentValues.put("custom_cover_start", Float.valueOf(cVar2.N));
        contentValues.put("video_width", Integer.valueOf(cVar2.O));
        contentValues.put("video_height", Integer.valueOf(cVar2.P));
        contentValues.put("duet_from", cVar2.Q);
        contentValues.put("sync_platforms", cVar2.R);
        contentValues.put("draft_extras", a.f61120c.toJson((Object) cVar2.T));
        long replace = this.f43493c.replace("local_draft", null, contentValues);
        if (replace > 0) {
            n.a("aweme_draft_create_fail_rate", 0, (JSONObject) null);
        } else {
            com.ss.android.ugc.aweme.app.d.c a2 = com.ss.android.ugc.aweme.app.d.c.a();
            n.a("aweme_draft_create_fail_rate", 1, a2.a("rowId", replace).b());
        }
        return replace;
    }
}
