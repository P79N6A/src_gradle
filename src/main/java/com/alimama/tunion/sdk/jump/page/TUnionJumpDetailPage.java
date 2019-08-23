package com.alimama.tunion.sdk.jump.page;

import android.text.TextUtils;
import com.alimama.tunion.sdk.b.a;

public class TUnionJumpDetailPage implements ITUnionJumpPage {

    /* renamed from: a  reason: collision with root package name */
    public String f5169a;

    public String a() {
        if (TextUtils.isEmpty(this.f5169a)) {
            return null;
        }
        return String.format(a.f5159a + "?id=%s", new Object[]{this.f5169a});
    }
}
