package com.ss.android.newmedia.redbadge.a;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.redbadge.a;
import com.ss.android.newmedia.redbadge.e;
import java.util.Arrays;
import java.util.List;

public class h implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30285a;

    public final List<String> a() {
        if (PatchProxy.isSupport(new Object[0], this, f30285a, false, 18800, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f30285a, false, 18800, new Class[0], List.class);
        }
        return Arrays.asList(new String[]{"com.teslacoilsw.launcher"});
    }

    public final void a(Context context, ComponentName componentName, int i) throws e {
        int i2;
        if (PatchProxy.isSupport(new Object[]{context, componentName, Integer.valueOf(i)}, this, f30285a, false, 18799, new Class[]{Context.class, ComponentName.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, componentName, Integer.valueOf(i)}, this, f30285a, false, 18799, new Class[]{Context.class, ComponentName.class, Integer.TYPE}, Void.TYPE);
        } else if (context != null && componentName != null) {
            if (i < 0) {
                i2 = 0;
            } else {
                i2 = i;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("tag", componentName.getPackageName() + "/" + componentName.getClassName());
            contentValues.put("count", Integer.valueOf(i2));
            try {
                context.getContentResolver().insert(Uri.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues);
            } catch (Throwable th) {
                throw new e(th.getMessage());
            }
        }
    }
}
