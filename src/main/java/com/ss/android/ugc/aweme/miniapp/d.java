package com.ss.android.ugc.aweme.miniapp;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tt.option.share.OnShareEventListener;
import com.tt.option.share.ShareInfoModel;
import java.util.concurrent.Callable;

public final /* synthetic */ class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55665a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f55666b;

    /* renamed from: c  reason: collision with root package name */
    private final ShareInfoModel f55667c;

    /* renamed from: d  reason: collision with root package name */
    private final OnShareEventListener f55668d;

    d(Activity activity, ShareInfoModel shareInfoModel, OnShareEventListener onShareEventListener) {
        this.f55666b = activity;
        this.f55667c = shareInfoModel;
        this.f55668d = onShareEventListener;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f55665a, false, 59011, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f55665a, false, 59011, new Class[0], Object.class);
        }
        q.a().i.a(this.f55666b, this.f55667c, this.f55668d);
        return null;
    }
}
