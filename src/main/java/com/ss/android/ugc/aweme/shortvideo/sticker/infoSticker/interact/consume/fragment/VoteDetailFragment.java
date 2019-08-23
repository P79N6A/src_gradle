package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.StringRes;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.adapter.VoteUserAdapter;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.g;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d;
import com.ss.android.ugc.aweme.sticker.data.VoteStruct;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 >2\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001>B\u0005¢\u0006\u0002\u0010\u0005J\u0012\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\u001c\u001a\u00020\u0015H\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u0012\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010 \u001a\u00020\u001eH\u0016J\u0012\u0010!\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J&\u0010$\u001a\u0004\u0018\u00010\u00132\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010)\u001a\u00020\u001eH\u0016J \u0010*\u001a\u00020\u001e2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.H\u0016J \u0010/\u001a\u00020\u001e2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.H\u0016J \u00100\u001a\u00020\u001e2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.H\u0016J\u001a\u00101\u001a\u00020\u001e2\u0006\u00102\u001a\u00020\u00132\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u00103\u001a\u00020\u001eH\u0016J\u0012\u00104\u001a\u00020\u001e2\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u0012\u00107\u001a\u00020\u001e2\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u00108\u001a\u00020\u001eH\u0016J\u0012\u00109\u001a\u00020\u001e2\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u0010:\u001a\u00020\u001eH\u0016J\b\u0010;\u001a\u00020\u001eH\u0016J\b\u0010<\u001a\u00020.H\u0002J\b\u0010=\u001a\u00020\u001eH\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/fragment/VoteDetailFragment;", "Lcom/ss/android/ugc/aweme/base/fragment/AmeBaseFragment;", "Lcom/ss/android/ugc/aweme/common/adapter/LoadMoreRecyclerViewAdapter$ILoadMore;", "Lcom/ss/android/ugc/aweme/common/presenter/IBaseListView;", "Lcom/ss/android/ugc/aweme/profile/model/User;", "()V", "adapter", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/adapter/VoteUserAdapter;", "iVoteDetailSaveData", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IVoteDetailSaveData;", "getIVoteDetailSaveData", "()Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IVoteDetailSaveData;", "setIVoteDetailSaveData", "(Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IVoteDetailSaveData;)V", "presenter", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/presenter/VoteDetailPresenter;", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "rootView", "Landroid/view/View;", "state", "", "statusView", "Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;", "voteData", "Lcom/ss/android/ugc/aweme/sticker/data/VoteStruct;", "createStatusTextView", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "strRes", "initData", "", "initView", "loadMore", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onLoadLatestResult", "list", "", "hasMore", "", "onLoadMoreResult", "onRefreshResult", "onViewCreated", "view", "showLoadEmpty", "showLoadError", "e", "Ljava/lang/Exception;", "showLoadLatestError", "showLoadLatestLoading", "showLoadMoreError", "showLoadMoreLoading", "showLoading", "tryLoadFromSaveData", "tryToRefresh", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VoteDetailFragment extends AmeBaseFragment implements LoadMoreRecyclerViewAdapter.a, com.ss.android.ugc.aweme.common.f.c<User> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69962a;

    /* renamed from: d  reason: collision with root package name */
    public static final a f69963d = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public d f69964b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public g f69965c;

    /* renamed from: e  reason: collision with root package name */
    private VoteStruct f69966e;

    /* renamed from: f  reason: collision with root package name */
    private int f69967f;
    private View g;
    private RecyclerView h;
    private DmtStatusView i;
    private VoteUserAdapter j;
    private HashMap k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/fragment/VoteDetailFragment$Companion;", "", "()V", "KEY_STATE", "", "STATE_OPTION_LEFT", "", "STATE_OPTION_RIGHT", "newInstance", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/fragment/VoteDetailFragment;", "state", "voteData", "Lcom/ss/android/ugc/aweme/sticker/data/VoteStruct;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69968a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        public final VoteDetailFragment a(int i, @Nullable VoteStruct voteStruct) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), voteStruct}, this, f69968a, false, 79590, new Class[]{Integer.TYPE, VoteStruct.class}, VoteDetailFragment.class)) {
                return (VoteDetailFragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), voteStruct}, this, f69968a, false, 79590, new Class[]{Integer.TYPE, VoteStruct.class}, VoteDetailFragment.class);
            }
            Bundle bundle = new Bundle();
            bundle.putInt("key_state", i);
            if (voteStruct != null) {
                bundle.putSerializable("key_vote", voteStruct);
            }
            VoteDetailFragment voteDetailFragment = new VoteDetailFragment();
            voteDetailFragment.setArguments(bundle);
            return voteDetailFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/fragment/VoteDetailFragment$initView$1$1"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69969a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VoteDetailFragment f69970b;

        b(VoteDetailFragment voteDetailFragment) {
            this.f69970b = voteDetailFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f69969a, false, 79591, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f69969a, false, 79591, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f69970b.b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69971a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VoteDetailFragment f69972b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.c f69973c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f69974d;

        c(VoteDetailFragment voteDetailFragment, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.c cVar, List list) {
            this.f69972b = voteDetailFragment;
            this.f69973c = cVar;
            this.f69974d = list;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f69971a, false, 79592, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f69971a, false, 79592, new Class[0], Void.TYPE);
                return;
            }
            d dVar = this.f69972b.f69964b;
            if (dVar != null) {
                dVar.a(this.f69973c);
            }
            this.f69972b.a(this.f69974d, this.f69973c.f69895b);
        }
    }

    public final void c(@Nullable List<User> list, boolean z) {
    }

    public final void d(@Nullable Exception exc) {
    }

    public final void z_() {
    }

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, f69962a, false, 79580, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69962a, false, 79580, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            DmtStatusView dmtStatusView = this.i;
            if (dmtStatusView != null) {
                dmtStatusView.setVisibility(0);
            }
            DmtStatusView dmtStatusView2 = this.i;
            if (dmtStatusView2 != null) {
                dmtStatusView2.d();
            }
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f69962a, false, 79588, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69962a, false, 79588, new Class[0], Void.TYPE);
            return;
        }
        if (this.k != null) {
            this.k.clear();
        }
    }

    public final void s_() {
        if (PatchProxy.isSupport(new Object[0], this, f69962a, false, 79579, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69962a, false, 79579, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            VoteUserAdapter voteUserAdapter = this.j;
            if (voteUserAdapter != null) {
                voteUserAdapter.showLoadMoreLoading();
            }
        }
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, f69962a, false, 79581, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69962a, false, 79581, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            DmtStatusView dmtStatusView = this.i;
            if (dmtStatusView != null) {
                dmtStatusView.setVisibility(0);
            }
            DmtStatusView dmtStatusView2 = this.i;
            if (dmtStatusView2 != null) {
                dmtStatusView2.e();
            }
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f69962a, false, 79577, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69962a, false, 79577, new Class[0], Void.TYPE);
            return;
        }
        d dVar = this.f69964b;
        if (dVar != null) {
            VoteStruct voteStruct = this.f69966e;
            if (voteStruct == null) {
                Intrinsics.throwNpe();
            }
            long voteId = voteStruct.getVoteId();
            long j2 = 0;
            if (this.f69967f == 0) {
                VoteStruct voteStruct2 = this.f69966e;
                if (voteStruct2 == null) {
                    Intrinsics.throwNpe();
                }
                List<VoteStruct.OptionsBean> options = voteStruct2.getOptions();
                if (options != null) {
                    VoteStruct.OptionsBean optionsBean = options.get(0);
                    if (optionsBean != null) {
                        j2 = optionsBean.getOptionId();
                    }
                }
            } else {
                VoteStruct voteStruct3 = this.f69966e;
                if (voteStruct3 == null) {
                    Intrinsics.throwNpe();
                }
                List<VoteStruct.OptionsBean> options2 = voteStruct3.getOptions();
                if (options2 != null) {
                    VoteStruct.OptionsBean optionsBean2 = options2.get(1);
                    if (optionsBean2 != null) {
                        j2 = optionsBean2.getOptionId();
                    }
                }
            }
            dVar.a(voteId, j2);
        }
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f69962a, false, 79586, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69962a, false, 79586, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        d dVar = this.f69964b;
        if (dVar != null) {
            if (PatchProxy.isSupport(new Object[0], dVar, d.f69948a, false, 79613, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], dVar, d.f69948a, false, 79613, new Class[0], Void.TYPE);
            } else {
                dVar.f69950c.dispose();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void loadMore() {
        /*
            r15 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f69962a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 79578(0x136da, float:1.11513E-40)
            r2 = r15
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f69962a
            r5 = 0
            r6 = 79578(0x136da, float:1.11513E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r15
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r1 = r15.f69966e
            if (r1 != 0) goto L_0x002c
            r15.y_()
        L_0x002c:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d r1 = r15.f69964b
            if (r1 == 0) goto L_0x00f1
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r2 = r15.f69966e
            if (r2 != 0) goto L_0x0037
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0037:
            long r9 = r2.getVoteId()
            int r2 = r15.f69967f
            r3 = 0
            r11 = 1
            if (r2 != 0) goto L_0x005f
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r2 = r15.f69966e
            if (r2 != 0) goto L_0x0049
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0049:
            java.util.List r2 = r2.getOptions()
            if (r2 == 0) goto L_0x005d
            java.lang.Object r2 = r2.get(r0)
            com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r2 = (com.ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r2
            if (r2 == 0) goto L_0x005d
            long r2 = r2.getOptionId()
        L_0x005b:
            r12 = r2
            goto L_0x0079
        L_0x005d:
            r12 = r3
            goto L_0x0079
        L_0x005f:
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r2 = r15.f69966e
            if (r2 != 0) goto L_0x0066
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0066:
            java.util.List r2 = r2.getOptions()
            if (r2 == 0) goto L_0x005d
            java.lang.Object r2 = r2.get(r11)
            com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r2 = (com.ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r2
            if (r2 == 0) goto L_0x005d
            long r2 = r2.getOptionId()
            goto L_0x005b
        L_0x0079:
            r14 = 2
            java.lang.Object[] r2 = new java.lang.Object[r14]
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r9)
            r2[r0] = r3
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r12)
            r2[r11] = r3
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d.f69948a
            r5 = 0
            r6 = 79612(0x136fc, float:1.1156E-40)
            java.lang.Class[] r7 = new java.lang.Class[r14]
            java.lang.Class r3 = java.lang.Long.TYPE
            r7[r0] = r3
            java.lang.Class r3 = java.lang.Long.TYPE
            r7[r11] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r1
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x00ca
            java.lang.Object[] r2 = new java.lang.Object[r14]
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r9)
            r2[r0] = r3
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r12)
            r2[r11] = r3
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d.f69948a
            r5 = 0
            r6 = 79612(0x136fc, float:1.1156E-40)
            java.lang.Class[] r7 = new java.lang.Class[r14]
            java.lang.Class r3 = java.lang.Long.TYPE
            r7[r0] = r3
            java.lang.Class r0 = java.lang.Long.TYPE
            r7[r11] = r0
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x00f1
        L_0x00ca:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api.VoteDetailApi r3 = r1.f69949b
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.c r0 = r1.f69951d
            int r8 = r0.f69894a
            r4 = r9
            r6 = r12
            io.reactivex.Observable r0 = r3.getVoteDetail(r4, r6, r8)
            io.reactivex.Scheduler r2 = io.reactivex.schedulers.Schedulers.io()
            io.reactivex.Observable r0 = r0.subscribeOn(r2)
            io.reactivex.Scheduler r2 = io.reactivex.android.schedulers.AndroidSchedulers.mainThread()
            io.reactivex.Observable r0 = r0.observeOn(r2)
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d$a r2 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d$a
            r2.<init>(r1)
            io.reactivex.Observer r2 = (io.reactivex.Observer) r2
            r0.subscribe((io.reactivex.Observer<? super T>) r2)
            return
        L_0x00f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.VoteDetailFragment.loadMore():void");
    }

    private final DmtTextView a(@StringRes int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f69962a, false, 79574, new Class[]{Integer.TYPE}, DmtTextView.class)) {
            return (DmtTextView) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f69962a, false, 79574, new Class[]{Integer.TYPE}, DmtTextView.class);
        }
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(getContext(), C0906R.style.r5));
        Context context = getContext();
        if (context == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(context, "context!!");
        dmtTextView.setTextColor(context.getResources().getColor(C0906R.color.hf));
        dmtTextView.setText(i2);
        dmtTextView.setTextSize(13.0f);
        return dmtTextView;
    }

    public final void c(@Nullable Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f69962a, false, 79584, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f69962a, false, 79584, new Class[]{Exception.class}, Void.TYPE);
        } else if (isViewValid()) {
            VoteUserAdapter voteUserAdapter = this.j;
            if (voteUserAdapter != null) {
                voteUserAdapter.showLoadMoreError();
            }
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        Serializable serializable;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f69962a, false, 79570, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f69962a, false, 79570, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            i2 = arguments.getInt("key_state");
        }
        this.f69967f = i2;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable = arguments2.getSerializable("key_vote");
        } else {
            serializable = null;
        }
        this.f69966e = (VoteStruct) serializable;
        this.f69964b = new d(this, this.f69965c, this.f69967f);
    }

    public final void b(@Nullable Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f69962a, false, 79583, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f69962a, false, 79583, new Class[]{Exception.class}, Void.TYPE);
        } else if (isViewValid()) {
            DmtStatusView dmtStatusView = this.i;
            if (dmtStatusView != null) {
                dmtStatusView.f();
            }
        }
    }

    public final void a(@Nullable List<User> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f69962a, false, 79585, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f69962a, false, 79585, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            if (!z) {
                VoteUserAdapter voteUserAdapter = this.j;
                if (voteUserAdapter != null) {
                    voteUserAdapter.showLoadMoreEmpty();
                }
            } else {
                VoteUserAdapter voteUserAdapter2 = this.j;
                if (voteUserAdapter2 != null) {
                    voteUserAdapter2.resetLoadMoreState();
                }
            }
            DmtStatusView dmtStatusView = this.i;
            if (dmtStatusView != null) {
                dmtStatusView.b();
            }
            VoteUserAdapter voteUserAdapter3 = this.j;
            if (voteUserAdapter3 != null) {
                voteUserAdapter3.setData(list);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006e, code lost:
        if (r0 == null) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(@org.jetbrains.annotations.Nullable java.util.List<com.ss.android.ugc.aweme.profile.model.User> r11, boolean r12) {
        /*
            r10 = this;
            r7 = 2
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r11
            java.lang.Byte r1 = java.lang.Byte.valueOf(r12)
            r9 = 1
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f69962a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 79582(0x136de, float:1.11518E-40)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0047
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r11
            java.lang.Byte r1 = java.lang.Byte.valueOf(r12)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f69962a
            r3 = 0
            r4 = 79582(0x136de, float:1.11518E-40)
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
            boolean r0 = r10.isViewValid()
            if (r0 != 0) goto L_0x004e
            return
        L_0x004e:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.adapter.VoteUserAdapter r0 = r10.j
            if (r0 == 0) goto L_0x0055
            r0.setShowFooter(r8)
        L_0x0055:
            if (r12 != 0) goto L_0x005f
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.adapter.VoteUserAdapter r0 = r10.j
            if (r0 == 0) goto L_0x0066
            r0.showLoadMoreEmpty()
            goto L_0x0066
        L_0x005f:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.adapter.VoteUserAdapter r0 = r10.j
            if (r0 == 0) goto L_0x0066
            r0.resetLoadMoreState()
        L_0x0066:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.adapter.VoteUserAdapter r0 = r10.j
            if (r0 == 0) goto L_0x0070
            java.util.List r0 = r0.getData()
            if (r0 != 0) goto L_0x0077
        L_0x0070:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
        L_0x0077:
            if (r11 == 0) goto L_0x008c
            boolean r1 = r11.isEmpty()
            if (r1 != 0) goto L_0x008c
            r1 = r11
            java.util.Collection r1 = (java.util.Collection) r1
            r0.addAll(r1)
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.adapter.VoteUserAdapter r1 = r10.j
            if (r1 == 0) goto L_0x008c
            r1.setDataAfterLoadMore(r0)
        L_0x008c:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.adapter.VoteUserAdapter r0 = r10.j
            if (r0 == 0) goto L_0x0094
            r0.setShowFooter(r9)
            return
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.VoteDetailFragment.b(java.util.List, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a7, code lost:
        if (r0 == null) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00bc, code lost:
        if (r1 == null) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ca, code lost:
        if (com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r0) != false) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00dd, code lost:
        if (r0 == null) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f2, code lost:
        if (r1 == null) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0100, code lost:
        if (com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r0) != false) goto L_0x0115;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(@org.jetbrains.annotations.NotNull android.view.View r11, @org.jetbrains.annotations.Nullable android.os.Bundle r12) {
        /*
            r10 = this;
            r7 = 2
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r11
            r9 = 1
            r0[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f69962a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r8] = r1
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 79572(0x136d4, float:1.11504E-40)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003f
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r11
            r0[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f69962a
            r3 = 0
            r4 = 79572(0x136d4, float:1.11504E-40)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r8] = r1
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003f:
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r11, r0)
            super.onViewCreated(r11, r12)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f69962a
            r3 = 0
            r4 = 79575(0x136d7, float:1.11508E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x006b
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f69962a
            r3 = 0
            r4 = 79575(0x136d7, float:1.11508E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x006b:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f69962a
            r3 = 0
            r4 = 79576(0x136d8, float:1.1151E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0097
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f69962a
            r3 = 0
            r4 = 79576(0x136d8, float:1.1151E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
            goto L_0x0115
        L_0x0097:
            int r0 = r10.f69967f
            if (r0 != 0) goto L_0x00cd
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.g r0 = r10.f69965c
            if (r0 == 0) goto L_0x00a9
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.d r0 = r0.ag_()
            if (r0 == 0) goto L_0x00a9
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r0 = r0.f69897b
            if (r0 != 0) goto L_0x00b0
        L_0x00a9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
        L_0x00b0:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.g r1 = r10.f69965c
            if (r1 == 0) goto L_0x00be
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.d r1 = r1.ag_()
            if (r1 == 0) goto L_0x00be
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.c r1 = r1.f69898c
            if (r1 != 0) goto L_0x00c3
        L_0x00be:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.c r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.c
            r1.<init>(r8, r8)
        L_0x00c3:
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0103
            goto L_0x0115
        L_0x00cd:
            int r0 = r10.f69967f
            if (r0 != r9) goto L_0x0115
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.g r0 = r10.f69965c
            if (r0 == 0) goto L_0x00df
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.d r0 = r0.ag_()
            if (r0 == 0) goto L_0x00df
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r0 = r0.f69899d
            if (r0 != 0) goto L_0x00e6
        L_0x00df:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
        L_0x00e6:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.g r1 = r10.f69965c
            if (r1 == 0) goto L_0x00f4
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.d r1 = r1.ag_()
            if (r1 == 0) goto L_0x00f4
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.c r1 = r1.f69900e
            if (r1 != 0) goto L_0x00f9
        L_0x00f4:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.c r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.c
            r1.<init>(r8, r8)
        L_0x00f9:
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0103
            goto L_0x0115
        L_0x0103:
            r10.n_()
            android.support.v7.widget.RecyclerView r2 = r10.h
            if (r2 == 0) goto L_0x0114
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.VoteDetailFragment$c r3 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.VoteDetailFragment$c
            r3.<init>(r10, r1, r0)
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r2.post(r3)
        L_0x0114:
            r8 = 1
        L_0x0115:
            if (r8 != 0) goto L_0x011a
            r10.b()
        L_0x011a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.VoteDetailFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        DmtStatusView dmtStatusView;
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f69962a, false, 79571, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f69962a, false, 79571, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        this.g = layoutInflater.inflate(C0906R.layout.asi, viewGroup2, false);
        View view = this.g;
        if (PatchProxy.isSupport(new Object[]{view}, this, f69962a, false, 79573, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f69962a, false, 79573, new Class[]{View.class}, Void.TYPE);
        } else {
            RecyclerView recyclerView = null;
            if (view != null) {
                dmtStatusView = (DmtStatusView) view.findViewById(C0906R.id.cvd);
            } else {
                dmtStatusView = null;
            }
            this.i = dmtStatusView;
            if (view != null) {
                recyclerView = (RecyclerView) view.findViewById(C0906R.id.cci);
            }
            this.h = recyclerView;
            this.j = new VoteUserAdapter();
            VoteUserAdapter voteUserAdapter = this.j;
            if (voteUserAdapter != null) {
                voteUserAdapter.setLoadMoreListener(this);
            }
            RecyclerView recyclerView2 = this.h;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(this.j);
            }
            RecyclerView recyclerView3 = this.h;
            if (recyclerView3 != null) {
                recyclerView3.setLayoutManager(new LinearLayoutManager(getContext()));
            }
            DmtStatusView dmtStatusView2 = this.i;
            if (dmtStatusView2 != null) {
                DmtStatusView.a a2 = DmtStatusView.a.a(dmtStatusView2.getContext());
                try {
                    DmtTextView a3 = a(C0906R.string.b6z);
                    DmtTextView a4 = a(C0906R.string.dsi);
                    a3.setOnClickListener(new b(this));
                    a2.b((View) a4).c((View) a3);
                } catch (Exception unused) {
                }
                dmtStatusView2.setBuilder(a2);
            }
        }
        return this.g;
    }
}
