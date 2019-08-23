package com.ss.android.pushmanager;

import android.content.Context;
import android.util.Pair;
import com.ss.android.message.e;
import com.ss.android.push.b;
import org.json.JSONObject;

public interface d {
    String a();

    String a(Context context, String str);

    void a(Context context);

    void a(Context context, int i, String str, int i2, String str2);

    void a(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject);

    void a(String str, JSONObject jSONObject);

    Pair<String, String> b();

    Pair<String, String> c();

    Pair<String, String> d();

    b<String, String, String> e();

    e f();
}
