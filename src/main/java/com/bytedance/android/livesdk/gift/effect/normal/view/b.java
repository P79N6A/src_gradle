package com.bytedance.android.livesdk.gift.effect.normal.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.os.Message;
import android.support.annotation.Nullable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.gift.effect.normal.e.a;
import com.bytedance.android.livesdkapi.depend.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;

public final class b extends LinearLayout implements View.OnClickListener, a.C0132a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14955a;

    /* renamed from: b  reason: collision with root package name */
    public View f14956b;

    /* renamed from: c  reason: collision with root package name */
    public AnimatorSet f14957c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.android.livesdk.gift.effect.normal.c.a f14958d;

    /* renamed from: e  reason: collision with root package name */
    public a f14959e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f14960f;
    public a.d g;
    private NormalGiftView h;
    private TextView i;
    private TextView j;
    private TextView k;
    private String l;
    private com.bytedance.android.livesdk.gift.effect.normal.d.b m;
    private com.bytedance.android.livesdk.gift.effect.entry.d.a n;
    private boolean o;
    private boolean p;

    private int getLayoutResource() {
        return C0906R.layout.amg;
    }

    public final void a(com.bytedance.android.livesdk.gift.effect.normal.d.b bVar, boolean z) {
        if (PatchProxy.isSupport(new Object[]{bVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, f14955a, false, 9583, new Class[]{com.bytedance.android.livesdk.gift.effect.normal.d.b.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar, Byte.valueOf(z)}, this, f14955a, false, 9583, new Class[]{com.bytedance.android.livesdk.gift.effect.normal.d.b.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.m = bVar;
        this.h.settingUi(this.m, z);
        this.l = String.valueOf(this.m.f14910d);
        a(this.l);
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f14955a, false, 9587, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14955a, false, 9587, new Class[0], Void.TYPE);
        } else if (!this.p) {
            if (this.f14957c != null && this.f14957c.isRunning()) {
                this.f14957c.removeAllListeners();
                this.f14957c.cancel();
                this.f14957c = null;
            }
            this.f14958d = null;
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f14955a, false, 9586, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14955a, false, 9586, new Class[0], Void.TYPE);
        } else if (!this.p) {
            if (this.f14959e.hasMessages(100)) {
                this.f14959e.removeMessages(100);
            }
            a(String.valueOf(this.m.f14910d));
            this.f14957c = com.bytedance.android.livesdk.gift.effect.normal.e.a.a(this.f14956b, this.g);
            this.f14960f = true;
            this.f14957c.start();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f14955a, false, 9589, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14955a, false, 9589, new Class[0], Void.TYPE);
            return;
        }
        this.p = true;
        c();
        if (this.f14958d != null) {
            this.f14958d = null;
        }
        if (this.n != null) {
            this.n = null;
        }
        if (this.f14959e.hasMessages(100)) {
            this.f14959e.removeMessages(100);
        }
        if (this.h != null) {
            this.h.stopDraw();
        }
    }

    public final void setClickListener(com.bytedance.android.livesdk.gift.effect.entry.d.a aVar) {
        this.n = aVar;
    }

    public b(Context context) {
        this(context, null);
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f14955a, false, 9590, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f14955a, false, 9590, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (!(this.m == null || this.m.l == null || this.n == null)) {
            this.n.a(this.m.l.getId());
        }
    }

    public final void setOrientation(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f14955a, false, 9581, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f14955a, false, 9581, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.setOrientation(i2);
        }
    }

    private void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f14955a, false, 9582, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f14955a, false, 9582, new Class[]{String.class}, Void.TYPE);
        } else if (this.k != null) {
            if (com.bytedance.android.live.uikit.a.a.a() || com.bytedance.android.live.uikit.a.a.j()) {
                String string = getResources().getString(C0906R.string.d3h, new Object[]{str});
                this.k.setText(string);
                this.i.setText(string);
                this.j.setText(string);
            } else if (com.bytedance.android.live.uikit.a.a.b() || com.bytedance.android.live.uikit.a.a.d() || com.bytedance.android.live.uikit.a.a.g()) {
                String str2 = str + PushConstants.PUSH_TYPE_NOTIFY;
                SpannableString spannableString = new SpannableString(str2);
                c.a(spannableString, new ForegroundColorSpan(Color.parseColor("#00000000")), str2.length() - 1, str2.length(), 33);
                this.k.setText(spannableString);
            } else {
                this.k.setText(str);
            }
        }
    }

    public final void a(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f14955a, false, 9579, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f14955a, false, 9579, new Class[]{Message.class}, Void.TYPE);
        } else if (message.what == 100 && !this.o) {
            this.o = true;
            this.g.c();
        }
    }

    private b(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f14955a, false, 9584, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f14955a, false, 9584, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        setX((float) i2);
        setY((float) i3);
    }

    public final void a(com.bytedance.android.livesdk.gift.effect.normal.c.a aVar, boolean z) {
        if (PatchProxy.isSupport(new Object[]{aVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, f14955a, false, 9585, new Class[]{com.bytedance.android.livesdk.gift.effect.normal.c.a.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, Byte.valueOf(z)}, this, f14955a, false, 9585, new Class[]{com.bytedance.android.livesdk.gift.effect.normal.c.a.class, Boolean.TYPE}, Void.TYPE);
        } else if (!this.p) {
            this.f14958d = aVar;
            this.h.playAnimation();
            this.f14957c = com.bytedance.android.livesdk.gift.effect.normal.e.a.a(this, z, this.g);
            this.f14957c.start();
        }
    }

    private b(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        this.l = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        this.f14959e = new com.bytedance.android.livesdkapi.depend.c.a(this);
        this.g = new a.d() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f14961a;

            public final void b() {
                if (PatchProxy.isSupport(new Object[0], this, f14961a, false, 9592, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f14961a, false, 9592, new Class[0], Void.TYPE);
                    return;
                }
                b.this.f14959e.sendEmptyMessageDelayed(100, 1000);
                b.this.f14960f = false;
                if (b.this.f14958d != null) {
                    b.this.f14958d.a();
                }
            }

            public final void d() {
                if (PatchProxy.isSupport(new Object[0], this, f14961a, false, 9594, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f14961a, false, 9594, new Class[0], Void.TYPE);
                    return;
                }
                if (b.this.f14958d != null) {
                    b.this.f14958d.c();
                }
            }

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f14961a, false, 9591, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f14961a, false, 9591, new Class[0], Void.TYPE);
                    return;
                }
                if (b.this.f14956b != null) {
                    b.this.f14956b.setVisibility(0);
                    b.this.f14957c = com.bytedance.android.livesdk.gift.effect.normal.e.a.a(b.this.f14956b, b.this.g);
                    b.this.f14960f = true;
                    b.this.f14957c.start();
                }
            }

            public final void c() {
                AnimatorSet animatorSet;
                if (PatchProxy.isSupport(new Object[0], this, f14961a, false, 9593, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f14961a, false, 9593, new Class[0], Void.TYPE);
                    return;
                }
                if (b.this.f14958d != null) {
                    b.this.f14958d.b();
                }
                b bVar = b.this;
                b bVar2 = b.this;
                a.d dVar = b.this.g;
                if (PatchProxy.isSupport(new Object[]{bVar2, dVar}, null, com.bytedance.android.livesdk.gift.effect.normal.e.a.f14913a, true, 9546, new Class[]{View.class, a.d.class}, AnimatorSet.class)) {
                    animatorSet = (AnimatorSet) PatchProxy.accessDispatch(new Object[]{bVar2, dVar}, null, com.bytedance.android.livesdk.gift.effect.normal.e.a.f14913a, true, 9546, new Class[]{View.class, a.d.class}, AnimatorSet.class);
                } else {
                    bVar2.getX();
                    float y = bVar2.getY();
                    ObjectAnimator duration = ObjectAnimator.ofFloat(bVar2, "translationY", new float[]{y, y - 100.0f}).setDuration(500);
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(bVar2, "alpha", new float[]{1.0f, 0.0f}).setDuration(500);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(new Animator[]{duration, duration2});
                    animatorSet2.setInterpolator(new AccelerateDecelerateInterpolator());
                    animatorSet2.addListener(new a.C0106a(a.b.exit, dVar));
                    animatorSet = animatorSet2;
                }
                bVar.f14957c = animatorSet;
                b.this.f14957c.start();
            }
        };
        LayoutInflater.from(context).inflate(getLayoutResource(), this);
        if (PatchProxy.isSupport(new Object[0], this, f14955a, false, 9580, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14955a, false, 9580, new Class[0], Void.TYPE);
            return;
        }
        this.h = (NormalGiftView) findViewById(C0906R.id.jv);
        if (com.bytedance.android.live.uikit.a.a.a() || com.bytedance.android.live.uikit.a.a.j()) {
            this.f14956b = findViewById(C0906R.id.uj);
            this.i = (TextView) findViewById(C0906R.id.um);
            this.j = (TextView) findViewById(C0906R.id.un);
            this.k = (TextView) findViewById(C0906R.id.uo);
        } else if (com.bytedance.android.live.uikit.a.a.d() || com.bytedance.android.live.uikit.a.a.g() || com.bytedance.android.live.uikit.a.a.b()) {
            this.f14956b = findViewById(C0906R.id.ul);
            this.k = (TextView) findViewById(C0906R.id.ur);
        } else {
            this.f14956b = findViewById(C0906R.id.uk);
            this.k = (TextView) findViewById(C0906R.id.uq);
            this.k.setTextSize(0, getResources().getDimension(C0906R.dimen.ns));
        }
        a(this.l);
        this.f14956b.setVisibility(4);
        this.h.setOnClickListener(this);
    }
}
