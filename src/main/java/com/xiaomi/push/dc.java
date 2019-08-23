package com.xiaomi.push;

import android.content.Context;
import android.database.Cursor;
import com.xiaomi.push.dh;
import java.util.ArrayList;
import java.util.List;

public class dc extends dh.b<Long> {

    /* renamed from: a  reason: collision with root package name */
    private long f81925a;

    /* renamed from: a  reason: collision with other field name */
    private String f252a;

    public dc(String str, List<String> list, String str2, String[] strArr, String str3, String str4, String str5, int i, String str6) {
        super(str, list, str2, strArr, str3, str4, str5, i);
        this.f252a = str6;
    }

    public static dc a(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("count(*)");
        dc dcVar = new dc(str, arrayList, null, null, null, null, null, 0, "job to get count of all message");
        return dcVar;
    }

    public Long a(Context context, Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }

    public Object a() {
        return Long.valueOf(this.f81925a);
    }

    public void a(Context context, List<Long> list) {
        if (context != null && list != null && list.size() > 0) {
            this.f81925a = list.get(0).longValue();
        }
    }
}
