package com.ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.view.ViewGroup;
import butterknife.BindDimen;
import butterknife.ButterKnife;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.common.adapter.AbsAwemeViewHolder;
import com.ss.android.ugc.aweme.common.adapter.AnimatedViewHolder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.setting.AbTestManager;

public class CoverViewHolder extends AbsAwemeViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41578a;
    @BindDimen(2131230827)
    int mHeight;
    @BindDimen(2131230828)
    int mWidth;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f41578a, false, 35542, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41578a, false, 35542, new Class[0], Void.TYPE);
        } else if (this.g != null) {
            Video video = ((Aweme) this.g).getVideo();
            if (video != null) {
                if (!e() || !a(video.getDynamicCover())) {
                    c.b(this.h, video.getCover());
                } else {
                    this.h.a(video.getDynamicCover());
                    this.i = true;
                }
            }
        }
    }

    public CoverViewHolder(View view, d dVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.h = (AnimatedImageView) view.findViewById(C0906R.id.ep);
        this.h.setOnClickListener(new e(this, dVar));
        if (AbTestManager.a().an()) {
            this.h.setAnimationListener(this.f40163e);
        }
    }

    public final void a(Aweme aweme, int i) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2, Integer.valueOf(i)}, this, f41578a, false, 35541, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, Integer.valueOf(i)}, this, f41578a, false, 35541, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE);
        } else if (aweme2 != null) {
            super.a(aweme, i);
            this.g = aweme2;
            AnimatedImageView animatedImageView = this.h;
            int i2 = this.mWidth;
            int i3 = this.mHeight;
            if (PatchProxy.isSupport(new Object[]{animatedImageView, Integer.valueOf(i2), Integer.valueOf(i3)}, null, AnimatedViewHolder.f2976f, true, 33361, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animatedImageView, Integer.valueOf(i2), Integer.valueOf(i3)}, null, AnimatedViewHolder.f2976f, true, 33361, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) animatedImageView.getLayoutParams();
                if (!(marginLayoutParams.width == i2 && marginLayoutParams.height == i3)) {
                    marginLayoutParams.width = i2;
                    marginLayoutParams.height = i3;
                    animatedImageView.setLayoutParams(marginLayoutParams);
                }
            }
            a();
        }
    }
}
