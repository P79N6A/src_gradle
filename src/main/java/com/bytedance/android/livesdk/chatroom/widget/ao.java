package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.uikit.d.c;
import com.bytedance.android.live.uikit.rtl.AutoRTLTextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public final class ao extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13454a;

    /* renamed from: b  reason: collision with root package name */
    public View f13455b;

    /* renamed from: c  reason: collision with root package name */
    public View f13456c;

    /* renamed from: d  reason: collision with root package name */
    public a f13457d;

    /* renamed from: e  reason: collision with root package name */
    public Animation f13458e;

    /* renamed from: f  reason: collision with root package name */
    public Animation f13459f;
    public Animation g;
    public Animation h;
    final int i = 294;
    final int j = 80;
    final int k = 160;
    final int l = 320;
    private LottieAnimationView m;
    private AutoRTLTextView n;
    private String o;
    private Boolean p = Boolean.TRUE;

    public interface a {
        void a();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f13454a, false, 8011, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13454a, false, 8011, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f13458e == null && this.g == null)) {
            this.f13456c.clearAnimation();
        }
        if (!(this.f13459f == null && this.h == null)) {
            this.f13455b.clearAnimation();
        }
    }

    public final void setDestText(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f13454a, false, 8008, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f13454a, false, 8008, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.n != null) {
            this.n.setText(str);
        }
    }

    public final void setAnimResource(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f13454a, false, 8006, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f13454a, false, 8006, new Class[]{String.class}, Void.TYPE);
        } else if (this.m != null && !TextUtils.isEmpty(str) && !str.equals(this.o)) {
            this.o = str;
            this.m.setAnimation(str);
            this.m.loop(true);
            this.m.playAnimation();
        }
    }

    public final void setClickListener(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f13454a, false, 8005, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f13454a, false, 8005, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.f13456c.setClickable(true);
        this.f13457d = aVar;
        this.f13456c.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f13463a;

            /* renamed from: c  reason: collision with root package name */
            private static final /* synthetic */ a.C0900a f13464c;

            static {
                if (PatchProxy.isSupport(new Object[0], null, f13463a, true, 8015, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], null, f13463a, true, 8015, new Class[0], Void.TYPE);
                    return;
                }
                b bVar = new b("SlideGuideView.java", AnonymousClass2.class);
                f13464c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.widget.SlideGuideView$2", "android.view.View", "view", "", "void"), 104);
            }

            public void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f13463a, false, 8014, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f13463a, false, 8014, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                com.bytedance.android.livesdk.a.b.a().a(b.a(f13464c, this, this, view));
                ao.this.f13457d.a();
            }
        });
    }

    public ao(Context context) {
        super(context);
        if (PatchProxy.isSupport(new Object[]{context}, this, f13454a, false, 8004, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f13454a, false, 8004, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        inflate(getContext(), C0906R.layout.al3, this);
        this.f13456c = findViewById(C0906R.id.ya);
        this.f13455b = findViewById(C0906R.id.yl);
        this.m = (LottieAnimationView) findViewById(C0906R.id.crx);
        this.n = (AutoRTLTextView) findViewById(C0906R.id.dau);
        if (c.a(context)) {
            this.n.setText(C0906R.string.djz);
        } else {
            this.n.setText(C0906R.string.dk0);
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f13455b.getLayoutParams();
        layoutParams.topMargin = (int) (((float) (((int) (((float) UIUtils.getScreenHeight(getContext())) - UIUtils.dip2Px(getContext(), 294.0f))) / 2)) - UIUtils.dip2Px(getContext(), 80.0f));
        this.f13455b.setLayoutParams(layoutParams);
        if (this.f13457d == null) {
            this.f13456c.setClickable(false);
        } else {
            this.f13456c.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f13460a;

                /* renamed from: c  reason: collision with root package name */
                private static final /* synthetic */ a.C0900a f13461c;

                static {
                    if (PatchProxy.isSupport(new Object[0], null, f13460a, true, 8013, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], null, f13460a, true, 8013, new Class[0], Void.TYPE);
                        return;
                    }
                    b bVar = new b("SlideGuideView.java", AnonymousClass1.class);
                    f13461c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.widget.SlideGuideView$1", "android.view.View", "view", "", "void"), 92);
                }

                public void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f13460a, false, 8012, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f13460a, false, 8012, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    com.bytedance.android.livesdk.a.b.a().a(b.a(f13461c, this, this, view));
                    ao.this.f13457d.a();
                }
            });
        }
    }

    public final void a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f13454a, false, 8007, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f13454a, false, 8007, new Class[]{String.class, String.class}, Void.TYPE);
        } else if (this.m != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !str.equals(this.o)) {
            this.o = str;
            this.m.setAnimation(str);
            this.m.setImageAssetsFolder(str2);
            this.m.loop(true);
            this.m.playAnimation();
        }
    }
}
