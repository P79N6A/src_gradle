package com.ss.android.ugc.aweme.profile.adapter;

import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61294a;

    /* renamed from: b  reason: collision with root package name */
    private final DraftBoxViewHolder f61295b;

    /* renamed from: c  reason: collision with root package name */
    private final Bitmap f61296c;

    d(DraftBoxViewHolder draftBoxViewHolder, Bitmap bitmap) {
        this.f61295b = draftBoxViewHolder;
        this.f61296c = bitmap;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f61294a, false, 67387, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61294a, false, 67387, new Class[0], Void.TYPE);
            return;
        }
        DraftBoxViewHolder draftBoxViewHolder = this.f61295b;
        Bitmap bitmap = this.f61296c;
        if (!(draftBoxViewHolder.f61246c == null || bitmap == null)) {
            draftBoxViewHolder.f61246c.setImageBitmap(bitmap);
        }
    }
}
