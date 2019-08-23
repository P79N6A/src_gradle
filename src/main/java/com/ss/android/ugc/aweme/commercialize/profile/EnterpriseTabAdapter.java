package com.ss.android.ugc.aweme.commercialize.profile;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\rH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\rH\u0016J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/profile/EnterpriseTabAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/ss/android/ugc/aweme/commercialize/profile/EnterpriseTabAdapter$HomeView;", "context", "Landroid/app/Activity;", "url", "", "isMyFragment", "", "(Landroid/app/Activity;Ljava/lang/String;Z)V", "reactView", "Lcom/ss/android/ugc/aweme/crossplatform/view/CrossPlatformWebView;", "getItemCount", "", "getReactView", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setUrl", "HomeView", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class EnterpriseTabAdapter extends RecyclerView.Adapter<HomeView> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39412a;

    /* renamed from: b  reason: collision with root package name */
    public CrossPlatformWebView f39413b;

    /* renamed from: c  reason: collision with root package name */
    private final Activity f39414c;

    /* renamed from: d  reason: collision with root package name */
    private String f39415d = null;

    /* renamed from: e  reason: collision with root package name */
    private boolean f39416e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/profile/EnterpriseTabAdapter$HomeView;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Lcom/ss/android/ugc/aweme/crossplatform/view/CrossPlatformWebView;", "(Lcom/ss/android/ugc/aweme/crossplatform/view/CrossPlatformWebView;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class HomeView extends RecyclerView.ViewHolder {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HomeView(@NotNull CrossPlatformWebView crossPlatformWebView) {
            super(crossPlatformWebView);
            Intrinsics.checkParameterIsNotNull(crossPlatformWebView, "itemView");
        }
    }

    public final int getItemCount() {
        return 1;
    }

    public final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f39412a, false, 31935, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f39412a, false, 31935, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, PushConstants.WEB_URL);
        this.f39415d = str2;
    }

    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        HomeView homeView;
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f39412a, false, 31933, new Class[]{ViewGroup.class, Integer.TYPE}, HomeView.class)) {
            homeView = (HomeView) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f39412a, false, 31933, new Class[]{ViewGroup.class, Integer.TYPE}, HomeView.class);
        } else {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            CrossPlatformWebView crossPlatformWebView = new CrossPlatformWebView(this.f39414c, null, 0, 6, null);
            this.f39413b = crossPlatformWebView;
            CrossPlatformWebView crossPlatformWebView2 = this.f39413b;
            if (crossPlatformWebView2 == null) {
                Intrinsics.throwNpe();
            }
            new HomeView(crossPlatformWebView2);
        }
        return homeView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ee A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder r19, int r20) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            com.ss.android.ugc.aweme.commercialize.profile.EnterpriseTabAdapter$HomeView r8 = (com.ss.android.ugc.aweme.commercialize.profile.EnterpriseTabAdapter.HomeView) r8
            r9 = 2
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            r11 = 1
            r0[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f39412a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.profile.EnterpriseTabAdapter$HomeView> r1 = com.ss.android.ugc.aweme.commercialize.profile.EnterpriseTabAdapter.HomeView.class
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 31934(0x7cbe, float:4.4749E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x004d
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            r0[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f39412a
            r3 = 0
            r4 = 31934(0x7cbe, float:4.4749E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.profile.EnterpriseTabAdapter$HomeView> r1 = com.ss.android.ugc.aweme.commercialize.profile.EnterpriseTabAdapter.HomeView.class
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x004d:
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            android.view.View r0 = r8.itemView
            if (r0 == 0) goto L_0x00ef
            boolean r0 = com.ss.android.g.a.a()
            if (r0 == 0) goto L_0x007d
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.bridgeservice.IBridgeService> r1 = com.ss.android.ugc.aweme.bridgeservice.IBridgeService.class
            java.lang.Object r0 = r0.getService(r1)
            java.lang.String r1 = "ServiceManager.get().get…ridgeService::class.java)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r0 = (com.ss.android.ugc.aweme.bridgeservice.IBridgeService) r0
            boolean r0 = r0.isHaveLatestTab()
            if (r0 == 0) goto L_0x007d
            r0 = 4631530004285489152(0x4046800000000000, double:45.0)
            int r0 = com.ss.android.ugc.aweme.base.utils.u.a((double) r0)
            goto L_0x007e
        L_0x007d:
            r0 = 0
        L_0x007e:
            android.app.Activity r1 = r7.f39414c
            android.content.Context r1 = (android.content.Context) r1
            int r1 = com.ss.android.ugc.aweme.base.utils.p.e(r1)
            int r2 = com.ss.android.ugc.aweme.base.utils.p.c()
            int r1 = r1 - r2
            android.app.Activity r2 = r7.f39414c
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131427990(0x7f0b0296, float:1.8477612E38)
            float r2 = r2.getDimension(r3)
            int r2 = (int) r2
            int r1 = r1 - r2
            int r1 = r1 - r0
            r2 = 4630826316843712512(0x4044000000000000, double:40.0)
            int r0 = com.ss.android.ugc.aweme.base.utils.u.a((double) r2)
            int r1 = r1 - r0
            boolean r0 = r7.f39416e
            if (r0 == 0) goto L_0x00b5
            android.app.Activity r0 = r7.f39414c
            android.content.res.Resources r0 = r0.getResources()
            r2 = 2131427794(0x7f0b01d2, float:1.8477214E38)
            float r0 = r0.getDimension(r2)
            int r0 = (int) r0
            int r1 = r1 - r0
        L_0x00b5:
            android.view.View r0 = r8.itemView
            java.lang.String r2 = "holder.itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = (com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView) r0
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            android.app.Activity r3 = r7.f39414c
            android.content.Context r3 = (android.content.Context) r3
            int r3 = com.ss.android.ugc.aweme.base.utils.p.b(r3)
            r2.<init>(r3, r1)
            r0.setLayoutParams(r2)
            java.lang.String r0 = r7.f39415d
            if (r0 == 0) goto L_0x00ee
            android.view.View r1 = r8.itemView
            r12 = r1
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r12 = (com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView) r12
            r13 = 1
            r14 = 0
            r1 = 4635329916471083008(0x4054000000000000, double:80.0)
            int r15 = com.ss.android.ugc.aweme.base.utils.u.a((double) r1)
            r16 = 0
            r17 = 0
            r12.a((int) r13, (int) r14, (int) r15, (int) r16, (int) r17)
            android.view.View r1 = r8.itemView
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r1 = (com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView) r1
            r1.a((java.lang.String) r0, (boolean) r10, (boolean) r11)
            return
        L_0x00ee:
            return
        L_0x00ef:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.profile.EnterpriseTabAdapter.onBindViewHolder(android.support.v7.widget.RecyclerView$ViewHolder, int):void");
    }

    public EnterpriseTabAdapter(@NotNull Activity activity, @Nullable String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(activity, "context");
        this.f39414c = activity;
        this.f39416e = z;
    }
}
