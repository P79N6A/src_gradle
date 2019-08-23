package com.bytedance.android.livesdk.chatroom.e;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.i;
import com.bytedance.android.live.utility.b;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.message.model.bo;
import com.bytedance.android.livesdkapi.host.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class aa extends b<bo> {
    public static ChangeQuickRedirect j;
    private boolean k;
    private i l = TTLiveSDKContext.getHostService().k().a();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f10011a;

        a(String str) {
            this.f10011a = str;
        }
    }

    public final boolean f() {
        return false;
    }

    public final User e() {
        return ((bo) this.f10013b).f16598b;
    }

    private int a() {
        if (this.l == null || ((bo) this.f10013b).f16598b == null) {
            return 0;
        }
        return this.k ? C0906R.color.ah_ : C0906R.color.ah_;
    }

    public final Spannable m() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, j, false, 5443, new Class[0], Spannable.class)) {
            return (Spannable) PatchProxy.accessDispatch(new Object[0], this, j, false, 5443, new Class[0], Spannable.class);
        }
        bo boVar = (bo) this.f10013b;
        if (PatchProxy.isSupport(new Object[0], boVar, bo.f16597a, false, 11103, new Class[0], String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[0], boVar, bo.f16597a, false, 11103, new Class[0], String.class);
        } else {
            StringBuilder sb = new StringBuilder();
            Context a2 = ((d) b.a(d.class)).a();
            if (a2 != null) {
                if (boVar.f16598b != null) {
                    sb.append(boVar.f16598b.getNickName());
                }
                if (boVar.f16599c != null) {
                    sb.append(a2.getString(C0906R.string.dgb, new Object[]{Long.valueOf(boVar.f16599c.f16600a)}));
                }
            }
            str = sb.toString();
        }
        return x.a(str, (int) C0906R.color.a98);
    }

    public final Spannable l() {
        String str;
        String str2;
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, j, false, 5442, new Class[0], Spannable.class)) {
            return (Spannable) PatchProxy.accessDispatch(new Object[0], this, j, false, 5442, new Class[0], Spannable.class);
        } else if (this.f10013b == null) {
            return null;
        } else {
            Context a2 = TTLiveSDKContext.getHostService().a().a();
            if (a2 == null) {
                return null;
            }
            if (!(this.l == null || ((bo) this.f10013b).f16598b == null)) {
                if (this.l.getId() == ((bo) this.f10013b).f16598b.getId()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && ((bo) this.f10013b).f16599c != null) {
                    com.bytedance.android.livesdk.u.a.a().a((Object) new a(((bo) this.f10013b).f16599c.f16603d));
                }
            }
            User user = ((bo) this.f10013b).f16598b;
            bo.a aVar = ((bo) this.f10013b).f16599c;
            if (user != null) {
                str = user.getNickName();
            } else {
                str = null;
            }
            if (aVar != null) {
                str2 = String.valueOf(aVar.f16600a);
            } else {
                str2 = null;
            }
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str + a2.getString(C0906R.string.dgb, new Object[]{str2}));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(a2.getResources().getColor(a())), 0, str.length(), 17);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(a2.getResources().getColor(C0906R.color.ah9)), str.length(), str.length() + 6, 17);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(a2.getResources().getColor(a())), str.length() + 6, spannableStringBuilder.length(), 17);
            return spannableStringBuilder;
        }
    }

    public aa(bo boVar) {
        super(boVar);
    }
}
