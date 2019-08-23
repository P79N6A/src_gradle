package com.xiaomi.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

public class bw {

    /* renamed from: a  reason: collision with root package name */
    private static bw f81876a;

    /* renamed from: a  reason: collision with other field name */
    private BroadcastReceiver f197a = new by(this);

    /* renamed from: a  reason: collision with other field name */
    private Context f198a;

    /* renamed from: a  reason: collision with other field name */
    private Handler f199a = new bx(this, bl.a().a().getLooper());

    /* renamed from: a  reason: collision with other field name */
    private List f200a = new ArrayList();

    private bw(Context context) {
        this.f198a = context;
        this.f198a.registerReceiver(this.f197a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public static bw a() {
        return f81876a;
    }

    public static void a(Context context) {
        if (f81876a == null) {
            f81876a = new bw(context);
        }
    }

    public void a(bu buVar) {
        synchronized (this.f200a) {
            this.f200a.add(buVar);
        }
    }
}
