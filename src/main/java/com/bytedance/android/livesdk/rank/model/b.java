package com.bytedance.android.livesdk.rank.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.adapter.d;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class b implements d<b> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17024a;
    @SerializedName("user")

    /* renamed from: b  reason: collision with root package name */
    public User f17025b;
    @SerializedName("score")

    /* renamed from: c  reason: collision with root package name */
    public long f17026c;
    @SerializedName("rank")

    /* renamed from: d  reason: collision with root package name */
    public int f17027d;
    @SerializedName("gap_description")

    /* renamed from: e  reason: collision with root package name */
    public String f17028e;
    @SerializedName("delta")

    /* renamed from: f  reason: collision with root package name */
    public long f17029f;
    public transient boolean g;
    public transient boolean h;

    public final long a() {
        if (PatchProxy.isSupport(new Object[0], this, f17024a, false, 13062, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f17024a, false, 13062, new Class[0], Long.TYPE)).longValue();
        } else if (this.f17025b == null) {
            return 0;
        } else {
            return this.f17025b.getLiveRoomId();
        }
    }

    public int hashCode() {
        if (PatchProxy.isSupport(new Object[0], this, f17024a, false, 13066, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f17024a, false, 13066, new Class[0], Integer.TYPE)).intValue();
        }
        int a2 = (((((int) (((long) (((int) this.f17026c) * 37)) + a())) * 37) + this.f17025b.hashCode()) * 37) + this.f17027d;
        if (this.f17028e != null) {
            a2 = (a2 * 37) + this.f17028e.hashCode();
        }
        return a2;
    }

    public final /* synthetic */ boolean a(Object obj) {
        b bVar = (b) obj;
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f17024a, false, 13063, new Class[]{b.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar}, this, f17024a, false, 13063, new Class[]{b.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f17025b.getId() == bVar.f17025b.getId()) {
            return true;
        } else {
            return false;
        }
    }

    public final /* synthetic */ boolean b(Object obj) {
        b bVar = (b) obj;
        if (!PatchProxy.isSupport(new Object[]{bVar}, this, f17024a, false, 13064, new Class[]{b.class}, Boolean.TYPE)) {
            return equals(bVar);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar}, this, f17024a, false, 13064, new Class[]{b.class}, Boolean.TYPE)).booleanValue();
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f17024a, false, 13065, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f17024a, false, 13065, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            long a2 = a();
            if (this.f17026c == bVar.f17026c && a2 == bVar.a() && this.f17027d == bVar.f17027d && this.f17025b.equals(bVar.f17025b) && this.f17028e != null) {
                return this.f17028e.equals(bVar.f17028e);
            }
            return true;
        }
    }
}
