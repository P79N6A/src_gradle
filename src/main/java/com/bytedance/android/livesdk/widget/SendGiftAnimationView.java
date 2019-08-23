package com.bytedance.android.livesdk.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.b;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class SendGiftAnimationView extends RelativeLayout implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18334a;

    /* renamed from: b  reason: collision with root package name */
    public Context f18335b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f18336c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f18337d;

    /* renamed from: e  reason: collision with root package name */
    public int f18338e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f18339f;
    private HSImageView g;
    private Handler h;
    private Pair<Float, Animator> i;

    public static class a {
    }

    public void handleMsg(Message message) {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f18334a, false, 14645, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18334a, false, 14645, new Class[0], Void.TYPE);
            return;
        }
        this.h.removeCallbacksAndMessages(null);
        this.f18337d.setText(C0906R.string.djd);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f18334a, false, 14648, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18334a, false, 14648, new Class[0], Void.TYPE);
            return;
        }
        this.h.postDelayed(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f18340a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f18340a, false, 14650, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f18340a, false, 14650, new Class[0], Void.TYPE);
                } else if (SendGiftAnimationView.this.f18338e > 0) {
                    SendGiftAnimationView.this.f18338e--;
                    SendGiftAnimationView.this.f18337d.setText(SendGiftAnimationView.this.f18335b.getString(C0906R.string.cr0, new Object[]{Integer.valueOf(SendGiftAnimationView.this.f18338e)}));
                    SendGiftAnimationView.this.c();
                } else {
                    SendGiftAnimationView.this.f18337d.setText(C0906R.string.djd);
                    com.bytedance.android.livesdk.u.a.a().a((Object) new a());
                }
            }
        }, 1000);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f18334a, false, 14646, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18334a, false, 14646, new Class[0], Void.TYPE);
            return;
        }
        this.h.removeCallbacksAndMessages(null);
        this.f18338e = 3;
        this.f18337d.setText(this.f18335b.getString(C0906R.string.cr0, new Object[]{Integer.valueOf(this.f18338e)}));
        c();
    }

    public SendGiftAnimationView(Context context) {
        this(context, null);
    }

    public final void a(Prop prop) {
        if (PatchProxy.isSupport(new Object[]{prop}, this, f18334a, false, 14644, new Class[]{Prop.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{prop}, this, f18334a, false, 14644, new Class[]{Prop.class}, Void.TYPE);
        } else if (prop != null) {
            a(prop.gift);
            this.f18336c.setText(ac.a((int) C0906R.string.d3s, Integer.valueOf(prop.count)));
        }
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f18334a, false, 14649, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f18334a, false, 14649, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.i == null || this.i.second == null || this.i.first == null || ((Float) this.i.first).floatValue() != f2) {
            PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("scaleX", new float[]{1.0f, f2, 1.0f});
            PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("scaleY", new float[]{1.0f, f2, 1.0f});
            this.i = new Pair<>(Float.valueOf(f2), ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{ofFloat, ofFloat2}));
            ((Animator) this.i.second).setDuration(200);
        }
        ((Animator) this.i.second).start();
    }

    public final void a(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f18334a, false, 14643, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f18334a, false, 14643, new Class[]{b.class}, Void.TYPE);
        } else if (bVar != null) {
            if (bVar.l != 0) {
                this.f18339f.setTextColor(bVar.l);
            } else {
                this.f18339f.setTextColor(this.f18335b.getResources().getColor(C0906R.color.si));
            }
            this.f18339f.setText(bVar.f15102a);
            if (bVar.m != 0) {
                this.f18336c.setTextColor(bVar.m);
            } else {
                this.f18336c.setTextColor(this.f18335b.getResources().getColor(C0906R.color.aei));
            }
            if ((5 == bVar.f15106e || bVar.f15107f != 0) && !(5 == bVar.f15106e && bVar.n == 0)) {
                UIUtils.setViewVisibility(this.f18336c, 0);
            } else {
                UIUtils.setViewVisibility(this.f18336c, 4);
            }
            if (5 == bVar.f15106e) {
                this.f18336c.setText(this.f18335b.getString(C0906R.string.cug, new Object[]{Integer.valueOf(bVar.n)}));
            } else {
                this.f18336c.setText(this.f18335b.getString(C0906R.string.cuh, new Object[]{Integer.valueOf(bVar.f15107f)}));
            }
            com.bytedance.android.livesdk.chatroom.f.b.a(this.g, bVar.f15103b);
        }
    }

    public SendGiftAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SendGiftAnimationView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f18335b = context;
        this.h = new WeakHandler(Looper.getMainLooper(), this);
        if (PatchProxy.isSupport(new Object[0], this, f18334a, false, 14642, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18334a, false, 14642, new Class[0], Void.TYPE);
            return;
        }
        View.inflate(this.f18335b, C0906R.layout.ajc, this);
        this.f18339f = (TextView) findViewById(C0906R.id.bpn);
        this.g = (HSImageView) findViewById(C0906R.id.a1a);
        this.f18336c = (TextView) findViewById(C0906R.id.a4q);
        this.f18337d = (TextView) findViewById(C0906R.id.a66);
    }
}
