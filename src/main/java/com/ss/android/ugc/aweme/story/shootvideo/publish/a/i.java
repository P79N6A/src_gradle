package com.ss.android.ugc.aweme.story.shootvideo.publish.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.port.in.s;

public class i extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73658a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f73659b;

    /* renamed from: c  reason: collision with root package name */
    protected s.a f73660c;

    /* renamed from: d  reason: collision with root package name */
    public a f73661d;

    /* renamed from: e  reason: collision with root package name */
    private ViewGroup f73662e;

    /* renamed from: f  reason: collision with root package name */
    private View f73663f;
    private View g;
    private TextView h;
    private TextView i;
    private String j;
    private Context k;

    public interface a {
        void dismiss();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a() {
        com.ss.android.ugc.aweme.utils.a.f75468b.a("duoshan_toast_confirm", d.a().a("creation_id", this.j).a("shoot_way", "story").a("enter_from", "edit_post_page").f34114b);
        if (this.f73660c != null) {
            this.f73660c.a("sync_duoshan", 1);
        }
        dismiss();
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f73658a, false, 85451, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73658a, false, 85451, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{this}, null, l.f73675a, true, 85459, new Class[]{Dialog.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this}, null, l.f73675a, true, 85459, new Class[]{Dialog.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.g.a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            super.dismiss();
        } else {
            throw new IllegalStateException("debug check! this method should be called from main thread!");
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f73662e, "alpha", new float[]{this.f73662e.getAlpha(), 0.0f}).setDuration(300);
        duration.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f73669a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f73669a, false, 85458, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f73669a, false, 85458, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                if (i.this.f73661d != null) {
                    i.this.f73661d.dismiss();
                }
                super.onAnimationEnd(animator);
            }
        });
        duration.start();
    }

    public void show() {
        final String str;
        String str2;
        String str3;
        String str4;
        i iVar;
        if (PatchProxy.isSupport(new Object[0], this, f73658a, false, 85450, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73658a, false, 85450, new Class[0], Void.TYPE);
            return;
        }
        super.show();
        if (this.f73659b) {
            str4 = (String) com.ss.android.ugc.aweme.port.in.a.o.o().a();
            str3 = (String) com.ss.android.ugc.aweme.port.in.a.o.p().a();
            str2 = (String) com.ss.android.ugc.aweme.port.in.a.o.q().a();
            str = (String) com.ss.android.ugc.aweme.port.in.a.o.r().a();
        } else {
            str4 = (String) com.ss.android.ugc.aweme.port.in.a.o.s().a();
            str3 = (String) com.ss.android.ugc.aweme.port.in.a.o.t().a();
            str2 = (String) com.ss.android.ugc.aweme.port.in.a.o.u().a();
            str = (String) com.ss.android.ugc.aweme.port.in.a.o.v().a();
        }
        if (TextUtils.isEmpty(str4)) {
            str4 = this.k.getResources().getString(C0906R.string.ch7);
        }
        if (TextUtils.isEmpty(str3)) {
            if (this.f73659b) {
                str3 = this.k.getResources().getString(C0906R.string.ch6);
            } else {
                str3 = this.k.getResources().getString(C0906R.string.ch8);
            }
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = this.k.getResources().getString(C0906R.string.ch9);
        }
        if (TextUtils.isEmpty(str)) {
            str = "https://maya.ppkankan01.com/static/cooperation/";
        }
        if (PatchProxy.isSupport(new Object[]{str4}, this, f73658a, false, 85448, new Class[]{String.class}, i.class)) {
            iVar = (i) PatchProxy.accessDispatch(new Object[]{str4}, this, f73658a, false, 85448, new Class[]{String.class}, i.class);
        } else {
            this.h.setText(str4);
            iVar = this;
        }
        if (PatchProxy.isSupport(new Object[]{str3, str2, str}, iVar, f73658a, false, 85449, new Class[]{String.class, String.class, String.class}, i.class)) {
            i iVar2 = (i) PatchProxy.accessDispatch(new Object[]{str3, str2, str}, iVar, f73658a, false, 85449, new Class[]{String.class, String.class, String.class}, i.class);
        } else {
            String str5 = str3 + str2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str5);
            int length = str3.length();
            spannableStringBuilder.setSpan(new ClickableSpan() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f73666a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f73666a, false, 85456, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f73666a, false, 85456, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.port.in.a.f61121d.a(i.this.getContext(), str);
                }

                public final void updateDrawState(TextPaint textPaint) {
                    TextPaint textPaint2 = textPaint;
                    if (PatchProxy.isSupport(new Object[]{textPaint2}, this, f73666a, false, 85457, new Class[]{TextPaint.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{textPaint2}, this, f73666a, false, 85457, new Class[]{TextPaint.class}, Void.TYPE);
                        return;
                    }
                    textPaint2.setUnderlineText(false);
                }
            }, length, str5.length(), 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-1090238067), length, str5.length(), 33);
            iVar.i.setMovementMethod(LinkMovementMethod.getInstance());
            iVar.i.setHighlightColor(iVar.k.getResources().getColor(17170445));
            iVar.i.setText(spannableStringBuilder);
        }
        ObjectAnimator.ofFloat(this.f73662e, "alpha", new float[]{0.0f, 1.0f}).setDuration(300).start();
        com.ss.android.ugc.aweme.utils.a.f75468b.a("duoshan_toast_show", d.a().a("creation_id", this.j).a("shoot_way", "story").a("enter_from", "edit_post_page").f34114b);
    }

    public i(Context context) {
        super(context, C0906R.style.gc);
        this.k = context;
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f73658a, false, 85447, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f73658a, false, 85447, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(C0906R.layout.kf);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        getWindow().setAttributes(attributes);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(null, null, null));
        shapeDrawable.getPaint().setColor(Integer.MIN_VALUE);
        getWindow().setBackgroundDrawable(shapeDrawable);
        this.f73662e = (ViewGroup) findViewById(C0906R.id.bl3);
        this.f73663f = findViewById(C0906R.id.tr);
        this.g = findViewById(C0906R.id.cxb);
        this.h = (TextView) findViewById(C0906R.id.d42);
        this.i = (TextView) findViewById(C0906R.id.zd);
        this.g.setOnClickListener(new j(this));
        this.f73663f.setOnClickListener(new k(this));
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        this.f73660c = com.ss.android.ugc.aweme.port.in.a.B.c();
        this.f73660c.a((s.b) new s.b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f73664a;

            public final void b() {
            }

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f73664a, false, 85455, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f73664a, false, 85455, new Class[0], Void.TYPE);
                    return;
                }
                com.ss.android.ugc.aweme.port.in.a.o.k().a(Boolean.TRUE);
            }
        });
    }
}
