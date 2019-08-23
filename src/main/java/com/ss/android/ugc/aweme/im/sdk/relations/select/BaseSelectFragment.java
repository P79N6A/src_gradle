package com.ss.android.ugc.aweme.im.sdk.relations.select;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.im.sdk.group.adapter.AtMemberAdapter;
import com.ss.android.ugc.aweme.im.sdk.group.adapter.GroupMemberSelectAdapter;
import com.ss.android.ugc.aweme.im.sdk.group.adapter.GroupSelectListAdapter;
import com.ss.android.ugc.aweme.im.sdk.relations.FloatingBarItemDecoration;
import com.ss.android.ugc.aweme.im.sdk.relations.IndexView;
import com.ss.android.ugc.aweme.im.sdk.relations.SearchHeadListView;
import com.ss.android.ugc.aweme.im.sdk.relations.adapter.BaseSelectListAdapter;
import com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationMemberListAdapter;
import com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationMemberSelectListAdapter;
import com.ss.android.ugc.aweme.im.sdk.relations.select.BaseMemberListViewModel;
import com.ss.android.ugc.aweme.im.sdk.relations.viewholder.BaseSelectViewHolder;
import com.ss.android.ugc.aweme.im.sdk.utils.af;
import com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0010*\u0001\u0016\b&\u0018\u0000 Z*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u00042\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\u0001ZB\u0005¢\u0006\u0002\u0010\nJ\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u001fH\u0004J\b\u0010.\u001a\u00020\u001fH\u0016J\u0015\u0010/\u001a\u00028\u00002\u0006\u00100\u001a\u000201H&¢\u0006\u0002\u00102J\b\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u000204H\u0016J\b\u00106\u001a\u00020\u0019H\u0016J\u0010\u00107\u001a\u00020\u00192\u0006\u00108\u001a\u000204H\u0016J\b\u00109\u001a\u00020:H&J\b\u0010;\u001a\u000204H\u0016J\b\u0010<\u001a\u00020,H\u0002J\u0006\u0010=\u001a\u00020,J\b\u0010>\u001a\u00020,H\u0016J\b\u0010?\u001a\u00020,H\u0016J\b\u0010@\u001a\u00020,H\u0016J&\u0010A\u001a\u0004\u0018\u00010\u001f2\u0006\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010E2\b\u0010F\u001a\u0004\u0018\u00010GH\u0016J\b\u0010H\u001a\u00020,H\u0016J\u0018\u0010I\u001a\u00020,2\u000e\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010KH\u0016J\u0018\u0010L\u001a\u00020,2\u000e\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010KH\u0016J\u0018\u0010N\u001a\u00020,2\u000e\u0010O\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010KH\u0016J\b\u0010P\u001a\u00020,H\u0016J\b\u0010Q\u001a\u00020,H\u0016J\b\u0010R\u001a\u00020,H\u0016J\u001a\u0010S\u001a\u00020,2\u0006\u0010T\u001a\u00020\u001f2\b\u0010F\u001a\u0004\u0018\u00010GH\u0016J\b\u0010U\u001a\u00020,H\u0002J\b\u0010V\u001a\u00020,H\u0002J\u0010\u0010W\u001a\u00020,2\u0006\u00108\u001a\u000204H\u0002J\u0006\u0010X\u001a\u00020,J\b\u0010Y\u001a\u00020,H\u0016R\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016X\u0004¢\u0006\u0004\n\u0002\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\"\u001a\u00028\u00008DX\u0002¢\u0006\f\n\u0004\b%\u0010\u0014\u001a\u0004\b#\u0010$R\u000e\u0010&\u001a\u00020\u001fX.¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u00020(X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006["}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/relations/select/BaseSelectFragment;", "VM", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/BaseMemberListViewModel;", "Lcom/ss/android/ugc/aweme/base/fragment/AmeBaseFragment;", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/ISelectView;", "Lcom/ss/android/ugc/aweme/im/service/model/IMContact;", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/ISelectBaseFragment;", "Lcom/ss/android/ugc/aweme/im/sdk/relations/SelectMemberAdapterFactoryOwner;", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/ViewModelOwner;", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/ViewModelFactoryOwner;", "()V", "factory", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/ReflectViewModelFactory;", "getFactory", "()Lcom/ss/android/ugc/aweme/im/sdk/relations/select/ReflectViewModelFactory;", "mAdapter", "Lcom/ss/android/ugc/aweme/im/sdk/relations/adapter/BaseSelectListAdapter;", "getMAdapter", "()Lcom/ss/android/ugc/aweme/im/sdk/relations/adapter/BaseSelectListAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "mAnimatorListener", "com/ss/android/ugc/aweme/im/sdk/relations/select/BaseSelectFragment$mAnimatorListener$1", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/BaseSelectFragment$mAnimatorListener$1;", "mCurrentType", "", "getMCurrentType", "()I", "setMCurrentType", "(I)V", "mHeaderView", "Landroid/view/View;", "mItemDecoration", "Lcom/ss/android/ugc/aweme/im/sdk/relations/FloatingBarItemDecoration;", "mMemberListViewModel", "getMMemberListViewModel", "()Lcom/ss/android/ugc/aweme/im/sdk/relations/select/BaseMemberListViewModel;", "mMemberListViewModel$delegate", "mRootView", "selectMemberAdapterManager", "Lcom/ss/android/ugc/aweme/im/sdk/relations/SelectMemberAdapterFactory;", "getSelectMemberAdapterManager", "()Lcom/ss/android/ugc/aweme/im/sdk/relations/SelectMemberAdapterFactory;", "addHeaderView", "", "headerView", "createEmptyView", "createViewModel", "lifecycleOwner", "Landroid/arch/lifecycle/LifecycleOwner;", "(Landroid/arch/lifecycle/LifecycleOwner;)Lcom/ss/android/ugc/aweme/im/sdk/relations/select/BaseMemberListViewModel;", "enableMultiSelect", "", "enableSingleSelect", "getLayoutResId", "getLeftIcon", "isMultiSelect", "getTitle", "", "handleBackPressed", "hideCheckboxAnimator", "hideRequestLoading", "initParams", "initViewModel", "initViews", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onMemberLoaded", "memberList", "", "onMemberSearched", "searchList", "onMemberSelected", "selectList", "onResume", "onTitlebarLeftClick", "onTitlebarRightClick", "onViewCreated", "view", "showCheckboxAnimator", "showEmptyView", "showMultiSelectAnimator", "showRequestLoading", "updateTitleBar", "Companion", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class BaseSelectFragment<VM extends BaseMemberListViewModel> extends AmeBaseFragment implements d {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f52202f;
    static final /* synthetic */ KProperty[] g = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BaseSelectFragment.class), "mAdapter", "getMAdapter()Lcom/ss/android/ugc/aweme/im/sdk/relations/adapter/BaseSelectListAdapter;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BaseSelectFragment.class), "mMemberListViewModel", "getMMemberListViewModel()Lcom/ss/android/ugc/aweme/im/sdk/relations/select/BaseMemberListViewModel;"))};
    public static final a l = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private View f52203a;

    /* renamed from: b  reason: collision with root package name */
    private final Lazy f52204b = LazyKt.lazy(new k(this));
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private final b f52205c = new b();
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f52206d = LazyKt.lazy(new m(this));

    /* renamed from: e  reason: collision with root package name */
    private final l f52207e = new l(this);
    View h;
    @NotNull
    final com.ss.android.ugc.aweme.im.sdk.relations.d i = new com.ss.android.ugc.aweme.im.sdk.relations.d();
    public FloatingBarItemDecoration j;
    public int k;
    private HashMap m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/relations/select/BaseSelectFragment$Companion;", "", "()V", "ANIMATOR_DURATION", "", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "VM", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/BaseMemberListViewModel;", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52213a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseSelectFragment f52214b;

        b(BaseSelectFragment baseSelectFragment) {
            this.f52214b = baseSelectFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f52213a, false, 52976, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f52213a, false, 52976, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            com.ss.android.ugc.aweme.im.sdk.d.a a2 = com.ss.android.ugc.aweme.im.sdk.d.a.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AwemeImManager.instance()");
            a2.e().enterAddFriendsActivity(this.f52214b.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "VM", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/BaseMemberListViewModel;", "it", "", "Lcom/ss/android/ugc/aweme/im/service/model/IMContact;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class c<T> implements Observer<List<? extends IMContact>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52215a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseSelectFragment f52216b;

        c(BaseSelectFragment baseSelectFragment) {
            this.f52216b = baseSelectFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            List list = (List) obj;
            if (PatchProxy.isSupport(new Object[]{list}, this, f52215a, false, 52977, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f52215a, false, 52977, new Class[]{List.class}, Void.TYPE);
                return;
            }
            this.f52216b.b(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "VM", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/BaseMemberListViewModel;", "it", "", "Lcom/ss/android/ugc/aweme/im/service/model/IMContact;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class d<T> implements Observer<List<? extends IMContact>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52217a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseSelectFragment f52218b;

        d(BaseSelectFragment baseSelectFragment) {
            this.f52218b = baseSelectFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            List list = (List) obj;
            if (PatchProxy.isSupport(new Object[]{list}, this, f52217a, false, 52978, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f52217a, false, 52978, new Class[]{List.class}, Void.TYPE);
                return;
            }
            this.f52218b.a(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "VM", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/BaseMemberListViewModel;", "it", "", "Lcom/ss/android/ugc/aweme/im/service/model/IMContact;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class e<T> implements Observer<List<? extends IMContact>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52219a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseSelectFragment f52220b;

        e(BaseSelectFragment baseSelectFragment) {
            this.f52220b = baseSelectFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            List list = (List) obj;
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{list}, this, f52219a, false, 52979, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f52219a, false, 52979, new Class[]{List.class}, Void.TYPE);
                return;
            }
            BaseSelectFragment baseSelectFragment = this.f52220b;
            if (PatchProxy.isSupport(new Object[]{list}, baseSelectFragment, BaseSelectFragment.f52202f, false, 52960, new Class[]{List.class}, Void.TYPE)) {
                BaseSelectFragment baseSelectFragment2 = baseSelectFragment;
                PatchProxy.accessDispatch(new Object[]{list}, baseSelectFragment2, BaseSelectFragment.f52202f, false, 52960, new Class[]{List.class}, Void.TYPE);
                return;
            }
            if (baseSelectFragment.h != null) {
                BaseSelectListAdapter<IMContact> m = baseSelectFragment.m();
                if (PatchProxy.isSupport(new Object[0], m, BaseSelectListAdapter.f52066e, false, 52840, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], m, BaseSelectListAdapter.f52066e, false, 52840, new Class[0], Void.TYPE);
                } else if (m.g != null) {
                    m.g = null;
                    m.notifyItemRemoved(0);
                }
            }
            Collection collection = list;
            if (collection != null && !collection.isEmpty()) {
                z = false;
            }
            if (z) {
                baseSelectFragment.q();
            } else {
                DmtStatusView dmtStatusView = (DmtStatusView) baseSelectFragment.a((int) C0906R.id.cvd);
                Intrinsics.checkExpressionValueIsNotNull(dmtStatusView, "status_view");
                dmtStatusView.setVisibility(8);
            }
            baseSelectFragment.m().a(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032 \u0010\u0004\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0006\u0018\u00010\u0005H\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "VM", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/BaseMemberListViewModel;", "it", "Lkotlin/Pair;", "", "", "", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class f<T> implements Observer<Pair<? extends List<? extends String>, ? extends List<? extends Integer>>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52221a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseSelectFragment f52222b;

        f(BaseSelectFragment baseSelectFragment) {
            this.f52222b = baseSelectFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            Pair pair = (Pair) obj;
            boolean z2 = true;
            if (PatchProxy.isSupport(new Object[]{pair}, this, f52221a, false, 52980, new Class[]{Pair.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{pair}, this, f52221a, false, 52980, new Class[]{Pair.class}, Void.TYPE);
                return;
            }
            if (pair != null) {
                Collection collection = (Collection) pair.getFirst();
                if (collection == null || collection.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    Collection collection2 = (Collection) pair.getSecond();
                    if (collection2 != null && !collection2.isEmpty()) {
                        z2 = false;
                    }
                    if (!z2) {
                        ((IndexView) this.f52222b.a((int) C0906R.id.au5)).a((List) pair.getFirst(), (List) pair.getSecond());
                        if (this.f52222b.m().b() == 0) {
                            ((IndexView) this.f52222b.a((int) C0906R.id.au5)).setCurrentIndex(0);
                        }
                        FloatingBarItemDecoration floatingBarItemDecoration = this.f52222b.j;
                        if (floatingBarItemDecoration != null) {
                            ((RecyclerView) this.f52222b.a((int) C0906R.id.bma)).removeItemDecoration(floatingBarItemDecoration);
                        }
                        BaseSelectFragment baseSelectFragment = this.f52222b;
                        FloatingBarItemDecoration floatingBarItemDecoration2 = new FloatingBarItemDecoration(this.f52222b.getContext(), (List) pair.getFirst(), (List) pair.getSecond());
                        floatingBarItemDecoration2.f51977c = this.f52222b.k;
                        floatingBarItemDecoration2.f51976b = this.f52222b.m().b();
                        ((RecyclerView) this.f52222b.a((int) C0906R.id.bma)).addItemDecoration(floatingBarItemDecoration2);
                        baseSelectFragment.j = floatingBarItemDecoration2;
                        return;
                    }
                }
            }
            IndexView indexView = (IndexView) this.f52222b.a((int) C0906R.id.au5);
            Intrinsics.checkExpressionValueIsNotNull(indexView, "index_view");
            indexView.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "VM", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/BaseMemberListViewModel;", "it", "", "onChanged", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 15})
    static final class g<T> implements Observer<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52223a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseSelectFragment f52224b;

        g(BaseSelectFragment baseSelectFragment) {
            this.f52224b = baseSelectFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (PatchProxy.isSupport(new Object[]{num}, this, f52223a, false, 52981, new Class[]{Integer.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{num}, this, f52223a, false, 52981, new Class[]{Integer.class}, Void.TYPE);
                return;
            }
            if (num != null) {
                if (num != null && num.intValue() == 0) {
                    IndexView indexView = (IndexView) this.f52224b.a((int) C0906R.id.au5);
                    Intrinsics.checkExpressionValueIsNotNull(indexView, "index_view");
                    indexView.setVisibility(0);
                } else {
                    IndexView indexView2 = (IndexView) this.f52224b.a((int) C0906R.id.au5);
                    Intrinsics.checkExpressionValueIsNotNull(indexView2, "index_view");
                    indexView2.setVisibility(8);
                    FloatingBarItemDecoration floatingBarItemDecoration = this.f52224b.j;
                    if (floatingBarItemDecoration != null) {
                        ((RecyclerView) this.f52224b.a((int) C0906R.id.bma)).removeItemDecoration(floatingBarItemDecoration);
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "VM", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/BaseMemberListViewModel;", "it", "", "onChanged", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 15})
    static final class h<T> implements Observer<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52225a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseSelectFragment f52226b;

        h(BaseSelectFragment baseSelectFragment) {
            this.f52226b = baseSelectFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            byte b2;
            Integer num = (Integer) obj;
            if (PatchProxy.isSupport(new Object[]{num}, this, f52225a, false, 52982, new Class[]{Integer.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{num}, this, f52225a, false, 52982, new Class[]{Integer.class}, Void.TYPE);
                return;
            }
            if (num != null) {
                this.f52226b.i();
                BaseSelectFragment baseSelectFragment = this.f52226b;
                if (num != null && num.intValue() == 3) {
                    b2 = 1;
                } else {
                    b2 = 0;
                }
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(b2)}, baseSelectFragment, BaseSelectFragment.f52202f, false, 52971, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    BaseSelectFragment baseSelectFragment2 = baseSelectFragment;
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(b2)}, baseSelectFragment2, BaseSelectFragment.f52202f, false, 52971, new Class[]{Boolean.TYPE}, Void.TYPE);
                } else if (b2 != 0) {
                    baseSelectFragment.t();
                } else {
                    baseSelectFragment.u();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/relations/select/BaseSelectFragment$initViews$1", "Lcom/ss/android/ugc/aweme/im/sdk/widget/ImTextTitleBar$OnTitlebarClickListener;", "onLeftClick", "", "onRightClick", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class i implements ImTextTitleBar.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52227a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseSelectFragment f52228b;

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f52227a, false, 52987, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f52227a, false, 52987, new Class[0], Void.TYPE);
                return;
            }
            af afVar = af.f52472c;
            ImTextTitleBar imTextTitleBar = (ImTextTitleBar) this.f52228b.a((int) C0906R.id.d3m);
            Intrinsics.checkExpressionValueIsNotNull(imTextTitleBar, "title_bar");
            if (!afVar.a(imTextTitleBar.getRightView(), 500)) {
                this.f52228b.j();
            }
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f52227a, false, 52986, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f52227a, false, 52986, new Class[0], Void.TYPE);
                return;
            }
            af afVar = af.f52472c;
            ImTextTitleBar imTextTitleBar = (ImTextTitleBar) this.f52228b.a((int) C0906R.id.d3m);
            Intrinsics.checkExpressionValueIsNotNull(imTextTitleBar, "title_bar");
            if (!afVar.a(imTextTitleBar.getLeftView(), 500)) {
                BaseSelectFragment baseSelectFragment = this.f52228b;
                if (PatchProxy.isSupport(new Object[0], baseSelectFragment, BaseSelectFragment.f52202f, false, 52962, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], baseSelectFragment, BaseSelectFragment.f52202f, false, 52962, new Class[0], Void.TYPE);
                } else if (!baseSelectFragment.o().b() || !baseSelectFragment.h()) {
                    ((SearchHeadListView) baseSelectFragment.a((int) C0906R.id.cle)).b();
                    FragmentActivity activity = baseSelectFragment.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                } else {
                    baseSelectFragment.o().h();
                    baseSelectFragment.o().a(2);
                }
            }
        }

        i(BaseSelectFragment baseSelectFragment) {
            this.f52228b = baseSelectFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00052\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "VM", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/BaseMemberListViewModel;", "letter", "", "kotlin.jvm.PlatformType", "index", "", "onTouchIndex"}, k = 3, mv = {1, 1, 15})
    static final class j implements IndexView.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52229a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseSelectFragment f52230b;

        j(BaseSelectFragment baseSelectFragment) {
            this.f52230b = baseSelectFragment;
        }

        public final void a(String str, int i) {
            int i2;
            if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f52229a, false, 52988, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f52229a, false, 52988, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (!Intrinsics.areEqual((Object) str, (Object) "search")) {
                i2 = ((IndexView) this.f52230b.a((int) C0906R.id.au5)).a(i) + this.f52230b.m().b();
            } else {
                i2 = 0;
            }
            RecyclerView recyclerView = (RecyclerView) this.f52230b.a((int) C0906R.id.bma);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "member_list");
            if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
                RecyclerView recyclerView2 = (RecyclerView) this.f52230b.a((int) C0906R.id.bma);
                Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "member_list");
                RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
                if (layoutManager != null) {
                    ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i2, 0);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/im/sdk/relations/adapter/BaseSelectListAdapter;", "Lcom/ss/android/ugc/aweme/im/service/model/IMContact;", "VM", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/BaseMemberListViewModel;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class k extends Lambda implements Function0<BaseSelectListAdapter<IMContact>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ BaseSelectFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(BaseSelectFragment baseSelectFragment) {
            super(0);
            this.this$0 = baseSelectFragment;
        }

        @NotNull
        public final BaseSelectListAdapter<IMContact> invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52989, new Class[0], BaseSelectListAdapter.class)) {
                return (BaseSelectListAdapter) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52989, new Class[0], BaseSelectListAdapter.class);
            }
            com.ss.android.ugc.aweme.im.sdk.relations.d dVar = this.this$0.i;
            FragmentActivity activity = this.this$0.getActivity();
            if (activity != null) {
                LifecycleOwner lifecycleOwner = activity;
                int i = this.this$0.k;
                if (PatchProxy.isSupport(new Object[]{lifecycleOwner, Integer.valueOf(i)}, dVar, com.ss.android.ugc.aweme.im.sdk.relations.d.f52167a, false, 52798, new Class[]{LifecycleOwner.class, Integer.TYPE}, BaseSelectListAdapter.class)) {
                    return (BaseSelectListAdapter) PatchProxy.accessDispatch(new Object[]{lifecycleOwner, Integer.valueOf(i)}, dVar, com.ss.android.ugc.aweme.im.sdk.relations.d.f52167a, false, 52798, new Class[]{LifecycleOwner.class, Integer.TYPE}, BaseSelectListAdapter.class);
                }
                Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
                switch (i) {
                    case 0:
                    case 4:
                        return new RelationMemberListAdapter<>(lifecycleOwner);
                    case 1:
                        return new RelationMemberSelectListAdapter<>(lifecycleOwner);
                    case 2:
                    case 3:
                        return new GroupSelectListAdapter<>(lifecycleOwner);
                    case 5:
                        return new GroupMemberSelectAdapter<>(lifecycleOwner);
                    case 6:
                        return new AtMemberAdapter<>(lifecycleOwner);
                    default:
                        return new RelationMemberListAdapter<>(lifecycleOwner);
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.LifecycleOwner");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/relations/select/BaseSelectFragment$mAnimatorListener$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class l implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52231a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseSelectFragment f52232b;

        public final void onAnimationCancel(@NotNull Animator animator) {
            Animator animator2 = animator;
            if (PatchProxy.isSupport(new Object[]{animator2}, this, f52231a, false, 52992, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator2}, this, f52231a, false, 52992, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(animator2, "animation");
        }

        public final void onAnimationRepeat(@NotNull Animator animator) {
            Animator animator2 = animator;
            if (PatchProxy.isSupport(new Object[]{animator2}, this, f52231a, false, 52993, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator2}, this, f52231a, false, 52993, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(animator2, "animation");
        }

        public final void onAnimationStart(@NotNull Animator animator) {
            Animator animator2 = animator;
            if (PatchProxy.isSupport(new Object[]{animator2}, this, f52231a, false, 52990, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator2}, this, f52231a, false, 52990, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(animator2, "animation");
        }

        l(BaseSelectFragment baseSelectFragment) {
            this.f52232b = baseSelectFragment;
        }

        public final void onAnimationEnd(@NotNull Animator animator) {
            Animator animator2 = animator;
            if (PatchProxy.isSupport(new Object[]{animator2}, this, f52231a, false, 52991, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator2}, this, f52231a, false, 52991, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(animator2, "animation");
            this.f52232b.m().notifyDataSetChanged();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "VM", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/BaseMemberListViewModel;", "invoke", "()Lcom/ss/android/ugc/aweme/im/sdk/relations/select/BaseMemberListViewModel;"}, k = 3, mv = {1, 1, 15})
    static final class m extends Lambda implements Function0<VM> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ BaseSelectFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(BaseSelectFragment baseSelectFragment) {
            super(0);
            this.this$0 = baseSelectFragment;
        }

        @NotNull
        public final VM invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52994, new Class[0], BaseMemberListViewModel.class)) {
                return (BaseMemberListViewModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52994, new Class[0], BaseMemberListViewModel.class);
            }
            BaseSelectFragment baseSelectFragment = this.this$0;
            FragmentActivity activity = this.this$0.getActivity();
            if (activity != null) {
                return baseSelectFragment.a((LifecycleOwner) activity);
            }
            throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.LifecycleOwner");
        }
    }

    public int a(boolean z) {
        return z ? 2130839383 : 2130841646;
    }

    public View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f52202f, false, 52974, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f52202f, false, 52974, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.m == null) {
            this.m = new HashMap();
        }
        View view = (View) this.m.get(Integer.valueOf(i2));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i2);
            this.m.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    @NotNull
    public abstract VM a(@NotNull LifecycleOwner lifecycleOwner);

    public boolean c() {
        return true;
    }

    @NotNull
    public abstract String d();

    public void e() {
        if (PatchProxy.isSupport(new Object[0], this, f52202f, false, 52975, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52202f, false, 52975, new Class[0], Void.TYPE);
            return;
        }
        if (this.m != null) {
            this.m.clear();
        }
    }

    public int g() {
        return C0906R.layout.oo;
    }

    public boolean h() {
        return true;
    }

    public final BaseSelectListAdapter<IMContact> m() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f52202f, false, 52950, new Class[0], BaseSelectListAdapter.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f52202f, false, 52950, new Class[0], BaseSelectListAdapter.class);
        } else {
            value = this.f52204b.getValue();
        }
        return (BaseSelectListAdapter) value;
    }

    @NotNull
    public final VM o() {
        VM value;
        if (PatchProxy.isSupport(new Object[0], this, f52202f, false, 52951, new Class[0], BaseMemberListViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f52202f, false, 52951, new Class[0], BaseMemberListViewModel.class);
        } else {
            value = this.f52206d.getValue();
        }
        return (BaseMemberListViewModel) value;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        e();
    }

    @NotNull
    public final b n() {
        return this.f52205c;
    }

    public void j() {
        if (PatchProxy.isSupport(new Object[0], this, f52202f, false, 52963, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52202f, false, 52963, new Class[0], Void.TYPE);
            return;
        }
        if (!o().b() && c()) {
            o().a(3);
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f52202f, false, 52954, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52202f, false, 52954, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        o().a();
    }

    public final void s() {
        if (PatchProxy.isSupport(new Object[0], this, f52202f, false, 52969, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52202f, false, 52969, new Class[0], Void.TYPE);
            return;
        }
        DmtStatusView dmtStatusView = (DmtStatusView) a((int) C0906R.id.cvd);
        if (dmtStatusView != null) {
            dmtStatusView.b();
            dmtStatusView.setVisibility(8);
        }
    }

    @NotNull
    public View k() {
        if (PatchProxy.isSupport(new Object[0], this, f52202f, false, 52966, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f52202f, false, 52966, new Class[0], View.class);
        }
        DmtDefaultView dmtDefaultView = new DmtDefaultView(getContext());
        dmtDefaultView.setStatus(new c.a(getContext()).b((int) C0906R.string.arm).c(C0906R.string.arl).a(com.bytedance.ies.dmt.ui.widget.a.SOLID, C0906R.string.arh, new b(this)).f20493a);
        return dmtDefaultView;
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f52202f, false, 52955, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52202f, false, 52955, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        af afVar = af.f52472c;
        if (PatchProxy.isSupport(new Object[0], afVar, af.f52470a, false, 53669, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], afVar, af.f52470a, false, 53669, new Class[0], Void.TYPE);
        } else {
            af.f52471b.clear();
        }
        o().onCleared();
    }

    public final boolean p() {
        if (PatchProxy.isSupport(new Object[0], this, f52202f, false, 52965, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f52202f, false, 52965, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!o().b() || !h()) {
            ((SearchHeadListView) a((int) C0906R.id.cle)).b();
            return false;
        } else {
            o().h();
            o().a(2);
            return true;
        }
    }

    public final void r() {
        if (PatchProxy.isSupport(new Object[0], this, f52202f, false, 52968, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52202f, false, 52968, new Class[0], Void.TYPE);
            return;
        }
        DmtStatusView dmtStatusView = (DmtStatusView) a((int) C0906R.id.cvd);
        if (dmtStatusView != null) {
            dmtStatusView.setBuilder(DmtStatusView.a.a(dmtStatusView.getContext()).a());
            dmtStatusView.b();
            dmtStatusView.d();
            dmtStatusView.setVisibility(0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
        if (r0 == null) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f52202f
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 52956(0xcedc, float:7.4207E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f52202f
            r5 = 0
            r6 = 52956(0xcedc, float:7.4207E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            android.os.Bundle r0 = r9.getArguments()
            if (r0 == 0) goto L_0x0035
            java.lang.String r1 = "key_member_list_type"
            int r1 = r0.getInt(r1)
            r9.k = r1
            if (r0 != 0) goto L_0x0041
        L_0x0035:
            r0 = r9
            com.ss.android.ugc.aweme.im.sdk.relations.select.BaseSelectFragment r0 = (com.ss.android.ugc.aweme.im.sdk.relations.select.BaseSelectFragment) r0
            android.support.v4.app.FragmentActivity r0 = r0.getActivity()
            if (r0 == 0) goto L_0x0041
            r0.finish()
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.relations.select.BaseSelectFragment.a():void");
    }

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f52202f, false, 52958, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52202f, false, 52958, new Class[0], Void.TYPE);
            return;
        }
        LifecycleOwner lifecycleOwner = this;
        o().j.observe(lifecycleOwner, new c(this));
        o().o.observe(lifecycleOwner, new d(this));
        o().k.observe(lifecycleOwner, new e(this));
        o().l.observe(lifecycleOwner, new f(this));
        o().n.observe(lifecycleOwner, new g(this));
        o().m.observe(lifecycleOwner, new h(this));
        o().a(2);
        o().b(0);
    }

    public void f() {
        if (PatchProxy.isSupport(new Object[0], this, f52202f, false, 52957, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52202f, false, 52957, new Class[0], Void.TYPE);
            return;
        }
        ((ImTextTitleBar) a((int) C0906R.id.d3m)).setOnTitlebarClickListener(new i(this));
        SearchHeadListView searchHeadListView = (SearchHeadListView) a((int) C0906R.id.cle);
        Intrinsics.checkExpressionValueIsNotNull(searchHeadListView, "search_head_list");
        searchHeadListView.setVisibility(0);
        ((SearchHeadListView) a((int) C0906R.id.cle)).setListViewModel(o());
        RecyclerView recyclerView = (RecyclerView) a((int) C0906R.id.bma);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(m());
        recyclerView.addOnScrollListener(new BaseSelectFragment$initViews$$inlined$apply$lambda$1(recyclerView, recyclerView.getContext(), this));
        recyclerView.addOnItemTouchListener(new BaseSelectFragment$initViews$$inlined$apply$lambda$2(this));
        ((IndexView) a((int) C0906R.id.au5)).setOnLetterTouchListener(new j(this));
        ((IndexView) a((int) C0906R.id.au5)).setIndexLetterTv((TextView) a((int) C0906R.id.au3));
    }

    /* access modifiers changed from: package-private */
    public final void q() {
        if (PatchProxy.isSupport(new Object[0], this, f52202f, false, 52967, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52202f, false, 52967, new Class[0], Void.TYPE);
            return;
        }
        if (o().c()) {
            DmtDefaultView dmtDefaultView = new DmtDefaultView(getContext());
            dmtDefaultView.setStatus(new c.a(getContext()).b((int) C0906R.string.ax4).c(C0906R.string.ax3).a(2130840144).f20493a);
            ((DmtStatusView) a((int) C0906R.id.cvd)).setBuilder(new DmtStatusView.a(getContext()).b((View) dmtDefaultView));
        } else {
            ((DmtStatusView) a((int) C0906R.id.cvd)).setBuilder(new DmtStatusView.a(getContext()).b(k()));
        }
        ((DmtStatusView) a((int) C0906R.id.cvd)).b();
        ((DmtStatusView) a((int) C0906R.id.cvd)).e();
        DmtStatusView dmtStatusView = (DmtStatusView) a((int) C0906R.id.cvd);
        Intrinsics.checkExpressionValueIsNotNull(dmtStatusView, "status_view");
        dmtStatusView.setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    public final void t() {
        if (PatchProxy.isSupport(new Object[0], this, f52202f, false, 52972, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52202f, false, 52972, new Class[0], Void.TYPE);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet.Builder builder = null;
        RecyclerView recyclerView = (RecyclerView) a((int) C0906R.id.bma);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "member_list");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int childCount = linearLayoutManager.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = linearLayoutManager.getChildAt(i2);
                if (childAt != null) {
                    Intrinsics.checkExpressionValueIsNotNull(childAt, "linearLayoutManager.getChildAt(i) ?: continue");
                    RecyclerView.ViewHolder childViewHolder = ((RecyclerView) a((int) C0906R.id.bma)).getChildViewHolder(childAt);
                    if (childViewHolder != null) {
                        BaseSelectViewHolder baseSelectViewHolder = (BaseSelectViewHolder) childViewHolder;
                        if (builder == null) {
                            builder = animatorSet.play(baseSelectViewHolder.a());
                        } else {
                            builder.with(baseSelectViewHolder.a());
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.relations.viewholder.BaseSelectViewHolder<*>");
                    }
                }
            }
            animatorSet.setDuration(300);
            animatorSet.addListener(this.f52207e);
            animatorSet.start();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
    }

    /* access modifiers changed from: package-private */
    public final void u() {
        if (PatchProxy.isSupport(new Object[0], this, f52202f, false, 52973, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52202f, false, 52973, new Class[0], Void.TYPE);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet.Builder builder = null;
        RecyclerView recyclerView = (RecyclerView) a((int) C0906R.id.bma);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "member_list");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int childCount = linearLayoutManager.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = linearLayoutManager.getChildAt(i2);
                if (childAt != null) {
                    Intrinsics.checkExpressionValueIsNotNull(childAt, "linearLayoutManager.getChildAt(i) ?: continue");
                    RecyclerView.ViewHolder childViewHolder = ((RecyclerView) a((int) C0906R.id.bma)).getChildViewHolder(childAt);
                    if (childViewHolder != null) {
                        BaseSelectViewHolder baseSelectViewHolder = (BaseSelectViewHolder) childViewHolder;
                        if (builder == null) {
                            builder = animatorSet.play(baseSelectViewHolder.b());
                        } else {
                            builder.with(baseSelectViewHolder.b());
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.relations.viewholder.BaseSelectViewHolder<*>");
                    }
                }
            }
            animatorSet.setDuration(300);
            animatorSet.addListener(this.f52207e);
            animatorSet.start();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
    }

    public void i() {
        if (PatchProxy.isSupport(new Object[0], this, f52202f, false, 52964, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52202f, false, 52964, new Class[0], Void.TYPE);
            return;
        }
        ((ImTextTitleBar) a((int) C0906R.id.d3m)).setTitle(d());
        if (!o().b()) {
            ((ImTextTitleBar) a((int) C0906R.id.d3m)).setLeftIcon(a(false));
            if (c()) {
                ((ImTextTitleBar) a((int) C0906R.id.d3m)).setRightText((int) C0906R.string.ax9);
                Context context = GlobalContext.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "GlobalContext.getContext()");
                ((ImTextTitleBar) a((int) C0906R.id.d3m)).setRightTextColor(context.getResources().getColor(C0906R.color.a09));
                ImTextTitleBar imTextTitleBar = (ImTextTitleBar) a((int) C0906R.id.d3m);
                Intrinsics.checkExpressionValueIsNotNull(imTextTitleBar, "title_bar");
                DmtTextView rightTexView = imTextTitleBar.getRightTexView();
                Intrinsics.checkExpressionValueIsNotNull(rightTexView, "title_bar.rightTexView");
                TextPaint paint = rightTexView.getPaint();
                Intrinsics.checkExpressionValueIsNotNull(paint, "title_bar.rightTexView.paint");
                paint.setFakeBoldText(false);
                ImTextTitleBar imTextTitleBar2 = (ImTextTitleBar) a((int) C0906R.id.d3m);
                Intrinsics.checkExpressionValueIsNotNull(imTextTitleBar2, "title_bar");
                View rightView = imTextTitleBar2.getRightView();
                Intrinsics.checkExpressionValueIsNotNull(rightView, "title_bar.rightView");
                rightView.setEnabled(true);
                return;
            }
            ImTextTitleBar imTextTitleBar3 = (ImTextTitleBar) a((int) C0906R.id.d3m);
            Intrinsics.checkExpressionValueIsNotNull(imTextTitleBar3, "title_bar");
            View rightView2 = imTextTitleBar3.getRightView();
            Intrinsics.checkExpressionValueIsNotNull(rightView2, "title_bar.rightView");
            rightView2.setVisibility(8);
            return;
        }
        int e2 = o().e();
        ((ImTextTitleBar) a((int) C0906R.id.d3m)).setLeftIcon(a(true));
        if (e2 != 0) {
            StringBuilder sb = new StringBuilder();
            Context context2 = GlobalContext.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "GlobalContext.getContext()");
            sb.append(context2.getResources().getString(C0906R.string.arj));
            sb.append("(");
            sb.append(e2);
            sb.append(")");
            ((ImTextTitleBar) a((int) C0906R.id.d3m)).setRightText(sb.toString());
            ImTextTitleBar imTextTitleBar4 = (ImTextTitleBar) a((int) C0906R.id.d3m);
            Intrinsics.checkExpressionValueIsNotNull(imTextTitleBar4, "title_bar");
            View rightView3 = imTextTitleBar4.getRightView();
            Intrinsics.checkExpressionValueIsNotNull(rightView3, "title_bar.rightView");
            rightView3.setEnabled(true);
            ImTextTitleBar imTextTitleBar5 = (ImTextTitleBar) a((int) C0906R.id.d3m);
            Intrinsics.checkExpressionValueIsNotNull(imTextTitleBar5, "title_bar");
            DmtTextView rightTexView2 = imTextTitleBar5.getRightTexView();
            Intrinsics.checkExpressionValueIsNotNull(rightTexView2, "title_bar.rightTexView");
            TextPaint paint2 = rightTexView2.getPaint();
            Intrinsics.checkExpressionValueIsNotNull(paint2, "title_bar.rightTexView.paint");
            paint2.setFakeBoldText(true);
            Context context3 = GlobalContext.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context3, "GlobalContext.getContext()");
            ((ImTextTitleBar) a((int) C0906R.id.d3m)).setRightTextColor(context3.getResources().getColor(C0906R.color.a1z));
            return;
        }
        ((ImTextTitleBar) a((int) C0906R.id.d3m)).setRightText((int) C0906R.string.arj);
        ImTextTitleBar imTextTitleBar6 = (ImTextTitleBar) a((int) C0906R.id.d3m);
        Intrinsics.checkExpressionValueIsNotNull(imTextTitleBar6, "title_bar");
        View rightView4 = imTextTitleBar6.getRightView();
        Intrinsics.checkExpressionValueIsNotNull(rightView4, "title_bar.rightView");
        rightView4.setEnabled(false);
        ImTextTitleBar imTextTitleBar7 = (ImTextTitleBar) a((int) C0906R.id.d3m);
        Intrinsics.checkExpressionValueIsNotNull(imTextTitleBar7, "title_bar");
        DmtTextView rightTexView3 = imTextTitleBar7.getRightTexView();
        Intrinsics.checkExpressionValueIsNotNull(rightTexView3, "title_bar.rightTexView");
        TextPaint paint3 = rightTexView3.getPaint();
        Intrinsics.checkExpressionValueIsNotNull(paint3, "title_bar.rightTexView.paint");
        paint3.setFakeBoldText(false);
        Context context4 = GlobalContext.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context4, "GlobalContext.getContext()");
        ((ImTextTitleBar) a((int) C0906R.id.d3m)).setRightTextColor(context4.getResources().getColor(C0906R.color.a21));
    }

    public final void a(@NotNull View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f52202f, false, 52970, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f52202f, false, 52970, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "headerView");
        this.h = view2;
        m().a(view2);
    }

    public void b(@Nullable List<? extends IMContact> list) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{list}, this, f52202f, false, 52959, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f52202f, false, 52959, new Class[]{List.class}, Void.TYPE);
            return;
        }
        View view = this.h;
        if (view != null) {
            m().a(view);
        }
        Collection collection = list;
        if (collection != null && !collection.isEmpty()) {
            z = false;
        }
        if (z) {
            q();
            SearchHeadListView searchHeadListView = (SearchHeadListView) a((int) C0906R.id.cle);
            Intrinsics.checkExpressionValueIsNotNull(searchHeadListView, "search_head_list");
            searchHeadListView.setVisibility(8);
            return;
        }
        SearchHeadListView searchHeadListView2 = (SearchHeadListView) a((int) C0906R.id.cle);
        Intrinsics.checkExpressionValueIsNotNull(searchHeadListView2, "search_head_list");
        searchHeadListView2.setVisibility(0);
        DmtStatusView dmtStatusView = (DmtStatusView) a((int) C0906R.id.cvd);
        Intrinsics.checkExpressionValueIsNotNull(dmtStatusView, "status_view");
        dmtStatusView.setVisibility(8);
        m().a(list);
    }

    public void a(@Nullable List<? extends IMContact> list) {
        List list2;
        boolean z = true;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{list}, this, f52202f, false, 52961, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f52202f, false, 52961, new Class[]{List.class}, Void.TYPE);
            return;
        }
        SearchHeadListView searchHeadListView = (SearchHeadListView) a((int) C0906R.id.cle);
        if (list != null) {
            list2 = CollectionsKt.reversed(list);
        } else {
            list2 = null;
        }
        if (PatchProxy.isSupport(new Object[]{list2}, searchHeadListView, SearchHeadListView.f52014a, false, 52786, new Class[]{List.class}, Void.TYPE)) {
            SearchHeadListView searchHeadListView2 = searchHeadListView;
            PatchProxy.accessDispatch(new Object[]{list2}, searchHeadListView2, SearchHeadListView.f52014a, false, 52786, new Class[]{List.class}, Void.TYPE);
        } else {
            Collection collection = list2;
            if (collection != null && !collection.isEmpty()) {
                z = false;
            }
            if (z) {
                searchHeadListView.f52016c.setVisibility(0);
                searchHeadListView.f52015b.setVisibility(8);
                searchHeadListView.b();
            } else {
                searchHeadListView.f52016c.setVisibility(8);
                searchHeadListView.f52015b.setVisibility(0);
                BaseMemberListViewModel baseMemberListViewModel = searchHeadListView.f52019f;
                if (baseMemberListViewModel != null) {
                    z2 = baseMemberListViewModel.c();
                }
                if (z2 && list2.size() > searchHeadListView.f52018e.getItemCount()) {
                    searchHeadListView.a();
                }
            }
            searchHeadListView.f52018e.a(list2, new SearchHeadListView.b(searchHeadListView));
        }
        m().notifyDataSetChanged();
        i();
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, f52202f, false, 52953, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, f52202f, false, 52953, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        super.onViewCreated(view, bundle);
        a();
        f();
        b();
    }

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f52202f, false, 52952, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f52202f, false, 52952, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(g(), viewGroup2, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(getLayo…esId(), container, false)");
        this.f52203a = inflate;
        View view = this.f52203a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        return view;
    }
}
