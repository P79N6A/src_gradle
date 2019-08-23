package com.ss.android.ugc.aweme.utils;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract class ax implements View.OnClickListener {
    public static ChangeQuickRedirect h;

    /* renamed from: a  reason: collision with root package name */
    private final long f75546a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f75547b;
    public boolean i;

    public abstract void a(View view);

    public ax() {
        this(300);
    }

    public ax(long j) {
        this.i = true;
        this.f75547b = new Runnable() {
            public final void run() {
                ax.this.i = true;
            }
        };
        this.f75546a = j;
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, h, false, 88167, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, h, false, 88167, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (this.i) {
            this.i = false;
            view.postDelayed(this.f75547b, this.f75546a);
            a(view);
        }
    }
}
