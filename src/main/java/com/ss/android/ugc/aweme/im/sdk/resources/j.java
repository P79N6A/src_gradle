package com.ss.android.ugc.aweme.im.sdk.resources;

import a.g;
import a.i;
import android.support.annotation.MainThread;
import android.support.annotation.WorkerThread;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.io.FileUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.a.c;
import com.ss.android.ugc.a.d;
import com.ss.android.ugc.a.e;
import com.ss.android.ugc.aweme.im.sdk.resources.model.ResourcesResponse;
import com.ss.android.ugc.aweme.im.sdk.resources.model.e;
import com.ss.android.ugc.aweme.im.sdk.utils.bh;
import com.ss.android.ugc.aweme.im.sdk.utils.r;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public class j implements e {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f52292c;

    /* renamed from: a  reason: collision with root package name */
    private List<e> f52293a = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public boolean f52294d;

    public static ResourcesResponse b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f52292c, true, 53118, new Class[]{String.class}, ResourcesResponse.class)) {
            return (ResourcesResponse) PatchProxy.accessDispatch(new Object[]{str2}, null, f52292c, true, 53118, new Class[]{String.class}, ResourcesResponse.class);
        }
        try {
            return (ResourcesResponse) r.a().getResources(str2).get();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    public static void b(e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, null, f52292c, true, 53125, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, null, f52292c, true, 53125, new Class[]{e.class}, Void.TYPE);
            return;
        }
        File file = new File(i.a(eVar));
        if (file.exists() && file.isFile()) {
            file.delete();
        }
    }

    public final void a(final String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f52292c, false, 53116, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f52292c, false, 53116, new Class[]{String.class}, Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new Callable<List<e>>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52298a;

            public final /* synthetic */ Object call() throws Exception {
                List<e> list;
                List list2;
                if (PatchProxy.isSupport(new Object[0], this, f52298a, false, 53127, new Class[0], List.class)) {
                    return (List) PatchProxy.accessDispatch(new Object[0], this, f52298a, false, 53127, new Class[0], List.class);
                }
                ResourcesResponse b2 = j.b(str);
                if (b2 == null) {
                    list = null;
                } else {
                    list = b2.getResources();
                }
                if (b2 == null || b2.status_code != 0) {
                    String str = str;
                    if (PatchProxy.isSupport(new Object[]{str}, null, g.f52288a, true, 53100, new Class[]{String.class}, List.class)) {
                        list2 = (List) PatchProxy.accessDispatch(new Object[]{str}, null, g.f52288a, true, 53100, new Class[]{String.class}, List.class);
                    } else {
                        list2 = com.ss.android.ugc.aweme.im.sdk.utils.j.a("im_resources_" + str);
                    }
                    if (list2 == null) {
                        list2 = new ArrayList();
                    }
                    list = list2;
                } else {
                    if (list == null) {
                        list = new ArrayList<>();
                    }
                    for (e type : list) {
                        type.setType(str);
                    }
                    String str2 = str;
                    if (PatchProxy.isSupport(new Object[]{str2, list}, null, g.f52288a, true, 53101, new Class[]{String.class, List.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str2, list}, null, g.f52288a, true, 53101, new Class[]{String.class, List.class}, Void.TYPE);
                    } else {
                        com.ss.android.ugc.aweme.im.sdk.utils.j.a("im_resources_" + str2, list);
                    }
                    if (list.size() > 0) {
                        j.c(str, list);
                    }
                }
                return list;
            }
        }, (Executor) i.f1051a).a((g<TResult, TContinuationResult>) new g<List<e>, Void>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52295a;

            public final /* synthetic */ Object then(i iVar) throws Exception {
                if (PatchProxy.isSupport(new Object[]{iVar}, this, f52295a, false, 53126, new Class[]{i.class}, Void.class)) {
                    return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f52295a, false, 53126, new Class[]{i.class}, Void.class);
                }
                j.this.a(str, (List) iVar.e());
                return null;
            }
        }, i.f1052b);
    }

    public void a(e eVar, boolean z) {
        final e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f52292c, false, 53121, new Class[]{e.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2, Byte.valueOf(z)}, this, f52292c, false, 53121, new Class[]{e.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        final boolean z2 = z;
        a.b(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52314a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f52314a, false, 53135, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f52314a, false, 53135, new Class[0], Void.TYPE);
                    return;
                }
                j.this.a(z2, eVar2);
            }
        });
    }

    @WorkerThread
    public static void c(String str, List<e> list) {
        String str2;
        String str3;
        if (PatchProxy.isSupport(new Object[]{str, list}, null, f52292c, true, 53119, new Class[]{String.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, list}, null, f52292c, true, 53119, new Class[]{String.class, List.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        for (e next : list) {
            if (PatchProxy.isSupport(new Object[]{next}, null, i.f52291a, true, 53108, new Class[]{e.class}, String.class)) {
                str2 = (String) PatchProxy.accessDispatch(new Object[]{next}, null, i.f52291a, true, 53108, new Class[]{e.class}, String.class);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(next.getId());
                sb.append("_");
                if (next.getVersion() == null) {
                    str3 = null;
                } else {
                    str3 = next.getVersion().replace(ClassUtils.PACKAGE_SEPARATOR, "_");
                }
                sb.append(str3);
                str2 = sb.toString();
            }
            hashMap.put(str2, Boolean.TRUE);
        }
        File file = new File(i.a(str));
        if (file.exists() && file.isDirectory()) {
            String[] list2 = file.list();
            if (list2 != null) {
                for (int i = 0; i < list2.length; i++) {
                    if (hashMap.get(list2[i]) == null) {
                        try {
                            FileUtils.clearDir(list2[i]);
                            new File(list2[i]).delete();
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    }

    @MainThread
    public void a(String str, List<e> list) {
        if (PatchProxy.isSupport(new Object[]{str, list}, this, f52292c, false, 53117, new Class[]{String.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, list}, this, f52292c, false, 53117, new Class[]{String.class, List.class}, Void.TYPE);
            return;
        }
        b(str, list);
        if (list == null || list.size() == 0) {
            this.f52294d = true;
        } else {
            this.f52294d = false;
        }
    }

    @MainThread
    public final void b(String str, List<e> list) {
        String str2 = str;
        List<e> list2 = list;
        if (PatchProxy.isSupport(new Object[]{str2, list2}, this, f52292c, false, 53123, new Class[]{String.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, list2}, this, f52292c, false, 53123, new Class[]{String.class, List.class}, Void.TYPE);
            return;
        }
        for (e b2 : this.f52293a) {
            b2.b(str2, list2);
        }
    }

    @MainThread
    public final void a(boolean z, e eVar) {
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), eVar2}, this, f52292c, false, 53122, new Class[]{Boolean.TYPE, e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), eVar2}, this, f52292c, false, 53122, new Class[]{Boolean.TYPE, e.class}, Void.TYPE);
            return;
        }
        for (e a2 : this.f52293a) {
            a2.a(z, eVar2);
        }
    }

    public final boolean b(final e eVar, final boolean z) {
        if (PatchProxy.isSupport(new Object[]{eVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, f52292c, false, 53120, new Class[]{e.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{eVar, Byte.valueOf(z)}, this, f52292c, false, 53120, new Class[]{e.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (!NetworkUtils.isNetworkAvailable(GlobalContext.getContext())) {
            a.a(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f52301a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f52301a, false, 53128, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f52301a, false, 53128, new Class[0], Void.TYPE);
                        return;
                    }
                    j.this.a(eVar, false);
                }
            });
            return false;
        } else if (h.a(eVar.getResourceUrl()) != null) {
            return false;
        } else {
            File file = new File(i.a(eVar));
            if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
                return false;
            }
            com.ss.android.ugc.a.e a2 = new e.a().a(eVar.getResourceUrl()).b(file.getAbsolutePath()).a();
            h.a(eVar.getResourceUrl(), a2);
            d.a().a(a2, (com.ss.android.ugc.a.b.d) new com.ss.android.ugc.a.b.d() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f52304a;

                public final void onDownloadPause() {
                }

                public final void onDownloadProgress(int i, long j, long j2) {
                }

                public final void onDownloadStart(int i) {
                }

                public final void onCancel() {
                    if (PatchProxy.isSupport(new Object[0], this, f52304a, false, 53130, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f52304a, false, 53130, new Class[0], Void.TYPE);
                        return;
                    }
                    h.b(eVar.getResourceUrl());
                    a.a(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f52310a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f52310a, false, 53133, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f52310a, false, 53133, new Class[0], Void.TYPE);
                                return;
                            }
                            j.b(eVar);
                            j.this.a(eVar, false);
                        }
                    });
                }

                public final void onDownloadSuccess(String str) {
                    if (PatchProxy.isSupport(new Object[]{str}, this, f52304a, false, 53129, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, f52304a, false, 53129, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    h.b(eVar.getResourceUrl());
                    a.a(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f52308a;

                        public final void run() {
                            boolean z = false;
                            if (PatchProxy.isSupport(new Object[0], this, f52308a, false, 53132, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f52308a, false, 53132, new Class[0], Void.TYPE);
                                return;
                            }
                            bh.a(i.a(eVar), i.a(eVar.getType(), eVar.getId(), eVar.getVersion()));
                            j.b(eVar);
                            com.ss.android.ugc.aweme.im.sdk.resources.model.e eVar = eVar;
                            if (PatchProxy.isSupport(new Object[]{eVar}, null, j.f52292c, true, 53124, new Class[]{com.ss.android.ugc.aweme.im.sdk.resources.model.e.class}, Boolean.TYPE)) {
                                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{eVar}, null, j.f52292c, true, 53124, new Class[]{com.ss.android.ugc.aweme.im.sdk.resources.model.e.class}, Boolean.TYPE)).booleanValue();
                            } else if (eVar != null) {
                                File file = new File(i.b(eVar));
                                if (file.exists() && file.isDirectory()) {
                                    String[] list = file.list();
                                    if (list != null && list.length > 0) {
                                        z = true;
                                    }
                                }
                            }
                            j.this.a(eVar, z);
                        }
                    });
                }

                public final void onError(c cVar) {
                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f52304a, false, 53131, new Class[]{c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cVar}, this, f52304a, false, 53131, new Class[]{c.class}, Void.TYPE);
                        return;
                    }
                    h.b(eVar.getResourceUrl());
                    if (z) {
                        j.this.b(eVar, false);
                    } else {
                        a.a(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f52312a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f52312a, false, 53134, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f52312a, false, 53134, new Class[0], Void.TYPE);
                                    return;
                                }
                                j.b(eVar);
                                j.this.a(eVar, false);
                            }
                        });
                    }
                }
            });
            return true;
        }
    }
}
