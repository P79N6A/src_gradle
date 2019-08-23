package com.tencent.wxop.stat;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class b extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i f79860a;

    b(i iVar) {
        this.f79860a = iVar;
    }

    public void onReceive(Context context, Intent intent) {
        if (this.f79860a.g != null) {
            this.f79860a.g.a(new ad(this));
        }
    }
}
