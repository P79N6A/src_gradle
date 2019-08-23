package com.ss.android.ugc.aweme.tools;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class af implements bc {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74609a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f74610b;

    /* renamed from: c  reason: collision with root package name */
    public Object f74611c;

    /* renamed from: d  reason: collision with root package name */
    public int f74612d;

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f74609a, false, 86979, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f74609a, false, 86979, new Class[0], String.class);
        }
        return "PinchScaleEndEvent{isRecording=" + this.f74610b + ", tag=" + this.f74611c + ", mode=" + this.f74612d + '}';
    }
}
