package com.ss.android.ugc.aweme.u;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.u.d;

public final class m extends d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75135a;

    /* renamed from: b  reason: collision with root package name */
    public String f75136b;

    /* renamed from: c  reason: collision with root package name */
    public String f75137c;

    public m() {
        super("download_music");
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75135a, false, 58864, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75135a, false, 58864, new Class[0], Void.TYPE);
            return;
        }
        a("enter_from", this.f75136b, d.a.f75112a);
        a("music_id", this.f75137c, d.a.f75113b);
    }
}
