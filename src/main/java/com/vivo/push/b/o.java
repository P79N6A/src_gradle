package com.vivo.push.b;

import android.text.TextUtils;
import com.vivo.push.a;
import com.vivo.push.model.UnvarnishedMessage;

public final class o extends v {

    /* renamed from: a  reason: collision with root package name */
    protected UnvarnishedMessage f81514a;

    public final String toString() {
        return "OnMessageCommand";
    }

    public final UnvarnishedMessage e() {
        return this.f81514a;
    }

    public o() {
        super(3);
    }

    public final String d() {
        if (this.f81514a == null) {
            return null;
        }
        return this.f81514a.unpackToJson();
    }

    public final void c(a aVar) {
        super.c(aVar);
        aVar.a("msg_v1", this.f81514a.unpackToJson());
    }

    public final void d(a aVar) {
        super.d(aVar);
        String a2 = aVar.a("msg_v1");
        if (!TextUtils.isEmpty(a2)) {
            this.f81514a = new UnvarnishedMessage(a2);
            this.f81514a.setMsgId(f());
        }
    }
}
