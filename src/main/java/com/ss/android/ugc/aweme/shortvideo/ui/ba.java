package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ba implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70797a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoRecordNewActivity f70798b;

    ba(VideoRecordNewActivity videoRecordNewActivity) {
        this.f70798b = videoRecordNewActivity;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f70797a, false, 80624, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f70797a, false, 80624, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        this.f70798b.finish();
    }
}
