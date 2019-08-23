package com.ss.android.ugc.aweme.following.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.MtEmptyView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.arch.JediBaseFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.a.b;
import com.ss.android.ugc.aweme.views.e;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 42\u00020\u0001:\u00014B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H&J\b\u0010\u001a\u001a\u00020\u0018H&J\b\u0010\u001b\u001a\u00020\u0018H&J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0018H&J\b\u0010 \u001a\u00020!H\u0002J\u000e\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020&J\u0012\u0010'\u001a\u00020!2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J&\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u00100\u001a\u00020!H&J\b\u00101\u001a\u00020!H&J\u0018\u00102\u001a\u00020!2\u0006\u0010#\u001a\u00020$2\u0006\u00103\u001a\u00020\u001eH\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u00065"}, d2 = {"Lcom/ss/android/ugc/aweme/following/ui/BaseRelationFragment;", "Lcom/ss/android/ugc/aweme/base/arch/JediBaseFragment;", "()V", "mStatusViewBuilder", "Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView$Builder;", "getMStatusViewBuilder", "()Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView$Builder;", "setMStatusViewBuilder", "(Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView$Builder;)V", "uid", "", "getUid", "()Ljava/lang/String;", "setUid", "(Ljava/lang/String;)V", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "getUser", "()Lcom/ss/android/ugc/aweme/profile/model/User;", "setUser", "(Lcom/ss/android/ugc/aweme/profile/model/User;)V", "createStatusTextView", "Lcom/bytedance/ies/dmt/ui/widget/DmtDefaultStatus;", "errorTextId", "", "getEmptyDescText", "getEmptyPlaceHolderRes", "getEmptyText", "getErrorTextId", "exception", "Ljava/lang/Exception;", "getLayoutId", "initArgument", "", "initStatusView", "statusView", "Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;", "isMySelf", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onLoadMore", "onRefresh", "updateErrorViewIfNeeded", "e", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class BaseRelationFragment extends JediBaseFragment {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f47948c;
    public static final a g = new a((byte) 0);
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public String f47949d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public User f47950e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    protected DmtStatusView.a f47951f;
    private HashMap h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/following/ui/BaseRelationFragment$Companion;", "", "()V", "BLOCKED_EMPTY_ERROR_CODE", "", "BLOCK_EMPTY_ERROR_CODE", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47952a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseRelationFragment f47953b;

        b(BaseRelationFragment baseRelationFragment) {
            this.f47953b = baseRelationFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f47952a, false, 44850, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f47952a, false, 44850, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f47953b.k();
        }
    }

    public View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f47948c, false, 44848, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f47948c, false, 44848, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.h == null) {
            this.h = new HashMap();
        }
        View view = (View) this.h.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.h.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public void g() {
        if (PatchProxy.isSupport(new Object[0], this, f47948c, false, 44849, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47948c, false, 44849, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.clear();
        }
    }

    public abstract int i();

    public abstract void k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        g();
    }

    @NotNull
    public final DmtStatusView.a h() {
        if (PatchProxy.isSupport(new Object[0], this, f47948c, false, 44838, new Class[0], DmtStatusView.a.class)) {
            return (DmtStatusView.a) PatchProxy.accessDispatch(new Object[0], this, f47948c, false, 44838, new Class[0], DmtStatusView.a.class);
        }
        DmtStatusView.a aVar = this.f47951f;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStatusViewBuilder");
        }
        return aVar;
    }

    public final boolean j() {
        if (PatchProxy.isSupport(new Object[0], this, f47948c, false, 44847, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f47948c, false, 44847, new Class[0], Boolean.TYPE)).booleanValue();
        }
        IAccountUserService a2 = d.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
        return TextUtils.equals(this.f47949d, a2.getCurUserId());
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f47948c, false, 44840, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f47948c, false, 44840, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (PatchProxy.isSupport(new Object[0], this, f47948c, false, 44842, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47948c, false, 44842, new Class[0], Void.TYPE);
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f47949d = arguments.getString("uid");
        }
        this.f47950e = b.a.a();
    }

    public final void a(@NotNull DmtStatusView dmtStatusView) {
        if (PatchProxy.isSupport(new Object[]{dmtStatusView}, this, f47948c, false, 44843, new Class[]{DmtStatusView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dmtStatusView}, this, f47948c, false, 44843, new Class[]{DmtStatusView.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(dmtStatusView, "statusView");
        DmtStatusView.a b2 = DmtStatusView.a.a(getContext()).b(e.a(getContext(), new b(this)));
        Intrinsics.checkExpressionValueIsNotNull(b2, "DmtStatusView.Builder.cr…orViewStatus(errorStatus)");
        this.f47951f = b2;
        if (com.ss.android.g.a.a()) {
            MtEmptyView a2 = MtEmptyView.a(getContext());
            Context context = getContext();
            if (context == null) {
                Intrinsics.throwNpe();
            }
            a2.setStatus(new c.a(context).a(l()).b(n()).c(m()).f20493a);
            DmtStatusView.a aVar = this.f47951f;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStatusViewBuilder");
            }
            aVar.b((View) a2);
        } else {
            Context context2 = getContext();
            if (context2 == null) {
                Intrinsics.throwNpe();
            }
            c cVar = new c.a(context2).a(2130840145).b(n()).c(m()).f20493a;
            DmtStatusView.a aVar2 = this.f47951f;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStatusViewBuilder");
            }
            aVar2.a(cVar);
        }
        DmtStatusView.a aVar3 = this.f47951f;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStatusViewBuilder");
        }
        dmtStatusView.setBuilder(aVar3);
    }

    public final void a(@NotNull DmtStatusView dmtStatusView, @NotNull Exception exc) {
        int i;
        c cVar;
        int i2;
        if (PatchProxy.isSupport(new Object[]{dmtStatusView, exc}, this, f47948c, false, 44844, new Class[]{DmtStatusView.class, Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dmtStatusView, exc}, this, f47948c, false, 44844, new Class[]{DmtStatusView.class, Exception.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(dmtStatusView, "statusView");
        Intrinsics.checkParameterIsNotNull(exc, "e");
        if (!j() && getContext() != null) {
            if (PatchProxy.isSupport(new Object[]{exc}, this, f47948c, false, 44845, new Class[]{Exception.class}, Integer.TYPE)) {
                i = ((Integer) PatchProxy.accessDispatch(new Object[]{exc}, this, f47948c, false, 44845, new Class[]{Exception.class}, Integer.TYPE)).intValue();
            } else {
                if (exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                    User user = this.f47950e;
                    if (user != null) {
                        com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) exc;
                        if (aVar.getErrorCode() == 2077 && user.isBlock) {
                            i = C0906R.string.nz;
                        } else if (aVar.getErrorCode() == 2078 && user.isBlocked()) {
                            i = C0906R.string.b3j;
                        }
                    }
                }
                i = 0;
            }
            int i3 = i;
            if (i3 != 0) {
                dmtStatusView.b();
                DmtStatusView.a aVar2 = this.f47951f;
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mStatusViewBuilder");
                }
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i3)}, this, f47948c, false, 44846, new Class[]{Integer.TYPE}, c.class)) {
                    cVar = (c) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3)}, this, f47948c, false, 44846, new Class[]{Integer.TYPE}, c.class);
                } else {
                    Context context = getContext();
                    if (context == null) {
                        Intrinsics.throwNpe();
                    }
                    c.a aVar3 = new c.a(context);
                    if (com.ss.android.g.a.a()) {
                        i2 = 2130839714;
                    } else {
                        i2 = 2130840130;
                    }
                    cVar = aVar3.a(i2).b((int) C0906R.string.nl).c(i3).f20493a;
                    Intrinsics.checkExpressionValueIsNotNull(cVar, "DmtDefaultStatus.Builder…desc(errorTextId).build()");
                }
                aVar2.b(cVar);
                DmtStatusView.a aVar4 = this.f47951f;
                if (aVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mStatusViewBuilder");
                }
                dmtStatusView.setBuilder(aVar4);
            }
        }
    }

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f47948c, false, 44841, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f47948c, false, 44841, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return layoutInflater2.inflate(i(), viewGroup2, false);
    }
}
