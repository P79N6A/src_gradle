package com.bytedance.frameworks.core.a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.frameworks.core.a.b.e;
import com.bytedance.frameworks.core.a.d;

public final class h implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public d f19965a;

    /* renamed from: b  reason: collision with root package name */
    private a f19966b;

    public interface a {
        void a();
    }

    public final void a() {
        if (this.f19966b != null) {
            this.f19966b.a();
        }
    }

    public final void a(e eVar) {
        if (this.f19965a != null) {
            this.f19965a.a(eVar);
        }
    }

    public final void a(boolean z) {
        if (this.f19965a != null) {
            this.f19965a.a(z);
        }
    }

    public final void a(String str, String str2, boolean z) {
        a(str, str, str2, true);
    }

    public h(Context context, a aVar, String str) {
        this.f19965a = new d(context, str == null ? "default" : str);
        this.f19966b = aVar;
        if (this.f19966b != null) {
            d dVar = this.f19965a;
            if (!dVar.f19945a.contains(this)) {
                dVar.f19945a.add(this);
            }
        }
    }

    private void a(String str, String str2, String str3, boolean z) {
        a(str, str2, str3, z, false);
    }

    private void a(String str, String str2, String str3, boolean z, boolean z2) {
        if (this.f19965a != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3)) {
            this.f19965a.a(str, str2, str3, z, false);
        }
    }
}
