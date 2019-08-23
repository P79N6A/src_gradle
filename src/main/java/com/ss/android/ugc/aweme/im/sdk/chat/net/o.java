package com.ss.android.ugc.aweme.im.sdk.chat.net;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.okhttp.OkHttpClient;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.chat.model.OnlyPictureContent;
import com.ss.android.ugc.aweme.im.sdk.utils.l;
import com.ss.android.ugc.aweme.im.sdk.utils.z;

public final class o extends y {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50967a;

    /* renamed from: b  reason: collision with root package name */
    public static int f50968b;

    /* renamed from: c  reason: collision with root package name */
    n f50969c;

    /* renamed from: f  reason: collision with root package name */
    private WeakHandler f50970f;
    private OnlyPictureContent g;

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f50967a, false, 51290, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f50967a, false, 51290, new Class[]{String.class}, Void.TYPE);
            return;
        }
        super.a(str);
        f50968b++;
        z.a().a(this.f50969c);
        this.f50969c.setMsgStatus(3);
        this.f50970f.post(new r(this));
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f50967a, false, 51289, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f50967a, false, 51289, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        super.a(th);
        f50968b++;
        z.a().a(this.f50969c);
        this.f50969c.setMsgStatus(3);
        this.f50970f.post(new q(this));
    }

    public final void b(String str, UrlModel urlModel) {
        if (PatchProxy.isSupport(new Object[]{str, urlModel}, this, f50967a, false, 51288, new Class[]{String.class, UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, urlModel}, this, f50967a, false, 51288, new Class[]{String.class, UrlModel.class}, Void.TYPE);
        } else if (urlModel != null && urlModel.getUrlList() != null && !urlModel.getUrlList().isEmpty()) {
            this.g.setUrl(urlModel);
            this.f50969c.setContent(l.a(this.g));
            this.f50970f.post(new p(this));
            super.b(str, urlModel);
        }
    }

    public o(OkHttpClient okHttpClient, WeakHandler weakHandler, OnlyPictureContent onlyPictureContent, n nVar) {
        super(okHttpClient);
        this.f50970f = weakHandler;
        this.g = onlyPictureContent;
        this.f51014e = onlyPictureContent.getPicturePath();
        if (!onlyPictureContent.isSendRaw() && !TextUtils.isEmpty(onlyPictureContent.getCompressPath())) {
            this.f51014e = onlyPictureContent.getCompressPath();
        }
        this.f50969c = nVar;
        this.i = a(nVar);
    }
}
