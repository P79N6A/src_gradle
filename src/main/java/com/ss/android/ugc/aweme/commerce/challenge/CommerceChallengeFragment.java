package com.ss.android.ugc.aweme.commerce.challenge;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.commercialize.profile.EnterpriseRecyclerView;
import com.ss.android.ugc.aweme.commercialize.profile.EnterpriseTabAdapter;
import com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.ss.android.ugc.aweme.fragment.AbstractBaseDetailFragment;
import com.ss.android.ugc.aweme.music.util.f;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0013H\u0016J\b\u0010\u001a\u001a\u00020\tH\u0016J&\u0010\u001b\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u0013H\u0016J\u0010\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%H\u0007J\b\u0010&\u001a\u00020\u0013H\u0016J\b\u0010'\u001a\u00020\u0013H\u0016J\u001a\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00182\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010*\u001a\u00020\u0013H\u0017J\b\u0010+\u001a\u00020\u0013H\u0016J\u0006\u0010,\u001a\u00020\u0013J\u0012\u0010-\u001a\u00020\u00132\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0010\u00100\u001a\u00020\u00132\u0006\u00101\u001a\u00020%H\u0007J\u0012\u00102\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u00103\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u0007J\u0010\u00104\u001a\u00020\u00132\b\u0010\r\u001a\u0004\u0018\u00010\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00078FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u00065"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/challenge/CommerceChallengeFragment;", "Lcom/ss/android/ugc/aweme/base/fragment/AmeBaseFragment;", "Lcom/ss/android/ugc/aweme/fragment/AbstractBaseDetailFragment$DetailFragmentScrollableContainer;", "()V", "adapter", "Lcom/ss/android/ugc/aweme/commercialize/profile/EnterpriseTabAdapter;", "challengeId", "", "firstRefresh", "", "rnRect", "Landroid/graphics/Rect;", "schema", "title", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "brandLeft", "", "brandSelect", "getReactView", "Lcom/ss/android/ugc/aweme/crossplatform/view/CrossPlatformWebView;", "getScrollableView", "Landroid/view/View;", "handlePageChanged", "isFirstLoad", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onJsBroadcast", "broadCastEvent", "Lcom/ss/android/ugc/aweme/fe/method/BroadcastMethod$JsBroadCastEvent;", "onPause", "onResume", "onViewCreated", "view", "refresh", "scrollToFirstItem", "sendVisibleRnHeight", "setOnDetailAwemeListLoadListener", "detailAwemeListLoadListener", "Lcom/ss/android/ugc/aweme/fragment/OnDetailAwemeListLoadListener;", "top", "event", "updateChallengeId", "updateSchema", "updateTitle", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class CommerceChallengeFragment extends AmeBaseFragment implements AbstractBaseDetailFragment.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2867a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public String f2868b;

    /* renamed from: c  reason: collision with root package name */
    public String f2869c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f2870d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    private boolean f2871e = true;

    /* renamed from: f  reason: collision with root package name */
    private String f2872f;
    private EnterpriseTabAdapter g;
    private HashMap h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36840a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommerceChallengeFragment f36841b;

        public a(CommerceChallengeFragment commerceChallengeFragment) {
            this.f36841b = commerceChallengeFragment;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f36840a, false, 28056, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f36840a, false, 28056, new Class[0], Void.TYPE);
                return;
            }
            this.f36841b.d();
        }
    }

    private View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.id.ccc)}, this, f2867a, false, 28052, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.id.ccc)}, this, f2867a, false, 28052, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.h == null) {
            this.h = new HashMap();
        }
        View view = (View) this.h.get(Integer.valueOf(C0906R.id.ccc));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(C0906R.id.ccc);
            this.h.put(Integer.valueOf(C0906R.id.ccc), view);
        }
        return view;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2867a, false, 28054, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2867a, false, 28054, new Class[]{Boolean.TYPE}, Void.TYPE);
        }
    }

    public final void g() {
    }

    public final boolean c() {
        return this.f2871e;
    }

    @Nullable
    public final CrossPlatformWebView b() {
        EnterpriseTabAdapter enterpriseTabAdapter = this.g;
        if (enterpriseTabAdapter != null) {
            return enterpriseTabAdapter.f39413b;
        }
        return null;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f2867a, false, 28046, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2867a, false, 28046, new Class[0], Void.TYPE);
            return;
        }
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) a((int) C0906R.id.ccc);
        if (enterpriseRecyclerView != null) {
            RecyclerView.LayoutManager layoutManager = enterpriseRecyclerView.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.scrollToPosition(0);
            }
        }
    }

    @NotNull
    public final View f() {
        if (PatchProxy.isSupport(new Object[0], this, f2867a, false, 28045, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f2867a, false, 28045, new Class[0], View.class);
        }
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) a((int) C0906R.id.ccc);
        Intrinsics.checkExpressionValueIsNotNull(enterpriseRecyclerView, "recycler_view");
        return enterpriseRecyclerView;
    }

    public final void d() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f2867a, false, 28042, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2867a, false, 28042, new Class[0], Void.TYPE);
            return;
        }
        CrossPlatformWebView b2 = b();
        if (b2 != null && b2.getGlobalVisibleRect(this.f2870d)) {
            CrossPlatformWebView b3 = b();
            if (b3 != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("height", u.b((double) this.f2870d.height()));
                CrossPlatformWebView b4 = b();
                if (b4 != null) {
                    str = b4.getReactId();
                } else {
                    str = null;
                }
                b3.a("brand_room_show", jSONObject, str);
            }
        }
    }

    @SuppressLint({"notifyDataSetChanged"})
    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f2867a, false, 28039, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2867a, false, 28039, new Class[0], Void.TYPE);
            return;
        }
        this.f2871e = false;
        String str = this.f2869c;
        if (str != null) {
            f.a a2 = f.a(str);
            String str2 = this.f2872f;
            if (str2 == null) {
                str2 = "";
            }
            String uri = a2.a("challenge_id", str2).a().toString();
            Intrinsics.checkExpressionValueIsNotNull(uri, "SchemeHelper.parseRnSche…      .build().toString()");
            EnterpriseTabAdapter enterpriseTabAdapter = this.g;
            if (enterpriseTabAdapter != null) {
                enterpriseTabAdapter.a(uri);
            }
            EnterpriseTabAdapter enterpriseTabAdapter2 = this.g;
            if (enterpriseTabAdapter2 != null) {
                enterpriseTabAdapter2.notifyDataSetChanged();
            }
        }
    }

    public final void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f2867a, false, 28048, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2867a, false, 28048, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) a((int) C0906R.id.ccc);
        if (enterpriseRecyclerView != null) {
            RecyclerView.LayoutManager layoutManager = enterpriseRecyclerView.getLayoutManager();
            if (layoutManager != null) {
                View findViewByPosition = layoutManager.findViewByPosition(0);
                if (findViewByPosition != null) {
                    if (findViewByPosition != null) {
                        CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) findViewByPosition;
                        FragmentActivity activity = getActivity();
                        if (activity == null) {
                            Intrinsics.throwNpe();
                        }
                        Intrinsics.checkExpressionValueIsNotNull(activity, "activity!!");
                        crossPlatformWebView.c((Activity) activity);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView");
                }
            }
        }
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f2867a, false, 28047, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2867a, false, 28047, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) a((int) C0906R.id.ccc);
        if (enterpriseRecyclerView != null) {
            RecyclerView.LayoutManager layoutManager = enterpriseRecyclerView.getLayoutManager();
            if (layoutManager != null) {
                View findViewByPosition = layoutManager.findViewByPosition(0);
                if (findViewByPosition != null) {
                    if (findViewByPosition != null) {
                        CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) findViewByPosition;
                        FragmentActivity activity = getActivity();
                        if (activity == null) {
                            Intrinsics.throwNpe();
                        }
                        Intrinsics.checkExpressionValueIsNotNull(activity, "activity!!");
                        crossPlatformWebView.b((Activity) activity);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView");
                }
            }
        }
    }

    public final void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f2867a, false, 28049, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2867a, false, 28049, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) a((int) C0906R.id.ccc);
        if (enterpriseRecyclerView != null) {
            RecyclerView.LayoutManager layoutManager = enterpriseRecyclerView.getLayoutManager();
            if (layoutManager != null) {
                View findViewByPosition = layoutManager.findViewByPosition(0);
                if (findViewByPosition != null) {
                    if (findViewByPosition != null) {
                        CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) findViewByPosition;
                        FragmentActivity activity = getActivity();
                        if (activity == null) {
                            Intrinsics.throwNpe();
                        }
                        Intrinsics.checkExpressionValueIsNotNull(activity, "activity!!");
                        crossPlatformWebView.d((Activity) activity);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView");
                    }
                }
            }
        }
        bg.d(this);
        if (PatchProxy.isSupport(new Object[0], this, f2867a, false, 28053, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2867a, false, 28053, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.clear();
        }
    }

    public final void a(@Nullable String str) {
        this.f2872f = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006e, code lost:
        if (r1.getGlobalVisibleRect(r9.f2870d) == true) goto L_0x0072;
     */
    @org.greenrobot.eventbus.Subscribe(a = org.greenrobot.eventbus.ThreadMode.MAIN)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onJsBroadcast(@org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.fe.method.BroadcastMethod.a r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f2867a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.fe.method.BroadcastMethod$a> r1 = com.ss.android.ugc.aweme.fe.method.BroadcastMethod.a.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 28051(0x6d93, float:3.9308E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0030
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f2867a
            r3 = 0
            r4 = 28051(0x6d93, float:3.9308E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.fe.method.BroadcastMethod$a> r1 = com.ss.android.ugc.aweme.fe.method.BroadcastMethod.a.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0030:
            java.lang.String r0 = "broadCastEvent"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
            org.json.JSONObject r0 = r10.f44432b
            java.lang.String r1 = "eventName"
            java.lang.String r0 = r0.getString(r1)
            if (r0 == 0) goto L_0x00a4
            java.lang.String r1 = "brand_room_loaded"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            r2 = 0
            if (r1 == 0) goto L_0x0071
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r1 = r9.b()
            if (r1 == 0) goto L_0x0053
            java.lang.String r1 = r1.getReactId()
            goto L_0x0054
        L_0x0053:
            r1 = r2
        L_0x0054:
            org.json.JSONObject r3 = r10.f44432b
            java.lang.String r4 = "reactId"
            java.lang.String r3 = r3.getString(r4)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 == 0) goto L_0x0071
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r1 = r9.b()
            if (r1 == 0) goto L_0x0071
            android.graphics.Rect r3 = r9.f2870d
            boolean r1 = r1.getGlobalVisibleRect(r3)
            if (r1 != r7) goto L_0x0071
            goto L_0x0072
        L_0x0071:
            r7 = 0
        L_0x0072:
            if (r7 == 0) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r0 = r2
        L_0x0076:
            if (r0 == 0) goto L_0x00a4
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r9.b()
            if (r0 == 0) goto L_0x00a3
            java.lang.String r1 = "brand_room_show"
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "height"
            android.graphics.Rect r5 = r9.f2870d
            int r5 = r5.height()
            double r5 = (double) r5
            int r5 = com.ss.android.ugc.aweme.base.utils.u.b((double) r5)
            r3.put(r4, r5)
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r4 = r9.b()
            if (r4 == 0) goto L_0x009f
            java.lang.String r2 = r4.getReactId()
        L_0x009f:
            r0.a((java.lang.String) r1, (org.json.JSONObject) r3, (java.lang.String) r2)
            goto L_0x00a4
        L_0x00a3:
            return
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.challenge.CommerceChallengeFragment.onJsBroadcast(com.ss.android.ugc.aweme.fe.method.BroadcastMethod$a):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ff A[RETURN] */
    @org.greenrobot.eventbus.Subscribe(a = org.greenrobot.eventbus.ThreadMode.MAIN)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void top(@org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.fe.method.BroadcastMethod.a r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f2867a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.fe.method.BroadcastMethod$a> r1 = com.ss.android.ugc.aweme.fe.method.BroadcastMethod.a.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 28050(0x6d92, float:3.9306E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0030
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f2867a
            r3 = 0
            r4 = 28050(0x6d92, float:3.9306E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.fe.method.BroadcastMethod$a> r1 = com.ss.android.ugc.aweme.fe.method.BroadcastMethod.a.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0030:
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
            com.google.gson.JsonParser r0 = new com.google.gson.JsonParser
            r0.<init>()
            org.json.JSONObject r1 = r10.f44432b
            java.lang.String r1 = r1.toString()
            com.google.gson.JsonElement r0 = r0.parse((java.lang.String) r1)
            java.lang.String r1 = "JsonParser().parse(event.params.toString())"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.google.gson.JsonObject r0 = r0.getAsJsonObject()
            java.lang.String r1 = "data"
            com.google.gson.JsonElement r1 = r0.get(r1)
            r2 = 0
            if (r1 == 0) goto L_0x0087
            boolean r3 = r1.isJsonNull()
            if (r3 == 0) goto L_0x005d
            goto L_0x0087
        L_0x005d:
            com.google.gson.JsonObject r1 = r1.getAsJsonObject()
            java.lang.String r3 = "reactId"
            com.google.gson.JsonElement r1 = r1.get(r3)
            if (r1 == 0) goto L_0x0087
            boolean r3 = r1.isJsonNull()
            if (r3 == 0) goto L_0x0070
            goto L_0x0087
        L_0x0070:
            java.lang.String r1 = r1.getAsString()
            com.ss.android.ugc.aweme.commercialize.profile.EnterpriseTabAdapter r3 = r9.g
            if (r3 == 0) goto L_0x0081
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r3 = r3.f39413b
            if (r3 == 0) goto L_0x0081
            java.lang.String r3 = r3.getReactId()
            goto L_0x0082
        L_0x0081:
            r3 = r2
        L_0x0082:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            goto L_0x0088
        L_0x0087:
            r1 = 0
        L_0x0088:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r3 = r1.booleanValue()
            if (r3 == 0) goto L_0x0093
            goto L_0x0094
        L_0x0093:
            r1 = r2
        L_0x0094:
            if (r1 == 0) goto L_0x00ff
            r1.booleanValue()
            java.lang.String r1 = "eventName"
            com.google.gson.JsonElement r0 = r0.get(r1)
            if (r0 == 0) goto L_0x00fe
            java.lang.String r0 = r0.getAsString()
            if (r0 == 0) goto L_0x00fe
            java.lang.String r1 = "mp_tab_top_arrived"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r1 != 0) goto L_0x00ba
            java.lang.String r1 = "mp_tab_top_left"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r1 == 0) goto L_0x00b8
            goto L_0x00ba
        L_0x00b8:
            r1 = 0
            goto L_0x00bb
        L_0x00ba:
            r1 = 1
        L_0x00bb:
            if (r1 == 0) goto L_0x00be
            goto L_0x00bf
        L_0x00be:
            r0 = r2
        L_0x00bf:
            if (r0 == 0) goto L_0x00fe
            int r1 = r0.hashCode()
            r2 = -917484739(0xffffffffc9504b3d, float:-853171.8)
            r3 = 2131169408(0x7f071080, float:1.7953145E38)
            if (r1 == r2) goto L_0x00e8
            r2 = -853202121(0xffffffffcd252b37, float:-1.73192048E8)
            if (r1 == r2) goto L_0x00d3
            goto L_0x00fd
        L_0x00d3:
            java.lang.String r1 = "mp_tab_top_left"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00fd
            android.view.View r0 = r9.a((int) r3)
            com.ss.android.ugc.aweme.commercialize.profile.EnterpriseRecyclerView r0 = (com.ss.android.ugc.aweme.commercialize.profile.EnterpriseRecyclerView) r0
            com.ss.android.ugc.aweme.commercialize.profile.a r0 = r0.getEnterTabManager()
            r0.f39418a = r8
            goto L_0x00fd
        L_0x00e8:
            java.lang.String r1 = "mp_tab_top_arrived"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00fd
            android.view.View r0 = r9.a((int) r3)
            com.ss.android.ugc.aweme.commercialize.profile.EnterpriseRecyclerView r0 = (com.ss.android.ugc.aweme.commercialize.profile.EnterpriseRecyclerView) r0
            com.ss.android.ugc.aweme.commercialize.profile.a r0 = r0.getEnterTabManager()
            r0.f39418a = r7
            goto L_0x00fe
        L_0x00fd:
            return
        L_0x00fe:
            return
        L_0x00ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.challenge.CommerceChallengeFragment.top(com.ss.android.ugc.aweme.fe.method.BroadcastMethod$a):void");
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f2867a, false, 28044, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f2867a, false, 28044, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) a((int) C0906R.id.ccc);
        Intrinsics.checkExpressionValueIsNotNull(enterpriseRecyclerView, "recycler_view");
        enterpriseRecyclerView.setLayoutManager(new CommerceChallengeFragment$onViewCreated$1(this, getActivity(), 0, false));
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(activity, "activity!!");
        this.g = new EnterpriseTabAdapter(activity, null, false);
        EnterpriseRecyclerView enterpriseRecyclerView2 = (EnterpriseRecyclerView) a((int) C0906R.id.ccc);
        Intrinsics.checkExpressionValueIsNotNull(enterpriseRecyclerView2, "recycler_view");
        enterpriseRecyclerView2.setAdapter(this.g);
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup, bundle}, this, f2867a, false, 28043, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup, bundle}, this, f2867a, false, 28043, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
        bg.c(this);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        return LayoutInflater.from(activity).inflate(C0906R.layout.nn, null);
    }
}
