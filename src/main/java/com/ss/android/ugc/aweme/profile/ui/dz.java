package com.ss.android.ugc.aweme.profile.ui;

import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class dz implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62715a;

    /* renamed from: b  reason: collision with root package name */
    private final UpdateAvatarDialog f62716b;

    /* renamed from: c  reason: collision with root package name */
    private final Bitmap f62717c;

    dz(UpdateAvatarDialog updateAvatarDialog, Bitmap bitmap) {
        this.f62716b = updateAvatarDialog;
        this.f62717c = bitmap;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f62715a, false, 69067, new Class[0], Object.class)) {
            return this.f62716b.a(this.f62717c);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f62715a, false, 69067, new Class[0], Object.class);
    }
}
