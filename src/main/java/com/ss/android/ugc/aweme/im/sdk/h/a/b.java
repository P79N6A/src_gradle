package com.ss.android.ugc.aweme.im.sdk.h.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.im.core.c.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.im.sdk.utils.am;
import java.util.HashMap;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51678a;

    /* renamed from: b  reason: collision with root package name */
    private static am<b> f51679b = new am<b>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51683a;

        public final /* synthetic */ Object a() {
            if (!PatchProxy.isSupport(new Object[0], this, f51683a, false, 53248, new Class[0], b.class)) {
                return new b();
            }
            return (b) PatchProxy.accessDispatch(new Object[0], this, f51683a, false, 53248, new Class[0], b.class);
        }
    };

    /* renamed from: c  reason: collision with root package name */
    private a f51680c;

    /* renamed from: d  reason: collision with root package name */
    private SQLiteDatabase f51681d = e();

    /* renamed from: e  reason: collision with root package name */
    private String f51682e;

    public static b a() {
        if (PatchProxy.isSupport(new Object[0], null, f51678a, true, 53236, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f51678a, true, 53236, new Class[0], b.class);
        }
        return (b) f51679b.b();
    }

    @WorkerThread
    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f51678a, false, 53246, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51678a, false, 53246, new Class[0], Void.TYPE);
            return;
        }
        if (!d() && !this.f51681d.inTransaction()) {
            try {
                this.f51681d.beginTransaction();
            } catch (Exception e2) {
                a.a((Throwable) e2);
            }
        }
    }

    private boolean d() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f51678a, false, 53237, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f51678a, false, 53237, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f51681d == null || !this.f51681d.isOpen()) {
            this.f51681d = e();
        }
        if (this.f51681d == null) {
            z = true;
        }
        return z;
    }

    @WorkerThread
    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f51678a, false, 53247, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51678a, false, 53247, new Class[0], Void.TYPE);
            return;
        }
        if (!d() && this.f51681d.inTransaction()) {
            try {
                this.f51681d.setTransactionSuccessful();
                this.f51681d.endTransaction();
            } catch (Exception e2) {
                a.a((Throwable) e2);
            }
        }
    }

    private SQLiteDatabase e() {
        if (PatchProxy.isSupport(new Object[0], this, f51678a, false, 53238, new Class[0], SQLiteDatabase.class)) {
            return (SQLiteDatabase) PatchProxy.accessDispatch(new Object[0], this, f51678a, false, 53238, new Class[0], SQLiteDatabase.class);
        }
        try {
            if (this.f51681d != null && TextUtils.equals("db_im_xx", this.f51682e) && this.f51681d.isOpen()) {
                return this.f51681d;
            }
            if (this.f51681d != null) {
                SQLiteDatabase sQLiteDatabase = this.f51681d;
                if (PatchProxy.isSupport(new Object[]{sQLiteDatabase}, null, f51678a, true, 53239, new Class[]{SQLiteDatabase.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{sQLiteDatabase}, null, f51678a, true, 53239, new Class[]{SQLiteDatabase.class}, Void.TYPE);
                } else if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.close();
                    } catch (Exception e2) {
                        a.a((Throwable) e2);
                    }
                }
            }
            if (this.f51680c == null) {
                this.f51680c = new a(GlobalContext.getContext(), "db_im_xx");
            }
            this.f51682e = "db_im_xx";
            this.f51681d = this.f51680c.getWritableDatabase();
            return this.f51681d;
        } catch (Exception e3) {
            if (com.ss.android.ugc.aweme.video.b.i() < 20971520) {
                UIUtils.displayToast(GlobalContext.getContext(), (int) C0906R.string.ax2);
            }
            a.a((Throwable) e3);
        }
    }

    @WorkerThread
    public final boolean a(String str) {
        String str2 = str;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f51678a, false, 53240, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f51678a, false, 53240, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (d()) {
            return false;
        } else {
            try {
                this.f51681d.execSQL(str2);
            } catch (Exception e2) {
                a.a((Throwable) e2);
                HashMap hashMap = new HashMap();
                hashMap.put("error", e2.toString());
                hashMap.put("error_stack", d.b(e2));
                com.ss.android.ugc.aweme.im.sdk.utils.d.a("db_exec_failed", hashMap);
                z = false;
            }
            return z;
        }
    }

    @WorkerThread
    public final Cursor a(String str, String[] strArr) {
        Cursor cursor;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, null}, this, f51678a, false, 53244, new Class[]{String.class, String[].class}, Cursor.class)) {
            return (Cursor) PatchProxy.accessDispatch(new Object[]{str2, null}, this, f51678a, false, 53244, new Class[]{String.class, String[].class}, Cursor.class);
        } else if (d()) {
            return null;
        } else {
            try {
                cursor = this.f51681d.rawQuery(str2, null);
            } catch (Exception e2) {
                a.a((Throwable) e2);
                HashMap hashMap = new HashMap();
                hashMap.put("error", e2.toString());
                hashMap.put("error_stack", d.b(e2));
                com.ss.android.ugc.aweme.im.sdk.utils.d.a("db_query_failed", hashMap);
                cursor = null;
            }
            return cursor;
        }
    }

    @WorkerThread
    public final long a(String str, String str2, ContentValues contentValues) {
        String str3 = str;
        ContentValues contentValues2 = contentValues;
        if (PatchProxy.isSupport(new Object[]{str3, null, contentValues2}, this, f51678a, false, 53243, new Class[]{String.class, String.class, ContentValues.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{str3, null, contentValues2}, this, f51678a, false, 53243, new Class[]{String.class, String.class, ContentValues.class}, Long.TYPE)).longValue();
        } else if (d() || TextUtils.isEmpty(str)) {
            return -1;
        } else {
            try {
                return this.f51681d.replace(str3, null, contentValues2);
            } catch (Exception e2) {
                a.a((Throwable) e2);
                HashMap hashMap = new HashMap();
                hashMap.put("error", e2.toString());
                hashMap.put("error_stack", d.b(e2));
                com.ss.android.ugc.aweme.im.sdk.utils.d.a("db_replace_failed", hashMap);
                return -1;
            }
        }
    }

    @WorkerThread
    public final boolean a(String str, String str2, String[] strArr) {
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3, null, null}, this, f51678a, false, 53245, new Class[]{String.class, String.class, String[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, null, null}, this, f51678a, false, 53245, new Class[]{String.class, String.class, String[].class}, Boolean.TYPE)).booleanValue();
        } else if (d() || TextUtils.isEmpty(str)) {
            return false;
        } else {
            try {
                if (this.f51681d.delete(str3, null, null) > 0) {
                    return true;
                }
                return false;
            } catch (Exception e2) {
                a.a((Throwable) e2);
                HashMap hashMap = new HashMap();
                hashMap.put("error", e2.toString());
                hashMap.put("error_stack", d.b(e2));
                com.ss.android.ugc.aweme.im.sdk.utils.d.a("db_delete_failed", hashMap);
                return false;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.support.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(java.lang.String r24, android.content.ContentValues r25, java.lang.String r26, java.lang.String[] r27) {
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
            r13 = 1
            r5[r13] = r1
            r14 = 2
            r5[r14] = r2
            r15 = 3
            r5[r15] = r3
            com.meituan.robust.ChangeQuickRedirect r7 = f51678a
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r10[r12] = r6
            java.lang.Class<android.content.ContentValues> r6 = android.content.ContentValues.class
            r10[r13] = r6
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r10[r14] = r6
            java.lang.Class<java.lang.String[]> r6 = java.lang.String[].class
            r10[r15] = r6
            java.lang.Class r11 = java.lang.Integer.TYPE
            r8 = 0
            r9 = 53242(0xcffa, float:7.4608E-41)
            r6 = r23
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r5 == 0) goto L_0x006f
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r12] = r0
            r5[r13] = r1
            r5[r14] = r2
            r5[r15] = r3
            com.meituan.robust.ChangeQuickRedirect r18 = f51678a
            r19 = 0
            r20 = 53242(0xcffa, float:7.4608E-41)
            java.lang.Class[] r0 = new java.lang.Class[r4]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1
            java.lang.Class<android.content.ContentValues> r1 = android.content.ContentValues.class
            r0[r13] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r14] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r15] = r1
            java.lang.Class r22 = java.lang.Integer.TYPE
            r16 = r5
            r17 = r23
            r21 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x006f:
            boolean r4 = r23.d()
            r5 = -1
            if (r4 == 0) goto L_0x0077
            return r5
        L_0x0077:
            boolean r4 = android.text.TextUtils.isEmpty(r24)
            if (r4 == 0) goto L_0x007e
            return r5
        L_0x007e:
            r4 = r23
            android.database.sqlite.SQLiteDatabase r6 = r4.f51681d     // Catch:{ Exception -> 0x0087 }
            int r0 = r6.update(r0, r1, r2, r3)     // Catch:{ Exception -> 0x0087 }
            return r0
        L_0x0087:
            r0 = move-exception
            com.ss.android.ugc.aweme.framework.a.a.a((java.lang.Throwable) r0)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r2 = "error"
            java.lang.String r3 = r0.toString()
            r1.put(r2, r3)
            java.lang.String r2 = "error_stack"
            java.lang.String r0 = com.bytedance.im.core.c.d.b(r0)
            r1.put(r2, r0)
            java.lang.String r0 = "db_update_failed"
            com.ss.android.ugc.aweme.im.sdk.utils.d.a(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.h.a.b.a(java.lang.String, android.content.ContentValues, java.lang.String, java.lang.String[]):int");
    }
}
