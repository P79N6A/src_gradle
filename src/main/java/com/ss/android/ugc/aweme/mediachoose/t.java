package com.ss.android.ugc.aweme.mediachoose;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class t implements Function2 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55322a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoChooseFragmentB f55323b;

    /* renamed from: c  reason: collision with root package name */
    private final View f55324c;

    /* renamed from: d  reason: collision with root package name */
    private final String f55325d;

    t(VideoChooseFragmentB videoChooseFragmentB, View view, String str) {
        this.f55323b = videoChooseFragmentB;
        this.f55324c = view;
        this.f55325d = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        if (!PatchProxy.isSupport(new Object[]{obj, obj2}, this, f55322a, false, 58601, new Class[]{Object.class, Object.class}, Object.class)) {
            return this.f55323b.a(this.f55324c, this.f55325d, (String) obj, (Long) obj2);
        }
        return PatchProxy.accessDispatch(new Object[]{obj, obj2}, this, f55322a, false, 58601, new Class[]{Object.class, Object.class}, Object.class);
    }
}
