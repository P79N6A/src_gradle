package com.ss.android.ugc.aweme.photomovie.edit.music;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class e implements Function1 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58978a;

    /* renamed from: b  reason: collision with root package name */
    private final PhotoMovieMusicModule f58979b;

    e(PhotoMovieMusicModule photoMovieMusicModule) {
        this.f58979b = photoMovieMusicModule;
    }

    public final Object invoke(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f58978a, false, 64129, new Class[]{Object.class}, Object.class)) {
            return this.f58979b.a((com.ss.android.ugc.aweme.ao.a.e) obj);
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, f58978a, false, 64129, new Class[]{Object.class}, Object.class);
    }
}
