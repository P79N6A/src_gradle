package com.taobao.accs.net;

import android.text.TextUtils;
import anet.channel.IAuth;
import anet.channel.RequestCb;
import anet.channel.bytes.ByteArray;
import anet.channel.statist.RequestStatistic;
import com.taobao.accs.net.j;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import java.util.List;
import java.util.Map;

public class q implements RequestCb {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ IAuth.AuthCallback f79030a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j.a f79031b;

    public void onDataReceive(ByteArray byteArray, boolean z) {
    }

    q(j.a aVar, IAuth.AuthCallback authCallback) {
        this.f79031b = aVar;
        this.f79030a = authCallback;
    }

    public void onResponseCode(int i, Map<String, List<String>> map) {
        ALog.e(this.f79031b.f79013c, "auth", "httpStatusCode", Integer.valueOf(i));
        if (i == 200) {
            this.f79030a.onAuthSuccess();
            if (this.f79031b.f79014d instanceof j) {
                ((j) this.f79031b.f79014d).l();
            }
        } else {
            this.f79030a.onAuthFail(i, "auth fail");
        }
        Map<String, String> a2 = UtilityImpl.a(map);
        ALog.d(this.f79031b.f79013c, "auth", "header", a2);
        String str = a2.get("x-at");
        if (!TextUtils.isEmpty(str)) {
            this.f79031b.f79014d.k = str;
        }
    }

    public void onFinish(int i, String str, RequestStatistic requestStatistic) {
        if (i < 0) {
            ALog.e(this.f79031b.f79013c, "auth onFinish", "statusCode", Integer.valueOf(i));
            this.f79030a.onAuthFail(i, "onFinish auth fail");
        }
    }
}
