package com.umeng.analytics.pro;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.Collection;
import java.util.List;

public class a {
    public static boolean a(SQLiteDatabase sQLiteDatabase, Collection<i> collection) {
        try {
            sQLiteDatabase.beginTransaction();
            if (c(sQLiteDatabase, "aggregated_cache") > 0) {
                b(sQLiteDatabase, "aggregated_cache");
            }
            for (i a2 : collection) {
                sQLiteDatabase.insert("aggregated_cache", null, a(a2));
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            return true;
        } catch (SQLException unused) {
            by.e("insert to Aggregated cache table faild!");
            sQLiteDatabase.endTransaction();
            return false;
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    public static boolean a(f fVar, SQLiteDatabase sQLiteDatabase, Collection<i> collection) {
        try {
            sQLiteDatabase.beginTransaction();
            for (i a2 : collection) {
                sQLiteDatabase.insert("aggregated", null, a(a2));
            }
            sQLiteDatabase.setTransactionSuccessful();
            b(sQLiteDatabase, "aggregated_cache");
            fVar.a("success", false);
            sQLiteDatabase.endTransaction();
            return true;
        } catch (SQLException unused) {
            by.e("insert to Aggregated cache table faild!");
            sQLiteDatabase.endTransaction();
            return false;
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    public static boolean a(SQLiteDatabase sQLiteDatabase, f fVar) {
        try {
            sQLiteDatabase.beginTransaction();
            if (c(sQLiteDatabase, "aggregated_cache") <= 0) {
                fVar.a("faild", false);
                return false;
            }
            sQLiteDatabase.execSQL("insert into aggregated(key, count, value, totalTimestamp, timeWindowNum, label) select key, count, value, totalTimestamp, timeWindowNum, label from aggregated_cache");
            sQLiteDatabase.setTransactionSuccessful();
            b(sQLiteDatabase, "aggregated_cache");
            fVar.a("success", false);
            sQLiteDatabase.endTransaction();
            return true;
        } catch (SQLException e2) {
            fVar.a(Boolean.FALSE, false);
            by.e("cacheToAggregatedTable happen " + e2.toString());
            return false;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    private static ContentValues a(i iVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", iVar.a());
        contentValues.put("label", iVar.c());
        contentValues.put("count", Long.valueOf(iVar.g()));
        contentValues.put("value", Long.valueOf(iVar.f()));
        contentValues.put("totalTimestamp", Long.valueOf(iVar.e()));
        contentValues.put("timeWindowNum", iVar.h());
        return contentValues;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.database.sqlite.SQLiteDatabase r6) {
        /*
            r0 = 0
            r6.beginTransaction()     // Catch:{ SQLException -> 0x0041, all -> 0x003e }
            java.lang.String r1 = "aggregated_cache"
            int r1 = c(r6, r1)     // Catch:{ SQLException -> 0x0041, all -> 0x003e }
            if (r1 > 0) goto L_0x0012
            java.lang.String r1 = "0"
            r6.endTransaction()
            return r1
        L_0x0012:
            java.lang.String r1 = "select * from aggregated_cache"
            android.database.Cursor r1 = r6.rawQuery(r1, r0)     // Catch:{ SQLException -> 0x0041, all -> 0x003e }
            boolean r2 = r1.moveToLast()     // Catch:{ SQLException -> 0x0039, all -> 0x0035 }
            if (r2 == 0) goto L_0x0029
            java.lang.String r2 = "timeWindowNum"
            int r2 = r1.getColumnIndex(r2)     // Catch:{ SQLException -> 0x0039, all -> 0x0035 }
            java.lang.String r2 = r1.getString(r2)     // Catch:{ SQLException -> 0x0039, all -> 0x0035 }
            r0 = r2
        L_0x0029:
            r6.setTransactionSuccessful()     // Catch:{ SQLException -> 0x0039, all -> 0x0035 }
            if (r1 == 0) goto L_0x0031
            r1.close()
        L_0x0031:
            r6.endTransaction()
            return r0
        L_0x0035:
            r0 = move-exception
            r2 = r1
            r1 = r0
            goto L_0x0062
        L_0x0039:
            r2 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
            goto L_0x0043
        L_0x003e:
            r1 = move-exception
            r2 = r0
            goto L_0x0062
        L_0x0041:
            r1 = move-exception
            r2 = r0
        L_0x0043:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = "queryLastTimeWindowNumFromCache error "
            r3.<init>(r4)     // Catch:{ all -> 0x0061 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0061 }
            r3.append(r1)     // Catch:{ all -> 0x0061 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0061 }
            com.umeng.analytics.pro.by.e((java.lang.String) r1)     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x005d
            r2.close()
        L_0x005d:
            r6.endTransaction()
            return r0
        L_0x0061:
            r1 = move-exception
        L_0x0062:
            if (r2 == 0) goto L_0x0067
            r2.close()
        L_0x0067:
            r6.endTransaction()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.a.a(android.database.sqlite.SQLiteDatabase):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject b(android.database.sqlite.SQLiteDatabase r9) {
        /*
            r0 = 0
            java.lang.String r1 = "aggregated"
            int r1 = c(r9, r1)     // Catch:{ SQLException -> 0x00a4, all -> 0x009f }
            if (r1 <= 0) goto L_0x00c0
            java.lang.String r1 = "select * from aggregated"
            android.database.Cursor r9 = r9.rawQuery(r1, r0)     // Catch:{ SQLException -> 0x00a4, all -> 0x009f }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ SQLException -> 0x009d }
            r1.<init>()     // Catch:{ SQLException -> 0x009d }
        L_0x0014:
            boolean r2 = r9.moveToNext()     // Catch:{ SQLException -> 0x009d }
            if (r2 == 0) goto L_0x0097
            java.lang.String r2 = "key"
            int r2 = r9.getColumnIndex(r2)     // Catch:{ Exception -> 0x0014 }
            java.lang.String r2 = r9.getString(r2)     // Catch:{ Exception -> 0x0014 }
            boolean r3 = r1.has(r2)     // Catch:{ Exception -> 0x0014 }
            if (r3 == 0) goto L_0x0032
            org.json.JSONArray r3 = r1.getJSONArray(r2)     // Catch:{ Exception -> 0x0014 }
            r1.remove(r2)     // Catch:{ Exception -> 0x0014 }
            goto L_0x0037
        L_0x0032:
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ Exception -> 0x0014 }
            r3.<init>()     // Catch:{ Exception -> 0x0014 }
        L_0x0037:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0014 }
            r4.<init>()     // Catch:{ Exception -> 0x0014 }
            java.lang.String r5 = "v_sum"
            java.lang.String r6 = "value"
            int r6 = r9.getColumnIndex(r6)     // Catch:{ Exception -> 0x0014 }
            long r6 = r9.getLong(r6)     // Catch:{ Exception -> 0x0014 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0014 }
            java.lang.String r5 = "ts_sum"
            java.lang.String r6 = "totalTimestamp"
            int r6 = r9.getColumnIndex(r6)     // Catch:{ Exception -> 0x0014 }
            long r6 = r9.getLong(r6)     // Catch:{ Exception -> 0x0014 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0014 }
            java.lang.String r5 = "tw_num"
            java.lang.String r6 = "timeWindowNum"
            int r6 = r9.getColumnIndex(r6)     // Catch:{ Exception -> 0x0014 }
            java.lang.String r6 = r9.getString(r6)     // Catch:{ Exception -> 0x0014 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ Exception -> 0x0014 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0014 }
            java.lang.String r5 = "count"
            java.lang.String r6 = "count"
            int r6 = r9.getColumnIndex(r6)     // Catch:{ Exception -> 0x0014 }
            int r6 = r9.getInt(r6)     // Catch:{ Exception -> 0x0014 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0014 }
            java.lang.String r5 = "labels"
            java.lang.String r6 = "label"
            int r6 = r9.getColumnIndex(r6)     // Catch:{ Exception -> 0x0014 }
            java.lang.String r6 = r9.getString(r6)     // Catch:{ Exception -> 0x0014 }
            org.json.JSONArray r6 = com.umeng.analytics.pro.d.a((java.lang.String) r6)     // Catch:{ Exception -> 0x0014 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0014 }
            r3.put(r4)     // Catch:{ Exception -> 0x0014 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x0014 }
            goto L_0x0014
        L_0x0097:
            if (r9 == 0) goto L_0x009c
            r9.close()
        L_0x009c:
            return r1
        L_0x009d:
            r1 = move-exception
            goto L_0x00a6
        L_0x009f:
            r9 = move-exception
            r8 = r0
            r0 = r9
            r9 = r8
            goto L_0x00c2
        L_0x00a4:
            r1 = move-exception
            r9 = r0
        L_0x00a6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c1 }
            java.lang.String r3 = "readAllAggregatedDataForUpload error "
            r2.<init>(r3)     // Catch:{ all -> 0x00c1 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00c1 }
            r2.append(r1)     // Catch:{ all -> 0x00c1 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x00c1 }
            com.umeng.analytics.pro.by.e((java.lang.String) r1)     // Catch:{ all -> 0x00c1 }
            if (r9 == 0) goto L_0x00c0
            r9.close()
        L_0x00c0:
            return r0
        L_0x00c1:
            r0 = move-exception
        L_0x00c2:
            if (r9 == 0) goto L_0x00c7
            r9.close()
        L_0x00c7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.a.b(android.database.sqlite.SQLiteDatabase):org.json.JSONObject");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.String> c(android.database.sqlite.SQLiteDatabase r5) {
        /*
            r0 = 0
            java.lang.String r1 = "limitedck"
            int r1 = c(r5, r1)     // Catch:{ SQLException -> 0x0035, all -> 0x0030 }
            if (r1 <= 0) goto L_0x0051
            java.lang.String r1 = "select * from limitedck"
            android.database.Cursor r5 = r5.rawQuery(r1, r0)     // Catch:{ SQLException -> 0x0035, all -> 0x0030 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ SQLException -> 0x002e }
            r1.<init>()     // Catch:{ SQLException -> 0x002e }
        L_0x0014:
            boolean r2 = r5.moveToNext()     // Catch:{ SQLException -> 0x002e }
            if (r2 == 0) goto L_0x0028
            java.lang.String r2 = "ck"
            int r2 = r5.getColumnIndex(r2)     // Catch:{ SQLException -> 0x002e }
            java.lang.String r2 = r5.getString(r2)     // Catch:{ SQLException -> 0x002e }
            r1.add(r2)     // Catch:{ SQLException -> 0x002e }
            goto L_0x0014
        L_0x0028:
            if (r5 == 0) goto L_0x002d
            r5.close()
        L_0x002d:
            return r1
        L_0x002e:
            r1 = move-exception
            goto L_0x0037
        L_0x0030:
            r5 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
            goto L_0x0053
        L_0x0035:
            r1 = move-exception
            r5 = r0
        L_0x0037:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0052 }
            java.lang.String r3 = "loadLimitCKFromDB error "
            r2.<init>(r3)     // Catch:{ all -> 0x0052 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0052 }
            r2.append(r1)     // Catch:{ all -> 0x0052 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0052 }
            com.umeng.analytics.pro.by.e((java.lang.String) r1)     // Catch:{ all -> 0x0052 }
            if (r5 == 0) goto L_0x0051
            r5.close()
        L_0x0051:
            return r0
        L_0x0052:
            r0 = move-exception
        L_0x0053:
            if (r5 == 0) goto L_0x0058
            r5.close()
        L_0x0058:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.a.c(android.database.sqlite.SQLiteDatabase):java.util.List");
    }

    public static boolean a(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.execSQL("drop table if exists " + str);
            return true;
        } catch (SQLException unused) {
            by.e("delete table faild!");
            return false;
        }
    }

    public static boolean b(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            if (c(sQLiteDatabase, str) >= 0) {
                sQLiteDatabase.execSQL("delete from " + str);
            }
            return true;
        } catch (SQLException e2) {
            by.e("cleanTableData faild!" + e2.toString());
            return false;
        }
    }

    private static void d(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.beginTransaction();
            sQLiteDatabase.execSQL("update system set count=count+1 where key like '" + str + "'");
            sQLiteDatabase.setTransactionSuccessful();
            if (sQLiteDatabase != null) {
                sQLiteDatabase.endTransaction();
            }
        } catch (SQLException unused) {
            if (sQLiteDatabase != null) {
                sQLiteDatabase.endTransaction();
            }
        } catch (Throwable th) {
            if (sQLiteDatabase != null) {
                sQLiteDatabase.endTransaction();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int c(android.database.sqlite.SQLiteDatabase r3, java.lang.String r4) {
        /*
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0025 }
            java.lang.String r2 = "select * from "
            r1.<init>(r2)     // Catch:{ Exception -> 0x0025 }
            r1.append(r4)     // Catch:{ Exception -> 0x0025 }
            java.lang.String r4 = r1.toString()     // Catch:{ Exception -> 0x0025 }
            android.database.Cursor r3 = r3.rawQuery(r4, r0)     // Catch:{ Exception -> 0x0025 }
            int r4 = r3.getCount()     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            if (r3 == 0) goto L_0x0041
            r3.close()
            goto L_0x0041
        L_0x001d:
            r4 = move-exception
            r0 = r3
            goto L_0x0042
        L_0x0020:
            r4 = move-exception
            r0 = r3
            goto L_0x0026
        L_0x0023:
            r4 = move-exception
            goto L_0x0042
        L_0x0025:
            r4 = move-exception
        L_0x0026:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0023 }
            java.lang.String r1 = "count error "
            r3.<init>(r1)     // Catch:{ all -> 0x0023 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0023 }
            r3.append(r4)     // Catch:{ all -> 0x0023 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0023 }
            com.umeng.analytics.pro.by.e((java.lang.String) r3)     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x0040
            r0.close()
        L_0x0040:
            r4 = 0
        L_0x0041:
            return r4
        L_0x0042:
            if (r0 == 0) goto L_0x0047
            r0.close()
        L_0x0047:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.a.c(android.database.sqlite.SQLiteDatabase, java.lang.String):int");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:8|9|10|(1:12)(1:13)|14|36|34|6|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0061, code lost:
        r1 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0014 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject a(com.umeng.analytics.pro.f r8, android.database.sqlite.SQLiteDatabase r9) {
        /*
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ SQLException -> 0x006d, all -> 0x006a }
            r1.<init>()     // Catch:{ SQLException -> 0x006d, all -> 0x006a }
            java.lang.String r2 = "system"
            int r2 = c(r9, r2)     // Catch:{ SQLException -> 0x006d, all -> 0x006a }
            if (r2 <= 0) goto L_0x0063
            java.lang.String r2 = "select * from system"
            android.database.Cursor r9 = r9.rawQuery(r2, r0)     // Catch:{ SQLException -> 0x006d, all -> 0x006a }
        L_0x0014:
            boolean r2 = r9.moveToNext()     // Catch:{ SQLException -> 0x0061 }
            if (r2 == 0) goto L_0x0064
            java.lang.String r2 = "key"
            int r2 = r9.getColumnIndex(r2)     // Catch:{ Exception -> 0x0014 }
            java.lang.String r2 = r9.getString(r2)     // Catch:{ Exception -> 0x0014 }
            boolean r3 = r1.has(r2)     // Catch:{ Exception -> 0x0014 }
            if (r3 == 0) goto L_0x0032
            org.json.JSONArray r3 = r1.getJSONArray(r2)     // Catch:{ Exception -> 0x0014 }
            r1.remove(r2)     // Catch:{ Exception -> 0x0014 }
            goto L_0x0037
        L_0x0032:
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ Exception -> 0x0014 }
            r3.<init>()     // Catch:{ Exception -> 0x0014 }
        L_0x0037:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0014 }
            r4.<init>()     // Catch:{ Exception -> 0x0014 }
            java.lang.String r5 = "value"
            java.lang.String r6 = "count"
            int r6 = r9.getColumnIndex(r6)     // Catch:{ Exception -> 0x0014 }
            int r6 = r9.getInt(r6)     // Catch:{ Exception -> 0x0014 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0014 }
            java.lang.String r5 = "ts"
            java.lang.String r6 = "timeStamp"
            int r6 = r9.getColumnIndex(r6)     // Catch:{ Exception -> 0x0014 }
            long r6 = r9.getLong(r6)     // Catch:{ Exception -> 0x0014 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0014 }
            r3.put(r4)     // Catch:{ Exception -> 0x0014 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x0014 }
            goto L_0x0014
        L_0x0061:
            r1 = move-exception
            goto L_0x006f
        L_0x0063:
            r9 = r0
        L_0x0064:
            if (r9 == 0) goto L_0x0069
            r9.close()
        L_0x0069:
            return r1
        L_0x006a:
            r8 = move-exception
            r9 = r0
            goto L_0x0091
        L_0x006d:
            r1 = move-exception
            r9 = r0
        L_0x006f:
            java.lang.String r2 = "faild"
            r3 = 0
            r8.a(r2, r3)     // Catch:{ all -> 0x0090 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0090 }
            java.lang.String r2 = "readAllSystemDataForUpload error "
            r8.<init>(r2)     // Catch:{ all -> 0x0090 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0090 }
            r8.append(r1)     // Catch:{ all -> 0x0090 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0090 }
            com.umeng.analytics.pro.by.e((java.lang.String) r8)     // Catch:{ all -> 0x0090 }
            if (r9 == 0) goto L_0x008f
            r9.close()
        L_0x008f:
            return r0
        L_0x0090:
            r8 = move-exception
        L_0x0091:
            if (r9 == 0) goto L_0x0096
            r9.close()
        L_0x0096:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.a.a(com.umeng.analytics.pro.f, android.database.sqlite.SQLiteDatabase):org.json.JSONObject");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0095, code lost:
        if (r6 != null) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00bb, code lost:
        if (r6 != null) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00bd, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c0, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(android.database.sqlite.SQLiteDatabase r6, com.umeng.analytics.pro.f r7) {
        /*
            r0 = 0
            r1 = 0
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ SQLException -> 0x009d, all -> 0x009a }
            r2.<init>()     // Catch:{ SQLException -> 0x009d, all -> 0x009a }
            java.lang.String r3 = "select * from aggregated_cache"
            android.database.Cursor r6 = r6.rawQuery(r3, r0)     // Catch:{ SQLException -> 0x009d, all -> 0x009a }
        L_0x000d:
            boolean r0 = r6.moveToNext()     // Catch:{ SQLException -> 0x0098 }
            if (r0 == 0) goto L_0x0086
            com.umeng.analytics.pro.i r0 = new com.umeng.analytics.pro.i     // Catch:{ SQLException -> 0x0098 }
            r0.<init>()     // Catch:{ SQLException -> 0x0098 }
            java.lang.String r3 = "key"
            int r3 = r6.getColumnIndex(r3)     // Catch:{ SQLException -> 0x0098 }
            java.lang.String r3 = r6.getString(r3)     // Catch:{ SQLException -> 0x0098 }
            java.util.List r3 = com.umeng.analytics.pro.d.b((java.lang.String) r3)     // Catch:{ SQLException -> 0x0098 }
            r0.a((java.util.List<java.lang.String>) r3)     // Catch:{ SQLException -> 0x0098 }
            java.lang.String r3 = "label"
            int r3 = r6.getColumnIndex(r3)     // Catch:{ SQLException -> 0x0098 }
            java.lang.String r3 = r6.getString(r3)     // Catch:{ SQLException -> 0x0098 }
            java.util.List r3 = com.umeng.analytics.pro.d.b((java.lang.String) r3)     // Catch:{ SQLException -> 0x0098 }
            r0.b((java.util.List<java.lang.String>) r3)     // Catch:{ SQLException -> 0x0098 }
            java.lang.String r3 = "count"
            int r3 = r6.getColumnIndex(r3)     // Catch:{ SQLException -> 0x0098 }
            int r3 = r6.getInt(r3)     // Catch:{ SQLException -> 0x0098 }
            long r3 = (long) r3     // Catch:{ SQLException -> 0x0098 }
            r0.c(r3)     // Catch:{ SQLException -> 0x0098 }
            java.lang.String r3 = "value"
            int r3 = r6.getColumnIndex(r3)     // Catch:{ SQLException -> 0x0098 }
            int r3 = r6.getInt(r3)     // Catch:{ SQLException -> 0x0098 }
            long r3 = (long) r3     // Catch:{ SQLException -> 0x0098 }
            r0.b((long) r3)     // Catch:{ SQLException -> 0x0098 }
            java.lang.String r3 = "timeWindowNum"
            int r3 = r6.getColumnIndex(r3)     // Catch:{ SQLException -> 0x0098 }
            java.lang.String r3 = r6.getString(r3)     // Catch:{ SQLException -> 0x0098 }
            r0.b((java.lang.String) r3)     // Catch:{ SQLException -> 0x0098 }
            java.lang.String r3 = "totalTimestamp"
            int r3 = r6.getColumnIndex(r3)     // Catch:{ SQLException -> 0x0098 }
            java.lang.String r3 = r6.getString(r3)     // Catch:{ SQLException -> 0x0098 }
            long r3 = java.lang.Long.parseLong(r3)     // Catch:{ SQLException -> 0x0098 }
            r0.a((long) r3)     // Catch:{ SQLException -> 0x0098 }
            java.lang.String r3 = "key"
            int r3 = r6.getColumnIndex(r3)     // Catch:{ SQLException -> 0x0098 }
            java.lang.String r3 = r6.getString(r3)     // Catch:{ SQLException -> 0x0098 }
            java.util.List r3 = com.umeng.analytics.pro.d.b((java.lang.String) r3)     // Catch:{ SQLException -> 0x0098 }
            r2.put(r3, r0)     // Catch:{ SQLException -> 0x0098 }
            goto L_0x000d
        L_0x0086:
            int r0 = r2.size()     // Catch:{ SQLException -> 0x0098 }
            if (r0 <= 0) goto L_0x0090
            r7.a(r2, r1)     // Catch:{ SQLException -> 0x0098 }
            goto L_0x0095
        L_0x0090:
            java.lang.String r0 = "faild"
            r7.a(r0, r1)     // Catch:{ SQLException -> 0x0098 }
        L_0x0095:
            if (r6 == 0) goto L_0x00c0
            goto L_0x00bd
        L_0x0098:
            r0 = move-exception
            goto L_0x00a1
        L_0x009a:
            r7 = move-exception
            r6 = r0
            goto L_0x00c2
        L_0x009d:
            r6 = move-exception
            r5 = r0
            r0 = r6
            r6 = r5
        L_0x00a1:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00c1 }
            r7.a(r2, r1)     // Catch:{ all -> 0x00c1 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c1 }
            java.lang.String r2 = "cacheToMemory happen "
            r7.<init>(r2)     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00c1 }
            r7.append(r0)     // Catch:{ all -> 0x00c1 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00c1 }
            com.umeng.analytics.pro.by.e((java.lang.String) r7)     // Catch:{ all -> 0x00c1 }
            if (r6 == 0) goto L_0x00c0
        L_0x00bd:
            r6.close()
        L_0x00c0:
            return r1
        L_0x00c1:
            r7 = move-exception
        L_0x00c2:
            if (r6 == 0) goto L_0x00c7
            r6.close()
        L_0x00c7:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.a.b(android.database.sqlite.SQLiteDatabase, com.umeng.analytics.pro.f):boolean");
    }

    public static void a(SQLiteDatabase sQLiteDatabase, boolean z, f fVar) {
        b(sQLiteDatabase, "system");
        b(sQLiteDatabase, "aggregated");
        if (!z) {
            b(sQLiteDatabase, "limitedck");
            fVar.a("success", false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.database.sqlite.SQLiteDatabase r16, java.util.Map<java.lang.String, com.umeng.analytics.pro.k> r17, com.umeng.analytics.pro.f r18) {
        /*
            r0 = r16
            r1 = 0
            java.lang.String r2 = "__ag_of"
            r3 = r17
            java.lang.Object r2 = r3.get(r2)     // Catch:{ SQLException -> 0x00b1 }
            com.umeng.analytics.pro.k r2 = (com.umeng.analytics.pro.k) r2     // Catch:{ SQLException -> 0x00b1 }
            if (r2 != 0) goto L_0x0010
            return
        L_0x0010:
            java.lang.String r3 = "system where key=\"__ag_of\""
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLException -> 0x00b1 }
            java.lang.String r5 = "select * from "
            r4.<init>(r5)     // Catch:{ SQLException -> 0x00b1 }
            r4.append(r3)     // Catch:{ SQLException -> 0x00b1 }
            java.lang.String r4 = r4.toString()     // Catch:{ SQLException -> 0x00b1 }
            android.database.Cursor r4 = r0.rawQuery(r4, r1)     // Catch:{ SQLException -> 0x00b1 }
            r4.moveToFirst()     // Catch:{ SQLException -> 0x00ab, all -> 0x00a9 }
            r5 = 0
            r7 = 0
            r9 = r5
            r8 = 0
        L_0x002c:
            boolean r11 = r4.isAfterLast()     // Catch:{ SQLException -> 0x00ab, all -> 0x00a9 }
            if (r11 != 0) goto L_0x0061
            int r11 = r4.getCount()     // Catch:{ SQLException -> 0x00ab, all -> 0x00a9 }
            if (r11 <= 0) goto L_0x005d
            java.lang.String r8 = "count"
            int r8 = r4.getColumnIndex(r8)     // Catch:{ SQLException -> 0x00ab, all -> 0x00a9 }
            int r8 = r4.getInt(r8)     // Catch:{ SQLException -> 0x00ab, all -> 0x00a9 }
            java.lang.String r9 = "timeStamp"
            int r9 = r4.getColumnIndex(r9)     // Catch:{ SQLException -> 0x00ab, all -> 0x00a9 }
            long r9 = r4.getLong(r9)     // Catch:{ SQLException -> 0x00ab, all -> 0x00a9 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ SQLException -> 0x00ab, all -> 0x00a9 }
            java.lang.String r12 = "delete from "
            r11.<init>(r12)     // Catch:{ SQLException -> 0x00ab, all -> 0x00a9 }
            r11.append(r3)     // Catch:{ SQLException -> 0x00ab, all -> 0x00a9 }
            java.lang.String r11 = r11.toString()     // Catch:{ SQLException -> 0x00ab, all -> 0x00a9 }
            r0.execSQL(r11)     // Catch:{ SQLException -> 0x00ab, all -> 0x00a9 }
        L_0x005d:
            r4.moveToNext()     // Catch:{ SQLException -> 0x00ab, all -> 0x00a9 }
            goto L_0x002c
        L_0x0061:
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ SQLException -> 0x00ab, all -> 0x00a9 }
            r3.<init>()     // Catch:{ SQLException -> 0x00ab, all -> 0x00a9 }
            java.lang.String r11 = "key"
            java.lang.String r12 = r2.c()     // Catch:{ SQLException -> 0x00ab, all -> 0x00a9 }
            r3.put(r11, r12)     // Catch:{ SQLException -> 0x00ab, all -> 0x00a9 }
            java.lang.String r11 = "count"
            if (r8 != 0) goto L_0x0078
            long r12 = r2.e()     // Catch:{ SQLException -> 0x00ab, all -> 0x00a9 }
            goto L_0x007f
        L_0x0078:
            long r12 = (long) r8     // Catch:{ SQLException -> 0x00ab, all -> 0x00a9 }
            long r14 = r2.e()     // Catch:{ SQLException -> 0x00ab, all -> 0x00a9 }
            r8 = 0
            long r12 = r12 + r14
        L_0x007f:
            java.lang.Long r8 = java.lang.Long.valueOf(r12)     // Catch:{ SQLException -> 0x00ab, all -> 0x00a9 }
            r3.put(r11, r8)     // Catch:{ SQLException -> 0x00ab, all -> 0x00a9 }
            java.lang.String r8 = "timeStamp"
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 != 0) goto L_0x0090
            long r9 = r2.d()     // Catch:{ SQLException -> 0x00ab, all -> 0x00a9 }
        L_0x0090:
            java.lang.Long r2 = java.lang.Long.valueOf(r9)     // Catch:{ SQLException -> 0x00ab, all -> 0x00a9 }
            r3.put(r8, r2)     // Catch:{ SQLException -> 0x00ab, all -> 0x00a9 }
            java.lang.String r2 = "system"
            r0.insert(r2, r1, r3)     // Catch:{ SQLException -> 0x00ab, all -> 0x00a9 }
            java.lang.String r0 = "success"
            r1 = r18
            r1.a(r0, r7)     // Catch:{ SQLException -> 0x00ab, all -> 0x00a9 }
            if (r4 == 0) goto L_0x00cd
            r4.close()
            return
        L_0x00a9:
            r0 = move-exception
            goto L_0x00ce
        L_0x00ab:
            r0 = move-exception
            r1 = r4
            goto L_0x00b2
        L_0x00ae:
            r0 = move-exception
            r4 = r1
            goto L_0x00ce
        L_0x00b1:
            r0 = move-exception
        L_0x00b2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ae }
            java.lang.String r3 = "save to system table error "
            r2.<init>(r3)     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00ae }
            r2.append(r0)     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00ae }
            com.umeng.analytics.pro.by.e((java.lang.String) r0)     // Catch:{ all -> 0x00ae }
            if (r1 == 0) goto L_0x00cd
            r1.close()
            return
        L_0x00cd:
            return
        L_0x00ce:
            if (r4 == 0) goto L_0x00d3
            r4.close()
        L_0x00d3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.a.a(android.database.sqlite.SQLiteDatabase, java.util.Map, com.umeng.analytics.pro.f):void");
    }

    public static void a(f fVar, SQLiteDatabase sQLiteDatabase, List<String> list) {
        try {
            sQLiteDatabase.beginTransaction();
            if (c(sQLiteDatabase, "limitedck") > 0) {
                b(sQLiteDatabase, "limitedck");
            }
            for (String put : list) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("ck", put);
                sQLiteDatabase.insert("limitedck", null, contentValues);
            }
            sQLiteDatabase.setTransactionSuccessful();
            fVar.a("success", false);
        } catch (SQLException e2) {
            by.e("insertToLimitCKTable error " + e2.toString());
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public static void a(SQLiteDatabase sQLiteDatabase, String str, long j, long j2) {
        try {
            int c2 = c(sQLiteDatabase, "system");
            int c3 = n.a().c();
            if (c2 < c3) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("key", str);
                contentValues.put("timeStamp", Long.valueOf(j2));
                contentValues.put("count", Long.valueOf(j));
                sQLiteDatabase.insert("system", null, contentValues);
            } else if (c2 == c3) {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("key", "__meta_ve_of");
                contentValues2.put("timeStamp", Long.valueOf(System.currentTimeMillis()));
                contentValues2.put("count", 1);
                sQLiteDatabase.insert("system", null, contentValues2);
            } else {
                d(sQLiteDatabase, "__meta_ve_of");
            }
        } catch (SQLException unused) {
        }
    }
}
