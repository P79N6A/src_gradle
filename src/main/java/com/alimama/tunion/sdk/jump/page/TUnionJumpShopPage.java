package com.alimama.tunion.sdk.jump.page;

import android.text.TextUtils;
import com.alimama.tunion.sdk.b.a;

public class TUnionJumpShopPage implements ITUnionJumpPage {

    /* renamed from: a  reason: collision with root package name */
    public String f5170a;

    public String a() {
        if (TextUtils.isEmpty(this.f5170a)) {
            return null;
        }
        return String.format(a.f5160b + "?user_id=%s", new Object[]{this.f5170a});
    }
}
