package com.taobao.agoo;

import android.content.Context;
import android.text.TextUtils;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.IAgooAppReceiver;
import com.taobao.accs.b;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.utl.ALog;
import com.taobao.agoo.a.a.c;
import org.android.agoo.common.Config;

public final class i extends IAgooAppReceiver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f79135a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b f79136b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ IRegister f79137c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f79138d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f79139e;

    public final String getAppkey() {
        return this.f79138d;
    }

    public final void onBindApp(int i, String str) {
        try {
            ALog.i("TaobaoRegister", "onBindApp", "errorCode", Integer.valueOf(i));
            if (i == 200) {
                if (TaobaoRegister.mRequestListener == null) {
                    TaobaoRegister.mRequestListener = new com.taobao.agoo.a.b(this.f79135a);
                }
                this.f79136b.a(this.f79135a, "AgooDeviceCmd", (AccsAbstractDataListener) TaobaoRegister.mRequestListener);
                if (com.taobao.agoo.a.b.f79130b.b(this.f79135a.getPackageName())) {
                    ALog.i("TaobaoRegister", "agoo aready Registered return ", new Object[0]);
                    if (this.f79137c != null) {
                        this.f79137c.onSuccess(Config.g(this.f79135a));
                    }
                    return;
                }
                byte[] a2 = c.a(this.f79135a, this.f79138d, this.f79139e);
                if (a2 == null) {
                    if (this.f79137c != null) {
                        this.f79137c.onFailure("503.1", "req data null");
                    }
                    return;
                }
                String b2 = this.f79136b.b(this.f79135a, new ACCSManager.AccsRequest(null, "AgooDeviceCmd", a2, null));
                if (TextUtils.isEmpty(b2)) {
                    if (this.f79137c != null) {
                        this.f79137c.onFailure("503.1", "accs channel disabled!");
                    }
                } else if (this.f79137c != null) {
                    TaobaoRegister.mRequestListener.f79131a.put(b2, this.f79137c);
                }
            } else if (this.f79137c != null) {
                this.f79137c.onFailure(String.valueOf(i), "accs bindapp error!");
            }
        } catch (Throwable th) {
            ALog.e("TaobaoRegister", "register onBindApp", th, new Object[0]);
        }
    }

    i(Context context, b bVar, IRegister iRegister, String str, String str2) {
        this.f79135a = context;
        this.f79136b = bVar;
        this.f79137c = iRegister;
        this.f79138d = str;
        this.f79139e = str2;
    }
}
