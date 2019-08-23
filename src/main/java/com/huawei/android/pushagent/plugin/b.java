package com.huawei.android.pushagent.plugin;

import java.util.concurrent.Callable;

public class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f25137a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f25138b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f25139c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ PushPlugins f25140d;

    b(PushPlugins pushPlugins, String str, String str2, String str3) {
        this.f25140d = pushPlugins;
        this.f25137a = str;
        this.f25138b = str2;
        this.f25139c = str3;
    }

    /* renamed from: a */
    public Integer call() {
        return Integer.valueOf(new c(this.f25140d.f25113b, this.f25140d.f25114c).a(new com.huawei.android.pushagent.plugin.b.b(this.f25137a, this.f25138b, this.f25139c)));
    }
}
