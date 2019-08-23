package com.ss.android.ugc.aweme.shortvideo.sticker.a;

import android.database.sqlite.SQLiteDatabase;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.draft.o;
import java.util.Set;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69256a;

    /* renamed from: b  reason: collision with root package name */
    private static b f69257b;

    /* renamed from: c  reason: collision with root package name */
    private o f69258c = o.a();

    interface a<T> {
        void a(T t);
    }

    private b() {
    }

    public static b a() {
        if (PatchProxy.isSupport(new Object[0], null, f69256a, true, 79035, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f69256a, true, 79035, new Class[0], b.class);
        }
        if (f69257b == null) {
            synchronized (b.class) {
                if (f69257b == null) {
                    f69257b = new b();
                }
            }
        }
        return f69257b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> c() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f69256a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r4 = 0
            r5 = 79038(0x134be, float:1.10756E-40)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f69256a
            r5 = 0
            r6 = 79038(0x134be, float:1.10756E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.util.List> r8 = java.util.List.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x0028:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            com.ss.android.ugc.aweme.draft.o r3 = r9.f69258c     // Catch:{ Exception -> 0x005e }
            android.database.sqlite.SQLiteDatabase r3 = r3.getReadableDatabase()     // Catch:{ Exception -> 0x005e }
            java.lang.String r4 = "select origin_path from face group by origin_path"
            android.database.Cursor r3 = r3.rawQuery(r4, r2)     // Catch:{ Exception -> 0x005e }
            if (r3 == 0) goto L_0x0056
            int r2 = r3.getCount()     // Catch:{ Exception -> 0x0053, all -> 0x0050 }
            if (r2 <= 0) goto L_0x0056
        L_0x0042:
            boolean r2 = r3.moveToNext()     // Catch:{ Exception -> 0x0053, all -> 0x0050 }
            if (r2 == 0) goto L_0x0056
            java.lang.String r2 = r3.getString(r0)     // Catch:{ Exception -> 0x0053, all -> 0x0050 }
            r1.add(r2)     // Catch:{ Exception -> 0x0053, all -> 0x0050 }
            goto L_0x0042
        L_0x0050:
            r0 = move-exception
            r2 = r3
            goto L_0x0068
        L_0x0053:
            r0 = move-exception
            r2 = r3
            goto L_0x005f
        L_0x0056:
            if (r3 == 0) goto L_0x0067
            r3.close()
            goto L_0x0067
        L_0x005c:
            r0 = move-exception
            goto L_0x0068
        L_0x005e:
            r0 = move-exception
        L_0x005f:
            com.ss.android.ugc.aweme.framework.a.a.a((java.lang.Exception) r0)     // Catch:{ all -> 0x005c }
            if (r2 == 0) goto L_0x0067
            r2.close()
        L_0x0067:
            return r1
        L_0x0068:
            if (r2 == 0) goto L_0x006d
            r2.close()
        L_0x006d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.a.b.c():java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.ss.android.ugc.aweme.shortvideo.model.Face> b() {
        /*
            r12 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f69256a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r4 = 0
            r5 = 79037(0x134bd, float:1.10754E-40)
            r2 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f69256a
            r5 = 0
            r6 = 79037(0x134bd, float:1.10754E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.util.List> r8 = java.util.List.class
            r3 = r12
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x0028:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            com.ss.android.ugc.aweme.draft.o r3 = r12.f69258c     // Catch:{ Exception -> 0x00cf }
            android.database.sqlite.SQLiteDatabase r3 = r3.getReadableDatabase()     // Catch:{ Exception -> 0x00cf }
            java.lang.String r4 = "select * from 'face' order by 'date_added' desc"
            android.database.Cursor r3 = r3.rawQuery(r4, r2)     // Catch:{ Exception -> 0x00cf }
            if (r3 == 0) goto L_0x00c6
            int r2 = r3.getCount()     // Catch:{ Exception -> 0x00c3, all -> 0x00c1 }
            if (r2 <= 0) goto L_0x00c6
        L_0x0042:
            boolean r2 = r3.moveToNext()     // Catch:{ Exception -> 0x00c3, all -> 0x00c1 }
            if (r2 == 0) goto L_0x00c6
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00c3, all -> 0x00c1 }
            r4[r0] = r3     // Catch:{ Exception -> 0x00c3, all -> 0x00c1 }
            com.meituan.robust.ChangeQuickRedirect r6 = f69256a     // Catch:{ Exception -> 0x00c3, all -> 0x00c1 }
            r7 = 0
            r8 = 79040(0x134c0, float:1.10759E-40)
            java.lang.Class[] r9 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x00c3, all -> 0x00c1 }
            java.lang.Class<android.database.Cursor> r5 = android.database.Cursor.class
            r9[r0] = r5     // Catch:{ Exception -> 0x00c3, all -> 0x00c1 }
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.model.Face> r10 = com.ss.android.ugc.aweme.shortvideo.model.Face.class
            r5 = r12
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x00c3, all -> 0x00c1 }
            if (r4 == 0) goto L_0x007c
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00c3, all -> 0x00c1 }
            r5[r0] = r3     // Catch:{ Exception -> 0x00c3, all -> 0x00c1 }
            com.meituan.robust.ChangeQuickRedirect r7 = f69256a     // Catch:{ Exception -> 0x00c3, all -> 0x00c1 }
            r8 = 0
            r9 = 79040(0x134c0, float:1.10759E-40)
            java.lang.Class[] r10 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x00c3, all -> 0x00c1 }
            java.lang.Class<android.database.Cursor> r2 = android.database.Cursor.class
            r10[r0] = r2     // Catch:{ Exception -> 0x00c3, all -> 0x00c1 }
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.model.Face> r11 = com.ss.android.ugc.aweme.shortvideo.model.Face.class
            r6 = r12
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00c3, all -> 0x00c1 }
            com.ss.android.ugc.aweme.shortvideo.model.Face r2 = (com.ss.android.ugc.aweme.shortvideo.model.Face) r2     // Catch:{ Exception -> 0x00c3, all -> 0x00c1 }
            goto L_0x00bd
        L_0x007c:
            com.ss.android.ugc.aweme.shortvideo.model.Face r2 = new com.ss.android.ugc.aweme.shortvideo.model.Face     // Catch:{ Exception -> 0x00c3, all -> 0x00c1 }
            r2.<init>()     // Catch:{ Exception -> 0x00c3, all -> 0x00c1 }
            java.lang.String r4 = "path"
            int r4 = r3.getColumnIndex(r4)     // Catch:{ Exception -> 0x00c3, all -> 0x00c1 }
            java.lang.String r4 = r3.getString(r4)     // Catch:{ Exception -> 0x00c3, all -> 0x00c1 }
            r2.path = r4     // Catch:{ Exception -> 0x00c3, all -> 0x00c1 }
            java.lang.String r4 = "origin_path"
            int r4 = r3.getColumnIndex(r4)     // Catch:{ Exception -> 0x00c3, all -> 0x00c1 }
            java.lang.String r4 = r3.getString(r4)     // Catch:{ Exception -> 0x00c3, all -> 0x00c1 }
            r2.origin_path = r4     // Catch:{ Exception -> 0x00c3, all -> 0x00c1 }
            java.lang.String r4 = "width"
            int r4 = r3.getColumnIndex(r4)     // Catch:{ Exception -> 0x00c3, all -> 0x00c1 }
            int r4 = r3.getInt(r4)     // Catch:{ Exception -> 0x00c3, all -> 0x00c1 }
            r2.width = r4     // Catch:{ Exception -> 0x00c3, all -> 0x00c1 }
            java.lang.String r4 = "height"
            int r4 = r3.getColumnIndex(r4)     // Catch:{ Exception -> 0x00c3, all -> 0x00c1 }
            int r4 = r3.getInt(r4)     // Catch:{ Exception -> 0x00c3, all -> 0x00c1 }
            r2.height = r4     // Catch:{ Exception -> 0x00c3, all -> 0x00c1 }
            java.lang.String r4 = "date_added"
            int r4 = r3.getColumnIndex(r4)     // Catch:{ Exception -> 0x00c3, all -> 0x00c1 }
            long r4 = r3.getLong(r4)     // Catch:{ Exception -> 0x00c3, all -> 0x00c1 }
            r2.data_added = r4     // Catch:{ Exception -> 0x00c3, all -> 0x00c1 }
        L_0x00bd:
            r1.add(r2)     // Catch:{ Exception -> 0x00c3, all -> 0x00c1 }
            goto L_0x0042
        L_0x00c1:
            r0 = move-exception
            goto L_0x00d9
        L_0x00c3:
            r0 = move-exception
            r2 = r3
            goto L_0x00d0
        L_0x00c6:
            if (r3 == 0) goto L_0x00d8
            r3.close()
            goto L_0x00d8
        L_0x00cc:
            r0 = move-exception
            r3 = r2
            goto L_0x00d9
        L_0x00cf:
            r0 = move-exception
        L_0x00d0:
            com.ss.android.ugc.aweme.framework.a.a.a((java.lang.Exception) r0)     // Catch:{ all -> 0x00cc }
            if (r2 == 0) goto L_0x00d8
            r2.close()
        L_0x00d8:
            return r1
        L_0x00d9:
            if (r3 == 0) goto L_0x00de
            r3.close()
        L_0x00de:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.a.b.b():java.util.List");
    }

    public final void a(final Set<String> set) {
        if (PatchProxy.isSupport(new Object[]{set}, this, f69256a, false, 79039, new Class[]{Set.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{set}, this, f69256a, false, 79039, new Class[]{Set.class}, Void.TYPE);
            return;
        }
        SQLiteDatabase writableDatabase = this.f69258c.getWritableDatabase();
        AnonymousClass1 r11 = new a<SQLiteDatabase>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f69259a;

            public final /* synthetic */ void a(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                if (PatchProxy.isSupport(new Object[]{sQLiteDatabase}, this, f69259a, false, 79043, new Class[]{SQLiteDatabase.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{sQLiteDatabase}, this, f69259a, false, 79043, new Class[]{SQLiteDatabase.class}, Void.TYPE);
                    return;
                }
                for (String str : set) {
                    sQLiteDatabase.delete("face", "origin_path = ?", new String[]{str});
                }
            }
        };
        if (PatchProxy.isSupport(new Object[]{writableDatabase, r11}, this, f69256a, false, 79042, new Class[]{SQLiteDatabase.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{writableDatabase, r11}, this, f69256a, false, 79042, new Class[]{SQLiteDatabase.class, a.class}, Void.TYPE);
        } else if (writableDatabase.isOpen()) {
            try {
                writableDatabase.acquireReference();
                writableDatabase.beginTransaction();
                r11.a(writableDatabase);
                writableDatabase.setTransactionSuccessful();
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                writableDatabase.releaseReference();
                throw th;
            }
            writableDatabase.endTransaction();
            writableDatabase.releaseReference();
        }
    }
}
