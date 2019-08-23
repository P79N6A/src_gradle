package com.bytedance.android.livesdk.gift.model.a;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.w.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Set;

public class h extends a<Prop> {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f15101e;

    public final boolean d() {
        return false;
    }

    public final int a() {
        return ((Prop) this.f15098d).diamond;
    }

    public final String h() {
        return ((Prop) this.f15098d).manual;
    }

    public final String i() {
        return ((Prop) this.f15098d).name;
    }

    public final String k() {
        return ((Prop) this.f15098d).description;
    }

    public final ImageModel m() {
        return ((Prop) this.f15098d).labelIcon;
    }

    public final ImageModel n() {
        return ((Prop) this.f15098d).icon;
    }

    public final long o() {
        return ((Prop) this.f15098d).id;
    }

    public final ImageModel p() {
        return ((Prop) this.f15098d).diamondLabel;
    }

    public final boolean c() {
        if (((Prop) this.f15098d).gift == null) {
            return false;
        }
        return ((Prop) this.f15098d).gift.g;
    }

    public final boolean f() {
        if (((Prop) this.f15098d).gift == null || (((Prop) this.f15098d).gift.f15106e != 1 && ((Prop) this.f15098d).gift.f15106e != 5)) {
            return true;
        }
        return false;
    }

    public final int j() {
        if (PatchProxy.isSupport(new Object[0], this, f15101e, false, 9836, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f15101e, false, 9836, new Class[0], Integer.TYPE)).intValue();
        } else if (((Prop) this.f15098d).gift == null) {
            return super.j();
        } else {
            return ((Prop) this.f15098d).gift.l;
        }
    }

    public final int l() {
        if (PatchProxy.isSupport(new Object[0], this, f15101e, false, 9837, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f15101e, false, 9837, new Class[0], Integer.TYPE)).intValue();
        } else if (((Prop) this.f15098d).gift == null) {
            return super.l();
        } else {
            return ((Prop) this.f15098d).gift.m;
        }
    }

    public final boolean g() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f15101e, false, 9838, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f15101e, false, 9838, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!TextUtils.isEmpty(((Prop) this.f15098d).manual) && !((Set) b.x.a()).contains(Long.valueOf(((Prop) this.f15098d).id))) {
            z = true;
        }
        return z;
    }

    public h(@NonNull Prop prop) {
        super(2, prop);
    }
}
