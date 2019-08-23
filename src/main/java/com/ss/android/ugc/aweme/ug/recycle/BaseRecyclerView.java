package com.ss.android.ugc.aweme.ug.recycle;

import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class BaseRecyclerView extends RecyclerView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75173a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f75174b;

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f75173a, false, 87344, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75173a, false, 87344, new Class[0], Void.TYPE);
            return;
        }
        if (this.f75174b) {
            if (getItemAnimator() != null) {
                getItemAnimator().setAddDuration(0);
                getItemAnimator().setChangeDuration(0);
                getItemAnimator().setMoveDuration(0);
                getItemAnimator().setRemoveDuration(0);
            }
            setRecycledViewPool(GlobalRVPool.a());
        }
        super.onAttachedToWindow();
    }

    public void setEnableRecycle(boolean z) {
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f75173a, false, 87345, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f75173a, false, 87345, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f75174b = z2;
        if (!z2) {
            GlobalRVPool.a().b();
        }
    }
}
