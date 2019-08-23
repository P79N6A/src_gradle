package com.ss.android.ugc.aweme.profile.ui;

import a.g;
import a.i;
import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.b.a.b;
import java.util.concurrent.Callable;

public final /* synthetic */ class dx implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62711a;

    /* renamed from: b  reason: collision with root package name */
    private final UpdateAvatarDialog f62712b;

    dx(UpdateAvatarDialog updateAvatarDialog) {
        this.f62712b = updateAvatarDialog;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f62711a, false, 69065, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f62711a, false, 69065, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        UpdateAvatarDialog updateAvatarDialog = this.f62712b;
        i.a((Callable<TResult>) new dz<TResult>(updateAvatarDialog, (Bitmap) obj)).a((g<TResult, TContinuationResult>) new ea<TResult,TContinuationResult>(updateAvatarDialog), i.f1052b);
    }
}
