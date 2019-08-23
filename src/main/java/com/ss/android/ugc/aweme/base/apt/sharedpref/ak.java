package com.ss.android.ugc.aweme.base.apt.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.aweme.shortvideo.model.IPublishPermissionCache;

public final class ak implements IPublishPermissionCache {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34559a;

    /* renamed from: b  reason: collision with root package name */
    private Context f34560b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f34561c = c.a(this.f34560b, "PublishPermissionManager", 0);

    public ak(Context context) {
        this.f34560b = context;
    }

    public final int getPublishPermission(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f34559a, false, 24409, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return this.f34561c.getInt("publish_permission", i);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f34559a, false, 24409, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public final void setPublishPermission(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f34559a, false, 24410, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f34559a, false, 24410, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34561c.edit();
        edit.putInt("publish_permission", i);
        edit.apply();
    }
}
