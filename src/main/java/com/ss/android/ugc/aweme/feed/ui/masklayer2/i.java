package com.ss.android.ugc.aweme.feed.ui.masklayer2;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.favorites.c.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\tH\u0002J\u0018\u0010\r\u001a\u00020\t2\u000e\u0010\u000e\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0006\u0010\u0014\u001a\u00020\tR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/FavoriteAction;", "Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/OptionAction;", "Lcom/ss/android/ugc/aweme/favorites/presenter/ICollectActionView;", "actionsManager", "Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/ActionsManager;", "(Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/ActionsManager;)V", "mCollectActionPresenter", "Lcom/ss/android/ugc/aweme/favorites/presenter/CollectActionPresenter;", "doClick", "", "v", "Landroid/view/View;", "handleCollectAweme", "onCollectFailed", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onCollectSuccess", "response", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "showLogin", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class i extends o implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46777a;

    /* renamed from: b  reason: collision with root package name */
    private com.ss.android.ugc.aweme.favorites.c.a f46778b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onResultOK"}, k = 3, mv = {1, 1, 15})
    static final class a implements f {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46779a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f46780b;

        a(i iVar) {
            this.f46780b = iVar;
        }

        public final void a(Bundle bundle) {
            if (PatchProxy.isSupport(new Object[]{null}, this, f46779a, false, 43462, new Class[]{Bundle.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{null}, this, f46779a, false, 43462, new Class[]{Bundle.class}, Void.TYPE);
            }
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f46779a, false, 43461, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f46779a, false, 43461, new Class[0], Void.TYPE);
                return;
            }
            this.f46780b.a();
        }
    }

    public final void a(@Nullable Exception exc) {
    }

    public final void a() {
        String str;
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f46777a, false, 43459, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46777a, false, 43459, new Class[0], Void.TYPE);
            return;
        }
        if (this.f46778b == null) {
            this.f46778b = new com.ss.android.ugc.aweme.favorites.c.a();
        }
        com.ss.android.ugc.aweme.favorites.c.a aVar = this.f46778b;
        if (aVar != null) {
            aVar.a(this);
        }
        com.ss.android.ugc.aweme.favorites.c.a aVar2 = this.f46778b;
        if (aVar2 != null) {
            Object[] objArr = new Object[3];
            objArr[0] = 2;
            Aweme aweme = this.f46788f;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            objArr[1] = str;
            Aweme aweme2 = this.f46788f;
            if (aweme2 == null || !aweme2.isCollected()) {
                i = 1;
            }
            objArr[2] = Integer.valueOf(i);
            aVar2.a(objArr);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(@NotNull a aVar) {
        super(aVar);
        Intrinsics.checkParameterIsNotNull(aVar, "actionsManager");
    }

    public final void a(@Nullable BaseResponse baseResponse) {
        if (PatchProxy.isSupport(new Object[]{baseResponse}, this, f46777a, false, 43460, new Class[]{BaseResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseResponse}, this, f46777a, false, 43460, new Class[]{BaseResponse.class}, Void.TYPE);
            return;
        }
        Aweme aweme = this.f46788f;
        if (aweme != null) {
            aweme.setCollectStatus(true ^ aweme.isCollected() ? 1 : 0);
            com.ss.android.ugc.aweme.feed.a.a().d(aweme.getAid(), aweme.getCollectStatus());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e4, code lost:
        if (r0 == null) goto L_0x00e6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.NotNull android.view.View r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f46777a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 43457(0xa9c1, float:6.0896E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f46777a
            r3 = 0
            r4 = 43457(0xa9c1, float:6.0896E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            java.lang.String r0 = "v"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f46788f
            if (r0 == 0) goto L_0x0044
            boolean r0 = r0.isCollected()
            if (r0 != r7) goto L_0x0044
            java.lang.String r0 = "cancel_favourite_video"
            goto L_0x0046
        L_0x0044:
            java.lang.String r0 = "favourite_video"
        L_0x0046:
            com.ss.android.ugc.aweme.app.d.d r1 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = r9.g
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r9.f46788f
            r4 = 0
            if (r3 == 0) goto L_0x005e
            java.lang.String r3 = r3.getAid()
            goto L_0x005f
        L_0x005e:
            r3 = r4
        L_0x005f:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r9.f46788f
            if (r3 == 0) goto L_0x006d
            java.lang.String r4 = r3.getAuthorUid()
        L_0x006d:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r4)
            java.lang.String r2 = "log_pb"
            com.ss.android.ugc.aweme.feed.ai r3 = com.ss.android.ugc.aweme.feed.ai.a()
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r9.f46788f
            java.lang.String r4 = com.ss.android.ugc.aweme.u.aa.c((com.ss.android.ugc.aweme.feed.model.Aweme) r4)
            java.lang.String r3 = r3.a((java.lang.String) r4)
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "enter_method"
            java.lang.String r3 = "long_press"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f46788f
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.c.L(r0)
            if (r0 == 0) goto L_0x00a9
            android.content.Context r0 = r10.getContext()
            r1 = 2131558510(0x7f0d006e, float:1.8742338E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (int) r1)
            r0.a()
            goto L_0x011d
        L_0x00a9:
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.ss.android.ugc.aweme.account.d.a()
            java.lang.String r1 = "AccountUserProxyService.get()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto L_0x011a
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f46777a
            r3 = 0
            r4 = 43458(0xa9c2, float:6.0898E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00dc
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f46777a
            r3 = 0
            r4 = 43458(0xa9c2, float:6.0898E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x00dc:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f46788f
            if (r0 == 0) goto L_0x00e6
            java.lang.String r0 = r0.getAid()
            if (r0 != 0) goto L_0x00e8
        L_0x00e6:
            java.lang.String r0 = ""
        L_0x00e8:
            com.ss.android.ugc.aweme.framework.core.a r1 = com.ss.android.ugc.aweme.framework.core.a.b()
            java.lang.String r2 = "AppTracker.get()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.app.Activity r1 = r1.a()
            java.lang.String r2 = r9.g
            java.lang.String r3 = "click_favorite_video"
            com.ss.android.ugc.aweme.utils.ad r4 = com.ss.android.ugc.aweme.utils.ad.a()
            java.lang.String r5 = "group_id"
            com.ss.android.ugc.aweme.utils.ad r4 = r4.a((java.lang.String) r5, (java.lang.String) r0)
            java.lang.String r5 = "log_pb"
            java.lang.String r0 = com.ss.android.ugc.aweme.u.aa.g((java.lang.String) r0)
            com.ss.android.ugc.aweme.utils.ad r0 = r4.a((java.lang.String) r5, (java.lang.String) r0)
            android.os.Bundle r0 = r0.f75487b
            com.ss.android.ugc.aweme.feed.ui.masklayer2.i$a r4 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.i$a
            r4.<init>(r9)
            com.ss.android.ugc.aweme.base.component.f r4 = (com.ss.android.ugc.aweme.base.component.f) r4
            com.ss.android.ugc.aweme.login.e.a((android.app.Activity) r1, (java.lang.String) r2, (java.lang.String) r3, (android.os.Bundle) r0, (com.ss.android.ugc.aweme.base.component.f) r4)
            return
        L_0x011a:
            r9.a()
        L_0x011d:
            boolean r0 = com.ss.android.g.a.a()
            if (r0 == 0) goto L_0x0138
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            boolean r0 = r0.aW()
            if (r0 == 0) goto L_0x0138
            com.ss.android.ugc.aweme.base.sharedpref.f r0 = com.ss.android.ugc.aweme.base.sharedpref.e.d()
            java.lang.String r1 = "last_share_type"
            java.lang.String r2 = "TYPE_FAVORITE"
            r0.b((java.lang.String) r1, (java.lang.String) r2)
        L_0x0138:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.masklayer2.i.a(android.view.View):void");
    }
}
