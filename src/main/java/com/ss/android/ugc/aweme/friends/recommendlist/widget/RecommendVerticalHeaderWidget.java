package com.ss.android.ugc.aweme.friends.recommendlist.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.widget.Widget;
import com.bytedance.widget.ext.list.ItemWidgetViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.arch.JediBaseItemWidget;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.face2face.Face2FacePermissionActivity;
import com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendListState;
import com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendListViewModel;
import com.ss.android.ugc.aweme.friends.ui.ContactsActivity;
import com.ss.android.ugc.aweme.qrcode.QRCodePermissionActivity;
import com.ss.android.ugc.aweme.share.c.i;
import com.ss.android.ugc.aweme.utils.permission.PermissionStateReporter;
import com.ss.android.ugc.aweme.utils.permission.a;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH\u0002J\f\u0010\u0015\u001a\u00020\f*\u00020\u0003H\u0002J\f\u0010\u0016\u001a\u00020\f*\u00020\u0003H\u0002J\u0014\u0010\u0017\u001a\u00020\f*\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0002H\u0014R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/widget/RecommendVerticalHeaderWidget;", "Lcom/ss/android/ugc/aweme/base/arch/JediBaseItemWidget;", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/Header;", "Lcom/ss/android/ugc/aweme/friends/recommendlist/widget/RecommendVerticalHeaderViewHolder;", "()V", "mRecommendListViewModel", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListViewModel;", "getMRecommendListViewModel", "()Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListViewModel;", "mRecommendListViewModel$delegate", "Lkotlin/Lazy;", "addFriendsMob", "", "type", "", "getRecommendEnterFrom", "recommendUserType", "", "mobClickQQWechat", "platform", "enterFrom", "bindFaceToFace", "initClickListener", "onBindViewHolder", "item", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RecommendVerticalHeaderWidget extends JediBaseItemWidget<com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.a, RecommendVerticalHeaderViewHolder> {
    public static ChangeQuickRedirect i;
    static final /* synthetic */ KProperty[] j = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(RecommendVerticalHeaderWidget.class), "mRecommendListViewModel", "getMRecommendListViewModel()Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListViewModel;"))};
    private final Lazy k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\f\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004\"\u0010\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0002\u0010\u0006*\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"<anonymous>", "VM", "T", "Lcom/bytedance/widget/Widget;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/JediViewModel;", "S", "Lcom/bytedance/jedi/arch/State;", "invoke", "()Lcom/bytedance/jedi/arch/JediViewModel;", "com/bytedance/jedi/arch/LegeciesKt$hostViewModel$2"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function0<RecommendListViewModel> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Widget $this_hostViewModel;
        final /* synthetic */ KClass $viewModelClass;
        final /* synthetic */ KClass $viewModelClass$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Widget widget, KClass kClass, KClass kClass2) {
            super(0);
            this.$this_hostViewModel = widget;
            this.$viewModelClass = kClass;
            this.$viewModelClass$inlined = kClass2;
        }

        /* JADX WARNING: type inference failed for: r0v8, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendListViewModel] */
        /* JADX WARNING: type inference failed for: r2v13, types: [com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r4v4, types: [com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r0v14, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendListViewModel] */
        /* JADX WARNING: Failed to insert additional move for type inference */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.NotNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendListViewModel invoke() {
            /*
                r9 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class<com.bytedance.jedi.arch.JediViewModel> r7 = com.bytedance.jedi.arch.JediViewModel.class
                r4 = 0
                r5 = 46975(0xb77f, float:6.5826E-41)
                r2 = r9
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0028
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
                r5 = 0
                r6 = 46975(0xb77f, float:6.5826E-41)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class<com.bytedance.jedi.arch.JediViewModel> r8 = com.bytedance.jedi.arch.JediViewModel.class
                r3 = r9
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                return r0
            L_0x0028:
                com.bytedance.widget.Widget r0 = r9.$this_hostViewModel
                java.lang.Object r0 = r0.j()
                kotlin.reflect.KClass r1 = r9.$viewModelClass$inlined
                java.lang.Class r1 = kotlin.jvm.a.a(r1)
                java.lang.String r1 = r1.getName()
                java.lang.String r2 = "viewModelClass.java.name"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                r2 = 0
                boolean r3 = r0 instanceof android.support.v4.app.Fragment
                if (r3 == 0) goto L_0x007e
                android.support.v4.app.Fragment r0 = (android.support.v4.app.Fragment) r0
                r3 = r0
            L_0x0045:
                if (r3 == 0) goto L_0x0062
                android.arch.lifecycle.ViewModelProvider$Factory r4 = com.bytedance.jedi.arch.b.a()     // Catch:{ af -> 0x005d }
                android.arch.lifecycle.ViewModelProvider r4 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.Fragment) r3, (android.arch.lifecycle.ViewModelProvider.Factory) r4)     // Catch:{ af -> 0x005d }
                kotlin.reflect.KClass r5 = r9.$viewModelClass     // Catch:{ af -> 0x005d }
                java.lang.Class r5 = kotlin.jvm.a.a(r5)     // Catch:{ af -> 0x005d }
                android.arch.lifecycle.ViewModel r4 = r4.get(r1, r5)     // Catch:{ af -> 0x005d }
                com.bytedance.jedi.arch.JediViewModel r4 = (com.bytedance.jedi.arch.JediViewModel) r4     // Catch:{ af -> 0x005d }
                r2 = r4
                goto L_0x0062
            L_0x005d:
                android.support.v4.app.Fragment r3 = r3.getParentFragment()
                goto L_0x0045
            L_0x0062:
                if (r2 != 0) goto L_0x007d
                android.support.v4.app.FragmentActivity r0 = r0.requireActivity()
                android.arch.lifecycle.ViewModelProvider$Factory r2 = com.bytedance.jedi.arch.b.a()
                android.arch.lifecycle.ViewModelProvider r0 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.FragmentActivity) r0, (android.arch.lifecycle.ViewModelProvider.Factory) r2)
                kotlin.reflect.KClass r2 = r9.$viewModelClass
                java.lang.Class r2 = kotlin.jvm.a.a(r2)
                android.arch.lifecycle.ViewModel r0 = r0.get(r1, r2)
                r2 = r0
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
            L_0x007d:
                return r2
            L_0x007e:
                boolean r2 = r0 instanceof android.support.v4.app.FragmentActivity
                if (r2 == 0) goto L_0x009e
                android.support.v4.app.FragmentActivity r0 = (android.support.v4.app.FragmentActivity) r0
                android.arch.lifecycle.ViewModelProvider$Factory r2 = com.bytedance.jedi.arch.b.a()
                android.arch.lifecycle.ViewModelProvider r0 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.FragmentActivity) r0, (android.arch.lifecycle.ViewModelProvider.Factory) r2)
                kotlin.reflect.KClass r2 = r9.$viewModelClass
                java.lang.Class r2 = kotlin.jvm.a.a(r2)
                android.arch.lifecycle.ViewModel r0 = r0.get(r1, r2)
                java.lang.String r1 = "ViewModelProviders\n     …key, viewModelClass.java)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                return r0
            L_0x009e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.recommendlist.widget.RecommendVerticalHeaderWidget.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function1<RecommendListState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ RecommendVerticalHeaderViewHolder $this_bindFaceToFace;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(RecommendVerticalHeaderViewHolder recommendVerticalHeaderViewHolder) {
            super(1);
            this.$this_bindFaceToFace = recommendVerticalHeaderViewHolder;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((RecommendListState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull RecommendListState recommendListState) {
            if (PatchProxy.isSupport(new Object[]{recommendListState}, this, changeQuickRedirect, false, 46976, new Class[]{RecommendListState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{recommendListState}, this, changeQuickRedirect, false, 46976, new Class[]{RecommendListState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(recommendListState, AdvanceSetting.NETWORK_TYPE);
            if (recommendListState.getEnableFace2Face()) {
                this.$this_bindFaceToFace.f49108e.setOnClickListener(new View.OnClickListener(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f49110a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ b f49111b;

                    {
                        this.f49111b = r1;
                    }

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f49110a, false, 46977, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f49110a, false, 46977, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ClickInstrumentation.onClick(view);
                        View view2 = this.f49111b.$this_bindFaceToFace.itemView;
                        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                        QRCodePermissionActivity.a(view2.getContext(), false);
                        r.a("qr_code_scan_enter", (Map) d.a().a("enter_from", "find_friends").f34114b);
                    }
                });
                this.$this_bindFaceToFace.f49109f.setOnClickListener(new View.OnClickListener(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f49112a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ b f49113b;

                    {
                        this.f49113b = r1;
                    }

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f49112a, false, 46978, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f49112a, false, 46978, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ClickInstrumentation.onClick(view);
                        View view2 = this.f49113b.$this_bindFaceToFace.itemView;
                        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                        Face2FacePermissionActivity.a(view2.getContext(), "discovery");
                        r.a("face_to_face_click", (Map) d.a().a("event_type", "spring_festival").a("enter_from", "discovery").a("enter_method", "button").f34114b);
                    }
                });
                this.$this_bindFaceToFace.i.setText(C0906R.string.ac8);
                return;
            }
            View view = this.$this_bindFaceToFace.f49107d;
            Intrinsics.checkExpressionValueIsNotNull(view, "addFriendLayout");
            view.setVisibility(8);
            View view2 = this.$this_bindFaceToFace.g;
            Intrinsics.checkExpressionValueIsNotNull(view2, "divideLine");
            view2.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function1<RecommendListState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ RecommendVerticalHeaderViewHolder $this_initClickListener;
        final /* synthetic */ RecommendVerticalHeaderWidget this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(RecommendVerticalHeaderWidget recommendVerticalHeaderWidget, RecommendVerticalHeaderViewHolder recommendVerticalHeaderViewHolder) {
            super(1);
            this.this$0 = recommendVerticalHeaderWidget;
            this.$this_initClickListener = recommendVerticalHeaderViewHolder;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((RecommendListState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull final RecommendListState recommendListState) {
            if (PatchProxy.isSupport(new Object[]{recommendListState}, this, changeQuickRedirect, false, 46979, new Class[]{RecommendListState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{recommendListState}, this, changeQuickRedirect, false, 46979, new Class[]{RecommendListState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(recommendListState, AdvanceSetting.NETWORK_TYPE);
            this.$this_initClickListener.h.setAddContactsFriendsClickListener(new View.OnClickListener(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f49114a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ c f49115b;

                {
                    this.f49115b = r1;
                }

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f49114a, false, 46980, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f49114a, false, 46980, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    RecommendVerticalHeaderWidget recommendVerticalHeaderWidget = this.f49115b.this$0;
                    if (PatchProxy.isSupport(new Object[]{"mobile_contact"}, recommendVerticalHeaderWidget, RecommendVerticalHeaderWidget.i, false, 46973, new Class[]{String.class}, Void.TYPE)) {
                        RecommendVerticalHeaderWidget recommendVerticalHeaderWidget2 = recommendVerticalHeaderWidget;
                        PatchProxy.accessDispatch(new Object[]{"mobile_contact"}, recommendVerticalHeaderWidget2, RecommendVerticalHeaderWidget.i, false, 46973, new Class[]{String.class}, Void.TYPE);
                    } else {
                        r.a("add_profile_friends", (Map) d.a().a("enter_from", "find_friends").a("account_type", "mobile_contact").f34114b);
                    }
                    View view2 = this.f49115b.$this_initClickListener.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                    Context context = view2.getContext();
                    if (context == null) {
                        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                    } else if (ContextCompat.checkSelfPermission((Activity) context, "android.permission.READ_CONTACTS") != 0) {
                        View view3 = this.f49115b.$this_initClickListener.itemView;
                        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
                        Context context2 = view3.getContext();
                        if (context2 != null) {
                            com.ss.android.ugc.aweme.utils.permission.a.a((Activity) context2, 1, "android.permission.READ_CONTACTS", (a.C0792a) new a.C0792a(this) {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f49117a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ AnonymousClass1 f49118b;

                                public final void b() {
                                    if (PatchProxy.isSupport(new Object[0], this, f49117a, false, 46982, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f49117a, false, 46982, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    View view = this.f49118b.f49115b.$this_initClickListener.itemView;
                                    Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                                    UIUtils.displayToast(view.getContext(), (int) C0906R.string.eh);
                                }

                                public final void a() {
                                    if (PatchProxy.isSupport(new Object[0], this, f49117a, false, 46981, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f49117a, false, 46981, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    PermissionStateReporter.d().e();
                                    RecommendVerticalHeaderWidget recommendVerticalHeaderWidget = this.f49118b.f49115b.this$0;
                                    View view = this.f49118b.f49115b.$this_initClickListener.itemView;
                                    Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                                    Intent a2 = ContactsActivity.a(view.getContext(), RecommendVerticalHeaderWidget.a(recommendListState.getRecommendUserType()), true);
                                    Intrinsics.checkExpressionValueIsNotNull(a2, "ContactsActivity.getInte…recommendUserType), true)");
                                    recommendVerticalHeaderWidget.a(a2);
                                }

                                {
                                    this.f49118b = r1;
                                }
                            });
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                    } else {
                        RecommendVerticalHeaderWidget recommendVerticalHeaderWidget3 = this.f49115b.this$0;
                        View view4 = this.f49115b.$this_initClickListener.itemView;
                        Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
                        Intent a2 = ContactsActivity.a(view4.getContext(), RecommendVerticalHeaderWidget.a(recommendListState.getRecommendUserType()), false);
                        Intrinsics.checkExpressionValueIsNotNull(a2, "ContactsActivity.getInte…ecommendUserType), false)");
                        recommendVerticalHeaderWidget3.a(a2);
                    }
                }
            });
            this.$this_initClickListener.h.setAddWeChatFriendsClickListener(new View.OnClickListener(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f49119a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ c f49120b;

                {
                    this.f49120b = r1;
                }

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f49119a, false, 46983, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f49119a, false, 46983, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                        View view2 = this.f49120b.$this_initClickListener.itemView;
                        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                        Context context = view2.getContext();
                        if (context != null) {
                            com.ss.android.ugc.aweme.share.invitefriends.b.a(0, (Activity) context, "find_friends");
                            RecommendVerticalHeaderWidget recommendVerticalHeaderWidget = this.f49120b.this$0;
                            String a2 = i.a(0);
                            Intrinsics.checkExpressionValueIsNotNull(a2, "ShareRequestHelper.getPl…t.REQUEST_CHANNEL_WECHAT)");
                            recommendVerticalHeaderWidget.a(a2, "find_friends");
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                    }
                }
            });
            this.$this_initClickListener.h.setAddQQFriendsClickListener(new View.OnClickListener(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f49121a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ c f49122b;

                {
                    this.f49122b = r1;
                }

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f49121a, false, 46984, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f49121a, false, 46984, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                        View view2 = this.f49122b.$this_initClickListener.itemView;
                        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                        Context context = view2.getContext();
                        if (context != null) {
                            com.ss.android.ugc.aweme.share.invitefriends.b.a(1, (Activity) context, "find_friends");
                            RecommendVerticalHeaderWidget recommendVerticalHeaderWidget = this.f49122b.this$0;
                            String a2 = i.a(1);
                            Intrinsics.checkExpressionValueIsNotNull(a2, "ShareRequestHelper.getPl…quest.REQUEST_CHANNEL_QQ)");
                            recommendVerticalHeaderWidget.a(a2, "find_friends");
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                    }
                }
            });
        }
    }

    public static String a(int i2) {
        switch (i2) {
            case 5:
                return "following";
            case 6:
                return "fans";
            default:
                return "personal_homepage";
        }
    }

    private final RecommendListViewModel n() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, i, false, 46969, new Class[0], RecommendListViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, i, false, 46969, new Class[0], RecommendListViewModel.class);
        } else {
            value = this.k.getValue();
        }
        return (RecommendListViewModel) value;
    }

    public RecommendVerticalHeaderWidget() {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RecommendListViewModel.class);
        this.k = LazyKt.lazy(new a(this, orCreateKotlinClass, orCreateKotlinClass));
    }

    public final void a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, i, false, 46974, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, i, false, 46974, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        r.a("add_profile_friends", (Map) new d().a("enter_from", str4).a("platform", str3).f34114b);
    }

    public final /* synthetic */ void a(ItemWidgetViewHolder itemWidgetViewHolder, Object obj) {
        RecommendVerticalHeaderViewHolder recommendVerticalHeaderViewHolder = (RecommendVerticalHeaderViewHolder) itemWidgetViewHolder;
        com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.a aVar = (com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.a) obj;
        if (PatchProxy.isSupport(new Object[]{recommendVerticalHeaderViewHolder, aVar}, this, i, false, 46970, new Class[]{RecommendVerticalHeaderViewHolder.class, com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recommendVerticalHeaderViewHolder, aVar}, this, i, false, 46970, new Class[]{RecommendVerticalHeaderViewHolder.class, com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recommendVerticalHeaderViewHolder, "$this$onBindViewHolder");
        Intrinsics.checkParameterIsNotNull(aVar, "item");
        if (PatchProxy.isSupport(new Object[]{recommendVerticalHeaderViewHolder}, this, i, false, 46971, new Class[]{RecommendVerticalHeaderViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recommendVerticalHeaderViewHolder}, this, i, false, 46971, new Class[]{RecommendVerticalHeaderViewHolder.class}, Void.TYPE);
        } else {
            a(n(), new c(this, recommendVerticalHeaderViewHolder));
        }
        if (PatchProxy.isSupport(new Object[]{recommendVerticalHeaderViewHolder}, this, i, false, 46972, new Class[]{RecommendVerticalHeaderViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recommendVerticalHeaderViewHolder}, this, i, false, 46972, new Class[]{RecommendVerticalHeaderViewHolder.class}, Void.TYPE);
            return;
        }
        a(n(), new b(recommendVerticalHeaderViewHolder));
    }
}
