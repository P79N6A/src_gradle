package com.ss.android.ugc.aweme.profile.viewmodel;

import android.app.Activity;
import android.arch.lifecycle.ViewModel;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.bytedance.sdk.account.api.a.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.c;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.message.c.b;
import com.ss.android.ugc.aweme.utils.ad;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/profile/viewmodel/MultiAccountViewModel;", "Landroid/arch/lifecycle/ViewModel;", "()V", "dropDownList", "", "Lcom/ss/android/ugc/aweme/user/SignificantUserInfo;", "loggedInAccounts", "loggedInAccountsExceptSelf", "switchAccount", "", "uid", "", "bundle", "Landroid/os/Bundle;", "callback", "Lcom/bytedance/sdk/account/api/callback/SwitchAuthCallback;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class MultiAccountViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63174a;

    /* renamed from: b  reason: collision with root package name */
    public static int f63175b;

    /* renamed from: c  reason: collision with root package name */
    public static long f63176c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f63177d = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\u0012\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u0012H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/profile/viewmodel/MultiAccountViewModel$Companion;", "", "()V", "LAST_UPLOAD_ACCOUNT_NUM_TIME_DEFAULT", "", "MAX_ACCOUNT_COUNT", "", "UID_ADD", "", "lastUploadAccountNum", "lastUploadAccountNumTime", "addAccount", "", "activity", "Landroid/support/v4/app/FragmentActivity;", "enterFrom", "enterMethod", "backgroundAccountHasMessage", "", "uploadAccountNum", "force", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63178a;

        private a() {
        }

        @JvmStatic
        public final boolean a() {
            int i;
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], this, f63178a, false, 70085, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63178a, false, 70085, new Class[0], Boolean.TYPE)).booleanValue();
            }
            IAccountUserService a2 = d.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
            String curUserId = a2.getCurUserId();
            List allUidList = d.a().allUidList();
            Intrinsics.checkExpressionValueIsNotNull(allUidList, "AccountUserProxyService.get().allUidList()");
            Iterable<String> iterable = allUidList;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (String str : iterable) {
                if (Intrinsics.areEqual((Object) curUserId, (Object) str)) {
                    i = 0;
                } else {
                    i = b.a().a(str);
                }
                arrayList.add(Integer.valueOf(i));
            }
            if (CollectionsKt.sumOfInt((List) arrayList) > 0) {
                z = true;
            }
            return z;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0095, code lost:
            if (com.ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.f63175b != com.ss.android.ugc.aweme.account.d.a().allUidList().size()) goto L_0x0097;
         */
        @kotlin.jvm.JvmStatic
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(boolean r17) {
            /*
                r16 = this;
                r0 = 1
                java.lang.Object[] r1 = new java.lang.Object[r0]
                java.lang.Byte r2 = java.lang.Byte.valueOf(r17)
                r8 = 0
                r1[r8] = r2
                com.meituan.robust.ChangeQuickRedirect r3 = f63178a
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r2 = java.lang.Boolean.TYPE
                r6[r8] = r2
                java.lang.Class r7 = java.lang.Void.TYPE
                r4 = 0
                r5 = 70086(0x111c6, float:9.8211E-41)
                r2 = r16
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x003c
                java.lang.Object[] r9 = new java.lang.Object[r0]
                java.lang.Byte r1 = java.lang.Byte.valueOf(r17)
                r9[r8] = r1
                com.meituan.robust.ChangeQuickRedirect r11 = f63178a
                r12 = 0
                r13 = 70086(0x111c6, float:9.8211E-41)
                java.lang.Class[] r14 = new java.lang.Class[r0]
                java.lang.Class r0 = java.lang.Boolean.TYPE
                r14[r8] = r0
                java.lang.Class r15 = java.lang.Void.TYPE
                r10 = r16
                com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
                return
            L_0x003c:
                com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
                java.lang.String r1 = "AbTestManager.getInstance()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                boolean r0 = r0.al()
                if (r0 != 0) goto L_0x004c
                return
            L_0x004c:
                long r0 = com.ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.f63176c
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L_0x006e
                com.ss.android.ugc.aweme.app.k r0 = com.ss.android.ugc.aweme.app.k.a()
                android.content.Context r0 = (android.content.Context) r0
                java.lang.Class<com.ss.android.ugc.aweme.profile.n> r1 = com.ss.android.ugc.aweme.profile.n.class
                java.lang.Object r0 = com.ss.android.ugc.aweme.base.sharedpref.c.a(r0, r1)
                com.ss.android.ugc.aweme.profile.n r0 = (com.ss.android.ugc.aweme.profile.n) r0
                int r1 = r0.b((int) r8)
                com.ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.f63175b = r1
                long r0 = r0.b((long) r2)
                com.ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.f63176c = r0
            L_0x006e:
                if (r17 != 0) goto L_0x0097
                com.ss.android.ugc.aweme.IAccountUserService r0 = com.ss.android.ugc.aweme.account.d.a()
                java.lang.String r1 = "AccountUserProxyService.get()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                boolean r0 = r0.isLogin()
                if (r0 == 0) goto L_0x00e8
                long r0 = com.ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.f63176c
                boolean r0 = com.ss.android.ugc.aweme.utils.aw.a(r0)
                if (r0 == 0) goto L_0x0097
                int r0 = com.ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.f63175b
                com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.d.a()
                java.util.List r1 = r1.allUidList()
                int r1 = r1.size()
                if (r0 == r1) goto L_0x00e8
            L_0x0097:
                com.ss.android.ugc.aweme.IAccountUserService r0 = com.ss.android.ugc.aweme.account.d.a()
                java.util.List r0 = r0.allUidList()
                int r0 = r0.size()
                com.ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.f63175b = r0
                java.util.Calendar r0 = java.util.Calendar.getInstance()
                java.lang.String r1 = "Calendar.getInstance()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                java.util.Date r0 = r0.getTime()
                java.lang.String r1 = "Calendar.getInstance().time"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                long r0 = r0.getTime()
                com.ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.f63176c = r0
                com.ss.android.ugc.aweme.app.k r0 = com.ss.android.ugc.aweme.app.k.a()
                android.content.Context r0 = (android.content.Context) r0
                java.lang.Class<com.ss.android.ugc.aweme.profile.n> r1 = com.ss.android.ugc.aweme.profile.n.class
                java.lang.Object r0 = com.ss.android.ugc.aweme.base.sharedpref.c.a(r0, r1)
                com.ss.android.ugc.aweme.profile.n r0 = (com.ss.android.ugc.aweme.profile.n) r0
                int r1 = com.ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.f63175b
                r0.a((int) r1)
                long r1 = com.ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.f63176c
                r0.a((long) r1)
                java.lang.String r0 = "multi_account_status"
                com.ss.android.ugc.aweme.app.d.d r1 = com.ss.android.ugc.aweme.app.d.d.a()
                java.lang.String r2 = "account_num"
                int r3 = com.ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.f63175b
                com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (int) r3)
                java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
                com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
            L_0x00e8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.a.a(boolean):void");
        }

        @JvmStatic
        public final void a(@Nullable FragmentActivity fragmentActivity, @NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{fragmentActivity, str3, str4}, this, f63178a, false, 70084, new Class[]{FragmentActivity.class, String.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fragmentActivity, str3, str4}, this, f63178a, false, 70084, new Class[]{FragmentActivity.class, String.class, String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str3, "enterFrom");
            Intrinsics.checkParameterIsNotNull(str4, "enterMethod");
            ad a2 = ad.a();
            IAccountUserService a3 = d.a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "AccountUserProxyService.get()");
            e.a((Activity) fragmentActivity, str3, str4, a2.a("previous_uid", a3.getCurUserId()).a("force_use_default_login_method", true).a("is_multi_account", true).a("need_auto_fill_latest_login_info", false).f75487b);
        }
    }

    @JvmStatic
    public static final void a(@Nullable FragmentActivity fragmentActivity, @NotNull String str, @NotNull String str2) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity2, str3, str4}, null, f63174a, true, 70080, new Class[]{FragmentActivity.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity2, str3, str4}, null, f63174a, true, 70080, new Class[]{FragmentActivity.class, String.class, String.class}, Void.TYPE);
            return;
        }
        f63177d.a(fragmentActivity2, str3, str4);
    }

    @JvmStatic
    public static final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, f63174a, true, 70082, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, f63174a, true, 70082, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        f63177d.a(z);
    }

    @NotNull
    private List<com.ss.android.ugc.aweme.user.a> b() {
        if (PatchProxy.isSupport(new Object[0], this, f63174a, false, 70075, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f63174a, false, 70075, new Class[0], List.class);
        }
        List<String> allUidList = d.a().allUidList();
        Intrinsics.checkExpressionValueIsNotNull(allUidList, "AccountUserProxyService.get().allUidList()");
        Collection arrayList = new ArrayList();
        for (String findSignificanUserInfo : allUidList) {
            com.ss.android.ugc.aweme.user.a findSignificanUserInfo2 = d.a().findSignificanUserInfo(findSignificanUserInfo);
            if (findSignificanUserInfo2 != null) {
                arrayList.add(findSignificanUserInfo2);
            }
        }
        return (List) arrayList;
    }

    @NotNull
    private List<com.ss.android.ugc.aweme.user.a> c() {
        if (PatchProxy.isSupport(new Object[0], this, f63174a, false, 70076, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f63174a, false, 70076, new Class[0], List.class);
        }
        Collection arrayList = new ArrayList();
        for (Object next : b()) {
            String str = ((com.ss.android.ugc.aweme.user.a) next).f75289b;
            IAccountUserService a2 = d.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
            if (!Intrinsics.areEqual((Object) str, (Object) a2.getCurUserId())) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0044, code lost:
        if (r1.size() < 3) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0055, code lost:
        if (r1.size() < 2) goto L_0x0059;
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.ss.android.ugc.aweme.user.a> a() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f63174a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r4 = 0
            r5 = 70077(0x111bd, float:9.8199E-41)
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f63174a
            r5 = 0
            r6 = 70077(0x111bd, float:9.8199E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.util.List> r8 = java.util.List.class
            r3 = r11
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x0028:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r1 = (java.util.List) r1
            boolean r2 = com.ss.android.g.a.b()
            r3 = 1
            if (r2 == 0) goto L_0x0047
            java.util.List r2 = r11.b()
            java.util.Collection r2 = (java.util.Collection) r2
            r1.addAll(r2)
            int r2 = r1.size()
            r4 = 3
            if (r2 >= r4) goto L_0x0058
            goto L_0x0059
        L_0x0047:
            java.util.List r2 = r11.c()
            java.util.Collection r2 = (java.util.Collection) r2
            r1.addAll(r2)
            int r2 = r1.size()
            r4 = 2
            if (r2 >= r4) goto L_0x0058
            goto L_0x0059
        L_0x0058:
            r3 = 0
        L_0x0059:
            if (r3 == 0) goto L_0x006c
            com.ss.android.ugc.aweme.user.a r0 = new com.ss.android.ugc.aweme.user.a
            java.lang.String r5 = "-1"
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 30
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r1.add(r0)
        L_0x006c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.a():java.util.List");
    }

    public final void a(@NotNull String str, @Nullable Bundle bundle, @Nullable f fVar) {
        String str2 = str;
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{str2, null, fVar2}, this, f63174a, false, 70078, new Class[]{String.class, Bundle.class, f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, null, fVar2}, this, f63174a, false, 70078, new Class[]{String.class, Bundle.class, f.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "uid");
        c.b().switchAccount(str2, null, fVar2);
    }
}
