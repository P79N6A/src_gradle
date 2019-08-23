package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class az implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70794a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoRecordNewActivity f70795b;

    az(VideoRecordNewActivity videoRecordNewActivity) {
        this.f70795b = videoRecordNewActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f70794a, false, 80623, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f70794a, false, 80623, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f70795b.finish();
    }
}
