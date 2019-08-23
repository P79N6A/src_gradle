package com.ss.android.ugc.aweme.story.friends.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.api.model.h;
import com.ss.android.ugc.aweme.story.base.utils.f;
import com.ss.android.ugc.aweme.story.base.utils.i;
import com.ss.android.ugc.aweme.story.base.view.StoryCircleView;
import com.ss.android.ugc.aweme.story.friends.a.d;
import com.ss.android.ugc.aweme.story.friends.a.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010*J\u0018\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010*2\u0006\u0010.\u001a\u00020/J\b\u00100\u001a\u000201H\u0002J\u0006\u00102\u001a\u00020,J\u0006\u00103\u001a\u00020/J\u0006\u00104\u001a\u00020,J\u0018\u00105\u001a\u00020,2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0014J\b\u0010:\u001a\u00020,H\u0002J\b\u0010;\u001a\u00020,H\u0002J\b\u0010<\u001a\u00020,H\u0002J\b\u0010=\u001a\u00020,H\u0002R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/ss/android/ugc/aweme/story/friends/adapter/UserStoryViewHolder;", "Lcom/ss/android/ugc/aweme/story/friends/adapter/StoryBaseViewHolder;", "itemView", "Landroid/view/View;", "mStoryParams", "Lcom/ss/android/ugc/aweme/story/api/model/StoryHeaderParams;", "(Landroid/view/View;Lcom/ss/android/ugc/aweme/story/api/model/StoryHeaderParams;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "mAvatarRing", "Lcom/ss/android/ugc/aweme/story/base/view/StoryCircleView;", "getMAvatarRing", "()Lcom/ss/android/ugc/aweme/story/base/view/StoryCircleView;", "setMAvatarRing", "(Lcom/ss/android/ugc/aweme/story/base/view/StoryCircleView;)V", "mCover", "Lcom/ss/android/ugc/aweme/base/ui/AnimatedImageView;", "getMCover", "()Lcom/ss/android/ugc/aweme/base/ui/AnimatedImageView;", "setMCover", "(Lcom/ss/android/ugc/aweme/base/ui/AnimatedImageView;)V", "mIvLabel", "Landroid/widget/ImageView;", "getMIvLabel", "()Landroid/widget/ImageView;", "setMIvLabel", "(Landroid/widget/ImageView;)V", "getMStoryParams", "()Lcom/ss/android/ugc/aweme/story/api/model/StoryHeaderParams;", "setMStoryParams", "(Lcom/ss/android/ugc/aweme/story/api/model/StoryHeaderParams;)V", "mTvName", "Landroid/widget/TextView;", "getMTvName", "()Landroid/widget/TextView;", "setMTvName", "(Landroid/widget/TextView;)V", "mUserStory", "Lcom/ss/android/ugc/aweme/story/api/model/UserStory;", "bindView", "", "userStory", "isLastItem", "", "getHideViewAnim", "Landroid/animation/Animator;", "hideLoading", "isAllStoryRead", "mobShow", "onBindItem", "item", "Lcom/ss/android/ugc/aweme/story/api/model/BaseStory;", "position", "", "onItemClick", "openDetail", "openDetailReal", "showLabel", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class UserStoryViewHolder extends StoryBaseViewHolder<UserStoryViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73095a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public AnimatedImageView f73096b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public TextView f73097c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public Context f73098d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public StoryCircleView f73099e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public ImageView f73100f;
    UserStory g;
    @Nullable
    public h h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/story/friends/adapter/UserStoryViewHolder$openDetail$1", "Lcom/ss/android/ugc/aweme/story/friends/util/PreloadCallBack;", "onFail", "", "onSuccess", "data", "Lcom/ss/android/ugc/aweme/story/api/model/UserStory;", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73104a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UserStoryViewHolder f73105b;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f73104a, false, 84620, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f73104a, false, 84620, new Class[0], Void.TYPE);
                return;
            }
            this.f73105b.d();
            Activity a2 = i.a(this.f73105b.f73098d);
            if (a2 != null && !a2.isFinishing()) {
                this.f73105b.e();
            }
        }

        a(UserStoryViewHolder userStoryViewHolder) {
            this.f73105b = userStoryViewHolder;
        }

        public final void a(@NotNull UserStory userStory) {
            if (PatchProxy.isSupport(new Object[]{userStory}, this, f73104a, false, 84619, new Class[]{UserStory.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{userStory}, this, f73104a, false, 84619, new Class[]{UserStory.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(userStory, "data");
            this.f73105b.d();
            Activity a2 = i.a(this.f73105b.f73098d);
            if (a2 != null && !a2.isFinishing()) {
                this.f73105b.e();
            }
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f73095a, false, 84611, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73095a, false, 84611, new Class[0], Void.TYPE);
            return;
        }
        StoryCircleView storyCircleView = this.f73099e;
        if (storyCircleView != null) {
            storyCircleView.b();
        }
    }

    public final boolean f() {
        if (PatchProxy.isSupport(new Object[0], this, f73095a, false, 84617, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f73095a, false, 84617, new Class[0], Boolean.TYPE)).booleanValue();
        }
        UserStory userStory = this.g;
        if (userStory == null || userStory.getReadFlag() != 1) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r15 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f73095a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 84612(0x14a84, float:1.18567E-40)
            r2 = r15
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f73095a
            r5 = 0
            r6 = 84612(0x14a84, float:1.18567E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r15
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            com.ss.android.ugc.aweme.story.api.model.f r1 = new com.ss.android.ugc.aweme.story.api.model.f
            r1.<init>()
            r2 = 4
            r1.detailType = r2
            com.ss.android.ugc.aweme.story.api.model.UserStory r2 = r15.g
            r3 = 0
            if (r2 == 0) goto L_0x003d
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.getUser()
            if (r2 == 0) goto L_0x003d
            java.lang.String r2 = r2.getUid()
            goto L_0x003e
        L_0x003d:
            r2 = r3
        L_0x003e:
            r1.uid = r2
            com.ss.android.ugc.aweme.story.api.model.h r2 = r15.h
            if (r2 == 0) goto L_0x0046
            int r0 = r2.f71856a
        L_0x0046:
            r1.tabType = r0
            com.ss.android.ugc.aweme.story.api.model.h r0 = r15.h
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r0.f71857b
            goto L_0x0050
        L_0x004f:
            r0 = r3
        L_0x0050:
            r1.eventType = r0
            com.ss.android.ugc.aweme.story.base.a.a r0 = com.ss.android.ugc.aweme.story.base.a.a.a()
            java.lang.String r2 = "key_open_user_story"
            com.ss.android.ugc.aweme.arch.widgets.base.b r0 = r0.a(r2)
            java.lang.String r2 = "StoryLiveDataBus.get().w…tant.KEY_OPEN_USER_STORY)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            com.ss.android.ugc.aweme.story.detail.b.b r2 = new com.ss.android.ugc.aweme.story.detail.b.b
            int r4 = r1.tabType
            r2.<init>(r4)
            r0.setValue(r2)
            com.ss.android.ugc.aweme.story.detail.f r0 = com.ss.android.ugc.aweme.story.detail.f.a()
            java.lang.String r2 = r1.uid
            int r4 = r1.tabType
            r0.a(r2, r4)
            android.content.Context r0 = r15.f73098d
            r9 = r0
            android.app.Activity r9 = (android.app.Activity) r9
            com.ss.android.ugc.aweme.story.feed.c.g$a r0 = com.ss.android.ugc.aweme.story.feed.c.g.f72503b
            android.content.Context r2 = r15.f73098d
            boolean r4 = r15.f()
            com.ss.android.ugc.aweme.story.feed.model.a r11 = r0.a((android.content.Context) r2, (boolean) r4, (com.ss.android.ugc.aweme.story.api.model.f) r1)
            r12 = -1
            com.ss.android.ugc.aweme.base.ui.AnimatedImageView r0 = r15.f73096b
            r13 = r0
            android.view.View r13 = (android.view.View) r13
            android.view.View r0 = r15.itemView
            if (r0 == 0) goto L_0x009a
            r2 = 2131170523(0x7f0714db, float:1.7955407E38)
            android.view.View r0 = r0.findViewById(r2)
            r14 = r0
            goto L_0x009b
        L_0x009a:
            r14 = r3
        L_0x009b:
            r10 = r1
            com.ss.android.ugc.aweme.story.detail.f.a((android.app.Activity) r9, (com.ss.android.ugc.aweme.story.api.model.f) r10, (com.ss.android.ugc.aweme.story.feed.model.a) r11, (int) r12, (android.view.View) r13, (android.view.View) r14)
            com.ss.android.ugc.aweme.story.metrics.d r0 = new com.ss.android.ugc.aweme.story.metrics.d
            r0.<init>()
            com.ss.android.ugc.aweme.story.api.model.h r2 = r15.h
            if (r2 == 0) goto L_0x00ab
            java.lang.String r2 = r2.f71857b
            goto L_0x00ac
        L_0x00ab:
            r2 = r3
        L_0x00ac:
            com.ss.android.ugc.aweme.story.metrics.d r0 = r0.a((java.lang.String) r2)
            java.lang.String r2 = "click_head"
            com.ss.android.ugc.aweme.story.metrics.d r0 = r0.b(r2)
            java.lang.String r2 = ""
            com.ss.android.ugc.aweme.story.metrics.d r0 = r0.c(r2)
            java.lang.String r2 = r1.uid
            com.ss.android.ugc.aweme.story.metrics.d r0 = r0.d(r2)
            java.lang.String r1 = r1.uid
            com.ss.android.ugc.aweme.story.metrics.d r0 = r0.e(r1)
            boolean r1 = r15.f()
            com.ss.android.ugc.aweme.story.metrics.d r0 = r0.a((boolean) r1)
            com.ss.android.ugc.aweme.story.api.model.UserStory r1 = r15.g
            if (r1 == 0) goto L_0x00d8
            com.ss.android.ugc.aweme.story.api.model.LogPbBean r3 = r1.getLogPb()
        L_0x00d8:
            com.ss.android.ugc.aweme.story.metrics.d r0 = r0.a((com.ss.android.ugc.aweme.story.api.model.LogPbBean) r3)
            com.ss.android.ugc.aweme.story.api.model.UserStory r1 = r15.g
            int r1 = com.ss.android.ugc.aweme.story.metrics.a.a.a((com.ss.android.ugc.aweme.story.api.model.UserStory) r1)
            com.ss.android.ugc.aweme.story.metrics.d r0 = r0.a((int) r1)
            r0.post()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.friends.adapter.UserStoryViewHolder.e():void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserStoryViewHolder(@NotNull final View view, @Nullable h hVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        this.h = hVar;
        this.f73098d = view.getContext();
        this.f73096b = (AnimatedImageView) view.findViewById(C0906R.id.b08);
        this.f73097c = (TextView) view.findViewById(C0906R.id.df7);
        this.f73099e = (StoryCircleView) view.findViewById(C0906R.id.ayt);
        this.f73100f = (ImageView) view.findViewById(C0906R.id.aqs);
        AnimatedImageView animatedImageView = this.f73096b;
        if (animatedImageView != null) {
            animatedImageView.setOnClickListener(new View.OnClickListener(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f73101a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ UserStoryViewHolder f73102b;

                {
                    this.f73102b = r1;
                }

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f73101a, false, 84618, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f73101a, false, 84618, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (!f.a(view) && a.a()) {
                        UserStoryViewHolder userStoryViewHolder = this.f73102b;
                        if (PatchProxy.isSupport(new Object[0], userStoryViewHolder, UserStoryViewHolder.f73095a, false, 84608, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], userStoryViewHolder, UserStoryViewHolder.f73095a, false, 84608, new Class[0], Void.TYPE);
                            return;
                        }
                        if (PatchProxy.isSupport(new Object[0], userStoryViewHolder, UserStoryViewHolder.f73095a, false, 84610, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], userStoryViewHolder, UserStoryViewHolder.f73095a, false, 84610, new Class[0], Void.TYPE);
                        } else if (e.f73056c.a(userStoryViewHolder.g)) {
                            userStoryViewHolder.e();
                        } else {
                            StoryCircleView storyCircleView = userStoryViewHolder.f73099e;
                            if (storyCircleView != null) {
                                storyCircleView.a();
                            }
                            if (userStoryViewHolder.g != null) {
                                e.a aVar = e.f73056c;
                                UserStory userStory = userStoryViewHolder.g;
                                if (userStory == null) {
                                    Intrinsics.throwNpe();
                                }
                                aVar.a(userStory, (d) new a(userStoryViewHolder));
                                return;
                            }
                            userStoryViewHolder.d();
                            userStoryViewHolder.e();
                        }
                    }
                }
            });
        }
        AnimatedImageView animatedImageView2 = this.f73096b;
        if (animatedImageView2 != null) {
            animatedImageView2.setOnTouchListener(com.ss.android.ugc.aweme.story.friends.a.a.a());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01d3 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(java.lang.Object r20, int r21) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            com.ss.android.ugc.aweme.story.api.model.c r8 = (com.ss.android.ugc.aweme.story.api.model.c) r8
            r9 = 2
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
            r11 = 1
            r0[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f73095a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.story.api.model.c> r1 = com.ss.android.ugc.aweme.story.api.model.c.class
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 84607(0x14a7f, float:1.1856E-40)
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x004f
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
            r0[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f73095a
            r3 = 0
            r4 = 84607(0x14a7f, float:1.1856E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.story.api.model.c> r1 = com.ss.android.ugc.aweme.story.api.model.c.class
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x004f:
            java.lang.String r0 = "item"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            com.ss.android.ugc.aweme.story.api.model.UserStory r8 = (com.ss.android.ugc.aweme.story.api.model.UserStory) r8
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f73095a
            r3 = 0
            r4 = 84614(0x14a86, float:1.1857E-40)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.aweme.story.api.model.UserStory> r1 = com.ss.android.ugc.aweme.story.api.model.UserStory.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0088
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f73095a
            r3 = 0
            r4 = 84614(0x14a86, float:1.1857E-40)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.aweme.story.api.model.UserStory> r1 = com.ss.android.ugc.aweme.story.api.model.UserStory.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0088:
            android.view.View r0 = r7.itemView
            java.lang.String r1 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setScaleX(r1)
            android.view.View r0 = r7.itemView
            java.lang.String r2 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            r0.setScaleY(r1)
            r7.g = r8
            com.ss.android.ugc.aweme.story.feed.c.g$a r0 = com.ss.android.ugc.aweme.story.feed.c.g.f72503b
            com.ss.android.ugc.aweme.story.api.model.b r0 = r0.a((com.ss.android.ugc.aweme.story.api.model.UserStory) r8)
            com.ss.android.ugc.aweme.story.friends.a.e$a r1 = com.ss.android.ugc.aweme.story.friends.a.e.f73056c
            r1.a((com.ss.android.ugc.aweme.story.api.model.b) r0)
            com.ss.android.ugc.aweme.base.ui.AnimatedImageView r0 = r7.f73096b
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0
            r1 = 0
            if (r8 == 0) goto L_0x00bd
            com.ss.android.ugc.aweme.profile.model.User r2 = r8.getUser()
            if (r2 == 0) goto L_0x00bd
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r2.getAvatarThumb()
            goto L_0x00be
        L_0x00bd:
            r2 = r1
        L_0x00be:
            com.ss.android.ugc.aweme.base.c.b(r0, r2)
            android.widget.TextView r0 = r7.f73097c
            if (r0 == 0) goto L_0x010f
            com.ss.android.ugc.aweme.story.feed.c.g$a r2 = com.ss.android.ugc.aweme.story.feed.c.g.f72503b
            com.ss.android.ugc.aweme.story.api.model.UserStory r3 = r7.g
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r10] = r3
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.story.feed.c.g.a.f72504a
            r15 = 0
            r16 = 83790(0x1474e, float:1.17415E-40)
            java.lang.Class[] r4 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.aweme.story.api.model.UserStory> r5 = com.ss.android.ugc.aweme.story.api.model.UserStory.class
            r4[r10] = r5
            java.lang.Class<java.lang.CharSequence> r18 = java.lang.CharSequence.class
            r13 = r2
            r17 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r4 == 0) goto L_0x0100
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r10] = r3
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.story.feed.c.g.a.f72504a
            r15 = 0
            r16 = 83790(0x1474e, float:1.17415E-40)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.aweme.story.api.model.UserStory> r3 = com.ss.android.ugc.aweme.story.api.model.UserStory.class
            r1[r10] = r3
            java.lang.Class<java.lang.CharSequence> r18 = java.lang.CharSequence.class
            r13 = r2
            r17 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            goto L_0x010c
        L_0x0100:
            com.ss.android.ugc.aweme.story.feed.c.g$a r2 = (com.ss.android.ugc.aweme.story.feed.c.g.a) r2
            if (r3 == 0) goto L_0x0108
            com.ss.android.ugc.aweme.profile.model.User r1 = r3.getUser()
        L_0x0108:
            java.lang.CharSequence r1 = r2.d((com.ss.android.ugc.aweme.profile.model.User) r1)
        L_0x010c:
            r0.setText(r1)
        L_0x010f:
            android.widget.TextView r0 = r7.f73097c
            if (r0 == 0) goto L_0x011c
            android.text.TextPaint r0 = r0.getPaint()
            if (r0 == 0) goto L_0x011c
            r0.setFakeBoldText(r10)
        L_0x011c:
            com.ss.android.ugc.aweme.story.api.model.UserStory r0 = r7.g
            r8 = 2130837763(0x7f020103, float:1.728049E38)
            r9 = 2130837762(0x7f020102, float:1.7280487E38)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == 0) goto L_0x014d
            int r0 = r0.getReadFlag()
            if (r0 != r11) goto L_0x014d
            com.ss.android.ugc.aweme.story.base.view.StoryCircleView r0 = r7.f73099e
            if (r0 == 0) goto L_0x0138
            r2 = 654311423(0x26ffffff, float:1.7763567E-15)
            r0.setColor(r2)
        L_0x0138:
            com.ss.android.ugc.aweme.story.base.view.StoryCircleView r0 = r7.f73099e
            if (r0 == 0) goto L_0x0145
            android.content.Context r2 = r7.f73098d
            float r1 = com.bytedance.common.utility.UIUtils.dip2Px(r2, r1)
            r0.setStrokeWidth(r1)
        L_0x0145:
            android.widget.ImageView r0 = r7.f73100f
            if (r0 == 0) goto L_0x0174
            r0.setImageResource(r8)
            goto L_0x0174
        L_0x014d:
            com.ss.android.ugc.aweme.story.base.view.StoryCircleView r0 = r7.f73099e
            if (r0 == 0) goto L_0x0160
            java.lang.String r2 = "#10dff9"
            int r2 = android.graphics.Color.parseColor(r2)
            java.lang.String r3 = "#0bb8f0"
            int r3 = android.graphics.Color.parseColor(r3)
            r0.a(r2, r3)
        L_0x0160:
            com.ss.android.ugc.aweme.story.base.view.StoryCircleView r0 = r7.f73099e
            if (r0 == 0) goto L_0x016d
            android.content.Context r2 = r7.f73098d
            float r1 = com.bytedance.common.utility.UIUtils.dip2Px(r2, r1)
            r0.setStrokeWidth(r1)
        L_0x016d:
            android.widget.ImageView r0 = r7.f73100f
            if (r0 == 0) goto L_0x0174
            r0.setImageResource(r9)
        L_0x0174:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f73095a
            r3 = 0
            r4 = 84615(0x14a87, float:1.18571E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x019a
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f73095a
            r3 = 0
            r4 = 84615(0x14a87, float:1.18571E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01cb
        L_0x019a:
            com.ss.android.ugc.aweme.story.api.model.UserStory r0 = r7.g
            if (r0 == 0) goto L_0x01c2
            int r0 = r0.getFriendType()
            r1 = 4
            if (r0 != r1) goto L_0x01c2
            android.widget.ImageView r0 = r7.f73100f
            if (r0 == 0) goto L_0x01ac
            r0.setVisibility(r10)
        L_0x01ac:
            boolean r0 = r19.f()
            if (r0 == 0) goto L_0x01ba
            android.widget.ImageView r0 = r7.f73100f
            if (r0 == 0) goto L_0x01cb
            r0.setImageResource(r8)
            goto L_0x01cb
        L_0x01ba:
            android.widget.ImageView r0 = r7.f73100f
            if (r0 == 0) goto L_0x01cb
            r0.setImageResource(r9)
            goto L_0x01cb
        L_0x01c2:
            android.widget.ImageView r0 = r7.f73100f
            if (r0 == 0) goto L_0x01cb
            r1 = 8
            r0.setVisibility(r1)
        L_0x01cb:
            com.ss.android.ugc.aweme.story.base.view.StoryCircleView r0 = r7.f73099e
            if (r0 == 0) goto L_0x01d3
            r0.b()
            return
        L_0x01d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.friends.adapter.UserStoryViewHolder.a(java.lang.Object, int):void");
    }
}
