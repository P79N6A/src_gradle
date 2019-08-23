package com.ss.android.ugc.aweme.story.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73251a;

    /* renamed from: b  reason: collision with root package name */
    public int f73252b;

    /* renamed from: c  reason: collision with root package name */
    public Object f73253c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f73254a;

        /* renamed from: b  reason: collision with root package name */
        public final int f73255b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f73256c;

        /* renamed from: d  reason: collision with root package name */
        public String f73257d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f73258e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f73259f;

        public a(boolean z, int i, boolean z2, String str, boolean z3, boolean z4) {
            this.f73254a = z;
            this.f73255b = i;
            this.f73256c = z2;
            this.f73257d = str;
            this.f73258e = z3;
            this.f73259f = z4;
        }
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f73251a, false, 84821, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f73251a, false, 84821, new Class[0], String.class);
        }
        return "StoryObservingData{mType=" + this.f73252b + ", mArgs=" + this.f73253c + '}';
    }

    public d(int i, Object obj) {
        this.f73252b = i;
        this.f73253c = obj;
    }
}
