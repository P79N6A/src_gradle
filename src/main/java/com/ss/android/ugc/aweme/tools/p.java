package com.ss.android.ugc.aweme.tools;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class p extends c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74897a;

    /* renamed from: b  reason: collision with root package name */
    public final long f74898b;

    /* renamed from: c  reason: collision with root package name */
    public final String f74899c;

    /* renamed from: d  reason: collision with root package name */
    public final String f74900d;

    /* renamed from: e  reason: collision with root package name */
    public final int f74901e;

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f74897a, false, 86956, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f74897a, false, 86956, new Class[0], String.class);
        }
        return "ConcatFinishedEvent{concatStartTime=" + this.f74898b + ", videoPath='" + this.f74899c + '\'' + ", audioPath='" + this.f74900d + '\'' + ", statusCode=" + this.f74901e + '}';
    }

    public p(long j, String str, String str2, int i) {
        this.f74898b = j;
        this.f74899c = str;
        this.f74900d = str2;
        this.f74901e = i;
    }
}
