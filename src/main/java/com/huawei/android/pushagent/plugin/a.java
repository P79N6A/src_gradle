package com.huawei.android.pushagent.plugin;

import com.huawei.android.pushagent.plugin.b.b;

public class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f25116a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f25117b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f25118c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ PushPlugins f25119d;

    a(PushPlugins pushPlugins, String str, String str2, String str3) {
        this.f25119d = pushPlugins;
        this.f25116a = str;
        this.f25117b = str2;
        this.f25118c = str3;
    }

    public void run() {
        new c(this.f25119d.f25113b, this.f25119d.f25114c).a(new b(this.f25116a, this.f25117b, this.f25118c));
    }
}
