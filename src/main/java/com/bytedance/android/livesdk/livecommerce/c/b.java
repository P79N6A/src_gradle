package com.bytedance.android.livesdk.livecommerce.c;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16120a;

    /* renamed from: b  reason: collision with root package name */
    public String f16121b;

    /* renamed from: c  reason: collision with root package name */
    public List<e> f16122c;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f16120a, false, 10695, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16120a, false, 10695, new Class[0], Void.TYPE);
            return;
        }
        if (this.f16122c != null) {
            this.f16122c.clear();
            this.f16122c = null;
        }
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f16120a, false, 10694, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f16120a, false, 10694, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.equals(this.f16121b, str2)) {
            a();
        }
    }
}
