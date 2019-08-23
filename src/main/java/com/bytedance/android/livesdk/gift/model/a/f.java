package com.bytedance.android.livesdk.gift.model.a;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Set;

public class f extends a<b> {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f15100e;

    public int a() {
        return ((b) this.f15098d).f15107f;
    }

    public final boolean c() {
        return ((b) this.f15098d).g;
    }

    public final boolean d() {
        return ((b) this.f15098d).i;
    }

    public final String h() {
        return ((b) this.f15098d).s;
    }

    public final String i() {
        return ((b) this.f15098d).f15102a;
    }

    public final int j() {
        return ((b) this.f15098d).l;
    }

    public final String k() {
        return ((b) this.f15098d).f15104c;
    }

    public final int l() {
        return ((b) this.f15098d).m;
    }

    public final ImageModel m() {
        return ((b) this.f15098d).o;
    }

    public final ImageModel n() {
        return ((b) this.f15098d).f15103b;
    }

    public final long o() {
        return ((b) this.f15098d).f15105d;
    }

    public final b q() {
        return (b) this.f15098d;
    }

    public final boolean e() {
        if (((b) this.f15098d).f15106e != 10 || ((b) this.f15098d).u <= 0) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        if (((b) this.f15098d).f15106e == 1 || ((b) this.f15098d).f15106e == 5 || ((b) this.f15098d).f15106e == 10) {
            return false;
        }
        return true;
    }

    public final long b() {
        if (PatchProxy.isSupport(new Object[0], this, f15100e, false, 9834, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f15100e, false, 9834, new Class[0], Long.TYPE)).longValue();
        } else if (e()) {
            return ((b) this.f15098d).u;
        } else {
            return 0;
        }
    }

    public final boolean g() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f15100e, false, 9835, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f15100e, false, 9835, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!TextUtils.isEmpty(((b) this.f15098d).s) && !((Set) com.bytedance.android.livesdk.w.b.x.a()).contains(Long.valueOf(((b) this.f15098d).f15105d))) {
            z = true;
        }
        return z;
    }

    public f(@NonNull b bVar) {
        super(1, bVar);
    }

    f(int i, b bVar) {
        super(i, bVar);
    }
}
