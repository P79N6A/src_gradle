package com.ss.android.ugc.aweme.miniapp.f;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.share.command.e;
import com.ss.android.ugc.aweme.share.ax;
import com.tt.option.share.OnShareEventListener;
import com.tt.option.share.ShareInfoModel;
import java.util.concurrent.Callable;

public final /* synthetic */ class g implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55758a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f55759b;

    /* renamed from: c  reason: collision with root package name */
    private final ShareInfoModel f55760c;

    /* renamed from: d  reason: collision with root package name */
    private final OnShareEventListener f55761d;

    g(Activity activity, ShareInfoModel shareInfoModel, OnShareEventListener onShareEventListener) {
        this.f55759b = activity;
        this.f55760c = shareInfoModel;
        this.f55761d = onShareEventListener;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f55758a, false, 59446, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f55758a, false, 59446, new Class[0], Object.class);
        }
        Activity activity = this.f55759b;
        ShareInfoModel shareInfoModel = this.f55760c;
        new ax(activity, e.b(shareInfoModel, activity), this.f55761d).show();
        return null;
    }
}
