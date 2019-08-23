package com.bytedance.android.livesdk.commerce;

import com.bytedance.android.livesdkapi.d.d;
import com.bytedance.android.livesdkapi.d.e;
import com.bytedance.android.livesdkapi.d.g;
import com.bytedance.android.livesdkapi.d.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13603a;

    /* renamed from: b  reason: collision with root package name */
    public g f13604b;

    /* renamed from: c  reason: collision with root package name */
    private j f13605c;

    /* renamed from: d  reason: collision with root package name */
    private d f13606d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f13607e;

    /* renamed from: f  reason: collision with root package name */
    private Room f13608f;

    public final d a() {
        return this.f13606d;
    }

    public final boolean b() {
        return this.f13607e;
    }

    public final g e() {
        return this.f13604b;
    }

    public final String d() {
        if (PatchProxy.isSupport(new Object[0], this, f13603a, false, 8024, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f13603a, false, 8024, new Class[0], String.class);
        } else if (this.f13608f != null) {
            return this.f13608f.getRequestId();
        } else {
            return null;
        }
    }

    public final boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f13603a, false, 8023, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f13603a, false, 8023, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f13608f == null || this.f13608f.getOwner() == null) {
            return false;
        } else {
            return this.f13608f.getOwner().isFollowing();
        }
    }

    public a(final DataCenter dataCenter, boolean z, Room room, g gVar) {
        this.f13605c = new j() {
        };
        this.f13606d = new b(dataCenter);
        this.f13607e = z;
        this.f13608f = room;
        this.f13604b = gVar;
    }
}
