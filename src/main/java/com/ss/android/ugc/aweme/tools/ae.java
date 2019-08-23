package com.ss.android.ugc.aweme.tools;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ae implements bc {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74605a;

    /* renamed from: b  reason: collision with root package name */
    public Object f74606b;

    /* renamed from: c  reason: collision with root package name */
    public int f74607c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f74608d;

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f74605a, false, 86978, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f74605a, false, 86978, new Class[0], String.class);
        }
        return "OperationPanelVisibilityChangeEvent{panel=" + this.f74606b + ", visibility=" + this.f74607c + '}';
    }

    public ae(Object obj, int i) {
        this.f74606b = obj;
        this.f74607c = i;
    }

    public ae(Object obj, int i, boolean z) {
        this.f74606b = obj;
        this.f74607c = i;
        this.f74608d = true;
    }
}
