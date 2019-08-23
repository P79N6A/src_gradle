package com.ss.android.newmedia.redbadge.a;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.redbadge.a;
import java.util.Arrays;
import java.util.List;

public class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30282a;

    public final List<String> a() {
        if (PatchProxy.isSupport(new Object[0], this, f30282a, false, 18794, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f30282a, false, 18794, new Class[0], List.class);
        }
        return Arrays.asList(new String[]{"me.everything.launcher"});
    }

    public final void a(Context context, ComponentName componentName, int i) throws com.ss.android.newmedia.redbadge.e {
        int i2;
        if (PatchProxy.isSupport(new Object[]{context, componentName, Integer.valueOf(i)}, this, f30282a, false, 18793, new Class[]{Context.class, ComponentName.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, componentName, Integer.valueOf(i)}, this, f30282a, false, 18793, new Class[]{Context.class, ComponentName.class, Integer.TYPE}, Void.TYPE);
        } else if (context != null && componentName != null) {
            if (i < 0) {
                i2 = 0;
            } else {
                i2 = i;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("package_name", componentName.getPackageName());
            contentValues.put("activity_name", componentName.getClassName());
            contentValues.put("count", Integer.valueOf(i2));
            try {
                context.getContentResolver().insert(Uri.parse("content://me.everything.badger/apps"), contentValues);
            } catch (Throwable th) {
                throw new com.ss.android.newmedia.redbadge.e(th.getMessage());
            }
        }
    }
}
