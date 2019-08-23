package com.ss.android.download.api;

import android.content.Context;
import com.ss.android.download.api.c.e;
import java.util.Map;
import org.json.JSONObject;

public interface b {
    long a(String str, String str2, Context context, String str3, Map<String, String> map, JSONObject jSONObject, boolean z);

    e a(String str);

    String a(long j);

    void a(Context context, long j, int i);

    void a(Long l, com.ss.android.download.api.b.a.b bVar);

    void a(Long l, com.ss.android.download.api.b.a.b bVar, String str, int i, String str2);

    void a(Long l, String str, int i, String str2, boolean z, long j);

    boolean a(e eVar);
}
