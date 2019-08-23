package com.ss.android.ugc.aweme.shortvideo.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class bx implements Function1 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70845a;

    /* renamed from: b  reason: collision with root package name */
    static final Function1 f70846b = new bx();

    private bx() {
    }

    public final Object invoke(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f70845a, false, 80651, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f70845a, false, 80651, new Class[]{Object.class}, Object.class);
        }
        Integer num = (Integer) obj;
        if (num.intValue() != 0) {
            ai.b("stopPreviewAsync ret = " + num);
        }
        return Unit.INSTANCE;
    }
}
