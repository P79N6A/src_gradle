package com.ss.android.ugc.aweme.detail.operators;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import com.bytedance.common.utility.collection.WeakEqualReference;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.detail.e.h;
import com.ss.android.ugc.aweme.detail.e.i;
import com.ss.android.ugc.aweme.detail.operators.s;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.param.b;
import java.lang.ref.WeakReference;

public final class f implements s.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41227a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<DetailFragmentPanel> f41228b;

    /* renamed from: c  reason: collision with root package name */
    private h f41229c = new h();

    /* renamed from: d  reason: collision with root package name */
    private i f41230d = new i();

    public final int a(int i) {
        return i + PushConstants.WORK_RECEIVER_EVENTCORE_ERROR;
    }

    public final boolean a() {
        return true;
    }

    public final boolean a(@NonNull Fragment fragment) {
        return true;
    }

    public final boolean b() {
        if (!PatchProxy.isSupport(new Object[0], this, f41227a, false, 34768, new Class[0], Boolean.TYPE)) {
            return this.f41230d.m();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f41227a, false, 34768, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f41227a, false, 34770, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41227a, false, 34770, new Class[0], Void.TYPE);
            return;
        }
        this.f41230d.k();
        this.f41230d.j();
    }

    public final void a(@NonNull DetailFragmentPanel detailFragmentPanel) {
        if (PatchProxy.isSupport(new Object[]{detailFragmentPanel}, this, f41227a, false, 34766, new Class[]{DetailFragmentPanel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{detailFragmentPanel}, this, f41227a, false, 34766, new Class[]{DetailFragmentPanel.class}, Void.TYPE);
            return;
        }
        this.f41228b = new WeakEqualReference(detailFragmentPanel);
        this.f41230d.a(detailFragmentPanel);
        this.f41230d.a(this.f41229c);
    }

    public final boolean a(@NonNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f41227a, false, 34769, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f41227a, false, 34769, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        if (!(this.f41228b == null || this.f41228b.get() == null)) {
            ((DetailFragmentPanel) this.f41228b.get()).m();
        }
        return false;
    }

    public final void a(int i, @NonNull b bVar, int i2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f41227a, false, 34767, new Class[]{Integer.TYPE, b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z)}, this, f41227a, false, 34767, new Class[]{Integer.TYPE, b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f41230d.a(bVar.getAid(), bVar.getEventType());
    }
}
