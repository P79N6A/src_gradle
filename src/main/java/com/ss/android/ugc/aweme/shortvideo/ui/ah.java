package com.ss.android.ugc.aweme.shortvideo.ui;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ah implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70754a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoPublishFragment f70755b;

    ah(VideoPublishFragment videoPublishFragment) {
        this.f70755b = videoPublishFragment;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f70754a, false, 80470, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f70754a, false, 80470, new Class[]{i.class}, Object.class);
        }
        this.f70755b.c();
        return null;
    }
}
