package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.annotation.IgnoreStyleCheck;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.a.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@IgnoreStyleCheck
public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7740a;
    @SerializedName("level")

    /* renamed from: b  reason: collision with root package name */
    public int f7741b;
    @SerializedName("experience")

    /* renamed from: c  reason: collision with root package name */
    public long f7742c;
    @SerializedName("lowest_experience_this_level")

    /* renamed from: d  reason: collision with root package name */
    public long f7743d;
    @SerializedName("highest_experience_this_level")

    /* renamed from: e  reason: collision with root package name */
    public long f7744e;
    @SerializedName("task_start_experience")

    /* renamed from: f  reason: collision with root package name */
    public long f7745f;
    @SerializedName("task_start_time")
    public long g;
    @SerializedName("task_decrease_experience")
    public long h;
    @SerializedName("task_target_experience")
    public long i;
    @SerializedName("task_end_time")
    public long j;
    @SerializedName("profile_dialog_bg")
    public ImageModel k;
    @SerializedName("profile_dialog_bg_back")
    public ImageModel l;
    @SerializedName("stage_level")
    public ImageModel m;
    @SerializedName("small_icon")
    public ImageModel n;

    public final int a() {
        return this.f7741b;
    }

    public final long b() {
        return this.f7742c;
    }

    public final long c() {
        return this.f7743d;
    }

    public final long d() {
        return this.f7744e;
    }

    public final long e() {
        return this.f7745f;
    }

    public final long f() {
        return this.g;
    }

    public final long g() {
        return this.h;
    }

    public final long h() {
        return this.i;
    }

    public final long i() {
        return this.j;
    }

    public final ImageModel j() {
        return this.k;
    }

    public final ImageModel k() {
        return this.l;
    }

    public final ImageModel l() {
        return this.m;
    }

    public final ImageModel m() {
        return this.n;
    }

    public int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f7740a, false, 75, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f7740a, false, 75, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.n != null) {
            i2 = this.n.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = ((((((((((((((((((i2 * 31) + this.f7741b) * 31) + ((int) (this.f7742c ^ (this.f7742c >>> 32)))) * 31) + ((int) (this.f7743d ^ (this.f7743d >>> 32)))) * 31) + ((int) (this.f7744e ^ (this.f7744e >>> 32)))) * 31) + ((int) (this.f7745f ^ (this.f7745f >>> 32)))) * 31) + ((int) (this.g ^ (this.g >>> 32)))) * 31) + ((int) (this.h ^ (this.h >>> 32)))) * 31) + ((int) (this.i ^ (this.i >>> 32)))) * 31) + ((int) (this.j ^ (this.j >>> 32)))) * 31;
        if (this.k != null) {
            i3 = this.k.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        if (this.l != null) {
            i4 = this.l.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        if (this.m != null) {
            i5 = this.m.hashCode();
        } else {
            i5 = 0;
        }
        int i10 = (i9 + i5) * 31;
        if (this.n != null) {
            i6 = this.n.hashCode();
        }
        return i10 + i6;
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f7740a, false, 74, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f7740a, false, 74, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f7741b != bVar.f7741b || this.f7742c != bVar.f7742c || this.f7743d != bVar.f7743d || this.f7744e != bVar.f7744e || this.f7745f != bVar.f7745f || this.g != bVar.g || this.h != bVar.h || this.i != bVar.i || this.j != bVar.j) {
                return false;
            }
            if (this.k == null ? bVar.k != null : !this.k.equals(bVar.k)) {
                return false;
            }
            if (this.l == null ? bVar.l != null : !this.l.equals(bVar.l)) {
                return false;
            }
            if (this.m == null ? bVar.m != null : !this.m.equals(bVar.m)) {
                return false;
            }
            if (this.n != null) {
                return this.n.equals(bVar.n);
            }
            if (bVar.n == null) {
                return true;
            }
            return false;
        }
    }
}
