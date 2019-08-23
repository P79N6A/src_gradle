package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.fb;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class aa implements Function1 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70737a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishPreviewActivity f70738b;

    aa(VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity) {
        this.f70738b = vEVideoPublishPreviewActivity;
    }

    public final Object invoke(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f70737a, false, 80354, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f70737a, false, 80354, new Class[]{Object.class}, Object.class);
        }
        VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity = this.f70738b;
        fb.a((View) vEVideoPublishPreviewActivity.f70558d, (Context) vEVideoPublishPreviewActivity, vEVideoPublishPreviewActivity.f70560f, vEVideoPublishPreviewActivity.g);
        fb.a((View) vEVideoPublishPreviewActivity.f70556b, (Context) vEVideoPublishPreviewActivity, vEVideoPublishPreviewActivity.f70560f, vEVideoPublishPreviewActivity.g);
        vEVideoPublishPreviewActivity.a();
        return null;
    }
}
