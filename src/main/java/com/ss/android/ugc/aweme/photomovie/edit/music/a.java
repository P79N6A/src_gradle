package com.ss.android.ugc.aweme.photomovie.edit.music;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.shortvideo.model.MusicList;
import com.ss.android.ugc.aweme.shortvideo.model.MusicListModel;
import com.ss.android.ugc.aweme.shortvideo.presenter.c;

public final class a extends b<MusicListModel, c> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58968a;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f58968a, false, 64095, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58968a, false, 64095, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        if (((MusicListModel) this.f2978e).getData() == null) {
            a(new Exception());
        } else if (CollectionUtils.isEmpty(((MusicList) ((MusicListModel) this.f2978e).getData()).musicList)) {
            a(new Exception());
        } else {
            if (this.f2979f != null) {
                ((c) this.f2979f).a((MusicList) ((MusicListModel) this.f2978e).getData(), "");
            }
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f58968a, false, 64096, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f58968a, false, 64096, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        super.a(exc);
        if (this.f2979f != null) {
            ((c) this.f2979f).a(exc, "");
        }
    }
}
