package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.utils.b;

public class LoadMoreViewHolder extends BaseViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51076a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f51077b;
    private Animation p;
    private Animation.AnimationListener q = new Animation.AnimationListener() {
        public final void onAnimationEnd(Animation animation) {
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }
    };

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51076a, false, 51480, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51076a, false, 51480, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.f51077b = (ImageView) a((int) C0906R.id.ccv);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f51076a, false, 51479, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51076a, false, 51479, new Class[0], Void.TYPE);
            return;
        }
        super.c();
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f51076a, false, 51477, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51076a, false, 51477, new Class[0], Void.TYPE);
            return;
        }
        if (this.p == null) {
            this.p = b.a(800, this.q);
        }
        this.f51077b.startAnimation(this.p);
    }

    public LoadMoreViewHolder(View view, int i) {
        super(view);
    }
}
