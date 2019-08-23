package com.ss.android.ugc.aweme.cloudcontrol.a;

import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.monitor.cloudmessage.entity.ConsumerResult;

public final class a implements com.monitor.cloudmessage.callback.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36211a;

    /* renamed from: b  reason: collision with root package name */
    private ConsumerResult f36212b;

    @NonNull
    public final ConsumerResult b() {
        return this.f36212b;
    }

    public final void a(String str, Object obj) {
        String str2 = str;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{str2, obj2}, this, f36211a, false, 27037, new Class[]{String.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, obj2}, this, f36211a, false, 27037, new Class[]{String.class, Object.class}, Void.TYPE);
            return;
        }
        if (obj2 != null) {
            com.ss.android.ugc.aweme.cloudcontrol.b.a a2 = com.ss.android.ugc.aweme.cloudcontrol.b.a.a();
            if (PatchProxy.isSupport(new Object[]{str2, obj2}, a2, com.ss.android.ugc.aweme.cloudcontrol.b.a.f36226a, false, 27049, new Class[]{String.class, Object.class}, Void.TYPE)) {
                Object[] objArr = {str2, obj2};
                Object[] objArr2 = objArr;
                com.ss.android.ugc.aweme.cloudcontrol.b.a aVar = a2;
                ChangeQuickRedirect changeQuickRedirect = com.ss.android.ugc.aweme.cloudcontrol.b.a.f36226a;
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect, false, 27049, new Class[]{String.class, Object.class}, Void.TYPE);
            } else if (obj2 != null) {
                SharedPreferences.Editor edit = com.ss.android.ugc.aweme.cloudcontrol.b.a.f36227b.edit();
                if (obj2 instanceof String) {
                    edit.putString(str2, (String) obj2);
                } else if (obj2 instanceof Integer) {
                    edit.putInt(str2, ((Integer) obj2).intValue());
                } else if (obj2 instanceof Float) {
                    edit.putFloat(str2, ((Float) obj2).floatValue());
                } else if (obj2 instanceof Long) {
                    edit.putLong(str2, ((Long) obj2).longValue());
                } else if (obj2 instanceof Boolean) {
                    edit.putBoolean(str2, ((Boolean) obj2).booleanValue());
                }
                edit.apply();
            }
        }
        this.f36212b = ConsumerResult.build(true, null, null);
    }
}
