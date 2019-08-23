package org.android.agoo.accs;

import android.text.TextUtils;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.a;
import com.taobao.accs.utl.b;
import java.nio.charset.Charset;
import org.android.agoo.common.CallBack;
import org.android.agoo.common.Config;
import org.android.agoo.control.AgooFactory;

public class AgooService extends TaoBaseService {

    /* renamed from: a  reason: collision with root package name */
    public static CallBack f83984a;

    /* renamed from: b  reason: collision with root package name */
    public static CallBack f83985b;

    /* renamed from: c  reason: collision with root package name */
    private AgooFactory f83986c;

    public void onDestroy() {
        super.onDestroy();
    }

    public void onCreate() {
        super.onCreate();
        ALog.d("AgooService", "into--[onCreate]", new Object[0]);
        this.f83986c = new AgooFactory();
        this.f83986c.init(getApplicationContext(), null, null);
    }

    private String a(Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace != null && stackTrace.length > 0) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                stringBuffer.append(stackTraceElement.toString());
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }

    public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        if (ALog.isPrintLog(ALog.Level.E)) {
            ALog.e("AgooService", "into--[onBind]:serviceId:" + str + ",errorCode=" + i, new Object[0]);
        }
        if (f83984a != null && "agooSend".equals(str)) {
            if (i == 200) {
                f83984a.onSuccess();
            } else {
                f83984a.onFailure(String.valueOf(i), "bind Agoo service fail");
            }
        }
        f83984a = null;
    }

    public void onUnbind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        if (ALog.isPrintLog(ALog.Level.E)) {
            ALog.e("AgooService", "into--[onUnbind]:serviceId:" + str + ",errorCode=" + i, new Object[0]);
        }
        if (f83985b != null && "agooSend".equals(str)) {
            if (i == 200) {
                f83985b.onSuccess();
            } else {
                f83985b.onFailure(String.valueOf(i), "unbind Agoo service fail");
            }
        }
        f83985b = null;
    }

    public void onSendData(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) {
        try {
            if (ALog.isPrintLog(ALog.Level.I)) {
                ALog.i("AgooService", "onSendData,dataId=" + str2 + ",errorCode=" + i + ",serviceId=" + str, new Object[0]);
            }
            if (i == 200) {
                if (TextUtils.equals("agooAck", str)) {
                    b.a("accs", "agoo_success_ack", "8/9", 0.0d);
                }
                if (TextUtils.isEmpty(str) || !TextUtils.equals(str, "agooAck") || Long.parseLong(str2) <= 300000000 || Long.parseLong(str2) >= 600000000) {
                    if (!TextUtils.isEmpty(str) && TextUtils.equals(str, "agooAck") && Long.parseLong(str2) > 600000000 && ALog.isPrintLog(ALog.Level.I)) {
                        ALog.i("AgooService", "onSendData,reportData=" + str2 + ",serviceId=" + str, new Object[0]);
                    }
                } else if (ALog.isPrintLog(ALog.Level.I)) {
                    ALog.i("AgooService", "onSendData,AckData=" + str2 + ",serviceId=" + str, new Object[0]);
                }
            } else {
                if (TextUtils.equals("agooAck", str)) {
                    Config.a(getApplicationContext(), 1);
                    b.a("accs", "agoo_fail_ack", String.valueOf(i), 0.0d);
                }
                if (ALog.isPrintLog(ALog.Level.I)) {
                    ALog.i("AgooService", "onSendData error,dataId=" + str2 + ",serviceId=" + str, new Object[0]);
                    ALog.e("AgooService", "into--[parseError]", new Object[0]);
                }
                UTMini instance = UTMini.getInstance();
                String b2 = a.b(getApplicationContext());
                instance.commitEvent(66002, "accs.agooService", b2, "errorCode", str2 + ",serviceId=" + str + ",errorCode=" + i);
            }
        } catch (Throwable th) {
            if (ALog.isPrintLog(ALog.Level.E)) {
                ALog.e("AgooService", "onSendData exception,e=" + th.getMessage() + ",e.getStackMsg=" + a(th), new Object[0]);
            }
            UTMini.getInstance().commitEvent(66002, "accs.agooService", a.b(getApplicationContext()), "onSendDataException", a(th));
        }
    }

    public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.i("AgooService", "into--[onData]:serviceId:" + str + ",dataId=" + str3, new Object[0]);
            StringBuilder sb = new StringBuilder("push data:");
            sb.append(new String(bArr, Charset.forName("UTF-8")));
            ALog.d("AgooService", sb.toString(), new Object[0]);
        }
        UTMini.getInstance().commitEvent(66002, "accs.agooService", a.b(getApplicationContext()), str3);
        b.a("accs", "agoo_total_arrive", "total_arrive", 0.0d);
        try {
            this.f83986c.saveMsg(bArr);
            this.f83986c.msgRecevie(bArr, "accs", extraInfo);
        } catch (Throwable th) {
            UTMini.getInstance().commitEvent(66002, "accs.agooService", "onDataError", th);
            ALog.e("AgooService", "into--[onData,dealMessage]:error:" + th, new Object[0]);
        }
    }

    public void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.i("AgooService", "onResponse,dataId=" + str2 + ",errorCode=" + i + ",data=" + bArr + ",serviceId=" + str, new Object[0]);
        }
        String str3 = null;
        if (bArr != null) {
            try {
                if (bArr.length > 0) {
                    str3 = new String(bArr, "utf-8");
                }
            } catch (Throwable th) {
                ALog.e("AgooService", "onResponse get data error,e=" + th, new Object[0]);
            }
        }
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.d("AgooService", "onResponse,message=" + str3, new Object[0]);
        }
        if (i == 200 && TextUtils.equals(str, "agooAck")) {
            if (ALog.isPrintLog(ALog.Level.E)) {
                ALog.e("AgooService", "request is success", "dataId", str2);
            }
            this.f83986c.updateMsg(bArr, true);
        } else if (i == 200 || !TextUtils.equals(str, "agooAck")) {
            if (ALog.isPrintLog(ALog.Level.E)) {
                ALog.e("AgooService", "business request is error,message=" + str3, new Object[0]);
            }
        } else {
            if (ALog.isPrintLog(ALog.Level.E)) {
                ALog.e("AgooService", "request is error", "dataId", str2, "errorid", Integer.valueOf(i));
            }
            Config.a(getApplicationContext(), 1);
            b.a("accs", "agoo_fail_ack", String.valueOf(i), 0.0d);
        }
    }
}
