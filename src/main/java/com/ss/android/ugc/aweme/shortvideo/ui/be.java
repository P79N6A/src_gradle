package com.ss.android.ugc.aweme.shortvideo.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class be implements Function1 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70805a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoRecordNewActivity f70806b;

    be(VideoRecordNewActivity videoRecordNewActivity) {
        this.f70806b = videoRecordNewActivity;
    }

    public final Object invoke(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f70805a, false, 80628, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f70805a, false, 80628, new Class[]{Object.class}, Object.class);
        }
        this.f70806b.a(((Integer) obj).intValue());
        return Unit.INSTANCE;
    }
}
