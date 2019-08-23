package com.ss.android.ugc.aweme.mediachoose;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class r implements Function2 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55317a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoChooseFragmentB f55318b;

    /* renamed from: c  reason: collision with root package name */
    private final String f55319c;

    r(VideoChooseFragmentB videoChooseFragmentB, String str) {
        this.f55318b = videoChooseFragmentB;
        this.f55319c = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        if (!PatchProxy.isSupport(new Object[]{obj, obj2}, this, f55317a, false, 58599, new Class[]{Object.class, Object.class}, Object.class)) {
            return this.f55318b.a(this.f55319c, (String) obj, (Long) obj2);
        }
        return PatchProxy.accessDispatch(new Object[]{obj, obj2}, this, f55317a, false, 58599, new Class[]{Object.class, Object.class}, Object.class);
    }
}
