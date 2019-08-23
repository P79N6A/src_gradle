package com.ss.android.ugc.aweme.favorites.adapter;

import android.arch.lifecycle.LifecycleOwner;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.jedi.arch.d;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.arch.JediBaseSingleTypeAdapter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.favorites.a.f;
import com.ss.android.ugc.aweme.friends.adapter.DividerItemDecoration;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\f\rB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001e\u0010\b\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/favorites/adapter/ProfileCollectionAdapterForJedi;", "Lcom/ss/android/ugc/aweme/base/arch/JediBaseSingleTypeAdapter;", "Lcom/ss/android/ugc/aweme/favorites/bean/ProfileCollectionItemStruct;", "parent", "Landroid/arch/lifecycle/LifecycleOwner;", "(Landroid/arch/lifecycle/LifecycleOwner;)V", "getParent", "()Landroid/arch/lifecycle/LifecycleOwner;", "createViewHolder", "Lcom/bytedance/jedi/ext/adapter/JediViewHolder;", "Lcom/bytedance/jedi/arch/IReceiver;", "Landroid/view/ViewGroup;", "Companion", "ProfileCollectionViewHolderForJedi", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ProfileCollectionAdapterForJedi extends JediBaseSingleTypeAdapter<f> {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f44247f;
    public static final a h = new a((byte) 0);
    @NotNull
    public final LifecycleOwner g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0017\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0002\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/favorites/adapter/ProfileCollectionAdapterForJedi$ProfileCollectionViewHolderForJedi;", "Lcom/bytedance/jedi/ext/adapter/JediSimpleViewHolder;", "Lcom/ss/android/ugc/aweme/favorites/bean/ProfileCollectionItemStruct;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "mAdapter", "Lcom/ss/android/ugc/aweme/favorites/adapter/ProfileCollectionSubAdapter;", "mCollectionRecycler", "Landroid/support/v7/widget/RecyclerView;", "mTitleText", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "getView", "()Landroid/view/View;", "getCollectionActivityIndex", "", "structType", "(Ljava/lang/Integer;)I", "getTabName", "", "(Ljava/lang/Integer;)Ljava/lang/String;", "onBind", "", "item", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class ProfileCollectionViewHolderForJedi extends JediSimpleViewHolder<f> {
        public static ChangeQuickRedirect g;
        @NotNull
        public final View h;
        private final DmtTextView i;
        private final RecyclerView j;
        private ProfileCollectionSubAdapter k = new ProfileCollectionSubAdapter();

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ProfileCollectionViewHolderForJedi(@NotNull View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.h = view;
            View findViewById = this.h.findViewById(C0906R.id.uc);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.collect_type_title)");
            this.i = (DmtTextView) findViewById;
            View findViewById2 = this.h.findViewById(C0906R.id.u_);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.collect_recycler)");
            this.j = (RecyclerView) findViewById2;
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            this.j.setLayoutManager(new WrapLinearLayoutManager(view2.getContext(), 0, false));
            RecyclerView recyclerView = this.j;
            View view3 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            recyclerView.addItemDecoration(new DividerItemDecoration(0, (int) UIUtils.dip2Px(view3.getContext(), 3.5f), 0));
            this.j.setAdapter(this.k);
            this.h.setOnClickListener(new View.OnClickListener(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f44248a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ ProfileCollectionViewHolderForJedi f44249b;

                {
                    this.f44249b = r1;
                }

                /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b0, code lost:
                    if (com.ss.android.ugc.aweme.setting.AbTestManager.a().aV() != false) goto L_0x00b2;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c7, code lost:
                    if (com.ss.android.ugc.aweme.setting.AbTestManager.a().aV() != false) goto L_0x00c9;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:31:0x00dc, code lost:
                    if (com.ss.android.ugc.aweme.setting.AbTestManager.a().aV() != false) goto L_0x00de;
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
                        com.meituan.robust.ChangeQuickRedirect r2 = f44248a
                        java.lang.Class[] r5 = new java.lang.Class[r9]
                        java.lang.Class<android.view.View> r1 = android.view.View.class
                        r5[r10] = r1
                        java.lang.Class r6 = java.lang.Void.TYPE
                        r3 = 0
                        r4 = 39407(0x99ef, float:5.5221E-41)
                        r1 = r18
                        boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                        if (r0 == 0) goto L_0x0036
                        java.lang.Object[] r0 = new java.lang.Object[r9]
                        r0[r10] = r19
                        com.meituan.robust.ChangeQuickRedirect r2 = f44248a
                        r3 = 0
                        r4 = 39407(0x99ef, float:5.5221E-41)
                        java.lang.Class[] r5 = new java.lang.Class[r9]
                        java.lang.Class<android.view.View> r1 = android.view.View.class
                        r5[r10] = r1
                        java.lang.Class r6 = java.lang.Void.TYPE
                        r1 = r18
                        com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                        return
                    L_0x0036:
                        com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r19)
                        com.ss.android.ugc.aweme.favorites.adapter.ProfileCollectionAdapterForJedi$ProfileCollectionViewHolderForJedi r0 = r7.f44249b
                        com.ss.android.ugc.aweme.favorites.adapter.ProfileCollectionAdapterForJedi$ProfileCollectionViewHolderForJedi r1 = r7.f44249b
                        java.lang.Object r1 = r1.e()
                        com.ss.android.ugc.aweme.favorites.a.f r1 = (com.ss.android.ugc.aweme.favorites.a.f) r1
                        int r1 = r1.f44212e
                        java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                        java.lang.Object[] r11 = new java.lang.Object[r9]
                        r11[r10] = r1
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.favorites.adapter.ProfileCollectionAdapterForJedi.ProfileCollectionViewHolderForJedi.g
                        r14 = 0
                        r15 = 39405(0x99ed, float:5.5218E-41)
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
                        if (r2 == 0) goto L_0x008a
                        java.lang.Object[] r11 = new java.lang.Object[r9]
                        r11[r10] = r1
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.favorites.adapter.ProfileCollectionAdapterForJedi.ProfileCollectionViewHolderForJedi.g
                        r14 = 0
                        r15 = 39405(0x99ed, float:5.5218E-41)
                        java.lang.Class[] r1 = new java.lang.Class[r9]
                        java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
                        r1[r10] = r2
                        java.lang.Class r17 = java.lang.Integer.TYPE
                        r12 = r0
                        r16 = r1
                        java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                        java.lang.Integer r0 = (java.lang.Integer) r0
                        int r0 = r0.intValue()
                        goto L_0x00f4
                    L_0x008a:
                        if (r1 != 0) goto L_0x008d
                        goto L_0x0094
                    L_0x008d:
                        int r0 = r1.intValue()
                        if (r0 != r8) goto L_0x0094
                        goto L_0x00b4
                    L_0x0094:
                        if (r1 != 0) goto L_0x0097
                        goto L_0x009f
                    L_0x0097:
                        int r0 = r1.intValue()
                        if (r0 != r6) goto L_0x009f
                        r0 = 1
                        goto L_0x00f4
                    L_0x009f:
                        if (r1 != 0) goto L_0x00a2
                        goto L_0x00b6
                    L_0x00a2:
                        int r0 = r1.intValue()
                        if (r0 != r3) goto L_0x00b6
                        com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
                        boolean r0 = r0.aV()
                        if (r0 == 0) goto L_0x00b4
                    L_0x00b2:
                        r0 = 2
                        goto L_0x00f4
                    L_0x00b4:
                        r0 = 0
                        goto L_0x00f4
                    L_0x00b6:
                        if (r1 != 0) goto L_0x00b9
                        goto L_0x00cb
                    L_0x00b9:
                        int r0 = r1.intValue()
                        if (r0 != r5) goto L_0x00cb
                        com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
                        boolean r0 = r0.aV()
                        if (r0 == 0) goto L_0x00b2
                    L_0x00c9:
                        r0 = 3
                        goto L_0x00f4
                    L_0x00cb:
                        if (r1 != 0) goto L_0x00ce
                        goto L_0x00e0
                    L_0x00ce:
                        int r0 = r1.intValue()
                        if (r0 != r9) goto L_0x00e0
                        com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
                        boolean r0 = r0.aV()
                        if (r0 == 0) goto L_0x00c9
                    L_0x00de:
                        r0 = 4
                        goto L_0x00f4
                    L_0x00e0:
                        if (r1 != 0) goto L_0x00e3
                        goto L_0x00b4
                    L_0x00e3:
                        int r0 = r1.intValue()
                        if (r0 != r4) goto L_0x00b4
                        com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
                        boolean r0 = r0.aV()
                        if (r0 == 0) goto L_0x00de
                        r0 = 5
                    L_0x00f4:
                        com.ss.android.ugc.aweme.favorites.adapter.ProfileCollectionAdapterForJedi$ProfileCollectionViewHolderForJedi r1 = r7.f44249b
                        com.ss.android.ugc.aweme.favorites.adapter.ProfileCollectionAdapterForJedi$ProfileCollectionViewHolderForJedi r2 = r7.f44249b
                        java.lang.Object r2 = r2.e()
                        com.ss.android.ugc.aweme.favorites.a.f r2 = (com.ss.android.ugc.aweme.favorites.a.f) r2
                        int r2 = r2.f44212e
                        java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                        java.lang.Object[] r11 = new java.lang.Object[r9]
                        r11[r10] = r2
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.favorites.adapter.ProfileCollectionAdapterForJedi.ProfileCollectionViewHolderForJedi.g
                        r14 = 0
                        r15 = 39406(0x99ee, float:5.522E-41)
                        java.lang.Class[] r12 = new java.lang.Class[r9]
                        java.lang.Class<java.lang.Integer> r16 = java.lang.Integer.class
                        r12[r10] = r16
                        java.lang.Class<java.lang.String> r17 = java.lang.String.class
                        r16 = r12
                        r12 = r1
                        boolean r11 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                        if (r11 == 0) goto L_0x013b
                        java.lang.Object[] r11 = new java.lang.Object[r9]
                        r11[r10] = r2
                        com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.favorites.adapter.ProfileCollectionAdapterForJedi.ProfileCollectionViewHolderForJedi.g
                        r14 = 0
                        r15 = 39406(0x99ee, float:5.522E-41)
                        java.lang.Class[] r2 = new java.lang.Class[r9]
                        java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
                        r2[r10] = r3
                        java.lang.Class<java.lang.String> r17 = java.lang.String.class
                        r12 = r1
                        r16 = r2
                        java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                        java.lang.String r1 = (java.lang.String) r1
                        goto L_0x0184
                    L_0x013b:
                        java.lang.String r1 = ""
                        if (r2 != 0) goto L_0x0140
                        goto L_0x0149
                    L_0x0140:
                        int r10 = r2.intValue()
                        if (r10 != r8) goto L_0x0149
                        java.lang.String r1 = "video"
                        goto L_0x0184
                    L_0x0149:
                        if (r2 != 0) goto L_0x014c
                        goto L_0x0155
                    L_0x014c:
                        int r8 = r2.intValue()
                        if (r8 != r6) goto L_0x0155
                        java.lang.String r1 = "location"
                        goto L_0x0184
                    L_0x0155:
                        if (r2 != 0) goto L_0x0158
                        goto L_0x0161
                    L_0x0158:
                        int r6 = r2.intValue()
                        if (r6 != r5) goto L_0x0161
                        java.lang.String r1 = "challenge"
                        goto L_0x0184
                    L_0x0161:
                        if (r2 != 0) goto L_0x0164
                        goto L_0x016d
                    L_0x0164:
                        int r5 = r2.intValue()
                        if (r5 != r9) goto L_0x016d
                        java.lang.String r1 = "music"
                        goto L_0x0184
                    L_0x016d:
                        if (r2 != 0) goto L_0x0170
                        goto L_0x0179
                    L_0x0170:
                        int r5 = r2.intValue()
                        if (r5 != r4) goto L_0x0179
                        java.lang.String r1 = "prop"
                        goto L_0x0184
                    L_0x0179:
                        if (r2 != 0) goto L_0x017c
                        goto L_0x0184
                    L_0x017c:
                        int r2 = r2.intValue()
                        if (r2 != r3) goto L_0x0184
                        java.lang.String r1 = "goods"
                    L_0x0184:
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
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.adapter.ProfileCollectionAdapterForJedi.ProfileCollectionViewHolderForJedi.AnonymousClass1.onClick(android.view.View):void");
                }
            });
        }

        public final /* synthetic */ void a(Object obj) {
            String valueOf;
            f fVar = (f) obj;
            if (PatchProxy.isSupport(new Object[]{fVar}, this, g, false, 39404, new Class[]{f.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar}, this, g, false, 39404, new Class[]{f.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "item");
            DmtTextView dmtTextView = this.i;
            if (fVar.f44210c > 0) {
                valueOf = fVar.f44209b + ' ' + fVar.f44210c;
            } else {
                valueOf = String.valueOf(fVar.f44209b);
            }
            dmtTextView.setText(valueOf);
            ProfileCollectionSubAdapter profileCollectionSubAdapter = this.k;
            List<UrlModel> list = fVar.f44211d;
            int i2 = fVar.f44212e;
            if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i2)}, profileCollectionSubAdapter, ProfileCollectionSubAdapter.f44251a, false, 39410, new Class[]{List.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i2)}, profileCollectionSubAdapter, ProfileCollectionSubAdapter.f44251a, false, 39410, new Class[]{List.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(list, "coverList");
            profileCollectionSubAdapter.f44253b = list;
            profileCollectionSubAdapter.f44254c = i2;
            profileCollectionSubAdapter.notifyDataSetChanged();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/favorites/adapter/ProfileCollectionAdapterForJedi$Companion;", "", "()V", "DIVIDER_SPACE", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileCollectionAdapterForJedi(@NotNull LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner, new ProfileCollectionDiffer(), null, 4);
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "parent");
        this.g = lifecycleOwner;
    }

    @NotNull
    public final JediViewHolder<? extends d, f> a(@NotNull ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f44247f, false, 39403, new Class[]{ViewGroup.class}, JediViewHolder.class)) {
            return (JediViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f44247f, false, 39403, new Class[]{ViewGroup.class}, JediViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.z3, viewGroup2, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…ollection, parent, false)");
        return new ProfileCollectionViewHolderForJedi<>(inflate);
    }
}
