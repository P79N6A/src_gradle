package com.ss.android.ugc.aweme.main.base.mainpage;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54449a;

    /* renamed from: b  reason: collision with root package name */
    public Class<? extends CommonPageFragment> f54450b;

    /* renamed from: c  reason: collision with root package name */
    public String f54451c;

    /* renamed from: d  reason: collision with root package name */
    public Bundle f54452d;

    /* renamed from: e  reason: collision with root package name */
    public float f54453e;

    /* renamed from: f  reason: collision with root package name */
    public int f54454f;

    public int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, f54449a, false, 57822, new Class[0], Integer.TYPE)) {
            return (this.f54451c.hashCode() * 31) + this.f54454f;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f54449a, false, 57822, new Class[0], Integer.TYPE)).intValue();
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f54449a, false, 57823, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f54449a, false, 57823, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (!this.f54451c.equals(aVar.f54451c) || this.f54454f != aVar.f54454f) {
                return false;
            }
            return true;
        }
        return false;
    }

    public a(Class<? extends CommonPageFragment> cls, String str, int i, float f2, Bundle bundle) {
        this.f54450b = cls;
        this.f54451c = str;
        this.f54452d = bundle;
        this.f54454f = i;
        this.f54453e = f2;
    }
}
