package com.ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.ss.android.ugc.aweme.common.adapter.AbsAwemeViewHolder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;

public abstract class AbsCellViewHolder extends AbsAwemeViewHolder {
    public static ChangeQuickRedirect t;
    protected Context u;

    public abstract void a(float f2);

    public abstract void b();

    public abstract void d(boolean z);

    public abstract String j();

    public abstract boolean k();

    public abstract void l();

    public void i() {
        if (PatchProxy.isSupport(new Object[0], this, t, false, 40274, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 40274, new Class[0], Void.TYPE);
        } else if (this.g != null) {
            Video video = ((Aweme) this.g).getVideo();
            if (video != null) {
                if (e() && a(video.getDynamicCover())) {
                    this.h.a(video.getDynamicCover());
                    this.i = true;
                } else if (video.getCover() == null || video.getCover().getUrlList() == null || video.getCover().getUrlList().size() == 0 || TextUtils.isEmpty(video.getCover().getUrlList().get(0))) {
                    this.h.setImageResource(C0906R.color.a0k);
                } else {
                    c.b(this.h, video.getCover());
                }
            }
        }
    }

    public AbsCellViewHolder(View view) {
        super(view);
        this.u = view.getContext();
    }

    public final void a(AnimatedImageView animatedImageView) {
        if (PatchProxy.isSupport(new Object[]{animatedImageView}, this, t, false, 40273, new Class[]{AnimatedImageView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{animatedImageView}, this, t, false, 40273, new Class[]{AnimatedImageView.class}, Void.TYPE);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) animatedImageView.getParent();
        if (viewGroup instanceof FixedRatioFrameLayout) {
            ((FixedRatioFrameLayout) viewGroup).setWhRatio(0.625f);
        }
        ((GenericDraweeHierarchy) animatedImageView.getHierarchy()).setActualImageFocusPoint(new PointF(0.5f, 0.0f));
    }
}
