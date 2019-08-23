package com.bytedance.android.livesdk.effect;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.effect.j;
import com.bytedance.android.livesdk.effect.model.FilterModel;
import com.bytedance.android.livesdk.j.a;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.a.a.b;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;

public final class f implements j.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13767a;

    /* renamed from: b  reason: collision with root package name */
    public List<FilterModel> f13768b = j.a().f13785b;

    /* renamed from: c  reason: collision with root package name */
    public b f13769c;

    /* renamed from: d  reason: collision with root package name */
    private ValueAnimator f13770d;

    public final void a(String str, HashMap<String, String> hashMap) {
        if (PatchProxy.isSupport(new Object[]{str, hashMap}, this, f13767a, false, 8165, new Class[]{String.class, HashMap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, hashMap}, this, f13767a, false, 8165, new Class[]{String.class, HashMap.class}, Void.TYPE);
            return;
        }
        int a2 = a();
        int i = a2 + 1;
        if (i >= this.f13768b.size()) {
            i = 0;
        }
        FilterModel filterModel = this.f13768b.get(i);
        if (!j.a().b(filterModel)) {
            if (!j.a().c(filterModel)) {
                j.a().a(filterModel);
            }
            return;
        }
        hashMap.put("filter_id", filterModel.getFilterId());
        a.a().a("live_take_filter_select", hashMap, new com.bytedance.android.livesdk.j.c.j().b("live_take").a(str).g("draw").f("click"));
        a(true, a2, i, 1);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f13767a, false, 8169, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f13767a, false, 8169, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            this.f13768b = j.a().f13785b;
        }
    }

    public final String b() {
        if (!PatchProxy.isSupport(new Object[0], this, f13767a, false, 8161, new Class[0], String.class)) {
            return this.f13768b.get(a()).getFilterId();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f13767a, false, 8161, new Class[0], String.class);
    }

    public final String c() {
        if (!PatchProxy.isSupport(new Object[0], this, f13767a, false, 8162, new Class[0], String.class)) {
            return this.f13768b.get(a()).getName();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f13767a, false, 8162, new Class[0], String.class);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f13767a, false, 8168, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13767a, false, 8168, new Class[0], Void.TYPE);
            return;
        }
        j.a().b((j.a) this);
    }

    public final int a() {
        if (PatchProxy.isSupport(new Object[0], this, f13767a, false, 8159, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f13767a, false, 8159, new Class[0], Integer.TYPE)).intValue();
        }
        int intValue = ((Integer) com.bytedance.android.livesdk.w.b.E.a()).intValue();
        if (intValue < this.f13768b.size() && intValue >= 0) {
            return intValue;
        }
        com.bytedance.android.livesdk.w.b.E.a(0);
        com.bytedance.android.livesdk.u.a.a().a((Object) new com.bytedance.android.livesdk.effect.a.a(0));
        return 0;
    }

    public f(com.ss.ugc.live.a.a aVar) {
        String str;
        j.a().c();
        j.a().a((j.a) this);
        this.f13769c = new b();
        aVar.a((com.ss.ugc.live.a.a.a) this.f13769c);
        try {
            if (PatchProxy.isSupport(new Object[0], this, f13767a, false, 8158, new Class[0], String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[0], this, f13767a, false, 8158, new Class[0], String.class);
            } else if (a() == 0) {
                str = "";
            } else {
                str = this.f13768b.get(a()).getFilterPath();
            }
            if (TextUtils.isEmpty(str)) {
                com.bytedance.android.live.core.c.a.a("LiveFilterHelper", "FilterEffect unset");
                this.f13769c.a();
            } else {
                com.bytedance.android.live.core.c.a.a("LiveFilterHelper", "FilterEffect update file:" + str);
                this.f13769c.a(str);
            }
            if (com.bytedance.android.live.uikit.a.a.a()) {
                a(a());
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static void a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f13767a, true, 8170, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f13767a, true, 8170, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        TTLiveSDKContext.getHostService().b();
        int intValue = ((Integer) com.bytedance.android.livesdk.w.b.E.a()).intValue();
        if (intValue < j.a().f13785b.size()) {
            ((RoomRetrofitApi) com.bytedance.android.livesdk.v.j.q().d().a(RoomRetrofitApi.class)).uploadBeautyParams(j, j.a().f13785b.get(intValue).getName(), (int) (((Float) com.bytedance.android.livesdk.w.b.F.a()).floatValue() * 100.0f), (int) (((Float) com.bytedance.android.livesdk.w.b.G.a()).floatValue() * 100.0f), (int) (((Float) com.bytedance.android.livesdk.w.b.H.a()).floatValue() * 100.0f), (int) (((Float) com.bytedance.android.livesdk.w.b.I.a()).floatValue() * 100.0f)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(h.f13780b, i.f13782b);
        }
    }

    public final void a(int i) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f13767a, false, 8163, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f13767a, false, 8163, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        int a2 = a();
        if (i >= 0 && i < this.f13768b.size()) {
            if (!j.a().b(this.f13768b.get(i))) {
                if (!j.a().c(this.f13768b.get(i))) {
                    j.a().a(this.f13768b.get(i));
                }
                return;
            }
            if (i > a2) {
                i2 = 1;
            }
            a(true, a2, i, i2);
        }
    }

    public static float a(List<FilterModel> list, int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, null, f13767a, true, 8171, new Class[]{List.class, Integer.TYPE}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, null, f13767a, true, 8171, new Class[]{List.class, Integer.TYPE}, Float.TYPE)).floatValue();
        }
        if (!Lists.isEmpty(list) && i2 >= 0 && i2 < list.size()) {
            FilterModel filterModel = list.get(i);
            if (filterModel.getTags() != null) {
                for (String split : filterModel.getTags()) {
                    String[] split2 = split.split(":");
                    if (split2.length == 2 && split2[0].equals("white")) {
                        try {
                            return (float) Integer.valueOf(split2[1]).intValue();
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            }
        }
        return 100.0f;
    }

    public final void b(String str, HashMap<String, String> hashMap) {
        if (PatchProxy.isSupport(new Object[]{str, hashMap}, this, f13767a, false, 8167, new Class[]{String.class, HashMap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, hashMap}, this, f13767a, false, 8167, new Class[]{String.class, HashMap.class}, Void.TYPE);
            return;
        }
        int a2 = a();
        int i = a2 - 1;
        if (i < 0) {
            i = this.f13768b.size() - 1;
        }
        FilterModel filterModel = this.f13768b.get(i);
        if (!j.a().b(filterModel)) {
            if (!j.a().c(filterModel)) {
                j.a().a(filterModel);
            }
            return;
        }
        hashMap.put("filter_id", filterModel.getFilterId());
        a.a().a("live_take_filter_select", hashMap, new com.bytedance.android.livesdk.j.c.j().b("live_take").a(str).g("draw").f("click"));
        a(true, a2, i, 0);
    }

    private void a(boolean z, int i, int i2, int i3) {
        int i4 = i;
        final int i5 = i2;
        if (PatchProxy.isSupport(new Object[]{(byte) 1, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f13767a, false, 8160, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f13767a, false, 8160, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (i4 < this.f13768b.size() && i5 < this.f13768b.size()) {
            if (this.f13770d != null && this.f13770d.isRunning()) {
                this.f13770d.cancel();
            }
            this.f13770d = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.f13770d.setDuration(600);
            this.f13770d.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f13770d.addUpdateListener(new g(this, i3, i5, i4));
            this.f13770d.addListener(new AnimatorListenerAdapter() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f13771a;

                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f13771a, false, 8175, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f13771a, false, 8175, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    try {
                        if (i5 == 0) {
                            com.bytedance.android.live.core.c.a.a("LiveFilterHelper", "FilterEffect unset");
                            f.this.f13769c.a();
                            return;
                        }
                        com.bytedance.android.live.core.c.a.a("LiveFilterHelper", "FilterEffect update file:" + f.this.f13768b.get(i5).getFilterPath());
                        f.this.f13769c.a(f.this.f13768b.get(i5).getFilterPath());
                    } catch (FileNotFoundException unused) {
                    }
                }
            });
            com.bytedance.android.livesdk.w.b.E.a(Integer.valueOf(i2));
            com.bytedance.android.livesdk.u.a.a().a((Object) new com.bytedance.android.livesdk.effect.a.a(i5));
            this.f13770d.start();
        }
    }
}
