package com.xiaomi.push;

import com.xiaomi.channel.commonutils.logger.b;
import java.util.Date;

public class bk implements gt {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ bj f81863a;

    bk(bj bjVar) {
        this.f81863a = bjVar;
    }

    public void a(gq gqVar) {
        b.c("[Slim] " + bj.a(this.f81863a).format(new Date()) + " Connection reconnected (" + bj.a(this.f81863a).hashCode() + ")");
    }

    public void a(gq gqVar, int i, Exception exc) {
        b.c("[Slim] " + bj.a(this.f81863a).format(new Date()) + " Connection closed (" + bj.a(this.f81863a).hashCode() + ")");
    }

    public void a(gq gqVar, Exception exc) {
        b.c("[Slim] " + bj.a(this.f81863a).format(new Date()) + " Reconnection failed due to an exception (" + bj.a(this.f81863a).hashCode() + ")");
    }

    public void b(gq gqVar) {
        b.c("[Slim] " + bj.a(this.f81863a).format(new Date()) + " Connection started (" + bj.a(this.f81863a).hashCode() + ")");
    }
}
