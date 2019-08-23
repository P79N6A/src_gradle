package com.ss.android.ugc.aweme.commercialize.log;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.log.z;
import com.ss.android.ugc.aweme.framework.a.a;
import org.json.JSONException;
import org.json.JSONObject;

public final /* synthetic */ class s implements z.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39341a;

    /* renamed from: b  reason: collision with root package name */
    private final g.a f39342b;

    /* renamed from: c  reason: collision with root package name */
    private final String f39343c;

    /* renamed from: d  reason: collision with root package name */
    private final long f39344d;

    /* renamed from: e  reason: collision with root package name */
    private final JSONObject f39345e;

    s(g.a aVar, String str, long j, JSONObject jSONObject) {
        this.f39342b = aVar;
        this.f39343c = str;
        this.f39344d = j;
        this.f39345e = jSONObject;
    }

    public final void a(int i, boolean z, Exception exc) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), exc}, this, f39341a, false, 31796, new Class[]{Integer.TYPE, Boolean.TYPE, Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z), exc}, this, f39341a, false, 31796, new Class[]{Integer.TYPE, Boolean.TYPE, Exception.class}, Void.TYPE);
            return;
        }
        g.a aVar = this.f39342b;
        String str = this.f39343c;
        long j = this.f39344d;
        JSONObject jSONObject = this.f39345e;
        if (aVar != null) {
            aVar.a(str, String.valueOf(i), j);
        }
        if (exc != null) {
            a.a(exc);
            try {
                jSONObject.put("error_message", exc.getMessage());
            } catch (JSONException unused) {
            }
        }
        int i2 = i;
        try {
            jSONObject.put("status_code", i);
        } catch (JSONException unused2) {
        }
        boolean z2 = z;
        n.a("aweme_third_party_track_url_succeed_rate", z ? 1 : 0, jSONObject);
    }
}
