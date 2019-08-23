package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.video.b;
import java.util.concurrent.Callable;

public final /* synthetic */ class db implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66732a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f66733b;

    db(Object obj) {
        this.f66733b = obj;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f66732a, false, 74248, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f66732a, false, 74248, new Class[0], Object.class);
        }
        String str = ((cb) this.f66733b).extractFramesModel.extractFramesDir;
        b.e(str);
        b.c(str);
        return null;
    }
}
