package org.android.agoo.control;

import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.b;
import org.android.agoo.common.Config;
import org.json.JSONObject;

public class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ byte[] f84007a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f84008b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AgooFactory f84009c;

    public void run() {
        try {
            String str = new String(this.f84007a, "utf-8");
            if (TextUtils.isEmpty(str)) {
                b.a("accs", "agoo_fail_ack", "msg==null", 0.0d);
                return;
            }
            ALog.i("AgooFactory", "message = " + str, new Object[0]);
            JSONObject jSONObject = new JSONObject(str);
            String str2 = null;
            String string = jSONObject.getString("api");
            String string2 = jSONObject.getString("id");
            if (TextUtils.equals(string, "agooReport")) {
                str2 = jSONObject.getString("status");
            }
            if (TextUtils.equals(string, "agooAck")) {
                b.a("accs", "agoo_success_ack", "handlerACKMessage", 0.0d);
            }
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                if (!TextUtils.isEmpty(str2)) {
                    if (ALog.isPrintLog(ALog.Level.I)) {
                        ALog.i("AgooFactory", "updateMsg data begin,api=" + string + ",id=" + string2 + ",status=" + str2 + ",reportTimes=" + Config.e(AgooFactory.mContext), new Object[0]);
                    }
                    if (TextUtils.equals(string, "agooReport")) {
                        if (TextUtils.equals(str2, PushConstants.PUSH_TYPE_WITHDRAW_NOTIFICATION) && this.f84008b) {
                            AgooFactory.access$100(this.f84009c).a(string2, PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                        } else if ((TextUtils.equals(str2, "8") || TextUtils.equals(str2, "9")) && this.f84008b) {
                            AgooFactory.access$100(this.f84009c).a(string2, "100");
                        }
                        b.a("accs", "agoo_success_ack", str2, 0.0d);
                    }
                    return;
                }
            }
            b.a("accs", "agoo_fail_ack", "json key null", 0.0d);
        } catch (Throwable th) {
            ALog.e("AgooFactory", "updateMsg get data error,e=" + th, new Object[0]);
            b.a("accs", "agoo_fail_ack", "json exception", 0.0d);
        }
    }

    d(AgooFactory agooFactory, byte[] bArr, boolean z) {
        this.f84009c = agooFactory;
        this.f84007a = bArr;
        this.f84008b = z;
    }
}
