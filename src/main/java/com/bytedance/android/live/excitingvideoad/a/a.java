package com.bytedance.android.live.excitingvideoad.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.List;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8371a;

    /* renamed from: b  reason: collision with root package name */
    public long f8372b;

    /* renamed from: c  reason: collision with root package name */
    public String f8373c;

    /* renamed from: d  reason: collision with root package name */
    public String f8374d;

    /* renamed from: e  reason: collision with root package name */
    public String f8375e;

    /* renamed from: f  reason: collision with root package name */
    public String f8376f;
    public String g;
    public final List<String> h;
    public final List<String> i;
    public String j;
    public String k;
    public String l;
    public String m;

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f8371a, false, 1566, new Class[0], Boolean.TYPE)) {
            return PushConstants.EXTRA_APPLICATION_PENDING_INTENT.equals(this.j);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f8371a, false, 1566, new Class[0], Boolean.TYPE)).booleanValue();
    }
}
