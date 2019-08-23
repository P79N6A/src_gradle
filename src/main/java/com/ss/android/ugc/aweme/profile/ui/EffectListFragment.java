package com.ss.android.ugc.aweme.profile.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.StringRes;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.effect.StickerListAdapter;
import com.ss.android.ugc.aweme.feed.model.NewFaceSticker;
import com.ss.android.ugc.aweme.music.util.ProfileListFragment;
import com.ss.android.ugc.aweme.profile.presenter.g;
import com.ss.android.ugc.aweme.views.FpsRecyclerView;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 d2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u0005:\u0001dB\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010/\u001a\u0002002\b\b\u0001\u00101\u001a\u00020\nH\u0002J\n\u00102\u001a\u0004\u0018\u00010\"H\u0016J\b\u00103\u001a\u000204H\u0002J\b\u00105\u001a\u000204H\u0016J\b\u00106\u001a\u000204H\u0002J\b\u00107\u001a\u000204H\u0002J\b\u00108\u001a\u000204H\u0002J\b\u00109\u001a\u000204H\u0002J\b\u0010:\u001a\u000204H\u0002J\b\u0010;\u001a\u000204H\u0002J\b\u0010<\u001a\u00020\u0011H\u0016J\b\u0010=\u001a\u000204H\u0016J\b\u0010>\u001a\u00020\u0011H\u0016J\u001a\u0010>\u001a\u0002042\b\u0010?\u001a\u0004\u0018\u00010$2\b\u0010@\u001a\u0004\u0018\u00010$J&\u0010A\u001a\u0004\u0018\u00010\"2\u0006\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010E2\b\u0010F\u001a\u0004\u0018\u00010GH\u0016J\b\u0010H\u001a\u000204H\u0016J\u001e\u0010I\u001a\u0002042\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00030K2\u0006\u0010L\u001a\u00020\u0011H\u0016J\u001e\u0010M\u001a\u0002042\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00030K2\u0006\u0010L\u001a\u00020\u0011H\u0016J\u0006\u0010N\u001a\u000204J\u001e\u0010O\u001a\u0002042\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00030P2\u0006\u0010L\u001a\u00020\u0011H\u0016J\u001a\u0010Q\u001a\u0002042\u0006\u0010R\u001a\u00020\"2\b\u0010F\u001a\u0004\u0018\u00010GH\u0016J\b\u0010S\u001a\u000204H\u0016J\b\u0010T\u001a\u000204H\u0016J\u001c\u0010U\u001a\u0002042\b\u0010?\u001a\u0004\u0018\u00010$2\b\u0010@\u001a\u0004\u0018\u00010$H\u0016J\b\u0010V\u001a\u000204H\u0016J\u0014\u0010W\u001a\u0002042\n\u0010X\u001a\u00060Yj\u0002`ZH\u0016J\u0014\u0010[\u001a\u0002042\n\u0010X\u001a\u00060Yj\u0002`ZH\u0016J\b\u0010\\\u001a\u000204H\u0016J\u0014\u0010]\u001a\u0002042\n\u0010X\u001a\u00060Yj\u0002`ZH\u0016J\b\u0010^\u001a\u000204H\u0016J\b\u0010_\u001a\u000204H\u0016J\u0012\u0010`\u001a\u0002042\b\u0010a\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010b\u001a\u00020\u0011H\u0016J\b\u0010c\u001a\u000204H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X.¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X.¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0010\u0010+\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020$0.X\u000e¢\u0006\u0002\n\u0000¨\u0006e"}, d2 = {"Lcom/ss/android/ugc/aweme/profile/ui/EffectListFragment;", "Lcom/ss/android/ugc/aweme/music/util/ProfileListFragment;", "Lcom/ss/android/ugc/aweme/common/presenter/IBaseListView;", "Lcom/ss/android/ugc/aweme/feed/model/NewFaceSticker;", "Lcom/ss/android/ugc/aweme/common/adapter/LoadMoreRecyclerViewAdapter$ILoadMore;", "Lcom/ss/android/ugc/aweme/profile/ui/IRefreshableList;", "()V", "itemViewCoordinates", "", "mBottomBarHeight", "", "mEffectListAdapter", "Lcom/ss/android/ugc/aweme/effect/StickerListAdapter;", "mEffectPresenter", "Lcom/ss/android/ugc/aweme/common/presenter/BaseListPresenter;", "Lcom/ss/android/ugc/aweme/profile/presenter/EffectListModel;", "mIsMe", "", "Ljava/lang/Boolean;", "mIsPrivateAccount", "mLayoutManger", "Landroid/support/v7/widget/LinearLayoutManager;", "mListView", "Landroid/support/v7/widget/RecyclerView;", "getMListView", "()Landroid/support/v7/widget/RecyclerView;", "setMListView", "(Landroid/support/v7/widget/RecyclerView;)V", "mNeedRefresh", "mOnScrollListener", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "mPrivateAccountStub", "Landroid/view/ViewStub;", "mPrivateAccountView", "Landroid/view/View;", "mSecUserId", "", "mStatusView", "Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;", "getMStatusView", "()Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;", "setMStatusView", "(Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;)V", "mUserId", "screenHeight", "statisticsStickersSet", "", "createStatusTextView", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "strRes", "getScrollableView", "handleContentScrolled", "", "handlePageChanged", "init", "initAdapter", "initData", "initPresenter", "initStatusView", "initView", "isEmpty", "loadMore", "needRefresh", "userId", "secUserId", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onLoadLatestResult", "list", "", "hasMore", "onLoadMoreResult", "onOuterScrolled", "onRefreshResult", "", "onViewCreated", "view", "scrollToFirstItem", "setLazyData", "setUserId", "showLoadEmpty", "showLoadError", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "showLoadLatestError", "showLoadLatestLoading", "showLoadMoreError", "showLoadMoreLoading", "showLoading", "statisticsSticker", "sticker", "tryRefreshList", "tryloadData", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class EffectListFragment extends ProfileListFragment implements LoadMoreRecyclerViewAdapter.a, c<NewFaceSticker>, z {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61795a;

    /* renamed from: d  reason: collision with root package name */
    public static final a f61796d = new a((byte) 0);
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f61797b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public DmtStatusView f61798c;

    /* renamed from: e  reason: collision with root package name */
    private LinearLayoutManager f61799e;

    /* renamed from: f  reason: collision with root package name */
    private RecyclerView.OnScrollListener f61800f;
    private com.ss.android.ugc.aweme.common.f.b<g> g;
    private StickerListAdapter h;
    private boolean l = true;
    private String m;
    private String n;
    private Boolean o = Boolean.FALSE;
    private int p;
    private Set<String> q = new LinkedHashSet();
    private int[] r = new int[2];
    private final int s = p.a(getContext());
    private ViewStub t;
    private View u;
    private boolean v;
    private HashMap w;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/profile/ui/EffectListFragment$Companion;", "", "()V", "newInstance", "Lcom/ss/android/ugc/aweme/profile/ui/EffectListFragment;", "bottomBarHeight", "", "userId", "", "secUserId", "isMe", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61801a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @NotNull
        public final EffectListFragment a(int i, @Nullable String str, @Nullable String str2, boolean z) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str3, str4, Byte.valueOf(z ? (byte) 1 : 0)}, this, f61801a, false, 67999, new Class[]{Integer.TYPE, String.class, String.class, Boolean.TYPE}, EffectListFragment.class)) {
                return (EffectListFragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str3, str4, Byte.valueOf(z)}, this, f61801a, false, 67999, new Class[]{Integer.TYPE, String.class, String.class, Boolean.TYPE}, EffectListFragment.class);
            }
            EffectListFragment effectListFragment = new EffectListFragment();
            Bundle bundle = new Bundle();
            CharSequence charSequence = str3;
            if (!TextUtils.isEmpty(charSequence)) {
                bundle.putString("userid", str3);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                bundle.putString("sec_user_id", str4);
            }
            bundle.putBoolean("is_me", z);
            bundle.putInt("bottom_bar_height", i);
            effectListFragment.setArguments(bundle);
            return effectListFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61802a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EffectListFragment f61803b;

        b(EffectListFragment effectListFragment) {
            this.f61803b = effectListFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f61802a, false, 68000, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f61802a, false, 68000, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f61803b.x();
        }
    }

    public final void c(@NotNull List<NewFaceSticker> list, boolean z) {
        List<NewFaceSticker> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f61795a, false, 67982, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Byte.valueOf(z)}, this, f61795a, false, 67982, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list2, "list");
    }

    public final void d(@NotNull Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f61795a, false, 67981, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f61795a, false, 67981, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(exc2, "e");
    }

    public final void l() {
    }

    public final void z_() {
    }

    public final boolean j() {
        return this.l;
    }

    public final void J_() {
        if (PatchProxy.isSupport(new Object[0], this, f61795a, false, 67972, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61795a, false, 67972, new Class[0], Void.TYPE);
        } else if (this.f61797b != null) {
            RecyclerView recyclerView = this.f61797b;
            if (recyclerView == null) {
                Intrinsics.throwNpe();
            }
            recyclerView.scrollToPosition(0);
        }
    }

    @Nullable
    public final View f() {
        if (PatchProxy.isSupport(new Object[0], this, f61795a, false, 67969, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f61795a, false, 67969, new Class[0], View.class);
        } else if (!isViewValid()) {
            return null;
        } else {
            return this.f61797b;
        }
    }

    public final void s_() {
        if (PatchProxy.isSupport(new Object[0], this, f61795a, false, 67978, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61795a, false, 67978, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            StickerListAdapter stickerListAdapter = this.h;
            if (stickerListAdapter == null) {
                Intrinsics.throwNpe();
            }
            stickerListAdapter.showLoadMoreLoading();
        }
    }

    private final void g() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f61795a, false, 67994, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61795a, false, 67994, new Class[0], Void.TYPE);
            return;
        }
        DmtStatusView.a a2 = DmtStatusView.a.a(getContext());
        try {
            DmtTextView a3 = a(C0906R.string.b6z);
            Boolean bool = this.o;
            if (bool == null) {
                Intrinsics.throwNpe();
            }
            if (bool.booleanValue()) {
                i = C0906R.string.bht;
            } else {
                i = C0906R.string.bhs;
            }
            DmtTextView a4 = a(i);
            a3.setOnClickListener(new b(this));
            a2.b((View) a4).c((View) a3);
        } catch (Exception unused) {
        }
        DmtStatusView dmtStatusView = this.f61798c;
        if (dmtStatusView == null) {
            Intrinsics.throwNpe();
        }
        dmtStatusView.setBuilder(a2);
    }

    public final void H_() {
        if (PatchProxy.isSupport(new Object[0], this, f61795a, false, 67973, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61795a, false, 67973, new Class[0], Void.TYPE);
        } else if (this.f61798c == null || (!this.v && !TimeLockRuler.isTeenModeON())) {
            x();
        } else {
            DmtStatusView dmtStatusView = this.f61798c;
            if (dmtStatusView == null) {
                Intrinsics.throwNpe();
            }
            dmtStatusView.setVisibility(4);
            View view = this.u;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPrivateAccountView");
            }
            view.setVisibility(0);
        }
    }

    public final boolean k() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f61795a, false, 67970, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f61795a, false, 67970, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (isViewValid() && this.h != null) {
            StickerListAdapter stickerListAdapter = this.h;
            if (stickerListAdapter == null) {
                Intrinsics.throwNpe();
            }
            if (stickerListAdapter.getItemCount() == 0) {
                z = true;
            }
        }
        return z;
    }

    public final void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, f61795a, false, 67983, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61795a, false, 67983, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.common.f.b<g> bVar = this.g;
        if (bVar == null) {
            Intrinsics.throwNpe();
        }
        bVar.a(4, this.m, this.n);
    }

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, f61795a, false, 67974, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61795a, false, 67974, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            View view = this.u;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPrivateAccountView");
            }
            view.setVisibility(4);
            DmtStatusView dmtStatusView = this.f61798c;
            if (dmtStatusView == null) {
                Intrinsics.throwNpe();
            }
            dmtStatusView.d();
        }
    }

    public final void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f61795a, false, 67968, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61795a, false, 67968, new Class[0], Void.TYPE);
            return;
        }
        RecyclerView recyclerView = this.f61797b;
        if (recyclerView != null) {
            RecyclerView.OnScrollListener onScrollListener = this.f61800f;
            if (onScrollListener == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mOnScrollListener");
            }
            recyclerView.removeOnScrollListener(onScrollListener);
        }
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f61795a, false, 67998, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61795a, false, 67998, new Class[0], Void.TYPE);
            return;
        }
        if (this.w != null) {
            this.w.clear();
        }
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, f61795a, false, 67976, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61795a, false, 67976, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            View view = this.u;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPrivateAccountView");
            }
            view.setVisibility(4);
            DmtStatusView dmtStatusView = this.f61798c;
            if (dmtStatusView == null) {
                Intrinsics.throwNpe();
            }
            dmtStatusView.e();
        }
    }

    public final void b() {
        int i;
        NewFaceSticker newFaceSticker;
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f61795a, false, 67991, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61795a, false, 67991, new Class[0], Void.TYPE);
            return;
        }
        LinearLayoutManager linearLayoutManager = this.f61799e;
        if (linearLayoutManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutManger");
        }
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        LinearLayoutManager linearLayoutManager2 = this.f61799e;
        if (linearLayoutManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutManger");
        }
        int findLastVisibleItemPosition = linearLayoutManager2.findLastVisibleItemPosition();
        if (findFirstVisibleItemPosition <= findLastVisibleItemPosition) {
            while (true) {
                StickerListAdapter stickerListAdapter = this.h;
                if (stickerListAdapter != null) {
                    i = stickerListAdapter.getItemCount();
                } else {
                    i = 0;
                }
                if (findFirstVisibleItemPosition < i) {
                    try {
                        StickerListAdapter stickerListAdapter2 = this.h;
                        if (stickerListAdapter2 != null) {
                            newFaceSticker = stickerListAdapter2.a(findFirstVisibleItemPosition);
                        } else {
                            newFaceSticker = null;
                        }
                        LinearLayoutManager linearLayoutManager3 = this.f61799e;
                        if (linearLayoutManager3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mLayoutManger");
                        }
                        View findViewByPosition = linearLayoutManager3.findViewByPosition(findFirstVisibleItemPosition);
                        if (findViewByPosition != null) {
                            findViewByPosition.getLocationOnScreen(this.r);
                            if (this.r[1] <= this.s) {
                                if (PatchProxy.isSupport(new Object[]{newFaceSticker}, this, f61795a, false, 67996, new Class[]{NewFaceSticker.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{newFaceSticker}, this, f61795a, false, 67996, new Class[]{NewFaceSticker.class}, Void.TYPE);
                                } else if (newFaceSticker != null) {
                                    String effectId = newFaceSticker.getEffectId();
                                    if (effectId != null && !this.q.contains(effectId)) {
                                        d a2 = new d().a("prop_id", effectId).a("from_user_id", this.m);
                                        if (Intrinsics.areEqual((Object) Boolean.TRUE, (Object) this.o)) {
                                            str = "personal_homepage";
                                        } else {
                                            str = "others_homepage";
                                        }
                                        r.a("prop_show_homepage", (Map) a2.a("enter_from", str).a("tab_name", this.k).f34114b);
                                        this.q.add(effectId);
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                    } catch (IndexOutOfBoundsException unused) {
                    }
                    if (findFirstVisibleItemPosition == findLastVisibleItemPosition) {
                        break;
                    }
                    findFirstVisibleItemPosition++;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean x() {
        if (PatchProxy.isSupport(new Object[0], this, f61795a, false, 67984, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f61795a, false, 67984, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!isViewValid() || TimeLockRuler.isTeenModeON()) {
            return false;
        } else {
            RecyclerView recyclerView = this.f61797b;
            if (recyclerView != null) {
                recyclerView.setVisibility(4);
            }
            if (!NetworkUtils.isNetworkAvailable(getActivity())) {
                FragmentActivity activity = getActivity();
                if (activity == null) {
                    Intrinsics.throwNpe();
                }
                com.bytedance.ies.dmt.ui.d.a.b((Context) activity, (int) C0906R.string.bgf).a();
                DmtStatusView dmtStatusView = this.f61798c;
                if (dmtStatusView == null) {
                    Intrinsics.throwNpe();
                }
                dmtStatusView.f();
                this.l = true;
                return false;
            }
            com.ss.android.ugc.aweme.common.f.b<g> bVar = this.g;
            if (bVar == null) {
                Intrinsics.throwNpe();
            }
            boolean z = !bVar.m();
            com.ss.android.ugc.aweme.common.f.b<g> bVar2 = this.g;
            if (bVar2 == null) {
                Intrinsics.throwNpe();
            }
            bVar2.a(1, this.m, this.n);
            this.l = false;
            return z;
        }
    }

    private final DmtTextView a(@StringRes int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f61795a, false, 67995, new Class[]{Integer.TYPE}, DmtTextView.class)) {
            return (DmtTextView) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f61795a, false, 67995, new Class[]{Integer.TYPE}, DmtTextView.class);
        }
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(getContext(), C0906R.style.r5));
        dmtTextView.setTextColor(getResources().getColor(C0906R.color.zv));
        dmtTextView.setText(i);
        return dmtTextView;
    }

    public final void b(@NotNull Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f61795a, false, 67975, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f61795a, false, 67975, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(exc, "e");
        if (isViewValid()) {
            DmtStatusView dmtStatusView = this.f61798c;
            if (dmtStatusView == null) {
                Intrinsics.throwNpe();
            }
            dmtStatusView.f();
            this.l = true;
        }
    }

    public final void c(@NotNull Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f61795a, false, 67979, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f61795a, false, 67979, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(exc2, "e");
        if (isViewValid()) {
            StickerListAdapter stickerListAdapter = this.h;
            if (stickerListAdapter == null) {
                Intrinsics.throwNpe();
            }
            stickerListAdapter.showPullUpLoadMore();
        }
    }

    public final void a(@Nullable String str, @Nullable String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f61795a, false, 67971, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f61795a, false, 67971, new Class[]{String.class, String.class}, Void.TYPE);
        } else if (this.m == null || !StringsKt.equals$default(this.m, str, false, 2, null)) {
            this.m = str;
            this.n = str2;
            this.l = true;
        }
    }

    public final void a(@NotNull List<NewFaceSticker> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f61795a, false, 67977, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f61795a, false, 67977, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list, "list");
        if (isViewValid()) {
            DmtStatusView dmtStatusView = this.f61798c;
            if (dmtStatusView == null) {
                Intrinsics.throwNpe();
            }
            dmtStatusView.b();
            DmtStatusView dmtStatusView2 = this.f61798c;
            if (dmtStatusView2 == null) {
                Intrinsics.throwNpe();
            }
            dmtStatusView2.k();
            RecyclerView recyclerView = this.f61797b;
            if (recyclerView != null) {
                recyclerView.setVisibility(0);
            }
            StickerListAdapter stickerListAdapter = this.h;
            if (stickerListAdapter == null) {
                Intrinsics.throwNpe();
            }
            stickerListAdapter.setData(list);
            if (!z) {
                StickerListAdapter stickerListAdapter2 = this.h;
                if (stickerListAdapter2 == null) {
                    Intrinsics.throwNpe();
                }
                stickerListAdapter2.setLoadMoreListener(null);
                StickerListAdapter stickerListAdapter3 = this.h;
                if (stickerListAdapter3 == null) {
                    Intrinsics.throwNpe();
                }
                stickerListAdapter3.showLoadMoreEmpty();
                return;
            }
            StickerListAdapter stickerListAdapter4 = this.h;
            if (stickerListAdapter4 == null) {
                Intrinsics.throwNpe();
            }
            stickerListAdapter4.setLoadMoreListener(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006c, code lost:
        if (r0 == null) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(@org.jetbrains.annotations.NotNull java.util.List<com.ss.android.ugc.aweme.feed.model.NewFaceSticker> r11, boolean r12) {
        /*
            r10 = this;
            r7 = 2
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r11
            java.lang.Byte r1 = java.lang.Byte.valueOf(r12)
            r9 = 1
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f61795a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 67980(0x1098c, float:9.526E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0047
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r11
            java.lang.Byte r1 = java.lang.Byte.valueOf(r12)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f61795a
            r3 = 0
            r4 = 67980(0x1098c, float:9.526E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0047:
            java.lang.String r0 = "list"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r11, r0)
            boolean r0 = r10.isViewValid()
            if (r0 != 0) goto L_0x0053
            return
        L_0x0053:
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.String r1 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = r0.d()
            boolean r0 = r0.useRecyclerPartialUpdate
            if (r0 == 0) goto L_0x0083
            com.ss.android.ugc.aweme.effect.StickerListAdapter r0 = r10.h
            if (r0 == 0) goto L_0x006e
            java.util.List r0 = r0.getData()
            if (r0 != 0) goto L_0x0075
        L_0x006e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
        L_0x0075:
            r1 = r11
            java.util.Collection r1 = (java.util.Collection) r1
            r0.addAll(r1)
            com.ss.android.ugc.aweme.effect.StickerListAdapter r1 = r10.h
            if (r1 == 0) goto L_0x008d
            r1.setDataAfterLoadMore(r0)
            goto L_0x008d
        L_0x0083:
            com.ss.android.ugc.aweme.effect.StickerListAdapter r0 = r10.h
            if (r0 != 0) goto L_0x008a
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x008a:
            r0.addData(r11)
        L_0x008d:
            if (r12 != 0) goto L_0x00a5
            com.ss.android.ugc.aweme.effect.StickerListAdapter r0 = r10.h
            if (r0 != 0) goto L_0x0096
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0096:
            r1 = 0
            r0.setLoadMoreListener(r1)
            com.ss.android.ugc.aweme.effect.StickerListAdapter r0 = r10.h
            if (r0 != 0) goto L_0x00a1
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00a1:
            r0.showLoadMoreEmpty()
            return
        L_0x00a5:
            com.ss.android.ugc.aweme.effect.StickerListAdapter r0 = r10.h
            if (r0 != 0) goto L_0x00ac
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00ac:
            r0.resetLoadMoreState()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.EffectListFragment.b(java.util.List, boolean):void");
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        String str;
        String str2;
        Boolean bool;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f61795a, false, 67967, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f61795a, false, 67967, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f61795a, false, 67987, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61795a, false, 67987, new Class[0], Void.TYPE);
            return;
        }
        this.l = true;
        if (PatchProxy.isSupport(new Object[0], this, f61795a, false, 67989, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61795a, false, 67989, new Class[0], Void.TYPE);
        } else {
            Bundle arguments = getArguments();
            Integer num = null;
            if (arguments != null) {
                str = arguments.getString("userid");
            } else {
                str = null;
            }
            this.m = str;
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                str2 = arguments2.getString("sec_user_id");
            } else {
                str2 = null;
            }
            this.n = str2;
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                bool = Boolean.valueOf(arguments3.getBoolean("is_me", false));
            } else {
                bool = null;
            }
            this.o = bool;
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                num = Integer.valueOf(arguments4.getInt("bottom_bar_height", 0));
            }
            if (num == null) {
                Intrinsics.throwNpe();
            }
            this.p = num.intValue();
        }
        if (PatchProxy.isSupport(new Object[0], this, f61795a, false, 67992, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61795a, false, 67992, new Class[0], Void.TYPE);
        } else {
            Boolean bool2 = this.o;
            if (bool2 == null) {
                Intrinsics.throwNpe();
            }
            this.h = new StickerListAdapter(bool2.booleanValue());
            StickerListAdapter stickerListAdapter = this.h;
            if (stickerListAdapter != null) {
                stickerListAdapter.setLoadMoreListener(this);
                stickerListAdapter.setLoadEmptyTextResId(C0906R.string.a3f);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f61795a, false, 67990, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61795a, false, 67990, new Class[0], Void.TYPE);
        } else {
            RecyclerView recyclerView = this.f61797b;
            if (recyclerView != null) {
                recyclerView.setAdapter(this.h);
            }
            this.f61799e = new LinearLayoutManager(getContext(), 1, false);
            RecyclerView recyclerView2 = this.f61797b;
            if (recyclerView2 != null) {
                LinearLayoutManager linearLayoutManager = this.f61799e;
                if (linearLayoutManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLayoutManger");
                }
                recyclerView2.setLayoutManager(linearLayoutManager);
            }
            if (this.p != 0) {
                RecyclerView recyclerView3 = this.f61797b;
                if (recyclerView3 != null) {
                    recyclerView3.setPadding(0, 0, 0, this.p);
                }
            }
            this.f61800f = new EffectListFragment$initView$1(this);
            RecyclerView recyclerView4 = this.f61797b;
            if (recyclerView4 != null) {
                RecyclerView.OnScrollListener onScrollListener = this.f61800f;
                if (onScrollListener == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mOnScrollListener");
                }
                recyclerView4.addOnScrollListener(onScrollListener);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f61795a, false, 67993, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61795a, false, 67993, new Class[0], Void.TYPE);
        } else {
            this.g = new com.ss.android.ugc.aweme.common.f.b<>();
            com.ss.android.ugc.aweme.common.f.b<g> bVar = this.g;
            if (bVar == null) {
                Intrinsics.throwNpe();
            }
            bVar.a(this);
            com.ss.android.ugc.aweme.common.f.b<g> bVar2 = this.g;
            if (bVar2 == null) {
                Intrinsics.throwNpe();
            }
            bVar2.a(new g());
        }
        g();
        if (PatchProxy.isSupport(new Object[0], this, f61795a, false, 67988, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61795a, false, 67988, new Class[0], Void.TYPE);
            return;
        }
        if (this.j) {
            x();
        }
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f61795a, false, 67966, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f61795a, false, 67966, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0906R.layout.nm, viewGroup2, false);
        this.f61797b = (RecyclerView) inflate.findViewById(C0906R.id.ciy);
        this.f61798c = (DmtStatusView) inflate.findViewById(C0906R.id.cvd);
        if (this.f61797b instanceof FpsRecyclerView) {
            RecyclerView recyclerView = this.f61797b;
            if (recyclerView != null) {
                ((FpsRecyclerView) recyclerView).setLabel("profile_list");
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.views.FpsRecyclerView");
            }
        }
        View findViewById = inflate.findViewById(C0906R.id.cx0);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.stub_private_account)");
        this.t = (ViewStub) findViewById;
        ViewStub viewStub = this.t;
        if (viewStub == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPrivateAccountStub");
        }
        View inflate2 = viewStub.inflate();
        Intrinsics.checkExpressionValueIsNotNull(inflate2, "mPrivateAccountStub.inflate()");
        this.u = inflate2;
        if (TimeLockRuler.isTeenModeON()) {
            View view = this.u;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPrivateAccountView");
            }
            ((TextView) view.findViewById(C0906R.id.title)).setText(C0906R.string.cit);
            View view2 = this.u;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPrivateAccountView");
            }
            ((TextView) view2.findViewById(C0906R.id.yp)).setText(C0906R.string.cii);
        }
        View view3 = this.u;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPrivateAccountView");
        }
        view3.setVisibility(4);
        return inflate;
    }
}
