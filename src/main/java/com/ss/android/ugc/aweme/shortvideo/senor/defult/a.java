package com.ss.android.ugc.aweme.shortvideo.senor.defult;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.OrientationEventListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.presenter.MediaRecordPresenter;

public final class a extends OrientationEventListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69167a;

    /* renamed from: b  reason: collision with root package name */
    private MediaRecordPresenter f69168b;

    public final void onOrientationChanged(int i) {
        int i2;
        int i3 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f69167a, false, 78491, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f69167a, false, 78491, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i3 <= 45 || i3 > 315) {
            i3 = 0;
        }
        if (i3 > 45 && i3 <= 135) {
            i3 = 90;
        }
        if (i3 > 135 && i3 <= 225) {
            i3 = 180;
        }
        if (i3 > 225) {
            i2 = 270;
        } else {
            i2 = i3;
        }
        this.f69168b.a(0.0f, 0.0f, (float) i2);
    }

    public a(@NonNull Context context, @NonNull MediaRecordPresenter mediaRecordPresenter) {
        super(context);
        this.f69168b = mediaRecordPresenter;
    }
}
