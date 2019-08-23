package com.ss.android.ugc.aweme.u.b;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75089a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f75090b;

    /* renamed from: c  reason: collision with root package name */
    private final String f75091c;

    /* renamed from: d  reason: collision with root package name */
    private final String f75092d;

    /* renamed from: e  reason: collision with root package name */
    private final String f75093e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f75094f;

    b(JSONObject jSONObject, String str, String str2, String str3, Context context) {
        this.f75090b = jSONObject;
        this.f75091c = str;
        this.f75092d = str2;
        this.f75093e = str3;
        this.f75094f = context;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f75089a, false, 58977, new Class[0], Object.class)) {
            return a.a(this.f75090b, this.f75091c, this.f75092d, this.f75093e, this.f75094f);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f75089a, false, 58977, new Class[0], Object.class);
    }
}
