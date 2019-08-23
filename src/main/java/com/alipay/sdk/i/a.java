package com.alipay.sdk.i;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.alipay.sdk.d.b;
import java.lang.ref.WeakReference;

public final class a extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Context> f5511a;

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table if not exists tb_tid (name text primary key, tid text, key_tid text, dt datetime);");
    }

    public a(Context context) {
        super(context, "msp.db", null, 1);
        this.f5511a = new WeakReference<>(context);
    }

    private static void a(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.delete("tb_tid", "name=?", new String[]{str});
        } catch (Exception unused) {
        }
    }

    private static String c(String str, String str2) {
        return str + str2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r2.isOpen() != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        r2.close();
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x005a, code lost:
        if (r2.isOpen() != false) goto L_0x002d;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String b(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "select key_tid from tb_tid where name=?"
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r4.getReadableDatabase()     // Catch:{ Exception -> 0x004d, all -> 0x003a }
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ Exception -> 0x0038, all -> 0x0036 }
            java.lang.String r5 = c(r5, r6)     // Catch:{ Exception -> 0x0038, all -> 0x0036 }
            r6 = 0
            r3[r6] = r5     // Catch:{ Exception -> 0x0038, all -> 0x0036 }
            android.database.Cursor r5 = r2.rawQuery(r0, r3)     // Catch:{ Exception -> 0x0038, all -> 0x0036 }
            boolean r0 = r5.moveToFirst()     // Catch:{ Exception -> 0x0034, all -> 0x0031 }
            if (r0 == 0) goto L_0x0020
            java.lang.String r6 = r5.getString(r6)     // Catch:{ Exception -> 0x0034, all -> 0x0031 }
            r1 = r6
        L_0x0020:
            if (r5 == 0) goto L_0x0025
            r5.close()
        L_0x0025:
            if (r2 == 0) goto L_0x005d
            boolean r5 = r2.isOpen()
            if (r5 == 0) goto L_0x005d
        L_0x002d:
            r2.close()
            goto L_0x005d
        L_0x0031:
            r6 = move-exception
            r1 = r5
            goto L_0x003c
        L_0x0034:
            goto L_0x004f
        L_0x0036:
            r6 = move-exception
            goto L_0x003c
        L_0x0038:
            r5 = r1
            goto L_0x004f
        L_0x003a:
            r6 = move-exception
            r2 = r1
        L_0x003c:
            if (r1 == 0) goto L_0x0041
            r1.close()
        L_0x0041:
            if (r2 == 0) goto L_0x004c
            boolean r5 = r2.isOpen()
            if (r5 == 0) goto L_0x004c
            r2.close()
        L_0x004c:
            throw r6
        L_0x004d:
            r5 = r1
            r2 = r5
        L_0x004f:
            if (r5 == 0) goto L_0x0054
            r5.close()
        L_0x0054:
            if (r2 == 0) goto L_0x005d
            boolean r5 = r2.isOpen()
            if (r5 == 0) goto L_0x005d
            goto L_0x002d
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.i.a.b(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v3, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r2.isOpen() != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        r2.close();
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x005a, code lost:
        if (r2.isOpen() != false) goto L_0x002d;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "select tid from tb_tid where name=?"
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r4.getReadableDatabase()     // Catch:{ Exception -> 0x004d, all -> 0x003a }
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ Exception -> 0x0038, all -> 0x0036 }
            java.lang.String r5 = c(r5, r6)     // Catch:{ Exception -> 0x0038, all -> 0x0036 }
            r6 = 0
            r3[r6] = r5     // Catch:{ Exception -> 0x0038, all -> 0x0036 }
            android.database.Cursor r5 = r2.rawQuery(r0, r3)     // Catch:{ Exception -> 0x0038, all -> 0x0036 }
            boolean r0 = r5.moveToFirst()     // Catch:{ Exception -> 0x0034, all -> 0x0031 }
            if (r0 == 0) goto L_0x0020
            java.lang.String r6 = r5.getString(r6)     // Catch:{ Exception -> 0x0034, all -> 0x0031 }
            r1 = r6
        L_0x0020:
            if (r5 == 0) goto L_0x0025
            r5.close()
        L_0x0025:
            if (r2 == 0) goto L_0x005d
            boolean r5 = r2.isOpen()
            if (r5 == 0) goto L_0x005d
        L_0x002d:
            r2.close()
            goto L_0x005d
        L_0x0031:
            r6 = move-exception
            r1 = r5
            goto L_0x003c
        L_0x0034:
            goto L_0x004f
        L_0x0036:
            r6 = move-exception
            goto L_0x003c
        L_0x0038:
            r5 = r1
            goto L_0x004f
        L_0x003a:
            r6 = move-exception
            r2 = r1
        L_0x003c:
            if (r1 == 0) goto L_0x0041
            r1.close()
        L_0x0041:
            if (r2 == 0) goto L_0x004c
            boolean r5 = r2.isOpen()
            if (r5 == 0) goto L_0x004c
            r2.close()
        L_0x004c:
            throw r6
        L_0x004d:
            r5 = r1
            r2 = r5
        L_0x004f:
            if (r5 == 0) goto L_0x0054
            r5.close()
        L_0x0054:
            if (r2 == 0) goto L_0x005d
            boolean r5 = r2.isOpen()
            if (r5 == 0) goto L_0x005d
            goto L_0x002d
        L_0x005d:
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L_0x0074
            java.lang.ref.WeakReference<android.content.Context> r5 = r4.f5511a
            java.lang.Object r5 = r5.get()
            android.content.Context r5 = (android.content.Context) r5
            java.lang.String r5 = com.alipay.sdk.j.a.c(r5)
            r6 = 2
            java.lang.String r1 = com.alipay.sdk.d.b.a(r6, r1, r5)
        L_0x0074:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.i.a.a(java.lang.String, java.lang.String):java.lang.String");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("drop table if exists tb_tid");
        onCreate(sQLiteDatabase);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0036 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0037 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(android.database.sqlite.SQLiteDatabase r5, java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "select count(*) from tb_tid where name=?"
            r1 = 1
            r2 = 0
            r3 = 0
            java.lang.String[] r4 = new java.lang.String[r1]     // Catch:{ Exception -> 0x002d, all -> 0x0026 }
            java.lang.String r6 = c(r6, r7)     // Catch:{ Exception -> 0x002d, all -> 0x0026 }
            r4[r2] = r6     // Catch:{ Exception -> 0x002d, all -> 0x0026 }
            android.database.Cursor r5 = r5.rawQuery(r0, r4)     // Catch:{ Exception -> 0x002d, all -> 0x0026 }
            boolean r6 = r5.moveToFirst()     // Catch:{ Exception -> 0x002e, all -> 0x0023 }
            if (r6 == 0) goto L_0x001c
            int r6 = r5.getInt(r2)     // Catch:{ Exception -> 0x002e, all -> 0x0023 }
            goto L_0x001d
        L_0x001c:
            r6 = 0
        L_0x001d:
            if (r5 == 0) goto L_0x0034
            r5.close()
            goto L_0x0034
        L_0x0023:
            r6 = move-exception
            r3 = r5
            goto L_0x0027
        L_0x0026:
            r6 = move-exception
        L_0x0027:
            if (r3 == 0) goto L_0x002c
            r3.close()
        L_0x002c:
            throw r6
        L_0x002d:
            r5 = r3
        L_0x002e:
            if (r5 == 0) goto L_0x0033
            r5.close()
        L_0x0033:
            r6 = 0
        L_0x0034:
            if (r6 <= 0) goto L_0x0037
            return r1
        L_0x0037:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.i.a.a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String):boolean");
    }

    public final void a(String str, String str2, String str3, String str4) {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            sQLiteDatabase = getWritableDatabase();
            try {
                if (a(sQLiteDatabase, str, str2)) {
                    a(sQLiteDatabase, str, str2, str3, str4);
                } else {
                    String a2 = b.a(1, str3, com.alipay.sdk.j.a.c((Context) this.f5511a.get()));
                    String c2 = c(str, str2);
                    sQLiteDatabase.execSQL("insert into tb_tid (name, tid, key_tid, dt) values (?, ?, ?, datetime('now', 'localtime'))", new Object[]{c2, a2, str4});
                    Cursor rawQuery = sQLiteDatabase.rawQuery("select name from tb_tid where tid!='' order by dt asc", null);
                    if (rawQuery.getCount() <= 14) {
                        rawQuery.close();
                    } else {
                        int count = rawQuery.getCount() - 14;
                        String[] strArr = new String[count];
                        if (rawQuery.moveToFirst()) {
                            int i = 0;
                            do {
                                strArr[i] = rawQuery.getString(0);
                                i++;
                                if (!rawQuery.moveToNext()) {
                                    break;
                                }
                            } while (count > i);
                        }
                        rawQuery.close();
                        for (int i2 = 0; i2 < count; i2++) {
                            if (!TextUtils.isEmpty(strArr[i2])) {
                                a(sQLiteDatabase, strArr[i2]);
                            }
                        }
                    }
                }
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                    sQLiteDatabase.close();
                }
            } catch (Exception unused) {
                sQLiteDatabase2 = sQLiteDatabase;
                if (sQLiteDatabase2 != null && sQLiteDatabase2.isOpen()) {
                    sQLiteDatabase2.close();
                }
            } catch (Throwable th) {
                th = th;
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
            sQLiteDatabase2.close();
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = null;
            sQLiteDatabase.close();
            throw th;
        }
    }

    private void a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String str4) {
        sQLiteDatabase.execSQL("update tb_tid set tid=?, key_tid=?, dt=datetime('now', 'localtime') where name=?", new Object[]{b.a(1, str3, com.alipay.sdk.j.a.c((Context) this.f5511a.get())), str4, c(str, str2)});
    }
}
