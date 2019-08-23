package com.ss.android.ugc.aweme.shortvideo.cut.gif;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView;

public class Video2GifCutFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66419a;

    /* renamed from: b  reason: collision with root package name */
    private Video2GifCutFragment f66420b;

    /* renamed from: c  reason: collision with root package name */
    private View f66421c;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f66419a, false, 75830, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66419a, false, 75830, new Class[0], Void.TYPE);
            return;
        }
        Video2GifCutFragment video2GifCutFragment = this.f66420b;
        if (video2GifCutFragment != null) {
            this.f66420b = null;
            video2GifCutFragment.textureVideoView = null;
            video2GifCutFragment.ivPlay = null;
            video2GifCutFragment.flVideoContainer = null;
            video2GifCutFragment.videoEditView = null;
            video2GifCutFragment.tvSelectedTime = null;
            this.f66421c.setOnClickListener(null);
            this.f66421c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public Video2GifCutFragment_ViewBinding(final Video2GifCutFragment video2GifCutFragment, View view) {
        this.f66420b = video2GifCutFragment;
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.d28, "field 'textureVideoView' and method 'resolveUiClick'");
        video2GifCutFragment.textureVideoView = (TextureView) Utils.castView(findRequiredView, C0906R.id.d28, "field 'textureVideoView'", TextureView.class);
        this.f66421c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f66422a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f66422a, false, 75831, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f66422a, false, 75831, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                video2GifCutFragment.resolveUiClick(view2);
            }
        });
        video2GifCutFragment.ivPlay = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.byk, "field 'ivPlay'", ImageView.class);
        video2GifCutFragment.flVideoContainer = (FrameLayout) Utils.findRequiredViewAsType(view, C0906R.id.agg, "field 'flVideoContainer'", FrameLayout.class);
        video2GifCutFragment.videoEditView = (VideoEditView) Utils.findRequiredViewAsType(view, C0906R.id.ds3, "field 'videoEditView'", VideoEditView.class);
        video2GifCutFragment.tvSelectedTime = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.dkg, "field 'tvSelectedTime'", DmtTextView.class);
    }
}
