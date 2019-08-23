package com.bytedance.android.livesdk.message.model;

import android.content.Context;
import android.os.Build;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.message.proto.SocialMessage;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;
import com.ss.android.ugc.aweme.C0906R;

public class bj extends c<SocialMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16574a;
    @SerializedName("action")

    /* renamed from: b  reason: collision with root package name */
    public long f16575b;
    @SerializedName("user")

    /* renamed from: c  reason: collision with root package name */
    public User f16576c;
    @SerializedName("share_target")

    /* renamed from: d  reason: collision with root package name */
    public String f16577d;
    @SerializedName("share_type")

    /* renamed from: e  reason: collision with root package name */
    public long f16578e;

    public bj() {
        this.type = a.SOCIAL;
    }

    public boolean canText() {
        if (this.f16576c != null) {
            return true;
        }
        return false;
    }

    public boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.j == null) {
            return false;
        }
        return true;
    }

    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f16574a, false, 11099, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f16574a, false, 11099, new Class[0], String.class);
        }
        Context e2 = ac.e();
        String str = "";
        switch ((int) this.f16575b) {
            case 1:
                if (Build.VERSION.SDK_INT >= 24 && !com.bytedance.android.live.uikit.a.a.f()) {
                    str = ac.a(e2.getResources().getConfiguration().getLocales().get(0), (int) C0906R.string.de5);
                    break;
                } else {
                    str = e2.getResources().getString(C0906R.string.de5);
                    break;
                }
                break;
            case 3:
                if (Build.VERSION.SDK_INT >= 24 && !com.bytedance.android.live.uikit.a.a.f()) {
                    str = ac.a(e2.getResources().getConfiguration().getLocales().get(0), (int) C0906R.string.deb);
                    break;
                } else {
                    str = e2.getResources().getString(C0906R.string.deb);
                    break;
                }
        }
        return str;
    }

    public /* synthetic */ c wrap(Message message) {
        SocialMessage socialMessage = (SocialMessage) message;
        if (PatchProxy.isSupport(new Object[]{socialMessage}, this, f16574a, false, 11100, new Class[]{SocialMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{socialMessage}, this, f16574a, false, 11100, new Class[]{SocialMessage.class}, c.class);
        }
        bj bjVar = new bj();
        bjVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(socialMessage.common);
        bjVar.f16575b = ((Long) Wire.get(socialMessage.action, 0L)).longValue();
        bjVar.f16577d = socialMessage.share_target;
        bjVar.f16578e = ((Long) Wire.get(socialMessage.share_type, 0L)).longValue();
        bjVar.f16576c = com.bytedance.android.livesdk.message.a.a.a(socialMessage.user);
        return bjVar;
    }
}
