package com.bytedance.android.livesdk.gift.model.a;

import android.support.annotation.NonNull;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.model.e;

public class c extends b<e> {

    /* renamed from: e  reason: collision with root package name */
    private ImageModel f15099e;

    public final ImageModel n() {
        return this.f15099e;
    }

    public final String i() {
        return ((e) this.f15098d).f11109b;
    }

    public final String k() {
        return ((e) this.f15098d).f11112e;
    }

    public final long o() {
        return ((e) this.f15098d).f11108a;
    }

    public c(@NonNull e eVar) {
        super(3, eVar);
        this.f15099e = eVar.f11110c;
    }
}
