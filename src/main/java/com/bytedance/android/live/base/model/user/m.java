package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.a.b;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public class m implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7778a;
    @SerializedName("diamond_icon")

    /* renamed from: b  reason: collision with root package name */
    public ImageModel f7779b;
    @SerializedName("icon")

    /* renamed from: c  reason: collision with root package name */
    public ImageModel f7780c;
    @SerializedName("next_icon")

    /* renamed from: d  reason: collision with root package name */
    public ImageModel f7781d;
    @SerializedName("next_name")

    /* renamed from: e  reason: collision with root package name */
    public String f7782e;
    @SerializedName("name")

    /* renamed from: f  reason: collision with root package name */
    public String f7783f;
    @SerializedName("total_diamond_count")
    public long g;
    @SerializedName("now_diamond")
    public long h;
    @SerializedName("next_diamond")
    public long i;
    @SerializedName("im_icon")
    public ImageModel j;
    @SerializedName("im_icon_with_level")
    public ImageModel k;
    @SerializedName("new_im_icon_with_level")
    public ImageModel l;
    @SerializedName("live_icon")
    public ImageModel m;
    @SerializedName("new_live_icon")
    public ImageModel n;
    @SerializedName("level")
    public int o;
    @SerializedName("grade_icon_list")
    public List<h> p;
    @SerializedName("grade_describe")
    public String q;
    @SerializedName("this_grade_max_diamond")
    public long r;
    @SerializedName("this_grade_min_diamond")
    public long s;
    @SerializedName("background")
    public ImageModel t;
    @SerializedName("background_back")
    public ImageModel u;

    public final ImageModel a() {
        return this.f7779b;
    }

    public final ImageModel b() {
        return this.f7780c;
    }

    public final ImageModel c() {
        return this.f7781d;
    }

    public final String d() {
        return this.f7782e;
    }

    public final String e() {
        return this.f7783f;
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

    public final ImageModel i() {
        return this.j;
    }

    public final ImageModel l() {
        return this.k;
    }

    public final int m() {
        return this.o;
    }

    public final ImageModel n() {
        return this.m;
    }

    public final List<h> o() {
        return this.p;
    }

    public final String p() {
        return this.q;
    }

    public final long q() {
        return this.r;
    }

    public final long r() {
        return this.s;
    }

    public final ImageModel s() {
        return this.t;
    }

    public final ImageModel t() {
        return this.u;
    }

    public final ImageModel j() {
        if (this.l != null) {
            return this.l;
        }
        return this.k;
    }

    public final ImageModel k() {
        if (this.n != null) {
            return this.n;
        }
        return this.m;
    }

    public int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f7778a, false, 125, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f7778a, false, 125, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.f7779b != null) {
            i2 = this.f7779b.hashCode();
        } else {
            i2 = 0;
        }
        int i16 = i2 * 31;
        if (this.f7780c != null) {
            i3 = this.f7780c.hashCode();
        } else {
            i3 = 0;
        }
        int i17 = (i16 + i3) * 31;
        if (this.f7781d != null) {
            i4 = this.f7781d.hashCode();
        } else {
            i4 = 0;
        }
        int i18 = (i17 + i4) * 31;
        if (this.f7782e != null) {
            i5 = this.f7782e.hashCode();
        } else {
            i5 = 0;
        }
        int i19 = (i18 + i5) * 31;
        if (this.f7783f != null) {
            i6 = this.f7783f.hashCode();
        } else {
            i6 = 0;
        }
        int i20 = (((((((i19 + i6) * 31) + ((int) (this.g ^ (this.g >>> 32)))) * 31) + ((int) (this.h ^ (this.h >>> 32)))) * 31) + ((int) (this.i ^ (this.i >>> 32)))) * 31;
        if (this.j != null) {
            i7 = this.j.hashCode();
        } else {
            i7 = 0;
        }
        int i21 = (i20 + i7) * 31;
        if (this.k != null) {
            i8 = this.k.hashCode();
        } else {
            i8 = 0;
        }
        int i22 = (i21 + i8) * 31;
        if (this.l != null) {
            i9 = this.l.hashCode();
        } else {
            i9 = 0;
        }
        int i23 = (i22 + i9) * 31;
        if (this.m != null) {
            i10 = this.m.hashCode();
        } else {
            i10 = 0;
        }
        int i24 = (i23 + i10) * 31;
        if (this.n != null) {
            i11 = this.n.hashCode();
        } else {
            i11 = 0;
        }
        int i25 = (((i24 + i11) * 31) + this.o) * 31;
        if (this.p != null) {
            i12 = this.p.hashCode();
        } else {
            i12 = 0;
        }
        int i26 = (i25 + i12) * 31;
        if (this.q != null) {
            i13 = this.q.hashCode();
        } else {
            i13 = 0;
        }
        int i27 = (((((i26 + i13) * 31) + ((int) (this.r ^ (this.r >>> 32)))) * 31) + ((int) (this.s ^ (this.s >>> 32)))) * 31;
        if (this.t != null) {
            i14 = this.t.hashCode();
        } else {
            i14 = 0;
        }
        int i28 = (i27 + i14) * 31;
        if (this.u != null) {
            i15 = this.u.hashCode();
        }
        return i28 + i15;
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f7778a, false, 124, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f7778a, false, 124, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            m mVar = (m) obj;
            if (this.g != mVar.g || this.h != mVar.h || this.i != mVar.i || this.o != mVar.o) {
                return false;
            }
            if (this.f7779b == null ? mVar.f7779b != null : !this.f7779b.equals(mVar.f7779b)) {
                return false;
            }
            if (this.f7780c == null ? mVar.f7780c != null : !this.f7780c.equals(mVar.f7780c)) {
                return false;
            }
            if (this.f7781d == null ? mVar.f7781d != null : !this.f7781d.equals(mVar.f7781d)) {
                return false;
            }
            if (this.f7782e == null ? mVar.f7782e != null : !this.f7782e.equals(mVar.f7782e)) {
                return false;
            }
            if (this.f7783f == null ? mVar.f7783f != null : !this.f7783f.equals(mVar.f7783f)) {
                return false;
            }
            if (this.j == null ? mVar.j != null : !this.j.equals(mVar.j)) {
                return false;
            }
            if (this.k == null ? mVar.k != null : !this.k.equals(mVar.k)) {
                return false;
            }
            if (this.l == null ? mVar.l != null : !this.l.equals(mVar.l)) {
                return false;
            }
            if (this.m == null ? mVar.m != null : !this.m.equals(mVar.m)) {
                return false;
            }
            if (this.n == null ? mVar.n != null : !this.n.equals(mVar.n)) {
                return false;
            }
            if (this.p == null ? mVar.p != null : !this.p.equals(mVar.p)) {
                return false;
            }
            if (this.s != mVar.s || this.r != mVar.r) {
                return false;
            }
            if (this.t == null ? mVar.t != null : !this.t.equals(mVar.t)) {
                return false;
            }
            if (this.u == null ? mVar.u != null : !this.u.equals(mVar.u)) {
                return false;
            }
            if (this.q != null) {
                return this.q.equals(mVar.q);
            }
            if (mVar.q == null) {
                return true;
            }
            return false;
        }
    }
}
