package com.umeng.message.proguard;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import com.umeng.message.entity.UMessage;
import com.umeng.message.provider.a;

public class l {

    /* renamed from: a  reason: collision with root package name */
    public static l f81300a;
    private Context E;

    /* access modifiers changed from: package-private */
    public boolean a(String str) {
        return a(str, 1);
    }

    /* access modifiers changed from: package-private */
    public boolean b(String str) {
        return a(str, 2);
    }

    private l(Context context) {
        this.E = context.getApplicationContext();
    }

    public static l a(Context context) {
        if (f81300a == null) {
            f81300a = new l(context);
        }
        return f81300a;
    }

    /* access modifiers changed from: package-private */
    public boolean a(UMessage uMessage) {
        boolean z = false;
        if (uMessage == null) {
            return false;
        }
        synchronized (f81300a) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("MsdId", uMessage.msg_id);
            contentValues.put("Json", uMessage.getRaw().toString());
            contentValues.put("SdkVersion", "6.0.0.001");
            contentValues.put("ArrivalTime", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("ActionType", 0);
            ContentResolver contentResolver = this.E.getContentResolver();
            a.a(this.E);
            if (contentResolver.insert(a.f81328b, contentValues) != null) {
                z = true;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public boolean a(String str, int i) {
        boolean z;
        synchronized (f81300a) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("ActionType", Integer.valueOf(i));
            z = true;
            String[] strArr = {str};
            ContentResolver contentResolver = this.E.getContentResolver();
            a.a(this.E);
            if (contentResolver.update(a.f81328b, contentValues, "MsdId=?", strArr) != 1) {
                z = false;
            }
        }
        return z;
    }
}
