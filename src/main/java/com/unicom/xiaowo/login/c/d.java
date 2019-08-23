package com.unicom.xiaowo.login.c;

import android.net.Network;
import java.util.HashMap;

public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ String f81433a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ HashMap f81434b = null;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Network f81435c;

    /* renamed from: d  reason: collision with root package name */
    private /* synthetic */ e f81436d;

    /* renamed from: e  reason: collision with root package name */
    private /* synthetic */ a f81437e;

    d(a aVar, String str, HashMap hashMap, Network network, e eVar) {
        this.f81437e = aVar;
        this.f81433a = str;
        this.f81435c = network;
        this.f81436d = eVar;
    }

    public final void run() {
        try {
            this.f81436d.a(l.a(this.f81433a, this.f81434b, this.f81435c));
        } catch (Exception e2) {
            e2.getMessage();
        }
    }
}
