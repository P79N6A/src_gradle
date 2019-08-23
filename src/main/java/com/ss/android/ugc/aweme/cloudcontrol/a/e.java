package com.ss.android.ugc.aweme.cloudcontrol.a;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.monitor.cloudmessage.callback.i;
import com.monitor.cloudmessage.entity.ConsumerResult;
import com.ss.android.ugc.aweme.ag.h;

public final class e implements i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36219a;

    /* renamed from: b  reason: collision with root package name */
    private ConsumerResult f36220b;

    @NonNull
    public final ConsumerResult b() {
        return this.f36220b;
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f36219a, false, 27044, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f36219a, false, 27044, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{str2}, this, f36219a, false, 27045, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f36219a, false, 27045, new Class[]{String.class}, Void.TYPE);
        } else {
            h.a().a(str2);
        }
        this.f36220b = ConsumerResult.build(true, null, null);
    }
}
