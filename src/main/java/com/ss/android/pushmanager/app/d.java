package com.ss.android.pushmanager.app;

import android.content.Context;
import com.ss.android.pushmanager.c;
import java.util.Map;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    static a f30505a;

    /* renamed from: b  reason: collision with root package name */
    static b f30506b;

    public interface a {
        void a(Context context);
    }

    public interface b {
        c a();

        void a(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject);

        Class b();

        String c();

        String d();

        String e();

        String f();

        boolean g();

        Map<String, String> h();
    }

    public static a a() {
        return f30505a;
    }

    public static b b() {
        return f30506b;
    }
}
