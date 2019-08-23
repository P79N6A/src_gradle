package com.ss.android.ugc.aweme.feed.k;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.param.b;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final /* synthetic */ class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45568a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f45569b;

    /* renamed from: c  reason: collision with root package name */
    private final Aweme f45570c;

    /* renamed from: d  reason: collision with root package name */
    private final String f45571d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f45572e;

    /* renamed from: f  reason: collision with root package name */
    private final String f45573f;
    private final b g;
    private final String h;

    d(JSONObject jSONObject, Aweme aweme, String str, Context context, String str2, b bVar, String str3) {
        this.f45569b = jSONObject;
        this.f45570c = aweme;
        this.f45571d = str;
        this.f45572e = context;
        this.f45573f = str2;
        this.g = bVar;
        this.h = str3;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f45568a, false, 43610, new Class[0], Object.class)) {
            return c.a(this.f45569b, this.f45570c, this.f45571d, this.f45572e, this.f45573f, this.g, this.h);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f45568a, false, 43610, new Class[0], Object.class);
    }
}
