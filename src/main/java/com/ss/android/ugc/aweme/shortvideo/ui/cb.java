package com.ss.android.ugc.aweme.shortvideo.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import kotlin.jvm.functions.Function0;

public final /* synthetic */ class cb implements Function0 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70854a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoRecordNewActivity.AnonymousClass5 f70855b;

    cb(VideoRecordNewActivity.AnonymousClass5 r1) {
        this.f70855b = r1;
    }

    public final Object invoke() {
        if (PatchProxy.isSupport(new Object[0], this, f70854a, false, 80662, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f70854a, false, 80662, new Class[0], Object.class);
        }
        VideoRecordNewActivity.this.finish();
        return null;
    }
}
