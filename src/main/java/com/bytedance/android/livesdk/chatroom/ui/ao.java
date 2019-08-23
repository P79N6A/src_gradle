package com.bytedance.android.livesdk.chatroom.ui;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public abstract class ao implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11848a;

    /* renamed from: b  reason: collision with root package name */
    static boolean f11849b = true;

    /* renamed from: d  reason: collision with root package name */
    private static final Runnable f11850d = ap.f11854b;

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ a.C0900a f11851e;

    /* renamed from: c  reason: collision with root package name */
    public long f11852c;

    public abstract void a(View view);

    public ao() {
        this(500);
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f11848a, true, 5675, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f11848a, true, 5675, new Class[0], Void.TYPE);
        } else {
            b bVar = new b("DebouncingOnClickListener.java", ao.class);
            f11851e = bVar.a("method-execution", bVar.a("11", "onClick", "com.bytedance.android.livesdk.chatroom.ui.DebouncingOnClickListener", "android.view.View", NotifyType.VIBRATE, "", "void"), 24);
        }
    }

    private ao(long j) {
        this.f11852c = 500;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f11848a, false, 5674, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f11848a, false, 5674, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(b.a(f11851e, this, this, view));
        if (f11849b) {
            f11849b = false;
            view.postDelayed(f11850d, this.f11852c);
            a(view);
        }
    }
}
