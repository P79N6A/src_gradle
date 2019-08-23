package com.ss.android.ugc.aweme.u.b;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final /* synthetic */ class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75096a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f75097b;

    /* renamed from: c  reason: collision with root package name */
    private final String f75098c;

    /* renamed from: d  reason: collision with root package name */
    private final String f75099d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f75100e;

    d(JSONObject jSONObject, String str, String str2, Context context) {
        this.f75097b = jSONObject;
        this.f75098c = str;
        this.f75099d = str2;
        this.f75100e = context;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f75096a, false, 58980, new Class[0], Object.class)) {
            return c.a(this.f75097b, this.f75098c, this.f75099d, this.f75100e);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f75096a, false, 58980, new Class[0], Object.class);
    }
}
