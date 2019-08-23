package com.ss.android.ugc.aweme.photomovie.edit.music;

import com.google.common.a.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.o.c;

public final /* synthetic */ class d implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58976a;

    /* renamed from: b  reason: collision with root package name */
    static final f f58977b = new d();

    private d() {
    }

    public final Object apply(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f58976a, false, 64121, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f58976a, false, 64121, new Class[]{Object.class}, Object.class);
        }
        Music music = (Music) obj;
        if (music != null) {
            return new c().apply(com.ss.android.ugc.aweme.music.util.c.f56796b.a(music));
        }
        return null;
    }
}
