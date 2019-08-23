package com.alimama.tunion.sdk.a;

import android.content.Context;
import com.alimama.tunion.trade.base.ITUnionCommon;
import com.ta.utdid2.device.UTDevice;

public class b implements ITUnionCommon {

    /* renamed from: a  reason: collision with root package name */
    private String f5149a;

    /* renamed from: b  reason: collision with root package name */
    private String f5150b;

    /* renamed from: c  reason: collision with root package name */
    private Context f5151c;

    public String getAdzoneId() {
        return this.f5150b;
    }

    public String getAppKey() {
        return this.f5149a;
    }

    public String getUtdid() {
        return UTDevice.getUtdid(this.f5151c);
    }

    public b(Context context, String str, String str2) {
        this.f5151c = context.getApplicationContext();
        this.f5149a = str;
        this.f5150b = str2;
    }
}
