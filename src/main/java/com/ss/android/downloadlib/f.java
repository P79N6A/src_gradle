package com.ss.android.downloadlib;

import android.content.Context;
import com.ss.android.download.api.b;
import com.ss.android.download.api.c.e;
import com.ss.android.downloadlib.addownload.j;
import com.ss.android.downloadlib.addownload.k;
import com.ss.android.downloadlib.core.download.d;
import com.ss.android.downloadlib.core.download.m;
import java.util.Map;
import org.json.JSONObject;

public final class f implements b {
    f() {
    }

    public final e a(String str) {
        return d.a(k.a()).a(str);
    }

    public final String a(long j) {
        return com.ss.android.downloadlib.core.download.e.a(k.a()).a(j);
    }

    public final boolean a(e eVar) {
        return d.a(k.a()).a(eVar);
    }

    public final void a(Long l, com.ss.android.download.api.b.a.b bVar) {
        com.ss.android.downloadlib.core.download.e.a(k.a()).b(l, bVar);
    }

    public final void a(Context context, long j, int i) {
        m.a(context, j, 268435456);
    }

    public final void a(Long l, com.ss.android.download.api.b.a.b bVar, String str, int i, String str2) {
        com.ss.android.downloadlib.core.download.e.a(k.a()).a(l, bVar).a(l, str, i, null, false, 0);
    }

    public final void a(Long l, String str, int i, String str2, boolean z, long j) {
        com.ss.android.downloadlib.core.download.e.a(k.a()).a(l, str, 0, str2, true, j);
    }

    public final long a(String str, String str2, Context context, String str3, Map<String, String> map, JSONObject jSONObject, boolean z) {
        return j.a(str, str2, context, str3, map, jSONObject, true, true, false, true, true, null, "", z);
    }
}
