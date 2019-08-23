package com.ss.android.ugc.aweme.video.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.video.d.a;
import com.ss.android.ugc.aweme.video.d.d;
import com.ss.android.ugc.aweme.video.d.e;
import com.ss.android.ugc.playerkit.videoview.b.c;
import com.ss.android.ugc.playerkit.videoview.d.g;
import com.ss.android.ugc.playerkit.videoview.d.i;
import java.util.ArrayList;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76033a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<g> f76034b = new ArrayList<>();

    public b(boolean z) {
        this.f76034b.add(new com.ss.android.ugc.aweme.video.d.c());
        this.f76034b.add(new d());
        this.f76034b.add(com.ss.android.ugc.aweme.video.d.b.f76042b);
        if (!z) {
            this.f76034b.add(new e(com.ss.android.ugc.aweme.video.preload.g.f()));
        } else {
            this.f76034b.add(new a());
        }
    }

    public final com.ss.android.ugc.playerkit.videoview.d.c a(com.ss.android.ugc.playerkit.session.b bVar) {
        if (!PatchProxy.isSupport(new Object[]{bVar}, this, f76033a, false, 89088, new Class[]{com.ss.android.ugc.playerkit.session.b.class}, com.ss.android.ugc.playerkit.videoview.d.c.class)) {
            return new i(this.f76034b, AbTestManager.a().d().videoCDNUrlTimeoutTime);
        }
        return (com.ss.android.ugc.playerkit.videoview.d.c) PatchProxy.accessDispatch(new Object[]{bVar}, this, f76033a, false, 89088, new Class[]{com.ss.android.ugc.playerkit.session.b.class}, com.ss.android.ugc.playerkit.videoview.d.c.class);
    }
}
