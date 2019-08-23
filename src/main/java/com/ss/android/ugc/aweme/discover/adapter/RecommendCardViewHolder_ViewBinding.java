package com.ss.android.ugc.aweme.discover.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;

public class RecommendCardViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41742a;

    /* renamed from: b  reason: collision with root package name */
    private RecommendCardViewHolder f41743b;

    /* renamed from: c  reason: collision with root package name */
    private View f41744c;

    /* renamed from: d  reason: collision with root package name */
    private View f41745d;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f41742a, false, 35743, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41742a, false, 35743, new Class[0], Void.TYPE);
            return;
        }
        RecommendCardViewHolder recommendCardViewHolder = this.f41743b;
        if (recommendCardViewHolder != null) {
            this.f41743b = null;
            recommendCardViewHolder.closeIv = null;
            recommendCardViewHolder.avatar = null;
            recommendCardViewHolder.txtNickName = null;
            recommendCardViewHolder.closeContainer = null;
            recommendCardViewHolder.txtDescription = null;
            recommendCardViewHolder.ivFollow = null;
            recommendCardViewHolder.nickNameBg = null;
            recommendCardViewHolder.descriptionBg = null;
            recommendCardViewHolder.rootLayout = null;
            this.f41744c.setOnClickListener(null);
            this.f41744c = null;
            this.f41745d.setOnClickListener(null);
            this.f41745d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public RecommendCardViewHolder_ViewBinding(final RecommendCardViewHolder recommendCardViewHolder, View view) {
        this.f41743b = recommendCardViewHolder;
        recommendCardViewHolder.closeIv = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.ts, "field 'closeIv'", ImageView.class);
        recommendCardViewHolder.avatar = (CircleImageView) Utils.findRequiredViewAsType(view, C0906R.id.hk, "field 'avatar'", CircleImageView.class);
        recommendCardViewHolder.txtNickName = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.bqr, "field 'txtNickName'", TextView.class);
        recommendCardViewHolder.closeContainer = (FrameLayout) Utils.findRequiredViewAsType(view, C0906R.id.tp, "field 'closeContainer'", FrameLayout.class);
        recommendCardViewHolder.txtDescription = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.a3x, "field 'txtDescription'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.b1d, "field 'ivFollow' and method 'onClick'");
        recommendCardViewHolder.ivFollow = (AnimationImageView) Utils.castView(findRequiredView, C0906R.id.b1d, "field 'ivFollow'", AnimationImageView.class);
        this.f41744c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41746a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f41746a, false, 35744, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f41746a, false, 35744, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                recommendCardViewHolder.onClick(view2);
            }
        });
        recommendCardViewHolder.nickNameBg = Utils.findRequiredView(view, C0906R.id.bqs, "field 'nickNameBg'");
        recommendCardViewHolder.descriptionBg = Utils.findRequiredView(view, C0906R.id.a3y, "field 'descriptionBg'");
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.chy, "field 'rootLayout' and method 'onClick'");
        recommendCardViewHolder.rootLayout = (LinearLayout) Utils.castView(findRequiredView2, C0906R.id.chy, "field 'rootLayout'", LinearLayout.class);
        this.f41745d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41749a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f41749a, false, 35745, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f41749a, false, 35745, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                recommendCardViewHolder.onClick(view2);
            }
        });
    }
}
