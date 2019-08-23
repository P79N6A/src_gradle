package com.ss.android.ugc.aweme.feed.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class VideoShareView_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46354a;

    /* renamed from: b  reason: collision with root package name */
    private VideoShareView f46355b;

    /* renamed from: c  reason: collision with root package name */
    private View f46356c;

    /* renamed from: d  reason: collision with root package name */
    private View f46357d;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f46354a, false, 43364, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46354a, false, 43364, new Class[0], Void.TYPE);
            return;
        }
        VideoShareView videoShareView = this.f46355b;
        if (videoShareView != null) {
            this.f46355b = null;
            videoShareView.mLayout = null;
            videoShareView.shareIv = null;
            videoShareView.mShareCount = null;
            videoShareView.mShareContainerView = null;
            this.f46356c.setOnClickListener(null);
            this.f46356c = null;
            this.f46357d.setOnClickListener(null);
            this.f46357d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public VideoShareView_ViewBinding(final VideoShareView videoShareView, View view) {
        this.f46355b = videoShareView;
        videoShareView.mLayout = Utils.findRequiredView(view, C0906R.id.cqo, "field 'mLayout'");
        videoShareView.shareIv = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.cpw, "field 'shareIv'", RemoteImageView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.cpj, "field 'mShareCount' and method 'onClick'");
        videoShareView.mShareCount = (TextView) Utils.castView(findRequiredView, C0906R.id.cpj, "field 'mShareCount'", TextView.class);
        this.f46356c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46358a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f46358a, false, 43365, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f46358a, false, 43365, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                videoShareView.onClick(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.cpf, "field 'mShareContainerView' and method 'onClick'");
        videoShareView.mShareContainerView = findRequiredView2;
        this.f46357d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46361a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f46361a, false, 43366, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f46361a, false, 43366, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                videoShareView.onClick(view2);
            }
        });
    }
}
