package com.ss.android.ugc.aweme.shortvideo.upload;

import android.support.v4.os.CancellationSignal;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CancellationArraySignal implements CancellationSignal.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70939a;

    /* renamed from: b  reason: collision with root package name */
    private List<CancellationSignal.OnCancelListener> f70940b = new CopyOnWriteArrayList();

    public void onCancel() {
        if (PatchProxy.isSupport(new Object[0], this, f70939a, false, 80762, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70939a, false, 80762, new Class[0], Void.TYPE);
            return;
        }
        for (CancellationSignal.OnCancelListener onCancel : this.f70940b) {
            onCancel.onCancel();
        }
    }

    public final void a(CancellationSignal.OnCancelListener onCancelListener) {
        CancellationSignal.OnCancelListener onCancelListener2 = onCancelListener;
        if (PatchProxy.isSupport(new Object[]{onCancelListener2}, this, f70939a, false, 80763, new Class[]{CancellationSignal.OnCancelListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onCancelListener2}, this, f70939a, false, 80763, new Class[]{CancellationSignal.OnCancelListener.class}, Void.TYPE);
            return;
        }
        this.f70940b.add(onCancelListener2);
    }
}
