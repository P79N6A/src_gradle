package com.bytedance.android.live.core.utils.a.a;

import android.content.Context;
import android.os.Build;
import com.bytedance.android.live.core.utils.a.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Arrays;
import java.util.List;

public final class f implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8223a;

    /* renamed from: b  reason: collision with root package name */
    public static final List<String> f8224b = Arrays.asList(new String[]{"ONEPLUS A6000"});

    public final boolean a(Context context) {
        if (!PatchProxy.isSupport(new Object[]{context}, this, f8223a, false, 1413, new Class[]{Context.class}, Boolean.TYPE)) {
            return f8224b.contains(Build.MODEL);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, this, f8223a, false, 1413, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
    }
}
