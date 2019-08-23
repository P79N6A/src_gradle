package com.bytedance.android.live.excitingvideoad.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final class b extends a {
    public static ChangeQuickRedirect n;
    public String o;
    public int p;
    public int q;
    public String r;
    public int s;
    public int t;
    public int u;
    public String v;
    public final List<String> w;
    public final List<String> x;
    public final List<String> y;

    public final boolean b() {
        if (!PatchProxy.isSupport(new Object[0], this, n, false, 1569, new Class[0], Boolean.TYPE)) {
            return "origin".equals(this.r);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, n, false, 1569, new Class[0], Boolean.TYPE)).booleanValue();
    }
}
