package com.ss.android.ugc.aweme.photo.publish;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import kotlin.jvm.functions.Function0;

public final /* synthetic */ class a implements Function0 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58693a;

    /* renamed from: b  reason: collision with root package name */
    private final PhotoPreviewActivity f58694b;

    /* renamed from: c  reason: collision with root package name */
    private final PhotoContext f58695c;

    a(PhotoPreviewActivity photoPreviewActivity, PhotoContext photoContext) {
        this.f58694b = photoPreviewActivity;
        this.f58695c = photoContext;
    }

    public final Object invoke() {
        if (PatchProxy.isSupport(new Object[0], this, f58693a, false, 63717, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f58693a, false, 63717, new Class[0], Object.class);
        }
        PhotoPreviewActivity photoPreviewActivity = this.f58694b;
        photoPreviewActivity.a(this.f58695c);
        photoPreviewActivity.f58627b = true;
        return null;
    }
}
