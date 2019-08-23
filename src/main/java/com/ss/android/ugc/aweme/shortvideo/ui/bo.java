package com.ss.android.ugc.aweme.shortvideo.ui;

import android.support.v4.app.Fragment;
import com.google.common.a.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoRecordingOperationPanelFragment;

public final /* synthetic */ class bo implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70827a;

    /* renamed from: b  reason: collision with root package name */
    static final f f70828b = new bo();

    private bo() {
    }

    public final Object apply(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f70827a, false, 80639, new Class[]{Object.class}, Object.class)) {
            return Boolean.valueOf(((Fragment) obj) instanceof ShortVideoRecordingOperationPanelFragment);
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, f70827a, false, 80639, new Class[]{Object.class}, Object.class);
    }
}
