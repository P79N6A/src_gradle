package com.ss.android.ugc.aweme.shortvideo.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.PlanC;
import com.ss.android.ugc.aweme.shortvideo.fb;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class av implements Function1 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70786a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoRecordNewActivity f70787b;

    av(VideoRecordNewActivity videoRecordNewActivity) {
        this.f70787b = videoRecordNewActivity;
    }

    public final Object invoke(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f70786a, false, 80619, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f70786a, false, 80619, new Class[]{Object.class}, Object.class);
        }
        VideoRecordNewActivity videoRecordNewActivity = this.f70787b;
        Integer num = (Integer) obj;
        videoRecordNewActivity.W = num.intValue();
        if (videoRecordNewActivity.P == null || ((videoRecordNewActivity.P instanceof PlanC) && ((PlanC) videoRecordNewActivity.P).j())) {
            return null;
        }
        fb.a(videoRecordNewActivity.x, videoRecordNewActivity, videoRecordNewActivity.f4034c.j, videoRecordNewActivity.f4034c.k, num.intValue());
        videoRecordNewActivity.P.an_();
        return null;
    }
}
