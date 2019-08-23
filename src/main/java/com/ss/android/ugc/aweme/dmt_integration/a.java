package com.ss.android.ugc.aweme.dmt_integration;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.f;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.ab;
import com.ss.android.ugc.aweme.port.in.ac;
import com.ss.android.ugc.aweme.port.in.ad;
import com.ss.android.ugc.aweme.port.in.ae;
import com.ss.android.ugc.aweme.port.in.af;
import com.ss.android.ugc.aweme.port.in.ag;
import com.ss.android.ugc.aweme.port.in.ah;
import com.ss.android.ugc.aweme.port.in.ai;
import com.ss.android.ugc.aweme.port.in.aj;
import com.ss.android.ugc.aweme.port.in.ak;
import com.ss.android.ugc.aweme.port.in.al;
import com.ss.android.ugc.aweme.port.in.am;
import com.ss.android.ugc.aweme.port.in.an;
import com.ss.android.ugc.aweme.port.in.ao;
import com.ss.android.ugc.aweme.port.in.ap;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.port.in.j;
import com.ss.android.ugc.aweme.port.in.k;
import com.ss.android.ugc.aweme.port.in.m;
import com.ss.android.ugc.aweme.port.in.n;
import com.ss.android.ugc.aweme.port.in.o;
import com.ss.android.ugc.aweme.port.in.p;
import com.ss.android.ugc.aweme.port.in.q;
import com.ss.android.ugc.aweme.port.in.r;
import com.ss.android.ugc.aweme.port.in.s;
import com.ss.android.ugc.aweme.port.in.t;
import com.ss.android.ugc.aweme.port.in.u;
import com.ss.android.ugc.aweme.port.in.w;
import com.ss.android.ugc.aweme.port.in.y;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.privacysetting.IAVPrivacySettingService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\n\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\n\u0010 \u001a\u0004\u0018\u00010!H\u0016J\n\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\n\u0010$\u001a\u0004\u0018\u00010%H\u0016J\n\u0010&\u001a\u0004\u0018\u00010'H\u0016J\n\u0010(\u001a\u0004\u0018\u00010)H\u0016J\n\u0010*\u001a\u0004\u0018\u00010+H\u0016J\n\u0010,\u001a\u0004\u0018\u00010-H\u0016J\n\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00100\u001a\u000201H\u0016J\n\u00102\u001a\u0004\u0018\u000103H\u0016J\n\u00104\u001a\u0004\u0018\u000105H\u0016J\b\u00106\u001a\u00020\u0004H\u0016J\n\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u00109\u001a\u00020\u000fH\u0016J\n\u0010:\u001a\u0004\u0018\u00010;H\u0016J\b\u0010<\u001a\u00020\nH\u0016J\n\u0010=\u001a\u0004\u0018\u00010>H\u0016J\n\u0010?\u001a\u0004\u0018\u00010@H\u0016J\n\u0010A\u001a\u0004\u0018\u00010BH\u0016J\n\u0010C\u001a\u0004\u0018\u00010DH\u0016J\n\u0010E\u001a\u0004\u0018\u00010FH\u0016J\n\u0010G\u001a\u0004\u0018\u00010HH\u0016J\n\u0010I\u001a\u0004\u0018\u00010JH\u0016J\n\u0010K\u001a\u0004\u0018\u00010LH\u0016J\n\u0010M\u001a\u0004\u0018\u00010NH\u0016J\b\u0010O\u001a\u00020PH\u0016J\b\u0010Q\u001a\u00020RH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0015\u0010\u0016¨\u0006S"}, d2 = {"Lcom/ss/android/ugc/aweme/dmt_integration/AVEnvImpl;", "Lcom/ss/android/ugc/aweme/port/in/IAVEnvApi;", "()V", "avMusicService", "Lcom/ss/android/ugc/aweme/toolsport/IAVMusicService;", "getAvMusicService", "()Lcom/ss/android/ugc/aweme/toolsport/IAVMusicService;", "avMusicService$delegate", "Lkotlin/Lazy;", "avPrivacySettingService", "Lcom/ss/android/ugc/aweme/services/privacysetting/IAVPrivacySettingService;", "getAvPrivacySettingService", "()Lcom/ss/android/ugc/aweme/services/privacysetting/IAVPrivacySettingService;", "avPrivacySettingService$delegate", "permission", "Lcom/ss/android/ugc/aweme/port/in/IPermissionService;", "getPermission", "()Lcom/ss/android/ugc/aweme/port/in/IPermissionService;", "permission$delegate", "proxy", "Lcom/ss/android/ugc/aweme/services/IAVServiceProxy;", "getProxy", "()Lcom/ss/android/ugc/aweme/services/IAVServiceProxy;", "proxy$delegate", "getABService", "Lcom/ss/android/ugc/aweme/port/in/IABTestService;", "getAVConverter", "Lcom/ss/android/ugc/aweme/port/in/IAVConverter;", "getAccountService", "Lcom/ss/android/ugc/aweme/account/IAccountService;", "getApplicationService", "Lcom/ss/android/ugc/aweme/port/in/IApplicationService;", "getBridgeService", "Lcom/ss/android/ugc/aweme/port/in/IBridgeService;", "getBusinessGoodsService", "Lcom/ss/android/ugc/aweme/port/in/IBusinessGoodsService;", "getCaptureService", "Lcom/ss/android/ugc/aweme/port/in/ICaptchaService;", "getChallengeService", "Lcom/ss/android/ugc/aweme/port/in/IChallengeService;", "getCommerceService", "Lcom/ss/android/ugc/aweme/port/in/ICommerceService;", "getDuoShanService", "Lcom/ss/android/ugc/aweme/port/in/IDuoShanService;", "getHashTagService", "Lcom/ss/android/ugc/aweme/port/in/IHashTagService;", "getIMService", "Lcom/ss/android/ugc/aweme/port/in/IIMService;", "getIStickerPropService", "Lcom/ss/android/ugc/aweme/port/in/IStickerPropService;", "getLiveService", "Lcom/ss/android/ugc/aweme/port/in/ILiveService;", "getLocationService", "Lcom/ss/android/ugc/aweme/port/in/ILocationService;", "getMusicService", "getNetworkService", "Lcom/ss/android/ugc/aweme/port/in/INetworkService;", "getPermissionService", "getPoiService", "Lcom/ss/android/ugc/aweme/port/in/IPoiService;", "getPrivacySettingService", "getPublishService", "Lcom/ss/android/ugc/aweme/port/in/IPublishService;", "getSPService", "Lcom/ss/android/ugc/aweme/port/in/ISharePrefService;", "getSettingService", "Lcom/ss/android/ugc/aweme/port/in/ISettingService;", "getStickerShareService", "Lcom/ss/android/ugc/aweme/port/in/IStickerShareService;", "getStoryPublishService", "Lcom/ss/android/ugc/aweme/port/in/IStoryPublishService;", "getSummonFriendService", "Lcom/ss/android/ugc/aweme/port/in/ISummonFriendService;", "getSyncShareService", "Lcom/ss/android/ugc/aweme/port/in/ISyncShareService;", "getTimeLockService", "Lcom/ss/android/ugc/aweme/port/in/ITimeLockService;", "getToolsComponentService", "Lcom/ss/android/ugc/aweme/port/in/IToolsComponentService;", "openSDKService", "Lcom/ss/android/ugc/aweme/port/in/IOpenSDKShareService;", "unlockStickerService", "Lcom/ss/android/ugc/aweme/port/in/IUnlockStickerService;", "tools.dmt-integration_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a implements k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43345a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f43346b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "proxy", "getProxy()Lcom/ss/android/ugc/aweme/services/IAVServiceProxy;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "avMusicService", "getAvMusicService()Lcom/ss/android/ugc/aweme/toolsport/IAVMusicService;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "avPrivacySettingService", "getAvPrivacySettingService()Lcom/ss/android/ugc/aweme/services/privacysetting/IAVPrivacySettingService;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "permission", "getPermission()Lcom/ss/android/ugc/aweme/port/in/IPermissionService;"))};

    /* renamed from: c  reason: collision with root package name */
    private final Lazy f43347c = LazyKt.lazy(d.INSTANCE);

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f43348d = LazyKt.lazy(C0544a.INSTANCE);

    /* renamed from: e  reason: collision with root package name */
    private final Lazy f43349e = LazyKt.lazy(b.INSTANCE);

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f43350f = LazyKt.lazy(c.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/tools/music/MusicServiceImpl;", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$a  reason: collision with other inner class name */
    static final class C0544a extends Lambda implements Function0<com.ss.android.ugc.aweme.tools.music.a> {
        public static final C0544a INSTANCE = new C0544a();
        public static ChangeQuickRedirect changeQuickRedirect;

        C0544a() {
            super(0);
        }

        @NotNull
        public final com.ss.android.ugc.aweme.tools.music.a invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 38331, new Class[0], com.ss.android.ugc.aweme.tools.music.a.class)) {
                return new com.ss.android.ugc.aweme.tools.music.a();
            }
            return (com.ss.android.ugc.aweme.tools.music.a) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 38331, new Class[0], com.ss.android.ugc.aweme.tools.music.a.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/servicimpl/PrivacySettingServiceImpl;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<com.ss.android.ugc.aweme.ai.b> {
        public static final b INSTANCE = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
            super(0);
        }

        @NotNull
        public final com.ss.android.ugc.aweme.ai.b invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 38332, new Class[0], com.ss.android.ugc.aweme.ai.b.class)) {
                return new com.ss.android.ugc.aweme.ai.b();
            }
            return (com.ss.android.ugc.aweme.ai.b) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 38332, new Class[0], com.ss.android.ugc.aweme.ai.b.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/servicimpl/PermissionServiceImpl;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<com.ss.android.ugc.aweme.ai.a> {
        public static final c INSTANCE = new c();
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
            super(0);
        }

        @NotNull
        public final com.ss.android.ugc.aweme.ai.a invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 38333, new Class[0], com.ss.android.ugc.aweme.ai.a.class)) {
                return new com.ss.android.ugc.aweme.ai.a();
            }
            return (com.ss.android.ugc.aweme.ai.a) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 38333, new Class[0], com.ss.android.ugc.aweme.ai.a.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/services/IAVServiceProxy;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function0<IAVServiceProxy> {
        public static final d INSTANCE = new d();
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
            super(0);
        }

        @NotNull
        public final IAVServiceProxy invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 38334, new Class[0], IAVServiceProxy.class)) {
                return (IAVServiceProxy) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 38334, new Class[0], IAVServiceProxy.class);
            }
            IAVServiceProxy iAVServiceProxy = (IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class);
            if (iAVServiceProxy != null) {
                return iAVServiceProxy;
            }
            throw new RuntimeException("IAVServiceProxy should be set, before use AVEnv.");
        }
    }

    private final IAVServiceProxy F() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f43345a, false, 38296, new Class[0], IAVServiceProxy.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f43345a, false, 38296, new Class[0], IAVServiceProxy.class);
        } else {
            value = this.f43347c.getValue();
        }
        return (IAVServiceProxy) value;
    }

    @NotNull
    public final ai B() {
        if (PatchProxy.isSupport(new Object[0], this, f43345a, false, 38327, new Class[0], ai.class)) {
            return (ai) PatchProxy.accessDispatch(new Object[0], this, f43345a, false, 38327, new Class[0], ai.class);
        }
        ai iStickerPropService = F().getIStickerPropService();
        Intrinsics.checkExpressionValueIsNotNull(iStickerPropService, "proxy.iStickerPropService");
        return iStickerPropService;
    }

    @NotNull
    public final ap C() {
        if (PatchProxy.isSupport(new Object[0], this, f43345a, false, 38328, new Class[0], ap.class)) {
            return (ap) PatchProxy.accessDispatch(new Object[0], this, f43345a, false, 38328, new Class[0], ap.class);
        }
        ap unlockStickerService = F().unlockStickerService();
        Intrinsics.checkExpressionValueIsNotNull(unlockStickerService, "proxy.unlockStickerService()");
        return unlockStickerService;
    }

    @NotNull
    public final ac D() {
        if (PatchProxy.isSupport(new Object[0], this, f43345a, false, 38329, new Class[0], ac.class)) {
            return (ac) PatchProxy.accessDispatch(new Object[0], this, f43345a, false, 38329, new Class[0], ac.class);
        }
        ac openSDKService = F().openSDKService();
        Intrinsics.checkExpressionValueIsNotNull(openSDKService, "proxy.openSDKService()");
        return openSDKService;
    }

    @Nullable
    public final m a() {
        if (!PatchProxy.isSupport(new Object[0], this, f43345a, false, 38300, new Class[0], m.class)) {
            return F().getApplicationService();
        }
        return (m) PatchProxy.accessDispatch(new Object[0], this, f43345a, false, 38300, new Class[0], m.class);
    }

    @Nullable
    public final q b() {
        if (!PatchProxy.isSupport(new Object[0], this, f43345a, false, 38301, new Class[0], q.class)) {
            return F().getChallengeService();
        }
        return (q) PatchProxy.accessDispatch(new Object[0], this, f43345a, false, 38301, new Class[0], q.class);
    }

    @Nullable
    public final al c() {
        if (!PatchProxy.isSupport(new Object[0], this, f43345a, false, 38302, new Class[0], al.class)) {
            return F().getSummonFriendService();
        }
        return (al) PatchProxy.accessDispatch(new Object[0], this, f43345a, false, 38302, new Class[0], al.class);
    }

    @Nullable
    public final p d() {
        if (!PatchProxy.isSupport(new Object[0], this, f43345a, false, 38303, new Class[0], p.class)) {
            return F().getCaptureService();
        }
        return (p) PatchProxy.accessDispatch(new Object[0], this, f43345a, false, 38303, new Class[0], p.class);
    }

    @Nullable
    public final y e() {
        if (!PatchProxy.isSupport(new Object[0], this, f43345a, false, 38304, new Class[0], y.class)) {
            return F().getLocationService();
        }
        return (y) PatchProxy.accessDispatch(new Object[0], this, f43345a, false, 38304, new Class[0], y.class);
    }

    @Nullable
    public final ao g() {
        if (!PatchProxy.isSupport(new Object[0], this, f43345a, false, 38306, new Class[0], ao.class)) {
            return F().getToolsComponentService();
        }
        return (ao) PatchProxy.accessDispatch(new Object[0], this, f43345a, false, 38306, new Class[0], ao.class);
    }

    @Nullable
    public final af h() {
        if (!PatchProxy.isSupport(new Object[0], this, f43345a, false, 38307, new Class[0], af.class)) {
            return F().getPublishService();
        }
        return (af) PatchProxy.accessDispatch(new Object[0], this, f43345a, false, 38307, new Class[0], af.class);
    }

    @Nullable
    public final i i() {
        if (!PatchProxy.isSupport(new Object[0], this, f43345a, false, 38308, new Class[0], i.class)) {
            return F().getABService();
        }
        return (i) PatchProxy.accessDispatch(new Object[0], this, f43345a, false, 38308, new Class[0], i.class);
    }

    @Nullable
    public final t j() {
        if (!PatchProxy.isSupport(new Object[0], this, f43345a, false, 38309, new Class[0], t.class)) {
            return F().getHashTagService();
        }
        return (t) PatchProxy.accessDispatch(new Object[0], this, f43345a, false, 38309, new Class[0], t.class);
    }

    @Nullable
    public final am k() {
        if (!PatchProxy.isSupport(new Object[0], this, f43345a, false, 38310, new Class[0], am.class)) {
            return F().getSyncShareService();
        }
        return (am) PatchProxy.accessDispatch(new Object[0], this, f43345a, false, 38310, new Class[0], am.class);
    }

    @Nullable
    public final ae l() {
        if (!PatchProxy.isSupport(new Object[0], this, f43345a, false, 38311, new Class[0], ae.class)) {
            return F().getPoiService();
        }
        return (ae) PatchProxy.accessDispatch(new Object[0], this, f43345a, false, 38311, new Class[0], ae.class);
    }

    @Nullable
    public final r m() {
        if (!PatchProxy.isSupport(new Object[0], this, f43345a, false, 38312, new Class[0], r.class)) {
            return F().getCommerceService();
        }
        return (r) PatchProxy.accessDispatch(new Object[0], this, f43345a, false, 38312, new Class[0], r.class);
    }

    @Nullable
    public final ah n() {
        if (!PatchProxy.isSupport(new Object[0], this, f43345a, false, 38313, new Class[0], ah.class)) {
            return F().getSpServcie();
        }
        return (ah) PatchProxy.accessDispatch(new Object[0], this, f43345a, false, 38313, new Class[0], ah.class);
    }

    @Nullable
    public final w o() {
        if (!PatchProxy.isSupport(new Object[0], this, f43345a, false, 38314, new Class[0], w.class)) {
            return F().getLiveService();
        }
        return (w) PatchProxy.accessDispatch(new Object[0], this, f43345a, false, 38314, new Class[0], w.class);
    }

    @Nullable
    public final n p() {
        if (!PatchProxy.isSupport(new Object[0], this, f43345a, false, 38315, new Class[0], n.class)) {
            return F().getBridgeService();
        }
        return (n) PatchProxy.accessDispatch(new Object[0], this, f43345a, false, 38315, new Class[0], n.class);
    }

    @Nullable
    public final an q() {
        if (!PatchProxy.isSupport(new Object[0], this, f43345a, false, 38316, new Class[0], an.class)) {
            return F().getTimeLockService();
        }
        return (an) PatchProxy.accessDispatch(new Object[0], this, f43345a, false, 38316, new Class[0], an.class);
    }

    @Nullable
    public final f r() {
        if (!PatchProxy.isSupport(new Object[0], this, f43345a, false, 38317, new Class[0], f.class)) {
            return F().getAccountService();
        }
        return (f) PatchProxy.accessDispatch(new Object[0], this, f43345a, false, 38317, new Class[0], f.class);
    }

    @Nullable
    public final aj s() {
        if (!PatchProxy.isSupport(new Object[0], this, f43345a, false, 38318, new Class[0], aj.class)) {
            return F().getStickerShareService();
        }
        return (aj) PatchProxy.accessDispatch(new Object[0], this, f43345a, false, 38318, new Class[0], aj.class);
    }

    @Nullable
    public final ak t() {
        if (!PatchProxy.isSupport(new Object[0], this, f43345a, false, 38319, new Class[0], ak.class)) {
            return F().getStoryPublishService();
        }
        return (ak) PatchProxy.accessDispatch(new Object[0], this, f43345a, false, 38319, new Class[0], ak.class);
    }

    @Nullable
    public final u u() {
        if (!PatchProxy.isSupport(new Object[0], this, f43345a, false, 38320, new Class[0], u.class)) {
            return F().getIMService();
        }
        return (u) PatchProxy.accessDispatch(new Object[0], this, f43345a, false, 38320, new Class[0], u.class);
    }

    @Nullable
    public final s v() {
        if (!PatchProxy.isSupport(new Object[0], this, f43345a, false, 38321, new Class[0], s.class)) {
            return F().getDuoShanService();
        }
        return (s) PatchProxy.accessDispatch(new Object[0], this, f43345a, false, 38321, new Class[0], s.class);
    }

    @Nullable
    public final ag w() {
        if (!PatchProxy.isSupport(new Object[0], this, f43345a, false, 38322, new Class[0], ag.class)) {
            return F().getSettingService();
        }
        return (ag) PatchProxy.accessDispatch(new Object[0], this, f43345a, false, 38322, new Class[0], ag.class);
    }

    @Nullable
    public final ab x() {
        if (!PatchProxy.isSupport(new Object[0], this, f43345a, false, 38323, new Class[0], ab.class)) {
            return F().getNetworkService();
        }
        return (ab) PatchProxy.accessDispatch(new Object[0], this, f43345a, false, 38323, new Class[0], ab.class);
    }

    @Nullable
    public final j y() {
        if (!PatchProxy.isSupport(new Object[0], this, f43345a, false, 38324, new Class[0], j.class)) {
            return F().getAVConverter();
        }
        return (j) PatchProxy.accessDispatch(new Object[0], this, f43345a, false, 38324, new Class[0], j.class);
    }

    @Nullable
    public final o z() {
        if (!PatchProxy.isSupport(new Object[0], this, f43345a, false, 38325, new Class[0], o.class)) {
            return F().getBusinessGoodsService();
        }
        return (o) PatchProxy.accessDispatch(new Object[0], this, f43345a, false, 38325, new Class[0], o.class);
    }

    @NotNull
    public final IAVPrivacySettingService A() {
        if (PatchProxy.isSupport(new Object[0], this, f43345a, false, 38326, new Class[0], IAVPrivacySettingService.class)) {
            return (IAVPrivacySettingService) PatchProxy.accessDispatch(new Object[0], this, f43345a, false, 38326, new Class[0], IAVPrivacySettingService.class);
        }
        if (!PatchProxy.isSupport(new Object[0], this, f43345a, false, 38298, new Class[0], IAVPrivacySettingService.class)) {
            return (IAVPrivacySettingService) this.f43349e.getValue();
        }
        return (IAVPrivacySettingService) PatchProxy.accessDispatch(new Object[0], this, f43345a, false, 38298, new Class[0], IAVPrivacySettingService.class);
    }

    @NotNull
    public final ad E() {
        if (PatchProxy.isSupport(new Object[0], this, f43345a, false, 38330, new Class[0], ad.class)) {
            return (ad) PatchProxy.accessDispatch(new Object[0], this, f43345a, false, 38330, new Class[0], ad.class);
        }
        if (!PatchProxy.isSupport(new Object[0], this, f43345a, false, 38299, new Class[0], ad.class)) {
            return (ad) this.f43350f.getValue();
        }
        return (ad) PatchProxy.accessDispatch(new Object[0], this, f43345a, false, 38299, new Class[0], ad.class);
    }

    @NotNull
    public final com.ss.android.ugc.aweme.ao.a f() {
        if (PatchProxy.isSupport(new Object[0], this, f43345a, false, 38305, new Class[0], com.ss.android.ugc.aweme.ao.a.class)) {
            return (com.ss.android.ugc.aweme.ao.a) PatchProxy.accessDispatch(new Object[0], this, f43345a, false, 38305, new Class[0], com.ss.android.ugc.aweme.ao.a.class);
        }
        if (!PatchProxy.isSupport(new Object[0], this, f43345a, false, 38297, new Class[0], com.ss.android.ugc.aweme.ao.a.class)) {
            return (com.ss.android.ugc.aweme.ao.a) this.f43348d.getValue();
        }
        return (com.ss.android.ugc.aweme.ao.a) PatchProxy.accessDispatch(new Object[0], this, f43345a, false, 38297, new Class[0], com.ss.android.ugc.aweme.ao.a.class);
    }
}
