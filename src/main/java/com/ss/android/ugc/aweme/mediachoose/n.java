package com.ss.android.ugc.aweme.mediachoose;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class n implements Function2 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55307a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoChooseFragment f55308b;

    /* renamed from: c  reason: collision with root package name */
    private final View f55309c;

    /* renamed from: d  reason: collision with root package name */
    private final String f55310d;

    n(VideoChooseFragment videoChooseFragment, View view, String str) {
        this.f55308b = videoChooseFragment;
        this.f55309c = view;
        this.f55310d = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        if (!PatchProxy.isSupport(new Object[]{obj, obj2}, this, f55307a, false, 58572, new Class[]{Object.class, Object.class}, Object.class)) {
            return this.f55308b.a(this.f55309c, this.f55310d, (String) obj, (Long) obj2);
        }
        return PatchProxy.accessDispatch(new Object[]{obj, obj2}, this, f55307a, false, 58572, new Class[]{Object.class, Object.class}, Object.class);
    }
}
