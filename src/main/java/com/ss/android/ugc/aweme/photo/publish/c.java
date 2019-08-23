package com.ss.android.ugc.aweme.photo.publish;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class c implements Function1 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58698a;

    /* renamed from: b  reason: collision with root package name */
    private final PhotoPreviewActivity f58699b;

    /* renamed from: c  reason: collision with root package name */
    private final PhotoContext f58700c;

    c(PhotoPreviewActivity photoPreviewActivity, PhotoContext photoContext) {
        this.f58699b = photoPreviewActivity;
        this.f58700c = photoContext;
    }

    public final Object invoke(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f58698a, false, 63719, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f58698a, false, 63719, new Class[]{Object.class}, Object.class);
        }
        this.f58699b.a(this.f58700c);
        return null;
    }
}
