package com.bytedance.android.livesdk.gift.assets;

import android.support.v4.util.LongSparseArray;
import com.bytedance.android.live.core.d.e;
import com.bytedance.android.livesdk.chatroom.f.a;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.assets.h;
import com.bytedance.android.livesdk.gift.o;
import com.bytedance.android.livesdk.utils.m;
import com.bytedance.android.livesdk.w.b;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.b.a.d;
import com.ss.ugc.live.b.a.f;
import com.ss.ugc.live.b.a.g;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class c implements h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14720a;

    /* renamed from: b  reason: collision with root package name */
    final List<h.a> f14721b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    final LongSparseArray<Long> f14722c = new LongSparseArray<>();

    /* renamed from: d  reason: collision with root package name */
    List<AssetsModel> f14723d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    Disposable f14724e;

    /* renamed from: f  reason: collision with root package name */
    private final String f14725f;
    private final List<Object> g = new ArrayList();

    public final void a(h.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f14720a, false, 9325, new Class[]{h.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f14720a, false, 9325, new Class[]{h.a.class}, Void.TYPE);
            return;
        }
        if (aVar != null && !this.f14721b.contains(aVar)) {
            this.f14721b.add(aVar);
        }
    }

    public final boolean a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f14720a, false, 9334, new Class[]{Long.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f14720a, false, 9334, new Class[]{Long.TYPE}, Boolean.TYPE)).booleanValue();
        }
        AssetsModel c2 = c(j);
        if (PatchProxy.isSupport(new Object[]{c2}, this, f14720a, false, 9333, new Class[]{AssetsModel.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{c2}, this, f14720a, false, 9333, new Class[]{AssetsModel.class}, Boolean.TYPE)).booleanValue();
        }
        com.ss.ugc.live.b.a.c a2 = a.a(c2);
        return a2 != null && f.a().b(a2);
    }

    /* access modifiers changed from: package-private */
    public void a(List<AssetsModel> list, int i) {
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, this, f14720a, false, 9340, new Class[]{List.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, this, f14720a, false, 9340, new Class[]{List.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        for (AssetsModel next : list) {
            if ((((double) (currentTimeMillis - ((Long) this.f14722c.get(next.getId(), 0L)).longValue())) > 150000.0d) && next.getResourceType() == 5) {
                a(next, i);
                this.f14722c.put(next.getId(), Long.valueOf(currentTimeMillis));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(final List<AssetsModel> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f14720a, false, 9341, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f14720a, false, 9341, new Class[]{List.class}, Void.TYPE);
        } else if (!Lists.isEmpty(list)) {
            long longValue = ((Long) b.f17767e.a()).longValue();
            String str = (String) b.f17766d.a();
            if (!((Boolean) LiveSettingKeys.ENABLE_ASSETS_DELETE_TIME_LIMIT.a()).booleanValue() || System.currentTimeMillis() - longValue >= 86400000) {
                final Gson a2 = com.bytedance.android.live.a.a();
                if (longValue == 0 || StringUtils.isEmpty(str)) {
                    b.f17767e.a(Long.valueOf(System.currentTimeMillis()));
                    b.f17766d.a(a2.toJson((Object) list));
                    return;
                }
                final ArrayList arrayList = new ArrayList();
                for (AssetsModel assetsModel : (List) a2.fromJson(str, new TypeToken<List<AssetsModel>>() {
                }.getType())) {
                    if (!list.contains(assetsModel)) {
                        arrayList.add(assetsModel);
                    }
                }
                b.f17767e.a(Long.valueOf(System.currentTimeMillis()));
                b.f17766d.a(a2.toJson((Object) list));
                if (!Lists.isEmpty(arrayList)) {
                    new ThreadPlus() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f14730a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f14730a, false, 9348, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f14730a, false, 9348, new Class[0], Void.TYPE);
                                return;
                            }
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                com.ss.ugc.live.b.a.c a2 = a.a((AssetsModel) it2.next());
                                if (a2 != null) {
                                    File file = new File(f.a().f78667c.f78653a.a(a2));
                                    if (!file.exists()) {
                                        it2.remove();
                                    } else if (m.a(file)) {
                                        it2.remove();
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                list.addAll(arrayList);
                                b.f17766d.a(a2.toJson((Object) list));
                            }
                        }
                    }.start();
                }
            }
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f14720a, false, 9338, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14720a, false, 9338, new Class[0], Void.TYPE);
            return;
        }
        f.a().f78666b.clear();
    }

    c(String str) {
        this.f14725f = str;
    }

    public final void b(h.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f14720a, false, 9326, new Class[]{h.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f14720a, false, 9326, new Class[]{h.a.class}, Void.TYPE);
            return;
        }
        if (aVar != null && this.f14721b.contains(aVar)) {
            this.f14721b.remove(aVar);
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f14720a, false, 9323, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f14720a, false, 9323, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a(i, false);
    }

    public final AssetsModel c(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f14720a, false, 9337, new Class[]{Long.TYPE}, AssetsModel.class)) {
            return (AssetsModel) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f14720a, false, 9337, new Class[]{Long.TYPE}, AssetsModel.class);
        }
        for (AssetsModel next : this.f14723d) {
            if (next.getId() == j2) {
                return next;
            }
        }
        return null;
    }

    public final String b(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f14720a, false, 9336, new Class[]{Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f14720a, false, 9336, new Class[]{Long.TYPE}, String.class);
        }
        com.ss.ugc.live.b.a.c a2 = a.a(c(j));
        if (a2 == null) {
            return null;
        }
        f a3 = f.a();
        if (a2 != null) {
            if (a3.b(a2)) {
                return a3.d(a2);
            }
            long j3 = a2.f78634a;
            if (!a3.f78666b.containsKey(Long.valueOf(j3))) {
                a3.f78666b.put(Long.valueOf(j3), new g(a2));
                a2.c();
                a3.c(a2);
            }
        }
        return null;
    }

    public final void a(int i, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f14720a, false, 9324, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z)}, this, f14720a, false, 9324, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f14724e = ((AssetsApi) ((com.bytedance.android.livesdkapi.host.h) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.host.h.class)).c().create(AssetsApi.class)).getAssets(this.f14725f, i).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new d(this, i, z), new e(this));
    }

    /* access modifiers changed from: package-private */
    public void b(List<AssetsModel> list, int i) {
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, this, f14720a, false, 9342, new Class[]{List.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, this, f14720a, false, 9342, new Class[]{List.class, Integer.TYPE}, Void.TYPE);
        } else if (i != 1) {
            ArrayList arrayList = new ArrayList();
            for (AssetsModel next : list) {
                if (next.getDownloadType() == 2) {
                    arrayList.add(Long.valueOf(next.getId()));
                }
            }
            if (!Lists.isEmpty(arrayList)) {
                String obj = arrayList.toString();
                if (PatchProxy.isSupport(new Object[]{obj, Integer.valueOf(i)}, null, o.f15142a, true, 9285, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{obj, Integer.valueOf(i)}, null, o.f15142a, true, 9285, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("error_msg", obj);
                hashMap.put("source_type", Integer.valueOf(i));
                e.a(o.b("ttlive_gift_asset_download_list_status"), 0, (Map<String, Object>) hashMap);
                com.bytedance.android.livesdk.j.a.a.a().a(com.bytedance.android.livesdk.j.a.b.Gift.info, "ttlive_gift_asset_download_list_status", 1, (Map) hashMap);
            }
        }
    }

    public final void a(AssetsModel assetsModel, int i) {
        AssetsModel assetsModel2 = assetsModel;
        if (PatchProxy.isSupport(new Object[]{assetsModel2, Integer.valueOf(i)}, this, f14720a, false, 9329, new Class[]{AssetsModel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{assetsModel2, Integer.valueOf(i)}, this, f14720a, false, 9329, new Class[]{AssetsModel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(assetsModel2, (g) null, i);
    }

    private void a(AssetsModel assetsModel, g gVar, int i) {
        AssetsModel assetsModel2 = assetsModel;
        final g gVar2 = gVar;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{assetsModel2, gVar2, Integer.valueOf(i)}, this, f14720a, false, 9331, new Class[]{AssetsModel.class, g.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{assetsModel2, gVar2, Integer.valueOf(i)}, this, f14720a, false, 9331, new Class[]{AssetsModel.class, g.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        com.ss.ugc.live.b.a.c a2 = a.a(assetsModel2, i2);
        if (a2 != null) {
            if (gVar2 == null) {
                f.a().a(a2);
            } else {
                f.a().a(a2, (d) new d() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f14726a;

                    public final void a(int i) {
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f14726a, false, 9347, new Class[]{Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f14726a, false, 9347, new Class[]{Integer.TYPE}, Void.TYPE);
                        }
                    }

                    public final void a(Throwable th) {
                        Throwable th2 = th;
                        if (PatchProxy.isSupport(new Object[]{th2}, this, f14726a, false, 9346, new Class[]{Throwable.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{th2}, this, f14726a, false, 9346, new Class[]{Throwable.class}, Void.TYPE);
                            return;
                        }
                        gVar2.a(th2);
                    }

                    public final void a(long j, String str) {
                        long j2 = j;
                        String str2 = str;
                        if (PatchProxy.isSupport(new Object[]{new Long(j2), str2}, this, f14726a, false, 9345, new Class[]{Long.TYPE, String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{new Long(j2), str2}, this, f14726a, false, 9345, new Class[]{Long.TYPE, String.class}, Void.TYPE);
                            return;
                        }
                        gVar2.a(j2, str2);
                    }
                });
            }
            if (!f.a().b(a2)) {
                o.a(assetsModel.getId(), i2);
            }
        }
    }

    public final void a(long j, g gVar, int i) {
        long j2 = j;
        g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), gVar2, Integer.valueOf(i)}, this, f14720a, false, 9332, new Class[]{Long.TYPE, g.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), gVar2, Integer.valueOf(i)}, this, f14720a, false, 9332, new Class[]{Long.TYPE, g.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(c(j), gVar2, i);
    }
}
