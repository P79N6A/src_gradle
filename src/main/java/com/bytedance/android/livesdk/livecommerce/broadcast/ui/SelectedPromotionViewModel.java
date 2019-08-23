package com.bytedance.android.livesdk.livecommerce.broadcast.ui;

import android.arch.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livecommerce.base.ECBaseViewModel;
import com.bytedance.android.livesdk.livecommerce.broadcast.adapter.SelectedPromotionViewHolder;
import com.bytedance.android.livesdk.livecommerce.broadcast.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public class SelectedPromotionViewModel extends ECBaseViewModel implements SelectedPromotionViewHolder.a {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f16115f;
    public c g;
    private MutableLiveData<com.bytedance.android.livesdk.livecommerce.c.c> h;
    private MutableLiveData<Void> i;

    public final MutableLiveData<com.bytedance.android.livesdk.livecommerce.c.c> f() {
        if (PatchProxy.isSupport(new Object[0], this, f16115f, false, 10648, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f16115f, false, 10648, new Class[0], MutableLiveData.class);
        }
        if (this.h == null) {
            this.h = new MutableLiveData<>();
        }
        return this.h;
    }

    public final MutableLiveData<Void> g() {
        if (PatchProxy.isSupport(new Object[0], this, f16115f, false, 10649, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f16115f, false, 10649, new Class[0], MutableLiveData.class);
        }
        if (this.i == null) {
            this.i = new MutableLiveData<>();
        }
        return this.i;
    }

    public final void a(int i2, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str}, this, f16115f, false, 10650, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str}, this, f16115f, false, 10650, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{str}, this, f16115f, false, 10652, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f16115f, false, 10652, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g.a(str);
        }
        g().postValue(null);
    }

    public final void a(int i2, String str, boolean z) {
        int i3;
        int i4 = i2;
        String str2 = str;
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f16115f, false, 10651, new Class[]{Integer.TYPE, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str2, Byte.valueOf(z)}, this, f16115f, false, 10651, new Class[]{Integer.TYPE, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        List a2 = this.g.a();
        if (a2 != null) {
            int size = a2.size();
            if ((i4 != 0 || !z2) && (i4 != size - 1 || z2)) {
                this.g.a(i4, str2, z2);
                MutableLiveData<com.bytedance.android.livesdk.livecommerce.c.c> f2 = f();
                if (z2) {
                    i3 = i4 - 1;
                } else {
                    i3 = i4 + 1;
                }
                f2.postValue(new com.bytedance.android.livesdk.livecommerce.c.c(i4, i3));
            }
        }
    }
}
