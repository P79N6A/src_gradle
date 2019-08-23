package com.ss.android.ugc.aweme.profile.ui;

import android.graphics.BitmapFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.d.l;
import java.util.concurrent.Callable;

public final /* synthetic */ class dv implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62707a;

    /* renamed from: b  reason: collision with root package name */
    private final UpdateAvatarDialog f62708b;

    dv(UpdateAvatarDialog updateAvatarDialog) {
        this.f62708b = updateAvatarDialog;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f62707a, false, 69063, new Class[0], Object.class)) {
            return this.f62708b.a(BitmapFactory.decodeFile(l.b().getAbsolutePath()));
        }
        return PatchProxy.accessDispatch(new Object[0], this, f62707a, false, 69063, new Class[0], Object.class);
    }
}
