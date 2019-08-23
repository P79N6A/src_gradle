package com.ss.android.ugc.aweme.account.login.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.g;
import javax.annotation.Nonnull;
import org.json.JSONObject;

public abstract class a extends com.ss.android.ugc.aweme.account.api.b.a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f32041b;

    /* renamed from: c  reason: collision with root package name */
    private k f32042c;

    /* renamed from: d  reason: collision with root package name */
    private String f32043d;

    /* renamed from: e  reason: collision with root package name */
    private String f32044e;

    /* renamed from: f  reason: collision with root package name */
    private String f32045f;
    private String g;

    public void a(JSONObject jSONObject) {
    }

    public void b(JSONObject jSONObject) {
    }

    public void onFailure(Throwable th) {
    }

    public final void a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f32041b, false, 20209, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f32041b, false, 20209, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        b bVar = new b(this.f32042c, this, this.f32043d, this.f32044e, this.f32045f, this.g);
        this.f32042c.a(str, str2, g.y, bVar);
    }

    public a(@Nonnull k kVar, String str, String str2, String str3, String str4) {
        this.f32042c = kVar;
        this.f32043d = str;
        this.f32044e = str2;
        this.f32045f = str3;
        this.g = str4;
    }
}
