package com.ss.android.ugc.aweme.filter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.ss.android.ugc.aweme.themechange.base.a;
import com.ss.android.ugc.effectmanager.effect.b.m;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47588a;

    public static List<h> a(Map<EffectCategoryResponse, List<h>> map) {
        if (PatchProxy.isSupport(new Object[]{map}, null, f47588a, true, 44060, new Class[]{Map.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{map}, null, f47588a, true, 44060, new Class[]{Map.class}, List.class);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<EffectCategoryResponse, List<h>> value : map.entrySet()) {
            boolean z = false;
            for (h add : (List) value.getValue()) {
                arrayList.add(add);
                z = true;
            }
            if (z) {
                h hVar = new h();
                hVar.f47599c = "LINE";
                hVar.f47598b = -1;
                arrayList.add(hVar);
            }
        }
        if (arrayList.size() > 0 && ((h) arrayList.get(arrayList.size() - 1)).f47599c.equals("LINE")) {
            arrayList.remove(arrayList.size() - 1);
        }
        return arrayList;
    }

    public static int a(@Nullable EffectFilterAdapter effectFilterAdapter, int i) {
        if (PatchProxy.isSupport(new Object[]{effectFilterAdapter, Integer.valueOf(i)}, null, f47588a, true, 44056, new Class[]{EffectFilterAdapter.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{effectFilterAdapter, Integer.valueOf(i)}, null, f47588a, true, 44056, new Class[]{EffectFilterAdapter.class, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (effectFilterAdapter == null) {
            return 0;
        } else {
            List data = effectFilterAdapter.getData();
            int i2 = 0;
            for (int i3 = 0; i3 < data.size(); i3++) {
                if (i == i2) {
                    return i3;
                }
                if (((h) data.get(i3)).f47599c.equals("LINE")) {
                    i2++;
                }
            }
            return 0;
        }
    }

    public static int b(@Nullable EffectFilterAdapter effectFilterAdapter, int i) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{effectFilterAdapter, Integer.valueOf(i)}, null, f47588a, true, 44057, new Class[]{EffectFilterAdapter.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{effectFilterAdapter, Integer.valueOf(i)}, null, f47588a, true, 44057, new Class[]{EffectFilterAdapter.class, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (effectFilterAdapter == null) {
            return 0;
        } else {
            List data = effectFilterAdapter.getData();
            int i3 = 0;
            while (i2 < data.size() && i2 < i) {
                if (((h) data.get(i2)).f47599c.equals("LINE")) {
                    i3++;
                }
                i2++;
            }
            return i3;
        }
    }

    public static int c(@Nullable EffectFilterAdapter effectFilterAdapter, int i) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{effectFilterAdapter, Integer.valueOf(i)}, null, f47588a, true, 44058, new Class[]{EffectFilterAdapter.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{effectFilterAdapter, Integer.valueOf(i)}, null, f47588a, true, 44058, new Class[]{EffectFilterAdapter.class, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (effectFilterAdapter == null) {
            return 0;
        } else {
            List data = effectFilterAdapter.getData();
            int i3 = 0;
            while (i2 < data.size() && i2 < i) {
                if (((h) data.get(i2)).f47599c.equals("LINE")) {
                    i3++;
                }
                i2++;
            }
            return i3;
        }
    }

    @NonNull
    public static View a(@NonNull Context context, int i, EffectCategoryResponse effectCategoryResponse, as asVar) {
        Context context2 = context;
        EffectCategoryResponse effectCategoryResponse2 = effectCategoryResponse;
        as asVar2 = asVar;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i), effectCategoryResponse2, asVar2}, null, f47588a, true, 44059, new Class[]{Context.class, Integer.TYPE, EffectCategoryResponse.class, as.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i), effectCategoryResponse2, asVar2}, null, f47588a, true, 44059, new Class[]{Context.class, Integer.TYPE, EffectCategoryResponse.class, as.class}, View.class);
        }
        final a a2 = AVDmtTabLayout.w.a(context2);
        if (PatchProxy.isSupport(new Object[0], a2, a.f74579a, false, 86816, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a2, a.f74579a, false, 86816, new Class[0], Void.TYPE);
        } else {
            int dip2Px = (int) UIUtils.dip2Px(a2.getContext(), 4.0f);
            a2.setPadding(dip2Px, 0, dip2Px, 0);
        }
        if (TextUtils.isEmpty(effectCategoryResponse2.icon_normal_url)) {
            a2.setText(effectCategoryResponse2.name);
        } else {
            a2.a(effectCategoryResponse2.icon_normal_url, 0);
        }
        if (!(asVar2 == null || i == 0)) {
            asVar2.a(effectCategoryResponse2.id, effectCategoryResponse2.tags, effectCategoryResponse2.tagsUpdateTime, new m() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f47589a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f47589a, false, 44061, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f47589a, false, 44061, new Class[0], Void.TYPE);
                        return;
                    }
                    a2.b(true);
                }

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f47589a, false, 44062, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f47589a, false, 44062, new Class[0], Void.TYPE);
                        return;
                    }
                    a2.b(false);
                }
            });
        }
        return a2;
    }
}
