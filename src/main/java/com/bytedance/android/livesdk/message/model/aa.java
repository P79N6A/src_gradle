package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.annotation.IgnoreStyleCheck;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.squareup.wire.Message;

public final class aa extends c<Message> {

    /* renamed from: a  reason: collision with root package name */
    public User f16425a;

    /* renamed from: b  reason: collision with root package name */
    public long f16426b;

    /* renamed from: c  reason: collision with root package name */
    public String f16427c;
    @IgnoreStyleCheck

    /* renamed from: d  reason: collision with root package name */
    public long f16428d;

    public final boolean canText() {
        return true;
    }

    public final c wrap(Message message) {
        return null;
    }

    public aa() {
        this.type = a.GIFT_GROUP;
    }

    public final boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.j == null) {
            return false;
        }
        return true;
    }

    public final boolean isCurrentRoom(long j) {
        if (this.f16428d == j) {
            return true;
        }
        return false;
    }
}
