package com.ss.android.ugc.aweme.livewallpaper.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.livewallpaper.c.c;

public final class a implements c.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53670a;

    /* renamed from: b  reason: collision with root package name */
    private String f53671b;

    public a(String str) {
        this.f53671b = str;
    }

    public final void a(boolean z, String str) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str}, this, f53670a, false, 56254, new Class[]{Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str}, this, f53670a, false, 56254, new Class[]{Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (z) {
            com.bytedance.ies.dmt.ui.d.a.a(GlobalContext.getContext(), (int) C0906R.string.c4j).a();
            e.a(0, "");
        } else {
            e.a(1, str);
        }
        if (this.f53671b != null) {
            e.a(this.f53671b, "video_share", z);
        }
        c.a().a("video_share");
    }
}
