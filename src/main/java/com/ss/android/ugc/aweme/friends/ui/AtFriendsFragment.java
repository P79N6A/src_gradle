package com.ss.android.ugc.aweme.friends.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.MtEmptyView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.adapter.AtFriendsAdapter;
import com.ss.android.ugc.aweme.friends.adapter.AtFriendsSearchAdapter;
import com.ss.android.ugc.aweme.friends.model.AtFriendsViewModel;
import com.ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.ss.android.ugc.aweme.friends.ui.IndexView;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u0001:B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010!\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J&\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0018\u0010*\u001a\u00020+2\u000e\u0010,\u001a\n\u0018\u00010-j\u0004\u0018\u0001`.H\u0016J\b\u0010/\u001a\u00020+H\u0016J\u0018\u00100\u001a\u00020+2\u000e\u00101\u001a\n\u0012\u0004\u0012\u000203\u0018\u000102H\u0016J\u001a\u00104\u001a\u00020+2\u0006\u00105\u001a\u00020#2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0012\u00106\u001a\u00020+2\b\b\u0002\u00107\u001a\u00020\u000fH\u0002J\u0019\u00108\u001a\u00020+2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0002\u00109R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u0016\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u001c\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001d\u0010\u001aR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/ui/AtFriendsFragment;", "Lcom/ss/android/ugc/aweme/base/fragment/AmeBaseFragment;", "Lcom/ss/android/ugc/aweme/friends/presenter/IFriendsSearchView;", "()V", "atFriendsAdapter", "Lcom/ss/android/ugc/aweme/friends/adapter/AtFriendsAdapter;", "atFriendsSearchAdapter", "Lcom/ss/android/ugc/aweme/friends/adapter/AtFriendsSearchAdapter;", "atFriendsVM", "Lcom/ss/android/ugc/aweme/friends/model/AtFriendsViewModel;", "itemDecoration", "Lcom/ss/android/ugc/aweme/friends/ui/FloatingBarItemDecoration;", "linearLayoutManager", "Landroid/support/v7/widget/LinearLayoutManager;", "mFrom", "", "mSummonFriendSearchPresenter", "Lcom/ss/android/ugc/aweme/friends/presenter/SummonFriendSearchPresenter;", "getMSummonFriendSearchPresenter", "()Lcom/ss/android/ugc/aweme/friends/presenter/SummonFriendSearchPresenter;", "mSummonFriendSearchPresenter$delegate", "Lkotlin/Lazy;", "normalEmptyView", "Lcom/bytedance/ies/dmt/ui/widget/DmtDefaultStatus;", "kotlin.jvm.PlatformType", "getNormalEmptyView", "()Lcom/bytedance/ies/dmt/ui/widget/DmtDefaultStatus;", "normalEmptyView$delegate", "searchEmptyView", "getSearchEmptyView", "searchEmptyView$delegate", "videoId", "", "getSourceFrom", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onSearchError", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSearchLoading", "onSearchResult", "list", "", "Lcom/ss/android/ugc/aweme/friends/model/SummonFriendItem;", "onViewCreated", "view", "switch2Normal", "status", "switch2Search", "(Ljava/lang/Integer;)V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AtFriendsFragment extends AmeBaseFragment implements com.ss.android.ugc.aweme.friends.d.f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49137a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f49138b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(AtFriendsFragment.class), "mSummonFriendSearchPresenter", "getMSummonFriendSearchPresenter()Lcom/ss/android/ugc/aweme/friends/presenter/SummonFriendSearchPresenter;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(AtFriendsFragment.class), "normalEmptyView", "getNormalEmptyView()Lcom/bytedance/ies/dmt/ui/widget/DmtDefaultStatus;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(AtFriendsFragment.class), "searchEmptyView", "getSearchEmptyView()Lcom/bytedance/ies/dmt/ui/widget/DmtDefaultStatus;"))};
    public static final a i = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public final AtFriendsViewModel f49139c = new AtFriendsViewModel();

    /* renamed from: d  reason: collision with root package name */
    public final AtFriendsAdapter f49140d = new AtFriendsAdapter();

    /* renamed from: e  reason: collision with root package name */
    public final AtFriendsSearchAdapter f49141e = new AtFriendsSearchAdapter();

    /* renamed from: f  reason: collision with root package name */
    public LinearLayoutManager f49142f;
    public FloatingBarItemDecoration g;
    public int h;
    private final Lazy j = LazyKt.lazy(b.INSTANCE);
    private final Lazy k = LazyKt.lazy(new c(this));
    private final Lazy l = LazyKt.lazy(new l(this));
    private String m;
    private HashMap n;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/ui/AtFriendsFragment$Companion;", "", "()V", "newInstance", "Lcom/ss/android/ugc/aweme/friends/ui/AtFriendsFragment;", "videoId", "", "from", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49143a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/presenter/SummonFriendSearchPresenter;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<com.ss.android.ugc.aweme.friends.d.l> {
        public static final b INSTANCE = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
            super(0);
        }

        @NotNull
        public final com.ss.android.ugc.aweme.friends.d.l invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47042, new Class[0], com.ss.android.ugc.aweme.friends.d.l.class)) {
                return new com.ss.android.ugc.aweme.friends.d.l();
            }
            return (com.ss.android.ugc.aweme.friends.d.l) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47042, new Class[0], com.ss.android.ugc.aweme.friends.d.l.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/dmt/ui/widget/DmtDefaultStatus;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<com.bytedance.ies.dmt.ui.widget.c> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ AtFriendsFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(AtFriendsFragment atFriendsFragment) {
            super(0);
            this.this$0 = atFriendsFragment;
        }

        public final com.bytedance.ies.dmt.ui.widget.c invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47043, new Class[0], com.bytedance.ies.dmt.ui.widget.c.class)) {
                return new c.a(this.this$0.getContext()).a(2130840145).b((int) C0906R.string.g7).c(C0906R.string.g8).f20493a;
            }
            return (com.bytedance.ies.dmt.ui.widget.c) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47043, new Class[0], com.bytedance.ies.dmt.ui.widget.c.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "loadMore"}, k = 3, mv = {1, 1, 15})
    static final class d implements LoadMoreRecyclerViewAdapter.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49144a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AtFriendsFragment f49145b;

        d(AtFriendsFragment atFriendsFragment) {
            this.f49145b = atFriendsFragment;
        }

        public final void loadMore() {
            if (PatchProxy.isSupport(new Object[0], this, f49144a, false, 47044, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f49144a, false, 47044, new Class[0], Void.TYPE);
                return;
            }
            this.f49145b.f49141e.showLoadMoreLoading();
            this.f49145b.a().a(Boolean.FALSE, this.f49145b.f49139c.latestSearchKey, AtFriendsFragment.a(this.f49145b.h));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49146a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AtFriendsFragment f49147b;

        e(AtFriendsFragment atFriendsFragment) {
            this.f49147b = atFriendsFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f49146a, false, 47045, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f49146a, false, 47045, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            FragmentActivity activity = this.f49147b.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49148a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AtFriendsFragment f49149b;

        f(AtFriendsFragment atFriendsFragment) {
            this.f49149b = atFriendsFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f49148a, false, 47046, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f49148a, false, 47046, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            FragmentActivity activity = this.f49149b.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "keycode", "", "<anonymous parameter 2>", "Landroid/view/KeyEvent;", "onKey"}, k = 3, mv = {1, 1, 15})
    static final class g implements View.OnKeyListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49150a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AtFriendsFragment f49151b;

        g(AtFriendsFragment atFriendsFragment) {
            this.f49151b = atFriendsFragment;
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), keyEvent}, this, f49150a, false, 47047, new Class[]{View.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), keyEvent}, this, f49150a, false, 47047, new Class[]{View.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
            } else if (i != 66) {
                return false;
            } else {
                com.ss.android.ugc.aweme.common.ui.b.a((Activity) this.f49151b.getActivity(), (View) (DmtEditText) this.f49151b.c(C0906R.id.ckg));
                return true;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/friends/ui/AtFriendsFragment$onViewCreated$5", "Lcom/ss/android/ugc/aweme/base/ui/SimpleTextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class h extends com.ss.android.ugc.aweme.base.ui.c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49152a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AtFriendsFragment f49153b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012B\u0010\u0002\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "", "Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
        static final class a<TTaskResult, TContinuationResult> implements a.g<List<? extends IMUser>, Void> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f49154a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h f49155b;

            a(h hVar) {
                this.f49155b = hVar;
            }

            public final /* synthetic */ Object then(a.i iVar) {
                if (PatchProxy.isSupport(new Object[]{iVar}, this, f49154a, false, 47049, new Class[]{a.i.class}, Void.class)) {
                    return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f49154a, false, 47049, new Class[]{a.i.class}, Void.class);
                }
                Intrinsics.checkExpressionValueIsNotNull(iVar, "task");
                if (iVar.c() || iVar.d()) {
                    ((DmtStatusView) this.f49155b.f49153b.c(C0906R.id.cuz)).d();
                } else {
                    this.f49155b.f49153b.f49141e.f48688b = (List) iVar.e();
                    List list = (List) iVar.e();
                    if (list != null && (!list.isEmpty())) {
                        this.f49155b.f49153b.a((Integer) null);
                    }
                    this.f49155b.f49153b.f49141e.notifyDataSetChanged();
                }
                this.f49155b.f49153b.a().a(Boolean.TRUE, this.f49155b.f49153b.f49139c.latestSearchKey, AtFriendsFragment.a(this.f49155b.f49153b.h));
                return null;
            }
        }

        h(AtFriendsFragment atFriendsFragment) {
            this.f49153b = atFriendsFragment;
        }

        public final void afterTextChanged(@NotNull Editable editable) {
            boolean z;
            int i;
            int i2;
            Editable editable2 = editable;
            boolean z2 = true;
            if (PatchProxy.isSupport(new Object[]{editable2}, this, f49152a, false, 47048, new Class[]{Editable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{editable2}, this, f49152a, false, 47048, new Class[]{Editable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(editable2, NotifyType.SOUND);
            if (editable2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            ImageButton imageButton = (ImageButton) this.f49153b.c(C0906R.id.t4);
            Intrinsics.checkExpressionValueIsNotNull(imageButton, "clearSearchInput");
            if (imageButton.getVisibility() != i) {
                if (i == 8) {
                    AtFriendsFragment atFriendsFragment = this.f49153b;
                    if (this.f49153b.f49140d.getItemCount() == 0) {
                        i2 = 1;
                    } else {
                        i2 = -1;
                    }
                    atFriendsFragment.b(i2);
                }
                ImageButton imageButton2 = (ImageButton) this.f49153b.c(C0906R.id.t4);
                Intrinsics.checkExpressionValueIsNotNull(imageButton2, "clearSearchInput");
                imageButton2.setVisibility(i);
            }
            String obj = editable.toString();
            if (obj != null) {
                String obj2 = StringsKt.trim((CharSequence) obj).toString();
                AtFriendsSearchAdapter atFriendsSearchAdapter = this.f49153b.f49141e;
                if (PatchProxy.isSupport(new Object[]{obj2}, atFriendsSearchAdapter, AtFriendsSearchAdapter.f48686a, false, 46229, new Class[]{String.class}, Void.TYPE)) {
                    AtFriendsSearchAdapter atFriendsSearchAdapter2 = atFriendsSearchAdapter;
                    PatchProxy.accessDispatch(new Object[]{obj2}, atFriendsSearchAdapter2, AtFriendsSearchAdapter.f48686a, false, 46229, new Class[]{String.class}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(obj2, "<set-?>");
                    atFriendsSearchAdapter.f48690d = obj2;
                }
                if (obj2.length() <= 0) {
                    z2 = false;
                }
                if (z2) {
                    if (!this.f49153b.a().l()) {
                        this.f49153b.a().a(this.f49153b);
                    }
                    if (this.f49153b.f49140d.getItemCount() == 0) {
                        ((DmtStatusView) this.f49153b.c(C0906R.id.cuz)).d();
                    }
                    AtFriendsViewModel atFriendsViewModel = this.f49153b.f49139c;
                    List<? extends IMUser> list = this.f49153b.f49140d.f48673b;
                    if (list == null) {
                        list = CollectionsKt.emptyList();
                    }
                    atFriendsViewModel.searchKeyWord(obj2, list).a((a.g<TResult, TContinuationResult>) new a<TResult,TContinuationResult>(this), a.i.f1052b);
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49156a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AtFriendsFragment f49157b;

        i(AtFriendsFragment atFriendsFragment) {
            this.f49157b = atFriendsFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f49156a, false, 47050, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f49156a, false, 47050, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            ((DmtEditText) this.f49157b.c(C0906R.id.ckg)).setText("");
            ((DmtEditText) this.f49157b.c(C0906R.id.ckg)).clearFocus();
            com.ss.android.ugc.aweme.common.ui.b.a((Activity) this.f49157b.getActivity(), (View) (DmtEditText) this.f49157b.c(C0906R.id.ckg));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "kotlin.jvm.PlatformType", "index", "", "onTouchIndex"}, k = 3, mv = {1, 1, 15})
    static final class j implements IndexView.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49158a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AtFriendsFragment f49159b;

        j(AtFriendsFragment atFriendsFragment) {
            this.f49159b = atFriendsFragment;
        }

        public final void a(String str, int i) {
            if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f49158a, false, 47053, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f49158a, false, 47053, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            AtFriendsFragment.a(this.f49159b).scrollToPositionWithOffset(((IndexView) this.f49159b.c(C0906R.id.au1)).a(i), 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/friends/model/AtFriendsViewModel$Companion$AllFriends;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class k<TTaskResult, TContinuationResult> implements a.g<AtFriendsViewModel.Companion.AllFriends, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49160a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AtFriendsFragment f49161b;

        k(AtFriendsFragment atFriendsFragment) {
            this.f49161b = atFriendsFragment;
        }

        public final /* synthetic */ Object then(a.i iVar) {
            a.i iVar2 = iVar;
            int i = 1;
            if (PatchProxy.isSupport(new Object[]{iVar2}, this, f49160a, false, 47054, new Class[]{a.i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar2}, this, f49160a, false, 47054, new Class[]{a.i.class}, Void.class);
            }
            IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
            Intrinsics.checkExpressionValueIsNotNull(iVar2, "task");
            if (!iVar.c() && !iVar.d()) {
                Intrinsics.checkExpressionValueIsNotNull(iUserService, "userService");
                if (iUserService.isLogin()) {
                    AtFriendsFragment atFriendsFragment = this.f49161b;
                    FloatingBarItemDecoration floatingBarItemDecoration = new FloatingBarItemDecoration(this.f49161b.getContext(), ((AtFriendsViewModel.Companion.AllFriends) iVar.e()).indexLabels, ((AtFriendsViewModel.Companion.AllFriends) iVar.e()).indexLabelCount);
                    ((RecyclerView) this.f49161b.c(C0906R.id.cc5)).addItemDecoration(floatingBarItemDecoration);
                    atFriendsFragment.g = floatingBarItemDecoration;
                    ((IndexView) this.f49161b.c(C0906R.id.au1)).a(((AtFriendsViewModel.Companion.AllFriends) iVar.e()).indexLabels, ((AtFriendsViewModel.Companion.AllFriends) iVar.e()).indexLabelCount);
                    AtFriendsAdapter atFriendsAdapter = this.f49161b.f49140d;
                    AtFriendsViewModel.Companion.AllFriends allFriends = (AtFriendsViewModel.Companion.AllFriends) iVar.e();
                    if (PatchProxy.isSupport(new Object[]{allFriends}, atFriendsAdapter, AtFriendsAdapter.f48671a, false, 46215, new Class[]{AtFriendsViewModel.Companion.AllFriends.class}, Void.TYPE)) {
                        AtFriendsAdapter atFriendsAdapter2 = atFriendsAdapter;
                        PatchProxy.accessDispatch(new Object[]{allFriends}, atFriendsAdapter2, AtFriendsAdapter.f48671a, false, 46215, new Class[]{AtFriendsViewModel.Companion.AllFriends.class}, Void.TYPE);
                    } else {
                        atFriendsAdapter.f48674c = allFriends;
                        List<? extends IMUser> arrayList = new ArrayList<>();
                        if (allFriends != null) {
                            arrayList.addAll(allFriends.recentFriends);
                            arrayList.addAll(allFriends.mutualFriends);
                            arrayList.addAll(allFriends.allFollowingFriends);
                            atFriendsAdapter.f48673b = arrayList;
                        }
                    }
                    this.f49161b.f49140d.notifyDataSetChanged();
                    AtFriendsFragment atFriendsFragment2 = this.f49161b;
                    if (this.f49161b.f49140d.getItemCount() != 0) {
                        i = -1;
                    }
                    atFriendsFragment2.b(i);
                    return null;
                }
            }
            ((DmtStatusView) this.f49161b.c(C0906R.id.cuz)).e();
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/dmt/ui/widget/DmtDefaultStatus;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class l extends Lambda implements Function0<com.bytedance.ies.dmt.ui.widget.c> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ AtFriendsFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(AtFriendsFragment atFriendsFragment) {
            super(0);
            this.this$0 = atFriendsFragment;
        }

        public final com.bytedance.ies.dmt.ui.widget.c invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47055, new Class[0], com.bytedance.ies.dmt.ui.widget.c.class)) {
                return new c.a(this.this$0.getContext()).a(2130840144).b((int) C0906R.string.f4486dmt).c(C0906R.string.dmu).f20493a;
            }
            return (com.bytedance.ies.dmt.ui.widget.c) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47055, new Class[0], com.bytedance.ies.dmt.ui.widget.c.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class m implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49162a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AtFriendsFragment f49163b;

        m(AtFriendsFragment atFriendsFragment) {
            this.f49163b = atFriendsFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f49162a, false, 47056, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f49162a, false, 47056, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f49163b.a().a(Boolean.TRUE, this.f49163b.f49139c.latestSearchKey, AtFriendsFragment.a(this.f49163b.h));
        }
    }

    public static String a(int i2) {
        return i2 == 1 ? "comment_user" : i2 == 0 ? "at_user" : "";
    }

    private final com.bytedance.ies.dmt.ui.widget.c c() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f49137a, false, 47029, new Class[0], com.bytedance.ies.dmt.ui.widget.c.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f49137a, false, 47029, new Class[0], com.bytedance.ies.dmt.ui.widget.c.class);
        } else {
            value = this.k.getValue();
        }
        return (com.bytedance.ies.dmt.ui.widget.c) value;
    }

    private final com.bytedance.ies.dmt.ui.widget.c d() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f49137a, false, 47030, new Class[0], com.bytedance.ies.dmt.ui.widget.c.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f49137a, false, 47030, new Class[0], com.bytedance.ies.dmt.ui.widget.c.class);
        } else {
            value = this.l.getValue();
        }
        return (com.bytedance.ies.dmt.ui.widget.c) value;
    }

    public final com.ss.android.ugc.aweme.friends.d.l a() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f49137a, false, 47028, new Class[0], com.ss.android.ugc.aweme.friends.d.l.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f49137a, false, 47028, new Class[0], com.ss.android.ugc.aweme.friends.d.l.class);
        } else {
            value = this.j.getValue();
        }
        return (com.ss.android.ugc.aweme.friends.d.l) value;
    }

    public final View c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f49137a, false, 47038, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f49137a, false, 47038, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.n == null) {
            this.n = new HashMap();
        }
        View view = (View) this.n.get(Integer.valueOf(i2));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i2);
            this.n.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f49137a, false, 47039, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49137a, false, 47039, new Class[0], Void.TYPE);
            return;
        }
        if (this.n != null) {
            this.n.clear();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f49137a, false, 47033, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49137a, false, 47033, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid() && this.f49141e.getItemCount() == 0) {
            ((DmtStatusView) c(C0906R.id.cuz)).d();
        }
    }

    public static final /* synthetic */ LinearLayoutManager a(AtFriendsFragment atFriendsFragment) {
        LinearLayoutManager linearLayoutManager = atFriendsFragment.f49142f;
        if (linearLayoutManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("linearLayoutManager");
        }
        return linearLayoutManager;
    }

    public final void a(@Nullable Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f49137a, false, 47034, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f49137a, false, 47034, new Class[]{Exception.class}, Void.TYPE);
        } else if (isViewValid()) {
            if (this.f49141e.getItemCount() == 0) {
                ((DmtStatusView) c(C0906R.id.cuz)).f();
            }
            com.ss.android.ugc.aweme.common.ui.b.a((Activity) getActivity(), (View) (DmtEditText) c(C0906R.id.ckg));
        }
    }

    public final void a(@Nullable List<SummonFriendItem> list) {
        List<? extends SummonFriendItem> list2;
        int i2 = 1;
        if (PatchProxy.isSupport(new Object[]{list}, this, f49137a, false, 47035, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f49137a, false, 47035, new Class[]{List.class}, Void.TYPE);
        } else if (isViewValid() && !TextUtils.isEmpty(this.f49141e.f48690d)) {
            if (a().c()) {
                this.f49141e.resetLoadMoreState();
            } else {
                this.f49141e.showLoadMoreEmpty();
            }
            AtFriendsSearchAdapter atFriendsSearchAdapter = this.f49141e;
            if (list != null) {
                Collection arrayList = new ArrayList();
                for (Object next : list) {
                    AtFriendsViewModel atFriendsViewModel = this.f49139c;
                    User user = ((SummonFriendItem) next).mUser;
                    Intrinsics.checkExpressionValueIsNotNull(user, "it.user");
                    String uid = user.getUid();
                    Intrinsics.checkExpressionValueIsNotNull(uid, "it.user.uid");
                    if (!atFriendsViewModel.latestSearchUsersContain(uid)) {
                        arrayList.add(next);
                    }
                }
                list2 = (List) arrayList;
            } else {
                list2 = null;
            }
            atFriendsSearchAdapter.f48689c = list2;
            this.f49141e.notifyDataSetChanged();
            if (this.f49141e.getItemCount() != 0) {
                i2 = -1;
            }
            a(Integer.valueOf(i2));
        }
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f49137a, false, 47036, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f49137a, false, 47036, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        RecyclerView recyclerView = (RecyclerView) c(C0906R.id.cc5);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recyclerView");
        if (!Intrinsics.areEqual((Object) recyclerView.getAdapter(), (Object) this.f49140d)) {
            FloatingBarItemDecoration floatingBarItemDecoration = this.g;
            if (floatingBarItemDecoration != null) {
                RecyclerView.ItemDecoration itemDecoration = floatingBarItemDecoration;
                ((RecyclerView) c(C0906R.id.cc5)).removeItemDecoration(itemDecoration);
                ((RecyclerView) c(C0906R.id.cc5)).addItemDecoration(itemDecoration);
            }
            RecyclerView recyclerView2 = (RecyclerView) c(C0906R.id.cc5);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "recyclerView");
            recyclerView2.setAdapter(this.f49140d);
            IndexView indexView = (IndexView) c(C0906R.id.au1);
            Intrinsics.checkExpressionValueIsNotNull(indexView, "indexView");
            indexView.setVisibility(0);
        }
        DmtStatusView.a a2 = DmtStatusView.a.a(getContext());
        if (com.ss.android.g.a.a()) {
            MtEmptyView a3 = MtEmptyView.a(getContext());
            a3.setStatus(new c.a(getContext()).a(2130839716).b((int) C0906R.string.g7).c(C0906R.string.g8).f20493a);
            a2.b((View) a3);
        } else {
            a2.a(c());
        }
        ((DmtStatusView) c(C0906R.id.cuz)).setBuilder(a2);
        ((DmtStatusView) c(C0906R.id.cuz)).setStatus(-1);
        ((DmtStatusView) c(C0906R.id.cuz)).setStatus(i2);
    }

    /* access modifiers changed from: package-private */
    public final void a(Integer num) {
        int i2 = 1;
        if (PatchProxy.isSupport(new Object[]{num}, this, f49137a, false, 47037, new Class[]{Integer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{num}, this, f49137a, false, 47037, new Class[]{Integer.class}, Void.TYPE);
            return;
        }
        RecyclerView recyclerView = (RecyclerView) c(C0906R.id.cc5);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recyclerView");
        if (!Intrinsics.areEqual((Object) recyclerView.getAdapter(), (Object) this.f49141e)) {
            if (this.g != null) {
                RecyclerView recyclerView2 = (RecyclerView) c(C0906R.id.cc5);
                FloatingBarItemDecoration floatingBarItemDecoration = this.g;
                if (floatingBarItemDecoration == null) {
                    Intrinsics.throwNpe();
                }
                recyclerView2.removeItemDecoration(floatingBarItemDecoration);
            }
            RecyclerView recyclerView3 = (RecyclerView) c(C0906R.id.cc5);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "recyclerView");
            recyclerView3.setAdapter(this.f49141e);
            IndexView indexView = (IndexView) c(C0906R.id.au1);
            Intrinsics.checkExpressionValueIsNotNull(indexView, "indexView");
            indexView.setVisibility(4);
        }
        if (num != null) {
            i2 = num.intValue();
        } else {
            DmtStatusView dmtStatusView = (DmtStatusView) c(C0906R.id.cuz);
            Intrinsics.checkExpressionValueIsNotNull(dmtStatusView, "statusView");
            if (dmtStatusView.g()) {
                i2 = 0;
            } else {
                DmtStatusView dmtStatusView2 = (DmtStatusView) c(C0906R.id.cuz);
                Intrinsics.checkExpressionValueIsNotNull(dmtStatusView2, "statusView");
                if (!dmtStatusView2.h()) {
                    DmtStatusView dmtStatusView3 = (DmtStatusView) c(C0906R.id.cuz);
                    Intrinsics.checkExpressionValueIsNotNull(dmtStatusView3, "statusView");
                    if (dmtStatusView3.i()) {
                        i2 = 2;
                    } else {
                        i2 = -1;
                    }
                }
            }
        }
        DmtStatusView.a a2 = DmtStatusView.a.a(getContext()).a(C0906R.string.dmm, C0906R.string.dml, C0906R.string.dms, new m(this));
        if (com.ss.android.g.a.a()) {
            MtEmptyView a3 = MtEmptyView.a(getContext());
            a3.setStatus(new c.a(getContext()).a(2130839718).b((int) C0906R.string.f4486dmt).c(C0906R.string.dmu).f20493a);
            a2.b((View) a3);
        } else {
            a2.a(d());
        }
        ((DmtStatusView) c(C0906R.id.cuz)).setBuilder(a2);
        ((DmtStatusView) c(C0906R.id.cuz)).setStatus(-1);
        ((DmtStatusView) c(C0906R.id.cuz)).setStatus(i2);
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f49137a, false, 47032, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f49137a, false, 47032, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        v.a((Activity) getActivity(), getResources().getColor(C0906R.color.yx));
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.m = arguments.getString("video_id");
            this.h = arguments.getInt("source");
        }
        if (com.ss.android.g.a.a()) {
            TextTitleBar textTitleBar = (TextTitleBar) c(C0906R.id.d3b);
            Intrinsics.checkExpressionValueIsNotNull(textTitleBar, "titleBar");
            textTitleBar.setUseBackIcon(true);
            TextTitleBar textTitleBar2 = (TextTitleBar) c(C0906R.id.d3b);
            Intrinsics.checkExpressionValueIsNotNull(textTitleBar2, "titleBar");
            textTitleBar2.getBackBtn().setImageResource(2130839513);
            TextTitleBar textTitleBar3 = (TextTitleBar) c(C0906R.id.d3b);
            Intrinsics.checkExpressionValueIsNotNull(textTitleBar3, "titleBar");
            textTitleBar3.getBackBtn().setOnClickListener(new e(this));
        }
        TextTitleBar textTitleBar4 = (TextTitleBar) c(C0906R.id.d3b);
        Intrinsics.checkExpressionValueIsNotNull(textTitleBar4, "titleBar");
        textTitleBar4.getStartText().setOnClickListener(new f(this));
        if (com.ss.android.g.a.a()) {
            ((DmtEditText) c(C0906R.id.ckg)).setHint(C0906R.string.bnh);
        }
        ((DmtEditText) c(C0906R.id.ckg)).setOnKeyListener(new g(this));
        ((DmtEditText) c(C0906R.id.ckg)).addTextChangedListener(new h(this));
        ((ImageButton) c(C0906R.id.t4)).setOnClickListener(new i(this));
        this.f49142f = new WrapLinearLayoutManager(getContext());
        RecyclerView recyclerView = (RecyclerView) c(C0906R.id.cc5);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recyclerView");
        LinearLayoutManager linearLayoutManager = this.f49142f;
        if (linearLayoutManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("linearLayoutManager");
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        ((RecyclerView) c(C0906R.id.cc5)).addOnScrollListener(new AtFriendsFragment$onViewCreated$7(this, view, view.getContext()));
        ((IndexView) c(C0906R.id.au1)).setIndexLetterTv((TextView) c(C0906R.id.au0));
        ((IndexView) c(C0906R.id.au1)).setOnLetterTouchListener(new j(this));
        b(0);
        this.f49139c.loadAllFriends().a((a.g<TResult, TContinuationResult>) new k<TResult,TContinuationResult>(this), a.i.f1052b);
        this.f49141e.setShowFooter(true);
        this.f49141e.setLoadMoreListener(new d(this));
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f49137a, false, 47031, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f49137a, false, 47031, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
        return layoutInflater2.inflate(C0906R.layout.mx, viewGroup2, false);
    }
}
