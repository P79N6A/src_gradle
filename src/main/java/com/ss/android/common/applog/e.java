package com.ss.android.common.applog;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.LinkedList;
import org.json.JSONObject;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28138a;

    /* renamed from: c  reason: collision with root package name */
    private static volatile e f28139c;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedList<a> f28140b = new LinkedList<>();

    class a {

        /* renamed from: a  reason: collision with root package name */
        String f28143a;

        /* renamed from: b  reason: collision with root package name */
        String f28144b;

        /* renamed from: c  reason: collision with root package name */
        String f28145c;

        /* renamed from: d  reason: collision with root package name */
        long f28146d;

        /* renamed from: e  reason: collision with root package name */
        long f28147e;

        /* renamed from: f  reason: collision with root package name */
        boolean f28148f;
        JSONObject g;

        a(String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject) {
            this.f28143a = str;
            this.f28144b = str2;
            this.f28145c = str3;
            this.f28146d = j;
            this.f28147e = j2;
            this.f28148f = z;
            this.g = jSONObject;
        }
    }

    static e a() {
        if (PatchProxy.isSupport(new Object[0], null, f28138a, true, 15472, new Class[0], e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[0], null, f28138a, true, 15472, new Class[0], e.class);
        }
        if (f28139c == null) {
            synchronized (e.class) {
                if (f28139c == null) {
                    f28139c = new e();
                }
            }
        }
        return f28139c;
    }
}
