package com.amap.api.services.a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.a.s;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.IWeatherSearch;
import com.amap.api.services.weather.LocalWeatherForecast;
import com.amap.api.services.weather.LocalWeatherForecastResult;
import com.amap.api.services.weather.LocalWeatherLive;
import com.amap.api.services.weather.LocalWeatherLiveResult;
import com.amap.api.services.weather.WeatherSearch;
import com.amap.api.services.weather.WeatherSearchQuery;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public class bc implements IWeatherSearch {

    /* renamed from: a  reason: collision with root package name */
    private Context f6572a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public WeatherSearchQuery f6573b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public WeatherSearch.OnWeatherSearchListener f6574c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public LocalWeatherLiveResult f6575d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public LocalWeatherForecastResult f6576e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public Handler f6577f = s.a();

    public WeatherSearchQuery getQuery() {
        return this.f6573b;
    }

    public void searchWeatherAsyn() {
        try {
            ai.a().a(new Runnable() {
                public void run() {
                    s.k kVar;
                    s.l lVar;
                    Message obtainMessage = s.a().obtainMessage();
                    obtainMessage.arg1 = 13;
                    Bundle bundle = new Bundle();
                    if (bc.this.f6573b != null) {
                        if (bc.this.f6573b.getType() == 1) {
                            try {
                                LocalWeatherLiveResult unused = bc.this.f6575d = bc.this.a();
                                bundle.putInt("errorCode", PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                                lVar = new s.l();
                            } catch (AMapException e2) {
                                bundle.putInt("errorCode", e2.getErrorCode());
                                j.a(e2, "WeatherSearch", "searchWeatherAsyn");
                                lVar = new s.l();
                            } catch (Throwable th) {
                                s.l lVar2 = new s.l();
                                obtainMessage.what = 1301;
                                lVar2.f6908b = bc.this.f6574c;
                                lVar2.f6907a = bc.this.f6575d;
                                obtainMessage.obj = lVar2;
                                obtainMessage.setData(bundle);
                                bc.this.f6577f.sendMessage(obtainMessage);
                                throw th;
                            }
                            obtainMessage.what = 1301;
                            lVar.f6908b = bc.this.f6574c;
                            lVar.f6907a = bc.this.f6575d;
                            obtainMessage.obj = lVar;
                            obtainMessage.setData(bundle);
                            bc.this.f6577f.sendMessage(obtainMessage);
                        } else if (bc.this.f6573b.getType() == 2) {
                            try {
                                LocalWeatherForecastResult unused2 = bc.this.f6576e = bc.this.b();
                                bundle.putInt("errorCode", PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                                kVar = new s.k();
                            } catch (AMapException e3) {
                                bundle.putInt("errorCode", e3.getErrorCode());
                                j.a(e3, "WeatherSearch", "searchWeatherAsyn");
                                kVar = new s.k();
                            } catch (Throwable th2) {
                                s.k kVar2 = new s.k();
                                obtainMessage.what = 1302;
                                kVar2.f6906b = bc.this.f6574c;
                                kVar2.f6905a = bc.this.f6576e;
                                obtainMessage.obj = kVar2;
                                obtainMessage.setData(bundle);
                                bc.this.f6577f.sendMessage(obtainMessage);
                                throw th2;
                            }
                            obtainMessage.what = 1302;
                            kVar.f6906b = bc.this.f6574c;
                            kVar.f6905a = bc.this.f6576e;
                            obtainMessage.obj = kVar;
                            obtainMessage.setData(bundle);
                            bc.this.f6577f.sendMessage(obtainMessage);
                            return;
                        }
                        return;
                    }
                    try {
                        throw new AMapException("无效的参数 - IllegalArgumentException");
                    } catch (AMapException e4) {
                        j.a(e4, "WeatherSearch", "searchWeatherAsyn");
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: private */
    public LocalWeatherLiveResult a() throws AMapException {
        q.a(this.f6572a);
        if (this.f6573b != null) {
            am amVar = new am(this.f6572a, this.f6573b);
            return LocalWeatherLiveResult.createPagedResult((WeatherSearchQuery) amVar.j(), (LocalWeatherLive) amVar.c());
        }
        throw new AMapException("无效的参数 - IllegalArgumentException");
    }

    /* access modifiers changed from: private */
    public LocalWeatherForecastResult b() throws AMapException {
        q.a(this.f6572a);
        if (this.f6573b != null) {
            al alVar = new al(this.f6572a, this.f6573b);
            return LocalWeatherForecastResult.createPagedResult((WeatherSearchQuery) alVar.j(), (LocalWeatherForecast) alVar.c());
        }
        throw new AMapException("无效的参数 - IllegalArgumentException");
    }

    public void setOnWeatherSearchListener(WeatherSearch.OnWeatherSearchListener onWeatherSearchListener) {
        this.f6574c = onWeatherSearchListener;
    }

    public void setQuery(WeatherSearchQuery weatherSearchQuery) {
        this.f6573b = weatherSearchQuery;
    }

    public bc(Context context) {
        this.f6572a = context.getApplicationContext();
    }
}
