package com.ss.android.ugc.aweme.photo.publish;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.functions.Function0;

public final /* synthetic */ class b implements Function0 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58696a;

    /* renamed from: b  reason: collision with root package name */
    private final PhotoPreviewActivity f58697b;

    b(PhotoPreviewActivity photoPreviewActivity) {
        this.f58697b = photoPreviewActivity;
    }

    public final Object invoke() {
        if (!PatchProxy.isSupport(new Object[0], this, f58696a, false, 63718, new Class[0], Object.class)) {
            return Boolean.valueOf(this.f58697b.f58627b);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f58696a, false, 63718, new Class[0], Object.class);
    }
}
