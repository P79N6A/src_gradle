package com.ss.android.ugc.aweme.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.report.b;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.share.cg;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000e\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0010\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u0011\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\b\u0010\u0012\u001a\u00020\u0004H\u0007¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/utils/AwemeHelper;", "", "()V", "canVideoBeDownloaded", "", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "canVideoBeShowDownloadCount", "checkPrivacySettings", "isDeletedAweme", "isDownloadProhibited", "isFriendVisibleAweme", "isImageAweme", "isLostViewPermissionDueToNotFriend", "isMyAweme", "isPrivateAweme", "isPublicAweme", "isSecretAuthor", "shouldRevealVideoDownloadBtn", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75964a;

    /* renamed from: b  reason: collision with root package name */
    public static final u f75965b = new u();

    private u() {
    }

    @JvmStatic
    public static final boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f75964a, true, 88007, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f75964a, true, 88007, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (ex.b()) {
            return false;
        }
        AbTestManager a2 = AbTestManager.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
        return a2.bz();
    }

    @JvmStatic
    public static final boolean f(@Nullable Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, null, f75964a, true, 88005, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme2}, null, f75964a, true, 88005, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme2 == null || aweme.getAuthor() == null || b.a(aweme) || !f75965b.i(aweme2) || (h(aweme) && !cg.a(aweme.getAuthorUid()))) {
            return false;
        } else {
            return true;
        }
    }

    @JvmStatic
    public static final boolean g(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f75964a, true, 88008, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f75964a, true, 88008, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || !aweme.isPreventDownload()) {
            return false;
        } else {
            return true;
        }
    }

    @JvmStatic
    private static boolean h(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f75964a, true, 88009, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f75964a, true, 88009, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getAuthor() == null) {
            return false;
        } else {
            if (cg.a(aweme.getAuthorUid())) {
                IAccountUserService a2 = d.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
                User curUser = a2.getCurUser();
                Intrinsics.checkExpressionValueIsNotNull(curUser, "AccountUserProxyService.get().curUser");
                return curUser.isSecret();
            }
            User author = aweme.getAuthor();
            Intrinsics.checkExpressionValueIsNotNull(author, "aweme.author");
            return author.isSecret();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(@org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.feed.model.Aweme r18) {
        /*
            r17 = this;
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r4 = f75964a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r5 = 0
            r6 = 87999(0x157bf, float:1.23313E-40)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003b
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r12 = f75964a
            r13 = 0
            r14 = 87999(0x157bf, float:1.23313E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x003b:
            r1 = 0
            if (r18 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.profile.model.User r0 = r18.getAuthor()
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = r0.getUid()
            goto L_0x004a
        L_0x0049:
            r0 = r1
        L_0x004a:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            com.ss.android.ugc.aweme.IAccountUserService r2 = com.ss.android.ugc.aweme.account.d.a()
            java.lang.String r3 = "AccountUserProxyService.get()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.getCurUser()
            if (r2 == 0) goto L_0x005f
            java.lang.String r1 = r2.getUid()
        L_0x005f:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.u.b(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    public final boolean c(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f75964a, false, 88000, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, this, f75964a, false, 88000, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        }
        if (aweme != null) {
            AwemeStatus status = aweme.getStatus();
            if (status == null || status.getPrivateStatus() != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean d(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f75964a, false, 88001, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, this, f75964a, false, 88001, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        }
        if (aweme != null) {
            AwemeStatus status = aweme.getStatus();
            if (status == null || status.getPrivateStatus() != 2) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean e(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f75964a, false, 88002, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, this, f75964a, false, 88002, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        }
        if (aweme != null) {
            AwemeStatus status = aweme.getStatus();
            if (status == null || status.getPrivateStatus() != 1) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006e, code lost:
        if (r0.isMe() != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0085, code lost:
        if (r0.isMe() != false) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean i(com.ss.android.ugc.aweme.feed.model.Aweme r18) {
        /*
            r17 = this;
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r4 = f75964a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r5 = 0
            r6 = 88010(0x157ca, float:1.23328E-40)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003b
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r12 = f75964a
            r13 = 0
            r14 = 88010(0x157ca, float:1.23328E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x003b:
            if (r18 == 0) goto L_0x0088
            com.ss.android.ugc.aweme.profile.model.User r2 = r18.getAuthor()
            if (r2 == 0) goto L_0x0088
            com.ss.android.ugc.aweme.profile.model.User r2 = r18.getAuthor()
            java.lang.String r3 = "user"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            int r2 = r2.getDownloadSetting()
            r3 = 3
            if (r2 == r3) goto L_0x0072
            switch(r2) {
                case 0: goto L_0x0070;
                case 1: goto L_0x0057;
                default: goto L_0x0056;
            }
        L_0x0056:
            goto L_0x0088
        L_0x0057:
            boolean r9 = com.ss.android.ugc.aweme.feed.am.c(r18)
            com.ss.android.ugc.aweme.profile.model.User r2 = r18.getAuthor()
            if (r2 == 0) goto L_0x0088
            com.ss.android.ugc.aweme.profile.model.User r0 = r18.getAuthor()
            java.lang.String r2 = "aweme.author"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            boolean r0 = r0.isMe()
            if (r0 == 0) goto L_0x0088
        L_0x0070:
            r9 = 1
            goto L_0x0088
        L_0x0072:
            com.ss.android.ugc.aweme.profile.model.User r2 = r18.getAuthor()
            if (r2 == 0) goto L_0x0088
            com.ss.android.ugc.aweme.profile.model.User r0 = r18.getAuthor()
            java.lang.String r2 = "aweme.author"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            boolean r0 = r0.isMe()
            if (r0 == 0) goto L_0x0088
            goto L_0x0070
        L_0x0088:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.u.i(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    public final boolean a(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f75964a, false, 87998, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, this, f75964a, false, 87998, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        }
        if (aweme != null) {
            AwemeStatus status = aweme.getStatus();
            if (status != null && status.getPrivateStatus() == 2) {
                User author = aweme.getAuthor();
                if ((author == null || author.getFollowStatus() != 2) && !b(aweme)) {
                    return true;
                }
            }
        }
        return false;
    }
}
