package com.bytedance.android.livesdk.gift.effect.entry.e;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.effect.entry.model.BaseUserMessage;
import com.bytedance.android.livesdk.message.model.as;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14846a;

    /* renamed from: b  reason: collision with root package name */
    public long f14847b;

    /* renamed from: c  reason: collision with root package name */
    public String f14848c;

    /* renamed from: d  reason: collision with root package name */
    public int f14849d;

    /* renamed from: e  reason: collision with root package name */
    public String f14850e;

    /* renamed from: f  reason: collision with root package name */
    public String f14851f;
    public int g;
    public String h;
    public String i;
    @BaseUserMessage.EnterTypeGrade
    public int j;
    @BaseUserMessage.TopDesc
    public int k;
    public as.a l;
    public long m;
    public String n;
    public ImageModel o;
    public int p;
    public int q;

    public final boolean b() {
        as.a aVar = this.l;
        if (aVar == null || aVar.f16490a != 3) {
            return false;
        }
        return true;
    }

    private boolean d() {
        if (this.g < 10) {
            return false;
        }
        if (this.g >= 35) {
            return true;
        }
        if (this.g < 20) {
            if (this.q < 100) {
                return true;
            }
            return false;
        } else if (this.g < 28) {
            if (this.q < 500) {
                return true;
            }
            return false;
        } else if (this.q < 1000) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean c() {
        if (this.g < 6) {
            return false;
        }
        if (this.g > 9) {
            return true;
        }
        switch (this.g) {
            case 6:
                if (this.q < 1000) {
                    return true;
                }
                return false;
            case e.l /*?: ONE_ARG  (7 int)*/:
            case 8:
                if (this.q < 10000) {
                    return true;
                }
                return false;
            case 9:
                if (this.q < 100000) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f14846a, false, 9465, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f14846a, false, 9465, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (com.bytedance.android.live.uikit.a.a.a()) {
            if ((this.p != 1 || this.m < 10) && !c()) {
                return false;
            }
            return true;
        } else if (!com.bytedance.android.live.uikit.a.a.f()) {
            return false;
        } else {
            if (this.l != null || d()) {
                return true;
            }
            return false;
        }
    }

    public final a a(int i2) {
        this.p = i2;
        return this;
    }

    public final a b(int i2) {
        this.f14849d = i2;
        return this;
    }

    public final a c(int i2) {
        this.g = i2;
        return this;
    }

    public final a d(int i2) {
        this.j = i2;
        return this;
    }

    public final a e(int i2) {
        this.k = i2;
        return this;
    }

    public final a a(long j2) {
        this.m = j2;
        return this;
    }

    public final a b(String str) {
        this.f14851f = str;
        return this;
    }

    public final a c(String str) {
        this.h = str;
        return this;
    }

    public final a d(String str) {
        this.i = str;
        return this;
    }

    public final a a(ImageModel imageModel) {
        this.o = imageModel;
        return this;
    }

    public final a a(as.a aVar) {
        this.l = aVar;
        return this;
    }

    public final a a(String str) {
        this.n = str;
        return this;
    }

    public a(long j2, String str, String str2) {
        this(j2, str, str2, "");
    }

    private a(long j2, String str, String str2, String str3) {
        this.f14847b = j2;
        this.f14848c = str;
        this.f14850e = str2;
        this.f14851f = str3;
    }
}
