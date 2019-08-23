package com.bytedance.android.livesdk.message.model;

import android.text.TextUtils;
import com.bytedance.android.livesdk.message.proto.DecorationModifyMessage;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.model.live.c;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import java.util.ArrayList;
import java.util.List;

public final class o extends c<DecorationModifyMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16661a;
    @SerializedName("extra")

    /* renamed from: b  reason: collision with root package name */
    public String f16662b;

    class a {
        @SerializedName("deco_list")

        /* renamed from: a  reason: collision with root package name */
        public List<c> f16663a;
    }

    public o() {
        this.type = com.bytedance.android.livesdkapi.depend.f.a.MODIFY_DECORATION;
    }

    public final List<c> a() {
        if (PatchProxy.isSupport(new Object[0], this, f16661a, false, 11032, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f16661a, false, 11032, new Class[0], List.class);
        } else if (TextUtils.isEmpty(this.f16662b)) {
            return new ArrayList(0);
        } else {
            try {
                return ((a) j.q().c().fromJson(this.f16662b, a.class)).f16663a;
            } catch (Exception unused) {
                return new ArrayList(0);
            }
        }
    }

    public final /* synthetic */ c wrap(Message message) {
        DecorationModifyMessage decorationModifyMessage = (DecorationModifyMessage) message;
        if (PatchProxy.isSupport(new Object[]{decorationModifyMessage}, this, f16661a, false, 11033, new Class[]{DecorationModifyMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{decorationModifyMessage}, this, f16661a, false, 11033, new Class[]{DecorationModifyMessage.class}, c.class);
        }
        o oVar = new o();
        oVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(decorationModifyMessage.common);
        if (decorationModifyMessage.extra != null) {
            oVar.f16662b = decorationModifyMessage.extra;
        }
        return oVar;
    }
}
