package com.ss.android.ugc.aweme.story.friends.adapter;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextPaint;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.h.t;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010;J\b\u0010?\u001a\u00020@H\u0002J\u0006\u0010A\u001a\u00020=J\u0006\u0010B\u001a\u00020\u000eJ\u0006\u0010C\u001a\u00020=J\u0018\u0010D\u001a\u00020=2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020HH\u0014J\b\u0010I\u001a\u00020=H\u0002J\b\u0010J\u001a\u00020=H\u0002J\b\u0010K\u001a\u00020=H\u0002J\u0006\u0010L\u001a\u00020=J\u0006\u0010M\u001a\u00020=J$\u0010N\u001a\u00020=2\u0006\u0010O\u001a\u00020\u000e2\b\u0010P\u001a\u0004\u0018\u00010Q2\b\b\u0002\u0010R\u001a\u00020\u000eH\u0002R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R\u001a\u0010'\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010\u0011R\u001c\u0010*\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u00104\u001a\u0004\u0018\u000105X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0010\u0010:\u001a\u0004\u0018\u00010;X\u000e¢\u0006\u0002\n\u0000¨\u0006S"}, d2 = {"Lcom/ss/android/ugc/aweme/story/friends/adapter/CurUserViewHolder;", "Lcom/ss/android/ugc/aweme/story/friends/adapter/StoryBaseViewHolder;", "itemView", "Landroid/view/View;", "mStoryParams", "Lcom/ss/android/ugc/aweme/story/api/model/StoryHeaderParams;", "(Landroid/view/View;Lcom/ss/android/ugc/aweme/story/api/model/StoryHeaderParams;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "isShowUploadError", "", "()Z", "setShowUploadError", "(Z)V", "mAvatar", "Lcom/ss/android/ugc/aweme/base/ui/AnimatedImageView;", "getMAvatar", "()Lcom/ss/android/ugc/aweme/base/ui/AnimatedImageView;", "setMAvatar", "(Lcom/ss/android/ugc/aweme/base/ui/AnimatedImageView;)V", "mAvatarContainer", "Landroid/widget/FrameLayout;", "getMAvatarContainer", "()Landroid/widget/FrameLayout;", "setMAvatarContainer", "(Landroid/widget/FrameLayout;)V", "mAvatarRing", "Lcom/ss/android/ugc/aweme/story/base/view/StoryCircleView;", "getMAvatarRing", "()Lcom/ss/android/ugc/aweme/story/base/view/StoryCircleView;", "setMAvatarRing", "(Lcom/ss/android/ugc/aweme/story/base/view/StoryCircleView;)V", "mCover", "getMCover", "setMCover", "mHasUserStory", "getMHasUserStory", "setMHasUserStory", "mIvLabel", "Landroid/widget/ImageView;", "getMIvLabel", "()Landroid/widget/ImageView;", "setMIvLabel", "(Landroid/widget/ImageView;)V", "getMStoryParams", "()Lcom/ss/android/ugc/aweme/story/api/model/StoryHeaderParams;", "setMStoryParams", "(Lcom/ss/android/ugc/aweme/story/api/model/StoryHeaderParams;)V", "mTvName", "Landroid/widget/TextView;", "getMTvName", "()Landroid/widget/TextView;", "setMTvName", "(Landroid/widget/TextView;)V", "mUserStory", "Lcom/ss/android/ugc/aweme/story/api/model/UserStory;", "bindView", "", "userStory", "getHideViewAnim", "Landroid/animation/Animator;", "hideLoading", "isAllStoryRead", "mobShow", "onBindItem", "item", "Lcom/ss/android/ugc/aweme/story/api/model/BaseStory;", "position", "", "onItemClick", "openDetail", "openDetailReal", "showPublishAnim", "showUploadError", "showView", "showAddStory", "cover", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "isStoriesRead", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class CurUserViewHolder extends StoryBaseViewHolder<CurUserViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73065a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public AnimatedImageView f73066b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public TextView f73067c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public Context f73068d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public StoryCircleView f73069e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public ImageView f73070f;
    UserStory g;
    public boolean h;
    public boolean i;
    @Nullable
    public h j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/story/friends/adapter/CurUserViewHolder$onItemClick$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73074a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CurUserViewHolder f73075b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.story.friends.adapter.CurUserViewHolder$a$a  reason: collision with other inner class name */
        static final class C0760a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f73076a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f73077b;

            C0760a(a aVar) {
                this.f73077b = aVar;
            }

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f73076a, false, 84582, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f73076a, false, 84582, new Class[0], Void.TYPE);
                    return;
                }
                StoryCircleView storyCircleView = this.f73077b.f73075b.f73069e;
                if (storyCircleView != null) {
                    storyCircleView.setAlpha(1.0f);
                }
                TextView textView = this.f73077b.f73075b.f73067c;
                if (textView != null) {
                    textView.setAlpha(1.0f);
                }
                ImageView imageView = this.f73077b.f73075b.f73070f;
                if (imageView != null) {
                    imageView.setAlpha(1.0f);
                }
            }
        }

        public final void onAnimationCancel(@Nullable Animator animator) {
        }

        public final void onAnimationRepeat(@Nullable Animator animator) {
        }

        public final void onAnimationStart(@Nullable Animator animator) {
        }

        a(CurUserViewHolder curUserViewHolder) {
            this.f73075b = curUserViewHolder;
        }

        public final void onAnimationEnd(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f73074a, false, 84581, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f73074a, false, 84581, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            CurUserViewHolder curUserViewHolder = this.f73075b;
            if (PatchProxy.isSupport(new Object[0], curUserViewHolder, CurUserViewHolder.f73065a, false, 84570, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], curUserViewHolder, CurUserViewHolder.f73065a, false, 84570, new Class[0], Void.TYPE);
            } else if (e.f73056c.a(curUserViewHolder.g)) {
                curUserViewHolder.e();
            } else {
                StoryCircleView storyCircleView = curUserViewHolder.f73069e;
                if (storyCircleView != null) {
                    storyCircleView.a();
                }
                if (curUserViewHolder.g != null) {
                    e.a aVar = e.f73056c;
                    UserStory userStory = curUserViewHolder.g;
                    if (userStory == null) {
                        Intrinsics.throwNpe();
                    }
                    aVar.a(userStory, (d) new b(curUserViewHolder));
                } else {
                    curUserViewHolder.d();
                    curUserViewHolder.e();
                }
            }
            this.f73075b.itemView.postDelayed(new C0760a(this), 1000);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/story/friends/adapter/CurUserViewHolder$openDetail$1", "Lcom/ss/android/ugc/aweme/story/friends/util/PreloadCallBack;", "onFail", "", "onSuccess", "data", "Lcom/ss/android/ugc/aweme/story/api/model/UserStory;", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73078a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CurUserViewHolder f73079b;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f73078a, false, 84584, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f73078a, false, 84584, new Class[0], Void.TYPE);
                return;
            }
            this.f73079b.d();
            Activity a2 = i.a(this.f73079b.f73068d);
            if (a2 != null && !a2.isFinishing()) {
                this.f73079b.e();
            }
        }

        b(CurUserViewHolder curUserViewHolder) {
            this.f73079b = curUserViewHolder;
        }

        public final void a(@NotNull UserStory userStory) {
            if (PatchProxy.isSupport(new Object[]{userStory}, this, f73078a, false, 84583, new Class[]{UserStory.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{userStory}, this, f73078a, false, 84583, new Class[]{UserStory.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(userStory, "data");
            this.f73079b.d();
            Activity a2 = i.a(this.f73079b.f73068d);
            if (a2 != null && !a2.isFinishing()) {
                this.f73079b.e();
            }
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f73065a, false, 84571, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73065a, false, 84571, new Class[0], Void.TYPE);
            return;
        }
        StoryCircleView storyCircleView = this.f73069e;
        if (storyCircleView != null) {
            storyCircleView.b();
        }
    }

    public final boolean g() {
        if (PatchProxy.isSupport(new Object[0], this, f73065a, false, 84579, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f73065a, false, 84579, new Class[0], Boolean.TYPE)).booleanValue();
        }
        UserStory userStory = this.g;
        if (userStory == null || userStory.getReadFlag() != 1) {
            return false;
        }
        return true;
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f73065a, false, 84578, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73065a, false, 84578, new Class[0], Void.TYPE);
            return;
        }
        this.i = true;
        StoryCircleView storyCircleView = this.f73069e;
        if (storyCircleView != null) {
            storyCircleView.setColor(0);
        }
        StoryCircleView storyCircleView2 = this.f73069e;
        if (storyCircleView2 != null) {
            storyCircleView2.setStrokeWidth(UIUtils.dip2Px(this.f73068d, 2.0f));
        }
        ImageView imageView = this.f73070f;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = this.f73070f;
        if (imageView2 != null) {
            imageView2.setImageResource(2130837764);
        }
        TextView textView = this.f73067c;
        if (textView != null) {
            textView.setText(C0906R.string.kf);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r15 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f73065a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 84573(0x14a5d, float:1.18512E-40)
            r2 = r15
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f73065a
            r5 = 0
            r6 = 84573(0x14a5d, float:1.18512E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r15
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            com.ss.android.ugc.aweme.story.api.model.f r0 = new com.ss.android.ugc.aweme.story.api.model.f
            r0.<init>()
            r1 = 4
            r0.detailType = r1
            com.ss.android.ugc.aweme.story.api.model.UserStory r1 = r15.g
            r2 = 0
            if (r1 == 0) goto L_0x003d
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getUser()
            if (r1 == 0) goto L_0x003d
            java.lang.String r1 = r1.getUid()
            goto L_0x003e
        L_0x003d:
            r1 = r2
        L_0x003e:
            r0.uid = r1
            com.ss.android.ugc.aweme.story.api.model.h r1 = r15.j
            if (r1 == 0) goto L_0x0047
            int r1 = r1.f71856a
            goto L_0x0048
        L_0x0047:
            r1 = 1
        L_0x0048:
            r0.tabType = r1
            com.ss.android.ugc.aweme.story.api.model.h r1 = r15.j
            if (r1 == 0) goto L_0x0051
            java.lang.String r1 = r1.f71857b
            goto L_0x0052
        L_0x0051:
            r1 = r2
        L_0x0052:
            r0.eventType = r1
            com.ss.android.ugc.aweme.story.base.a.a r1 = com.ss.android.ugc.aweme.story.base.a.a.a()
            java.lang.String r3 = "key_open_user_story"
            com.ss.android.ugc.aweme.arch.widgets.base.b r1 = r1.a(r3)
            java.lang.String r3 = "StoryLiveDataBus.get().w…tant.KEY_OPEN_USER_STORY)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
            com.ss.android.ugc.aweme.story.detail.b.b r3 = new com.ss.android.ugc.aweme.story.detail.b.b
            int r4 = r0.tabType
            r3.<init>(r4)
            r1.setValue(r3)
            com.ss.android.ugc.aweme.story.detail.f r1 = com.ss.android.ugc.aweme.story.detail.f.a()
            java.lang.String r3 = r0.uid
            int r4 = r0.tabType
            r1.a(r3, r4)
            android.content.Context r1 = r15.f73068d
            r9 = r1
            android.app.Activity r9 = (android.app.Activity) r9
            com.ss.android.ugc.aweme.story.feed.c.g$a r1 = com.ss.android.ugc.aweme.story.feed.c.g.f72503b
            android.content.Context r3 = r15.f73068d
            boolean r4 = r15.g()
            com.ss.android.ugc.aweme.story.feed.model.a r11 = r1.a((android.content.Context) r3, (boolean) r4, (com.ss.android.ugc.aweme.story.api.model.f) r0)
            r12 = -1
            com.ss.android.ugc.aweme.base.ui.AnimatedImageView r1 = r15.f73066b
            r13 = r1
            android.view.View r13 = (android.view.View) r13
            android.view.View r1 = r15.itemView
            if (r1 == 0) goto L_0x009c
            r3 = 2131170523(0x7f0714db, float:1.7955407E38)
            android.view.View r1 = r1.findViewById(r3)
            r14 = r1
            goto L_0x009d
        L_0x009c:
            r14 = r2
        L_0x009d:
            r10 = r0
            com.ss.android.ugc.aweme.story.detail.f.a((android.app.Activity) r9, (com.ss.android.ugc.aweme.story.api.model.f) r10, (com.ss.android.ugc.aweme.story.feed.model.a) r11, (int) r12, (android.view.View) r13, (android.view.View) r14)
            com.ss.android.ugc.aweme.story.metrics.d r1 = new com.ss.android.ugc.aweme.story.metrics.d
            r1.<init>()
            com.ss.android.ugc.aweme.story.api.model.h r3 = r15.j
            if (r3 == 0) goto L_0x00ad
            java.lang.String r3 = r3.f71857b
            goto L_0x00ae
        L_0x00ad:
            r3 = r2
        L_0x00ae:
            com.ss.android.ugc.aweme.story.metrics.d r1 = r1.a((java.lang.String) r3)
            java.lang.String r3 = "click_head"
            com.ss.android.ugc.aweme.story.metrics.d r1 = r1.b(r3)
            java.lang.String r3 = ""
            com.ss.android.ugc.aweme.story.metrics.d r1 = r1.c(r3)
            java.lang.String r3 = r0.uid
            com.ss.android.ugc.aweme.story.metrics.d r1 = r1.d(r3)
            java.lang.String r0 = r0.uid
            com.ss.android.ugc.aweme.story.metrics.d r0 = r1.e(r0)
            boolean r1 = r15.g()
            com.ss.android.ugc.aweme.story.metrics.d r0 = r0.a((boolean) r1)
            com.ss.android.ugc.aweme.story.api.model.UserStory r1 = r15.g
            if (r1 == 0) goto L_0x00da
            com.ss.android.ugc.aweme.story.api.model.LogPbBean r2 = r1.getLogPb()
        L_0x00da:
            com.ss.android.ugc.aweme.story.metrics.d r0 = r0.a((com.ss.android.ugc.aweme.story.api.model.LogPbBean) r2)
            com.ss.android.ugc.aweme.story.api.model.UserStory r1 = r15.g
            int r1 = com.ss.android.ugc.aweme.story.metrics.a.a.a((com.ss.android.ugc.aweme.story.api.model.UserStory) r1)
            com.ss.android.ugc.aweme.story.metrics.d r0 = r0.a((int) r1)
            r0.post()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.friends.adapter.CurUserViewHolder.e():void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CurUserViewHolder(@NotNull final View view, @Nullable h hVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        this.j = hVar;
        this.f73068d = view.getContext();
        this.f73066b = (AnimatedImageView) view.findViewById(C0906R.id.b08);
        this.f73067c = (TextView) view.findViewById(C0906R.id.df7);
        this.f73069e = (StoryCircleView) view.findViewById(C0906R.id.ayt);
        this.f73070f = (ImageView) view.findViewById(C0906R.id.aqs);
        AnimatedImageView animatedImageView = this.f73066b;
        if (animatedImageView != null) {
            animatedImageView.setOnClickListener(new View.OnClickListener(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f73071a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ CurUserViewHolder f73072b;

                {
                    this.f73072b = r1;
                }

                public final void onClick(View view) {
                    String str;
                    Animator animator;
                    float f2;
                    if (PatchProxy.isSupport(new Object[]{view}, this, f73071a, false, 84580, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f73071a, false, 84580, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (!f.a(view) && a.a()) {
                        CurUserViewHolder curUserViewHolder = this.f73072b;
                        if (PatchProxy.isSupport(new Object[0], curUserViewHolder, CurUserViewHolder.f73065a, false, 84569, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], curUserViewHolder, CurUserViewHolder.f73065a, false, 84569, new Class[0], Void.TYPE);
                        } else if (curUserViewHolder.h) {
                            if (PatchProxy.isSupport(new Object[0], curUserViewHolder, CurUserViewHolder.f73065a, false, 84572, new Class[0], Animator.class)) {
                                animator = (Animator) PatchProxy.accessDispatch(new Object[0], curUserViewHolder, CurUserViewHolder.f73065a, false, 84572, new Class[0], Animator.class);
                            } else {
                                AnimatorSet animatorSet = new AnimatorSet();
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(curUserViewHolder.f73069e, "alpha", new float[]{1.0f, 0.0f});
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(curUserViewHolder.f73067c, "alpha", new float[]{1.0f, 0.0f});
                                ImageView imageView = curUserViewHolder.f73070f;
                                float[] fArr = new float[2];
                                ImageView imageView2 = curUserViewHolder.f73070f;
                                if (imageView2 != null) {
                                    f2 = imageView2.getAlpha();
                                } else {
                                    f2 = 1.0f;
                                }
                                fArr[0] = f2;
                                fArr[1] = 0.0f;
                                animatorSet.play(ofFloat).with(ofFloat2).with(ObjectAnimator.ofFloat(imageView, "alpha", fArr));
                                animatorSet.setDuration(100);
                                animator = animatorSet;
                            }
                            animator.addListener(new a(curUserViewHolder));
                            animator.start();
                        } else {
                            Intent intent = new Intent();
                            h hVar = curUserViewHolder.j;
                            if (hVar != null) {
                                str = hVar.f71857b;
                            } else {
                                str = null;
                            }
                            intent.putExtra("enter_from", str);
                            intent.putExtra("enter_method", "click_plus");
                            ((t) ServiceManager.get().getService(t.class)).a(intent);
                        }
                    }
                }
            });
        }
        TextView textView = this.f73067c;
        if (textView != null) {
            TextPaint paint = textView.getPaint();
            if (paint != null) {
                paint.setFakeBoldText(false);
            }
        }
        AnimatedImageView animatedImageView2 = this.f73066b;
        if (animatedImageView2 != null) {
            animatedImageView2.setOnTouchListener(com.ss.android.ugc.aweme.story.friends.a.a.a());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00bd, code lost:
        if (r0.isEmpty() == true) goto L_0x00c2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x021d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(java.lang.Object r23, int r24) {
        /*
            r22 = this;
            r7 = r22
            r8 = r23
            com.ss.android.ugc.aweme.story.api.model.c r8 = (com.ss.android.ugc.aweme.story.api.model.c) r8
            r9 = 2
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)
            r11 = 1
            r0[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f73065a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.story.api.model.c> r1 = com.ss.android.ugc.aweme.story.api.model.c.class
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 84568(0x14a58, float:1.18505E-40)
            r1 = r22
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x004f
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)
            r0[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f73065a
            r3 = 0
            r4 = 84568(0x14a58, float:1.18505E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.story.api.model.c> r1 = com.ss.android.ugc.aweme.story.api.model.c.class
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x004f:
            java.lang.String r0 = "item"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            com.ss.android.ugc.aweme.story.api.model.UserStory r8 = (com.ss.android.ugc.aweme.story.api.model.UserStory) r8
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f73065a
            r3 = 0
            r4 = 84574(0x14a5e, float:1.18513E-40)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.aweme.story.api.model.UserStory> r1 = com.ss.android.ugc.aweme.story.api.model.UserStory.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0088
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f73065a
            r3 = 0
            r4 = 84574(0x14a5e, float:1.18513E-40)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.aweme.story.api.model.UserStory> r1 = com.ss.android.ugc.aweme.story.api.model.UserStory.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
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
            r7.i = r10
            com.ss.android.ugc.aweme.story.api.model.UserStory r0 = r7.g
            r1 = 0
            if (r0 == 0) goto L_0x00ac
            java.util.List r0 = r0.getAwemeList()
            goto L_0x00ad
        L_0x00ac:
            r0 = r1
        L_0x00ad:
            if (r0 == 0) goto L_0x00c2
            com.ss.android.ugc.aweme.story.api.model.UserStory r0 = r7.g
            if (r0 == 0) goto L_0x00c0
            java.util.List r0 = r0.getAwemeList()
            if (r0 == 0) goto L_0x00c0
            boolean r0 = r0.isEmpty()
            if (r0 != r11) goto L_0x00c0
            goto L_0x00c2
        L_0x00c0:
            r12 = 0
            goto L_0x00c3
        L_0x00c2:
            r12 = 1
        L_0x00c3:
            if (r8 == 0) goto L_0x00cf
            com.ss.android.ugc.aweme.profile.model.User r0 = r8.getUser()
            if (r0 == 0) goto L_0x00cf
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r0.getAvatarThumb()
        L_0x00cf:
            r8 = r1
            com.ss.android.ugc.aweme.story.base.view.StoryCircleView r0 = r7.f73069e
            if (r0 == 0) goto L_0x00d7
            r0.b()
        L_0x00d7:
            boolean r13 = r22.g()
            r14 = 3
            java.lang.Object[] r0 = new java.lang.Object[r14]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r12)
            r0[r10] = r1
            r0[r11] = r8
            java.lang.Byte r1 = java.lang.Byte.valueOf(r13)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f73065a
            r3 = 0
            r4 = 84575(0x14a5f, float:1.18515E-40)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.base.model.UrlModel> r1 = com.ss.android.ugc.aweme.base.model.UrlModel.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0137
            java.lang.Object[] r0 = new java.lang.Object[r14]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r12)
            r0[r10] = r1
            r0[r11] = r8
            java.lang.Byte r1 = java.lang.Byte.valueOf(r13)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f73065a
            r3 = 0
            r4 = 84575(0x14a5f, float:1.18515E-40)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.base.model.UrlModel> r1 = com.ss.android.ugc.aweme.base.model.UrlModel.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01e8
        L_0x0137:
            r0 = 2130837756(0x7f0200fc, float:1.7280475E38)
            r1 = 8
            if (r12 == 0) goto L_0x0168
            r7.h = r10
            com.ss.android.ugc.aweme.base.ui.AnimatedImageView r2 = r7.f73066b
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r2
            com.ss.android.ugc.aweme.base.c.b(r2, r8)
            com.ss.android.ugc.aweme.story.base.view.StoryCircleView r2 = r7.f73069e
            if (r2 == 0) goto L_0x014e
            r2.setVisibility(r1)
        L_0x014e:
            android.widget.ImageView r1 = r7.f73070f
            if (r1 == 0) goto L_0x0155
            r1.setImageResource(r0)
        L_0x0155:
            android.widget.ImageView r0 = r7.f73070f
            if (r0 == 0) goto L_0x015c
            r0.setVisibility(r10)
        L_0x015c:
            android.widget.TextView r0 = r7.f73067c
            if (r0 == 0) goto L_0x01e8
            r1 = 2131562715(0x7f0d10db, float:1.8750867E38)
            r0.setText(r1)
            goto L_0x01e8
        L_0x0168:
            r7.h = r11
            com.ss.android.ugc.aweme.base.ui.AnimatedImageView r2 = r7.f73066b
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r2
            com.ss.android.ugc.aweme.base.c.b(r2, r8)
            com.ss.android.ugc.aweme.story.base.view.StoryCircleView r2 = r7.f73069e
            if (r2 == 0) goto L_0x0178
            r2.setVisibility(r10)
        L_0x0178:
            r2 = 1073741824(0x40000000, float:2.0)
            if (r13 == 0) goto L_0x019b
            com.ss.android.ugc.aweme.story.base.view.StoryCircleView r3 = r7.f73069e
            if (r3 == 0) goto L_0x0186
            r4 = 654311423(0x26ffffff, float:1.7763567E-15)
            r3.setColor(r4)
        L_0x0186:
            com.ss.android.ugc.aweme.story.base.view.StoryCircleView r3 = r7.f73069e
            if (r3 == 0) goto L_0x0193
            android.content.Context r4 = r7.f73068d
            float r2 = com.bytedance.common.utility.UIUtils.dip2Px(r4, r2)
            r3.setStrokeWidth(r2)
        L_0x0193:
            android.widget.ImageView r2 = r7.f73070f
            if (r2 == 0) goto L_0x01c2
            r2.setVisibility(r10)
            goto L_0x01c2
        L_0x019b:
            com.ss.android.ugc.aweme.story.base.view.StoryCircleView r3 = r7.f73069e
            if (r3 == 0) goto L_0x01ae
            java.lang.String r4 = "#10dff9"
            int r4 = android.graphics.Color.parseColor(r4)
            java.lang.String r5 = "#0bb8f0"
            int r5 = android.graphics.Color.parseColor(r5)
            r3.a(r4, r5)
        L_0x01ae:
            com.ss.android.ugc.aweme.story.base.view.StoryCircleView r3 = r7.f73069e
            if (r3 == 0) goto L_0x01bb
            android.content.Context r4 = r7.f73068d
            float r2 = com.bytedance.common.utility.UIUtils.dip2Px(r4, r2)
            r3.setStrokeWidth(r2)
        L_0x01bb:
            android.widget.ImageView r2 = r7.f73070f
            if (r2 == 0) goto L_0x01c2
            r2.setVisibility(r1)
        L_0x01c2:
            android.widget.ImageView r2 = r7.f73070f
            if (r2 == 0) goto L_0x01c9
            r2.setVisibility(r1)
        L_0x01c9:
            boolean r1 = r22.g()
            if (r1 == 0) goto L_0x01d7
            android.widget.ImageView r1 = r7.f73070f
            if (r1 == 0) goto L_0x01de
            r1.setImageResource(r0)
            goto L_0x01de
        L_0x01d7:
            android.widget.ImageView r1 = r7.f73070f
            if (r1 == 0) goto L_0x01de
            r1.setImageResource(r0)
        L_0x01de:
            android.widget.TextView r0 = r7.f73067c
            if (r0 == 0) goto L_0x01e8
            r1 = 2131561409(0x7f0d0bc1, float:1.8748218E38)
            r0.setText(r1)
        L_0x01e8:
            com.ss.android.ugc.aweme.story.friends.a.f$a r0 = com.ss.android.ugc.aweme.story.friends.a.f.f73062a
            java.lang.Object[] r15 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.story.friends.a.f.a.f73063a
            r18 = 0
            r19 = 84650(0x14aaa, float:1.1862E-40)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r21 = java.lang.Boolean.TYPE
            r16 = r0
            r20 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)
            if (r1 == 0) goto L_0x021d
            java.lang.Object[] r15 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.story.friends.a.f.a.f73063a
            r18 = 0
            r19 = 84650(0x14aaa, float:1.1862E-40)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r21 = java.lang.Boolean.TYPE
            r16 = r0
            r20 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r10 = r0.booleanValue()
            goto L_0x023e
        L_0x021d:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.story.api.IAVStoryService> r1 = com.ss.android.ugc.aweme.story.api.IAVStoryService.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.story.api.IAVStoryService r0 = (com.ss.android.ugc.aweme.story.api.IAVStoryService) r0
            if (r0 == 0) goto L_0x023e
            android.arch.lifecycle.MutableLiveData r0 = r0.getPublishState()
            if (r0 == 0) goto L_0x023e
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.story.api.j r0 = (com.ss.android.ugc.aweme.story.api.j) r0
            if (r0 == 0) goto L_0x023e
            int r0 = r0.f71843e
            if (r0 != r14) goto L_0x023e
            r10 = 1
        L_0x023e:
            if (r10 == 0) goto L_0x024d
            com.ss.android.ugc.aweme.story.feed.c.g$a r0 = com.ss.android.ugc.aweme.story.feed.c.g.f72503b
            com.ss.android.ugc.aweme.story.api.model.UserStory r1 = r7.g
            boolean r0 = r0.e((com.ss.android.ugc.aweme.story.api.model.UserStory) r1)
            if (r0 == 0) goto L_0x024d
            r22.f()
        L_0x024d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.friends.adapter.CurUserViewHolder.a(java.lang.Object, int):void");
    }
}
