package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.c;
import com.bytedance.android.livesdk.message.proto.MemberMessage;
import com.bytedance.android.livesdkapi.h.e;
import com.bytedance.common.utility.StringUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;
import com.ss.android.http.a.d.d;
import com.ss.android.ugc.aweme.C0906R;
import java.util.Comparator;

public class as extends c<MemberMessage> implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16484a;
    @SerializedName("member_count")

    /* renamed from: b  reason: collision with root package name */
    public int f16485b;
    @SerializedName("user")

    /* renamed from: c  reason: collision with root package name */
    public User f16486c;
    @SerializedName("is_top_user")

    /* renamed from: d  reason: collision with root package name */
    public int f16487d;
    @SerializedName("action")

    /* renamed from: e  reason: collision with root package name */
    public int f16488e;
    @SerializedName("top_user_no")

    /* renamed from: f  reason: collision with root package name */
    public int f16489f;
    @SerializedName("operator")
    public User g;
    @SerializedName("is_set_to_admin")
    public boolean h;
    @SerializedName("rank_score")
    public int i;
    @SerializedName("enter_type")
    public int j;
    @SerializedName("action_description")
    public String k;
    @SerializedName("effect_config")
    public a l;
    @SerializedName("user_id")
    public long m;
    @SerializedName("pop_str")
    public String n;

    public static class a {
        @SerializedName("type")

        /* renamed from: a  reason: collision with root package name */
        public int f16490a;
        @SerializedName("icon")

        /* renamed from: b  reason: collision with root package name */
        public ImageModel f16491b;
        @SerializedName("text")

        /* renamed from: c  reason: collision with root package name */
        public e f16492c;
        @SerializedName("avatar_pos")

        /* renamed from: d  reason: collision with root package name */
        public int f16493d;
        @SerializedName("text_icon")

        /* renamed from: e  reason: collision with root package name */
        public ImageModel f16494e;
        @SerializedName("stay_time")

        /* renamed from: f  reason: collision with root package name */
        public int f16495f;
    }

    public final long a() {
        return (long) this.f16488e;
    }

    public final long b() {
        return (long) this.f16489f;
    }

    public as() {
        this.type = com.bytedance.android.livesdkapi.depend.f.a.MEMBER;
    }

    public boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.j == null || 1 == this.f16487d) {
            return false;
        }
        return true;
    }

    public boolean canText() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f16484a, false, 11079, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f16484a, false, 11079, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f16486c != null && !StringUtils.isEmpty(d())) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, f16484a, false, 11080, new Class[0], Integer.TYPE)) {
            return d.a(17, (Object) Long.valueOf(this.baseMessage.f18777d));
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f16484a, false, 11080, new Class[0], Integer.TYPE)).intValue();
    }

    private String e() {
        if (PatchProxy.isSupport(new Object[0], this, f16484a, false, 11075, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f16484a, false, 11075, new Class[0], String.class);
        }
        if (this.k == null) {
            if (this.f16488e != 1) {
                this.k = "";
            } else {
                this.k = a(C0906R.string.de4, new Object[0]);
            }
        }
        return this.k;
    }

    public final String c() {
        if (PatchProxy.isSupport(new Object[0], this, f16484a, false, 11076, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f16484a, false, 11076, new Class[0], String.class);
        }
        String str = "";
        int i2 = this.j;
        if (i2 == 15) {
            str = a(C0906R.string.dem, new Object[0]);
        } else if (i2 == 1000) {
            str = a(C0906R.string.d15, new Object[0]);
        } else if (i2 == 2000) {
            str = a(C0906R.string.d17, new Object[0]);
        } else if (i2 == 3000) {
            str = a(C0906R.string.d18, new Object[0]);
        } else if (i2 == 4000) {
            str = a(C0906R.string.d16, new Object[0]);
        }
        return str;
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f16484a, false, 11082, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f16484a, false, 11082, new Class[0], String.class);
        }
        return "MemberMessage{action=" + this.f16488e + ", enterType=" + this.j + ", actionDescription='" + this.k + '\'' + ", effectConfig=" + this.l + ", userId=" + this.m + '}';
    }

    public final String d() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (PatchProxy.isSupport(new Object[0], this, f16484a, false, 11077, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f16484a, false, 11077, new Class[0], String.class);
        }
        switch (this.f16488e) {
            case 1:
                if (1 != this.f16487d) {
                    return e();
                }
                return a(C0906R.string.ddt, Integer.valueOf(this.f16489f), e());
            case 2:
                if (1 != this.f16487d) {
                    return a(C0906R.string.de8, new Object[0]);
                }
                return a(C0906R.string.ddu, Integer.valueOf(this.f16489f));
            case 3:
                if (this.f16486c == null) {
                    return "";
                }
                return c.a(this.f16486c) + " " + a(C0906R.string.dec, new Object[0]).trim();
            case 4:
                if (this.f16486c == null) {
                    return "";
                }
                return c.a(this.f16486c) + " " + a(C0906R.string.dee, new Object[0]).trim();
            case 5:
                return c.a(this.f16486c) + " " + a(C0906R.string.dea, new Object[0]);
            case 6:
                return c.a(this.f16486c) + " " + a(C0906R.string.de2, new Object[0]);
            case 8:
                if (this.f16489f > 0) {
                    if (this.h) {
                        str = a(C0906R.string.de1, c.a(this.f16486c), Integer.valueOf(this.f16489f));
                    } else {
                        str = a(C0906R.string.de0, c.a(this.f16486c), Integer.valueOf(this.f16489f));
                    }
                    return str;
                }
                break;
            case 9:
                Object[] objArr = new Object[2];
                if (this.f16486c == null) {
                    str2 = "";
                } else {
                    str2 = c.a(this.f16486c);
                }
                objArr[0] = str2;
                if (this.g == null) {
                    str3 = "";
                } else {
                    str3 = c.a(this.g);
                }
                objArr[1] = str3;
                return a(C0906R.string.ded, objArr);
            case 10:
                Object[] objArr2 = new Object[2];
                if (this.f16486c == null) {
                    str4 = "";
                } else {
                    str4 = c.a(this.f16486c);
                }
                objArr2[0] = str4;
                if (this.g == null) {
                    str5 = "";
                } else {
                    str5 = c.a(this.g);
                }
                objArr2[1] = str5;
                return a(C0906R.string.def, objArr2);
            case 11:
                if (this.f16486c == null) {
                    return "";
                }
                return c.a(this.f16486c) + " " + a(C0906R.string.de6, new Object[0]).trim();
        }
        return "";
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof as) || this.baseMessage.f18777d != ((as) obj).baseMessage.f18777d) {
            return false;
        }
        return true;
    }

    public /* synthetic */ c wrap(Message message) {
        a aVar;
        MemberMessage memberMessage = (MemberMessage) message;
        if (PatchProxy.isSupport(new Object[]{memberMessage}, this, f16484a, false, 11081, new Class[]{MemberMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{memberMessage}, this, f16484a, false, 11081, new Class[]{MemberMessage.class}, c.class);
        }
        as asVar = new as();
        asVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(memberMessage.common);
        asVar.f16488e = (int) ((Long) Wire.get(memberMessage.action, 0L)).longValue();
        asVar.k = memberMessage.action_description;
        asVar.f16485b = (int) ((Long) Wire.get(memberMessage.member_count, 0L)).longValue();
        asVar.j = (int) ((Long) Wire.get(memberMessage.enter_type, 0L)).longValue();
        asVar.i = (int) ((Long) Wire.get(memberMessage.rank_score, 0L)).longValue();
        asVar.h = ((Boolean) Wire.get(memberMessage.is_set_to_admin, Boolean.FALSE)).booleanValue();
        asVar.f16489f = (int) ((Long) Wire.get(memberMessage.top_user_no, 0L)).longValue();
        if (((Boolean) Wire.get(memberMessage.is_top_user, Boolean.FALSE)).booleanValue()) {
            asVar.f16487d = 1;
        } else {
            asVar.f16487d = 0;
        }
        asVar.f16486c = com.bytedance.android.livesdk.message.a.a.a(memberMessage.user);
        asVar.g = com.bytedance.android.livesdk.message.a.a.a(memberMessage.operator);
        MemberMessage.EffectConfig effectConfig = memberMessage.effect_config;
        if (PatchProxy.isSupport(new Object[]{effectConfig}, null, com.bytedance.android.livesdk.message.a.a.f16388a, true, 10978, new Class[]{MemberMessage.EffectConfig.class}, a.class)) {
            aVar = (a) PatchProxy.accessDispatch(new Object[]{effectConfig}, null, com.bytedance.android.livesdk.message.a.a.f16388a, true, 10978, new Class[]{MemberMessage.EffectConfig.class}, a.class);
        } else if (effectConfig == null) {
            aVar = null;
        } else {
            aVar = new a();
            aVar.f16491b = com.bytedance.android.livesdk.message.a.a.a(effectConfig.icon);
            aVar.f16494e = com.bytedance.android.livesdk.message.a.a.a(effectConfig.text_icon);
            aVar.f16492c = com.bytedance.android.livesdk.message.a.a.a(effectConfig.text);
            aVar.f16493d = (int) ((Long) Wire.get(effectConfig.avatar_pos, 0L)).longValue();
            aVar.f16490a = (int) ((Long) Wire.get(effectConfig.type, 0L)).longValue();
            aVar.f16495f = ((Integer) Wire.get(effectConfig.stay_time, 0)).intValue();
        }
        asVar.l = aVar;
        asVar.m = ((Long) Wire.get(memberMessage.user_id, 0L)).longValue();
        asVar.n = (String) Wire.get(memberMessage.pop_str, "");
        return asVar;
    }

    public int compare(Object obj, Object obj2) {
        as asVar = (as) obj;
        as asVar2 = (as) obj2;
        if (asVar.i == asVar2.i) {
            return -1;
        }
        return asVar.i - asVar2.i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a(int r20, java.lang.Object... r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r20)
            r10 = 0
            r3[r10] = r4
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f16484a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8[r10] = r4
            java.lang.Class<java.lang.Object[]> r4 = java.lang.Object[].class
            r8[r11] = r4
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r6 = 0
            r7 = 11078(0x2b46, float:1.5524E-41)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0050
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            r12[r10] = r0
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = f16484a
            r15 = 0
            r16 = 11078(0x2b46, float:1.5524E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r10] = r1
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            r13 = r19
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0050:
            android.content.Context r2 = com.bytedance.android.live.core.utils.ac.e()
            int r3 = r1.length
            if (r3 <= 0) goto L_0x0060
            android.content.res.Resources r2 = r2.getResources()
            java.lang.String r0 = r2.getString(r0, r1)
            return r0
        L_0x0060:
            android.content.res.Resources r1 = r2.getResources()
            java.lang.String r0 = r1.getString(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.message.model.as.a(int, java.lang.Object[]):java.lang.String");
    }
}
