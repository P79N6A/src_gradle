package com.ss.android.ugc.aweme.qrcode.b;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ag.k;
import com.ss.android.ugc.aweme.qrcode.b.a;
import com.ss.android.ugc.aweme.qrcode.c;

public final class e extends a {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f63353c;

    public e(a.C0684a aVar) {
        super(aVar);
    }

    public final boolean a(String str, int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f63353c, false, 70407, new Class[]{String.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f63353c, false, 70407, new Class[]{String.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        String b2 = k.b(str, "schema_type");
        String b3 = k.b(str, "object_id");
        if (TextUtils.isEmpty(b2) || TextUtils.isEmpty(b3)) {
            return false;
        }
        try {
            i2 = Integer.parseInt(b2);
        } catch (NumberFormatException unused) {
            i2 = 0;
        }
        this.f63349a = c.a(i2, b3);
        return this.f63350b.a(i2, b3, str, i);
    }
}
