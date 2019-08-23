package com.vivo.push.b;

import com.vivo.push.a;

public final class u extends v {

    /* renamed from: a  reason: collision with root package name */
    private long f81524a = -1;

    /* renamed from: b  reason: collision with root package name */
    private int f81525b;

    public final String toString() {
        return "OnUndoMsgCommand";
    }

    public final long d() {
        return this.f81524a;
    }

    public u() {
        super(20);
    }

    public final String e() {
        if (this.f81524a != -1) {
            return String.valueOf(this.f81524a);
        }
        return null;
    }

    public final void c(a aVar) {
        super.c(aVar);
        aVar.a("undo_msg_v1", this.f81524a);
        aVar.a("undo_msg_type_v1", this.f81525b);
    }

    public final void d(a aVar) {
        super.d(aVar);
        this.f81524a = aVar.b("undo_msg_v1", this.f81524a);
        this.f81525b = aVar.b("undo_msg_type_v1", 0);
    }
}
