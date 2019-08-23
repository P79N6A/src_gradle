package com.ss.android.ugc.aweme.shortvideo;

import android.support.v4.app.Fragment;
import com.google.common.a.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ee implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67507a;

    /* renamed from: b  reason: collision with root package name */
    static final f f67508b = new ee();

    private ee() {
    }

    public final Object apply(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f67507a, false, 74398, new Class[]{Object.class}, Object.class)) {
            return Boolean.valueOf(((Fragment) obj) instanceof ShortVideoRecordingOperationPanelFragment);
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, f67507a, false, 74398, new Class[]{Object.class}, Object.class);
    }
}
