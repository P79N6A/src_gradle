package com.ss.android.ugc.aweme.feed.f;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ar {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45291a;

    /* renamed from: b  reason: collision with root package name */
    public int f45292b;

    /* renamed from: c  reason: collision with root package name */
    public Object f45293c;

    /* renamed from: d  reason: collision with root package name */
    public int f45294d;

    /* renamed from: e  reason: collision with root package name */
    public String f45295e;

    /* renamed from: f  reason: collision with root package name */
    public String f45296f;
    public long g;
    public int h;
    public long i;
    public boolean j;
    public boolean k;

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f45291a, false, 41116, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f45291a, false, 41116, new Class[0], String.class);
        }
        return "VideoEvent{type=" + this.f45292b + ", param=" + this.f45293c + ", videoType=" + this.f45294d + ", from='" + this.f45295e + ", currentPosition='" + this.i + ", isPlaying='" + this.j + '\'' + '}';
    }

    public ar(int i2) {
        this.f45292b = i2;
    }

    public ar(int i2, Object obj) {
        this.f45292b = i2;
        this.f45293c = obj;
    }
}
