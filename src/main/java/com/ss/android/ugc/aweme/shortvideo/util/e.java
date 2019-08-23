package com.ss.android.ugc.aweme.shortvideo.util;

import a.g;
import a.i;
import android.app.Activity;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final /* synthetic */ class e implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71129a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f71130b;

    /* renamed from: c  reason: collision with root package name */
    private final Intent f71131c;

    e(Activity activity, Intent intent) {
        this.f71130b = activity;
        this.f71131c = intent;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f71129a, false, 80849, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f71129a, false, 80849, new Class[]{i.class}, Object.class);
        }
        Activity activity = this.f71130b;
        Intent intent = this.f71131c;
        if (iVar.d() || iVar.c()) {
            c.a(activity, intent, null);
        } else {
            c.a(activity, intent, (List) iVar.e());
        }
        return null;
    }
}
