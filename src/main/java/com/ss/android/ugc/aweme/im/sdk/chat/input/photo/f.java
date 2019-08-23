package com.ss.android.ugc.aweme.im.sdk.chat.input.photo;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.a;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.concurrent.Callable;

public final /* synthetic */ class f implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50840a;

    /* renamed from: b  reason: collision with root package name */
    private final PhotoDetailActivity f50841b;

    f(PhotoDetailActivity photoDetailActivity) {
        this.f50841b = photoDetailActivity;
    }

    public final void run(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f50840a, false, 50983, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f50840a, false, 50983, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        PhotoDetailActivity photoDetailActivity = this.f50841b;
        if (((Boolean) obj).booleanValue()) {
            UrlModel urlModel = photoDetailActivity.j;
            if (PatchProxy.isSupport(new Object[]{urlModel}, photoDetailActivity, PhotoDetailActivity.f50744a, false, 50972, new Class[]{UrlModel.class}, Void.TYPE)) {
                PhotoDetailActivity photoDetailActivity2 = photoDetailActivity;
                PatchProxy.accessDispatch(new Object[]{urlModel}, photoDetailActivity2, PhotoDetailActivity.f50744a, false, 50972, new Class[]{UrlModel.class}, Void.TYPE);
                return;
            }
            i.a((Callable<TResult>) new d<TResult>(photoDetailActivity, urlModel));
        }
    }
}
