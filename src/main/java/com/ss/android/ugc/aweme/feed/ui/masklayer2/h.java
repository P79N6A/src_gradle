package com.ss.android.ugc.aweme.feed.ui.masklayer2;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.feed.ui.p;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/DownloadAction;", "Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/OptionAction;", "actionsManager", "Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/ActionsManager;", "(Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/ActionsManager;)V", "mActionHandler", "Lcom/ss/android/ugc/aweme/feed/ui/FeedShareActionHandler;", "getMActionHandler", "()Lcom/ss/android/ugc/aweme/feed/ui/FeedShareActionHandler;", "setMActionHandler", "(Lcom/ss/android/ugc/aweme/feed/ui/FeedShareActionHandler;)V", "mShareStruct", "Lcom/ss/android/ugc/aweme/framework/services/IShareService$ShareStruct;", "getMShareStruct", "()Lcom/ss/android/ugc/aweme/framework/services/IShareService$ShareStruct;", "setMShareStruct", "(Lcom/ss/android/ugc/aweme/framework/services/IShareService$ShareStruct;)V", "doClick", "", "v", "Landroid/view/View;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class h extends o {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46774a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public p f46775b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public IShareService.ShareStruct f46776c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(@NotNull a aVar) {
        super(aVar);
        Intrinsics.checkParameterIsNotNull(aVar, "actionsManager");
        this.f46775b = aVar.f46754e;
        this.f46776c = aVar.f46755f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0114 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.NotNull android.view.View r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f46774a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 43456(0xa9c0, float:6.0895E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f46774a
            r3 = 0
            r4 = 43456(0xa9c0, float:6.0895E-41)
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
            java.lang.String r1 = "download"
            com.ss.android.ugc.aweme.app.d.d r2 = new com.ss.android.ugc.aweme.app.d.d
            r2.<init>()
            java.lang.String r3 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r9.f46788f
            r5 = 0
            if (r4 == 0) goto L_0x004c
            java.lang.String r4 = r4.getAid()
            goto L_0x004d
        L_0x004c:
            r4 = r5
        L_0x004d:
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r9.f46788f
            if (r4 == 0) goto L_0x005c
            java.lang.String r4 = r4.getAuthorUid()
            goto L_0x005d
        L_0x005c:
            r4 = r5
        L_0x005d:
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "enter_from"
            java.lang.String r4 = r9.g
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "download_type"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r9.f46788f
            if (r4 == 0) goto L_0x0074
            com.ss.android.ugc.aweme.profile.model.User r4 = r4.getAuthor()
            goto L_0x0075
        L_0x0074:
            r4 = r5
        L_0x0075:
            if (r4 == 0) goto L_0x00a1
            com.ss.android.ugc.aweme.IAccountUserService r4 = com.ss.android.ugc.aweme.account.d.a()
            java.lang.String r6 = "AccountUserProxyService.get()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r6)
            java.lang.String r4 = r4.getCurUserId()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r9.f46788f
            if (r6 == 0) goto L_0x0095
            com.ss.android.ugc.aweme.profile.model.User r6 = r6.getAuthor()
            if (r6 == 0) goto L_0x0095
            java.lang.String r6 = r6.getUid()
            goto L_0x0096
        L_0x0095:
            r6 = r5
        L_0x0096:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r4 = android.text.TextUtils.equals(r4, r6)
            if (r4 == 0) goto L_0x00a1
            java.lang.String r4 = "self"
            goto L_0x00a3
        L_0x00a1:
            java.lang.String r4 = "other"
        L_0x00a3:
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "download_method"
            java.lang.String r4 = "long_press_download"
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "log_pb"
            com.ss.android.ugc.aweme.feed.ai r4 = com.ss.android.ugc.aweme.feed.ai.a()
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r9.f46788f
            java.lang.String r6 = com.ss.android.ugc.aweme.u.aa.c((com.ss.android.ugc.aweme.feed.model.Aweme) r6)
            java.lang.String r4 = r4.a((java.lang.String) r6)
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "play_mode"
            com.ss.android.ugc.aweme.app.AwemeAppData r4 = com.ss.android.ugc.aweme.app.AwemeAppData.p()
            java.lang.String r6 = "AwemeAppData.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r6)
            boolean r4 = r4.ap
            if (r4 == 0) goto L_0x00d5
            java.lang.String r4 = "auto"
            goto L_0x00d7
        L_0x00d5:
            java.lang.String r4 = "normal"
        L_0x00d7:
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            com.ss.android.ugc.aweme.poi.e.h.a((com.ss.android.ugc.aweme.feed.model.Aweme) r0, (java.lang.String) r1, (com.ss.android.ugc.aweme.app.d.d) r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f46788f
            if (r0 == 0) goto L_0x0108
            boolean r0 = r0.isPreventDownload()
            if (r0 != r7) goto L_0x0108
            android.content.Context r0 = r10.getContext()
            android.content.Context r1 = r10.getContext()
            java.lang.String r2 = "v.context"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131559032(0x7f0d0278, float:1.8743397E38)
            java.lang.String r1 = r1.getString(r2)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.c((android.content.Context) r0, (java.lang.String) r1)
            r0.a()
            return
        L_0x0108:
            android.content.Context r0 = r10.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.f46788f
            boolean r0 = com.ss.android.ugc.aweme.feed.share.a.c.a((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1)
            if (r0 != 0) goto L_0x0115
            return
        L_0x0115:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f46788f
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.c.L(r0)
            if (r0 == 0) goto L_0x0132
            boolean r0 = com.ss.android.g.a.a()
            if (r0 != 0) goto L_0x0132
            android.content.Context r0 = r10.getContext()
            r1 = 2131558510(0x7f0d006e, float:1.8742338E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (int) r1)
            r0.a()
            return
        L_0x0132:
            boolean r0 = com.ss.android.g.a.a()
            if (r0 != 0) goto L_0x018c
            com.ss.android.ugc.aweme.feed.ui.p r0 = r9.f46775b
            java.lang.String r1 = "download"
            boolean r0 = r0.checkStatus(r1)
            if (r0 != 0) goto L_0x0143
            return
        L_0x0143:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f46788f
            if (r0 == 0) goto L_0x0179
            int r0 = r0.getAwemeType()
            r1 = 2
            if (r0 != r1) goto L_0x0179
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f46788f
            boolean r0 = com.ss.android.ugc.aweme.feed.ui.g.e(r0)
            if (r0 == 0) goto L_0x0179
            com.ss.android.ugc.aweme.feed.h.n r0 = new com.ss.android.ugc.aweme.feed.h.n
            android.content.Context r1 = r10.getContext()
            r0.<init>(r1)
            com.ss.android.ugc.aweme.feed.model.FeedSelfseeNoticeModel r1 = new com.ss.android.ugc.aweme.feed.model.FeedSelfseeNoticeModel
            r1.<init>()
            com.ss.android.ugc.aweme.common.a r1 = (com.ss.android.ugc.aweme.common.a) r1
            r0.a(r1)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r9.f46788f
            if (r2 == 0) goto L_0x0173
            java.lang.String r5 = r2.getAid()
        L_0x0173:
            r1[r8] = r5
            r0.a((java.lang.Object[]) r1)
            return
        L_0x0179:
            java.lang.String r0 = "download"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x018c
            com.ss.android.ugc.aweme.feed.ui.p r0 = r9.f46775b
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r1 = r9.f46776c
            java.lang.String r2 = "download"
            r0.onAction(r1, r2)
        L_0x018c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.masklayer2.h.a(android.view.View):void");
    }
}
