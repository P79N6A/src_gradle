package com.ss.android.ugc.aweme.im.sdk.chat.input.photo;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoDetailActivity;

public final /* synthetic */ class h implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50844a;

    /* renamed from: b  reason: collision with root package name */
    private final PhotoDetailActivity.AnonymousClass2 f50845b;

    h(PhotoDetailActivity.AnonymousClass2 r1) {
        this.f50845b = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f50844a, false, 50989, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f50844a, false, 50989, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        PhotoDetailActivity.AnonymousClass2 r1 = this.f50845b;
        if (i == 0) {
            PhotoDetailActivity.this.c();
        }
    }
}
