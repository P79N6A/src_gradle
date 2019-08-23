package com.ss.android.ugc.aweme.shortvideo.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.net.NetUtils;
import java.util.ArrayList;
import java.util.Locale;

public class NetStateReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68789a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final String f68790b = "NetStateReceiver";

    /* renamed from: c  reason: collision with root package name */
    private static boolean f68791c;
    @NetUtils.NetType

    /* renamed from: d  reason: collision with root package name */
    private static int f68792d;

    /* renamed from: e  reason: collision with root package name */
    private static ArrayList<a> f68793e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    private static BroadcastReceiver f68794f;

    private static BroadcastReceiver a() {
        if (PatchProxy.isSupport(new Object[0], null, f68789a, true, 78170, new Class[0], BroadcastReceiver.class)) {
            return (BroadcastReceiver) PatchProxy.accessDispatch(new Object[0], null, f68789a, true, 78170, new Class[0], BroadcastReceiver.class);
        }
        if (f68794f == null) {
            synchronized (NetStateReceiver.class) {
                if (f68794f == null) {
                    f68794f = new NetStateReceiver();
                }
            }
        }
        return f68794f;
    }

    public static void b(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f68789a, true, 78174, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, null, f68789a, true, 78174, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (f68794f != null) {
            try {
                context.getApplicationContext().unregisterReceiver(f68794f);
            } catch (Exception unused) {
            }
        }
    }

    public static void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f68789a, true, 78172, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, null, f68789a, true, 78172, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.ss.ugc.aweme.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.getApplicationContext().registerReceiver(a(), intentFilter);
    }

    public static void b(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, null, f68789a, true, 78177, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, null, f68789a, true, 78177, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (f68793e != null && f68793e.contains(aVar2)) {
            f68793e.remove(aVar2);
        }
    }

    public static void a(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, null, f68789a, true, 78176, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, null, f68789a, true, 78176, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (f68793e == null) {
            f68793e = new ArrayList<>();
        }
        f68793e.add(aVar2);
    }

    public void onReceive(Context context, Intent intent) {
        boolean z;
        Context context2 = context;
        int i = 2;
        if (PatchProxy.isSupport(new Object[]{context2, intent}, this, f68789a, false, 78171, new Class[]{Context.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, intent}, this, f68789a, false, 78171, new Class[]{Context.class, Intent.class}, Void.TYPE);
            return;
        }
        f68794f = this;
        if (intent.getAction().equalsIgnoreCase("android.net.conn.CONNECTIVITY_CHANGE") || intent.getAction().equalsIgnoreCase("com.ss.ugc.aweme.CONNECTIVITY_CHANGE")) {
            if (PatchProxy.isSupport(new Object[]{context2}, null, NetUtils.f68795a, true, 78178, new Class[]{Context.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, NetUtils.f68795a, true, 78178, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
            } else {
                NetworkInfo[] allNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getAllNetworkInfo();
                if (allNetworkInfo != null) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= allNetworkInfo.length) {
                            break;
                        } else if (allNetworkInfo[i2].getState() == NetworkInfo.State.CONNECTED) {
                            z = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                z = false;
            }
            if (!z) {
                f68791c = false;
            } else {
                f68791c = true;
                if (PatchProxy.isSupport(new Object[]{context2}, null, NetUtils.f68795a, true, 78183, new Class[]{Context.class}, Integer.TYPE)) {
                    i = ((Integer) PatchProxy.accessDispatch(new Object[]{context2}, null, NetUtils.f68795a, true, 78183, new Class[]{Context.class}, Integer.TYPE)).intValue();
                } else {
                    NetworkInfo activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo();
                    if (!(activeNetworkInfo == null || activeNetworkInfo.getExtraInfo() == null)) {
                        int type = activeNetworkInfo.getType();
                        if (type == 0) {
                            if (!activeNetworkInfo.getExtraInfo().toLowerCase(Locale.getDefault()).equals("cmnet")) {
                                i = 3;
                            }
                        } else if (type == 1) {
                            i = 1;
                        }
                    }
                    i = 4;
                }
                f68792d = i;
            }
            if (PatchProxy.isSupport(new Object[0], this, f68789a, false, 78175, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f68789a, false, 78175, new Class[0], Void.TYPE);
            } else if (!f68793e.isEmpty()) {
                int size = f68793e.size();
                for (int i3 = 0; i3 < size; i3++) {
                    a aVar = f68793e.get(i3);
                    if (aVar != null) {
                        if (f68791c) {
                            aVar.a(f68792d);
                        } else {
                            aVar.a();
                        }
                    }
                }
            }
        }
    }
}
