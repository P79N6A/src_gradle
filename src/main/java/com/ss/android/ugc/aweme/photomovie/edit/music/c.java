package com.ss.android.ugc.aweme.photomovie.edit.music;

import com.google.common.a.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.music.model.Music;

public final /* synthetic */ class c implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58974a;

    /* renamed from: b  reason: collision with root package name */
    static final f f58975b = new c();

    private c() {
    }

    public final Object apply(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f58974a, false, 64120, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f58974a, false, 64120, new Class[]{Object.class}, Object.class);
        }
        Music music = (Music) obj;
        if (music != null) {
            return new com.ss.android.ugc.aweme.shortvideo.o.c().apply(com.ss.android.ugc.aweme.music.util.c.f56796b.a(music));
        }
        return null;
    }
}