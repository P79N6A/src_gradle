package com.ss.android.ugc.aweme.commercialize.profile;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.ss.android.ugc.aweme.music.util.ProfileListFragment;
import com.ss.android.ugc.aweme.music.util.f;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.dr;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J&\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u000fH\u0016J\b\u0010\u001a\u001a\u00020\u000fH\u0016J\b\u0010\u001b\u001a\u00020\u000fH\u0016J\u001a\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001e\u001a\u00020\u000fH\u0016J\b\u0010\u001f\u001a\u00020\u000fH\u0016J\u001c\u0010 \u001a\u00020\u000f2\b\u0010!\u001a\u0004\u0018\u00010\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020%H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006&"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/profile/EnterpriseTabFragment;", "Lcom/ss/android/ugc/aweme/music/util/ProfileListFragment;", "()V", "adapter", "Lcom/ss/android/ugc/aweme/commercialize/profile/EnterpriseTabAdapter;", "curUid", "", "isMyFragment", "", "()Z", "setMyFragment", "(Z)V", "getScrollableView", "Landroid/view/View;", "handlePageChanged", "", "isEmpty", "needRefresh", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onPause", "onResume", "onViewCreated", "view", "scrollToFirstItem", "setLazyData", "setUserId", "userId", "secUserId", "top", "event", "Lcom/ss/android/ugc/aweme/fe/method/BroadcastMethod$JsBroadCastEvent;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class EnterpriseTabFragment extends ProfileListFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2926a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2927b;

    /* renamed from: c  reason: collision with root package name */
    private EnterpriseTabAdapter f2928c;

    /* renamed from: d  reason: collision with root package name */
    private String f2929d;

    /* renamed from: e  reason: collision with root package name */
    private HashMap f2930e;

    private View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.id.ccc)}, this, f2926a, false, 31947, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.id.ccc)}, this, f2926a, false, 31947, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.f2930e == null) {
            this.f2930e = new HashMap();
        }
        View view = (View) this.f2930e.get(Integer.valueOf(C0906R.id.ccc));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(C0906R.id.ccc);
            this.f2930e.put(Integer.valueOf(C0906R.id.ccc), view);
        }
        return view;
    }

    public final boolean j() {
        return true;
    }

    public final void l() {
    }

    public final void J_() {
        if (PatchProxy.isSupport(new Object[0], this, f2926a, false, 31941, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2926a, false, 31941, new Class[0], Void.TYPE);
            return;
        }
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) a(C0906R.id.ccc);
        if (enterpriseRecyclerView != null) {
            RecyclerView.LayoutManager layoutManager = enterpriseRecyclerView.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.scrollToPosition(0);
            }
        }
    }

    @Nullable
    public final View f() {
        if (!PatchProxy.isSupport(new Object[0], this, f2926a, false, 31938, new Class[0], View.class)) {
            return (EnterpriseRecyclerView) a(C0906R.id.ccc);
        }
        return (View) PatchProxy.accessDispatch(new Object[0], this, f2926a, false, 31938, new Class[0], View.class);
    }

    public final boolean k() {
        if (PatchProxy.isSupport(new Object[0], this, f2926a, false, 31942, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2926a, false, 31942, new Class[0], Boolean.TYPE)).booleanValue();
        }
        EnterpriseTabAdapter enterpriseTabAdapter = this.f2928c;
        if (enterpriseTabAdapter == null || enterpriseTabAdapter.getItemCount() == 0) {
            return true;
        }
        return false;
    }

    public final void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f2926a, false, 31944, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2926a, false, 31944, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) a(C0906R.id.ccc);
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
        if (PatchProxy.isSupport(new Object[0], this, f2926a, false, 31943, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2926a, false, 31943, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) a(C0906R.id.ccc);
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

    public final void H_() {
        if (PatchProxy.isSupport(new Object[0], this, f2926a, false, 31939, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2926a, false, 31939, new Class[0], Void.TYPE);
            return;
        }
        SharePrefCache inst = SharePrefCache.inst();
        Intrinsics.checkExpressionValueIsNotNull(inst, "SharePrefCache.inst()");
        an<String> mpTab = inst.getMpTab();
        Intrinsics.checkExpressionValueIsNotNull(mpTab, "SharePrefCache.inst().mpTab");
        Object c2 = mpTab.c();
        Intrinsics.checkExpressionValueIsNotNull(c2, "SharePrefCache.inst().mpTab.cache");
        f.a a2 = f.a((String) c2);
        String a3 = dr.a().a(this.f2929d);
        String str = this.f2929d;
        if (str == null) {
            Intrinsics.throwNpe();
        }
        a2.a("mp_user_id", str);
        if (!TextUtils.isEmpty(a3)) {
            if (a3 == null) {
                Intrinsics.throwNpe();
            }
            a2.a("mp_sec_uid", a3);
        }
        String uri = a2.a().toString();
        Intrinsics.checkExpressionValueIsNotNull(uri, "urlBuilder.build().toString()");
        EnterpriseTabAdapter enterpriseTabAdapter = this.f2928c;
        if (enterpriseTabAdapter != null) {
            enterpriseTabAdapter.a(uri);
        }
        EnterpriseTabAdapter enterpriseTabAdapter2 = this.f2928c;
        if (enterpriseTabAdapter2 != null) {
            enterpriseTabAdapter2.notifyDataSetChanged();
        }
    }

    public final void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f2926a, false, 31945, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2926a, false, 31945, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) a(C0906R.id.ccc);
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
        if (PatchProxy.isSupport(new Object[0], this, f2926a, false, 31948, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2926a, false, 31948, new Class[0], Void.TYPE);
            return;
        }
        if (this.f2930e != null) {
            this.f2930e.clear();
        }
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
            com.meituan.robust.ChangeQuickRedirect r2 = f2926a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.fe.method.BroadcastMethod$a> r1 = com.ss.android.ugc.aweme.fe.method.BroadcastMethod.a.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 31946(0x7cca, float:4.4766E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0030
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f2926a
            r3 = 0
            r4 = 31946(0x7cca, float:4.4766E-41)
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
            com.ss.android.ugc.aweme.commercialize.profile.EnterpriseTabAdapter r3 = r9.f2928c
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
            android.view.View r0 = r9.a(r3)
            com.ss.android.ugc.aweme.commercialize.profile.EnterpriseRecyclerView r0 = (com.ss.android.ugc.aweme.commercialize.profile.EnterpriseRecyclerView) r0
            com.ss.android.ugc.aweme.commercialize.profile.a r0 = r0.getEnterTabManager()
            r0.f39418a = r8
            goto L_0x00fd
        L_0x00e8:
            java.lang.String r1 = "mp_tab_top_arrived"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00fd
            android.view.View r0 = r9.a(r3)
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.profile.EnterpriseTabFragment.top(com.ss.android.ugc.aweme.fe.method.BroadcastMethod$a):void");
    }

    public final void a(@Nullable String str, @Nullable String str2) {
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3, str2}, this, f2926a, false, 31940, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str2}, this, f2926a, false, 31940, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        super.a(str, str2);
        this.f2929d = str3;
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f2926a, false, 31937, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f2926a, false, 31937, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) a(C0906R.id.ccc);
        Intrinsics.checkExpressionValueIsNotNull(enterpriseRecyclerView, "recycler_view");
        enterpriseRecyclerView.setLayoutManager(new EnterpriseTabFragment$onViewCreated$1(this, getActivity(), 0, false));
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(activity, "activity!!");
        this.f2928c = new EnterpriseTabAdapter(activity, null, this.f2927b);
        EnterpriseRecyclerView enterpriseRecyclerView2 = (EnterpriseRecyclerView) a(C0906R.id.ccc);
        Intrinsics.checkExpressionValueIsNotNull(enterpriseRecyclerView2, "recycler_view");
        enterpriseRecyclerView2.setAdapter(this.f2928c);
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup, bundle}, this, f2926a, false, 31936, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup, bundle}, this, f2926a, false, 31936, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
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
