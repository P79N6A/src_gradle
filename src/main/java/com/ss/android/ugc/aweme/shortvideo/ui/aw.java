package com.ss.android.ugc.aweme.shortvideo.ui;

import android.support.v4.app.Fragment;
import com.google.common.a.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.sticker.impl.StickerFragment;

public final /* synthetic */ class aw implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70788a;

    /* renamed from: b  reason: collision with root package name */
    static final f f70789b = new aw();

    private aw() {
    }

    public final Object apply(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f70788a, false, 80620, new Class[]{Object.class}, Object.class)) {
            return Boolean.valueOf(((Fragment) obj) instanceof StickerFragment);
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, f70788a, false, 80620, new Class[]{Object.class}, Object.class);
    }
}
