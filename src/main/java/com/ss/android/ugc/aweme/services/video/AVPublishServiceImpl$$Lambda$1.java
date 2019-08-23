package com.ss.android.ugc.aweme.services.video;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class AVPublishServiceImpl$$Lambda$1 implements g {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Function1 arg$1;

    AVPublishServiceImpl$$Lambda$1(Function1 function1) {
        this.arg$1 = function1;
    }

    public final Object then(i iVar) {
        i iVar2 = iVar;
        if (!PatchProxy.isSupport(new Object[]{iVar2}, this, changeQuickRedirect, false, 71617, new Class[]{i.class}, Object.class)) {
            return this.arg$1.invoke(iVar2.e());
        }
        return PatchProxy.accessDispatch(new Object[]{iVar2}, this, changeQuickRedirect, false, 71617, new Class[]{i.class}, Object.class);
    }
}
