package com.ss.android.ugc.aweme.commercialize.feed.b;

import com.bytedance.ies.geckoclient.f;
import com.bytedance.ies.geckoclient.model.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig;
import com.ss.android.ugc.aweme.web.d;
import com.ss.android.ugc.aweme.web.l;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0004J\n\u0010#\u001a\u0004\u0018\u00010$H\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0002J\n\u0010)\u001a\u0004\u0018\u00010$H\u0002J\u0018\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020-H\u0002J\u001e\u0010.\u001a\u00020/2\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u00172\u0006\u0010,\u001a\u00020-J\u0010\u00101\u001a\u00020/2\b\u00102\u001a\u0004\u0018\u00010\u0004J\u001a\u00103\u001a\u00020/2\b\u0010\"\u001a\u0004\u0018\u00010\u00042\b\u00104\u001a\u0004\u0018\u00010\u0004J(\u00105\u001a\u00020/2\u0006\u00106\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010(2\u000e\u00107\u001a\n\u0018\u000108j\u0004\u0018\u0001`9J\u0018\u0010:\u001a\u00020/2\u0006\u00106\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010(J \u0010;\u001a\u00020/2\b\u0010\"\u001a\u0004\u0018\u00010\u00042\u0006\u00104\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\u0007J\u0018\u0010=\u001a\u00020/2\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010>\u001a\u00020-J\u0018\u0010?\u001a\u00020/2\u0010\u0010@\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010A\u0018\u00010\u0017R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00178BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001e0\u001dX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020 0\u001dX\u0004¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/feed/preload/PreloadAdWebHelper;", "", "()V", "CHANNEL_COMMON", "", "CHANNEL_PREFIX", "CHECK_UPDATE_FIND", "", "CHECK_UPDATE_IS_NEW", "CHECK_UPDATE_NOT_FIND", "DOWNLOAD_FAILED", "DOWNLOAD_SUCCESS", "FULL_UPDATE", "PATCH_UPDATE", "PRELOAD_WEB_USE", "UNKNOWN", "USE_ALL", "USE_COMMON", "USE_NONE", "USE_SITE", "USE_WEB_URL_FALSE", "USE_WEB_URL_TRUE", "commonChannel", "", "getCommonChannel", "()Ljava/util/List;", "commonChannel$delegate", "Lkotlin/Lazy;", "downloadMsgMap", "Ljava/util/HashMap;", "Lcom/ss/android/ugc/aweme/commercialize/feed/preload/PreloadDownloadMsg;", "webStateMsgMap", "Lcom/ss/android/ugc/aweme/commercialize/feed/preload/PreloadAdWebStateMsg;", "checkPreloadStatus", "siteId", "getAdGeckoClient", "Lcom/bytedance/ies/geckoclient/GeckoClient;", "getFileSize", "", "geckoPackage", "Lcom/bytedance/ies/geckoclient/model/GeckoPackage;", "getGeckoClient", "getResponseStatus", "requestGeckoPackage", "isSuccess", "", "onCheckServerVersion", "", "requestList", "onClean", "channel", "onClickweb", "preloadWeb", "onDownloadPackageFail", "id", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onDownloadPackageSuccess", "onLoadStart", "isWebUrl", "onStartDownload", "isPatch", "preloadData", "list", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38809a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f38810b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "commonChannel", "getCommonChannel()Ljava/util/List;"))};

    /* renamed from: c  reason: collision with root package name */
    public static final HashMap<String, d> f38811c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap<String, b> f38812d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public static final a f38813e = new a();

    /* renamed from: f  reason: collision with root package name */
    private static final Lazy f38814f = LazyKt.lazy(C0505a.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.b.a$a  reason: collision with other inner class name */
    static final class C0505a extends Lambda implements Function0<List<? extends String>> {
        public static final C0505a INSTANCE = new C0505a();
        public static ChangeQuickRedirect changeQuickRedirect;

        C0505a() {
            super(0);
        }

        public final List<String> invoke() {
            List<String> list;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 30798, new Class[0], List.class)) {
                return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 30798, new Class[0], List.class);
            }
            try {
                com.ss.android.ugc.aweme.global.config.settings.pojo.a b2 = g.b();
                Intrinsics.checkExpressionValueIsNotNull(b2, "SettingsReader.get()");
                AdLandingPageConfig s = b2.s();
                Intrinsics.checkExpressionValueIsNotNull(s, "SettingsReader.get().adLandingPageConfig");
                list = s.getAdLandingPagePreloadCommonChannel();
            } catch (com.bytedance.ies.a unused) {
                list = CollectionsKt.emptyList();
            }
            return list;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/commercialize/feed/preload/PreloadAdWebHelper$preloadData$1$1", "Lcom/bytedance/ies/geckoclient/listener/ICheckUpdateListener;", "onUpdateFailed", "", "errorMsg", "", "e", "Ljava/lang/Exception;", "onUpdateSuccess", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements com.bytedance.ies.geckoclient.c.a {
        public final void a() {
        }

        public final void a(@Nullable String str, @Nullable Exception exc) {
        }

        b() {
        }
    }

    public final List<String> a() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f38809a, false, 30785, new Class[0], List.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f38809a, false, 30785, new Class[0], List.class);
        } else {
            value = f38814f.getValue();
        }
        return (List) value;
    }

    private a() {
    }

    private final f c() {
        if (!PatchProxy.isSupport(new Object[0], this, f38809a, false, 30797, new Class[0], f.class)) {
            return (f) ServiceManager.get().getService(f.class);
        }
        return (f) PatchProxy.accessDispatch(new Object[0], this, f38809a, false, 30797, new Class[0], f.class);
    }

    private final f b() {
        if (PatchProxy.isSupport(new Object[0], this, f38809a, false, 30796, new Class[0], f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[0], this, f38809a, false, 30796, new Class[0], f.class);
        }
        l c2 = l.c();
        Intrinsics.checkExpressionValueIsNotNull(c2, "WebOfflineConfig.getInstance()");
        return ((d) ServiceManager.get().getService(d.class)).a(c2.g());
    }

    public final int a(@NotNull String str) {
        boolean z;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f38809a, false, 30794, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, this, f38809a, false, 30794, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(str2, "siteId");
        f b2 = b();
        if (b2 == null) {
            return 0;
        }
        f c2 = f38813e.c();
        if (c2 != null) {
            z = c2.b("shadow_landing");
        } else {
            z = false;
        }
        boolean b3 = b2.b("ad_landing_" + str2);
        if (z && b3) {
            return 3;
        }
        if (z && !b3) {
            return 1;
        }
        if (z || !b3) {
            return 0;
        }
        return 2;
    }

    public final long a(com.bytedance.ies.geckoclient.model.d dVar) {
        com.bytedance.ies.geckoclient.model.d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, f38809a, false, 30795, new Class[]{com.bytedance.ies.geckoclient.model.d.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{dVar2}, this, f38809a, false, 30795, new Class[]{com.bytedance.ies.geckoclient.model.d.class}, Long.TYPE)).longValue();
        }
        j jVar = dVar2.j;
        Intrinsics.checkExpressionValueIsNotNull(jVar, "geckoPackage.updatePackage");
        return jVar.f20815e;
    }

    public final void a(@Nullable List<? extends Aweme> list) {
        boolean z;
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{list}, this, f38809a, false, 30786, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f38809a, false, 30786, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            for (Aweme aweme : list) {
                if (aweme != null) {
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    if (awemeRawAd != null) {
                        c preloadData = awemeRawAd.getPreloadData();
                        if (preloadData != null) {
                            String siteId = preloadData.getSiteId();
                            if (siteId != null) {
                                if (siteId.length() > 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2 && awemeRawAd.getPreloadWeb() == 4) {
                                    objectRef.element = "ad_landing_" + awemeRawAd.getPreloadData().getSiteId();
                                    f b2 = f38813e.b();
                                    if (b2 != null) {
                                        b2.a((String) objectRef.element, (com.bytedance.ies.geckoclient.c.a) new b());
                                    }
                                    Map map = f38811c;
                                    String str = (String) objectRef.element;
                                    String siteId2 = awemeRawAd.getPreloadData().getSiteId();
                                    if (siteId2 == null) {
                                        Intrinsics.throwNpe();
                                    }
                                    Long creativeId = awemeRawAd.getCreativeId();
                                    Intrinsics.checkExpressionValueIsNotNull(creativeId, "it.creativeId");
                                    map.put(str, new d(siteId2, creativeId.longValue(), awemeRawAd.getLogExtra()));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static int a(com.bytedance.ies.geckoclient.model.d dVar, boolean z) {
        if (dVar.j != null && z) {
            return 1;
        }
        if (dVar.f20789a == 0) {
            return 0;
        }
        return 2;
    }

    public final void a(@Nullable List<? extends com.bytedance.ies.geckoclient.model.d> list, boolean z) {
        boolean z2 = z;
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f38809a, false, 30787, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f38809a, false, 30787, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z3 = true;
        }
        if (!z3) {
            for (com.bytedance.ies.geckoclient.model.d dVar : list) {
                if (a().contains(dVar.f20791c)) {
                    HashMap hashMap = new HashMap();
                    Map map = hashMap;
                    map.put("site_id", "common");
                    map.put("response_status", Integer.valueOf(a(dVar, z2)));
                    com.ss.android.ugc.aweme.commercialize.log.d.a().b("ad_landing_channel_query").a("ad_wap_stat").a((Object) hashMap).b();
                    return;
                }
                d dVar2 = f38811c.get(dVar.f20791c);
                if (dVar2 != null) {
                    HashMap hashMap2 = new HashMap();
                    Map map2 = hashMap2;
                    map2.put("site_id", dVar2.f38822d);
                    map2.put("response_status", Integer.valueOf(a(dVar, z2)));
                    com.ss.android.ugc.aweme.commercialize.log.d.a().b("ad_landing_channel_query").a("ad_wap_stat").a(Long.valueOf(dVar2.f38823e)).g(dVar2.f38824f).a((Object) hashMap2).b();
                    return;
                }
            }
        }
    }
}
