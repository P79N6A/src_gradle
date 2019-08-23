package com.taobao.accs.internal;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.base.IBaseService;
import com.taobao.accs.net.b;
import com.taobao.accs.net.s;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.k;
import java.util.concurrent.ConcurrentHashMap;

public abstract class a implements IBaseService {

    /* renamed from: a  reason: collision with root package name */
    protected static ConcurrentHashMap<String, b> f78982a = new ConcurrentHashMap<>(2);

    /* renamed from: b  reason: collision with root package name */
    private Context f78983b;

    /* renamed from: c  reason: collision with root package name */
    private Service f78984c;

    public abstract int a(Intent intent);

    public IBinder onBind(Intent intent) {
        return null;
    }

    public boolean onUnbind(Intent intent) {
        return false;
    }

    public void onDestroy() {
        ALog.e("ElectionServiceImpl", "Service onDestroy", new Object[0]);
        this.f78983b = null;
        this.f78984c = null;
    }

    public void onCreate() {
        ALog.i("ElectionServiceImpl", "onCreate,", "sdkVersion", 221);
    }

    public a(Service service) {
        this.f78984c = service;
        this.f78983b = service.getApplicationContext();
    }

    private void b(Intent intent) {
        try {
            String stringExtra = intent.getStringExtra("packageName");
            String stringExtra2 = intent.getStringExtra("appKey");
            String stringExtra3 = intent.getStringExtra("ttid");
            String stringExtra4 = intent.getStringExtra("app_sercet");
            String stringExtra5 = intent.getStringExtra("configTag");
            int intExtra = intent.getIntExtra("mode", 0);
            ALog.i("ElectionServiceImpl", "handleStartCommand", "configTag", stringExtra5, "appkey", stringExtra2, "appSecret", stringExtra4, "ttid", stringExtra3, "pkg", stringExtra);
            if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(stringExtra2) && stringExtra.equals(this.f78983b.getPackageName())) {
                k.a(this.f78983b, intExtra);
                b a2 = a(this.f78983b, stringExtra5, false);
                if (a2 != null) {
                    a2.f78989a = stringExtra3;
                } else {
                    ALog.e("ElectionServiceImpl", "handleStartCommand start action, no connection", "configTag", stringExtra5);
                }
                UtilityImpl.d(this.f78983b, stringExtra2);
            }
        } catch (Throwable th) {
            ALog.e("ElectionServiceImpl", "handleStartCommand", th, new Object[0]);
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            return 2;
        }
        String action = intent.getAction();
        ALog.i("ElectionServiceImpl", "onStartCommand begin", "action", action);
        if (TextUtils.equals(action, "com.taobao.accs.intent.action.START_SERVICE")) {
            b(intent);
        }
        return a(intent);
    }

    protected static b a(Context context, String str, boolean z) {
        int b2;
        b bVar;
        b bVar2 = null;
        try {
            if (TextUtils.isEmpty(str)) {
                ALog.w("ElectionServiceImpl", "getConnection configTag null or env invalid", "conns.size", Integer.valueOf(f78982a.size()));
                if (f78982a.size() > 0) {
                    bVar = f78982a.elements().nextElement();
                } else {
                    bVar = null;
                }
                return bVar;
            }
            ALog.i("ElectionServiceImpl", "getConnection", "configTag", str, "start", Boolean.valueOf(z));
            AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
            if (configByTag == null || !configByTag.getDisableChannel()) {
                String str2 = str + "|" + b2;
                b bVar3 = f78982a.get(str2);
                if (bVar3 == null) {
                    try {
                        AccsClientConfig.mEnv = b2;
                        bVar2 = new s(context, 0, str);
                        if (z) {
                            bVar2.a();
                        }
                        if (f78982a.size() < 10) {
                            f78982a.put(str2, bVar2);
                        } else {
                            ALog.e("ElectionServiceImpl", "getConnection fail as exist too many conns!!!", new Object[0]);
                        }
                    } catch (Throwable th) {
                        th = th;
                        bVar2 = bVar3;
                        ALog.e("ElectionServiceImpl", "getConnection", th, new Object[0]);
                        return bVar2;
                    }
                } else {
                    bVar2 = bVar3;
                }
                return bVar2;
            }
            ALog.e("ElectionServiceImpl", "getConnection channel disabled!", "configTag", str);
            return null;
        } catch (Throwable th2) {
            th = th2;
            ALog.e("ElectionServiceImpl", "getConnection", th, new Object[0]);
            return bVar2;
        }
    }
}
