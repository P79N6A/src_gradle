package com.ss.android.ugc.aweme.tools;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class au implements bc {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74632a;

    /* renamed from: b  reason: collision with root package name */
    public am f74633b;

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f74632a, false, 86992, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f74632a, false, 86992, new Class[0], String.class);
        }
        return "StartRecordingCommandEvent{speed=" + this.f74633b + '}';
    }

    public au(am amVar) {
        this.f74633b = amVar;
    }
}
