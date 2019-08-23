package com.ss.android.ugc.aweme.im.sdk.resources;

import a.g;
import a.i;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.im.sdk.resources.model.EmojiResourcesResponce;
import com.ss.android.ugc.aweme.im.sdk.resources.model.c;
import com.ss.android.ugc.aweme.im.sdk.utils.d;
import com.ss.android.ugc.aweme.im.sdk.utils.j;
import com.ss.android.ugc.aweme.im.sdk.utils.m;
import com.ss.android.ugc.aweme.im.sdk.utils.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public class k implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52318a;

    /* renamed from: b  reason: collision with root package name */
    public static int f52319b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f52320c;

    /* renamed from: d  reason: collision with root package name */
    public static WeakReference<List<com.ss.android.ugc.aweme.im.sdk.resources.model.a>> f52321d;

    /* renamed from: e  reason: collision with root package name */
    public static List<Long> f52322e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private static long f52323f = 0;
    private static k h = null;
    private List<f> g = new ArrayList();

    class a extends b {

        /* renamed from: a  reason: collision with root package name */
        com.ss.android.ugc.aweme.im.sdk.resources.model.a f52349a;

        /* renamed from: b  reason: collision with root package name */
        String f52350b;

        private a() {
            super(k.this, (byte) 0);
        }

        /* synthetic */ a(k kVar, byte b2) {
            this();
        }
    }

    class b {

        /* renamed from: d  reason: collision with root package name */
        boolean f52352d;

        /* renamed from: e  reason: collision with root package name */
        List<com.ss.android.ugc.aweme.im.sdk.resources.model.a> f52353e;

        /* renamed from: f  reason: collision with root package name */
        String f52354f;

        private b() {
        }

        /* synthetic */ b(k kVar, byte b2) {
            this();
        }
    }

    public static int c() {
        return f52319b;
    }

    private k() {
    }

    public static boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f52318a, true, 53137, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f52318a, true, 53137, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (m.a() || m.b()) {
            return false;
        }
        return true;
    }

    public final String f() {
        if (PatchProxy.isSupport(new Object[0], this, f52318a, false, 53144, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f52318a, false, 53144, new Class[0], String.class);
        }
        return "SELF_EMOJIS" + d.d();
    }

    public static k a() {
        if (PatchProxy.isSupport(new Object[0], null, f52318a, true, 53136, new Class[0], k.class)) {
            return (k) PatchProxy.accessDispatch(new Object[0], null, f52318a, true, 53136, new Class[0], k.class);
        }
        if (h == null) {
            synchronized (k.class) {
                if (h == null) {
                    h = new k();
                }
            }
        }
        return h;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f52318a, false, 53141, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52318a, false, 53141, new Class[0], Void.TYPE);
        } else if (d.a() && b() && !f52320c) {
            f52320c = true;
            f52323f = d.d();
            f52319b = 0;
            i.a((Callable<TResult>) new Callable<List<com.ss.android.ugc.aweme.im.sdk.resources.model.a>>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f52331a;

                /* access modifiers changed from: private */
                /* renamed from: a */
                public List<com.ss.android.ugc.aweme.im.sdk.resources.model.a> call() {
                    if (PatchProxy.isSupport(new Object[0], this, f52331a, false, 53154, new Class[0], List.class)) {
                        return (List) PatchProxy.accessDispatch(new Object[0], this, f52331a, false, 53154, new Class[0], List.class);
                    }
                    List<com.ss.android.ugc.aweme.im.sdk.resources.model.a> list = null;
                    try {
                        EmojiResourcesResponce emojiResourcesResponce = (EmojiResourcesResponce) r.a().getSelfEmojis().get();
                        if (emojiResourcesResponce == null || emojiResourcesResponce.status_code != 0) {
                            k.f52319b = 1;
                        }
                        if (emojiResourcesResponce != null && !CollectionUtils.isEmpty(emojiResourcesResponce.getResources())) {
                            for (c cVar : emojiResourcesResponce.getResources()) {
                                if (1 == cVar.getPackageType()) {
                                    j.a(k.this.f(), cVar.getStickers());
                                    k.f52321d = new WeakReference<>(cVar.getStickers());
                                    list = cVar.getStickers();
                                }
                            }
                        }
                    } catch (ExecutionException unused) {
                        k.f52319b = 1;
                    } catch (InterruptedException unused2) {
                        k.f52319b = 1;
                    }
                    if (CollectionUtils.isEmpty(list)) {
                        list = j.a(k.this.f());
                    }
                    return list;
                }
            }, (Executor) i.f1051a).a((g<TResult, TContinuationResult>) new g<List<com.ss.android.ugc.aweme.im.sdk.resources.model.a>, Void>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f52324a;

                public final /* synthetic */ Object then(i iVar) throws Exception {
                    List list;
                    if (PatchProxy.isSupport(new Object[]{iVar}, this, f52324a, false, 53152, new Class[]{i.class}, Void.class)) {
                        return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f52324a, false, 53152, new Class[]{i.class}, Void.class);
                    }
                    if (iVar.c() || iVar.d()) {
                        list = null;
                    } else {
                        list = (List) iVar.e();
                    }
                    if (!CollectionUtils.isEmpty(list)) {
                        k.f52319b = 3;
                    } else if (k.f52319b == 1) {
                        k.f52320c = false;
                    } else {
                        k.f52319b = 2;
                    }
                    k.this.a(list);
                    return null;
                }
            }, i.f1052b);
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f52318a, false, 53142, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52318a, false, 53142, new Class[0], Void.TYPE);
        } else if (b()) {
            if ((!f52320c || f52323f != d.d()) && NetworkUtils.isNetworkAvailable(GlobalContext.getContext())) {
                d();
            } else {
                i.a((Callable<TResult>) new Callable<List<com.ss.android.ugc.aweme.im.sdk.resources.model.a>>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f52335a;

                    public final /* synthetic */ Object call() throws Exception {
                        if (PatchProxy.isSupport(new Object[0], this, f52335a, false, 53156, new Class[0], List.class)) {
                            return (List) PatchProxy.accessDispatch(new Object[0], this, f52335a, false, 53156, new Class[0], List.class);
                        }
                        if (k.f52321d != null) {
                            List list = (List) k.f52321d.get();
                            if (list != null) {
                                return list;
                            }
                        }
                        List a2 = j.a(k.this.f());
                        k.f52321d = new WeakReference<>(a2);
                        return a2;
                    }
                }, (Executor) i.f1051a).a((g<TResult, TContinuationResult>) new g<List<com.ss.android.ugc.aweme.im.sdk.resources.model.a>, Void>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f52333a;

                    public final /* synthetic */ Object then(i iVar) throws Exception {
                        if (PatchProxy.isSupport(new Object[]{iVar}, this, f52333a, false, 53155, new Class[]{i.class}, Void.class)) {
                            return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f52333a, false, 53155, new Class[]{i.class}, Void.class);
                        }
                        k.this.a((List) iVar.e());
                        return null;
                    }
                }, i.f1052b);
            }
        }
    }

    public final void a(f fVar) {
        if (PatchProxy.isSupport(new Object[]{fVar}, this, f52318a, false, 53138, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar}, this, f52318a, false, 53138, new Class[]{f.class}, Void.TYPE);
            return;
        }
        if (!this.g.contains(fVar)) {
            this.g.add(fVar);
        }
    }

    public final void b(f fVar) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, this, f52318a, false, 53140, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2}, this, f52318a, false, 53140, new Class[]{f.class}, Void.TYPE);
            return;
        }
        this.g.remove(fVar2);
    }

    public final void a(List<com.ss.android.ugc.aweme.im.sdk.resources.model.a> list) {
        List<com.ss.android.ugc.aweme.im.sdk.resources.model.a> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f52318a, false, 53151, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f52318a, false, 53151, new Class[]{List.class}, Void.TYPE);
            return;
        }
        f52322e.clear();
        if (list2 != null) {
            for (com.ss.android.ugc.aweme.im.sdk.resources.model.a id : list) {
                f52322e.add(Long.valueOf(id.getId()));
            }
        }
        for (f a2 : this.g) {
            a2.a(list2);
        }
    }

    public final void b(List<com.ss.android.ugc.aweme.im.sdk.resources.model.a> list, boolean z, String str) {
        List<com.ss.android.ugc.aweme.im.sdk.resources.model.a> list2 = list;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{list2, Byte.valueOf(z ? (byte) 1 : 0), str2}, this, f52318a, false, 53150, new Class[]{List.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Byte.valueOf(z), str2}, this, f52318a, false, 53150, new Class[]{List.class, Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        f52322e.clear();
        if (list2 != null) {
            for (com.ss.android.ugc.aweme.im.sdk.resources.model.a id : list) {
                f52322e.add(Long.valueOf(id.getId()));
            }
        }
        for (f b2 : this.g) {
            b2.b(list2, z, str2);
        }
    }

    public final void a(List<com.ss.android.ugc.aweme.im.sdk.resources.model.a> list, boolean z, String str) {
        List<com.ss.android.ugc.aweme.im.sdk.resources.model.a> list2 = list;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{list2, Byte.valueOf(z ? (byte) 1 : 0), str2}, this, f52318a, false, 53149, new Class[]{List.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Byte.valueOf(z), str2}, this, f52318a, false, 53149, new Class[]{List.class, Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        f52322e.clear();
        if (list2 != null) {
            for (com.ss.android.ugc.aweme.im.sdk.resources.model.a id : list) {
                f52322e.add(Long.valueOf(id.getId()));
            }
        }
        for (f a2 : this.g) {
            a2.a(list2, z, str2);
        }
    }

    public final void a(List<com.ss.android.ugc.aweme.im.sdk.resources.model.a> list, com.ss.android.ugc.aweme.im.sdk.resources.model.a aVar, boolean z, String str) {
        List<com.ss.android.ugc.aweme.im.sdk.resources.model.a> list2 = list;
        com.ss.android.ugc.aweme.im.sdk.resources.model.a aVar2 = aVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{list2, aVar2, Byte.valueOf(z ? (byte) 1 : 0), str2}, this, f52318a, false, 53148, new Class[]{List.class, com.ss.android.ugc.aweme.im.sdk.resources.model.a.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, aVar2, Byte.valueOf(z), str2}, this, f52318a, false, 53148, new Class[]{List.class, com.ss.android.ugc.aweme.im.sdk.resources.model.a.class, Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        f52322e.clear();
        if (list2 != null) {
            for (com.ss.android.ugc.aweme.im.sdk.resources.model.a id : list) {
                f52322e.add(Long.valueOf(id.getId()));
            }
        }
        for (f a2 : this.g) {
            a2.a(list2, aVar2, z, str2);
        }
    }
}
