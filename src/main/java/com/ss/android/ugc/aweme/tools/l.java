package com.ss.android.ugc.aweme.tools;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.e;

public class l extends c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74774a;

    /* renamed from: b  reason: collision with root package name */
    public e f74775b;

    /* renamed from: c  reason: collision with root package name */
    public String f74776c;

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f74774a, false, 86955, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f74774a, false, 86955, new Class[0], String.class);
        }
        return "ChooseMusicResultEvent{music=" + this.f74775b + ", localPath='" + this.f74776c + '\'' + '}';
    }

    public l(e eVar, String str) {
        this.f74775b = eVar;
        this.f74776c = str;
    }
}
