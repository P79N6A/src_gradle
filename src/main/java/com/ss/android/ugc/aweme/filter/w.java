package com.ss.android.ugc.aweme.filter;

import a.i;
import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.common.utility.Lists;
import com.crashlytics.android.Crashlytics;
import com.google.common.collect.ay;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.medialib.f.e;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.g.a;
import com.ss.android.ugc.aweme.effect.base.EffectDownloadState;
import com.ss.android.ugc.aweme.port.internal.m;
import com.ss.android.ugc.aweme.shortvideo.ff;
import com.ss.android.ugc.aweme.shortvideo.util.ag;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47662a;

    static final /* synthetic */ Void b() throws Exception {
        try {
            aa.a().i();
        } catch (Throwable th) {
            Crashlytics.logException(th);
        }
        return null;
    }

    @MeasureFunction
    public static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f47662a, true, 44272, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f47662a, true, 44272, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], null, f47662a, true, 44273, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f47662a, true, 44273, new Class[0], Void.TYPE);
        } else {
            ag.a();
            m mVar = (m) a.a(GlobalContext.getContext(), m.class);
            int c2 = com.ss.android.ugc.aweme.port.in.a.f61121d.c();
            if (c2 != mVar.a()) {
                if (PatchProxy.isSupport(new Object[]{(byte) 1}, null, ag.f71103a, true, 81034, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{(byte) 1}, null, ag.f71103a, true, 81034, new Class[]{Boolean.TYPE}, Void.TYPE);
                } else {
                    ag.a();
                    if (PatchProxy.isSupport(new Object[]{(byte) 1}, null, ag.f71103a, true, 81037, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{(byte) 1}, null, ag.f71103a, true, 81037, new Class[]{Boolean.TYPE}, Void.TYPE);
                    } else {
                        ag.a();
                        Context context = GlobalContext.getContext();
                        new e().a(context, au.filters, ff.f67717f);
                        new e().a(context, (int) C0906R.raw.beautify_filter, ff.s);
                    }
                    ag.b();
                }
                mVar.a(c2);
            }
        }
        i.a(x.f47670b);
    }

    @Deprecated
    public static String b(int i) {
        h a2 = a(i);
        if (a2 != null) {
            return a2.f47600d;
        }
        return "";
    }

    @Deprecated
    public static String c(int i) {
        h a2 = a(i);
        if (a2 != null) {
            return a2.i;
        }
        return "";
    }

    @Deprecated
    public static String d(int i) {
        h a2 = a(i);
        if (a2 != null) {
            return a2.j;
        }
        return "";
    }

    @EffectDownloadState.State
    public static int a(@NonNull h hVar) {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2}, null, f47662a, true, 44278, new Class[]{h.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{hVar2}, null, f47662a, true, 44278, new Class[]{h.class}, Integer.TYPE)).intValue();
        } else if (hVar2 == null) {
            return 0;
        } else {
            if (hVar2.f47598b < 0) {
                return 1;
            }
            com.ss.android.ugc.aweme.effect.c.a c2 = aa.a().c();
            if (c2.b(hVar2) || c2.c(hVar2)) {
                return 2;
            }
            if (v.a().c(hVar2.f47598b)) {
                return 1;
            }
            return 0;
        }
    }

    public static String b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f47662a, true, 44285, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f47662a, true, 44285, new Class[]{String.class}, String.class);
        }
        String str3 = "";
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        File file = new File(str2);
        if (file.exists() && file.isFile()) {
            File parentFile = file.getParentFile().getParentFile();
            if (parentFile != null && parentFile.exists() && parentFile.isDirectory()) {
                str3 = parentFile.getAbsolutePath();
            }
        }
        return str3;
    }

    public static void d(h hVar) {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2}, null, f47662a, true, 44282, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2}, null, f47662a, true, 44282, new Class[]{h.class}, Void.TYPE);
        } else if (hVar2 != null) {
            String a2 = v.a().a(hVar2);
            if (TextUtils.isEmpty(hVar2.i)) {
                hVar2.i = a(a2);
            }
            if (TextUtils.isEmpty(hVar2.j)) {
                hVar2.j = b(hVar2.i);
            }
            if (TextUtils.isEmpty(hVar2.h)) {
                hVar2.h = a2 + "thumbnail.jpg";
            }
        }
    }

    @Nullable
    public static h e(@NonNull h hVar) {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2}, null, f47662a, true, 44286, new Class[]{h.class}, h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[]{hVar2}, null, f47662a, true, 44286, new Class[]{h.class}, h.class);
        } else if (hVar2 == null) {
            return null;
        } else {
            h hVar3 = new h();
            hVar3.f47600d = hVar2.f47600d;
            hVar3.i = hVar2.i;
            hVar3.j = hVar2.j;
            hVar3.f47598b = hVar2.f47598b;
            hVar3.f47599c = hVar2.f47599c;
            hVar3.f47601e = hVar2.f47601e;
            hVar3.h = hVar2.h;
            hVar3.g = hVar2.g;
            hVar3.k = hVar.a();
            return hVar3;
        }
    }

    public static h a(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f47662a, true, 44274, new Class[]{Integer.TYPE}, h.class)) {
            return y.a(i);
        }
        return (h) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f47662a, true, 44274, new Class[]{Integer.TYPE}, h.class);
    }

    public static boolean b(h hVar) {
        if (PatchProxy.isSupport(new Object[]{hVar}, null, f47662a, true, 44279, new Class[]{h.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{hVar}, null, f47662a, true, 44279, new Class[]{h.class}, Boolean.TYPE)).booleanValue();
        } else if (hVar != null && 1 == a(hVar)) {
            return true;
        } else {
            return false;
        }
    }

    @Nullable
    public static String a(@Nullable Effect effect) {
        if (PatchProxy.isSupport(new Object[]{effect}, null, f47662a, true, 44277, new Class[]{Effect.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{effect}, null, f47662a, true, 44277, new Class[]{Effect.class}, String.class);
        } else if (effect == null) {
            return null;
        } else {
            List<String> tags = effect.getTags();
            if (Lists.isEmpty(tags)) {
                return null;
            }
            for (String next : tags) {
                if (next.startsWith("pinyin:")) {
                    return next.substring(7);
                }
            }
            return null;
        }
    }

    @MainThread
    public static void c(@NonNull h hVar) {
        h hVar2 = hVar;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{hVar2}, null, f47662a, true, 44280, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2}, null, f47662a, true, 44280, new Class[]{h.class}, Void.TYPE);
        } else if (hVar2 != null && !Lists.isEmpty((List) com.ss.android.ugc.aweme.port.in.a.d().f47502c.getValue())) {
            com.ss.android.ugc.aweme.filter.b.a aVar = new com.ss.android.ugc.aweme.filter.b.a((List) com.ss.android.ugc.aweme.port.in.a.d().a().getValue());
            if (PatchProxy.isSupport(new Object[]{hVar2}, aVar, com.ss.android.ugc.aweme.filter.b.a.f47550a, false, 44452, new Class[]{h.class}, Void.TYPE)) {
                com.ss.android.ugc.aweme.filter.b.a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{hVar2}, aVar2, com.ss.android.ugc.aweme.filter.b.a.f47550a, false, 44452, new Class[]{h.class}, Void.TYPE);
            } else if (hVar2 != null) {
                List<h> list = aVar.f47551b;
                if (PatchProxy.isSupport(new Object[]{list, hVar2}, aVar, com.ss.android.ugc.aweme.filter.b.a.f47550a, false, 44453, new Class[]{List.class, h.class}, Boolean.TYPE)) {
                    com.ss.android.ugc.aweme.filter.b.a aVar3 = aVar;
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{list, hVar2}, aVar3, com.ss.android.ugc.aweme.filter.b.a.f47550a, false, 44453, new Class[]{List.class, h.class}, Boolean.TYPE)).booleanValue();
                } else if (list != null && hVar2 != null) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((h) it2.next()).f47598b == hVar2.f47598b) {
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                }
                if (!z) {
                    an d2 = com.ss.android.ugc.aweme.port.in.a.d();
                    Intrinsics.checkExpressionValueIsNotNull(d2, "AVEnv.getFilterSources()");
                    MutableLiveData<ay<EffectCategoryResponse, h>> mutableLiveData = d2.f47504e;
                    Intrinsics.checkExpressionValueIsNotNull(mutableLiveData, "AVEnv.getFilterSources().categoryMultimapSources");
                    ay ayVar = (ay) mutableLiveData.getValue();
                    if (ayVar != null) {
                        Intrinsics.checkExpressionValueIsNotNull(ayVar, "AVEnv.getFilterSources()…apSources.value ?: return");
                        Collection values = ayVar.values();
                        Intrinsics.checkExpressionValueIsNotNull(values, "categorySources.values()");
                        Collection arrayList = new ArrayList();
                        for (Object next : CollectionsKt.toList(values)) {
                            if (b((h) next)) {
                                arrayList.add(next);
                            }
                        }
                        an d3 = com.ss.android.ugc.aweme.port.in.a.d();
                        Intrinsics.checkExpressionValueIsNotNull(d3, "AVEnv.getFilterSources()");
                        MutableLiveData a2 = d3.a();
                        Intrinsics.checkExpressionValueIsNotNull(a2, "AVEnv.getFilterSources().preparedFilterSources");
                        a2.setValue((List) arrayList);
                    }
                }
            }
        }
    }

    public static String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f47662a, true, 44284, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f47662a, true, 44284, new Class[]{String.class}, String.class);
        }
        String str3 = "";
        File file = new File(str2);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return str3;
            }
            String str4 = str3;
            for (File file2 : listFiles) {
                if (file2 != null && file2.isDirectory()) {
                    String name = file2.getName();
                    File[] listFiles2 = file2.listFiles();
                    if (listFiles2 != null) {
                        int length = listFiles2.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            File file3 = listFiles2[i];
                            if (file3 != null && file3.isFile()) {
                                if (file3.getName().equals(name + ".png")) {
                                    str4 = file3.getAbsolutePath();
                                    break;
                                }
                            }
                            i++;
                        }
                    }
                }
            }
            str3 = str4;
        }
        return str3;
    }
}
