package com.xiaomi.push;

import android.content.ContentValues;
import android.content.Context;
import com.xiaomi.push.dh;

public class de extends dh.e {

    /* renamed from: a  reason: collision with root package name */
    private String f81927a = "MessageInsertJob";

    public de(String str, ContentValues contentValues, String str2) {
        super(str, contentValues);
        this.f81927a = str2;
    }

    public static de a(Context context, String str, io ioVar) {
        byte[] a2 = ju.a(ioVar);
        if (a2 == null || a2.length <= 0) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", 0);
        contentValues.put("messageId", "");
        contentValues.put("messageItemId", ioVar.d());
        contentValues.put("messageItem", a2);
        contentValues.put("appId", cv.a(context).b());
        contentValues.put("packageName", cv.a(context).a());
        contentValues.put("createTimeStamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("uploadTimestamp", 0);
        return new de(str, contentValues, "a job build to insert message to db");
    }
}
