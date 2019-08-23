package com.ss.android.ugc.aweme.photo.edit;

import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58534a;

    /* renamed from: b  reason: collision with root package name */
    private final PhotoEditActivity f58535b;

    /* renamed from: c  reason: collision with root package name */
    private final ViewGroup.LayoutParams f58536c;

    c(PhotoEditActivity photoEditActivity, ViewGroup.LayoutParams layoutParams) {
        this.f58535b = photoEditActivity;
        this.f58536c = layoutParams;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f58534a, false, 63631, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58534a, false, 63631, new Class[0], Void.TYPE);
            return;
        }
        PhotoEditActivity photoEditActivity = this.f58535b;
        photoEditActivity.f58508c.setLayoutParams(this.f58536c);
        photoEditActivity.a();
    }
}
