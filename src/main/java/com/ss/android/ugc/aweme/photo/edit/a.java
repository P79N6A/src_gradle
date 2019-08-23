package com.ss.android.ugc.aweme.photo.edit;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.fb;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class a implements Function1 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58521a;

    /* renamed from: b  reason: collision with root package name */
    private final PhotoEditActivity f58522b;

    a(PhotoEditActivity photoEditActivity) {
        this.f58522b = photoEditActivity;
    }

    public final Object invoke(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f58521a, false, 63629, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f58521a, false, 63629, new Class[]{Object.class}, Object.class);
        }
        PhotoEditActivity photoEditActivity = this.f58522b;
        photoEditActivity.f58508c.post(new c(photoEditActivity, fb.a((Context) photoEditActivity, photoEditActivity.f58507b.b(), photoEditActivity.f58507b.c())));
        return null;
    }
}
