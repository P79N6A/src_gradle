package com.bytedance.android.livesdk.k;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a implements DialogInterface.OnCancelListener, WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15723a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f15724b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f15725c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f15726d;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f15723a, false, 10954, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15723a, false, 10954, new Class[0], Void.TYPE);
            return;
        }
        this.f15725c.removeCallbacksAndMessages(null);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f15723a, false, 10953, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15723a, false, 10953, new Class[0], Void.TYPE);
            return;
        }
        this.f15725c.removeCallbacksAndMessages(null);
        if (!this.f15724b && !TTLiveSDKContext.getHostService().k().c()) {
            this.f15725c.sendEmptyMessageDelayed(1, 180000);
            this.f15726d = true;
        }
    }

    public final void handleMsg(Message message) {
        int i = message.what;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f15723a, false, 10955, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f15723a, false, 10955, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        a();
    }
}
