package com.ss.android.ugc.aweme.shortvideo.f;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.at;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67640a;

    /* renamed from: b  reason: collision with root package name */
    public int f67641b;

    /* renamed from: c  reason: collision with root package name */
    public int f67642c;

    /* renamed from: d  reason: collision with root package name */
    public int f67643d;

    /* renamed from: e  reason: collision with root package name */
    public Object f67644e;

    /* renamed from: f  reason: collision with root package name */
    public String f67645f;
    public boolean g;
    public boolean h;
    public at i;
    public boolean j;

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f67640a, false, 77208, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f67640a, false, 77208, new Class[0], String.class);
        }
        return "PublishStatus{status=" + this.f67642c + ", progress=" + this.f67643d + ", params=" + this.f67644e + '}';
    }

    public e(int i2, int i3, Object obj) {
        this(10, 100, obj, null);
    }

    public e(int i2, int i3, Object obj, String str) {
        this.f67644e = obj;
        this.f67643d = i3;
        this.f67642c = i2;
        this.f67645f = str;
    }
}
