package com.ss.android.ugc.aweme.crossplatform.platform.rn;

import a.f;
import a.i;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.geckoclient.model.d;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.crossplatform.platform.rn.model.RNBundleInfo;
import com.ss.android.ugc.aweme.framework.ReactInstance;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.utils.cm;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40843a;

    /* renamed from: b  reason: collision with root package name */
    public b f40844b;

    /* renamed from: c  reason: collision with root package name */
    f f40845c = new f();

    /* renamed from: d  reason: collision with root package name */
    public boolean f40846d = false;

    /* renamed from: e  reason: collision with root package name */
    private final m f40847e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f40848f;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40857a;

        /* renamed from: b  reason: collision with root package name */
        public String f40858b;

        private a() {
        }

        public final boolean a() {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], this, f40857a, false, 34363, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f40857a, false, 34363, new Class[0], Boolean.TYPE)).booleanValue();
            }
            if (!TextUtils.isEmpty(this.f40858b) && new File(this.f40858b).exists()) {
                z = true;
            }
            return z;
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    public interface b {
        void a(ReactInstanceManager reactInstanceManager);

        void a(Exception exc);
    }

    public final void a() {
        this.f40844b = null;
    }

    public e(Context context) {
        this.f40847e = new m(context);
    }

    private boolean a(Uri uri) {
        List<String> list;
        if (PatchProxy.isSupport(new Object[]{uri}, this, f40843a, false, 34350, new Class[]{Uri.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{uri}, this, f40843a, false, 34350, new Class[]{Uri.class}, Boolean.TYPE)).booleanValue();
        }
        String host = uri.getHost();
        if (TextUtils.isEmpty(host)) {
            return false;
        }
        com.ss.android.ugc.aweme.global.config.settings.pojo.a b2 = g.b();
        if (PatchProxy.isSupport(new Object[0], b2, com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a, false, 48786, new Class[0], List.class)) {
            list = (List) PatchProxy.accessDispatch(new Object[0], b2, com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a, false, 48786, new Class[0], List.class);
        } else if (b2.f49569c == null) {
            list = b2.f49568b.getDmtSourceUrlWhitelist();
        } else {
            list = com.ss.android.ugc.aweme.global.config.settings.pojo.a.a(b2.f49569c, "dmt_source_url_whitelist", String.class, b2.f49568b.getDmtSourceUrlWhitelist());
        }
        if (list == null || list.isEmpty()) {
            return true;
        }
        for (String next : list) {
            if (next != null && host.contains(next)) {
                return true;
            }
        }
        if (!com.ss.android.ugc.aweme.g.a.a() || !TextUtils.equals(host, l.a().f40884b)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void a(ReactContext reactContext, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{reactContext, str2}, this, f40843a, false, 34353, new Class[]{ReactContext.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{reactContext, str2}, this, f40843a, false, 34353, new Class[]{ReactContext.class, String.class}, Void.TYPE);
            return;
        }
        ((CatalystInstanceImpl) reactContext.getCatalystInstance()).loadScriptFromFile(str2, str2, false);
    }

    private void a(ReactInstanceManager reactInstanceManager, String str, b bVar, long j) {
        ReactInstanceManager reactInstanceManager2 = reactInstanceManager;
        String str2 = str;
        b bVar2 = bVar;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{reactInstanceManager2, str2, bVar2, new Long(j2)}, this, f40843a, false, 34352, new Class[]{ReactInstanceManager.class, String.class, b.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{reactInstanceManager2, str2, bVar2, new Long(j2)}, this, f40843a, false, 34352, new Class[]{ReactInstanceManager.class, String.class, b.class, Long.TYPE}, Void.TYPE);
            return;
        }
        ReactContext currentReactContext = reactInstanceManager.getCurrentReactContext();
        if (currentReactContext != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    a(currentReactContext, str2);
                }
                bVar2.a(reactInstanceManager2);
            } catch (Exception e2) {
                bVar2.a(e2);
            }
        } else {
            this.f40844b = bVar2;
            reactInstanceManager2.addReactInstanceEventListener(new i(this, str2, reactInstanceManager2));
            if (!reactInstanceManager.hasStartedCreatingInitialContext()) {
                reactInstanceManager.createReactContextInBackground();
            }
            this.f40846d = false;
            if (j2 > 0) {
                this.f40845c = new f();
                i.a(j).a((a.g<TResult, TContinuationResult>) new a.g<Void, Void>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f40855a;

                    public final /* synthetic */ Object then(i iVar) throws Exception {
                        if (PatchProxy.isSupport(new Object[]{iVar}, this, f40855a, false, 34362, new Class[]{i.class}, Void.class)) {
                            return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f40855a, false, 34362, new Class[]{i.class}, Void.class);
                        }
                        e.this.f40846d = true;
                        if (e.this.f40844b != null) {
                            e.this.f40844b.a(new Exception("ReactInstanceEventListener callback timeout"));
                        }
                        return null;
                    }
                }, i.f1052b, this.f40845c.b());
            }
        }
    }

    public final void a(String str, com.ss.android.ugc.aweme.crossplatform.params.base.a aVar, b bVar, boolean z, long j) {
        if (PatchProxy.isSupport(new Object[]{str, aVar, bVar, Byte.valueOf(z ? (byte) 1 : 0), 0L}, this, f40843a, false, 34347, new Class[]{String.class, com.ss.android.ugc.aweme.crossplatform.params.base.a.class, b.class, Boolean.TYPE, Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {str, aVar, bVar, Byte.valueOf(z), 0L};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f40843a, false, 34347, new Class[]{String.class, com.ss.android.ugc.aweme.crossplatform.params.base.a.class, b.class, Boolean.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        a(str, aVar, new a((byte) 0), bVar, z, 0);
    }

    private boolean c(String str, com.ss.android.ugc.aweme.crossplatform.params.base.a aVar, a aVar2, b bVar, boolean z, long j) {
        com.ss.android.ugc.aweme.crossplatform.params.base.a aVar3 = aVar;
        b bVar2 = bVar;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, aVar3, aVar2, bVar2, Byte.valueOf(z ? (byte) 1 : 0), new Long(j2)}, this, f40843a, false, 34351, new Class[]{String.class, com.ss.android.ugc.aweme.crossplatform.params.base.a.class, a.class, b.class, Boolean.TYPE, Long.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, aVar3, aVar2, bVar2, Byte.valueOf(z), new Long(j2)}, this, f40843a, false, 34351, new Class[]{String.class, com.ss.android.ugc.aweme.crossplatform.params.base.a.class, a.class, b.class, Boolean.TYPE, Long.TYPE}, Boolean.TYPE)).booleanValue();
        }
        String str2 = aVar3.f40807c.m;
        if (TextUtils.isEmpty(str2) || !a(Uri.parse(str2))) {
            return true;
        }
        g gVar = r0;
        g gVar2 = new g(this, aVar2, str, aVar, bVar, z, j);
        this.f40847e.a(str2, gVar, new h(bVar2));
        return false;
    }

    private boolean b(String str, com.ss.android.ugc.aweme.crossplatform.params.base.a aVar, a aVar2, b bVar, boolean z, long j) {
        RNBundleInfo rNBundleInfo;
        com.ss.android.ugc.aweme.crossplatform.params.base.a aVar3 = aVar;
        a aVar4 = aVar2;
        b bVar2 = bVar;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, aVar3, aVar4, bVar2, Byte.valueOf(z ? (byte) 1 : 0), new Long(j2)}, this, f40843a, false, 34349, new Class[]{String.class, com.ss.android.ugc.aweme.crossplatform.params.base.a.class, a.class, b.class, Boolean.TYPE, Long.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, aVar3, aVar4, bVar2, Byte.valueOf(z), new Long(j2)}, this, f40843a, false, 34349, new Class[]{String.class, com.ss.android.ugc.aweme.crossplatform.params.base.a.class, a.class, b.class, Boolean.TYPE, Long.TYPE}, Boolean.TYPE)).booleanValue();
        }
        com.bytedance.ies.geckoclient.f fVar = (com.bytedance.ies.geckoclient.f) ServiceManager.get().getService(com.bytedance.ies.geckoclient.f.class);
        if (fVar == null) {
            bVar2.a(new Exception("gecko client is null"));
            return false;
        }
        d a2 = fVar.a(aVar3.f40807c.a());
        if (this.f40848f || !aVar3.f40807c.l || a2 != null) {
            String str2 = null;
            if (a2 != null && b.a(a2)) {
                RNBundleInfo b2 = b.b(a2);
                d a3 = fVar.a("rn_base_android");
                if (a3 == null) {
                    rNBundleInfo = null;
                } else {
                    rNBundleInfo = b.b(a3);
                }
                if (b2 == null || CollectionUtils.isEmpty(b2.getModules()) || TextUtils.isEmpty(b2.getVersion()) || TextUtils.isEmpty(b2.getBaseVersion())) {
                    bVar2.a(new Exception(aVar3.f40807c.a() + ": bundle info args error"));
                    return false;
                } else if (!b2.getModules().contains(aVar3.f40807c.f40821f)) {
                    bVar2.a(new Exception("no such module: " + aVar3.f40807c.f40821f));
                    return false;
                } else if (rNBundleInfo == null || TextUtils.isEmpty(rNBundleInfo.getVersion())) {
                    bVar2.a(new Exception("rn_base_android: bundle info args error"));
                    return false;
                } else if (!TextUtils.equals(b2.getBaseVersion(), rNBundleInfo.getVersion())) {
                    bVar2.a(new Exception("patch bundle is not compat with base bundle"));
                    return false;
                }
            }
            if (a2 != null) {
                str2 = b.a(a2, aVar3.f40807c.b());
            }
            aVar4.f40858b = str2;
            return true;
        }
        final String str3 = str;
        final com.ss.android.ugc.aweme.crossplatform.params.base.a aVar5 = aVar;
        final a aVar6 = aVar2;
        String a4 = aVar3.f40807c.a();
        final b bVar3 = bVar;
        final boolean z2 = z;
        AnonymousClass1 r11 = r0;
        final long j3 = j;
        AnonymousClass1 r0 = new com.bytedance.ies.geckoclient.c.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f40849a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f40849a, false, 34358, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f40849a, false, 34358, new Class[0], Void.TYPE);
                    return;
                }
                j jVar = new j(this, str3, aVar5, aVar6, bVar3, z2, j3);
                i.a((Callable<TResult>) jVar, i.f1052b);
            }

            public final void a(String str, Exception exc) {
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{str2, exc}, this, f40849a, false, 34359, new Class[]{String.class, Exception.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str2, exc}, this, f40849a, false, 34359, new Class[]{String.class, Exception.class}, Void.TYPE);
                    return;
                }
                i.a((Callable<TResult>) new k<TResult>(bVar3, str2), i.f1052b);
            }

            /* access modifiers changed from: package-private */
            public final /* synthetic */ Void a(String str, com.ss.android.ugc.aweme.crossplatform.params.base.a aVar, a aVar2, b bVar, boolean z, long j) throws Exception {
                e.this.a(str, aVar, aVar2, bVar, z, j);
                return null;
            }
        };
        fVar.a(a4, 0, (com.bytedance.ies.geckoclient.c.a) r11);
        this.f40848f = true;
        return false;
    }

    public final void a(String str, com.ss.android.ugc.aweme.crossplatform.params.base.a aVar, a aVar2, b bVar, boolean z, long j) {
        String str2;
        String str3 = str;
        com.ss.android.ugc.aweme.crossplatform.params.base.a aVar3 = aVar;
        a aVar4 = aVar2;
        b bVar2 = bVar;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str3, aVar3, aVar4, bVar2, Byte.valueOf(z ? (byte) 1 : 0), new Long(j2)}, this, f40843a, false, 34348, new Class[]{String.class, com.ss.android.ugc.aweme.crossplatform.params.base.a.class, a.class, b.class, Boolean.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, aVar3, aVar4, bVar2, Byte.valueOf(z), new Long(j2)}, this, f40843a, false, 34348, new Class[]{String.class, com.ss.android.ugc.aweme.crossplatform.params.base.a.class, a.class, b.class, Boolean.TYPE, Long.TYPE}, Void.TYPE);
        } else if (TextUtils.isEmpty(str)) {
            bVar2.a(new Exception("reactId is null"));
        } else if (aVar3 == null || TextUtils.isEmpty(aVar3.f40807c.a()) || TextUtils.isEmpty(aVar3.f40807c.f40821f)) {
            bVar2.a(new Exception("schema info, channel name or module name is null"));
        } else {
            if (z) {
                if (!aVar2.a()) {
                    com.bytedance.ies.geckoclient.f fVar = (com.bytedance.ies.geckoclient.f) ServiceManager.get().getService(com.bytedance.ies.geckoclient.f.class);
                    if (fVar == null) {
                        bVar2.a(new Exception("gecko client is null"));
                        return;
                    }
                    d a2 = fVar.a("rn_base_android");
                    if (a2 == null) {
                        str2 = null;
                    } else {
                        str2 = b.c(a2);
                    }
                    if (TextUtils.isEmpty(str2) || !new File(str2).exists()) {
                        bVar2.a(new Exception("baseBundleFilePath not exist"));
                        return;
                    } else if (!c(str, aVar, aVar2, bVar, z, j) || !b(str, aVar, aVar2, bVar, z, j)) {
                        return;
                    }
                }
                if (!aVar2.a()) {
                    bVar2.a(new Exception("patchBundleFilePath not exist"));
                    return;
                }
            }
            com.ss.android.ugc.aweme.framework.a reactNativeHost = ReactInstance.getReactNativeHost(str3, new f(bVar2));
            reactNativeHost.f48451b = cm.a("channel_name", aVar3.f40807c.a(), "module_name", aVar3.f40807c.f40821f);
            a(reactNativeHost.getReactInstanceManager(), aVar4.f40858b, bVar, j);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Unit a(a aVar, String str, com.ss.android.ugc.aweme.crossplatform.params.base.a aVar2, b bVar, boolean z, long j, File file) {
        if (file.exists()) {
            a aVar3 = aVar;
            aVar3.f40858b = file.getPath();
            a(str, aVar2, aVar3, bVar, z, j);
        } else {
            b bVar2 = bVar;
            bVar.a((Exception) new FileNotFoundException(file.getPath()));
        }
        return null;
    }
}
