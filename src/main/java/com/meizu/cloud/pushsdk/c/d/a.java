package com.meizu.cloud.pushsdk.c.d;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.c.b.b;
import com.meizu.cloud.pushsdk.c.f.c;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class a implements d {

    /* renamed from: a  reason: collision with root package name */
    private String f27143a = a.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private SQLiteDatabase f27144b;

    /* renamed from: c  reason: collision with root package name */
    private b f27145c;

    /* renamed from: d  reason: collision with root package name */
    private String[] f27146d = {"id", "eventData", "dateCreated"};

    /* renamed from: e  reason: collision with root package name */
    private long f27147e = -1;

    /* renamed from: f  reason: collision with root package name */
    private int f27148f;

    public a(Context context, int i) {
        this.f27145c = b.a(context, a(context));
        b();
        this.f27148f = i;
    }

    private String a(Context context) {
        String processName = MzSystemUtils.getProcessName(context);
        if (TextUtils.isEmpty(processName)) {
            return "PushEvents.db";
        }
        return processName + "_PushEvents.db";
    }

    public static Map<String, String> a(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            HashMap hashMap = (HashMap) objectInputStream.readObject();
            objectInputStream.close();
            byteArrayInputStream.close();
            return hashMap;
        } catch (IOException | ClassNotFoundException unused) {
            return null;
        }
    }

    public static byte[] a(Map<String, String> map) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(map);
            objectOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            return null;
        }
    }

    public List<Map<String, Object>> a(int i) {
        return a(null, "id ASC LIMIT " + i);
    }

    public List<Map<String, Object>> a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (e()) {
            Cursor query = this.f27144b.query("events", this.f27146d, str, null, null, null, str2);
            query.moveToFirst();
            while (!query.isAfterLast()) {
                HashMap hashMap = new HashMap();
                hashMap.put("id", Long.valueOf(query.getLong(0)));
                hashMap.put("eventData", a(query.getBlob(1)));
                hashMap.put("dateCreated", query.getString(2));
                query.moveToNext();
                arrayList.add(hashMap);
            }
            query.close();
        }
        return arrayList;
    }

    public void a(com.meizu.cloud.pushsdk.c.a.a aVar) {
        b(aVar);
    }

    public boolean a() {
        return e();
    }

    public boolean a(long j) {
        int i;
        if (e()) {
            SQLiteDatabase sQLiteDatabase = this.f27144b;
            i = sQLiteDatabase.delete("events", "id=" + j, null);
        } else {
            i = -1;
        }
        String str = this.f27143a;
        c.b(str, "Removed event from database: " + j, new Object[0]);
        return i == 1;
    }

    public long b(com.meizu.cloud.pushsdk.c.a.a aVar) {
        if (e()) {
            byte[] a2 = a(aVar.a());
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("eventData", a2);
            this.f27147e = this.f27144b.insert("events", null, contentValues);
        }
        String str = this.f27143a;
        c.b(str, "Added event to database: " + this.f27147e, new Object[0]);
        return this.f27147e;
    }

    public void b() {
        if (!e()) {
            try {
                this.f27144b = this.f27145c.getWritableDatabase();
                this.f27144b.enableWriteAheadLogging();
            } catch (Exception e2) {
                String str = this.f27143a;
                c.a(str, " open database error " + e2.getMessage(), new Object[0]);
            }
        }
    }

    public long c() {
        if (e()) {
            return DatabaseUtils.queryNumEntries(this.f27144b, "events");
        }
        return 0;
    }

    public b d() {
        LinkedList linkedList = new LinkedList();
        ArrayList arrayList = new ArrayList();
        for (Map next : a(this.f27148f)) {
            com.meizu.cloud.pushsdk.c.a.c cVar = new com.meizu.cloud.pushsdk.c.a.c();
            cVar.a((Map) next.get("eventData"));
            linkedList.add((Long) next.get("id"));
            arrayList.add(cVar);
        }
        return new b(arrayList, linkedList);
    }

    public boolean e() {
        return this.f27144b != null && this.f27144b.isOpen();
    }
}
