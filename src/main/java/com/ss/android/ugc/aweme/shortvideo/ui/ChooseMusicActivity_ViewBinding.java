package com.ss.android.ugc.aweme.shortvideo.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.widget.Space;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.music.ui.FlyChangeView;

public class ChooseMusicActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70484a;

    /* renamed from: b  reason: collision with root package name */
    private ChooseMusicActivity f70485b;

    /* renamed from: c  reason: collision with root package name */
    private View f70486c;

    /* renamed from: d  reason: collision with root package name */
    private View f70487d;

    /* renamed from: e  reason: collision with root package name */
    private View f70488e;

    /* renamed from: f  reason: collision with root package name */
    private View f70489f;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f70484a, false, 80182, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70484a, false, 80182, new Class[0], Void.TYPE);
            return;
        }
        ChooseMusicActivity chooseMusicActivity = this.f70485b;
        if (chooseMusicActivity != null) {
            this.f70485b = null;
            chooseMusicActivity.tvSelelctMusic = null;
            chooseMusicActivity.tvSelectVideo = null;
            chooseMusicActivity.tvAdd = null;
            chooseMusicActivity.tvCancel = null;
            chooseMusicActivity.dividerView = null;
            chooseMusicActivity.pullLayout = null;
            chooseMusicActivity.topLayout = null;
            chooseMusicActivity.space = null;
            chooseMusicActivity.background = null;
            chooseMusicActivity.uploadRedPoint = null;
            chooseMusicActivity.mAwemeMusicViewPager = null;
            chooseMusicActivity.mBtnLiveRecord = null;
            this.f70486c.setOnClickListener(null);
            this.f70486c = null;
            this.f70487d.setOnClickListener(null);
            this.f70487d = null;
            this.f70488e.setOnClickListener(null);
            this.f70488e = null;
            this.f70489f.setOnClickListener(null);
            this.f70489f = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public ChooseMusicActivity_ViewBinding(final ChooseMusicActivity chooseMusicActivity, View view) {
        this.f70485b = chooseMusicActivity;
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.dib, "field 'tvSelelctMusic' and method 'click'");
        chooseMusicActivity.tvSelelctMusic = (TextView) Utils.castView(findRequiredView, C0906R.id.dib, "field 'tvSelelctMusic'", TextView.class);
        this.f70486c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f70490a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f70490a, false, 80183, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f70490a, false, 80183, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                chooseMusicActivity.click(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.dl8, "field 'tvSelectVideo' and method 'click'");
        chooseMusicActivity.tvSelectVideo = (TextView) Utils.castView(findRequiredView2, C0906R.id.dl8, "field 'tvSelectVideo'", TextView.class);
        this.f70487d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f70493a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f70493a, false, 80184, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f70493a, false, 80184, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                chooseMusicActivity.click(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.d8x, "field 'tvAdd' and method 'click'");
        chooseMusicActivity.tvAdd = (TextView) Utils.castView(findRequiredView3, C0906R.id.d8x, "field 'tvAdd'", TextView.class);
        this.f70488e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f70496a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f70496a, false, 80185, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f70496a, false, 80185, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                chooseMusicActivity.click(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, C0906R.id.d9y, "field 'tvCancel' and method 'click'");
        chooseMusicActivity.tvCancel = (TextView) Utils.castView(findRequiredView4, C0906R.id.d9y, "field 'tvCancel'", TextView.class);
        this.f70489f = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f70499a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f70499a, false, 80186, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f70499a, false, 80186, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                chooseMusicActivity.click(view2);
            }
        });
        chooseMusicActivity.dividerView = Utils.findRequiredView(view, C0906R.id.dts, "field 'dividerView'");
        chooseMusicActivity.pullLayout = (CoordinatorLayout) Utils.findRequiredViewAsType(view, C0906R.id.c92, "field 'pullLayout'", CoordinatorLayout.class);
        chooseMusicActivity.topLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.d5g, "field 'topLayout'", LinearLayout.class);
        chooseMusicActivity.space = (Space) Utils.findRequiredViewAsType(view, C0906R.id.css, "field 'space'", Space.class);
        chooseMusicActivity.background = (FrameLayout) Utils.findRequiredViewAsType(view, C0906R.id.j9, "field 'background'", FrameLayout.class);
        chooseMusicActivity.uploadRedPoint = Utils.findRequiredView(view, C0906R.id.dol, "field 'uploadRedPoint'");
        chooseMusicActivity.mAwemeMusicViewPager = (AwemeMusicViewPager) Utils.findRequiredViewAsType(view, C0906R.id.duu, "field 'mAwemeMusicViewPager'", AwemeMusicViewPager.class);
        chooseMusicActivity.mBtnLiveRecord = (FlyChangeView) Utils.findRequiredViewAsType(view, C0906R.id.oc, "field 'mBtnLiveRecord'", FlyChangeView.class);
    }
}
