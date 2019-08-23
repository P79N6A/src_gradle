package com.ss.android.ugc.aweme.newfollow.e;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57101a;

    /* renamed from: b  reason: collision with root package name */
    public List<b> f57102b;

    /* renamed from: c  reason: collision with root package name */
    public long f57103c;

    /* renamed from: d  reason: collision with root package name */
    public long f57104d;

    /* renamed from: e  reason: collision with root package name */
    public int f57105e;

    /* renamed from: f  reason: collision with root package name */
    public String f57106f;
    public String g;
    public Exception h;

    public c() {
    }

    /* renamed from: a */
    public final c clone() {
        if (PatchProxy.isSupport(new Object[0], this, f57101a, false, 61202, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], this, f57101a, false, 61202, new Class[0], c.class);
        }
        try {
            c cVar = (c) super.clone();
            cVar.f57105e = this.f57105e;
            cVar.f57103c = this.f57103c;
            cVar.f57104d = this.f57104d;
            cVar.f57102b = (ArrayList) ((ArrayList) this.f57102b).clone();
            return cVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public c(String str) {
        this.g = str;
    }
}
