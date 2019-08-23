package com.vivo.push.b;

import com.vivo.push.a;
import com.vivo.push.y;

public class s extends y {

    /* renamed from: a  reason: collision with root package name */
    private String f81520a;

    /* renamed from: b  reason: collision with root package name */
    private int f81521b;

    public String toString() {
        return "OnReceiveCommand";
    }

    public final String g() {
        return this.f81520a;
    }

    public final int h() {
        return this.f81521b;
    }

    public s(int i) {
        super(i);
    }

    public void c(a aVar) {
        aVar.a("req_id", this.f81520a);
        aVar.a("status_msg_code", this.f81521b);
    }

    public void d(a aVar) {
        this.f81520a = aVar.a("req_id");
        this.f81521b = aVar.b("status_msg_code", this.f81521b);
    }
}
