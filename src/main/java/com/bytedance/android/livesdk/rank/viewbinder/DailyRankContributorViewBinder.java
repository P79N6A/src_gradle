package com.bytedance.android.livesdk.rank.viewbinder;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.q;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.event.k;
import com.bytedance.android.livesdk.rank.model.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.drakeet.multitype.c;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0014J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014¨\u0006\u000f"}, d2 = {"Lcom/bytedance/android/livesdk/rank/viewbinder/DailyRankContributorViewBinder;", "Lme/drakeet/multitype/ItemViewBinder;", "Lcom/bytedance/android/livesdk/rank/model/RankItem;", "Lcom/bytedance/android/livesdk/rank/viewbinder/DailyRankContributorViewBinder$DailyRankContributorViewHolder;", "()V", "onBindViewHolder", "", "holder", "item", "onCreateViewHolder", "inflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "DailyRankContributorViewHolder", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
public final class DailyRankContributorViewBinder extends c<b, DailyRankContributorViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17032a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/bytedance/android/livesdk/rank/viewbinder/DailyRankContributorViewBinder$DailyRankContributorViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "item", "Lcom/bytedance/android/livesdk/rank/model/RankItem;", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    public static final class DailyRankContributorViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17033a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0010"}, d2 = {"com/bytedance/android/livesdk/rank/viewbinder/DailyRankContributorViewBinder$DailyRankContributorViewHolder$bind$1", "Lcom/bytedance/android/live/core/utils/ImageUtil$ImageLoadListener;", "onLoadFailed", "", "imageModel", "Lcom/bytedance/android/live/base/model/ImageModel;", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onLoadStarted", "onLoadSuccess", "width", "", "height", "fromNetwork", "", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
        public static final class a implements q.a {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f17034a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ DailyRankContributorViewHolder f17035b;

            public final void a(@NotNull ImageModel imageModel) {
                ImageModel imageModel2 = imageModel;
                if (PatchProxy.isSupport(new Object[]{imageModel2}, this, f17034a, false, 13080, new Class[]{ImageModel.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{imageModel2}, this, f17034a, false, 13080, new Class[]{ImageModel.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(imageModel2, "imageModel");
            }

            public final void a(@NotNull ImageModel imageModel, @NotNull Exception exc) {
                ImageModel imageModel2 = imageModel;
                Exception exc2 = exc;
                if (PatchProxy.isSupport(new Object[]{imageModel2, exc2}, this, f17034a, false, 13082, new Class[]{ImageModel.class, Exception.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{imageModel2, exc2}, this, f17034a, false, 13082, new Class[]{ImageModel.class, Exception.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(imageModel2, "imageModel");
                Intrinsics.checkParameterIsNotNull(exc2, "e");
            }

            a(DailyRankContributorViewHolder dailyRankContributorViewHolder) {
                this.f17035b = dailyRankContributorViewHolder;
            }

            public final void a(@NotNull ImageModel imageModel, int i, int i2, boolean z) {
                ImageModel imageModel2 = imageModel;
                if (PatchProxy.isSupport(new Object[]{imageModel2, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f17034a, false, 13081, new Class[]{ImageModel.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{imageModel2, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z)}, this, f17034a, false, 13081, new Class[]{ImageModel.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(imageModel, "imageModel");
                View view = this.f17035b.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                ImageView imageView = (ImageView) view.findViewById(C0906R.id.aog);
                Intrinsics.checkExpressionValueIsNotNull(imageView, "itemView.honor");
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                int a2 = ac.a(30.0f);
                layoutParams.width = a2;
                layoutParams.height = (a2 * i2) / i;
                View view2 = this.f17035b.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                ImageView imageView2 = (ImageView) view2.findViewById(C0906R.id.aog);
                Intrinsics.checkExpressionValueIsNotNull(imageView2, "itemView.honor");
                imageView2.setLayoutParams(layoutParams);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 13})
        static final class b implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f17036a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.bytedance.android.livesdk.rank.model.b f17037b;

            b(com.bytedance.android.livesdk.rank.model.b bVar) {
                this.f17037b = bVar;
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f17036a, false, 13083, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f17036a, false, 13083, new Class[]{View.class}, Void.TYPE);
                } else if (this.f17037b.f17025b != null) {
                    com.bytedance.android.livesdk.u.a.a().a((Object) new UserProfileEvent(this.f17037b.f17025b));
                    Map hashMap = new HashMap();
                    hashMap.put("event_belong", "live");
                    hashMap.put("room_id", String.valueOf(this.f17037b.a()));
                    User user = this.f17037b.f17025b;
                    Intrinsics.checkExpressionValueIsNotNull(user, "item.user");
                    hashMap.put("user_id", String.valueOf(user.getId()));
                    hashMap.put("event_type", "click");
                    hashMap.put("event_module", "popup");
                    hashMap.put("event_page", "live_detail");
                    com.bytedance.android.livesdk.j.a.a().a("hourly_richest_click", hashMap, new Object[0]);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 13})
        static final class c implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f17038a;

            /* renamed from: b  reason: collision with root package name */
            public static final c f17039b = new c();

            c() {
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f17038a, false, 13084, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f17038a, false, 13084, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                com.bytedance.android.livesdk.u.a.a().a((Object) new k(true));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DailyRankContributorViewHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
        }
    }

    public final /* synthetic */ RecyclerView.ViewHolder a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        DailyRankContributorViewHolder dailyRankContributorViewHolder;
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2}, this, f17032a, false, 13076, new Class[]{LayoutInflater.class, ViewGroup.class}, DailyRankContributorViewHolder.class)) {
            dailyRankContributorViewHolder = (DailyRankContributorViewHolder) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2}, this, f17032a, false, 13076, new Class[]{LayoutInflater.class, ViewGroup.class}, DailyRankContributorViewHolder.class);
        } else {
            Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
            Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
            View inflate = layoutInflater2.inflate(C0906R.layout.ami, viewGroup2, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
            dailyRankContributorViewHolder = new DailyRankContributorViewHolder(inflate);
        }
        return dailyRankContributorViewHolder;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(android.support.v7.widget.RecyclerView.ViewHolder r18, java.lang.Object r19) {
        /*
            r17 = this;
            r7 = r18
            com.bytedance.android.livesdk.rank.viewbinder.DailyRankContributorViewBinder$DailyRankContributorViewHolder r7 = (com.bytedance.android.livesdk.rank.viewbinder.DailyRankContributorViewBinder.DailyRankContributorViewHolder) r7
            r8 = r19
            com.bytedance.android.livesdk.rank.model.b r8 = (com.bytedance.android.livesdk.rank.model.b) r8
            r0 = 2
            java.lang.Object[] r9 = new java.lang.Object[r0]
            r16 = 0
            r9[r16] = r7
            r6 = 1
            r9[r6] = r8
            com.meituan.robust.ChangeQuickRedirect r11 = f17032a
            java.lang.Class[] r14 = new java.lang.Class[r0]
            java.lang.Class<com.bytedance.android.livesdk.rank.viewbinder.DailyRankContributorViewBinder$DailyRankContributorViewHolder> r1 = com.bytedance.android.livesdk.rank.viewbinder.DailyRankContributorViewBinder.DailyRankContributorViewHolder.class
            r14[r16] = r1
            java.lang.Class<com.bytedance.android.livesdk.rank.model.b> r1 = com.bytedance.android.livesdk.rank.model.b.class
            r14[r6] = r1
            java.lang.Class r15 = java.lang.Void.TYPE
            r12 = 0
            r13 = 13077(0x3315, float:1.8325E-41)
            r10 = r17
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
            if (r1 == 0) goto L_0x0048
            java.lang.Object[] r9 = new java.lang.Object[r0]
            r9[r16] = r7
            r9[r6] = r8
            com.meituan.robust.ChangeQuickRedirect r11 = f17032a
            r12 = 0
            r13 = 13077(0x3315, float:1.8325E-41)
            java.lang.Class[] r14 = new java.lang.Class[r0]
            java.lang.Class<com.bytedance.android.livesdk.rank.viewbinder.DailyRankContributorViewBinder$DailyRankContributorViewHolder> r0 = com.bytedance.android.livesdk.rank.viewbinder.DailyRankContributorViewBinder.DailyRankContributorViewHolder.class
            r14[r16] = r0
            java.lang.Class<com.bytedance.android.livesdk.rank.model.b> r0 = com.bytedance.android.livesdk.rank.model.b.class
            r14[r6] = r0
            java.lang.Class r15 = java.lang.Void.TYPE
            r10 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x0048:
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r7, r0)
            java.lang.String r0 = "item"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r16] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = com.bytedance.android.livesdk.rank.viewbinder.DailyRankContributorViewBinder.DailyRankContributorViewHolder.f17033a
            r3 = 0
            r4 = 13078(0x3316, float:1.8326E-41)
            java.lang.Class[] r5 = new java.lang.Class[r6]
            java.lang.Class<com.bytedance.android.livesdk.rank.model.b> r1 = com.bytedance.android.livesdk.rank.model.b.class
            r5[r16] = r1
            java.lang.Class r9 = java.lang.Void.TYPE
            r1 = r7
            r10 = 1
            r6 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0082
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r16] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = com.bytedance.android.livesdk.rank.viewbinder.DailyRankContributorViewBinder.DailyRankContributorViewHolder.f17033a
            r3 = 0
            r4 = 13078(0x3316, float:1.8326E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.bytedance.android.livesdk.rank.model.b> r1 = com.bytedance.android.livesdk.rank.model.b.class
            r5[r16] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r7
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0082:
            java.lang.String r0 = "item"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            android.view.View r0 = r7.itemView
            java.lang.String r1 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r1 = 2131166166(0x7f0703d6, float:1.794657E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            com.bytedance.android.live.base.model.user.User r2 = r8.f17025b
            java.lang.String r3 = "item.user"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            com.bytedance.android.live.base.model.ImageModel r2 = r2.getAvatarThumb()
            android.view.View r3 = r7.itemView
            java.lang.String r4 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            android.view.View r3 = r3.findViewById(r1)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            java.lang.String r4 = "itemView.contributor_avatar"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            int r3 = r3.getWidth()
            android.view.View r4 = r7.itemView
            java.lang.String r5 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            android.view.View r4 = r4.findViewById(r1)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            java.lang.String r5 = "itemView.contributor_avatar"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            int r4 = r4.getHeight()
            r5 = 2130841141(0x7f020e35, float:1.728734E38)
            com.bytedance.android.livesdk.chatroom.f.b.b(r0, r2, r3, r4, r5)
            com.bytedance.android.live.base.model.user.User r0 = r8.f17025b
            r2 = 0
            if (r0 == 0) goto L_0x00e4
            com.bytedance.android.live.base.model.user.m r0 = r0.getUserHonor()
            if (r0 == 0) goto L_0x00e4
            com.bytedance.android.live.base.model.ImageModel r0 = r0.j()
            goto L_0x00e5
        L_0x00e4:
            r0 = r2
        L_0x00e5:
            r3 = 8
            r4 = 2131167119(0x7f07078f, float:1.7948503E38)
            if (r0 == 0) goto L_0x0104
            android.view.View r5 = r7.itemView
            java.lang.String r6 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            android.view.View r4 = r5.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            com.bytedance.android.livesdk.rank.viewbinder.DailyRankContributorViewBinder$DailyRankContributorViewHolder$a r5 = new com.bytedance.android.livesdk.rank.viewbinder.DailyRankContributorViewBinder$DailyRankContributorViewHolder$a
            r5.<init>(r7)
            com.bytedance.android.live.core.utils.q$a r5 = (com.bytedance.android.live.core.utils.q.a) r5
            com.bytedance.android.livesdk.chatroom.f.b.a((android.widget.ImageView) r4, (com.bytedance.android.live.base.model.ImageModel) r0, (com.bytedance.android.live.core.utils.q.a) r5)
            goto L_0x0119
        L_0x0104:
            android.view.View r0 = r7.itemView
            java.lang.String r5 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r5)
            android.view.View r0 = r0.findViewById(r4)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            java.lang.String r4 = "itemView.honor"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r4)
            r0.setVisibility(r3)
        L_0x0119:
            android.view.View r0 = r7.itemView
            java.lang.String r4 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r4)
            r4 = 2131166167(0x7f0703d7, float:1.7946572E38)
            android.view.View r0 = r0.findViewById(r4)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r4 = "itemView.contributor_name"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r4)
            com.bytedance.android.live.base.model.user.User r4 = r8.f17025b
            if (r4 == 0) goto L_0x0136
            java.lang.String r2 = r4.getNickName()
        L_0x0136:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
            com.bytedance.android.live.base.model.user.User r0 = r8.f17025b
            r2 = 2131170023(0x7f0712e7, float:1.7954393E38)
            if (r0 == 0) goto L_0x0187
            com.bytedance.android.live.base.model.user.User r0 = r8.f17025b
            java.lang.String r4 = "item.user"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r4)
            com.bytedance.android.live.base.model.ImageModel r0 = r0.getMedal()
            if (r0 == 0) goto L_0x0187
            com.bytedance.android.live.base.model.user.User r0 = r8.f17025b
            java.lang.String r4 = "item.user"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r4)
            com.bytedance.android.live.base.model.ImageModel r0 = r0.getMedal()
            java.lang.String r4 = "item.user.medal"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r4)
            java.util.List r0 = r0.getUrls()
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0187
            android.view.View r0 = r7.itemView
            java.lang.String r3 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)
            android.view.View r0 = r0.findViewById(r2)
            com.bytedance.android.live.core.widget.HSImageView r0 = (com.bytedance.android.live.core.widget.HSImageView) r0
            com.bytedance.android.live.base.model.user.User r2 = r8.f17025b
            java.lang.String r3 = "item.user"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            com.bytedance.android.live.base.model.ImageModel r2 = r2.getMedal()
            com.bytedance.android.livesdk.chatroom.f.b.a((android.widget.ImageView) r0, (com.bytedance.android.live.base.model.ImageModel) r2)
            goto L_0x019c
        L_0x0187:
            android.view.View r0 = r7.itemView
            java.lang.String r4 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r4)
            android.view.View r0 = r0.findViewById(r2)
            com.bytedance.android.live.core.widget.HSImageView r0 = (com.bytedance.android.live.core.widget.HSImageView) r0
            java.lang.String r2 = "itemView.special_medal"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            r0.setVisibility(r3)
        L_0x019c:
            boolean r0 = com.bytedance.android.livesdkapi.a.a.f18614b
            r2 = 17
            r3 = 2131625495(0x7f0e0617, float:1.88782E38)
            if (r0 != 0) goto L_0x01f2
            r0 = 2131564325(0x7f0d1725, float:1.8754132E38)
            java.lang.String r0 = com.bytedance.android.live.core.utils.ac.a((int) r0)
            long r4 = r8.f17026c
            java.lang.String r4 = com.bytedance.android.live.core.utils.e.c(r4)
            r5 = 2131564322(0x7f0d1722, float:1.8754126E38)
            java.lang.String r5 = com.bytedance.android.live.core.utils.ac.a((int) r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            android.text.SpannableString r6 = new android.text.SpannableString
            r9 = r4
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r6.<init>(r9)
            android.text.style.ForegroundColorSpan r9 = new android.text.style.ForegroundColorSpan
            int r3 = com.bytedance.android.live.core.utils.ac.b((int) r3)
            r9.<init>(r3)
            int r0 = r0.length()
            int r3 = r4.length()
            if (r5 != 0) goto L_0x01e9
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x01e9:
            int r4 = r5.length()
            int r3 = r3 - r4
            com.bytedance.android.livesdk.rank.viewbinder.a.a(r6, r9, r0, r3, r2)
            goto L_0x0239
        L_0x01f2:
            r0 = 2131564321(0x7f0d1721, float:1.8754124E38)
            java.lang.String r0 = com.bytedance.android.live.core.utils.ac.a((int) r0)
            java.lang.Object[] r4 = new java.lang.Object[r10]
            long r5 = r8.f17026c
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4[r16] = r5
            java.lang.String r0 = com.bytedance.android.livesdk.utils.n.a(r0, r4)
            long r4 = r8.f17026c
            java.lang.String r4 = java.lang.String.valueOf(r4)
            android.text.SpannableString r6 = new android.text.SpannableString
            r5 = r0
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r6.<init>(r5)
            android.text.style.ForegroundColorSpan r15 = new android.text.style.ForegroundColorSpan
            int r3 = com.bytedance.android.live.core.utils.ac.b((int) r3)
            r15.<init>(r3)
            java.lang.String r3 = "origin"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)
            r11 = 0
            r12 = 0
            r13 = 6
            r14 = 0
            r9 = r5
            r10 = r4
            int r0 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) r9, (java.lang.String) r10, (int) r11, (boolean) r12, (int) r13, (java.lang.Object) r14)
            int r3 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) r9, (java.lang.String) r10, (int) r11, (boolean) r12, (int) r13, (java.lang.Object) r14)
            int r4 = r4.length()
            int r3 = r3 + r4
            com.bytedance.android.livesdk.rank.viewbinder.a.a(r6, r15, r0, r3, r2)
        L_0x0239:
            android.view.View r0 = r7.itemView
            java.lang.String r2 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            r2 = 2131166752(0x7f070620, float:1.7947758E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r2 = "itemView.fire_number"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r0.setText(r6)
            android.view.View r0 = r7.itemView
            java.lang.String r2 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            com.bytedance.android.livesdk.rank.viewbinder.DailyRankContributorViewBinder$DailyRankContributorViewHolder$b r1 = new com.bytedance.android.livesdk.rank.viewbinder.DailyRankContributorViewBinder$DailyRankContributorViewHolder$b
            r1.<init>(r8)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            android.view.View r0 = r7.itemView
            java.lang.String r1 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r1 = 2131167097(0x7f070779, float:1.7948458E38)
            android.view.View r0 = r0.findViewById(r1)
            com.bytedance.android.livesdk.rank.viewbinder.DailyRankContributorViewBinder$DailyRankContributorViewHolder$c r1 = com.bytedance.android.livesdk.rank.viewbinder.DailyRankContributorViewBinder.DailyRankContributorViewHolder.c.f17039b
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.rank.viewbinder.DailyRankContributorViewBinder.a(android.support.v7.widget.RecyclerView$ViewHolder, java.lang.Object):void");
    }
}
