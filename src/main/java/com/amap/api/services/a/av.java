package com.amap.api.services.a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.help.Inputtips;
import com.amap.api.services.help.InputtipsQuery;
import com.amap.api.services.help.Tip;
import com.amap.api.services.interfaces.IInputtipsSearch;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;

public class av implements IInputtipsSearch {

    /* renamed from: a  reason: collision with root package name */
    private Context f6501a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Inputtips.InputtipsListener f6502b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Handler f6503c = s.a();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public InputtipsQuery f6504d;

    public InputtipsQuery getQuery() {
        return this.f6504d;
    }

    public ArrayList<Tip> requestInputtips() throws AMapException {
        return a(this.f6504d);
    }

    public void requestInputtipsAsyn() {
        try {
            ai.a().a(new Runnable() {
                public void run() {
                    Message obtainMessage = s.a().obtainMessage();
                    obtainMessage.obj = av.this.f6502b;
                    obtainMessage.arg1 = 5;
                    try {
                        ArrayList a2 = av.this.a(av.this.f6504d);
                        Bundle bundle = new Bundle();
                        bundle.putParcelableArrayList("result", a2);
                        obtainMessage.setData(bundle);
                        obtainMessage.what = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                    } catch (AMapException e2) {
                        obtainMessage.what = e2.getErrorCode();
                    } catch (Throwable th) {
                        av.this.f6503c.sendMessage(obtainMessage);
                        throw th;
                    }
                    av.this.f6503c.sendMessage(obtainMessage);
                }
            });
        } catch (Throwable th) {
            j.a(th, "Inputtips", "requestInputtipsAsynThrowable");
        }
    }

    public void setInputtipsListener(Inputtips.InputtipsListener inputtipsListener) {
        this.f6502b = inputtipsListener;
    }

    public void setQuery(InputtipsQuery inputtipsQuery) {
        this.f6504d = inputtipsQuery;
    }

    /* access modifiers changed from: private */
    public ArrayList<Tip> a(InputtipsQuery inputtipsQuery) throws AMapException {
        try {
            q.a(this.f6501a);
            if (inputtipsQuery == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            } else if (inputtipsQuery.getKeyword() != null && !inputtipsQuery.getKeyword().equals("")) {
                return (ArrayList) new o(this.f6501a, inputtipsQuery).c();
            } else {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
        } catch (Throwable th) {
            j.a(th, "Inputtips", "requestInputtips");
            if (!(th instanceof AMapException)) {
                return null;
            }
            throw ((AMapException) th);
        }
    }

    public void requestInputtips(String str, String str2) throws AMapException {
        requestInputtips(str, str2, null);
    }

    public av(Context context, Inputtips.InputtipsListener inputtipsListener) {
        this.f6501a = context.getApplicationContext();
        this.f6502b = inputtipsListener;
    }

    public av(Context context, InputtipsQuery inputtipsQuery) {
        this.f6501a = context.getApplicationContext();
        this.f6504d = inputtipsQuery;
    }

    public void requestInputtips(String str, String str2, String str3) throws AMapException {
        if (str == null || str.equals("")) {
            throw new AMapException("无效的参数 - IllegalArgumentException");
        }
        this.f6504d = new InputtipsQuery(str, str2);
        this.f6504d.setType(str3);
        requestInputtipsAsyn();
    }
}
