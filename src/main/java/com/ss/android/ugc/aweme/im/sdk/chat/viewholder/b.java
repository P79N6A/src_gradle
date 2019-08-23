package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.chat.net.s;
import com.ss.android.ugc.aweme.im.sdk.chat.net.x;
import com.ss.android.ugc.aweme.im.sdk.widget.CircleProgressTextView;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51163a;

    /* renamed from: b  reason: collision with root package name */
    public n f51164b;

    /* renamed from: c  reason: collision with root package name */
    public CircleProgressTextView f51165c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f51166d;

    /* renamed from: e  reason: collision with root package name */
    private x f51167e;

    /* renamed from: f  reason: collision with root package name */
    private View.OnAttachStateChangeListener f51168f;

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f51163a, false, 51496, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51163a, false, 51496, new Class[0], Void.TYPE);
            return;
        }
        if (this.f51167e == null) {
            this.f51167e = new x() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f51171a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f51171a, false, 51501, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f51171a, false, 51501, new Class[0], Void.TYPE);
                        return;
                    }
                    b.this.f51165c.setProgress(1.0d);
                }

                public final void a(double d2) {
                    if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2)}, this, f51171a, false, 51499, new Class[]{Double.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2)}, this, f51171a, false, 51499, new Class[]{Double.TYPE}, Void.TYPE);
                        return;
                    }
                    b.this.f51165c.setProgress(d2);
                }

                public final void a(String str) {
                    if (PatchProxy.isSupport(new Object[]{str}, this, f51171a, false, 51503, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, f51171a, false, 51503, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    b.this.f51165c.setProgress(0.0d);
                }

                public final void a(Throwable th) {
                    if (PatchProxy.isSupport(new Object[]{th}, this, f51171a, false, 51500, new Class[]{Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{th}, this, f51171a, false, 51500, new Class[]{Throwable.class}, Void.TYPE);
                        return;
                    }
                    b.this.f51165c.setProgress(0.0d);
                }

                public final void a(String str, UrlModel urlModel) {
                    if (PatchProxy.isSupport(new Object[]{str, urlModel}, this, f51171a, false, 51502, new Class[]{String.class, UrlModel.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str, urlModel}, this, f51171a, false, 51502, new Class[]{String.class, UrlModel.class}, Void.TYPE);
                        return;
                    }
                    b.this.f51165c.setProgress(1.0d);
                }
            };
        }
        s.a().a(this.f51164b, this.f51167e);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51163a, false, 51494, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51163a, false, 51494, new Class[0], Void.TYPE);
        } else if (this.f51164b != null) {
            int msgStatus = this.f51164b.getMsgStatus();
            if (msgStatus != 5) {
                switch (msgStatus) {
                    case 0:
                        this.f51165c.setVisibility(0);
                        this.f51166d.setVisibility(8);
                        this.f51165c.setProgress(0.0d);
                        b();
                        return;
                    case 1:
                        s.a().b(this.f51164b);
                        this.f51165c.setVisibility(8);
                        this.f51166d.setVisibility(8);
                        return;
                    case 2:
                        break;
                    case 3:
                        s.a().b(this.f51164b);
                        this.f51166d.setVisibility(0);
                        this.f51165c.setVisibility(8);
                        return;
                }
            }
            s.a().b(this.f51164b);
            this.f51165c.setVisibility(8);
            this.f51166d.setVisibility(8);
        }
    }

    public final void a(n nVar) {
        n nVar2 = nVar;
        if (PatchProxy.isSupport(new Object[]{nVar2}, this, f51163a, false, 51493, new Class[]{n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar2}, this, f51163a, false, 51493, new Class[]{n.class}, Void.TYPE);
            return;
        }
        this.f51164b = nVar2;
        a();
    }

    public b(CircleProgressTextView circleProgressTextView, ImageView imageView) {
        this.f51165c = circleProgressTextView;
        this.f51166d = imageView;
        if (PatchProxy.isSupport(new Object[0], this, f51163a, false, 51495, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51163a, false, 51495, new Class[0], Void.TYPE);
            return;
        }
        if (this.f51168f == null) {
            this.f51168f = new View.OnAttachStateChangeListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f51169a;

                public final void onViewAttachedToWindow(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f51169a, false, 51497, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f51169a, false, 51497, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    b.this.a();
                }

                public final void onViewDetachedFromWindow(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f51169a, false, 51498, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f51169a, false, 51498, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    s.a().b(b.this.f51164b);
                }
            };
        }
        this.f51165c.removeOnAttachStateChangeListener(this.f51168f);
        this.f51165c.addOnAttachStateChangeListener(this.f51168f);
    }
}
