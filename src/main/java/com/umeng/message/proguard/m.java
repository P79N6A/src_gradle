package com.umeng.message.proguard;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import com.umeng.message.MessageSharedPrefs;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import org.json.JSONObject;

public class m {
    private static final String A = "com.umeng.message.proguard.m";
    private static m B;
    private Context C;

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public String f81302a;

        /* renamed from: b  reason: collision with root package name */
        public long f81303b;

        /* renamed from: c  reason: collision with root package name */
        public int f81304c;

        /* renamed from: d  reason: collision with root package name */
        public String f81305d;

        public ContentValues a() {
            ContentValues contentValues = new ContentValues();
            contentValues.put("MsgId", this.f81302a);
            contentValues.put("Time", Long.valueOf(this.f81303b));
            contentValues.put("ActionType", Integer.valueOf(this.f81304c));
            contentValues.put("pa", this.f81305d);
            return contentValues;
        }

        public a(Cursor cursor) {
            this.f81302a = cursor.getString(cursor.getColumnIndex("MsgId"));
            this.f81303b = cursor.getLong(cursor.getColumnIndex("Time"));
            this.f81304c = cursor.getInt(cursor.getColumnIndex("ActionType"));
            this.f81305d = cursor.getString(cursor.getColumnIndex("pa"));
        }

        public a(String str, int i, long j, String str2) {
            this.f81302a = str;
            this.f81304c = i;
            this.f81303b = j;
            this.f81305d = str2;
        }
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public String f81307a;

        /* renamed from: b  reason: collision with root package name */
        public String f81308b;

        /* renamed from: c  reason: collision with root package name */
        public String f81309c;

        /* renamed from: d  reason: collision with root package name */
        public long f81310d;

        public ContentValues a() {
            ContentValues contentValues = new ContentValues();
            contentValues.put("MsgId", this.f81307a);
            contentValues.put("TaskId", this.f81308b);
            contentValues.put("MsgStatus", this.f81309c);
            contentValues.put("Time", Long.valueOf(this.f81310d));
            return contentValues;
        }

        public b(Cursor cursor) {
            this.f81307a = cursor.getString(cursor.getColumnIndex("MsgId"));
            this.f81308b = cursor.getString(cursor.getColumnIndex("TaskId"));
            this.f81309c = cursor.getString(cursor.getColumnIndex("MsgStatus"));
            this.f81310d = cursor.getLong(cursor.getColumnIndex("Time"));
        }

        public b(String str, String str2, String str3, long j) {
            this.f81307a = str;
            this.f81308b = str2;
            this.f81309c = str3;
            this.f81310d = j;
        }
    }

    public class c {

        /* renamed from: a  reason: collision with root package name */
        public String f81312a;

        /* renamed from: b  reason: collision with root package name */
        public String f81313b;

        public ContentValues a() {
            ContentValues contentValues = new ContentValues();
            contentValues.put("MsgId", this.f81312a);
            contentValues.put("MsgType", this.f81313b);
            return contentValues;
        }

        public c(Cursor cursor) {
            this.f81312a = cursor.getString(cursor.getColumnIndex("MsgId"));
            this.f81313b = cursor.getString(cursor.getColumnIndex("MsgType"));
        }

        public c(String str, String str2) {
            this.f81312a = str;
            this.f81313b = str2;
        }
    }

    public class d {

        /* renamed from: a  reason: collision with root package name */
        public String f81315a;

        /* renamed from: b  reason: collision with root package name */
        public String f81316b;

        /* renamed from: c  reason: collision with root package name */
        public String f81317c;

        public ContentValues a() {
            ContentValues contentValues = new ContentValues();
            contentValues.put("MsgId", this.f81315a);
            contentValues.put("TaskId", this.f81316b);
            contentValues.put("MsgStatus", this.f81317c);
            return contentValues;
        }

        public d(Cursor cursor) {
            this.f81315a = cursor.getString(cursor.getColumnIndex("MsgId"));
            this.f81316b = cursor.getString(cursor.getColumnIndex("TaskId"));
            this.f81317c = cursor.getString(cursor.getColumnIndex("MsgStatus"));
        }

        public d(String str, String str2, String str3) {
            this.f81315a = str;
            this.f81316b = str2;
            this.f81317c = str3;
        }
    }

    public boolean a(String str, String str2, String str3, long j) {
        return false;
    }

    public boolean a(String str, int i, long j, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str2 == null) {
            str2 = "";
        }
        a aVar = new a(str, i, j, str2);
        ContentResolver contentResolver = this.C.getContentResolver();
        com.umeng.message.provider.a.a(this.C);
        if (contentResolver.insert(com.umeng.message.provider.a.f81332f, aVar.a()) != null) {
            return true;
        }
        return false;
    }

    public boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        c cVar = new c(str, str2);
        ContentResolver contentResolver = this.C.getContentResolver();
        com.umeng.message.provider.a.a(this.C);
        if (contentResolver.insert(com.umeng.message.provider.a.g, cVar.a()) != null) {
            return true;
        }
        return false;
    }

    public boolean a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        d dVar = new d(str, str2, str3);
        ContentResolver contentResolver = this.C.getContentResolver();
        com.umeng.message.provider.a.a(this.C);
        if (contentResolver.insert(com.umeng.message.provider.a.i, dVar.a()) != null) {
            return true;
        }
        return false;
    }

    private void h() {
        if (!MessageSharedPrefs.getInstance(this.C).hasTransferedCacheFileDataToSQL()) {
            File[] listFiles = this.C.getCacheDir().listFiles(new FilenameFilter() {
                public boolean accept(File file, String str) {
                    if (TextUtils.isEmpty(str) || !str.startsWith("umeng_message_log_cache_")) {
                        return false;
                    }
                    return true;
                }
            });
            if (listFiles != null) {
                for (File file : listFiles) {
                    a(file);
                    file.delete();
                }
            }
            MessageSharedPrefs.getInstance(this.C).finishTransferedCacheFileDataToSQL();
        }
    }

    public ArrayList<d> d() {
        ArrayList<d> arrayList = new ArrayList<>();
        ContentResolver contentResolver = this.C.getContentResolver();
        com.umeng.message.provider.a.a(this.C);
        Cursor query = contentResolver.query(com.umeng.message.provider.a.i, null, null, null, "MsgId Asc ");
        for (boolean moveToFirst = query.moveToFirst(); moveToFirst; moveToFirst = query.moveToNext()) {
            arrayList.add(new d(query));
        }
        if (query != null) {
            query.close();
        }
        return arrayList;
    }

    public int e() {
        ContentResolver contentResolver = this.C.getContentResolver();
        com.umeng.message.provider.a.a(this.C);
        int i = 0;
        Cursor query = contentResolver.query(com.umeng.message.provider.a.j, new String[]{"SerialNo"}, null, null, null);
        if (query.moveToFirst()) {
            i = query.getInt(query.getColumnIndex("SerialNo"));
        }
        if (query != null) {
            query.close();
        }
        return i;
    }

    public long f() {
        ContentResolver contentResolver = this.C.getContentResolver();
        com.umeng.message.provider.a.a(this.C);
        Cursor query = contentResolver.query(com.umeng.message.provider.a.j, new String[]{"AppLaunchAt"}, null, null, null);
        long j = 0;
        if (query == null) {
            return 0;
        }
        if (query.moveToFirst()) {
            j = query.getLong(query.getColumnIndex("AppLaunchAt"));
        }
        if (query != null) {
            query.close();
        }
        return j;
    }

    public Object g() {
        String str;
        ContentResolver contentResolver = this.C.getContentResolver();
        com.umeng.message.provider.a.a(this.C);
        Cursor query = contentResolver.query(com.umeng.message.provider.a.j, new String[]{"UpdateResponse"}, null, null, null);
        if (query.moveToFirst()) {
            str = query.getString(query.getColumnIndex("UpdateResponse"));
        } else {
            str = null;
        }
        if (query != null) {
            query.close();
        }
        return h.f(str);
    }

    public ArrayList<c> b() {
        ArrayList<c> arrayList = new ArrayList<>();
        ContentResolver contentResolver = this.C.getContentResolver();
        com.umeng.message.provider.a.a(this.C);
        Cursor query = contentResolver.query(com.umeng.message.provider.a.g, null, null, null, "MsgId Asc ");
        for (boolean moveToFirst = query.moveToFirst(); moveToFirst; moveToFirst = query.moveToNext()) {
            arrayList.add(new c(query));
        }
        if (query != null) {
            query.close();
        }
        return arrayList;
    }

    public ArrayList<b> c() {
        ArrayList<b> arrayList = new ArrayList<>();
        ContentResolver contentResolver = this.C.getContentResolver();
        com.umeng.message.provider.a.a(this.C);
        Cursor query = contentResolver.query(com.umeng.message.provider.a.h, null, null, null, "Time Asc ");
        for (boolean moveToFirst = query.moveToFirst(); moveToFirst; moveToFirst = query.moveToNext()) {
            arrayList.add(new b(query));
        }
        if (query != null) {
            query.close();
        }
        return arrayList;
    }

    public ArrayList<a> a() {
        ArrayList<a> arrayList = new ArrayList<>();
        ContentResolver contentResolver = this.C.getContentResolver();
        com.umeng.message.provider.a.a(this.C);
        Cursor query = contentResolver.query(com.umeng.message.provider.a.f81332f, null, null, null, "Time Asc ");
        if (query == null) {
            return arrayList;
        }
        for (boolean moveToFirst = query.moveToFirst(); moveToFirst; moveToFirst = query.moveToNext()) {
            arrayList.add(new a(query));
        }
        if (query != null) {
            query.close();
        }
        return arrayList;
    }

    private m(Context context) {
        this.C = context.getApplicationContext();
    }

    public static m a(Context context) {
        if (B == null) {
            m mVar = new m(context);
            B = mVar;
            mVar.h();
        }
        return B;
    }

    private void a(File file) {
        try {
            JSONObject jSONObject = new JSONObject(b(file));
            a(jSONObject.optString("msg_id"), jSONObject.optInt("action_type"), jSONObject.optLong(TimeDisplaySetting.TIME_DISPLAY_SETTING), jSONObject.optString("pa"));
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0028 A[SYNTHETIC, Splitter:B:17:0x0028] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String b(java.io.File r4) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x0024 }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ all -> 0x0024 }
            r2.<init>(r4)     // Catch:{ all -> 0x0024 }
            r1.<init>(r2)     // Catch:{ all -> 0x0024 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0022 }
            r4.<init>()     // Catch:{ all -> 0x0022 }
        L_0x0010:
            java.lang.String r0 = r1.readLine()     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x001a
            r4.append(r0)     // Catch:{ all -> 0x0022 }
            goto L_0x0010
        L_0x001a:
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0022 }
            r1.close()     // Catch:{ IOException -> 0x0021 }
        L_0x0021:
            return r4
        L_0x0022:
            r4 = move-exception
            goto L_0x0026
        L_0x0024:
            r4 = move-exception
            r1 = r0
        L_0x0026:
            if (r1 == 0) goto L_0x002b
            r1.close()     // Catch:{ IOException -> 0x002b }
        L_0x002b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.proguard.m.b(java.io.File):java.lang.String");
    }

    public b c(String str) {
        b bVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ContentResolver contentResolver = this.C.getContentResolver();
        com.umeng.message.provider.a.a(this.C);
        Cursor query = contentResolver.query(com.umeng.message.provider.a.h, null, "MsgId=?", new String[]{str}, null);
        if (query.moveToFirst()) {
            bVar = new b(query);
        }
        if (query != null) {
            query.close();
        }
        return bVar;
    }

    public a a(String str) {
        a aVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ContentResolver contentResolver = this.C.getContentResolver();
        com.umeng.message.provider.a.a(this.C);
        Cursor query = contentResolver.query(com.umeng.message.provider.a.f81332f, null, "MsgId=?", new String[0], null);
        if (query.moveToFirst()) {
            aVar = new a(query);
        }
        if (query != null) {
            query.close();
        }
        return aVar;
    }

    public ArrayList<d> d(int i) {
        if (i <= 0) {
            return null;
        }
        ArrayList<d> arrayList = new ArrayList<>();
        com.umeng.message.provider.a.a(this.C);
        Uri.Builder buildUpon = com.umeng.message.provider.a.i.buildUpon();
        Cursor query = this.C.getContentResolver().query(buildUpon.appendQueryParameter("limit", i).build(), null, null, null, "MsgId Asc ");
        for (boolean moveToFirst = query.moveToFirst(); moveToFirst; moveToFirst = query.moveToNext()) {
            arrayList.add(new d(query));
        }
        if (query != null) {
            query.close();
        }
        return arrayList;
    }

    public void e(int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("SerialNo", i);
        ContentResolver contentResolver = this.C.getContentResolver();
        com.umeng.message.provider.a.a(this.C);
        contentResolver.update(com.umeng.message.provider.a.j, contentValues, null, null);
    }

    public ArrayList<c> b(int i) {
        if (i <= 0) {
            return null;
        }
        ArrayList<c> arrayList = new ArrayList<>();
        com.umeng.message.provider.a.a(this.C);
        Uri.Builder buildUpon = com.umeng.message.provider.a.g.buildUpon();
        Cursor query = this.C.getContentResolver().query(buildUpon.appendQueryParameter("limit", i).build(), null, null, null, "MsgId Asc ");
        for (boolean moveToFirst = query.moveToFirst(); moveToFirst; moveToFirst = query.moveToNext()) {
            arrayList.add(new c(query));
        }
        if (query != null) {
            query.close();
        }
        return arrayList;
    }

    public ArrayList<b> c(int i) {
        if (i <= 0) {
            return null;
        }
        ArrayList<b> arrayList = new ArrayList<>();
        com.umeng.message.provider.a.a(this.C);
        Uri.Builder buildUpon = com.umeng.message.provider.a.h.buildUpon();
        Cursor query = this.C.getContentResolver().query(buildUpon.appendQueryParameter("limit", i).build(), null, null, null, "Time Asc ");
        for (boolean moveToFirst = query.moveToFirst(); moveToFirst; moveToFirst = query.moveToNext()) {
            arrayList.add(new b(query));
        }
        if (query != null) {
            query.close();
        }
        return arrayList;
    }

    public boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] strArr = {str};
        ContentResolver contentResolver = this.C.getContentResolver();
        com.umeng.message.provider.a.a(this.C);
        if (contentResolver.delete(com.umeng.message.provider.a.i, "MsgId=?", strArr) == 1) {
            return true;
        }
        return false;
    }

    public ArrayList<a> a(int i) {
        if (i <= 0) {
            return null;
        }
        ArrayList<a> arrayList = new ArrayList<>();
        com.umeng.message.provider.a.a(this.C);
        Cursor query = this.C.getContentResolver().query(com.umeng.message.provider.a.f81332f, null, null, null, "Time Asc  limit " + i);
        for (boolean moveToFirst = query.moveToFirst(); moveToFirst; moveToFirst = query.moveToNext()) {
            arrayList.add(new a(query));
        }
        if (query != null) {
            query.close();
        }
        return arrayList;
    }

    public boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] strArr = {str};
        ContentResolver contentResolver = this.C.getContentResolver();
        com.umeng.message.provider.a.a(this.C);
        if (contentResolver.delete(com.umeng.message.provider.a.g, "MsgId=?", strArr) == 1) {
            return true;
        }
        return false;
    }

    public void a(long j) {
        ContentResolver contentResolver = this.C.getContentResolver();
        com.umeng.message.provider.a.a(this.C);
        Cursor query = contentResolver.query(com.umeng.message.provider.a.j, new String[]{"AppLaunchAt"}, null, null, null);
        int count = query.getCount();
        if (query != null) {
            query.close();
        }
        if (count > 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("AppLaunchAt", j);
            ContentResolver contentResolver2 = this.C.getContentResolver();
            com.umeng.message.provider.a.a(this.C);
            contentResolver2.update(com.umeng.message.provider.a.j, contentValues, null, null);
            return;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("AppLaunchAt", j);
        ContentResolver contentResolver3 = this.C.getContentResolver();
        com.umeng.message.provider.a.a(this.C);
        contentResolver3.insert(com.umeng.message.provider.a.j, contentValues2);
    }

    public void a(Object obj) {
        String a2 = h.a(obj);
        ContentValues contentValues = new ContentValues();
        contentValues.put("UpdateResponse", a2);
        ContentResolver contentResolver = this.C.getContentResolver();
        com.umeng.message.provider.a.a(this.C);
        contentResolver.update(com.umeng.message.provider.a.j, contentValues, null, null);
    }

    public boolean b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] strArr = {str, str2};
        ContentResolver contentResolver = this.C.getContentResolver();
        com.umeng.message.provider.a.a(this.C);
        if (contentResolver.delete(com.umeng.message.provider.a.h, "MsgId=? And MsgStatus=?", strArr) == 1) {
            return true;
        }
        return false;
    }

    public boolean a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] strArr = {str, i};
        ContentResolver contentResolver = this.C.getContentResolver();
        com.umeng.message.provider.a.a(this.C);
        if (contentResolver.delete(com.umeng.message.provider.a.f81332f, "MsgId=? And ActionType=?", strArr) == 1) {
            return true;
        }
        return false;
    }
}
