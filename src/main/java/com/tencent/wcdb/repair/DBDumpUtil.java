package com.tencent.wcdb.repair;

import com.tencent.wcdb.database.SQLiteDatabase;
import java.util.ArrayList;

public class DBDumpUtil {

    public interface ExecuteSqlCallback {
        String preExecute(String str);
    }

    private static native boolean nativeDumpDB(String str, String str2, String str3);

    private static native boolean nativeIsSqlComplete(String str);

    public static String getTableNameFromSql(String str) {
        if (str.length() > 100) {
            str = str.substring(0, 100);
        }
        String[] split = str.split("\\s");
        if (split == null || split.length <= 1) {
            return null;
        }
        return split[2].replaceAll("\"", "");
    }

    public static String buildColumnsString(ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append(arrayList.get(i));
            if (i != arrayList.size() - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        String sb2 = sb.toString();
        System.out.println(sb2);
        return sb2;
    }

    public static ArrayList<String> getColumnNamesFromSql(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] split = str.substring(str.indexOf("(") + 1, str.lastIndexOf(")")).trim().split(",");
        for (int i = 0; i < split.length; i++) {
            split[i] = split[i].trim();
            arrayList.add(split[i].substring(0, split[i].indexOf(" ")));
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053 A[SYNTHETIC, Splitter:B:22:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005a A[SYNTHETIC, Splitter:B:30:0x005a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] readFromFile(java.lang.String r9) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r9)
            boolean r1 = r0.exists()
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x001a
            java.lang.String r0 = "WCDB.DBDumpUtil"
            java.lang.String r1 = "readFromFile error, file is not exit, path = %s"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r9
            com.tencent.wcdb.support.Log.w(r0, r1, r3)
            return r4
        L_0x001a:
            long r5 = r0.length()     // Catch:{ Exception -> 0x0057, all -> 0x004f }
            int r1 = (int) r5     // Catch:{ Exception -> 0x0057, all -> 0x004f }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0057, all -> 0x004f }
            r5.<init>(r0)     // Catch:{ Exception -> 0x0057, all -> 0x004f }
            byte[] r0 = new byte[r1]     // Catch:{ Exception -> 0x0058, all -> 0x004d }
            int r6 = r5.read(r0)     // Catch:{ Exception -> 0x0058, all -> 0x004d }
            if (r6 == r1) goto L_0x0049
            java.lang.String r0 = "WCDB.DBDumpUtil"
            java.lang.String r7 = "readFromFile error, size is not equal, path = %s, file length is %d, count is %d"
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0058, all -> 0x004d }
            r8[r2] = r9     // Catch:{ Exception -> 0x0058, all -> 0x004d }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0058, all -> 0x004d }
            r8[r3] = r9     // Catch:{ Exception -> 0x0058, all -> 0x004d }
            r9 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0058, all -> 0x004d }
            r8[r9] = r1     // Catch:{ Exception -> 0x0058, all -> 0x004d }
            com.tencent.wcdb.support.Log.w(r0, r7, r8)     // Catch:{ Exception -> 0x0058, all -> 0x004d }
            r5.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            return r4
        L_0x0049:
            r5.close()     // Catch:{ IOException -> 0x004c }
        L_0x004c:
            return r0
        L_0x004d:
            r9 = move-exception
            goto L_0x0051
        L_0x004f:
            r9 = move-exception
            r5 = r4
        L_0x0051:
            if (r5 == 0) goto L_0x0056
            r5.close()     // Catch:{ IOException -> 0x0056 }
        L_0x0056:
            throw r9
        L_0x0057:
            r5 = r4
        L_0x0058:
            if (r5 == 0) goto L_0x005d
            r5.close()     // Catch:{ IOException -> 0x005d }
        L_0x005d:
            java.lang.String r9 = "WCDB.DBDumpUtil"
            java.lang.String r0 = "readFromFile failed!"
            com.tencent.wcdb.support.Log.e(r9, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.repair.DBDumpUtil.readFromFile(java.lang.String):byte[]");
    }

    public static boolean doRecoveryDb(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        return doRecoveryDb(sQLiteDatabase, str, str2, str3, null, null, null, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d4 A[Catch:{ IOException -> 0x01cd, all -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean doRecoveryDb(com.tencent.wcdb.database.SQLiteDatabase r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.util.List<java.lang.String> r21, java.util.List<java.lang.String> r22, com.tencent.wcdb.repair.DBDumpUtil.ExecuteSqlCallback r23, boolean r24) {
        /*
            r0 = r17
            r1 = r20
            r2 = r23
            r3 = 0
            if (r0 == 0) goto L_0x01e8
            boolean r4 = r17.isOpen()
            if (r4 != 0) goto L_0x0011
            goto L_0x01e8
        L_0x0011:
            boolean r4 = nativeDumpDB(r18, r19, r20)
            if (r4 != 0) goto L_0x0018
            return r3
        L_0x0018:
            r4 = 1
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ FileNotFoundException -> 0x01dc }
            java.io.FileReader r6 = new java.io.FileReader     // Catch:{ FileNotFoundException -> 0x01dc }
            r6.<init>(r1)     // Catch:{ FileNotFoundException -> 0x01dc }
            r5.<init>(r6)     // Catch:{ FileNotFoundException -> 0x01dc }
            java.lang.String r6 = "PRAGMA foreign_keys=OFF;"
            r0.execSQL(r6)
            r17.beginTransaction()
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ IOException -> 0x01cd }
            r6.<init>()     // Catch:{ IOException -> 0x01cd }
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
        L_0x0035:
            java.lang.String r13 = r5.readLine()     // Catch:{ IOException -> 0x01cd }
            if (r13 == 0) goto L_0x017c
            if (r8 == 0) goto L_0x0060
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01cd }
            r14.<init>()     // Catch:{ IOException -> 0x01cd }
            r14.append(r11)     // Catch:{ IOException -> 0x01cd }
            java.lang.String r11 = "\n"
            r14.append(r11)     // Catch:{ IOException -> 0x01cd }
            r14.append(r13)     // Catch:{ IOException -> 0x01cd }
            java.lang.String r11 = r14.toString()     // Catch:{ IOException -> 0x01cd }
            java.lang.String r13 = ";"
            boolean r13 = r11.endsWith(r13)     // Catch:{ IOException -> 0x01cd }
            if (r13 == 0) goto L_0x0035
            boolean r13 = nativeIsSqlComplete(r11)     // Catch:{ IOException -> 0x01cd }
            if (r13 != 0) goto L_0x0081
            goto L_0x0035
        L_0x0060:
            java.lang.String r14 = "INSERT"
            boolean r14 = r13.startsWith(r14)     // Catch:{ IOException -> 0x01cd }
            if (r14 != 0) goto L_0x0070
            java.lang.String r14 = "CREATE TABLE"
            boolean r14 = r13.startsWith(r14)     // Catch:{ IOException -> 0x01cd }
            if (r14 == 0) goto L_0x0035
        L_0x0070:
            java.lang.String r8 = ";"
            boolean r8 = r13.endsWith(r8)     // Catch:{ IOException -> 0x01cd }
            if (r8 == 0) goto L_0x015c
            boolean r8 = nativeIsSqlComplete(r13)     // Catch:{ IOException -> 0x01cd }
            if (r8 != 0) goto L_0x0080
            goto L_0x015c
        L_0x0080:
            r11 = r13
        L_0x0081:
            if (r22 == 0) goto L_0x00a6
            int r13 = r22.size()     // Catch:{ IOException -> 0x01cd }
            if (r13 <= 0) goto L_0x00a6
            java.lang.String r13 = getTableNameFromSql(r11)     // Catch:{ IOException -> 0x01cd }
            java.util.Iterator r14 = r22.iterator()     // Catch:{ IOException -> 0x01cd }
        L_0x0091:
            boolean r15 = r14.hasNext()     // Catch:{ IOException -> 0x01cd }
            if (r15 == 0) goto L_0x00a4
            java.lang.Object r15 = r14.next()     // Catch:{ IOException -> 0x01cd }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ IOException -> 0x01cd }
            boolean r15 = r13.equals(r15)     // Catch:{ IOException -> 0x01cd }
            if (r15 == 0) goto L_0x0091
            goto L_0x00ce
        L_0x00a4:
            r7 = 1
            goto L_0x00d2
        L_0x00a6:
            if (r21 == 0) goto L_0x00d0
            int r13 = r21.size()     // Catch:{ IOException -> 0x01cd }
            if (r13 <= 0) goto L_0x00d0
            java.lang.String r13 = getTableNameFromSql(r11)     // Catch:{ IOException -> 0x01cd }
            java.util.Iterator r15 = r21.iterator()     // Catch:{ IOException -> 0x01cd }
        L_0x00b6:
            boolean r16 = r15.hasNext()     // Catch:{ IOException -> 0x01cd }
            if (r16 == 0) goto L_0x00ce
            java.lang.Object r16 = r15.next()     // Catch:{ IOException -> 0x01cd }
            r7 = r16
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IOException -> 0x01cd }
            boolean r7 = r13.equals(r7)     // Catch:{ IOException -> 0x01cd }
            if (r7 == 0) goto L_0x00b6
            java.lang.String r7 = ""
            r11 = r7
            goto L_0x00a4
        L_0x00ce:
            r7 = 0
            goto L_0x00d2
        L_0x00d0:
            r7 = 0
            r13 = 0
        L_0x00d2:
            if (r7 == 0) goto L_0x00e2
            java.lang.String r7 = "WCDB.DBDumpUtil"
            java.lang.String r15 = "filter table %s"
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x01cd }
            r8[r3] = r13     // Catch:{ IOException -> 0x01cd }
            com.tencent.wcdb.support.Log.i(r7, r15, r8)     // Catch:{ IOException -> 0x01cd }
            r8 = 0
            goto L_0x0035
        L_0x00e2:
            java.lang.String r7 = "CREATE TABLE"
            boolean r7 = r11.startsWith(r7)     // Catch:{ Exception -> 0x0156 }
            if (r7 == 0) goto L_0x00f6
            java.util.ArrayList r7 = getColumnNamesFromSql(r11)     // Catch:{ Exception -> 0x0156 }
            java.lang.String r7 = buildColumnsString(r7)     // Catch:{ Exception -> 0x0156 }
            r6.put(r13, r7)     // Catch:{ Exception -> 0x0156 }
            goto L_0x012d
        L_0x00f6:
            java.lang.String r7 = "INSERT INTO"
            boolean r7 = r11.startsWith(r7)     // Catch:{ Exception -> 0x0156 }
            if (r7 == 0) goto L_0x012d
            java.lang.Object r7 = r6.get(r13)     // Catch:{ Exception -> 0x0156 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0156 }
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x0156 }
            if (r8 != 0) goto L_0x012d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0156 }
            java.lang.String r15 = "INSERT INTO "
            r8.<init>(r15)     // Catch:{ Exception -> 0x0156 }
            java.lang.String r15 = "\""
            r8.append(r15)     // Catch:{ Exception -> 0x0156 }
            r8.append(r13)     // Catch:{ Exception -> 0x0156 }
            java.lang.String r13 = "\""
            r8.append(r13)     // Catch:{ Exception -> 0x0156 }
            java.lang.String r13 = r8.toString()     // Catch:{ Exception -> 0x0156 }
            r8.append(r7)     // Catch:{ Exception -> 0x0156 }
            java.lang.String r7 = r8.toString()     // Catch:{ Exception -> 0x0156 }
            java.lang.String r11 = r11.replace(r13, r7)     // Catch:{ Exception -> 0x0156 }
        L_0x012d:
            if (r2 == 0) goto L_0x0134
            java.lang.String r7 = r2.preExecute(r11)     // Catch:{ Exception -> 0x0156 }
            goto L_0x0135
        L_0x0134:
            r7 = 0
        L_0x0135:
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x0156 }
            if (r8 != 0) goto L_0x013c
            r11 = r7
        L_0x013c:
            int r9 = r9 + 1
            r0.execSQL(r11)     // Catch:{ Exception -> 0x0156 }
            int r7 = r12 + 1
            r8 = 100
            if (r7 < r8) goto L_0x0154
            r17.setTransactionSuccessful()     // Catch:{ Exception -> 0x0152 }
            r17.endTransaction()     // Catch:{ Exception -> 0x0152 }
            r17.beginTransaction()     // Catch:{ Exception -> 0x0152 }
            r7 = 0
            goto L_0x0154
        L_0x0152:
            r12 = r7
            goto L_0x0156
        L_0x0154:
            r12 = r7
            goto L_0x0158
        L_0x0156:
            int r10 = r10 + 1
        L_0x0158:
            r8 = 0
            r11 = 0
            goto L_0x0035
        L_0x015c:
            boolean r7 = android.text.TextUtils.isEmpty(r11)     // Catch:{ IOException -> 0x01cd }
            if (r7 == 0) goto L_0x0164
            r11 = r13
            goto L_0x0179
        L_0x0164:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01cd }
            r7.<init>()     // Catch:{ IOException -> 0x01cd }
            r7.append(r11)     // Catch:{ IOException -> 0x01cd }
            java.lang.String r8 = "\n"
            r7.append(r8)     // Catch:{ IOException -> 0x01cd }
            r7.append(r13)     // Catch:{ IOException -> 0x01cd }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x01cd }
            r11 = r7
        L_0x0179:
            r8 = 1
            goto L_0x0035
        L_0x017c:
            r5.close()     // Catch:{ IOException -> 0x017f }
        L_0x017f:
            if (r9 <= r10) goto L_0x01ca
            boolean r2 = r17.inTransaction()
            if (r2 == 0) goto L_0x018a
            r17.setTransactionSuccessful()
        L_0x018a:
            boolean r2 = r17.inTransaction()
            if (r2 == 0) goto L_0x0193
            r17.endTransaction()
        L_0x0193:
            if (r24 == 0) goto L_0x01b3
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x01a3
            r0.delete()
        L_0x01a3:
            java.io.File r0 = new java.io.File
            r1 = r18
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x01b3
            r0.delete()
        L_0x01b3:
            java.lang.String r0 = "WCDB.DBDumpUtil"
            java.lang.String r1 = "restore : %d , fail:%d "
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r2[r3] = r5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r2[r4] = r3
            com.tencent.wcdb.support.Log.i(r0, r1, r2)
            return r4
        L_0x01ca:
            return r3
        L_0x01cb:
            r0 = move-exception
            goto L_0x01d8
        L_0x01cd:
            java.lang.String r0 = "WCDB.DBDumpUtil"
            java.lang.String r1 = "I/O error in read sql file "
            com.tencent.wcdb.support.Log.w(r0, r1)     // Catch:{ all -> 0x01cb }
            r5.close()     // Catch:{ IOException -> 0x01d7 }
        L_0x01d7:
            return r3
        L_0x01d8:
            r5.close()     // Catch:{ IOException -> 0x01db }
        L_0x01db:
            throw r0
        L_0x01dc:
            java.lang.String r0 = "WCDB.DBDumpUtil"
            java.lang.String r2 = "SQL file '%s' not found"
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r1
            com.tencent.wcdb.support.Log.w(r0, r2, r4)
            return r3
        L_0x01e8:
            java.lang.String r0 = "WCDB.DBDumpUtil"
            java.lang.String r1 = "Database is not open"
            com.tencent.wcdb.support.Log.w(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.repair.DBDumpUtil.doRecoveryDb(com.tencent.wcdb.database.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, com.tencent.wcdb.repair.DBDumpUtil$ExecuteSqlCallback, boolean):boolean");
    }
}
