package com.ss.android.ugc.aweme.newfollow.vh;

import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.newfollow.ui.a;

public final /* synthetic */ class ae implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57703a;

    /* renamed from: b  reason: collision with root package name */
    private final UpLoadRecoverItemViewHolder f57704b;

    /* renamed from: c  reason: collision with root package name */
    private final Bitmap f57705c;

    ae(UpLoadRecoverItemViewHolder upLoadRecoverItemViewHolder, Bitmap bitmap) {
        this.f57704b = upLoadRecoverItemViewHolder;
        this.f57705c = bitmap;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f57703a, false, 62677, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57703a, false, 62677, new Class[0], Void.TYPE);
            return;
        }
        UpLoadRecoverItemViewHolder upLoadRecoverItemViewHolder = this.f57704b;
        Bitmap bitmap = this.f57705c;
        if (upLoadRecoverItemViewHolder.mCoverImage != null) {
            upLoadRecoverItemViewHolder.mCoverImage.setImageDrawable(new a(bitmap));
        }
    }
}
