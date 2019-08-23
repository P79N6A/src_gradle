package com.ss.android.ugc.aweme.im.sdk.chat.net.a;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.chat.model.EncryptedVideoContent;
import com.ss.android.ugc.aweme.im.sdk.chat.net.upload.a;
import com.ss.android.ugc.aweme.im.sdk.widget.CircleProgressTextView;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50902a;

    /* renamed from: b  reason: collision with root package name */
    public n f50903b;

    /* renamed from: c  reason: collision with root package name */
    public CircleProgressTextView f50904c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f50905d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f50906e;

    /* renamed from: f  reason: collision with root package name */
    private a f50907f;
    private View.OnAttachStateChangeListener g;

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f50902a, false, 51361, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50902a, false, 51361, new Class[0], Void.TYPE);
            return;
        }
        e.f50897b.b(this.f50903b);
        this.f50906e.setVisibility(0);
        this.f50904c.setVisibility(8);
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f50902a, false, 51363, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50902a, false, 51363, new Class[0], Void.TYPE);
            return;
        }
        if (this.f50907f == null) {
            this.f50907f = new a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50910a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f50910a, false, 51370, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f50910a, false, 51370, new Class[0], Void.TYPE);
                        return;
                    }
                    g.this.f50904c.setProgress(1.0d);
                }

                public final void a(double d2) {
                    if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2)}, this, f50910a, false, 51367, new Class[]{Double.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2)}, this, f50910a, false, 51367, new Class[]{Double.TYPE}, Void.TYPE);
                        return;
                    }
                    g.this.f50904c.setProgress(d2);
                }

                public final void a(String str) {
                    if (PatchProxy.isSupport(new Object[]{str}, this, f50910a, false, 51369, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, f50910a, false, 51369, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    g.this.f50904c.setProgress(0.0d);
                }

                public final void a(Throwable th) {
                    if (PatchProxy.isSupport(new Object[]{th}, this, f50910a, false, 51368, new Class[]{Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{th}, this, f50910a, false, 51368, new Class[]{Throwable.class}, Void.TYPE);
                        return;
                    }
                    g.this.f50904c.setProgress(0.0d);
                }

                public final void a(String str, EncryptedVideoContent encryptedVideoContent, a aVar) {
                    if (PatchProxy.isSupport(new Object[]{str, encryptedVideoContent, aVar}, this, f50910a, false, 51366, new Class[]{String.class, EncryptedVideoContent.class, a.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str, encryptedVideoContent, aVar}, this, f50910a, false, 51366, new Class[]{String.class, EncryptedVideoContent.class, a.class}, Void.TYPE);
                        return;
                    }
                    g.this.f50904c.setProgress(1.0d);
                }
            };
        }
        e.f50897b.a(this.f50903b, this.f50907f);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f50902a, false, 51360, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50902a, false, 51360, new Class[0], Void.TYPE);
        } else if (this.f50903b != null) {
            int msgStatus = this.f50903b.getMsgStatus();
            if (msgStatus != 5) {
                switch (msgStatus) {
                    case 0:
                        this.f50904c.setVisibility(0);
                        this.f50906e.setVisibility(8);
                        this.f50905d.setVisibility(8);
                        this.f50904c.setProgress(0.0d);
                        c();
                        return;
                    case 1:
                        this.f50905d.setVisibility(8);
                        b();
                        return;
                    case 2:
                        break;
                    case 3:
                        this.f50905d.setVisibility(0);
                        b();
                        return;
                }
            }
            this.f50905d.setVisibility(8);
            b();
        }
    }

    public final void a(n nVar) {
        n nVar2 = nVar;
        if (PatchProxy.isSupport(new Object[]{nVar2}, this, f50902a, false, 51359, new Class[]{n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar2}, this, f50902a, false, 51359, new Class[]{n.class}, Void.TYPE);
            return;
        }
        this.f50903b = nVar2;
        a();
    }

    public g(CircleProgressTextView circleProgressTextView, ImageView imageView, ImageView imageView2) {
        this.f50906e = imageView;
        this.f50904c = circleProgressTextView;
        this.f50905d = imageView2;
        if (PatchProxy.isSupport(new Object[0], this, f50902a, false, 51362, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50902a, false, 51362, new Class[0], Void.TYPE);
            return;
        }
        if (this.g == null) {
            this.g = new View.OnAttachStateChangeListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50908a;

                public final void onViewAttachedToWindow(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f50908a, false, 51364, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f50908a, false, 51364, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    g.this.a();
                }

                public final void onViewDetachedFromWindow(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f50908a, false, 51365, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f50908a, false, 51365, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    e.f50897b.b(g.this.f50903b);
                }
            };
        }
        this.f50904c.removeOnAttachStateChangeListener(this.g);
        this.f50904c.addOnAttachStateChangeListener(this.g);
    }
}
