package com.ss.android.ugc.aweme.main;

import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.k;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.share.viewmodel.FeedPanelStateViewModel;
import com.ss.android.ugc.aweme.video.o;
import java.lang.ref.WeakReference;

public final class bq extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54631a;

    /* renamed from: b  reason: collision with root package name */
    public final Activity f54632b;

    /* renamed from: c  reason: collision with root package name */
    boolean f54633c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f54634d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f54635e;

    /* renamed from: f  reason: collision with root package name */
    private FeedPanelStateViewModel f54636f;

    static class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54639a;

        a(Activity activity) {
            super(activity);
        }

        public final void a(Activity activity) {
            Activity activity2 = activity;
            if (PatchProxy.isSupport(new Object[]{activity2}, this, f54639a, false, 57626, new Class[]{Activity.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2}, this, f54639a, false, 57626, new Class[]{Activity.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.bridgeservice.a.a().showPrivacyDialog(activity2);
        }
    }

    static class b extends c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54640a;

        b(Activity activity) {
            super(activity);
        }

        public final void a(Activity activity) {
            Activity activity2 = activity;
            if (PatchProxy.isSupport(new Object[]{activity2}, this, f54640a, false, 57627, new Class[]{Activity.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2}, this, f54640a, false, 57627, new Class[]{Activity.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.bridgeservice.a.a().showProtocolDialog(activity2);
        }
    }

    static abstract class c extends ClickableSpan {

        /* renamed from: b  reason: collision with root package name */
        public static ChangeQuickRedirect f54641b;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<Activity> f54642a;

        public abstract void a(Activity activity);

        c(Activity activity) {
            this.f54642a = new WeakReference<>(activity);
        }

        public void updateDrawState(TextPaint textPaint) {
            TextPaint textPaint2 = textPaint;
            if (PatchProxy.isSupport(new Object[]{textPaint2}, this, f54641b, false, 57629, new Class[]{TextPaint.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textPaint2}, this, f54641b, false, 57629, new Class[]{TextPaint.class}, Void.TYPE);
                return;
            }
            textPaint2.setUnderlineText(false);
        }

        public void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f54641b, false, 57628, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f54641b, false, 57628, new Class[]{View.class}, Void.TYPE);
                return;
            }
            Activity activity = (Activity) this.f54642a.get();
            if (activity != null) {
                a(activity);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f54631a, false, 57622, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54631a, false, 57622, new Class[0], Void.TYPE);
            return;
        }
        if (!o.v()) {
            if (o.b().a()) {
                o.b().h();
                this.f54633c = true;
                return;
            }
        } else if (com.ss.android.ugc.playerkit.videoview.a.a().b()) {
            com.ss.android.ugc.playerkit.videoview.a.a().T();
            this.f54633c = true;
            return;
        }
        this.f54634d.postDelayed(new br(this), 1000);
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f54631a, false, 57621, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54631a, false, 57621, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{this}, null, bs.f54645a, true, 57631, new Class[]{Dialog.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this}, null, bs.f54645a, true, 57631, new Class[]{Dialog.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.g.a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            super.dismiss();
        } else {
            throw new IllegalStateException("debug check! this method should be called from main thread!");
        }
        if (this.f54633c) {
            if (!o.v()) {
                o.b().f();
            } else {
                com.ss.android.ugc.playerkit.videoview.a.a().S();
            }
            this.f54633c = false;
        }
        if (this.f54636f != null) {
            this.f54636f.f65314e.setValue(Boolean.FALSE);
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f54631a, false, 57617, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f54631a, false, 57617, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onWindowFocusChanged(z);
        if (z) {
            if (this.f54635e) {
                a();
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f54631a, false, 57618, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f54631a, false, 57618, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(C0906R.layout.k1);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        if (PatchProxy.isSupport(new Object[0], this, f54631a, false, 57620, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54631a, false, 57620, new Class[0], Void.TYPE);
        } else {
            TextView textView = (TextView) findViewById(C0906R.id.cx6);
            String string = getContext().getString(C0906R.string.dq_);
            String string2 = getContext().getString(C0906R.string.dq7);
            String string3 = getContext().getString(C0906R.string.dq8, new Object[]{string, string2});
            SpannableString spannableString = new SpannableString(string3);
            int indexOf = string3.indexOf(string);
            int length = string.length() + indexOf;
            int indexOf2 = string3.indexOf(string2);
            int length2 = string2.length() + indexOf2;
            bs.a(spannableString, new ForegroundColorSpan(getContext().getResources().getColor(C0906R.color.hs)), string3.indexOf(string), length, 33);
            bs.a(spannableString, new ForegroundColorSpan(getContext().getResources().getColor(C0906R.color.hs)), indexOf2, length2, 33);
            bs.a(spannableString, new b(this.f54632b), indexOf, length, 33);
            bs.a(spannableString, new a(this.f54632b), indexOf2, length2, 33);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setText(spannableString);
        }
        if (PatchProxy.isSupport(new Object[0], this, f54631a, false, 57619, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54631a, false, 57619, new Class[0], Void.TYPE);
        } else {
            ((TextView) findViewById(C0906R.id.y0)).setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54637a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f54637a, false, 57625, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f54637a, false, 57625, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (bq.this.f54632b != null) {
                        ((bm) com.ss.android.ugc.aweme.base.sharedpref.c.a(bq.this.f54632b, bm.class)).q(false);
                        bq.this.dismiss();
                        k.a().b();
                    }
                }
            });
        }
        this.f54634d = new Handler();
        if (this.f54636f != null) {
            this.f54636f.f65314e.setValue(Boolean.TRUE);
        }
    }

    public bq(Activity activity, boolean z) {
        super(activity, C0906R.style.tx);
        this.f54632b = activity;
        this.f54635e = z;
        if (this.f54632b instanceof FragmentActivity) {
            this.f54636f = (FeedPanelStateViewModel) ViewModelProviders.of((FragmentActivity) this.f54632b).get(FeedPanelStateViewModel.class);
        }
    }

    public static boolean a(com.ss.android.ugc.aweme.global.config.settings.pojo.a aVar, Context context) {
        boolean z;
        Integer num;
        com.ss.android.ugc.aweme.global.config.settings.pojo.a aVar2 = aVar;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{aVar2, context2}, null, f54631a, true, 57623, new Class[]{com.ss.android.ugc.aweme.global.config.settings.pojo.a.class, Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar2, context2}, null, f54631a, true, 57623, new Class[]{com.ss.android.ugc.aweme.global.config.settings.pojo.a.class, Context.class}, Boolean.TYPE)).booleanValue();
        }
        if (aVar2 != null) {
            z = false;
            if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a, false, 48458, new Class[0], Integer.class)) {
                num = (Integer) PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a, false, 48458, new Class[0], Integer.class);
            } else if (aVar2.f49569c == null) {
                num = aVar2.f49568b.getCloseLoginAgreement();
            } else {
                num = (Integer) com.ss.android.ugc.aweme.global.config.settings.pojo.a.a(aVar2.f49569c, "close_login_agreement", Integer.class, aVar2.f49568b.getCloseLoginAgreement());
            }
            if (num.intValue() == 1 || !((bm) com.ss.android.ugc.aweme.base.sharedpref.c.a(context2, bm.class)).p(true)) {
                return z;
            }
            return true;
        }
        z = false;
        return z;
    }
}
