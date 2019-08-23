package com.ss.android.ugc.aweme.net;

import a.g;
import a.i;
import android.os.Handler;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class m<TTaskResult> implements g<TTaskResult, Object> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57001a;

    /* renamed from: b  reason: collision with root package name */
    private Handler f57002b;

    /* renamed from: c  reason: collision with root package name */
    private int f57003c = 0;

    public final Object then(i<TTaskResult> iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f57001a, false, 60740, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f57001a, false, 60740, new Class[]{i.class}, Object.class);
        } else if (this.f57002b == null) {
            return null;
        } else {
            Message obtainMessage = this.f57002b.obtainMessage(this.f57003c);
            if (iVar.c()) {
                obtainMessage.obj = null;
            } else if (iVar.d()) {
                obtainMessage.obj = iVar.f();
            } else {
                obtainMessage.obj = iVar.e();
            }
            this.f57002b.sendMessage(obtainMessage);
            return null;
        }
    }

    public m(Handler handler, int i) {
        this.f57002b = handler;
    }
}
