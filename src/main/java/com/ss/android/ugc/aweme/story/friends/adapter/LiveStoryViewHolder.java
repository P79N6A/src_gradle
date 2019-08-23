package com.ss.android.ugc.aweme.story.friends.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.model.h;
import com.ss.android.ugc.aweme.story.base.view.StoryCircleView;
import com.ss.android.ugc.aweme.story.feed.c.g;
import com.ss.android.ugc.aweme.story.feed.model.c;
import com.ss.android.ugc.aweme.story.friends.LiveCircleView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001BB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u000eJ\u0006\u0010:\u001a\u000208J\u0018\u0010;\u001a\u0002082\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0014J\b\u0010@\u001a\u000208H\u0002J\b\u0010A\u001a\u000208H\u0002R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u00101\u001a\u0004\u0018\u000102X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u0006C"}, d2 = {"Lcom/ss/android/ugc/aweme/story/friends/adapter/LiveStoryViewHolder;", "Lcom/ss/android/ugc/aweme/story/friends/adapter/StoryBaseViewHolder;", "itemView", "Landroid/view/View;", "mStoryParams", "Lcom/ss/android/ugc/aweme/story/api/model/StoryHeaderParams;", "(Landroid/view/View;Lcom/ss/android/ugc/aweme/story/api/model/StoryHeaderParams;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "liveStroy", "Lcom/ss/android/ugc/aweme/story/feed/model/LiveStory;", "mAvatarRing", "Lcom/ss/android/ugc/aweme/story/base/view/StoryCircleView;", "getMAvatarRing", "()Lcom/ss/android/ugc/aweme/story/base/view/StoryCircleView;", "setMAvatarRing", "(Lcom/ss/android/ugc/aweme/story/base/view/StoryCircleView;)V", "mCover", "Lcom/ss/android/ugc/aweme/base/ui/AnimatedImageView;", "getMCover", "()Lcom/ss/android/ugc/aweme/base/ui/AnimatedImageView;", "setMCover", "(Lcom/ss/android/ugc/aweme/base/ui/AnimatedImageView;)V", "mIvLabel", "Landroid/widget/ImageView;", "getMIvLabel", "()Landroid/widget/ImageView;", "setMIvLabel", "(Landroid/widget/ImageView;)V", "mLiveCircleView", "Lcom/ss/android/ugc/aweme/story/friends/LiveCircleView;", "getMLiveCircleView", "()Lcom/ss/android/ugc/aweme/story/friends/LiveCircleView;", "setMLiveCircleView", "(Lcom/ss/android/ugc/aweme/story/friends/LiveCircleView;)V", "mLiveStoryCallback", "Lcom/ss/android/ugc/aweme/story/friends/adapter/LiveStoryViewHolder$ILiveStoryCallback;", "getMLiveStoryCallback", "()Lcom/ss/android/ugc/aweme/story/friends/adapter/LiveStoryViewHolder$ILiveStoryCallback;", "setMLiveStoryCallback", "(Lcom/ss/android/ugc/aweme/story/friends/adapter/LiveStoryViewHolder$ILiveStoryCallback;)V", "getMStoryParams", "()Lcom/ss/android/ugc/aweme/story/api/model/StoryHeaderParams;", "setMStoryParams", "(Lcom/ss/android/ugc/aweme/story/api/model/StoryHeaderParams;)V", "mTvName", "Landroid/widget/TextView;", "getMTvName", "()Landroid/widget/TextView;", "setMTvName", "(Landroid/widget/TextView;)V", "bindView", "", "story", "mobShow", "onBindItem", "item", "Lcom/ss/android/ugc/aweme/story/api/model/BaseStory;", "position", "", "onItemClick", "watchLive", "ILiveStoryCallback", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class LiveStoryViewHolder extends StoryBaseViewHolder<LiveStoryViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73080a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public AnimatedImageView f73081b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public TextView f73082c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public Context f73083d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public StoryCircleView f73084e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public ImageView f73085f;
    @Nullable
    public LiveCircleView g;
    c h;
    @Nullable
    public a i;
    @Nullable
    public h j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/story/friends/adapter/LiveStoryViewHolder$ILiveStoryCallback;", "", "getLiveStorys", "", "Lcom/ss/android/ugc/aweme/story/feed/model/LiveStory;", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface a {
        @NotNull
        List<c> a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveStoryViewHolder(@NotNull final View view, @Nullable h hVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        this.j = hVar;
        this.f73083d = view.getContext();
        this.f73081b = (AnimatedImageView) view.findViewById(C0906R.id.b08);
        this.f73082c = (TextView) view.findViewById(C0906R.id.df7);
        this.f73084e = (StoryCircleView) view.findViewById(C0906R.id.ayt);
        this.f73085f = (ImageView) view.findViewById(C0906R.id.aqs);
        AnimatedImageView animatedImageView = this.f73081b;
        if (animatedImageView != null) {
            animatedImageView.setOnClickListener(new View.OnClickListener(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f73086a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ LiveStoryViewHolder f73087b;

                {
                    this.f73087b = r1;
                }

                /* JADX WARNING: Removed duplicated region for block: B:51:0x016b  */
                /* JADX WARNING: Removed duplicated region for block: B:59:0x0183  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onClick(android.view.View r19) {
                    /*
                        r18 = this;
                        r7 = r18
                        r9 = 1
                        java.lang.Object[] r0 = new java.lang.Object[r9]
                        r10 = 0
                        r0[r10] = r19
                        com.meituan.robust.ChangeQuickRedirect r2 = f73086a
                        java.lang.Class[] r5 = new java.lang.Class[r9]
                        java.lang.Class<android.view.View> r1 = android.view.View.class
                        r5[r10] = r1
                        java.lang.Class r6 = java.lang.Void.TYPE
                        r3 = 0
                        r4 = 84591(0x14a6f, float:1.18537E-40)
                        r1 = r18
                        boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                        if (r0 == 0) goto L_0x0036
                        java.lang.Object[] r0 = new java.lang.Object[r9]
                        r0[r10] = r19
                        com.meituan.robust.ChangeQuickRedirect r2 = f73086a
                        r3 = 0
                        r4 = 84591(0x14a6f, float:1.18537E-40)
                        java.lang.Class[] r5 = new java.lang.Class[r9]
                        java.lang.Class<android.view.View> r1 = android.view.View.class
                        r5[r10] = r1
                        java.lang.Class r6 = java.lang.Void.TYPE
                        r1 = r18
                        com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                        return
                    L_0x0036:
                        com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r19)
                        android.view.View r0 = r2
                        boolean r0 = com.ss.android.ugc.aweme.story.base.utils.f.a(r0)
                        if (r0 != 0) goto L_0x018f
                        boolean r0 = com.ss.android.ugc.aweme.story.friends.adapter.a.a()
                        if (r0 == 0) goto L_0x018f
                        com.ss.android.ugc.aweme.story.friends.adapter.LiveStoryViewHolder r0 = r7.f73087b
                        java.lang.Object[] r11 = new java.lang.Object[r10]
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.friends.adapter.LiveStoryViewHolder.f73080a
                        r14 = 0
                        r15 = 84586(0x14a6a, float:1.1853E-40)
                        java.lang.Class[] r1 = new java.lang.Class[r10]
                        java.lang.Class r17 = java.lang.Void.TYPE
                        r12 = r0
                        r16 = r1
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                        if (r1 == 0) goto L_0x0071
                        java.lang.Object[] r11 = new java.lang.Object[r10]
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.friends.adapter.LiveStoryViewHolder.f73080a
                        r14 = 0
                        r15 = 84586(0x14a6a, float:1.1853E-40)
                        java.lang.Class[] r1 = new java.lang.Class[r10]
                        java.lang.Class r17 = java.lang.Void.TYPE
                        r12 = r0
                        r16 = r1
                        com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                        return
                    L_0x0071:
                        java.lang.Object[] r11 = new java.lang.Object[r10]
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.friends.adapter.LiveStoryViewHolder.f73080a
                        r14 = 0
                        r15 = 84587(0x14a6b, float:1.18532E-40)
                        java.lang.Class[] r1 = new java.lang.Class[r10]
                        java.lang.Class r17 = java.lang.Void.TYPE
                        r12 = r0
                        r16 = r1
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                        if (r1 == 0) goto L_0x0099
                        java.lang.Object[] r11 = new java.lang.Object[r10]
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.friends.adapter.LiveStoryViewHolder.f73080a
                        r14 = 0
                        r15 = 84587(0x14a6b, float:1.18532E-40)
                        java.lang.Class[] r1 = new java.lang.Class[r10]
                        java.lang.Class r17 = java.lang.Void.TYPE
                        r12 = r0
                        r16 = r1
                        com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                        return
                    L_0x0099:
                        com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                        java.lang.Class<com.ss.android.ugc.aweme.story.api.c> r2 = com.ss.android.ugc.aweme.story.api.c.class
                        java.lang.Object r1 = r1.getService(r2)
                        com.ss.android.ugc.aweme.story.api.c r1 = (com.ss.android.ugc.aweme.story.api.c) r1
                        android.graphics.Rect r2 = new android.graphics.Rect
                        r2.<init>()
                        r3 = 2
                        java.lang.Integer[] r3 = new java.lang.Integer[r3]
                        java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
                        r3[r10] = r4
                        java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
                        r3[r9] = r4
                        int[] r3 = kotlin.collections.ArraysKt.toIntArray(r3)
                        android.view.View r4 = r0.itemView
                        if (r4 == 0) goto L_0x00c4
                        r4.getLocationOnScreen(r3)
                    L_0x00c4:
                        r4 = r3[r10]
                        r2.left = r4
                        r4 = r3[r9]
                        r2.top = r4
                        r4 = r3[r10]
                        com.ss.android.ugc.aweme.base.ui.AnimatedImageView r5 = r0.f73081b
                        r6 = 0
                        if (r5 == 0) goto L_0x00dc
                        int r5 = r5.getMeasuredWidth()
                        java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                        goto L_0x00dd
                    L_0x00dc:
                        r5 = r6
                    L_0x00dd:
                        if (r5 != 0) goto L_0x00e2
                        kotlin.jvm.internal.Intrinsics.throwNpe()
                    L_0x00e2:
                        int r5 = r5.intValue()
                        int r4 = r4 + r5
                        r2.right = r4
                        r3 = r3[r9]
                        com.ss.android.ugc.aweme.base.ui.AnimatedImageView r4 = r0.f73081b
                        if (r4 == 0) goto L_0x00f8
                        int r4 = r4.getMeasuredHeight()
                        java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                        goto L_0x00f9
                    L_0x00f8:
                        r4 = r6
                    L_0x00f9:
                        if (r4 != 0) goto L_0x00fe
                        kotlin.jvm.internal.Intrinsics.throwNpe()
                    L_0x00fe:
                        int r4 = r4.intValue()
                        int r3 = r3 + r4
                        r2.bottom = r3
                        java.util.ArrayList r3 = new java.util.ArrayList
                        r3.<init>()
                        com.ss.android.ugc.aweme.story.friends.adapter.LiveStoryViewHolder$a r4 = r0.i
                        if (r4 == 0) goto L_0x0130
                        java.util.List r4 = r4.a()
                        if (r4 == 0) goto L_0x0130
                        java.lang.Iterable r4 = (java.lang.Iterable) r4
                        java.util.Iterator r4 = r4.iterator()
                    L_0x011a:
                        boolean r5 = r4.hasNext()
                        if (r5 == 0) goto L_0x0130
                        java.lang.Object r5 = r4.next()
                        com.ss.android.ugc.aweme.story.feed.model.c r5 = (com.ss.android.ugc.aweme.story.feed.model.c) r5
                        long r8 = r5.f72668a
                        java.lang.Long r5 = java.lang.Long.valueOf(r8)
                        r3.add(r5)
                        goto L_0x011a
                    L_0x0130:
                        android.os.Bundle r4 = new android.os.Bundle
                        r4.<init>()
                        java.lang.String r5 = "story_live_source_rect"
                        android.os.Parcelable r2 = (android.os.Parcelable) r2
                        r4.putParcelable(r5, r2)
                        java.lang.String r2 = "enter_from"
                        com.ss.android.ugc.aweme.story.api.model.h r5 = r0.j
                        if (r5 == 0) goto L_0x0145
                        java.lang.String r5 = r5.f71857b
                        goto L_0x0146
                    L_0x0145:
                        r5 = r6
                    L_0x0146:
                        r4.putString(r2, r5)
                        java.lang.String r2 = "live.intent.extra.REQUEST_ID"
                        com.ss.android.ugc.aweme.story.feed.model.c r5 = r0.h
                        if (r5 == 0) goto L_0x0158
                        com.ss.android.ugc.aweme.story.api.model.LogPbBean r5 = r5.f72670c
                        if (r5 == 0) goto L_0x0158
                        java.lang.String r5 = r5.getImprId()
                        goto L_0x0159
                    L_0x0158:
                        r5 = r6
                    L_0x0159:
                        r4.putString(r2, r5)
                        java.lang.String r2 = "live.intent.extra.ENTER_ROOM_IDS"
                        java.util.Collection r3 = (java.util.Collection) r3
                        long[] r3 = kotlin.collections.CollectionsKt.toLongArray(r3)
                        r4.putLongArray(r2, r3)
                        com.ss.android.ugc.aweme.story.feed.model.c r2 = r0.h
                        if (r2 == 0) goto L_0x0181
                        com.ss.android.ugc.aweme.profile.model.User r2 = r2.f72669b
                        if (r2 == 0) goto L_0x0181
                        com.ss.android.ugc.aweme.story.feed.model.c r3 = r0.h
                        if (r3 == 0) goto L_0x017a
                        long r8 = r3.f72668a
                        java.lang.Long r3 = java.lang.Long.valueOf(r8)
                        goto L_0x017b
                    L_0x017a:
                        r3 = r6
                    L_0x017b:
                        long r8 = r3.longValue()
                        r2.roomId = r8
                    L_0x0181:
                        if (r1 == 0) goto L_0x018f
                        android.content.Context r2 = r0.f73083d
                        com.ss.android.ugc.aweme.story.feed.model.c r0 = r0.h
                        if (r0 == 0) goto L_0x018b
                        com.ss.android.ugc.aweme.profile.model.User r6 = r0.f72669b
                    L_0x018b:
                        r1.a(r2, r6, r4)
                        return
                    L_0x018f:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.friends.adapter.LiveStoryViewHolder.AnonymousClass1.onClick(android.view.View):void");
                }
            });
        }
        AnimatedImageView animatedImageView2 = this.f73081b;
        if (animatedImageView2 != null) {
            animatedImageView2.setOnTouchListener(com.ss.android.ugc.aweme.story.friends.a.a.a());
        }
        this.g = (LiveCircleView) view.findViewById(C0906R.id.b2q);
    }

    public final /* synthetic */ void a(Object obj, int i2) {
        UrlModel urlModel;
        com.ss.android.ugc.aweme.story.api.model.c cVar = (com.ss.android.ugc.aweme.story.api.model.c) obj;
        if (PatchProxy.isSupport(new Object[]{cVar, Integer.valueOf(i2)}, this, f73080a, false, 84588, new Class[]{com.ss.android.ugc.aweme.story.api.model.c.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar, Integer.valueOf(i2)}, this, f73080a, false, 84588, new Class[]{com.ss.android.ugc.aweme.story.api.model.c.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(cVar, "item");
        c cVar2 = (c) cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f73080a, false, 84589, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f73080a, false, 84589, new Class[]{c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(cVar2, "story");
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        view.setScaleX(1.0f);
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        view2.setScaleY(1.0f);
        this.h = cVar2;
        RemoteImageView remoteImageView = this.f73081b;
        User user = cVar2.f72669b;
        String str = null;
        if (user != null) {
            urlModel = user.getAvatarThumb();
        } else {
            urlModel = null;
        }
        com.ss.android.ugc.aweme.base.c.b(remoteImageView, urlModel);
        TextView textView = this.f73082c;
        if (textView != null) {
            textView.setText(g.f72503b.d(cVar2.f72669b));
        }
        TextView textView2 = this.f73082c;
        if (textView2 != null) {
            User user2 = cVar2.f72669b;
            if (user2 != null) {
                str = user2.getNickname();
            }
            textView2.setText(str);
        }
        h hVar = this.j;
        if (hVar == null || hVar.f71860e != 1) {
            StoryCircleView storyCircleView = this.f73084e;
            if (storyCircleView != null) {
                storyCircleView.setVisibility(0);
            }
            LiveCircleView liveCircleView = this.g;
            if (liveCircleView != null) {
                liveCircleView.setVisibility(4);
                return;
            }
            return;
        }
        StoryCircleView storyCircleView2 = this.f73084e;
        if (storyCircleView2 != null) {
            storyCircleView2.setVisibility(4);
        }
        LiveCircleView liveCircleView2 = this.g;
        if (liveCircleView2 != null) {
            liveCircleView2.setVisibility(0);
        }
    }
}
