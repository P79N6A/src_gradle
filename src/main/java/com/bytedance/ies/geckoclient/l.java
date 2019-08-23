package com.bytedance.ies.geckoclient;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.ies.geckoclient.e.b;
import com.bytedance.ies.geckoclient.model.d;
import com.bytedance.ies.geckoclient.model.j;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    private String f20769a;

    /* renamed from: b  reason: collision with root package name */
    private String f20770b;

    /* renamed from: c  reason: collision with root package name */
    private String f20771c;

    /* renamed from: d  reason: collision with root package name */
    private Context f20772d;

    /* access modifiers changed from: package-private */
    public final synchronized void a(d dVar) {
        c(dVar);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b(d dVar) {
        c(dVar);
    }

    private static void a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            sQLiteDatabase.close();
            new StringBuilder("close db ").append(Thread.currentThread());
        }
    }

    private void c(d dVar) {
        Cursor cursor;
        if (dVar != null) {
            SQLiteDatabase writableDatabase = com.bytedance.ies.geckoclient.e.d.a(this.f20772d).getWritableDatabase();
            Cursor cursor2 = null;
            try {
                writableDatabase.beginTransaction();
                cursor = writableDatabase.query(this.f20769a, new String[0], "channel=?", new String[]{dVar.f20791c}, null, null, null);
                try {
                    if (cursor.getCount() == 0) {
                        b(writableDatabase, dVar);
                    } else {
                        a(writableDatabase, dVar);
                    }
                    writableDatabase.setTransactionSuccessful();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    th = th;
                    cursor2 = cursor;
                    writableDatabase.endTransaction();
                    b.a(cursor2);
                    throw th;
                }
            } catch (Exception unused2) {
                cursor = null;
            } catch (Throwable th2) {
                th = th2;
                writableDatabase.endTransaction();
                b.a(cursor2);
                throw th;
            }
            writableDatabase.endTransaction();
            b.a(cursor);
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(Map<String, d> map) {
        SQLiteDatabase sQLiteDatabase;
        File file;
        try {
            sQLiteDatabase = com.bytedance.ies.geckoclient.e.d.a(this.f20772d).getWritableDatabase();
        } catch (Exception unused) {
            sQLiteDatabase = null;
        }
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + this.f20769a, null);
            if (rawQuery != null) {
                while (rawQuery.moveToNext()) {
                    d dVar = map.get(rawQuery.getString(rawQuery.getColumnIndex("channel")));
                    if (dVar != null) {
                        if (rawQuery.getInt(rawQuery.getColumnIndex("update_done")) == 0) {
                            if (!TextUtils.isEmpty(rawQuery.getString(rawQuery.getColumnIndex("update_zip")))) {
                                d.b(this.f20771c + r4);
                            }
                            if (!TextUtils.isEmpty(rawQuery.getString(rawQuery.getColumnIndex("update_zip_dir")))) {
                                d.a(this.f20771c + r4);
                            }
                            if (!TextUtils.isEmpty(rawQuery.getString(rawQuery.getColumnIndex("patch_zip")))) {
                                d.a(this.f20771c + r4);
                            }
                        }
                        String string = rawQuery.getString(rawQuery.getColumnIndex("zip"));
                        String string2 = rawQuery.getString(rawQuery.getColumnIndex("package_dir"));
                        int i = rawQuery.getInt(rawQuery.getColumnIndex("package_type"));
                        dVar.g = i;
                        File file2 = new File(this.f20771c + string2);
                        if (i == 1) {
                            file = new File(this.f20771c + r2 + "/" + string);
                        } else {
                            file = new File(this.f20771c + string);
                        }
                        int i2 = rawQuery.getInt(rawQuery.getColumnIndex("update_when_launch"));
                        if ((!file2.exists() || !file.exists()) && i2 == 0) {
                            if (!TextUtils.isEmpty(string)) {
                                d.b(file);
                            }
                            if (!TextUtils.isEmpty(string2)) {
                                d.a(file2);
                            }
                            dVar.f20789a = 0;
                            dVar.f20790b = 0;
                        } else {
                            dVar.f20789a = rawQuery.getInt(rawQuery.getColumnIndex("version"));
                            dVar.f20790b = i2;
                        }
                        dVar.f20793e = rawQuery.getString(rawQuery.getColumnIndex("zip"));
                        dVar.f20792d = rawQuery.getString(rawQuery.getColumnIndex("package_dir"));
                        dVar.f20794f = rawQuery.getString(rawQuery.getColumnIndex("patch_zip"));
                        dVar.h = rawQuery.getString(rawQuery.getColumnIndex(PushConstants.EXTRA));
                        dVar.i = true;
                        StringBuilder sb = new StringBuilder("update package from local:");
                        sb.append(dVar.toString());
                        sb.append(Thread.currentThread());
                    }
                }
                rawQuery.close();
            }
            a(sQLiteDatabase);
        } catch (Exception unused2) {
        }
    }

    private void a(SQLiteDatabase sQLiteDatabase, d dVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("channel", dVar.f20791c);
        contentValues.put("version", Integer.valueOf(dVar.f20789a));
        contentValues.put("update_when_launch", Integer.valueOf(dVar.f20790b));
        contentValues.put("zip", dVar.f20793e);
        contentValues.put("package_dir", dVar.f20792d);
        contentValues.put("patch_zip", dVar.f20794f);
        contentValues.put("update_done", 1);
        contentValues.put(PushConstants.EXTRA, dVar.h);
        j jVar = dVar.j;
        if (jVar != null) {
            contentValues.put("package_type", Integer.valueOf(jVar.f20813c));
        }
        sQLiteDatabase.update(this.f20769a, contentValues, "channel=?", new String[]{dVar.f20791c});
        StringBuilder sb = new StringBuilder("update package to local:");
        sb.append(dVar.toString());
        sb.append(Thread.currentThread());
    }

    private void b(SQLiteDatabase sQLiteDatabase, d dVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("channel", dVar.f20791c);
        contentValues.put("version", Integer.valueOf(dVar.f20789a));
        contentValues.put("update_when_launch", Integer.valueOf(dVar.f20790b));
        contentValues.put("zip", dVar.f20793e);
        contentValues.put("package_dir", dVar.f20792d);
        contentValues.put("patch_zip", dVar.f20794f);
        contentValues.put("update_done", 1);
        contentValues.put(PushConstants.EXTRA, dVar.h);
        j jVar = dVar.j;
        if (jVar != null) {
            contentValues.put("package_type", Integer.valueOf(jVar.f20813c));
        } else {
            contentValues.put("package_type", -1);
        }
        new StringBuilder("insert to db:").append(dVar.f20791c);
        sQLiteDatabase.insert(this.f20769a, null, contentValues);
        contentValues.clear();
        StringBuilder sb = new StringBuilder("update package to local:");
        sb.append(dVar.toString());
        sb.append(Thread.currentThread());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ab, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(int r7, com.bytedance.ies.geckoclient.model.d r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            if (r8 == 0) goto L_0x00aa
            boolean r0 = r8.i     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x00aa
            com.bytedance.ies.geckoclient.model.j r0 = r8.j     // Catch:{ all -> 0x00a7 }
            if (r0 != 0) goto L_0x000d
            goto L_0x00aa
        L_0x000d:
            com.bytedance.ies.geckoclient.model.j r0 = r8.j     // Catch:{ all -> 0x00a7 }
            com.bytedance.ies.geckoclient.model.j$b r0 = r0.a()     // Catch:{ all -> 0x00a7 }
            com.bytedance.ies.geckoclient.model.j r1 = r8.j     // Catch:{ all -> 0x00a7 }
            com.bytedance.ies.geckoclient.model.j$b r1 = r1.b()     // Catch:{ all -> 0x00a7 }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x00a7 }
            r2.<init>()     // Catch:{ all -> 0x00a7 }
            r3 = 0
            switch(r7) {
                case 0: goto L_0x006c;
                case 1: goto L_0x0049;
                case 2: goto L_0x0037;
                case 3: goto L_0x0023;
                default: goto L_0x0022;
            }     // Catch:{ all -> 0x00a7 }
        L_0x0022:
            goto L_0x0075
        L_0x0023:
            com.bytedance.ies.geckoclient.model.j r7 = r8.j     // Catch:{ all -> 0x00a7 }
            java.lang.String r7 = r7.f20814d     // Catch:{ all -> 0x00a7 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x00a7 }
            if (r7 != 0) goto L_0x0075
            java.lang.String r7 = "update_zip"
            com.bytedance.ies.geckoclient.model.j r0 = r8.j     // Catch:{ all -> 0x00a7 }
            java.lang.String r0 = r0.f20814d     // Catch:{ all -> 0x00a7 }
            r2.put(r7, r0)     // Catch:{ all -> 0x00a7 }
            goto L_0x0075
        L_0x0037:
            if (r0 == 0) goto L_0x0075
            java.lang.String r7 = r0.f20825f     // Catch:{ all -> 0x00a7 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x00a7 }
            if (r7 != 0) goto L_0x0075
            java.lang.String r7 = "update_zip_dir"
            java.lang.String r0 = r0.f20825f     // Catch:{ all -> 0x00a7 }
            r2.put(r7, r0)     // Catch:{ all -> 0x00a7 }
            goto L_0x0075
        L_0x0049:
            if (r0 == 0) goto L_0x005a
            java.lang.String r7 = r0.f20824e     // Catch:{ all -> 0x00a7 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x00a7 }
            if (r7 != 0) goto L_0x005a
            java.lang.String r7 = "update_zip"
            java.lang.String r0 = r0.f20824e     // Catch:{ all -> 0x00a7 }
            r2.put(r7, r0)     // Catch:{ all -> 0x00a7 }
        L_0x005a:
            if (r1 == 0) goto L_0x0075
            java.lang.String r7 = r1.f20824e     // Catch:{ all -> 0x00a7 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x00a7 }
            if (r7 != 0) goto L_0x0075
            java.lang.String r7 = "patch_zip"
            java.lang.String r0 = r1.f20824e     // Catch:{ all -> 0x00a7 }
            r2.put(r7, r0)     // Catch:{ all -> 0x00a7 }
            goto L_0x0075
        L_0x006c:
            java.lang.String r7 = "update_done"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00a7 }
            r2.put(r7, r0)     // Catch:{ all -> 0x00a7 }
        L_0x0075:
            android.content.Context r7 = r6.f20772d     // Catch:{ all -> 0x00a7 }
            com.bytedance.ies.geckoclient.e.d r7 = com.bytedance.ies.geckoclient.e.d.a((android.content.Context) r7)     // Catch:{ all -> 0x00a7 }
            android.database.sqlite.SQLiteDatabase r7 = r7.getWritableDatabase()     // Catch:{ all -> 0x00a7 }
            java.lang.String r0 = r6.f20769a     // Catch:{ all -> 0x00a7 }
            java.lang.String r1 = "channel=?"
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x00a7 }
            java.lang.String r5 = r8.f20791c     // Catch:{ all -> 0x00a7 }
            r4[r3] = r5     // Catch:{ all -> 0x00a7 }
            r7.update(r0, r2, r1, r4)     // Catch:{ all -> 0x00a7 }
            a((android.database.sqlite.SQLiteDatabase) r7)     // Catch:{ all -> 0x00a7 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            java.lang.String r0 = "update status to local:"
            r7.<init>(r0)     // Catch:{ all -> 0x00a7 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00a7 }
            r7.append(r8)     // Catch:{ all -> 0x00a7 }
            java.lang.Thread r8 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00a7 }
            r7.append(r8)     // Catch:{ all -> 0x00a7 }
            monitor-exit(r6)
            return
        L_0x00a7:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x00aa:
            monitor-exit(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.geckoclient.l.a(int, com.bytedance.ies.geckoclient.model.d):void");
    }

    public final synchronized boolean a(String str, String str2) {
        SQLiteDatabase writableDatabase = com.bytedance.ies.geckoclient.e.d.a(this.f20772d).getWritableDatabase();
        Cursor rawQuery = writableDatabase.rawQuery("SELECT package_dir,zip FROM " + this.f20769a + " where channel" + " = \"" + str2 + "\"", null);
        if (rawQuery != null) {
            while (rawQuery.moveToNext()) {
                String string = rawQuery.getString(rawQuery.getColumnIndex("package_dir"));
                if (!TextUtils.isEmpty(string)) {
                    d.a(str + string);
                }
                String string2 = rawQuery.getString(rawQuery.getColumnIndex("zip"));
                d.b(str + string2);
            }
            rawQuery.close();
            try {
                writableDatabase.execSQL("DELETE FROM " + this.f20769a + " where channel" + " = \"" + str2 + "\"");
            } catch (Exception unused) {
                return false;
            }
        }
        a(writableDatabase);
        return true;
    }

    public static void a(d dVar, String str, String str2) {
        if (dVar.f20790b == 1) {
            String a2 = d.a(str, dVar.f20791c);
            String a3 = d.a(str2, dVar.f20791c);
            d.a(a3);
            if (d.b(a2, a3)) {
                d.a(a2);
                dVar.f20790b = 0;
            }
        }
    }

    public final void a(Map<String, d> map, String str, String str2) {
        ArrayList<d> arrayList = new ArrayList<>();
        if (map.size() > 0) {
            arrayList.addAll(map.values());
        }
        if (arrayList.size() > 0) {
            for (d dVar : arrayList) {
                a(dVar, str, str2);
                if (dVar.i) {
                    b(dVar);
                } else {
                    a(dVar);
                }
            }
        }
    }

    l(Context context, String str, String str2, String str3) {
        this.f20769a = str;
        this.f20770b = str2;
        this.f20771c = str3;
        this.f20772d = context;
    }
}
