package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.livesdkapi.depend.model.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;

public final /* synthetic */ class ag implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9549a;

    /* renamed from: b  reason: collision with root package name */
    private final af f9550b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f9551c;

    /* renamed from: d  reason: collision with root package name */
    private final long f9552d;

    /* renamed from: e  reason: collision with root package name */
    private final String f9553e;

    /* renamed from: f  reason: collision with root package name */
    private final String f9554f;
    private final Context g;

    ag(af afVar, JSONObject jSONObject, long j, String str, String str2, Context context) {
        this.f9550b = afVar;
        this.f9551c = jSONObject;
        this.f9552d = j;
        this.f9553e = str;
        this.f9554f = str2;
        this.g = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f9549a, false, 3738, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f9549a, false, 3738, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        af afVar = this.f9550b;
        JSONObject jSONObject = this.f9551c;
        long j = this.f9552d;
        String str = this.f9553e;
        String str2 = this.f9554f;
        Context context = this.g;
        try {
            i2 = jSONObject.getInt("follow_status");
        } catch (Throwable unused) {
            i2 = 0;
        }
        a aVar = new a();
        aVar.f18692d = i2;
        aVar.f18693e = a.C0136a.FromWeb;
        aVar.f18689a = j;
        aVar.f18691c = str;
        aVar.f18690b = str2;
        afVar.a(aVar, context);
    }
}
