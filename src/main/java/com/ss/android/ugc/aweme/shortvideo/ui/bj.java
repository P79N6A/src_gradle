package com.ss.android.ugc.aweme.shortvideo.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class bj implements Function1 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70815a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoRecordNewActivity f70816b;

    /* renamed from: c  reason: collision with root package name */
    private final VideoRecordNewActivity.a f70817c;

    public bj(VideoRecordNewActivity videoRecordNewActivity, VideoRecordNewActivity.a aVar) {
        this.f70816b = videoRecordNewActivity;
        this.f70817c = aVar;
    }

    public final Object invoke(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f70815a, false, 80633, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f70815a, false, 80633, new Class[]{Object.class}, Object.class);
        }
        VideoRecordNewActivity videoRecordNewActivity = this.f70816b;
        videoRecordNewActivity.runOnUiThread(new bm(videoRecordNewActivity, this.f70817c));
        return Unit.INSTANCE;
    }
}
