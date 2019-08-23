package com.ss.android.ugc.aweme.shortvideo.ui;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.am;

public final /* synthetic */ class ao implements am.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70772a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoPublishFragment f70773b;

    ao(VideoPublishFragment videoPublishFragment) {
        this.f70773b = videoPublishFragment;
    }

    public final boolean a(View view) {
        if (!PatchProxy.isSupport(new Object[]{view}, this, f70772a, false, 80479, new Class[]{View.class}, Boolean.TYPE)) {
            return this.f70773b.l();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view}, this, f70772a, false, 80479, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
    }
}
