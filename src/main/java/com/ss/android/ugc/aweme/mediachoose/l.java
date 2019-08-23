package com.ss.android.ugc.aweme.mediachoose;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class l implements Function2 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55302a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoChooseFragment f55303b;

    /* renamed from: c  reason: collision with root package name */
    private final String f55304c;

    l(VideoChooseFragment videoChooseFragment, String str) {
        this.f55303b = videoChooseFragment;
        this.f55304c = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        if (!PatchProxy.isSupport(new Object[]{obj, obj2}, this, f55302a, false, 58570, new Class[]{Object.class, Object.class}, Object.class)) {
            return this.f55303b.a(this.f55304c, (String) obj, (Long) obj2);
        }
        return PatchProxy.accessDispatch(new Object[]{obj, obj2}, this, f55302a, false, 58570, new Class[]{Object.class, Object.class}, Object.class);
    }
}
