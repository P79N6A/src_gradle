package com.ss.android.ugc.aweme.thread;

import android.os.Process;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4194a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4195b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f4196c;

    f(int i, Runnable runnable) {
        this.f4195b = i;
        this.f4196c = runnable;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f4194a, false, 86876, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4194a, false, 86876, new Class[0], Void.TYPE);
            return;
        }
        int i = this.f4195b;
        Runnable runnable = this.f4196c;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, d.f4181a, true, 86874, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, d.f4181a, true, 86874, new Class[]{Integer.TYPE}, Void.TYPE);
        } else {
            try {
                Process.setThreadPriority(i);
            } catch (Throwable unused) {
            }
        }
        runnable.run();
    }
}
