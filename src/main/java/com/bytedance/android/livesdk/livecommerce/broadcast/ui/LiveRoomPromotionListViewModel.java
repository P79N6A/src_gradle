package com.bytedance.android.livesdk.livecommerce.broadcast.ui;

import android.app.Activity;
import android.arch.core.util.Function;
import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livecommerce.b;
import com.bytedance.android.livesdk.livecommerce.base.ECBaseViewModel;
import com.bytedance.android.livesdk.livecommerce.broadcast.adapter.IronLivePromotionViewHolder;
import com.bytedance.android.livesdk.livecommerce.broadcast.adapter.LiveRoomPromotionViewHolder;
import com.bytedance.android.livesdk.livecommerce.c.c;
import com.bytedance.android.livesdk.livecommerce.c.e;
import com.bytedance.android.livesdk.livecommerce.d.h;
import com.bytedance.android.livesdk.livecommerce.d.k;
import com.bytedance.android.livesdk.livecommerce.f.a;
import com.bytedance.android.livesdkapi.d.g;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;

public class LiveRoomPromotionListViewModel extends ECBaseViewModel implements b.a, IronLivePromotionViewHolder.a, LiveRoomPromotionViewHolder.a {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f16083f;
    public com.bytedance.android.livesdk.livecommerce.broadcast.b g = new com.bytedance.android.livesdk.livecommerce.broadcast.b();
    public boolean h = false;
    public String i;
    public String j;
    public boolean k;
    private MutableLiveData<Void> l;
    private MutableLiveData<Void> m;
    private MutableLiveData<Void> n;
    private MutableLiveData<c> o;

    public final boolean j_() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public void a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f16083f, false, 10608, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f16083f, false, 10608, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        c().postValue(null);
        b.a().a(str3, str4, (k<h>) new k<h>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f16084a;

            public final void a(Throwable th) {
                if (PatchProxy.isSupport(new Object[]{th}, this, f16084a, false, 10622, new Class[]{Throwable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{th}, this, f16084a, false, 10622, new Class[]{Throwable.class}, Void.TYPE);
                    return;
                }
                LiveRoomPromotionListViewModel.this.e().postValue(null);
            }

            public final /* synthetic */ void a(Object obj) {
                h hVar = (h) obj;
                int i = 0;
                if (PatchProxy.isSupport(new Object[]{hVar}, this, f16084a, false, 10621, new Class[]{h.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{hVar}, this, f16084a, false, 10621, new Class[]{h.class}, Void.TYPE);
                    return;
                }
                if (hVar != null && !CollectionUtils.isEmpty(hVar.f16166c)) {
                    com.bytedance.android.livesdk.livecommerce.broadcast.b bVar = LiveRoomPromotionListViewModel.this.g;
                    if (PatchProxy.isSupport(new Object[]{hVar}, bVar, com.bytedance.android.livesdk.livecommerce.broadcast.b.f16027a, false, 10477, new Class[]{h.class}, Void.TYPE)) {
                        com.bytedance.android.livesdk.livecommerce.broadcast.b bVar2 = bVar;
                        PatchProxy.accessDispatch(new Object[]{hVar}, bVar2, com.bytedance.android.livesdk.livecommerce.broadcast.b.f16027a, false, 10477, new Class[]{h.class}, Void.TYPE);
                    } else if (hVar != null) {
                        bVar.f16029c = hVar.f16167d;
                        if (hVar.f16166c != null) {
                            bVar.f16028b.clear();
                            int size = hVar.f16166c.size();
                            while (i < size) {
                                e a2 = a.a(hVar.f16166c.get(i));
                                i++;
                                a2.h = i;
                                bVar.f16028b.add(a2);
                            }
                        }
                    }
                }
                LiveRoomPromotionListViewModel.this.f().postValue(null);
                LiveRoomPromotionListViewModel.this.d().postValue(null);
            }
        });
    }

    public final void a(boolean z, final k<Void> kVar) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), kVar}, this, f16083f, false, 10612, new Class[]{Boolean.TYPE, k.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), kVar}, this, f16083f, false, 10612, new Class[]{Boolean.TYPE, k.class}, Void.TYPE);
        } else if (z) {
            this.h = true;
        } else {
            b.a().a(a.a(this.g.f16028b, (Function<T, String>) new Function<e, String>() {
                public final /* bridge */ /* synthetic */ Object apply(Object obj) {
                    return ((e) obj).m;
                }
            }), (k<Void>) new k<Void>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f16087a;

                public final void a(Throwable th) {
                    if (PatchProxy.isSupport(new Object[]{th}, this, f16087a, false, 10624, new Class[]{Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{th}, this, f16087a, false, 10624, new Class[]{Throwable.class}, Void.TYPE);
                        return;
                    }
                    if (kVar != null) {
                        kVar.a(th);
                    }
                }

                public final /* synthetic */ void a(Object obj) {
                    Void voidR = (Void) obj;
                    if (PatchProxy.isSupport(new Object[]{voidR}, this, f16087a, false, 10623, new Class[]{Void.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{voidR}, this, f16087a, false, 10623, new Class[]{Void.class}, Void.TYPE);
                        return;
                    }
                    LiveRoomPromotionListViewModel.this.h = false;
                    LiveRoomPromotionListViewModel.this.g.a();
                    if (kVar != null) {
                        kVar.a(voidR);
                    }
                }
            });
        }
    }

    public final String a() {
        return this.g.f16029c;
    }

    public final MutableLiveData<Void> f() {
        if (PatchProxy.isSupport(new Object[0], this, f16083f, false, 10601, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f16083f, false, 10601, new Class[0], MutableLiveData.class);
        }
        if (this.l == null) {
            this.l = new MutableLiveData<>();
        }
        return this.l;
    }

    public final MutableLiveData<Void> g() {
        if (PatchProxy.isSupport(new Object[0], this, f16083f, false, 10602, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f16083f, false, 10602, new Class[0], MutableLiveData.class);
        }
        if (this.m == null) {
            this.m = new MutableLiveData<>();
        }
        return this.m;
    }

    public final MutableLiveData<Void> h() {
        if (PatchProxy.isSupport(new Object[0], this, f16083f, false, 10603, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f16083f, false, 10603, new Class[0], MutableLiveData.class);
        }
        if (this.n == null) {
            this.n = new MutableLiveData<>();
        }
        return this.n;
    }

    public final MutableLiveData<c> i() {
        if (PatchProxy.isSupport(new Object[0], this, f16083f, false, 10604, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f16083f, false, 10604, new Class[0], MutableLiveData.class);
        }
        if (this.o == null) {
            this.o = new MutableLiveData<>();
        }
        return this.o;
    }

    public void onCleared() {
        if (PatchProxy.isSupport(new Object[0], this, f16083f, false, 10619, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16083f, false, 10619, new Class[0], Void.TYPE);
            return;
        }
        super.onCleared();
        b a2 = b.a();
        if (!a2.b()) {
            if (PatchProxy.isSupport(new Object[]{this}, a2, b.f15902a, false, 10410, new Class[]{b.a.class}, Void.TYPE)) {
                Object[] objArr = {this};
                b bVar = a2;
                PatchProxy.accessDispatch(objArr, bVar, b.f15902a, false, 10410, new Class[]{b.a.class}, Void.TYPE);
            } else if (a2.m != null) {
                a2.m.remove(this);
            }
        }
    }

    public final void a(com.bytedance.android.livesdkapi.d.h hVar) {
        String str;
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f16083f, false, 10620, new Class[]{com.bytedance.android.livesdkapi.d.h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, f16083f, false, 10620, new Class[]{com.bytedance.android.livesdkapi.d.h.class}, Void.TYPE);
            return;
        }
        if (hVar != null) {
            if (hVar.a() == 2) {
                com.bytedance.android.livesdk.livecommerce.broadcast.b bVar = this.g;
                if (hVar.b() > 0) {
                    str = String.valueOf(hVar.b());
                } else {
                    str = null;
                }
                bVar.f16029c = str;
                f().postValue(null);
            } else if (hVar.a() == 3) {
                this.g.f16029c = null;
                f().postValue(null);
            }
        }
    }

    public final void a(int i2, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str}, this, f16083f, false, 10614, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str}, this, f16083f, false, 10614, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{str}, this, f16083f, false, 10616, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f16083f, false, 10616, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g.a(str);
        }
        h().postValue(null);
    }

    public final void a(Context context, e eVar) {
        g gVar;
        Context context2 = context;
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{context2, eVar2}, this, f16083f, false, 10611, new Class[]{Context.class, e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, eVar2}, this, f16083f, false, 10611, new Class[]{Context.class, e.class}, Void.TYPE);
            return;
        }
        if (eVar2 != null) {
            String str = this.i;
            String str2 = this.j;
            String str3 = eVar2.m;
            String str4 = eVar2.k;
            com.bytedance.android.livesdk.livecommerce.a.b bVar = new com.bytedance.android.livesdk.livecommerce.a.b(str, str2, str3, str4, "click_live_list_card", eVar2.l, b.a().g(), a.b());
            bVar.a();
            b a2 = b.a();
            if (PatchProxy.isSupport(new Object[]{eVar2}, a2, b.f15902a, false, 10417, new Class[]{e.class}, Void.TYPE)) {
                Object[] objArr = {eVar2};
                b bVar2 = a2;
                PatchProxy.accessDispatch(objArr, bVar2, b.f15902a, false, 10417, new Class[]{e.class}, Void.TYPE);
            } else {
                if (PatchProxy.isSupport(new Object[0], a2, b.f15902a, false, 10386, new Class[0], g.class)) {
                    gVar = (g) PatchProxy.accessDispatch(new Object[0], a2, b.f15902a, false, 10386, new Class[0], g.class);
                } else if (a2.g != null) {
                    gVar = (g) a2.g.get();
                } else {
                    gVar = null;
                }
                if (!(gVar == null || eVar2 == null)) {
                    gVar.a(eVar2.m, eVar2.k, eVar.a());
                }
            }
        }
        if ((context2 instanceof Activity) && eVar2 != null && eVar.a()) {
            a.a(context2, eVar2.f16131f);
            b.a().a(this.j, this.i, eVar2.m);
        }
    }

    public final void a(int i2, String str, boolean z) {
        int i3;
        int i4 = i2;
        String str2 = str;
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f16083f, false, 10615, new Class[]{Integer.TYPE, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str2, Byte.valueOf(z)}, this, f16083f, false, 10615, new Class[]{Integer.TYPE, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        List<e> list = this.g.f16028b;
        if (list != null) {
            int size = list.size();
            if ((i4 != 0 || !z2) && (i4 != size - 1 || z2)) {
                this.g.a(i4, str2, z2);
                MutableLiveData<c> i5 = i();
                if (z2) {
                    i3 = i4 - 1;
                } else {
                    i3 = i4 + 1;
                }
                i5.postValue(new c(i4, i3));
            }
        }
    }

    public final void a(Context context, boolean z, String str, String str2) {
        final Context context2 = context;
        final String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, Byte.valueOf(z ? (byte) 1 : 0), str3, str4}, this, f16083f, false, 10613, new Class[]{Context.class, Boolean.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Byte.valueOf(z), str3, str4}, this, f16083f, false, 10613, new Class[]{Context.class, Boolean.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        if (z) {
            new com.bytedance.android.livesdk.livecommerce.a.g(this.j, str3, str4).a();
            b a2 = b.a();
            AnonymousClass4 r1 = new k<Void>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f16090a;

                public final /* synthetic */ void a(Object obj) {
                    Void voidR = (Void) obj;
                    if (PatchProxy.isSupport(new Object[]{voidR}, this, f16090a, false, 10625, new Class[]{Void.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{voidR}, this, f16090a, false, 10625, new Class[]{Void.class}, Void.TYPE);
                        return;
                    }
                    LiveRoomPromotionListViewModel.this.g.f16029c = str3;
                    LiveRoomPromotionListViewModel.this.f().postValue(null);
                }

                public final void a(Throwable th) {
                    if (PatchProxy.isSupport(new Object[]{th}, this, f16090a, false, 10626, new Class[]{Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{th}, this, f16090a, false, 10626, new Class[]{Throwable.class}, Void.TYPE);
                        return;
                    }
                    String message = th.getMessage();
                    if (TextUtils.isEmpty(message) && context2 != null) {
                        message = context2.getResources().getString(C0906R.string.a9m);
                    }
                    LiveRoomPromotionListViewModel.this.a(message);
                }
            };
            if (PatchProxy.isSupport(new Object[]{str3, r1}, a2, b.f15902a, false, 10407, new Class[]{String.class, k.class}, Void.TYPE)) {
                b bVar = a2;
                PatchProxy.accessDispatch(new Object[]{str3, r1}, bVar, b.f15902a, false, 10407, new Class[]{String.class, k.class}, Void.TYPE);
            } else {
                a2.a(str3, false, (k<Void>) r1);
            }
        } else {
            b a3 = b.a();
            AnonymousClass5 r0 = new k<Void>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f16094a;

                public final /* synthetic */ void a(Object obj) {
                    Void voidR = (Void) obj;
                    if (PatchProxy.isSupport(new Object[]{voidR}, this, f16094a, false, 10627, new Class[]{Void.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{voidR}, this, f16094a, false, 10627, new Class[]{Void.class}, Void.TYPE);
                        return;
                    }
                    LiveRoomPromotionListViewModel.this.g.f16029c = null;
                    LiveRoomPromotionListViewModel.this.f().postValue(null);
                }

                public final void a(Throwable th) {
                    if (PatchProxy.isSupport(new Object[]{th}, this, f16094a, false, 10628, new Class[]{Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{th}, this, f16094a, false, 10628, new Class[]{Throwable.class}, Void.TYPE);
                        return;
                    }
                    String message = th.getMessage();
                    if (TextUtils.isEmpty(message) && context2 != null) {
                        message = context2.getResources().getString(C0906R.string.a9m);
                    }
                    LiveRoomPromotionListViewModel.this.a(message);
                }
            };
            if (PatchProxy.isSupport(new Object[]{r0}, a3, b.f15902a, false, 10408, new Class[]{k.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{r0}, a3, b.f15902a, false, 10408, new Class[]{k.class}, Void.TYPE);
                return;
            }
            a3.a("", true, (k<Void>) r0);
        }
    }
}
