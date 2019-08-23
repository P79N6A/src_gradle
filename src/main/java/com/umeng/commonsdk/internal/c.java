package com.umeng.commonsdk.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.statistics.common.ULog;
import org.json.JSONObject;

public class c implements UMLogDataProtocol {

    /* renamed from: a  reason: collision with root package name */
    private Context f80746a;

    public void removeCacheData(Object obj) {
    }

    public JSONObject setupReportData(long j) {
        return null;
    }

    public c(Context context) {
        if (context != null) {
            this.f80746a = context.getApplicationContext();
        }
    }

    public void workEvent(Object obj, int i) {
        ULog.i("walle", "[internal] workEvent");
        switch (i) {
            case 32769:
                try {
                    ULog.i("walle", "[internal] workEvent send envelope");
                    try {
                        Class<?> cls = Class.forName("com.umeng.commonsdk.internal.UMInternalManagerAgent");
                        if (cls != null) {
                            cls.getMethod("sendInternalEnvelopeByStateful2", new Class[]{Context.class}).invoke(cls, new Object[]{this.f80746a});
                            break;
                        }
                    } catch (ClassNotFoundException unused) {
                        break;
                    } catch (Throwable unused2) {
                        return;
                    }
                } catch (Exception unused3) {
                    return;
                }
                break;
            case 32770:
                return;
            case 32771:
                ULog.i("walle", "[internal] workEvent cache battery, event is " + obj.toString());
                try {
                    Class<?> cls2 = Class.forName("com.umeng.commonsdk.internal.utils.UMInternalUtilsAgent");
                    if (cls2 != null) {
                        cls2.getMethod("saveBattery", new Class[]{Context.class, String.class}).invoke(cls2, new Object[]{this.f80746a, (String) obj});
                    }
                    return;
                } catch (ClassNotFoundException unused4) {
                    return;
                } catch (Throwable unused5) {
                    return;
                }
            case 32772:
                ULog.i("walle", "[internal] workEvent cache station, event is " + obj.toString());
                try {
                    Class<?> cls3 = Class.forName("com.umeng.commonsdk.internal.utils.UMInternalUtilsAgent");
                    if (cls3 != null) {
                        cls3.getMethod("saveBaseStationStrength", new Class[]{Context.class, String.class}).invoke(cls3, new Object[]{this.f80746a, (String) obj});
                    }
                    return;
                } catch (ClassNotFoundException unused6) {
                    return;
                } catch (Throwable unused7) {
                    return;
                }
            case 32773:
                try {
                    Class<?> cls4 = Class.forName("com.umeng.commonsdk.internal.utils.InfoPreferenceAgent");
                    if (cls4 != null) {
                        cls4.getMethod("saveBluetoothInfo", new Class[]{Context.class, Object.class}).invoke(cls4, new Object[]{this.f80746a, obj});
                    }
                    return;
                } catch (ClassNotFoundException unused8) {
                    return;
                } catch (Throwable unused9) {
                    return;
                }
            case 32774:
                try {
                    Class<?> cls5 = Class.forName("com.umeng.commonsdk.internal.utils.ApplicationLayerUtilAgent");
                    if (cls5 != null) {
                        cls5.getMethod("wifiChange", new Class[]{Context.class}).invoke(cls5, new Object[]{this.f80746a});
                    }
                    return;
                } catch (ClassNotFoundException unused10) {
                    return;
                } catch (Throwable unused11) {
                    return;
                }
            case 32775:
                try {
                    Class<?> cls6 = Class.forName("com.umeng.commonsdk.internal.utils.InfoPreferenceAgent");
                    if (cls6 != null) {
                        cls6.getMethod("saveUA", new Class[]{Context.class, String.class}).invoke(cls6, new Object[]{this.f80746a, (String) obj});
                    }
                    return;
                } catch (ClassNotFoundException unused12) {
                    return;
                } catch (Throwable unused13) {
                    return;
                }
            case 32776:
                SharedPreferences a2 = com.ss.android.ugc.aweme.q.c.a(this.f80746a.getApplicationContext(), "info", 0);
                if (a2 != null) {
                    a2.edit().putString("stat", (String) obj).commit();
                    break;
                }
                break;
            case 32777:
                try {
                    ULog.i("walle", "[internal] workEvent send envelope");
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("i_sdk_v", "1.2.0");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("inner", new JSONObject());
                    JSONObject buildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(this.f80746a, jSONObject, jSONObject2);
                    if (buildEnvelopeWithExtHeader != null && !buildEnvelopeWithExtHeader.has("exception")) {
                        ULog.i("walle", "[internal] workEvent send envelope back, result is ok");
                    }
                    return;
                } catch (Exception unused14) {
                    return;
                }
        }
    }
}
