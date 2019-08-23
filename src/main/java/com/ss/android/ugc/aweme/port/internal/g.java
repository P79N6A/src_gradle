package com.ss.android.ugc.aweme.port.internal;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.photo.publish.PhotoUploadSuccessPopView;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61168a;

    /* renamed from: b  reason: collision with root package name */
    private final PhotoContext f61169b;

    /* renamed from: c  reason: collision with root package name */
    private final Activity f61170c;

    /* renamed from: d  reason: collision with root package name */
    private final Aweme f61171d;

    g(PhotoContext photoContext, Activity activity, Aweme aweme) {
        this.f61169b = photoContext;
        this.f61170c = activity;
        this.f61171d = aweme;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f61168a, false, 67181, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61168a, false, 67181, new Class[0], Void.TYPE);
            return;
        }
        PhotoContext photoContext = this.f61169b;
        Activity activity = this.f61170c;
        Aweme aweme = this.f61171d;
        if (photoContext != null && activity != null) {
            PhotoUploadSuccessPopView photoUploadSuccessPopView = new PhotoUploadSuccessPopView(activity, aweme, photoContext);
            if (PatchProxy.isSupport(new Object[0], photoUploadSuccessPopView, PhotoUploadSuccessPopView.f58672a, false, 63771, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], photoUploadSuccessPopView, PhotoUploadSuccessPopView.f58672a, false, 63771, new Class[0], Void.TYPE);
                return;
            }
            if (photoUploadSuccessPopView.f58674c != null && !photoUploadSuccessPopView.f58674c.isFinishing() && !photoUploadSuccessPopView.isShowing()) {
                photoUploadSuccessPopView.g = System.currentTimeMillis() + ((long) photoUploadSuccessPopView.f58673b);
                photoUploadSuccessPopView.mPullUpLayout.postDelayed(photoUploadSuccessPopView.f58676e, (long) photoUploadSuccessPopView.f58673b);
                if (photoUploadSuccessPopView.f58675d.getParent() != null) {
                    ((ViewGroup) photoUploadSuccessPopView.f58675d.getParent()).removeView(photoUploadSuccessPopView.f58675d);
                }
                View rootView = photoUploadSuccessPopView.f58674c.getWindow().getDecorView().getRootView();
                int i = Build.VERSION.SDK_INT;
                photoUploadSuccessPopView.showAtLocation(rootView, 48, 0, -UIUtils.getStatusBarHeight(GlobalContext.getContext()));
            }
        }
    }
}
