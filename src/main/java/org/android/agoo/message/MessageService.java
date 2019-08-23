package org.android.agoo.message;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import java.util.HashMap;
import java.util.Map;
import org.android.agoo.common.MsgDO;
import org.json.JSONArray;
import org.json.JSONObject;

public class MessageService {

    /* renamed from: a  reason: collision with root package name */
    private static Context f84031a;

    /* renamed from: c  reason: collision with root package name */
    private static Map<String, Integer> f84032c;

    /* renamed from: b  reason: collision with root package name */
    private volatile SQLiteOpenHelper f84033b;

    static class a extends SQLiteOpenHelper {
        public SQLiteDatabase getWritableDatabase() {
            if (!com.taobao.accs.utl.a.a(super.getWritableDatabase().getPath(), 102400)) {
                return null;
            }
            return super.getWritableDatabase();
        }

        private String a() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("create table accs_message");
            stringBuffer.append("(");
            stringBuffer.append("id text UNIQUE not null,");
            stringBuffer.append("state text,");
            stringBuffer.append("message text,");
            stringBuffer.append("create_time date");
            stringBuffer.append(");");
            return stringBuffer.toString();
        }

        private String b() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("create table message");
            stringBuffer.append("(");
            stringBuffer.append("id text UNIQUE not null,");
            stringBuffer.append("state integer,");
            stringBuffer.append("body_code integer,");
            stringBuffer.append("report long,");
            stringBuffer.append("target_time long,");
            stringBuffer.append("interval integer,");
            stringBuffer.append("type text,");
            stringBuffer.append("message text,");
            stringBuffer.append("notify integer,");
            stringBuffer.append("create_time date");
            stringBuffer.append(");");
            return stringBuffer.toString();
        }

        public a(Context context) {
            super(context, "message_accs_db", null, 3);
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.execSQL(b());
                    sQLiteDatabase.execSQL("CREATE INDEX id_index ON message(id)");
                    sQLiteDatabase.execSQL("CREATE INDEX body_code_index ON message(body_code)");
                    sQLiteDatabase.execSQL(a());
                } catch (Throwable th) {
                    ALog.e("MessageService", "messagedbhelper create", th, new Object[0]);
                }
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.execSQL("delete from message where create_time< date('now','-7 day') and state=1");
                } catch (Throwable th) {
                    ALog.e("MessageService", "MessageService onUpgrade is error", th, new Object[0]);
                    return;
                }
            }
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS accs_message");
            sQLiteDatabase.execSQL(a());
            return;
            throw th;
        }
    }

    public void a(String str, String str2, String str3, int i) {
        a(str, str2, str3, 1, -1, -1, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005f, code lost:
        if (r4 != null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0061, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0067, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0069, code lost:
        r9 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006a, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x007d, code lost:
        if (r4 == null) goto L_0x0080;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0069 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0002] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x006d A[SYNTHETIC, Splitter:B:42:0x006d] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0072 A[Catch:{ Throwable -> 0x0075 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x007a A[SYNTHETIC, Splitter:B:52:0x007a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            java.util.Map<java.lang.String, java.lang.Integer> r2 = f84032c     // Catch:{ Throwable -> 0x0076, all -> 0x0069 }
            boolean r2 = r2.containsKey(r9)     // Catch:{ Throwable -> 0x0076, all -> 0x0069 }
            r3 = 1
            if (r2 == 0) goto L_0x002a
            com.taobao.accs.utl.ALog$Level r2 = com.taobao.accs.utl.ALog.Level.E     // Catch:{ Throwable -> 0x0076, all -> 0x0069 }
            boolean r2 = com.taobao.accs.utl.ALog.isPrintLog(r2)     // Catch:{ Throwable -> 0x0076, all -> 0x0069 }
            if (r2 == 0) goto L_0x0028
            java.lang.String r2 = "MessageService"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0076, all -> 0x0069 }
            java.lang.String r5 = "hasMessageDuplicate,msgid="
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0076, all -> 0x0069 }
            r4.append(r9)     // Catch:{ Throwable -> 0x0076, all -> 0x0069 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0076, all -> 0x0069 }
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x0076, all -> 0x0069 }
            com.taobao.accs.utl.ALog.e(r2, r4, r5)     // Catch:{ Throwable -> 0x0076, all -> 0x0069 }
        L_0x0028:
            r2 = 1
            goto L_0x002b
        L_0x002a:
            r2 = 0
        L_0x002b:
            android.database.sqlite.SQLiteOpenHelper r4 = r8.f84033b     // Catch:{ Throwable -> 0x0067, all -> 0x0069 }
            android.database.sqlite.SQLiteDatabase r4 = r4.getReadableDatabase()     // Catch:{ Throwable -> 0x0067, all -> 0x0069 }
            if (r4 != 0) goto L_0x0039
            if (r4 == 0) goto L_0x0038
            r4.close()     // Catch:{ Throwable -> 0x0038 }
        L_0x0038:
            return r2
        L_0x0039:
            java.lang.String r5 = "select count(1) from message where id = ?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ Throwable -> 0x0078, all -> 0x0065 }
            r6[r1] = r9     // Catch:{ Throwable -> 0x0078, all -> 0x0065 }
            android.database.Cursor r9 = r4.rawQuery(r5, r6)     // Catch:{ Throwable -> 0x0078, all -> 0x0065 }
            if (r9 == 0) goto L_0x005a
            boolean r0 = r9.moveToFirst()     // Catch:{ Throwable -> 0x0058, all -> 0x0053 }
            if (r0 == 0) goto L_0x005a
            int r0 = r9.getInt(r1)     // Catch:{ Throwable -> 0x0058, all -> 0x0053 }
            if (r0 <= 0) goto L_0x005a
            r2 = 1
            goto L_0x005a
        L_0x0053:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
            goto L_0x006b
        L_0x0058:
            r0 = r9
            goto L_0x0078
        L_0x005a:
            if (r9 == 0) goto L_0x005f
            r9.close()     // Catch:{ Throwable -> 0x0080 }
        L_0x005f:
            if (r4 == 0) goto L_0x0080
        L_0x0061:
            r4.close()     // Catch:{ Throwable -> 0x0080 }
            goto L_0x0080
        L_0x0065:
            r9 = move-exception
            goto L_0x006b
        L_0x0067:
            r4 = r0
            goto L_0x0078
        L_0x0069:
            r9 = move-exception
            r4 = r0
        L_0x006b:
            if (r0 == 0) goto L_0x0070
            r0.close()     // Catch:{ Throwable -> 0x0075 }
        L_0x0070:
            if (r4 == 0) goto L_0x0075
            r4.close()     // Catch:{ Throwable -> 0x0075 }
        L_0x0075:
            throw r9
        L_0x0076:
            r4 = r0
            r2 = 0
        L_0x0078:
            if (r0 == 0) goto L_0x007d
            r0.close()     // Catch:{ Throwable -> 0x0080 }
        L_0x007d:
            if (r4 == 0) goto L_0x0080
            goto L_0x0061
        L_0x0080:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.message.MessageService.a(java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0079, code lost:
        if (r4 != null) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007b, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0081, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0083, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0084, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0097, code lost:
        if (r4 == null) goto L_0x009a;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0083 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0002] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0087 A[SYNTHETIC, Splitter:B:44:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008c A[Catch:{ Throwable -> 0x008f }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0094 A[SYNTHETIC, Splitter:B:54:0x0094] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(java.lang.String r8, int r9) {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
            java.util.Map<java.lang.String, java.lang.Integer> r2 = f84032c     // Catch:{ Throwable -> 0x0090, all -> 0x0083 }
            boolean r2 = r2.containsKey(r8)     // Catch:{ Throwable -> 0x0090, all -> 0x0083 }
            r3 = 1
            if (r2 == 0) goto L_0x0036
            java.util.Map<java.lang.String, java.lang.Integer> r2 = f84032c     // Catch:{ Throwable -> 0x0090, all -> 0x0083 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ Throwable -> 0x0090, all -> 0x0083 }
            boolean r2 = r2.containsValue(r4)     // Catch:{ Throwable -> 0x0090, all -> 0x0083 }
            if (r2 == 0) goto L_0x0036
            com.taobao.accs.utl.ALog$Level r2 = com.taobao.accs.utl.ALog.Level.I     // Catch:{ Throwable -> 0x0090, all -> 0x0083 }
            boolean r2 = com.taobao.accs.utl.ALog.isPrintLog(r2)     // Catch:{ Throwable -> 0x0090, all -> 0x0083 }
            if (r2 == 0) goto L_0x0034
            java.lang.String r2 = "MessageService"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0090, all -> 0x0083 }
            java.lang.String r5 = "addMessage,messageStores hasMessageDuplicate,msgid="
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0090, all -> 0x0083 }
            r4.append(r8)     // Catch:{ Throwable -> 0x0090, all -> 0x0083 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0090, all -> 0x0083 }
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x0090, all -> 0x0083 }
            com.taobao.accs.utl.ALog.i(r2, r4, r5)     // Catch:{ Throwable -> 0x0090, all -> 0x0083 }
        L_0x0034:
            r2 = 1
            goto L_0x0037
        L_0x0036:
            r2 = 0
        L_0x0037:
            android.database.sqlite.SQLiteOpenHelper r4 = r7.f84033b     // Catch:{ Throwable -> 0x0081, all -> 0x0083 }
            android.database.sqlite.SQLiteDatabase r4 = r4.getReadableDatabase()     // Catch:{ Throwable -> 0x0081, all -> 0x0083 }
            if (r4 != 0) goto L_0x0045
            if (r4 == 0) goto L_0x0044
            r4.close()     // Catch:{ Throwable -> 0x0044 }
        L_0x0044:
            return r2
        L_0x0045:
            java.lang.String r5 = "select count(1) from message where id = ? and body_code=? create_time< date('now','-1 day')"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ Throwable -> 0x0092, all -> 0x007f }
            r6[r1] = r8     // Catch:{ Throwable -> 0x0092, all -> 0x007f }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0092, all -> 0x007f }
            r8.<init>()     // Catch:{ Throwable -> 0x0092, all -> 0x007f }
            r8.append(r9)     // Catch:{ Throwable -> 0x0092, all -> 0x007f }
            java.lang.String r8 = r8.toString()     // Catch:{ Throwable -> 0x0092, all -> 0x007f }
            r6[r3] = r8     // Catch:{ Throwable -> 0x0092, all -> 0x007f }
            android.database.Cursor r8 = r4.rawQuery(r5, r6)     // Catch:{ Throwable -> 0x0092, all -> 0x007f }
            if (r8 == 0) goto L_0x0074
            boolean r9 = r8.moveToFirst()     // Catch:{ Throwable -> 0x0072, all -> 0x006e }
            if (r9 == 0) goto L_0x0074
            int r9 = r8.getInt(r1)     // Catch:{ Throwable -> 0x0072, all -> 0x006e }
            if (r9 <= 0) goto L_0x0074
            r2 = 1
            goto L_0x0074
        L_0x006e:
            r9 = move-exception
            r0 = r8
            r8 = r9
            goto L_0x0085
        L_0x0072:
            r0 = r8
            goto L_0x0092
        L_0x0074:
            if (r8 == 0) goto L_0x0079
            r8.close()     // Catch:{ Throwable -> 0x009a }
        L_0x0079:
            if (r4 == 0) goto L_0x009a
        L_0x007b:
            r4.close()     // Catch:{ Throwable -> 0x009a }
            goto L_0x009a
        L_0x007f:
            r8 = move-exception
            goto L_0x0085
        L_0x0081:
            r4 = r0
            goto L_0x0092
        L_0x0083:
            r8 = move-exception
            r4 = r0
        L_0x0085:
            if (r0 == 0) goto L_0x008a
            r0.close()     // Catch:{ Throwable -> 0x008f }
        L_0x008a:
            if (r4 == 0) goto L_0x008f
            r4.close()     // Catch:{ Throwable -> 0x008f }
        L_0x008f:
            throw r8
        L_0x0090:
            r4 = r0
            r2 = 0
        L_0x0092:
            if (r0 == 0) goto L_0x0097
            r0.close()     // Catch:{ Throwable -> 0x009a }
        L_0x0097:
            if (r4 == 0) goto L_0x009a
            goto L_0x007b
        L_0x009a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.message.MessageService.a(java.lang.String, int):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x003a A[SYNTHETIC, Splitter:B:28:0x003a] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0043 A[SYNTHETIC, Splitter:B:35:0x0043] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r6 = this;
            r0 = 0
            android.database.sqlite.SQLiteOpenHelper r1 = r6.f84033b     // Catch:{ Throwable -> 0x002a, all -> 0x0025 }
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch:{ Throwable -> 0x002a, all -> 0x0025 }
            if (r1 != 0) goto L_0x0011
            if (r1 == 0) goto L_0x0010
            r1.close()     // Catch:{ Throwable -> 0x000f }
            goto L_0x0010
        L_0x000f:
            return
        L_0x0010:
            return
        L_0x0011:
            java.lang.String r0 = "delete from message where create_time< date('now','-7 day') and state=1"
            r1.execSQL(r0)     // Catch:{ Throwable -> 0x0023 }
            java.lang.String r0 = "delete from accs_message where create_time< date('now','-1 day') "
            r1.execSQL(r0)     // Catch:{ Throwable -> 0x0023 }
            if (r1 == 0) goto L_0x0022
            r1.close()     // Catch:{ Throwable -> 0x0021 }
            goto L_0x0022
        L_0x0021:
            return
        L_0x0022:
            return
        L_0x0023:
            r0 = move-exception
            goto L_0x002e
        L_0x0025:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x0041
        L_0x002a:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x002e:
            java.lang.String r2 = "MessageService"
            java.lang.String r3 = "deleteCacheMessage sql Throwable"
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0040 }
            com.taobao.accs.utl.ALog.e(r2, r3, r0, r4)     // Catch:{ all -> 0x0040 }
            if (r1 == 0) goto L_0x003f
            r1.close()     // Catch:{ Throwable -> 0x003e }
            goto L_0x003f
        L_0x003e:
            return
        L_0x003f:
            return
        L_0x0040:
            r0 = move-exception
        L_0x0041:
            if (r1 == 0) goto L_0x0046
            r1.close()     // Catch:{ Throwable -> 0x0046 }
        L_0x0046:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.message.MessageService.a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x012f, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0130, code lost:
        r4 = null;
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0133, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0134, code lost:
        r4 = null;
        r0 = r3;
        r3 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012f A[ExcHandler: all (r3v10 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:12:0x002f] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x014a A[Catch:{ all -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0161 A[SYNTHETIC, Splitter:B:70:0x0161] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0169 A[Catch:{ Throwable -> 0x0165 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0183 A[SYNTHETIC, Splitter:B:82:0x0183] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x018b A[Catch:{ Throwable -> 0x0187 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<org.android.agoo.common.MsgDO> b() {
        /*
            r15 = this;
            r0 = 0
            r1 = 0
            android.database.sqlite.SQLiteOpenHelper r2 = r15.f84033b     // Catch:{ Throwable -> 0x013d, all -> 0x0138 }
            android.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()     // Catch:{ Throwable -> 0x013d, all -> 0x0138 }
            if (r2 != 0) goto L_0x002f
            if (r2 == 0) goto L_0x002e
            r2.close()     // Catch:{ Throwable -> 0x0010 }
            goto L_0x002e
        L_0x0010:
            r2 = move-exception
            com.taobao.accs.utl.ALog$Level r3 = com.taobao.accs.utl.ALog.Level.E
            boolean r3 = com.taobao.accs.utl.ALog.isPrintLog(r3)
            if (r3 == 0) goto L_0x002e
            java.lang.String r3 = "MessageService"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "getUnReportMsg close cursor or db, e: "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.taobao.accs.utl.ALog.e(r3, r2, r1)
        L_0x002e:
            return r0
        L_0x002f:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Throwable -> 0x0133, all -> 0x012f }
            r3.<init>()     // Catch:{ Throwable -> 0x0133, all -> 0x012f }
            java.lang.String r4 = "select * from accs_message where state = ? or state = ? or state = ?"
            r5 = 3
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ Throwable -> 0x012a, all -> 0x012f }
            java.lang.String r6 = "0"
            r5[r1] = r6     // Catch:{ Throwable -> 0x012a, all -> 0x012f }
            r6 = 1
            java.lang.String r7 = "2"
            r5[r6] = r7     // Catch:{ Throwable -> 0x012a, all -> 0x012f }
            r6 = 2
            java.lang.String r7 = "3"
            r5[r6] = r7     // Catch:{ Throwable -> 0x012a, all -> 0x012f }
            android.database.Cursor r4 = r2.rawQuery(r4, r5)     // Catch:{ Throwable -> 0x012a, all -> 0x012f }
            if (r4 == 0) goto L_0x00fc
            java.lang.String r5 = "id"
            int r5 = r4.getColumnIndex(r5)     // Catch:{ Throwable -> 0x00fa }
            java.lang.String r6 = "state"
            int r6 = r4.getColumnIndex(r6)     // Catch:{ Throwable -> 0x00fa }
            java.lang.String r7 = "message"
            int r7 = r4.getColumnIndex(r7)     // Catch:{ Throwable -> 0x00fa }
            java.lang.String r8 = "create_time"
            int r8 = r4.getColumnIndex(r8)     // Catch:{ Throwable -> 0x00fa }
        L_0x0065:
            boolean r9 = r4.moveToNext()     // Catch:{ Throwable -> 0x00fa }
            if (r9 == 0) goto L_0x00fc
            java.lang.String r9 = r4.getString(r7)     // Catch:{ Throwable -> 0x00fa }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Throwable -> 0x00fa }
            if (r9 != 0) goto L_0x00fc
            java.lang.String r9 = r4.getString(r6)     // Catch:{ Throwable -> 0x00fa }
            java.lang.String r10 = r4.getString(r7)     // Catch:{ Throwable -> 0x00fa }
            com.taobao.accs.utl.ALog$Level r11 = com.taobao.accs.utl.ALog.Level.I     // Catch:{ Throwable -> 0x00fa }
            boolean r11 = com.taobao.accs.utl.ALog.isPrintLog(r11)     // Catch:{ Throwable -> 0x00fa }
            if (r11 == 0) goto L_0x00ba
            java.lang.String r11 = "MessageService"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00fa }
            java.lang.String r13 = "state: "
            r12.<init>(r13)     // Catch:{ Throwable -> 0x00fa }
            r12.append(r9)     // Catch:{ Throwable -> 0x00fa }
            java.lang.String r13 = " ,cursor.message:"
            r12.append(r13)     // Catch:{ Throwable -> 0x00fa }
            r12.append(r10)     // Catch:{ Throwable -> 0x00fa }
            java.lang.String r13 = " ,cursor.id:"
            r12.append(r13)     // Catch:{ Throwable -> 0x00fa }
            java.lang.String r13 = r4.getString(r5)     // Catch:{ Throwable -> 0x00fa }
            r12.append(r13)     // Catch:{ Throwable -> 0x00fa }
            java.lang.String r13 = " ,cursor.time:"
            r12.append(r13)     // Catch:{ Throwable -> 0x00fa }
            java.lang.String r13 = r4.getString(r8)     // Catch:{ Throwable -> 0x00fa }
            r12.append(r13)     // Catch:{ Throwable -> 0x00fa }
            java.lang.String r12 = r12.toString()     // Catch:{ Throwable -> 0x00fa }
            java.lang.Object[] r13 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x00fa }
            com.taobao.accs.utl.ALog.i(r11, r12, r13)     // Catch:{ Throwable -> 0x00fa }
        L_0x00ba:
            java.lang.String r11 = "0"
            boolean r11 = android.text.TextUtils.equals(r11, r9)     // Catch:{ Throwable -> 0x00fa }
            if (r11 == 0) goto L_0x00c5
            java.lang.String r9 = "4"
            goto L_0x00dc
        L_0x00c5:
            java.lang.String r11 = "2"
            boolean r11 = android.text.TextUtils.equals(r11, r9)     // Catch:{ Throwable -> 0x00fa }
            if (r11 == 0) goto L_0x00d0
            java.lang.String r9 = "8"
            goto L_0x00dc
        L_0x00d0:
            java.lang.String r11 = "3"
            boolean r9 = android.text.TextUtils.equals(r11, r9)     // Catch:{ Throwable -> 0x00fa }
            if (r9 == 0) goto L_0x00db
            java.lang.String r9 = "9"
            goto L_0x00dc
        L_0x00db:
            r9 = r0
        L_0x00dc:
            org.android.agoo.common.MsgDO r11 = new org.android.agoo.common.MsgDO     // Catch:{ Throwable -> 0x00fa }
            r11.<init>()     // Catch:{ Throwable -> 0x00fa }
            boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch:{ Throwable -> 0x00fa }
            if (r11 != 0) goto L_0x0065
            boolean r11 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Throwable -> 0x00fa }
            if (r11 != 0) goto L_0x0065
            org.android.agoo.common.MsgDO r9 = r15.b(r10, r9)     // Catch:{ Throwable -> 0x00fa }
            java.lang.String r10 = "cache"
            r9.messageSource = r10     // Catch:{ Throwable -> 0x00fa }
            r3.add(r9)     // Catch:{ Throwable -> 0x00fa }
            goto L_0x0065
        L_0x00fa:
            r0 = move-exception
            goto L_0x0142
        L_0x00fc:
            if (r4 == 0) goto L_0x0104
            r4.close()     // Catch:{ Throwable -> 0x0102 }
            goto L_0x0104
        L_0x0102:
            r0 = move-exception
            goto L_0x010b
        L_0x0104:
            if (r2 == 0) goto L_0x017f
            r2.close()     // Catch:{ Throwable -> 0x0102 }
            goto L_0x017f
        L_0x010b:
            com.taobao.accs.utl.ALog$Level r2 = com.taobao.accs.utl.ALog.Level.E
            boolean r2 = com.taobao.accs.utl.ALog.isPrintLog(r2)
            if (r2 == 0) goto L_0x017f
            java.lang.String r2 = "MessageService"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "getUnReportMsg close cursor or db, e: "
            r4.<init>(r5)
        L_0x011c:
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.taobao.accs.utl.ALog.e(r2, r0, r1)
            goto L_0x017f
        L_0x012a:
            r4 = move-exception
            r14 = r4
            r4 = r0
            r0 = r14
            goto L_0x0142
        L_0x012f:
            r3 = move-exception
            r4 = r0
            r0 = r3
            goto L_0x0181
        L_0x0133:
            r3 = move-exception
            r4 = r0
            r0 = r3
            r3 = r4
            goto L_0x0142
        L_0x0138:
            r2 = move-exception
            r4 = r0
            r0 = r2
            r2 = r4
            goto L_0x0181
        L_0x013d:
            r2 = move-exception
            r3 = r0
            r4 = r3
            r0 = r2
            r2 = r4
        L_0x0142:
            com.taobao.accs.utl.ALog$Level r5 = com.taobao.accs.utl.ALog.Level.E     // Catch:{ all -> 0x0180 }
            boolean r5 = com.taobao.accs.utl.ALog.isPrintLog(r5)     // Catch:{ all -> 0x0180 }
            if (r5 == 0) goto L_0x015f
            java.lang.String r5 = "MessageService"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0180 }
            java.lang.String r7 = "getUnReportMsg, e: "
            r6.<init>(r7)     // Catch:{ all -> 0x0180 }
            r6.append(r0)     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0180 }
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x0180 }
            com.taobao.accs.utl.ALog.e(r5, r0, r6)     // Catch:{ all -> 0x0180 }
        L_0x015f:
            if (r4 == 0) goto L_0x0167
            r4.close()     // Catch:{ Throwable -> 0x0165 }
            goto L_0x0167
        L_0x0165:
            r0 = move-exception
            goto L_0x016d
        L_0x0167:
            if (r2 == 0) goto L_0x017f
            r2.close()     // Catch:{ Throwable -> 0x0165 }
            goto L_0x017f
        L_0x016d:
            com.taobao.accs.utl.ALog$Level r2 = com.taobao.accs.utl.ALog.Level.E
            boolean r2 = com.taobao.accs.utl.ALog.isPrintLog(r2)
            if (r2 == 0) goto L_0x017f
            java.lang.String r2 = "MessageService"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "getUnReportMsg close cursor or db, e: "
            r4.<init>(r5)
            goto L_0x011c
        L_0x017f:
            return r3
        L_0x0180:
            r0 = move-exception
        L_0x0181:
            if (r4 == 0) goto L_0x0189
            r4.close()     // Catch:{ Throwable -> 0x0187 }
            goto L_0x0189
        L_0x0187:
            r2 = move-exception
            goto L_0x018f
        L_0x0189:
            if (r2 == 0) goto L_0x01ac
            r2.close()     // Catch:{ Throwable -> 0x0187 }
            goto L_0x01ac
        L_0x018f:
            com.taobao.accs.utl.ALog$Level r3 = com.taobao.accs.utl.ALog.Level.E
            boolean r3 = com.taobao.accs.utl.ALog.isPrintLog(r3)
            if (r3 == 0) goto L_0x01ac
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "getUnReportMsg close cursor or db, e: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "MessageService"
            com.taobao.accs.utl.ALog.e(r3, r2, r1)
        L_0x01ac:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.message.MessageService.b():java.util.ArrayList");
    }

    public void a(Context context) {
        f84032c = new HashMap();
        f84031a = context;
        this.f84033b = new a(context);
    }

    private String a(Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace != null && stackTrace.length > 0) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                stringBuffer.append(stackTraceElement.toString());
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }

    public static final boolean a(Context context, String str) {
        try {
            if (context.getPackageManager().getApplicationInfo(str, 0) != null) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static Bundle a(long j, MsgDO msgDO) {
        Bundle bundle = new Bundle();
        try {
            char[] charArray = Long.toBinaryString(j).toCharArray();
            if (charArray != null && 8 <= charArray.length) {
                if (8 <= charArray.length) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Integer.parseInt(charArray[1] + charArray[2] + charArray[3] + charArray[4], 2));
                    bundle.putString("encrypted", sb.toString());
                    if (charArray[6] == '1') {
                        bundle.putString("report", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                        msgDO.reportStr = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                    }
                    if (charArray[7] == '1') {
                        bundle.putString("notify", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                    }
                }
                if (9 <= charArray.length && charArray[8] == '1') {
                    bundle.putString("has_test", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                }
                if (10 <= charArray.length && charArray[9] == '1') {
                    bundle.putString("duplicate", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                }
                if (11 <= charArray.length && charArray[10] == '1') {
                    bundle.putInt("popup", 1);
                }
            }
        } catch (Throwable unused) {
        }
        return bundle;
    }

    private MsgDO b(String str, String str2) {
        boolean z;
        String str3 = str;
        int i = 0;
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.i("MessageService", "msgRecevie,message--->[" + str3 + "],utdid=" + com.taobao.accs.utl.a.b(f84031a), new Object[0]);
        }
        if (TextUtils.isEmpty(str)) {
            UTMini.getInstance().commitEvent(66002, "accs.dealMessage", com.taobao.accs.utl.a.b(f84031a), "message==null");
            if (ALog.isPrintLog(ALog.Level.I)) {
                ALog.i("MessageService", "handleMessage message==null,utdid=" + com.taobao.accs.utl.a.b(f84031a), new Object[0]);
            }
            return null;
        }
        MsgDO msgDO = new MsgDO();
        try {
            JSONArray jSONArray = new JSONArray(str3);
            int length = jSONArray.length();
            new Bundle();
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            String str4 = null;
            int i2 = 0;
            while (i2 < length) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                if (jSONObject != null) {
                    String string = jSONObject.getString("p");
                    String string2 = jSONObject.getString("i");
                    String string3 = jSONObject.getString("b");
                    long j = jSONObject.getLong("f");
                    sb.append(string2);
                    if (!jSONObject.isNull("ext")) {
                        str4 = jSONObject.getString("ext");
                    }
                    int i3 = length - 1;
                    if (i2 < i3) {
                        sb.append(",");
                    }
                    msgDO.msgIds = string2;
                    msgDO.extData = str4;
                    msgDO.messageSource = "accs";
                    msgDO.type = "cache";
                    if (TextUtils.isEmpty(string3)) {
                        msgDO.errorCode = "11";
                    } else if (TextUtils.isEmpty(string)) {
                        msgDO.errorCode = "12";
                    } else if (j == -1) {
                        msgDO.errorCode = "13";
                    } else if (!a(f84031a, string)) {
                        ALog.d("MessageService", "ondata checkpackage is del,pack=" + string, new Object[i]);
                        UTMini.getInstance().commitEvent(66002, "accs.dealMessage", com.taobao.accs.utl.a.b(f84031a), "deletePack", string);
                        sb3.append(string);
                        sb2.append(string2);
                        msgDO.removePacks = string;
                        if (i2 < i3) {
                            sb3.append(",");
                            sb2.append(",");
                        }
                    } else {
                        String string4 = a(j, msgDO).getString("encrypted");
                        if (!f84031a.getPackageName().equals(string)) {
                            z = true;
                        } else if (TextUtils.equals(Integer.toString(0), string4) || TextUtils.equals(Integer.toString(4), string4)) {
                            z = false;
                        } else {
                            msgDO.errorCode = "15";
                            ALog.e("MessageService", "error encrypted: " + string4, new Object[0]);
                        }
                        msgDO.agooFlag = z;
                        if (!TextUtils.isEmpty(str2)) {
                            msgDO.msgStatus = str2;
                            i2++;
                            i = 0;
                        }
                    }
                }
                String str5 = str2;
                i2++;
                i = 0;
            }
        } catch (Throwable th) {
            if (ALog.isPrintLog(ALog.Level.E)) {
                ALog.e("MessageService", "createMsg is error,e: " + th, new Object[0]);
            }
        }
        return msgDO;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0085 A[Catch:{ all -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            com.taobao.accs.utl.ALog$Level r0 = com.taobao.accs.utl.ALog.Level.I
            boolean r0 = com.taobao.accs.utl.ALog.isPrintLog(r0)
            r1 = 0
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = "MessageService"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "updateAccsMessage sqlite3--->["
            r2.<init>(r3)
            r2.append(r8)
            java.lang.String r3 = ",state="
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = "]"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r3 = new java.lang.Object[r1]
            com.taobao.accs.utl.ALog.i(r0, r2, r3)
        L_0x002b:
            r0 = 0
            boolean r2 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Throwable -> 0x007c }
            if (r2 != 0) goto L_0x0079
            boolean r2 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Throwable -> 0x007c }
            if (r2 == 0) goto L_0x0039
            goto L_0x0079
        L_0x0039:
            android.database.sqlite.SQLiteOpenHelper r2 = r7.f84033b     // Catch:{ Throwable -> 0x007c }
            android.database.sqlite.SQLiteDatabase r2 = r2.getWritableDatabase()     // Catch:{ Throwable -> 0x007c }
            if (r2 != 0) goto L_0x0047
            if (r2 == 0) goto L_0x0046
            r2.close()
        L_0x0046:
            return
        L_0x0047:
            java.lang.String r0 = "1"
            boolean r0 = android.text.TextUtils.equals(r9, r0)     // Catch:{ Throwable -> 0x0076, all -> 0x0073 }
            r3 = 1
            r4 = 2
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = "UPDATE accs_message set state = ? where id = ? and state = ?"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x0076, all -> 0x0073 }
            r5[r1] = r9     // Catch:{ Throwable -> 0x0076, all -> 0x0073 }
            r5[r3] = r8     // Catch:{ Throwable -> 0x0076, all -> 0x0073 }
            java.lang.String r8 = "0"
            r5[r4] = r8     // Catch:{ Throwable -> 0x0076, all -> 0x0073 }
            r2.execSQL(r0, r5)     // Catch:{ Throwable -> 0x0076, all -> 0x0073 }
            goto L_0x006d
        L_0x0062:
            java.lang.String r0 = "UPDATE accs_message set state = ? where id = ?"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x0076, all -> 0x0073 }
            r4[r1] = r9     // Catch:{ Throwable -> 0x0076, all -> 0x0073 }
            r4[r3] = r8     // Catch:{ Throwable -> 0x0076, all -> 0x0073 }
            r2.execSQL(r0, r4)     // Catch:{ Throwable -> 0x0076, all -> 0x0073 }
        L_0x006d:
            if (r2 == 0) goto L_0x00c8
            r2.close()
            return
        L_0x0073:
            r8 = move-exception
            r0 = r2
            goto L_0x00c9
        L_0x0076:
            r8 = move-exception
            r0 = r2
            goto L_0x007d
        L_0x0079:
            return
        L_0x007a:
            r8 = move-exception
            goto L_0x00c9
        L_0x007c:
            r8 = move-exception
        L_0x007d:
            com.taobao.accs.utl.ALog$Level r9 = com.taobao.accs.utl.ALog.Level.E     // Catch:{ all -> 0x007a }
            boolean r9 = com.taobao.accs.utl.ALog.isPrintLog(r9)     // Catch:{ all -> 0x007a }
            if (r9 == 0) goto L_0x00aa
            java.lang.String r9 = "MessageService"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x007a }
            java.lang.String r3 = "updateAccsMessage error,e--->["
            r2.<init>(r3)     // Catch:{ all -> 0x007a }
            r2.append(r8)     // Catch:{ all -> 0x007a }
            java.lang.String r3 = "],ex="
            r2.append(r3)     // Catch:{ all -> 0x007a }
            java.lang.StackTraceElement[] r3 = r8.getStackTrace()     // Catch:{ all -> 0x007a }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x007a }
            r2.append(r3)     // Catch:{ all -> 0x007a }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x007a }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x007a }
            com.taobao.accs.utl.ALog.e(r9, r2, r1)     // Catch:{ all -> 0x007a }
        L_0x00aa:
            com.taobao.accs.utl.UTMini r1 = com.taobao.accs.utl.UTMini.getInstance()     // Catch:{ all -> 0x007a }
            r2 = 66002(0x101d2, float:9.2489E-41)
            java.lang.String r3 = "accs.add_agoo_message"
            android.content.Context r9 = f84031a     // Catch:{ all -> 0x007a }
            java.lang.String r4 = com.taobao.accs.utl.a.b(r9)     // Catch:{ all -> 0x007a }
            java.lang.String r5 = "updateAccsMessageFailed"
            java.lang.String r6 = r8.toString()     // Catch:{ all -> 0x007a }
            r1.commitEvent(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x00c8
            r0.close()
            return
        L_0x00c8:
            return
        L_0x00c9:
            if (r0 == 0) goto L_0x00ce
            r0.close()
        L_0x00ce:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.message.MessageService.a(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00aa A[Catch:{ all -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            r10 = this;
            com.taobao.accs.utl.ALog$Level r0 = com.taobao.accs.utl.ALog.Level.I
            boolean r0 = com.taobao.accs.utl.ALog.isPrintLog(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = "MessageService"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "addAccsMessage sqlite3--->["
            r2.<init>(r3)
            r2.append(r11)
            java.lang.String r3 = ",message="
            r2.append(r3)
            r2.append(r12)
            java.lang.String r3 = ",state="
            r2.append(r3)
            r2.append(r13)
            java.lang.String r3 = "]"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r3 = new java.lang.Object[r1]
            com.taobao.accs.utl.ALog.i(r0, r2, r3)
        L_0x0033:
            r0 = 0
            boolean r2 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Throwable -> 0x00a0, all -> 0x009d }
            if (r2 != 0) goto L_0x009c
            boolean r2 = android.text.TextUtils.isEmpty(r12)     // Catch:{ Throwable -> 0x00a0, all -> 0x009d }
            if (r2 == 0) goto L_0x0041
            goto L_0x009c
        L_0x0041:
            android.database.sqlite.SQLiteOpenHelper r2 = r10.f84033b     // Catch:{ Throwable -> 0x00a0, all -> 0x009d }
            android.database.sqlite.SQLiteDatabase r2 = r2.getWritableDatabase()     // Catch:{ Throwable -> 0x00a0, all -> 0x009d }
            if (r2 != 0) goto L_0x004f
            if (r2 == 0) goto L_0x004e
            r2.close()
        L_0x004e:
            return
        L_0x004f:
            java.lang.String r3 = "select count(1) from accs_message where id = ?"
            r4 = 1
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ Throwable -> 0x0098, all -> 0x0094 }
            r5[r1] = r11     // Catch:{ Throwable -> 0x0098, all -> 0x0094 }
            android.database.Cursor r3 = r2.rawQuery(r3, r5)     // Catch:{ Throwable -> 0x0098, all -> 0x0094 }
            if (r3 == 0) goto L_0x007a
            boolean r0 = r3.moveToFirst()     // Catch:{ Throwable -> 0x0078, all -> 0x0076 }
            if (r0 == 0) goto L_0x007a
            int r0 = r3.getInt(r1)     // Catch:{ Throwable -> 0x0078, all -> 0x0076 }
            if (r0 <= 0) goto L_0x007a
            r3.close()     // Catch:{ Throwable -> 0x0078, all -> 0x0076 }
            if (r3 == 0) goto L_0x0070
            r3.close()
        L_0x0070:
            if (r2 == 0) goto L_0x0075
            r2.close()
        L_0x0075:
            return
        L_0x0076:
            r11 = move-exception
            goto L_0x0096
        L_0x0078:
            r11 = move-exception
            goto L_0x009a
        L_0x007a:
            java.lang.String r0 = "INSERT INTO accs_message VALUES(?,?,?,date('now'))"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x0078, all -> 0x0076 }
            r5[r1] = r11     // Catch:{ Throwable -> 0x0078, all -> 0x0076 }
            r5[r4] = r13     // Catch:{ Throwable -> 0x0078, all -> 0x0076 }
            r11 = 2
            r5[r11] = r12     // Catch:{ Throwable -> 0x0078, all -> 0x0076 }
            r2.execSQL(r0, r5)     // Catch:{ Throwable -> 0x0078, all -> 0x0076 }
            if (r3 == 0) goto L_0x008e
            r3.close()
        L_0x008e:
            if (r2 == 0) goto L_0x00ee
            r2.close()
            return
        L_0x0094:
            r11 = move-exception
            r3 = r0
        L_0x0096:
            r0 = r2
            goto L_0x00f0
        L_0x0098:
            r11 = move-exception
            r3 = r0
        L_0x009a:
            r0 = r2
            goto L_0x00a2
        L_0x009c:
            return
        L_0x009d:
            r11 = move-exception
            r3 = r0
            goto L_0x00f0
        L_0x00a0:
            r11 = move-exception
            r3 = r0
        L_0x00a2:
            com.taobao.accs.utl.ALog$Level r12 = com.taobao.accs.utl.ALog.Level.E     // Catch:{ all -> 0x00ef }
            boolean r12 = com.taobao.accs.utl.ALog.isPrintLog(r12)     // Catch:{ all -> 0x00ef }
            if (r12 == 0) goto L_0x00cb
            java.lang.String r12 = "MessageService"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ef }
            java.lang.String r2 = "addAccsMessage error,e--->["
            r13.<init>(r2)     // Catch:{ all -> 0x00ef }
            r13.append(r11)     // Catch:{ all -> 0x00ef }
            java.lang.String r2 = "],ex="
            r13.append(r2)     // Catch:{ all -> 0x00ef }
            java.lang.String r2 = r10.a((java.lang.Throwable) r11)     // Catch:{ all -> 0x00ef }
            r13.append(r2)     // Catch:{ all -> 0x00ef }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x00ef }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00ef }
            com.taobao.accs.utl.ALog.e(r12, r13, r1)     // Catch:{ all -> 0x00ef }
        L_0x00cb:
            com.taobao.accs.utl.UTMini r4 = com.taobao.accs.utl.UTMini.getInstance()     // Catch:{ all -> 0x00ef }
            r5 = 66002(0x101d2, float:9.2489E-41)
            java.lang.String r6 = "accs.add_agoo_message"
            android.content.Context r12 = f84031a     // Catch:{ all -> 0x00ef }
            java.lang.String r7 = com.taobao.accs.utl.a.b(r12)     // Catch:{ all -> 0x00ef }
            java.lang.String r8 = "addAccsMessageFailed"
            java.lang.String r9 = r11.toString()     // Catch:{ all -> 0x00ef }
            r4.commitEvent(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00ef }
            if (r3 == 0) goto L_0x00e8
            r3.close()
        L_0x00e8:
            if (r0 == 0) goto L_0x00ee
            r0.close()
            return
        L_0x00ee:
            return
        L_0x00ef:
            r11 = move-exception
        L_0x00f0:
            if (r3 == 0) goto L_0x00f5
            r3.close()
        L_0x00f5:
            if (r0 == 0) goto L_0x00fa
            r0.close()
        L_0x00fa:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.message.MessageService.a(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0149 A[Catch:{ all -> 0x013e }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x017d A[SYNTHETIC, Splitter:B:52:0x017d] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0198 A[SYNTHETIC, Splitter:B:60:0x0198] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, long r11, int r13, int r14) {
        /*
            r6 = this;
            java.lang.String r0 = "MessageService"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "add sqlite3--->["
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.taobao.accs.utl.ALog.d(r0, r1, r3)
            r0 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Throwable -> 0x0140 }
            if (r1 == 0) goto L_0x0026
            java.lang.String r8 = ""
            r1 = -1
            goto L_0x002a
        L_0x0026:
            int r1 = r8.hashCode()     // Catch:{ Throwable -> 0x0140 }
        L_0x002a:
            boolean r3 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Throwable -> 0x0140 }
            if (r3 == 0) goto L_0x0032
            java.lang.String r9 = ""
        L_0x0032:
            java.util.Map<java.lang.String, java.lang.Integer> r3 = f84032c     // Catch:{ Throwable -> 0x0140 }
            boolean r3 = r3.containsKey(r7)     // Catch:{ Throwable -> 0x0140 }
            if (r3 != 0) goto L_0x006e
            java.util.Map<java.lang.String, java.lang.Integer> r3 = f84032c     // Catch:{ Throwable -> 0x0140 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch:{ Throwable -> 0x0140 }
            r3.put(r7, r4)     // Catch:{ Throwable -> 0x0140 }
            com.taobao.accs.utl.ALog$Level r3 = com.taobao.accs.utl.ALog.Level.I     // Catch:{ Throwable -> 0x0140 }
            boolean r3 = com.taobao.accs.utl.ALog.isPrintLog(r3)     // Catch:{ Throwable -> 0x0140 }
            if (r3 == 0) goto L_0x006e
            java.lang.String r3 = "MessageService"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0140 }
            java.lang.String r5 = "addMessage,messageId="
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0140 }
            r4.append(r7)     // Catch:{ Throwable -> 0x0140 }
            java.lang.String r5 = ",messageStores＝"
            r4.append(r5)     // Catch:{ Throwable -> 0x0140 }
            java.util.Map<java.lang.String, java.lang.Integer> r5 = f84032c     // Catch:{ Throwable -> 0x0140 }
            java.lang.String r5 = r5.toString()     // Catch:{ Throwable -> 0x0140 }
            r4.append(r5)     // Catch:{ Throwable -> 0x0140 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0140 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ Throwable -> 0x0140 }
            com.taobao.accs.utl.ALog.i(r3, r4, r5)     // Catch:{ Throwable -> 0x0140 }
        L_0x006e:
            android.database.sqlite.SQLiteOpenHelper r3 = r6.f84033b     // Catch:{ Throwable -> 0x0140 }
            android.database.sqlite.SQLiteDatabase r3 = r3.getWritableDatabase()     // Catch:{ Throwable -> 0x0140 }
            if (r3 != 0) goto L_0x00b9
            if (r3 == 0) goto L_0x00b8
            r3.close()     // Catch:{ Throwable -> 0x007c }
            goto L_0x00b8
        L_0x007c:
            r7 = move-exception
            com.taobao.accs.utl.ALog$Level r8 = com.taobao.accs.utl.ALog.Level.E
            boolean r8 = com.taobao.accs.utl.ALog.isPrintLog(r8)
            if (r8 == 0) goto L_0x009f
            java.lang.String r8 = "MessageService"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "addMessage,db.close(),error,e--->["
            r9.<init>(r10)
            r9.append(r7)
            java.lang.String r10 = "]"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.Object[] r10 = new java.lang.Object[r2]
            com.taobao.accs.utl.ALog.e(r8, r9, r10)
        L_0x009f:
            com.taobao.accs.utl.UTMini r0 = com.taobao.accs.utl.UTMini.getInstance()
            r1 = 66002(0x101d2, float:9.2489E-41)
            java.lang.String r2 = "accs.add_agoo_message"
            android.content.Context r8 = f84031a
            java.lang.String r3 = com.taobao.accs.utl.a.b(r8)
            java.lang.String r4 = "addMessageDBcloseFailed"
            java.lang.String r5 = r7.toString()
            r0.commitEvent(r1, r2, r3, r4, r5)
            return
        L_0x00b8:
            return
        L_0x00b9:
            java.lang.String r0 = "INSERT INTO message VALUES(?,?,?,?,?,?,?,?,?,date('now'))"
            r4 = 9
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x013b, all -> 0x0138 }
            r4[r2] = r7     // Catch:{ Throwable -> 0x013b, all -> 0x0138 }
            r7 = 1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Throwable -> 0x013b, all -> 0x0138 }
            r4[r7] = r10     // Catch:{ Throwable -> 0x013b, all -> 0x0138 }
            r7 = 2
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)     // Catch:{ Throwable -> 0x013b, all -> 0x0138 }
            r4[r7] = r10     // Catch:{ Throwable -> 0x013b, all -> 0x0138 }
            r7 = 3
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)     // Catch:{ Throwable -> 0x013b, all -> 0x0138 }
            r4[r7] = r10     // Catch:{ Throwable -> 0x013b, all -> 0x0138 }
            r7 = 4
            java.lang.Long r10 = java.lang.Long.valueOf(r11)     // Catch:{ Throwable -> 0x013b, all -> 0x0138 }
            r4[r7] = r10     // Catch:{ Throwable -> 0x013b, all -> 0x0138 }
            r7 = 5
            java.lang.Integer r10 = java.lang.Integer.valueOf(r13)     // Catch:{ Throwable -> 0x013b, all -> 0x0138 }
            r4[r7] = r10     // Catch:{ Throwable -> 0x013b, all -> 0x0138 }
            r7 = 6
            r4[r7] = r9     // Catch:{ Throwable -> 0x013b, all -> 0x0138 }
            r7 = 7
            r4[r7] = r8     // Catch:{ Throwable -> 0x013b, all -> 0x0138 }
            r7 = 8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r14)     // Catch:{ Throwable -> 0x013b, all -> 0x0138 }
            r4[r7] = r8     // Catch:{ Throwable -> 0x013b, all -> 0x0138 }
            r3.execSQL(r0, r4)     // Catch:{ Throwable -> 0x013b, all -> 0x0138 }
            if (r3 == 0) goto L_0x0137
            r3.close()     // Catch:{ Throwable -> 0x00fb }
            goto L_0x0137
        L_0x00fb:
            r7 = move-exception
            com.taobao.accs.utl.ALog$Level r8 = com.taobao.accs.utl.ALog.Level.E
            boolean r8 = com.taobao.accs.utl.ALog.isPrintLog(r8)
            if (r8 == 0) goto L_0x011e
            java.lang.String r8 = "MessageService"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "addMessage,db.close(),error,e--->["
            r9.<init>(r10)
        L_0x010d:
            r9.append(r7)
            java.lang.String r10 = "]"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.Object[] r10 = new java.lang.Object[r2]
            com.taobao.accs.utl.ALog.e(r8, r9, r10)
        L_0x011e:
            com.taobao.accs.utl.UTMini r0 = com.taobao.accs.utl.UTMini.getInstance()
            r1 = 66002(0x101d2, float:9.2489E-41)
            java.lang.String r2 = "accs.add_agoo_message"
            android.content.Context r8 = f84031a
            java.lang.String r3 = com.taobao.accs.utl.a.b(r8)
            java.lang.String r4 = "addMessageDBcloseFailed"
            java.lang.String r5 = r7.toString()
            r0.commitEvent(r1, r2, r3, r4, r5)
            return
        L_0x0137:
            return
        L_0x0138:
            r7 = move-exception
            r0 = r3
            goto L_0x0196
        L_0x013b:
            r7 = move-exception
            r0 = r3
            goto L_0x0141
        L_0x013e:
            r7 = move-exception
            goto L_0x0196
        L_0x0140:
            r7 = move-exception
        L_0x0141:
            com.taobao.accs.utl.ALog$Level r8 = com.taobao.accs.utl.ALog.Level.E     // Catch:{ all -> 0x013e }
            boolean r8 = com.taobao.accs.utl.ALog.isPrintLog(r8)     // Catch:{ all -> 0x013e }
            if (r8 == 0) goto L_0x0163
            java.lang.String r8 = "MessageService"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x013e }
            java.lang.String r10 = "addMessage error,e--->["
            r9.<init>(r10)     // Catch:{ all -> 0x013e }
            r9.append(r7)     // Catch:{ all -> 0x013e }
            java.lang.String r10 = "]"
            r9.append(r10)     // Catch:{ all -> 0x013e }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x013e }
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ all -> 0x013e }
            com.taobao.accs.utl.ALog.e(r8, r9, r10)     // Catch:{ all -> 0x013e }
        L_0x0163:
            com.taobao.accs.utl.UTMini r8 = com.taobao.accs.utl.UTMini.getInstance()     // Catch:{ all -> 0x013e }
            r9 = 66002(0x101d2, float:9.2489E-41)
            java.lang.String r10 = "accs.add_agoo_message"
            android.content.Context r11 = f84031a     // Catch:{ all -> 0x013e }
            java.lang.String r11 = com.taobao.accs.utl.a.b(r11)     // Catch:{ all -> 0x013e }
            java.lang.String r12 = "addMessageFailed"
            java.lang.String r13 = r7.toString()     // Catch:{ all -> 0x013e }
            r8.commitEvent(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x013e }
            if (r0 == 0) goto L_0x0195
            r0.close()     // Catch:{ Throwable -> 0x0181 }
            goto L_0x0195
        L_0x0181:
            r7 = move-exception
            com.taobao.accs.utl.ALog$Level r8 = com.taobao.accs.utl.ALog.Level.E
            boolean r8 = com.taobao.accs.utl.ALog.isPrintLog(r8)
            if (r8 == 0) goto L_0x011e
            java.lang.String r8 = "MessageService"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "addMessage,db.close(),error,e--->["
            r9.<init>(r10)
            goto L_0x010d
        L_0x0195:
            return
        L_0x0196:
            if (r0 == 0) goto L_0x01d7
            r0.close()     // Catch:{ Throwable -> 0x019c }
            goto L_0x01d7
        L_0x019c:
            r8 = move-exception
            com.taobao.accs.utl.ALog$Level r9 = com.taobao.accs.utl.ALog.Level.E
            boolean r9 = com.taobao.accs.utl.ALog.isPrintLog(r9)
            if (r9 == 0) goto L_0x01bf
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "addMessage,db.close(),error,e--->["
            r9.<init>(r10)
            r9.append(r8)
            java.lang.String r10 = "]"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.Object[] r10 = new java.lang.Object[r2]
            java.lang.String r11 = "MessageService"
            com.taobao.accs.utl.ALog.e(r11, r9, r10)
        L_0x01bf:
            com.taobao.accs.utl.UTMini r0 = com.taobao.accs.utl.UTMini.getInstance()
            r1 = 66002(0x101d2, float:9.2489E-41)
            android.content.Context r9 = f84031a
            java.lang.String r3 = com.taobao.accs.utl.a.b(r9)
            java.lang.String r5 = r8.toString()
            java.lang.String r2 = "accs.add_agoo_message"
            java.lang.String r4 = "addMessageDBcloseFailed"
            r0.commitEvent(r1, r2, r3, r4, r5)
        L_0x01d7:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.message.MessageService.a(java.lang.String, java.lang.String, java.lang.String, int, long, int, int):void");
    }
}
