package com.ss.android.ugc.aweme.shortvideo.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class ax implements Function1 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70790a;

    /* renamed from: b  reason: collision with root package name */
    static final Function1 f70791b = new ax();

    private ax() {
    }

    public final Object invoke(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f70790a, false, 80621, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f70790a, false, 80621, new Class[]{Object.class}, Object.class);
        }
        Integer num = (Integer) obj;
        if (num.intValue() != 0) {
            ai.b("startPreviewAsync ret = " + num);
        }
        return Unit.INSTANCE;
    }
}
