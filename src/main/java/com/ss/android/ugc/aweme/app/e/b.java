package com.ss.android.ugc.aweme.app.e;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d;

public abstract class b {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f34158b;

    /* renamed from: c  reason: collision with root package name */
    public Uri f34159c;

    /* renamed from: d  reason: collision with root package name */
    public String f34160d;

    /* renamed from: e  reason: collision with root package name */
    public String f34161e;

    /* renamed from: f  reason: collision with root package name */
    boolean f34162f;

    /* access modifiers changed from: package-private */
    public abstract Intent a(Activity activity);

    /* access modifiers changed from: package-private */
    public abstract String a();

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f34158b, false, 23524, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f34158b, false, 23524, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.f34159c != null) {
            d.f34105a.a(str, this.f34159c, this.f34162f);
        }
    }
}
