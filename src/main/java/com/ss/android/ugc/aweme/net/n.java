package com.ss.android.ugc.aweme.net;

import a.g;
import a.i;
import android.os.Handler;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.net.h;

public final class n<TTaskResult extends h> implements g<TTaskResult, Object> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57004a;

    /* renamed from: b  reason: collision with root package name */
    private Handler f57005b;

    /* renamed from: c  reason: collision with root package name */
    private int f57006c = 0;

    /* renamed from: d  reason: collision with root package name */
    private String f57007d;

    /* renamed from: e  reason: collision with root package name */
    private int f57008e;

    public final Object then(i<TTaskResult> iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f57004a, false, 60741, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f57004a, false, 60741, new Class[]{i.class}, Object.class);
        } else if (this.f57005b == null) {
            return null;
        } else {
            Message obtainMessage = this.f57005b.obtainMessage(this.f57006c);
            if (iVar.c()) {
                obtainMessage.obj = null;
            } else if (iVar.d()) {
                obtainMessage.obj = iVar.f();
            } else {
                obtainMessage.obj = iVar.e();
                ((h) iVar.e()).a(this.f57007d, this.f57008e);
            }
            this.f57005b.sendMessage(obtainMessage);
            return null;
        }
    }

    public n(Handler handler, int i, String str, int i2) {
        this.f57005b = handler;
        this.f57007d = str;
        this.f57008e = i2;
    }
}
