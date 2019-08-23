package com.ss.android.newmedia.redbadge.a;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.redbadge.a;
import com.ss.android.newmedia.redbadge.e;
import java.util.Arrays;
import java.util.List;

public class f implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30283a;

    public final List<String> a() {
        if (PatchProxy.isSupport(new Object[0], this, f30283a, false, 18796, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f30283a, false, 18796, new Class[0], List.class);
        }
        return Arrays.asList(new String[]{"com.huawei.android.launcher"});
    }

    public final void a(Context context, ComponentName componentName, int i) throws e {
        int i2;
        if (PatchProxy.isSupport(new Object[]{context, componentName, Integer.valueOf(i)}, this, f30283a, false, 18795, new Class[]{Context.class, ComponentName.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, componentName, Integer.valueOf(i)}, this, f30283a, false, 18795, new Class[]{Context.class, ComponentName.class, Integer.TYPE}, Void.TYPE);
        } else if (context != null && componentName != null) {
            if (i < 0) {
                i2 = 0;
            } else {
                i2 = i;
            }
            Bundle bundle = new Bundle();
            bundle.putString("package", context.getPackageName());
            bundle.putString("class", componentName.getClassName());
            bundle.putInt("badgenumber", i2);
            try {
                context.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", null, bundle);
            } catch (Throwable th) {
                throw new e(th.getMessage());
            }
        }
    }
}
