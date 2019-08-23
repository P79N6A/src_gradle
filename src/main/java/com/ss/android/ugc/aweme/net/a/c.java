package com.ss.android.ugc.aweme.net.a;

import android.text.TextUtils;
import com.bytedance.ies.net.cronet.b;
import com.bytedance.retrofit2.SsResponse;
import com.facebook.d.a.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56837a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f56838b;

    /* renamed from: c  reason: collision with root package name */
    private String f56839c;

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f56837a, false, 60861, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f56837a, false, 60861, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!this.f56838b) {
            d.a().b();
            this.f56839c = str;
            this.f56838b = true;
        }
    }

    public final void a(String str, SsResponse<String> ssResponse) {
        if (PatchProxy.isSupport(new Object[]{str, ssResponse}, this, f56837a, false, 60862, new Class[]{String.class, SsResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, ssResponse}, this, f56837a, false, 60862, new Class[]{String.class, SsResponse.class}, Void.TYPE);
            return;
        }
        if (this.f56838b && TextUtils.equals(this.f56839c, str)) {
            d.a().c();
            this.f56838b = false;
        }
    }
}
