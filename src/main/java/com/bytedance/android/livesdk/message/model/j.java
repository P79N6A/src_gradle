package com.bytedance.android.livesdk.message.model;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.message.proto.ControlMessage;
import com.bytedance.android.livesdkapi.h.e;
import com.bytedance.common.utility.StringUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;
import com.ss.android.ugc.aweme.C0906R;

public class j extends c<ControlMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16636a;
    @SerializedName("action")

    /* renamed from: b  reason: collision with root package name */
    public int f16637b;
    @SerializedName("tips")

    /* renamed from: c  reason: collision with root package name */
    public String f16638c;
    @SerializedName("extra")

    /* renamed from: d  reason: collision with root package name */
    public a f16639d;

    public class a {
        @SerializedName("ban_info_url")

        /* renamed from: a  reason: collision with root package name */
        public String f16640a;
        @SerializedName("reason_no")

        /* renamed from: b  reason: collision with root package name */
        public long f16641b;
        @SerializedName("title")

        /* renamed from: c  reason: collision with root package name */
        public e f16642c;
        @SerializedName("violation_reason")

        /* renamed from: d  reason: collision with root package name */
        public e f16643d;
        @SerializedName("display_text")

        /* renamed from: e  reason: collision with root package name */
        public e f16644e;

        public a() {
        }
    }

    public j() {
        this.type = com.bytedance.android.livesdkapi.depend.f.a.CONTROL;
    }

    public boolean canText() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f16636a, false, 11028, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f16636a, false, 11028, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!StringUtils.isEmpty(a())) {
            z = true;
        }
        return z;
    }

    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f16636a, false, 11027, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f16636a, false, 11027, new Class[0], String.class);
        }
        Context e2 = ac.e();
        Resources resources = e2.getResources();
        switch (this.f16637b) {
            case 1:
                if (Build.VERSION.SDK_INT < 24 || com.bytedance.android.live.uikit.a.a.f()) {
                    return resources.getString(C0906R.string.d91);
                }
                return ac.a(e2.getResources().getConfiguration().getLocales().get(0), (int) C0906R.string.d91);
            case 2:
                if (Build.VERSION.SDK_INT < 24 || com.bytedance.android.live.uikit.a.a.f()) {
                    return resources.getString(C0906R.string.dbr);
                }
                return ac.a(e2.getResources().getConfiguration().getLocales().get(0), (int) C0906R.string.dbr);
            default:
                return "";
        }
    }

    public /* synthetic */ c wrap(Message message) {
        ControlMessage controlMessage = (ControlMessage) message;
        if (PatchProxy.isSupport(new Object[]{controlMessage}, this, f16636a, false, 11029, new Class[]{ControlMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{controlMessage}, this, f16636a, false, 11029, new Class[]{ControlMessage.class}, c.class);
        }
        j jVar = new j();
        jVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(controlMessage.common);
        jVar.f16637b = (int) ((Long) Wire.get(controlMessage.action, 0L)).longValue();
        jVar.f16638c = controlMessage.tips;
        a aVar = new a();
        if (controlMessage.extra != null) {
            aVar.f16640a = controlMessage.extra.ban_info_url;
            aVar.f16641b = controlMessage.extra.reason_no.longValue();
            aVar.f16642c = com.bytedance.android.livesdk.message.a.a.a(controlMessage.extra.title);
            aVar.f16643d = com.bytedance.android.livesdk.message.a.a.a(controlMessage.extra.violation_reason);
            aVar.f16644e = com.bytedance.android.livesdk.message.a.a.a(controlMessage.extra.content);
        }
        jVar.f16639d = aVar;
        return jVar;
    }
}
