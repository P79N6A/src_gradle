package com.ss.android.ugc.aweme.story.profile.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.model.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 $2\u00020\u0001:\u0001$B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0006\u0010\u001b\u001a\u00020\u000bJ\u0006\u0010\u001c\u001a\u00020\u0013J\u000e\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u0013J\u000e\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0013J\u0006\u0010!\u001a\u00020\u000bJ\u0006\u0010\"\u001a\u00020\u000bJ\u0006\u0010#\u001a\u00020\u000bR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/ss/android/ugc/aweme/story/profile/view/AllStoryImageViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "(Landroid/view/View;Lcom/ss/android/ugc/aweme/profile/model/User;)V", "awemeWithComment", "Lcom/ss/android/ugc/aweme/story/api/model/AwemeWithComment;", "clickImage", "Lkotlin/Function0;", "", "context", "Landroid/content/Context;", "ivStory", "Lcom/ss/android/ugc/aweme/base/ui/AnimatedImageView;", "getUser", "()Lcom/ss/android/ugc/aweme/profile/model/User;", "userDynamicCover", "", "getUserDynamicCover", "()Z", "setUserDynamicCover", "(Z)V", "bind", "dailyStory", "Lcom/ss/android/ugc/aweme/story/api/model/DailyStory;", "bindCover", "isUserDynamicCover", "setAttached", "attached", "setUserVisibleHint", "userVisibleHint", "tryStartAnimation", "tryStopAnimation", "updateCover", "Companion", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AllStoryImageViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73315a;
    public static final b h = new b((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public Context f73316b;

    /* renamed from: c  reason: collision with root package name */
    public AnimatedImageView f73317c;

    /* renamed from: d  reason: collision with root package name */
    public Function0<Unit> f73318d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f73319e;

    /* renamed from: f  reason: collision with root package name */
    com.ss.android.ugc.aweme.story.api.model.b f73320f;
    @Nullable
    public final User g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/ugc/aweme/story/profile/view/AllStoryImageViewHolder$1$1"}, k = 3, mv = {1, 1, 15})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73321a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AllStoryImageViewHolder f73322b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f73323c;

        a(AllStoryImageViewHolder allStoryImageViewHolder, View view) {
            this.f73322b = allStoryImageViewHolder;
            this.f73323c = view;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f73321a, false, 84926, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f73321a, false, 84926, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            Function0<Unit> function0 = this.f73322b.f73318d;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/story/profile/view/AllStoryImageViewHolder$Companion;", "", "()V", "create", "Lcom/ss/android/ugc/aweme/story/profile/view/AllStoryImageViewHolder;", "parent", "Landroid/view/ViewGroup;", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73324a;

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.ss.android.ugc.aweme.story.api.model.b $awemeWithComment;
        final /* synthetic */ e $dailyStory;
        final /* synthetic */ AllStoryImageViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(AllStoryImageViewHolder allStoryImageViewHolder, com.ss.android.ugc.aweme.story.api.model.b bVar, e eVar) {
            super(0);
            this.this$0 = allStoryImageViewHolder;
            this.$awemeWithComment = bVar;
            this.$dailyStory = eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x007f  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00ad  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00f0  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0107  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void invoke() {
            /*
                r15 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Void.TYPE
                r4 = 0
                r5 = 84928(0x14bc0, float:1.1901E-40)
                r2 = r15
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0025
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
                r5 = 0
                r6 = 84928(0x14bc0, float:1.1901E-40)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r15
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                return
            L_0x0025:
                com.ss.android.ugc.aweme.story.api.model.f r10 = new com.ss.android.ugc.aweme.story.api.model.f
                r10.<init>()
                com.ss.android.ugc.aweme.story.profile.view.AllStoryImageViewHolder r1 = r15.this$0
                com.ss.android.ugc.aweme.profile.model.User r1 = r1.g
                r2 = 0
                if (r1 == 0) goto L_0x0036
                java.lang.String r1 = r1.getUid()
                goto L_0x0037
            L_0x0036:
                r1 = r2
            L_0x0037:
                r10.uid = r1
                com.ss.android.ugc.aweme.story.api.model.b r1 = r15.$awemeWithComment
                if (r1 == 0) goto L_0x0048
                com.ss.android.ugc.aweme.story.api.model.LifeStory r1 = r1.getLifeStory()
                if (r1 == 0) goto L_0x0048
                java.lang.String r1 = r1.getStoryId()
                goto L_0x0049
            L_0x0048:
                r1 = r2
            L_0x0049:
                r10.storyId = r1
                java.lang.String r1 = "story_album"
                r10.eventType = r1
                r1 = 2
                r10.detailType = r1
                r1 = 1
                r10.isSelf = r1
                com.ss.android.ugc.aweme.story.api.model.e r1 = r15.$dailyStory
                if (r1 == 0) goto L_0x005e
                long r3 = r1.getDate()
                goto L_0x0060
            L_0x005e:
                r3 = 0
            L_0x0060:
                r10.date = r3
                com.ss.android.ugc.aweme.story.api.model.UserStory r11 = new com.ss.android.ugc.aweme.story.api.model.UserStory
                r11.<init>()
                com.ss.android.ugc.aweme.story.api.model.e r1 = r15.$dailyStory
                if (r1 == 0) goto L_0x0070
                java.util.List r1 = r1.getStoryList()
                goto L_0x0071
            L_0x0070:
                r1 = r2
            L_0x0071:
                r11.setAwemeList(r1)
                com.ss.android.ugc.aweme.story.profile.view.AllStoryImageViewHolder r1 = r15.this$0
                com.ss.android.ugc.aweme.profile.model.User r1 = r1.g
                r11.setUser(r1)
                com.ss.android.ugc.aweme.story.api.model.e r1 = r15.$dailyStory
                if (r1 == 0) goto L_0x008a
                java.util.List r1 = r1.getStoryList()
                if (r1 == 0) goto L_0x008a
                int r1 = r1.size()
                goto L_0x008b
            L_0x008a:
                r1 = 0
            L_0x008b:
                long r3 = (long) r1
                r11.setTotalCount(r3)
                if (r1 <= 0) goto L_0x00a7
                java.util.List r1 = r11.getAwemeList()
                java.lang.Object r0 = r1.get(r0)
                java.lang.String r1 = "userStory.awemeList[0]"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                com.ss.android.ugc.aweme.story.api.model.b r0 = (com.ss.android.ugc.aweme.story.api.model.b) r0
                com.ss.android.ugc.aweme.story.api.model.LogPbBean r0 = r0.getLogPb()
                r11.setLogPb(r0)
            L_0x00a7:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 21
                if (r0 < r1) goto L_0x00e8
                com.ss.android.ugc.aweme.story.profile.view.AllStoryImageViewHolder r0 = r15.this$0
                android.content.Context r0 = com.ss.android.ugc.aweme.story.profile.view.AllStoryImageViewHolder.a((com.ss.android.ugc.aweme.story.profile.view.AllStoryImageViewHolder) r0)
                if (r0 == 0) goto L_0x00e0
                android.app.Activity r0 = (android.app.Activity) r0
                android.view.Window r0 = r0.getWindow()
                java.lang.String r1 = "(context as Activity).window"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                r0.setSharedElementReenterTransition(r2)
                com.ss.android.ugc.aweme.story.profile.view.AllStoryImageViewHolder r0 = r15.this$0
                android.content.Context r0 = com.ss.android.ugc.aweme.story.profile.view.AllStoryImageViewHolder.a((com.ss.android.ugc.aweme.story.profile.view.AllStoryImageViewHolder) r0)
                if (r0 == 0) goto L_0x00d8
                android.app.Activity r0 = (android.app.Activity) r0
                com.ss.android.ugc.aweme.story.profile.view.AllStoryImageViewHolder$c$1 r1 = new com.ss.android.ugc.aweme.story.profile.view.AllStoryImageViewHolder$c$1
                r1.<init>()
                android.app.SharedElementCallback r1 = (android.app.SharedElementCallback) r1
                r0.setExitSharedElementCallback(r1)
                goto L_0x00e8
            L_0x00d8:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                java.lang.String r1 = "null cannot be cast to non-null type android.app.Activity"
                r0.<init>(r1)
                throw r0
            L_0x00e0:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                java.lang.String r1 = "null cannot be cast to non-null type android.app.Activity"
                r0.<init>(r1)
                throw r0
            L_0x00e8:
                com.ss.android.ugc.aweme.story.profile.view.AllStoryImageViewHolder r0 = r15.this$0
                android.content.Context r0 = com.ss.android.ugc.aweme.story.profile.view.AllStoryImageViewHolder.a((com.ss.android.ugc.aweme.story.profile.view.AllStoryImageViewHolder) r0)
                if (r0 == 0) goto L_0x0107
                r9 = r0
                android.app.Activity r9 = (android.app.Activity) r9
                r12 = -1
                r13 = 0
                com.ss.android.ugc.aweme.story.profile.view.AllStoryImageViewHolder r0 = r15.this$0
                com.ss.android.ugc.aweme.base.ui.AnimatedImageView r0 = r0.f73317c
                if (r0 != 0) goto L_0x0100
                java.lang.String r1 = "ivStory"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            L_0x0100:
                r14 = r0
                android.view.View r14 = (android.view.View) r14
                com.ss.android.ugc.aweme.story.detail.f.a((android.app.Activity) r9, (com.ss.android.ugc.aweme.story.api.model.f) r10, (com.ss.android.ugc.aweme.story.api.model.UserStory) r11, (int) r12, (android.view.View) r13, (android.view.View) r14)
                return
            L_0x0107:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                java.lang.String r1 = "null cannot be cast to non-null type android.app.Activity"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.profile.view.AllStoryImageViewHolder.c.invoke():void");
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f73315a, false, 84920, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73315a, false, 84920, new Class[0], Void.TYPE);
            return;
        }
        a();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f73315a, false, 84921, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73315a, false, 84921, new Class[0], Void.TYPE);
            return;
        }
        AnimatedImageView animatedImageView = this.f73317c;
        if (animatedImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivStory");
        }
        if (animatedImageView != null) {
            animatedImageView.b();
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f73315a, false, 84922, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73315a, false, 84922, new Class[0], Void.TYPE);
            return;
        }
        AnimatedImageView animatedImageView = this.f73317c;
        if (animatedImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivStory");
        }
        if (animatedImageView != null) {
            animatedImageView.c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (r2.size() == 0) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f73315a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 84919(0x14bb7, float:1.18997E-40)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f73315a
            r5 = 0
            r6 = 84919(0x14bb7, float:1.18997E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            com.ss.android.ugc.aweme.story.feed.c.g$a r1 = com.ss.android.ugc.aweme.story.feed.c.g.f72503b
            com.ss.android.ugc.aweme.story.api.model.b r2 = r9.f73320f
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.a((com.ss.android.ugc.aweme.story.api.model.b) r2)
            if (r1 != 0) goto L_0x0030
            return
        L_0x0030:
            if (r1 == 0) goto L_0x003e
            java.util.List r2 = r1.getUrlList()
            if (r2 == 0) goto L_0x003e
            int r2 = r2.size()
            if (r2 == 0) goto L_0x004e
        L_0x003e:
            java.util.List r2 = r1.getUrlList()
            java.lang.Object r0 = r2.get(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x005e
        L_0x004e:
            com.ss.android.ugc.aweme.base.ui.AnimatedImageView r0 = r9.f73317c
            if (r0 != 0) goto L_0x0057
            java.lang.String r1 = "ivStory"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0057:
            r1 = 2131624941(0x7f0e03ed, float:1.8877076E38)
            r0.setImageResource(r1)
            return
        L_0x005e:
            com.ss.android.ugc.aweme.base.ui.AnimatedImageView r0 = r9.f73317c
            if (r0 != 0) goto L_0x0067
            java.lang.String r2 = "ivStory"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0067:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0
            com.ss.android.ugc.aweme.base.c.b(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.profile.view.AllStoryImageViewHolder.a():void");
    }

    public static final /* synthetic */ Context a(AllStoryImageViewHolder allStoryImageViewHolder) {
        Context context = allStoryImageViewHolder.f73316b;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        return context;
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f73315a, false, 84924, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f73315a, false, 84924, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        AnimatedImageView animatedImageView = this.f73317c;
        if (animatedImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivStory");
        }
        if (animatedImageView != null) {
            animatedImageView.setAttached(z);
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f73315a, false, 84923, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f73315a, false, 84923, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        AnimatedImageView animatedImageView = this.f73317c;
        if (animatedImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivStory");
        }
        if (animatedImageView != null) {
            animatedImageView.setUserVisibleHint(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AllStoryImageViewHolder(@NotNull View view, @Nullable User user) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        this.g = user;
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
        this.f73316b = context;
        View findViewById = view.findViewById(C0906R.id.b2e);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.iv_image)");
        this.f73317c = (AnimatedImageView) findViewById;
        AnimatedImageView animatedImageView = this.f73317c;
        if (animatedImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivStory");
        }
        ViewGroup.LayoutParams layoutParams = animatedImageView.getLayoutParams();
        layoutParams.height = (int) UIUtils.dip2Px(view.getContext(), 166.0f);
        layoutParams.width = (int) ((((float) UIUtils.getScreenWidth(view.getContext())) - UIUtils.dip2Px(view.getContext(), 3.0f)) / 3.0f);
        AnimatedImageView animatedImageView2 = this.f73317c;
        if (animatedImageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivStory");
        }
        animatedImageView2.setLayoutParams(layoutParams);
        AnimatedImageView animatedImageView3 = this.f73317c;
        if (animatedImageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivStory");
        }
        animatedImageView3.setOnClickListener(new a(this, view));
    }
}
