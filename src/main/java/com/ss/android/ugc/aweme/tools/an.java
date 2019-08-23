package com.ss.android.ugc.aweme.tools;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class an implements bc {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74625a;

    /* renamed from: b  reason: collision with root package name */
    public am f74626b;

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f74625a, false, 86990, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f74625a, false, 86990, new Class[0], String.class);
        }
        return "RecordingSpeedChangeEvent{speed=" + this.f74626b + '}';
    }

    public an(am amVar) {
        this.f74626b = amVar;
    }
}
