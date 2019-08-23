package org.android.agoo.control;

import android.content.Context;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.b;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.a;
import java.util.HashMap;
import org.android.agoo.common.Config;
import org.json.JSONObject;

public class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f84025a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f84026b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f84027c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f84028d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ NotifManager f84029e;

    public void run() {
        String str;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("thirdTokenType", this.f84025a);
            hashMap.put("token", this.f84026b);
            hashMap.put("appkey", Config.a(NotifManager.mContext));
            hashMap.put("utdid", a.b(NotifManager.mContext));
            hashMap.put("vendorSdkVersion", this.f84027c);
            ALog.d("NotifManager", "report,utdid=" + a.b(NotifManager.mContext) + ",regId=" + this.f84026b + ",type=" + this.f84025a, new Object[0]);
            ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, "agooTokenReport", new JSONObject(hashMap).toString().getBytes("UTF-8"), null, null, null, null);
            Context context = NotifManager.mContext;
            b accsInstance = ACCSManager.getAccsInstance(context, Config.a(context), Config.b(NotifManager.mContext));
            if (this.f84028d) {
                str = accsInstance.a(NotifManager.mContext, accsRequest);
            } else {
                str = accsInstance.a(NotifManager.mContext, accsRequest, new TaoBaseService.ExtraInfo());
            }
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.i("NotifManager", "reportThirdPushToken,dataId=" + str + ",regId=" + this.f84026b + ",type=" + this.f84025a, new Object[0]);
            }
        } catch (Throwable th) {
            UTMini.getInstance().commitEvent(66002, "reportThirdPushToken", a.b(NotifManager.mContext), th.toString());
            if (ALog.isPrintLog(ALog.Level.E)) {
                ALog.e("NotifManager", "[report] is error", th, new Object[0]);
            }
        }
    }

    m(NotifManager notifManager, String str, String str2, String str3, boolean z) {
        this.f84029e = notifManager;
        this.f84025a = str;
        this.f84026b = str2;
        this.f84027c = str3;
        this.f84028d = z;
    }
}
