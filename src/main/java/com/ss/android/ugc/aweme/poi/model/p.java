package com.ss.android.ugc.aweme.poi.model;

import a.g;
import a.i;
import android.os.Handler;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.a.e;

public final class p implements g<e, Void> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59937a;

    /* renamed from: b  reason: collision with root package name */
    Handler f59938b;

    /* renamed from: c  reason: collision with root package name */
    int f59939c = 0;

    public final /* synthetic */ Object then(i iVar) throws Exception {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f59937a, false, 65028, new Class[]{i.class}, Void.class)) {
            return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f59937a, false, 65028, new Class[]{i.class}, Void.class);
        } else if (this.f59938b == null) {
            return null;
        } else {
            Message obtainMessage = this.f59938b.obtainMessage(this.f59939c);
            if (iVar.c()) {
                obtainMessage.obj = null;
            } else if (iVar.d()) {
                obtainMessage.obj = iVar.f();
            } else {
                obtainMessage.obj = (e) iVar.e();
            }
            this.f59938b.sendMessage(obtainMessage);
            return null;
        }
    }

    public p(Handler handler, int i) {
        this.f59938b = handler;
    }
}
