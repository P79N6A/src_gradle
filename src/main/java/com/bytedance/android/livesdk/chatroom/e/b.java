package com.bytedance.android.livesdk.chatroom.e;

import android.text.Spannable;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.model.c;
import com.bytedance.android.livesdkapi.h.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public abstract class b<T extends c> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10012a;

    /* renamed from: b  reason: collision with root package name */
    public T f10013b;

    /* renamed from: c  reason: collision with root package name */
    public int f10014c;

    /* renamed from: d  reason: collision with root package name */
    public int f10015d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10016e;

    /* renamed from: f  reason: collision with root package name */
    public Spannable f10017f;
    protected Spannable g;
    public boolean h;
    public List<ImageModel> i;

    public interface a {
        void a(Spannable spannable);
    }

    public abstract User e();

    public abstract boolean f();

    public String g() {
        return "#3d000000";
    }

    public List<Integer> k() {
        return null;
    }

    public abstract Spannable l();

    public Spannable m() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public final boolean o() {
        if (PatchProxy.isSupport(new Object[0], this, f10012a, false, 5364, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f10012a, false, 5364, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!com.bytedance.android.live.uikit.a.a.f() || (this.f10015d != 1 && (this.f10015d != 2 || this.f10016e))) {
            return false;
        } else {
            return true;
        }
    }

    public final Spannable p() {
        if (PatchProxy.isSupport(new Object[0], this, f10012a, false, 5366, new Class[0], Spannable.class)) {
            return (Spannable) PatchProxy.accessDispatch(new Object[0], this, f10012a, false, 5366, new Class[0], Spannable.class);
        }
        if (this.g == null) {
            this.g = m();
        }
        return this.g;
    }

    public final long q() {
        if (PatchProxy.isSupport(new Object[0], this, f10012a, false, 5367, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f10012a, false, 5367, new Class[0], Long.TYPE)).longValue();
        } else if (e() == null) {
            return 0;
        } else {
            return e().getId();
        }
    }

    public final ImageModel i() {
        if (PatchProxy.isSupport(new Object[0], this, f10012a, false, 5359, new Class[0], ImageModel.class)) {
            return (ImageModel) PatchProxy.accessDispatch(new Object[0], this, f10012a, false, 5359, new Class[0], ImageModel.class);
        } else if (!f() || com.bytedance.android.livesdkapi.a.a.f18615c) {
            return null;
        } else {
            User e2 = e();
            if (e2 == null || e2.getUserHonor() == null) {
                return null;
            }
            return e2.getUserHonor().j();
        }
    }

    public final List<ImageModel> j() {
        if (PatchProxy.isSupport(new Object[0], this, f10012a, false, 5360, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f10012a, false, 5360, new Class[0], List.class);
        } else if (!f()) {
            return null;
        } else {
            User e2 = e();
            if (e2 == null) {
                return null;
            }
            if (this.i != null) {
                return this.i;
            }
            return e2.getNewUserBadges();
        }
    }

    public final Spannable n() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f10012a, false, 5362, new Class[0], Spannable.class)) {
            return (Spannable) PatchProxy.accessDispatch(new Object[0], this, f10012a, false, 5362, new Class[0], Spannable.class);
        }
        if (this.f10017f == null) {
            if (this.f10013b.supportDisplayText()) {
                if (PatchProxy.isSupport(new Object[0], this, f10012a, false, 5363, new Class[0], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f10012a, false, 5363, new Class[0], Boolean.TYPE)).booleanValue();
                } else if (!com.bytedance.android.live.uikit.a.a.f() || this.f10015d != 2 || !this.f10016e) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    if (PatchProxy.isSupport(new Object[0], this, f10012a, false, 5365, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f10012a, false, 5365, new Class[0], Void.TYPE);
                    } else if (!(this.f10013b.baseMessage == null || this.f10013b.baseMessage.j == null)) {
                        e eVar = this.f10013b.baseMessage.j;
                        String str = null;
                        String str2 = eVar.f18783b;
                        if (eVar.f18782a != null) {
                            str = com.bytedance.android.livesdk.i18n.b.a().a(eVar.f18782a);
                        }
                        if (!(str == null && str2 == null)) {
                            if (TextUtils.isEmpty(str)) {
                                str = str2;
                            }
                            this.f10017f = y.a(str, eVar);
                        }
                    }
                }
            }
            this.f10017f = l();
        }
        return this.f10017f;
    }

    public b(T t) {
        this(t, 0);
    }

    public b(T t, int i2) {
        this.f10013b = t;
        this.f10014c = i2;
    }
}
