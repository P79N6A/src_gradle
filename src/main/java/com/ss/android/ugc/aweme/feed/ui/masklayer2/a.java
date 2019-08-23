package com.ss.android.ugc.aweme.feed.ui.masklayer2;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.listener.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.p;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AwemeSettings;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00016B!\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010$\u001a\u00020\fH\u0002J\n\u0010%\u001a\u0004\u0018\u00010&H\u0002J\n\u0010'\u001a\u0004\u0018\u00010(H\u0002J\b\u0010)\u001a\u00020(H\u0002J\n\u0010*\u001a\u0004\u0018\u00010(H\u0002J\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,J\b\u0010.\u001a\u00020\u001fH\u0002J\u0006\u0010/\u001a\u000200J\u0010\u00101\u001a\u00020\t2\u0006\u00102\u001a\u000203H\u0016J\u0012\u00104\u001a\u0002002\b\u00105\u001a\u0004\u0018\u00010\u0002H\u0016R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00067"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/ActionsManager;", "Lcom/ss/android/ugc/aweme/feed/event/OnInternalEventListener;", "Lcom/ss/android/ugc/aweme/feed/event/VideoEvent;", "Lcom/ss/android/ugc/aweme/feed/listener/IGetEnterFromListener;", "iOptionsDialog", "Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/IOptionsDialog;", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "enterFrom", "", "(Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/IOptionsDialog;Lcom/ss/android/ugc/aweme/feed/model/Aweme;Ljava/lang/String;)V", "mActionHandler", "Lcom/ss/android/ugc/aweme/feed/ui/FeedShareActionHandler;", "getMActionHandler", "()Lcom/ss/android/ugc/aweme/feed/ui/FeedShareActionHandler;", "setMActionHandler", "(Lcom/ss/android/ugc/aweme/feed/ui/FeedShareActionHandler;)V", "mAweme", "getMAweme", "()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "setMAweme", "(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)V", "mDialog", "getMDialog", "()Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/IOptionsDialog;", "mEnterFrom", "getMEnterFrom", "()Ljava/lang/String;", "setMEnterFrom", "(Ljava/lang/String;)V", "mShareStruct", "Lcom/ss/android/ugc/aweme/framework/services/IShareService$ShareStruct;", "getMShareStruct", "()Lcom/ss/android/ugc/aweme/framework/services/IShareService$ShareStruct;", "setMShareStruct", "(Lcom/ss/android/ugc/aweme/framework/services/IShareService$ShareStruct;)V", "createActionHandler", "createDislikeItem", "Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/DislikeItem;", "createDownloadItem", "Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/NormalItem;", "createFavoriteItem", "createNotInterestedItem", "createOptionsItem", "", "Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/Item;", "createShareStruct", "dismissDialog", "", "getEnterFrom", "eventV3", "", "onInternalEvent", "event", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a implements aa<ar>, c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46750a;
    public static final C0564a g = new C0564a((byte) 0);
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final k f46751b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public Aweme f46752c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public String f46753d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public p f46754e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public IShareService.ShareStruct f46755f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/ActionsManager$Companion;", "", "()V", "showDislikeItem", "", "showOptionsDialog", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a$a  reason: collision with other inner class name */
    public static final class C0564a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46756a;

        private C0564a() {
        }

        public /* synthetic */ C0564a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/feed/ui/masklayer2/ActionsManager$createDislikeItem$1", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/ss/android/ugc/aweme/setting/model/AwemeSettings$DislikeReason;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b extends TypeToken<List<? extends AwemeSettings.DislikeReason>> {
        b() {
        }
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f46750a, false, 43419, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46750a, false, 43419, new Class[0], Void.TYPE);
            return;
        }
        k kVar = this.f46751b;
        if (kVar != null) {
            kVar.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public final b a() {
        List<AwemeSettings.DislikeReason> list;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f46750a, false, 43415, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], this, f46750a, false, 43415, new Class[0], b.class);
        }
        C0564a aVar = g;
        if (PatchProxy.isSupport(new Object[0], aVar, C0564a.f46756a, false, 43422, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], aVar, C0564a.f46756a, false, 43422, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.g.a.a()) {
            AbTestManager a2 = AbTestManager.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
            if (a2.x() == 2) {
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        Aweme aweme = this.f46752c;
        if ((aweme != null && aweme.isAd()) || !TextUtils.equals(this.f46753d, "homepage_hot")) {
            return null;
        }
        try {
            x a3 = x.a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "CommonSharePrefCache.inst()");
            an<String> al = a3.al();
            Intrinsics.checkExpressionValueIsNotNull(al, "CommonSharePrefCache.inst().dislikeReasons");
            Object c2 = al.c();
            Intrinsics.checkExpressionValueIsNotNull(c2, "CommonSharePrefCache.inst().dislikeReasons.cache");
            list = (List) new Gson().fromJson((String) c2, new b().getType());
        } catch (Exception unused) {
            list = null;
        }
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        List arrayList = new ArrayList();
        if (list == null) {
            Intrinsics.throwNpe();
        }
        for (AwemeSettings.DislikeReason dislikeReason : list) {
            arrayList.add(new g(dislikeReason.id, dislikeReason.text));
        }
        return new b(new p(2130839673, C0906R.string.o0), arrayList, new c(this));
    }

    @NotNull
    public final String a(boolean z) {
        return this.f46753d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x014b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(@org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.feed.ui.masklayer2.k r8, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.feed.model.Aweme r9, @org.jetbrains.annotations.NotNull java.lang.String r10) {
        /*
            r7 = this;
            java.lang.String r0 = "enterFrom"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
            r7.<init>()
            r7.f46751b = r8
            r7.f46752c = r9
            r7.f46753d = r10
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f46750a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.feed.ui.p> r6 = com.ss.android.ugc.aweme.feed.ui.p.class
            r3 = 0
            r4 = 43413(0xa995, float:6.0835E-41)
            r1 = r7
            boolean r9 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r10 = 0
            if (r9 == 0) goto L_0x0037
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f46750a
            r3 = 0
            r4 = 43413(0xa995, float:6.0835E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.feed.ui.p> r6 = com.ss.android.ugc.aweme.feed.ui.p.class
            r1 = r7
            java.lang.Object r9 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            com.ss.android.ugc.aweme.feed.ui.p r9 = (com.ss.android.ugc.aweme.feed.ui.p) r9
            goto L_0x0075
        L_0x0037:
            boolean r9 = com.ss.android.g.a.a()
            if (r9 == 0) goto L_0x0053
            com.ss.android.ugc.aweme.feed.ui.p r9 = new com.ss.android.ugc.aweme.feed.ui.p
            com.ss.android.ugc.aweme.feed.ui.masklayer2.k r0 = r7.f46751b
            if (r0 == 0) goto L_0x0048
            android.content.Context r0 = r0.getContext()
            goto L_0x0049
        L_0x0048:
            r0 = r10
        L_0x0049:
            com.ss.android.ugc.aweme.base.utils.v.a((android.content.Context) r0)
            com.ss.android.ugc.aweme.forward.e.a.a()
            r9.<init>()
            goto L_0x0071
        L_0x0053:
            com.ss.android.ugc.aweme.feed.ui.p r9 = new com.ss.android.ugc.aweme.feed.ui.p
            com.ss.android.ugc.aweme.feed.ui.masklayer2.k r0 = r7.f46751b
            if (r0 == 0) goto L_0x005e
            android.content.Context r0 = r0.getContext()
            goto L_0x005f
        L_0x005e:
            r0 = r10
        L_0x005f:
            android.app.Activity r2 = com.ss.android.ugc.aweme.base.utils.v.a((android.content.Context) r0)
            r3 = r7
            com.ss.android.ugc.aweme.feed.f.aa r3 = (com.ss.android.ugc.aweme.feed.f.aa) r3
            java.lang.String r4 = r7.f46753d
            r5 = 0
            java.lang.String r6 = com.ss.android.ugc.aweme.forward.e.a.a()
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6)
        L_0x0071:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f46752c
            r9.f46811c = r0
        L_0x0075:
            r7.f46754e = r9
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f46750a
            r3 = 0
            r4 = 43414(0xa996, float:6.0836E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r6 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
            r1 = r7
            boolean r9 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r9 == 0) goto L_0x009f
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f46750a
            r3 = 0
            r4 = 43414(0xa996, float:6.0836E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r6 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
            r1 = r7
            java.lang.Object r8 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r8 = (com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct) r8
            goto L_0x0185
        L_0x009f:
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f46752c
            boolean r8 = com.ss.android.ugc.aweme.utils.bj.a(r8)
            if (r8 == 0) goto L_0x00d5
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f46752c
            if (r8 == 0) goto L_0x00b0
            com.ss.android.ugc.aweme.profile.model.User r8 = r8.getAuthor()
            goto L_0x00b1
        L_0x00b0:
            r8 = r10
        L_0x00b1:
            if (r8 == 0) goto L_0x011e
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f46752c
            if (r8 == 0) goto L_0x00bc
            java.util.List r8 = r8.getImageInfos()
            goto L_0x00bd
        L_0x00bc:
            r8 = r10
        L_0x00bd:
            if (r8 == 0) goto L_0x011e
            com.ss.android.ugc.aweme.feed.ui.masklayer2.k r8 = r7.f46751b
            if (r8 == 0) goto L_0x00c7
            android.content.Context r10 = r8.getContext()
        L_0x00c7:
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f46752c
            java.lang.String r9 = ""
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r8 = com.ss.android.ugc.aweme.feed.share.i.c(r10, r8, r9)
            java.lang.String r9 = "VideoShareStruct.createI…getContext(), mAweme, \"\")"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r8, r9)
            goto L_0x011c
        L_0x00d5:
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f46752c
            if (r8 == 0) goto L_0x00de
            com.ss.android.ugc.aweme.profile.model.User r8 = r8.getAuthor()
            goto L_0x00df
        L_0x00de:
            r8 = r10
        L_0x00df:
            if (r8 == 0) goto L_0x011e
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f46752c
            if (r8 == 0) goto L_0x00ea
            com.ss.android.ugc.aweme.feed.model.Video r8 = r8.getVideo()
            goto L_0x00eb
        L_0x00ea:
            r8 = r10
        L_0x00eb:
            if (r8 == 0) goto L_0x011e
            boolean r8 = com.ss.android.g.a.a()
            if (r8 == 0) goto L_0x0109
            com.ss.android.ugc.aweme.feed.ui.masklayer2.k r8 = r7.f46751b
            if (r8 == 0) goto L_0x00fb
            android.content.Context r10 = r8.getContext()
        L_0x00fb:
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f46752c
            java.lang.String r9 = r7.f46753d
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r8 = com.ss.android.ugc.aweme.feed.share.i.b(r10, r8, r9)
            java.lang.String r9 = "VideoShareStruct.createN…xt(), mAweme, mEnterFrom)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r8, r9)
            goto L_0x011c
        L_0x0109:
            com.ss.android.ugc.aweme.feed.ui.masklayer2.k r8 = r7.f46751b
            if (r8 == 0) goto L_0x0111
            android.content.Context r10 = r8.getContext()
        L_0x0111:
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f46752c
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r8 = com.ss.android.ugc.aweme.feed.share.i.a((android.content.Context) r10, (com.ss.android.ugc.aweme.feed.model.Aweme) r8)
            java.lang.String r9 = "VideoShareStruct.createN…og?.getContext(), mAweme)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r8, r9)
        L_0x011c:
            r7.f46755f = r8
        L_0x011e:
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r8 = r7.f46755f
            if (r8 != 0) goto L_0x0129
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r8 = new com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct
            r8.<init>()
            r7.f46755f = r8
        L_0x0129:
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r8 = r7.f46755f
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r7.f46752c
            java.lang.String r9 = com.ss.android.ugc.aweme.u.aa.a((com.ss.android.ugc.aweme.feed.model.Aweme) r9)
            r8.authorId = r9
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r8 = r7.f46755f
            java.lang.String r9 = r7.f46753d
            r8.enterFrom = r9
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r8 = r7.f46755f
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r7.f46752c
            java.lang.String r9 = com.ss.android.ugc.aweme.u.aa.o(r9)
            r8.contentType = r9
            java.lang.String r8 = r7.f46753d
            boolean r8 = com.ss.android.ugc.aweme.u.aa.c((java.lang.String) r8)
            if (r8 == 0) goto L_0x015f
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r8 = r7.f46755f
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r7.f46752c
            java.lang.String r9 = com.ss.android.ugc.aweme.u.aa.e((com.ss.android.ugc.aweme.feed.model.Aweme) r9)
            r8.poiId = r9
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r8 = r7.f46755f
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r7.f46752c
            java.lang.String r9 = com.ss.android.ugc.aweme.u.aa.h(r9)
            r8.poiType = r9
        L_0x015f:
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r8 = r7.f46755f
            java.lang.String r9 = com.ss.android.ugc.aweme.u.aa.a()
            r8.cityInfo = r9
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r8 = r7.f46755f
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r7.f46752c
            java.lang.String r9 = com.ss.android.ugc.aweme.u.aa.i(r9)
            r8.distnceInfo = r9
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r8 = r7.f46755f
            com.ss.android.ugc.aweme.feed.ai r9 = com.ss.android.ugc.aweme.feed.ai.a()
            com.ss.android.ugc.aweme.feed.model.Aweme r10 = r7.f46752c
            java.lang.String r10 = com.ss.android.ugc.aweme.u.aa.c((com.ss.android.ugc.aweme.feed.model.Aweme) r10)
            java.lang.String r9 = r9.a((java.lang.String) r10)
            r8.logPb = r9
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r8 = r7.f46755f
        L_0x0185:
            r7.f46755f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.<init>(com.ss.android.ugc.aweme.feed.ui.masklayer2.k, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):void");
    }
}
