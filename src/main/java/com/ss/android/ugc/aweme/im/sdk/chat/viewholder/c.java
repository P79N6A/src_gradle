package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.utils.b;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51173a;

    /* renamed from: b  reason: collision with root package name */
    private n f51174b;

    /* renamed from: c  reason: collision with root package name */
    private Animation f51175c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f51176d;

    /* renamed from: e  reason: collision with root package name */
    private View.OnAttachStateChangeListener f51177e;

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f51173a, false, 51613, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51173a, false, 51613, new Class[0], Void.TYPE);
        } else if (this.f51176d != null) {
            b.a(this.f51176d);
            this.f51176d.setVisibility(8);
        }
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f51173a, false, 51614, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51173a, false, 51614, new Class[0], Void.TYPE);
        } else if (this.f51176d != null) {
            b.a(this.f51176d);
            this.f51176d.setImageResource(2130840085);
            this.f51176d.setVisibility(0);
        }
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f51173a, false, 51612, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51173a, false, 51612, new Class[0], Void.TYPE);
            return;
        }
        if (this.f51175c == null) {
            this.f51175c = b.a(800, null);
        }
        if (this.f51176d != null) {
            this.f51176d.setImageResource(2130839265);
            this.f51176d.setVisibility(0);
            b.a(this.f51176d);
            this.f51176d.startAnimation(this.f51175c);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51173a, false, 51611, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51173a, false, 51611, new Class[0], Void.TYPE);
        } else if (this.f51174b != null) {
            this.f51176d.setClickable(true);
            int msgStatus = this.f51174b.getMsgStatus();
            if (msgStatus != 5) {
                switch (msgStatus) {
                    case 0:
                        this.f51176d.setClickable(false);
                        b();
                        return;
                    case 1:
                        this.f51176d.setClickable(false);
                        b();
                        return;
                    case 2:
                        break;
                    case 3:
                        d();
                        return;
                }
            }
            c();
        }
    }

    public c(ImageView imageView) {
        this.f51176d = imageView;
        if (PatchProxy.isSupport(new Object[0], this, f51173a, false, 51615, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51173a, false, 51615, new Class[0], Void.TYPE);
            return;
        }
        if (this.f51177e == null) {
            this.f51177e = new View.OnAttachStateChangeListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f51178a;

                public final void onViewDetachedFromWindow(View view) {
                }

                public final void onViewAttachedToWindow(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f51178a, false, 51616, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f51178a, false, 51616, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    c.this.a();
                }
            };
        }
        this.f51176d.removeOnAttachStateChangeListener(this.f51177e);
        this.f51176d.addOnAttachStateChangeListener(this.f51177e);
    }

    public final void a(n nVar) {
        if (PatchProxy.isSupport(new Object[]{nVar}, this, f51173a, false, 51610, new Class[]{n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar}, this, f51173a, false, 51610, new Class[]{n.class}, Void.TYPE);
            return;
        }
        this.f51176d.setTag(50331648, 6);
        this.f51176d.setTag(67108864, nVar);
        this.f51174b = nVar;
        a();
    }
}
