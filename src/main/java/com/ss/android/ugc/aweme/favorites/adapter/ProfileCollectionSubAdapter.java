package com.ss.android.ugc.aweme.favorites.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.p;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\bH\u0016J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bH\u0016J\u001e\u0010\u0012\u001a\u00020\u000b2\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/favorites/adapter/ProfileCollectionSubAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/ss/android/ugc/aweme/favorites/adapter/ProfileCollectionSubAdapter$ProfileCollectionSubViewHolder;", "()V", "coverList", "", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "structType", "", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "Companion", "ProfileCollectionSubViewHolder", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ProfileCollectionSubAdapter extends RecyclerView.Adapter<ProfileCollectionSubViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44251a;

    /* renamed from: d  reason: collision with root package name */
    public static final a f44252d = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    List<UrlModel> f44253b;

    /* renamed from: c  reason: collision with root package name */
    int f44254c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0002\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u0015\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/favorites/adapter/ProfileCollectionSubAdapter$ProfileCollectionSubViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mCover", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "mPoiPlaceViewHolder", "Landroid/widget/ImageView;", "bind", "", "urlModel", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "structType", "", "getCollectionActivityIndex", "(Ljava/lang/Integer;)I", "getTabName", "", "(Ljava/lang/Integer;)Ljava/lang/String;", "jumpToCollectionList", "resetCover", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class ProfileCollectionSubViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44255a;

        /* renamed from: b  reason: collision with root package name */
        final RemoteImageView f44256b;

        /* renamed from: c  reason: collision with root package name */
        final ImageView f44257c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44258a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ProfileCollectionSubViewHolder f44259b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f44260c;

            a(ProfileCollectionSubViewHolder profileCollectionSubViewHolder, int i) {
                this.f44259b = profileCollectionSubViewHolder;
                this.f44260c = i;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a8, code lost:
                if (com.ss.android.ugc.aweme.setting.AbTestManager.a().aV() != false) goto L_0x00aa;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:25:0x00bf, code lost:
                if (com.ss.android.ugc.aweme.setting.AbTestManager.a().aV() != false) goto L_0x00c1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d4, code lost:
                if (com.ss.android.ugc.aweme.setting.AbTestManager.a().aV() != false) goto L_0x00d6;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onClick(android.view.View r19) {
                /*
                    r18 = this;
                    r7 = r18
                    r9 = 1
                    java.lang.Object[] r0 = new java.lang.Object[r9]
                    r10 = 0
                    r0[r10] = r19
                    com.meituan.robust.ChangeQuickRedirect r2 = f44258a
                    java.lang.Class[] r5 = new java.lang.Class[r9]
                    java.lang.Class<android.view.View> r1 = android.view.View.class
                    r5[r10] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r3 = 0
                    r4 = 39418(0x99fa, float:5.5236E-41)
                    r1 = r18
                    boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                    if (r0 == 0) goto L_0x0036
                    java.lang.Object[] r0 = new java.lang.Object[r9]
                    r0[r10] = r19
                    com.meituan.robust.ChangeQuickRedirect r2 = f44258a
                    r3 = 0
                    r4 = 39418(0x99fa, float:5.5236E-41)
                    java.lang.Class[] r5 = new java.lang.Class[r9]
                    java.lang.Class<android.view.View> r1 = android.view.View.class
                    r5[r10] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r1 = r18
                    com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                    return
                L_0x0036:
                    com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r19)
                    com.ss.android.ugc.aweme.favorites.adapter.ProfileCollectionSubAdapter$ProfileCollectionSubViewHolder r0 = r7.f44259b
                    int r1 = r7.f44260c
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    java.lang.Object[] r11 = new java.lang.Object[r9]
                    r11[r10] = r1
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.favorites.adapter.ProfileCollectionSubAdapter.ProfileCollectionSubViewHolder.f44255a
                    r14 = 0
                    r15 = 39416(0x99f8, float:5.5234E-41)
                    java.lang.Class[] r2 = new java.lang.Class[r9]
                    java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
                    r2[r10] = r3
                    java.lang.Class r17 = java.lang.Integer.TYPE
                    r12 = r0
                    r16 = r2
                    boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                    r3 = 6
                    r4 = 5
                    r5 = 3
                    r6 = 4
                    r8 = 2
                    if (r2 == 0) goto L_0x0082
                    java.lang.Object[] r11 = new java.lang.Object[r9]
                    r11[r10] = r1
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.favorites.adapter.ProfileCollectionSubAdapter.ProfileCollectionSubViewHolder.f44255a
                    r14 = 0
                    r15 = 39416(0x99f8, float:5.5234E-41)
                    java.lang.Class[] r1 = new java.lang.Class[r9]
                    java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
                    r1[r10] = r2
                    java.lang.Class r17 = java.lang.Integer.TYPE
                    r12 = r0
                    r16 = r1
                    java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                    java.lang.Integer r0 = (java.lang.Integer) r0
                    int r0 = r0.intValue()
                    goto L_0x00ec
                L_0x0082:
                    if (r1 != 0) goto L_0x0085
                    goto L_0x008c
                L_0x0085:
                    int r0 = r1.intValue()
                    if (r0 != r8) goto L_0x008c
                    goto L_0x00ac
                L_0x008c:
                    if (r1 != 0) goto L_0x008f
                    goto L_0x0097
                L_0x008f:
                    int r0 = r1.intValue()
                    if (r0 != r6) goto L_0x0097
                    r0 = 1
                    goto L_0x00ec
                L_0x0097:
                    if (r1 != 0) goto L_0x009a
                    goto L_0x00ae
                L_0x009a:
                    int r0 = r1.intValue()
                    if (r0 != r3) goto L_0x00ae
                    com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
                    boolean r0 = r0.aV()
                    if (r0 == 0) goto L_0x00ac
                L_0x00aa:
                    r0 = 2
                    goto L_0x00ec
                L_0x00ac:
                    r0 = 0
                    goto L_0x00ec
                L_0x00ae:
                    if (r1 != 0) goto L_0x00b1
                    goto L_0x00c3
                L_0x00b1:
                    int r0 = r1.intValue()
                    if (r0 != r5) goto L_0x00c3
                    com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
                    boolean r0 = r0.aV()
                    if (r0 == 0) goto L_0x00aa
                L_0x00c1:
                    r0 = 3
                    goto L_0x00ec
                L_0x00c3:
                    if (r1 != 0) goto L_0x00c6
                    goto L_0x00d8
                L_0x00c6:
                    int r0 = r1.intValue()
                    if (r0 != r9) goto L_0x00d8
                    com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
                    boolean r0 = r0.aV()
                    if (r0 == 0) goto L_0x00c1
                L_0x00d6:
                    r0 = 4
                    goto L_0x00ec
                L_0x00d8:
                    if (r1 != 0) goto L_0x00db
                    goto L_0x00ac
                L_0x00db:
                    int r0 = r1.intValue()
                    if (r0 != r4) goto L_0x00ac
                    com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
                    boolean r0 = r0.aV()
                    if (r0 == 0) goto L_0x00d6
                    r0 = 5
                L_0x00ec:
                    com.ss.android.ugc.aweme.favorites.adapter.ProfileCollectionSubAdapter$ProfileCollectionSubViewHolder r1 = r7.f44259b
                    int r2 = r7.f44260c
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    java.lang.Object[] r11 = new java.lang.Object[r9]
                    r11[r10] = r2
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.favorites.adapter.ProfileCollectionSubAdapter.ProfileCollectionSubViewHolder.f44255a
                    r14 = 0
                    r15 = 39417(0x99f9, float:5.5235E-41)
                    java.lang.Class[] r12 = new java.lang.Class[r9]
                    java.lang.Class<java.lang.Integer> r16 = java.lang.Integer.class
                    r12[r10] = r16
                    java.lang.Class<java.lang.String> r17 = java.lang.String.class
                    r16 = r12
                    r12 = r1
                    boolean r11 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                    if (r11 == 0) goto L_0x012b
                    java.lang.Object[] r11 = new java.lang.Object[r9]
                    r11[r10] = r2
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.favorites.adapter.ProfileCollectionSubAdapter.ProfileCollectionSubViewHolder.f44255a
                    r14 = 0
                    r15 = 39417(0x99f9, float:5.5235E-41)
                    java.lang.Class[] r2 = new java.lang.Class[r9]
                    java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
                    r2[r10] = r3
                    java.lang.Class<java.lang.String> r17 = java.lang.String.class
                    r12 = r1
                    r16 = r2
                    java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                    java.lang.String r1 = (java.lang.String) r1
                    goto L_0x0174
                L_0x012b:
                    java.lang.String r1 = ""
                    if (r2 != 0) goto L_0x0130
                    goto L_0x0139
                L_0x0130:
                    int r10 = r2.intValue()
                    if (r10 != r8) goto L_0x0139
                    java.lang.String r1 = "video"
                    goto L_0x0174
                L_0x0139:
                    if (r2 != 0) goto L_0x013c
                    goto L_0x0145
                L_0x013c:
                    int r8 = r2.intValue()
                    if (r8 != r6) goto L_0x0145
                    java.lang.String r1 = "location"
                    goto L_0x0174
                L_0x0145:
                    if (r2 != 0) goto L_0x0148
                    goto L_0x0151
                L_0x0148:
                    int r6 = r2.intValue()
                    if (r6 != r5) goto L_0x0151
                    java.lang.String r1 = "challenge"
                    goto L_0x0174
                L_0x0151:
                    if (r2 != 0) goto L_0x0154
                    goto L_0x015d
                L_0x0154:
                    int r5 = r2.intValue()
                    if (r5 != r9) goto L_0x015d
                    java.lang.String r1 = "music"
                    goto L_0x0174
                L_0x015d:
                    if (r2 != 0) goto L_0x0160
                    goto L_0x0169
                L_0x0160:
                    int r5 = r2.intValue()
                    if (r5 != r4) goto L_0x0169
                    java.lang.String r1 = "prop"
                    goto L_0x0174
                L_0x0169:
                    if (r2 != 0) goto L_0x016c
                    goto L_0x0174
                L_0x016c:
                    int r2 = r2.intValue()
                    if (r2 != r3) goto L_0x0174
                    java.lang.String r1 = "goods"
                L_0x0174:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    java.lang.String r3 = "aweme://favorite?"
                    r2.<init>(r3)
                    java.lang.String r3 = "index="
                    r2.append(r3)
                    r2.append(r0)
                    java.lang.String r0 = "&enter_from=personal_homepage&enter_method=click_collection_section&tab_name="
                    r2.append(r0)
                    r2.append(r1)
                    java.lang.String r0 = r2.toString()
                    com.ss.android.ugc.aweme.ag.h r1 = com.ss.android.ugc.aweme.ag.h.a()
                    r1.a((java.lang.String) r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.adapter.ProfileCollectionSubAdapter.ProfileCollectionSubViewHolder.a.onClick(android.view.View):void");
            }
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f44255a, false, 39414, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f44255a, false, 39414, new Class[0], Void.TYPE);
                return;
            }
            this.f44256b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f44256b.setImageResource(C0906R.color.a34);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ProfileCollectionSubViewHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            View findViewById = view.findViewById(C0906R.id.a1a);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.cover)");
            this.f44256b = (RemoteImageView) findViewById;
            View findViewById2 = view.findViewById(C0906R.id.c1y);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.poi_img_placeholder)");
            this.f44257c = (ImageView) findViewById2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/favorites/adapter/ProfileCollectionSubAdapter$Companion;", "", "()V", "ITEM_COUNT", "", "SPACE", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int getItemCount() {
        return 4;
    }

    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ProfileCollectionSubViewHolder profileCollectionSubViewHolder;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f44251a, false, 39411, new Class[]{ViewGroup.class, Integer.TYPE}, ProfileCollectionSubViewHolder.class)) {
            profileCollectionSubViewHolder = (ProfileCollectionSubViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f44251a, false, 39411, new Class[]{ViewGroup.class, Integer.TYPE}, ProfileCollectionSubViewHolder.class);
        } else {
            Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.z5, viewGroup2, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
            ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
            int b2 = (p.b(viewGroup.getContext()) - ((int) UIUtils.dip2Px(viewGroup.getContext(), 62.0f))) / 4;
            layoutParams.width = b2;
            layoutParams.height = b2;
            inflate.setLayoutParams(layoutParams);
            profileCollectionSubViewHolder = new ProfileCollectionSubViewHolder(inflate);
        }
        return profileCollectionSubViewHolder;
    }

    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = i;
        ProfileCollectionSubViewHolder profileCollectionSubViewHolder = (ProfileCollectionSubViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{profileCollectionSubViewHolder, Integer.valueOf(i)}, this, f44251a, false, 39412, new Class[]{ProfileCollectionSubViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{profileCollectionSubViewHolder, Integer.valueOf(i)}, this, f44251a, false, 39412, new Class[]{ProfileCollectionSubViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(profileCollectionSubViewHolder, "holder");
        List<UrlModel> list = this.f44253b;
        if (list != null) {
            if (i2 < list.size()) {
                UrlModel urlModel = list.get(i2);
                int i3 = this.f44254c;
                if (PatchProxy.isSupport(new Object[]{urlModel, Integer.valueOf(i3)}, profileCollectionSubViewHolder, ProfileCollectionSubViewHolder.f44255a, false, 39413, new Class[]{UrlModel.class, Integer.TYPE}, Void.TYPE)) {
                    ProfileCollectionSubViewHolder profileCollectionSubViewHolder2 = profileCollectionSubViewHolder;
                    PatchProxy.accessDispatch(new Object[]{urlModel, Integer.valueOf(i3)}, profileCollectionSubViewHolder2, ProfileCollectionSubViewHolder.f44255a, false, 39413, new Class[]{UrlModel.class, Integer.TYPE}, Void.TYPE);
                } else {
                    profileCollectionSubViewHolder.f44256b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    if (urlModel != null && !CollectionUtils.isEmpty(urlModel.getUrlList())) {
                        profileCollectionSubViewHolder.f44257c.setVisibility(8);
                        c.b(profileCollectionSubViewHolder.f44256b, urlModel);
                    } else if (i3 != 1) {
                        switch (i3) {
                            case 3:
                                ProfileCollectionSubViewHolder profileCollectionSubViewHolder3 = profileCollectionSubViewHolder;
                                c.a(profileCollectionSubViewHolder3.f44256b, 2130840133);
                                profileCollectionSubViewHolder3.f44257c.setVisibility(8);
                                break;
                            case 4:
                                ProfileCollectionSubViewHolder profileCollectionSubViewHolder4 = profileCollectionSubViewHolder;
                                profileCollectionSubViewHolder4.a();
                                profileCollectionSubViewHolder4.f44257c.setVisibility(0);
                                break;
                            case 5:
                                ProfileCollectionSubViewHolder profileCollectionSubViewHolder5 = profileCollectionSubViewHolder;
                                c.a(profileCollectionSubViewHolder5.f44256b, 2130840204);
                                profileCollectionSubViewHolder5.f44257c.setVisibility(8);
                                break;
                            default:
                                profileCollectionSubViewHolder.f44257c.setVisibility(8);
                                break;
                        }
                    } else {
                        ProfileCollectionSubViewHolder profileCollectionSubViewHolder6 = profileCollectionSubViewHolder;
                        c.a(profileCollectionSubViewHolder6.f44256b, 2130840135);
                        profileCollectionSubViewHolder6.f44257c.setVisibility(8);
                    }
                }
            } else {
                profileCollectionSubViewHolder.a();
            }
        }
        int i4 = this.f44254c;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i4)}, profileCollectionSubViewHolder, ProfileCollectionSubViewHolder.f44255a, false, 39415, new Class[]{Integer.TYPE}, Void.TYPE)) {
            ProfileCollectionSubViewHolder profileCollectionSubViewHolder7 = profileCollectionSubViewHolder;
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i4)}, profileCollectionSubViewHolder7, ProfileCollectionSubViewHolder.f44255a, false, 39415, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        profileCollectionSubViewHolder.itemView.setOnClickListener(new ProfileCollectionSubViewHolder.a(profileCollectionSubViewHolder, i4));
    }
}
