package com.ss.android.ugc.aweme.livewallpaper.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.SurfaceView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class LiveWallPaperPreviewActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53711a;

    /* renamed from: b  reason: collision with root package name */
    private LiveWallPaperPreviewActivity f53712b;

    /* renamed from: c  reason: collision with root package name */
    private View f53713c;

    /* renamed from: d  reason: collision with root package name */
    private View f53714d;

    /* renamed from: e  reason: collision with root package name */
    private View f53715e;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f53711a, false, 56240, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53711a, false, 56240, new Class[0], Void.TYPE);
            return;
        }
        LiveWallPaperPreviewActivity liveWallPaperPreviewActivity = this.f53712b;
        if (liveWallPaperPreviewActivity != null) {
            this.f53712b = null;
            liveWallPaperPreviewActivity.mPreviewSurface = null;
            this.f53713c.setOnClickListener(null);
            this.f53713c = null;
            this.f53714d.setOnClickListener(null);
            this.f53714d = null;
            this.f53715e.setOnClickListener(null);
            this.f53715e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public LiveWallPaperPreviewActivity_ViewBinding(final LiveWallPaperPreviewActivity liveWallPaperPreviewActivity, View view) {
        this.f53712b = liveWallPaperPreviewActivity;
        liveWallPaperPreviewActivity.mPreviewSurface = (SurfaceView) Utils.findRequiredViewAsType(view, C0906R.id.cos, "field 'mPreviewSurface'", SurfaceView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.ix, "method 'exit'");
        this.f53713c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f53716a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f53716a, false, 56241, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f53716a, false, 56241, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                liveWallPaperPreviewActivity.exit(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.diq, "method 'setLiveWallPaper'");
        this.f53714d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f53719a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f53719a, false, 56242, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f53719a, false, 56242, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                liveWallPaperPreviewActivity.setLiveWallPaper();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.b3b, "method 'onClickMore'");
        this.f53715e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f53722a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f53722a, false, 56243, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f53722a, false, 56243, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                liveWallPaperPreviewActivity.onClickMore();
            }
        });
    }
}
