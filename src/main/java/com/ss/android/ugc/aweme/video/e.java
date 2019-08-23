package com.ss.android.ugc.aweme.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76048a;

    /* renamed from: b  reason: collision with root package name */
    public String f76049b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f76050c;

    /* renamed from: d  reason: collision with root package name */
    public int f76051d;

    /* renamed from: e  reason: collision with root package name */
    public int f76052e;

    /* renamed from: f  reason: collision with root package name */
    public Object f76053f;
    public String g;

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f76048a, false, 88918, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f76048a, false, 88918, new Class[0], String.class);
        }
        return "MediaError{sourceId='" + this.f76049b + '\'' + ", h265=" + this.f76050c + ", errorCode=" + this.f76051d + ", errorExtra=" + this.f76052e + ", extraInfo=" + this.f76053f + ", playUrl='" + this.g + '\'' + '}';
    }

    public e(String str, boolean z, int i, int i2, Object obj) {
        this.f76049b = str;
        this.f76050c = z;
        this.f76051d = i;
        this.f76052e = i2;
        this.f76053f = obj;
    }
}
