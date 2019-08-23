package com.ss.android.ugc.aweme.music.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.fragment.a;
import java.util.Map;

public final /* synthetic */ class h implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56705a;

    /* renamed from: b  reason: collision with root package name */
    private final MusicDetailFragment f56706b;

    h(MusicDetailFragment musicDetailFragment) {
        this.f56706b = musicDetailFragment;
    }

    public final void a(boolean z, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f56705a, false, 60245, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f56705a, false, 60245, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        MusicDetailFragment musicDetailFragment = this.f56706b;
        if (z) {
            r.a("enter_music_detail", (Map) d.a().a("request_id", String.valueOf(musicDetailFragment.o.j())).a("music_id", musicDetailFragment.j).a("enter_from", musicDetailFragment.p).b().f34114b);
        }
    }
}
