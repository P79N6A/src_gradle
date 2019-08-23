package com.bytedance.android.livesdk.gift.effect.normal.d;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.message.model.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;

public class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14907a;

    /* renamed from: b  reason: collision with root package name */
    public int f14908b = 1;

    /* renamed from: c  reason: collision with root package name */
    public long f14909c;

    /* renamed from: d  reason: collision with root package name */
    public int f14910d;

    /* renamed from: e  reason: collision with root package name */
    public int f14911e;

    /* renamed from: f  reason: collision with root package name */
    public ImageModel f14912f;
    public boolean g;
    public String h;
    public String p;
    public Map<String, Integer> q;
    public ab r;
    public a s;

    public enum a {
        normal,
        group;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public final void b() {
        this.f14910d++;
        this.f14911e--;
    }

    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f14907a, false, 9538, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f14907a, false, 9538, new Class[0], String.class);
        }
        return String.valueOf(this.l.getId()) + "-" + String.valueOf(this.j) + "-" + String.valueOf(this.f14908b);
    }

    public final void a(b bVar) {
        int i = (bVar.f14910d - this.f14910d) - this.f14911e;
        if (i > 0) {
            this.f14911e += i;
        }
    }

    public b(long j, long j2) {
        super(j, j2);
    }
}
