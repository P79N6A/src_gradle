package com.ss.android.ugc.aweme.commercialize.model;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.ArrayMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.AvatarDecoration;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/model/AvatarDeco;", "", "()V", "id", "", "image", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "name", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39371a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f39372b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0007J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\u0018J\u0012\u0010\u0019\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0007J\b\u0010\u001a\u001a\u00020\u0004H\u0007J\u001c\u0010\u001b\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0015H\u0007J\u001c\u0010\u001b\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u0015H\u0007J7\u0010\u001b\u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u00172\b\u0010 \u001a\u0004\u0018\u00010\u00152\b\u0010!\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0015H\u0003¢\u0006\u0002\u0010#J&\u0010$\u001a\u00020\u00102\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010'\u001a\u0004\u0018\u00010\u0015H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00078BX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0004*\u0004\u0018\u00010\u000b8BX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\n\u001a\u00020\u0004*\u0004\u0018\u00010\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000e¨\u0006("}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/model/AvatarDeco$Companion;", "", "()V", "DEBUG", "", "latestDecoData", "Lcom/ss/android/ugc/aweme/profile/model/AvatarDecoration;", "Lcom/ss/android/ugc/aweme/profile/model/User;", "getLatestDecoData", "(Lcom/ss/android/ugc/aweme/profile/model/User;)Lcom/ss/android/ugc/aweme/profile/model/AvatarDecoration;", "valid", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "getValid", "(Lcom/ss/android/ugc/aweme/base/model/UrlModel;)Z", "(Lcom/ss/android/ugc/aweme/profile/model/AvatarDecoration;)Z", "bindAvatarDeco", "", "user", "image", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "getAvatarDecoName", "", "getAvatarId", "", "(Lcom/ss/android/ugc/aweme/profile/model/User;)Ljava/lang/Long;", "hasAvatarDeco", "isAvatarDecoEnabled", "logAvatarDecoShow", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "page", "decId", "enterFrom", "authorId", "groupId", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "openAvatarSettingPage", "context", "Landroid/content/Context;", "from", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39373a;

        private a() {
        }

        @JvmStatic
        public final boolean a() {
            if (PatchProxy.isSupport(new Object[0], this, f39373a, false, 31887, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f39373a, false, 31887, new Class[0], Boolean.TYPE)).booleanValue();
            }
            x a2 = x.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "CommonSharePrefCache.inst()");
            an<Boolean> Y = a2.Y();
            Intrinsics.checkExpressionValueIsNotNull(Y, "CommonSharePrefCache.ins…).avatarDecorationEnabled");
            Object c2 = Y.c();
            Intrinsics.checkExpressionValueIsNotNull(c2, "CommonSharePrefCache.ins…arDecorationEnabled.cache");
            return ((Boolean) c2).booleanValue();
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* access modifiers changed from: package-private */
        public final AvatarDecoration a(@NotNull User user) {
            String str;
            User user2;
            if (PatchProxy.isSupport(new Object[]{user}, this, f39373a, false, 31886, new Class[]{User.class}, AvatarDecoration.class)) {
                return (AvatarDecoration) PatchProxy.accessDispatch(new Object[]{user}, this, f39373a, false, 31886, new Class[]{User.class}, AvatarDecoration.class);
            }
            IAccountUserService a2 = d.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
            User curUser = a2.getCurUser();
            String uid = user.getUid();
            if (curUser != null) {
                str = curUser.getUid();
            } else {
                str = null;
            }
            if (Intrinsics.areEqual((Object) uid, (Object) str)) {
                user2 = curUser;
            } else {
                user2 = user;
            }
            Intrinsics.checkExpressionValueIsNotNull(user2, "u");
            return user2.getAvatarDecoration();
        }

        @JvmStatic
        @Nullable
        public final Long b(@Nullable User user) {
            User user2 = user;
            if (PatchProxy.isSupport(new Object[]{user2}, this, f39373a, false, 31890, new Class[]{User.class}, Long.class)) {
                return (Long) PatchProxy.accessDispatch(new Object[]{user2}, this, f39373a, false, 31890, new Class[]{User.class}, Long.class);
            }
            if (user2 != null) {
                AvatarDecoration a2 = a(user2);
                if (a2 != null) {
                    return Long.valueOf(a2.getId());
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public final boolean a(@Nullable UrlModel urlModel) {
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{urlModel}, this, f39373a, false, 31897, new Class[]{UrlModel.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{urlModel}, this, f39373a, false, 31897, new Class[]{UrlModel.class}, Boolean.TYPE)).booleanValue();
            }
            if (urlModel != null) {
                List<String> urlList = urlModel.getUrlList();
                if (urlList != null) {
                    if (!urlList.isEmpty()) {
                        return z;
                    }
                    return false;
                }
            }
            z = false;
            return z;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0075, code lost:
        if (r0 == null) goto L_0x0077;
     */
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String b(@org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.profile.model.User r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f39371a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r3 = com.ss.android.ugc.aweme.profile.model.User.class
            r7[r9] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = 0
            r5 = 1
            r6 = 31879(0x7c87, float:4.4672E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0035
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f39371a
            r13 = 1
            r14 = 31879(0x7c87, float:4.4672E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r0 = com.ss.android.ugc.aweme.profile.model.User.class
            r15[r9] = r0
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
        L_0x0032:
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0035:
            com.ss.android.ugc.aweme.commercialize.model.b$a r10 = f39372b
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.commercialize.model.b.a.f39373a
            r5 = 0
            r6 = 31889(0x7c91, float:4.4686E-41)
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r3 = com.ss.android.ugc.aweme.profile.model.User.class
            r7[r9] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = r10
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0067
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = com.ss.android.ugc.aweme.commercialize.model.b.a.f39373a
            r4 = 0
            r5 = 31889(0x7c91, float:4.4686E-41)
            java.lang.Class[] r6 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r0 = com.ss.android.ugc.aweme.profile.model.User.class
            r6[r9] = r0
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r1 = r2
            r2 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0032
        L_0x0067:
            if (r0 == 0) goto L_0x0077
            com.ss.android.ugc.aweme.commercialize.model.b$a r10 = (com.ss.android.ugc.aweme.commercialize.model.b.a) r10
            com.ss.android.ugc.aweme.profile.model.AvatarDecoration r0 = r10.a((com.ss.android.ugc.aweme.profile.model.User) r0)
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = r0.getName()
            if (r0 != 0) goto L_0x0079
        L_0x0077:
            java.lang.String r0 = ""
        L_0x0079:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.model.b.b(com.ss.android.ugc.aweme.profile.model.User):java.lang.String");
    }

    @JvmStatic
    public static final boolean a(@Nullable User user) {
        AvatarDecoration avatarDecoration;
        boolean z;
        String str;
        boolean z2;
        Object accessDispatch;
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{user2}, null, f39371a, true, 31878, new Class[]{User.class}, Boolean.TYPE)) {
            accessDispatch = PatchProxy.accessDispatch(new Object[]{user2}, null, f39371a, true, 31878, new Class[]{User.class}, Boolean.TYPE);
        } else {
            a aVar = f39372b;
            if (PatchProxy.isSupport(new Object[]{user2}, aVar, a.f39373a, false, 31888, new Class[]{User.class}, Boolean.TYPE)) {
                accessDispatch = PatchProxy.accessDispatch(new Object[]{user2}, aVar, a.f39373a, false, 31888, new Class[]{User.class}, Boolean.TYPE);
            } else {
                a aVar2 = aVar;
                if (aVar2.a()) {
                    UrlModel urlModel = null;
                    if (user2 != null) {
                        avatarDecoration = aVar2.a(user2);
                    } else {
                        avatarDecoration = null;
                    }
                    if (PatchProxy.isSupport(new Object[]{avatarDecoration}, aVar2, a.f39373a, false, 31896, new Class[]{AvatarDecoration.class}, Boolean.TYPE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(new Object[]{avatarDecoration}, aVar2, a.f39373a, false, 31896, new Class[]{AvatarDecoration.class}, Boolean.TYPE)).booleanValue();
                    } else {
                        if (avatarDecoration != null) {
                            str = avatarDecoration.getName();
                        } else {
                            str = null;
                        }
                        CharSequence charSequence = str;
                        if (charSequence == null || charSequence.length() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            a aVar3 = f39372b;
                            if (avatarDecoration != null) {
                                urlModel = avatarDecoration.getSourceUrl();
                            }
                            if (aVar3.a(urlModel)) {
                                z = true;
                            }
                        }
                        z = false;
                    }
                    if (z) {
                        return true;
                    }
                }
                return false;
            }
        }
        return ((Boolean) accessDispatch).booleanValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x009d  */
    @kotlin.jvm.JvmStatic
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(@org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.profile.model.User r19, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.base.ui.RemoteImageView r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f39371a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r4 = com.ss.android.ugc.aweme.profile.model.User.class
            r8[r10] = r4
            java.lang.Class<com.ss.android.ugc.aweme.base.ui.RemoteImageView> r4 = com.ss.android.ugc.aweme.base.ui.RemoteImageView.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = 0
            r6 = 1
            r7 = 31881(0x7c89, float:4.4675E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0043
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f39371a
            r15 = 1
            r16 = 31881(0x7c89, float:4.4675E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
            r0[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.base.ui.RemoteImageView> r1 = com.ss.android.ugc.aweme.base.ui.RemoteImageView.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0043:
            com.ss.android.ugc.aweme.commercialize.model.b$a r12 = f39372b
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r10] = r0
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.commercialize.model.b.a.f39373a
            r6 = 0
            r7 = 31891(0x7c93, float:4.4689E-41)
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r4 = com.ss.android.ugc.aweme.profile.model.User.class
            r8[r10] = r4
            java.lang.Class<com.ss.android.ugc.aweme.base.ui.RemoteImageView> r4 = com.ss.android.ugc.aweme.base.ui.RemoteImageView.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = r12
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0081
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r10] = r0
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r0 = com.ss.android.ugc.aweme.commercialize.model.b.a.f39373a
            r4 = 0
            r5 = 31891(0x7c93, float:4.4689E-41)
            java.lang.Class[] r6 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
            r6[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.base.ui.RemoteImageView> r1 = com.ss.android.ugc.aweme.base.ui.RemoteImageView.class
            r6[r11] = r1
            java.lang.Class r7 = java.lang.Void.TYPE
            r1 = r3
            r2 = r12
            r3 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0081:
            if (r1 != 0) goto L_0x0084
            return
        L_0x0084:
            if (r0 == 0) goto L_0x0094
            r2 = r12
            com.ss.android.ugc.aweme.commercialize.model.b$a r2 = (com.ss.android.ugc.aweme.commercialize.model.b.a) r2
            com.ss.android.ugc.aweme.profile.model.AvatarDecoration r0 = r2.a((com.ss.android.ugc.aweme.profile.model.User) r0)
            if (r0 == 0) goto L_0x0094
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getSourceUrl()
            goto L_0x0095
        L_0x0094:
            r0 = 0
        L_0x0095:
            com.ss.android.ugc.aweme.commercialize.model.b$a r12 = (com.ss.android.ugc.aweme.commercialize.model.b.a) r12
            boolean r2 = r12.a((com.ss.android.ugc.aweme.base.model.UrlModel) r0)
            if (r2 == 0) goto L_0x00b9
            com.facebook.drawee.interfaces.DraweeHierarchy r2 = r20.getHierarchy()
            com.facebook.drawee.generic.GenericDraweeHierarchy r2 = (com.facebook.drawee.generic.GenericDraweeHierarchy) r2
            r3 = 17170445(0x106000d, float:2.461195E-38)
            if (r2 == 0) goto L_0x00ab
            r2.setPlaceholderImage((int) r3)
        L_0x00ab:
            com.facebook.drawee.interfaces.DraweeHierarchy r2 = r20.getHierarchy()
            com.facebook.drawee.generic.GenericDraweeHierarchy r2 = (com.facebook.drawee.generic.GenericDraweeHierarchy) r2
            if (r2 == 0) goto L_0x00b6
            r2.setFailureImage((int) r3)
        L_0x00b6:
            com.ss.android.ugc.aweme.base.c.b(r1, r0)
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.model.b.a(com.ss.android.ugc.aweme.profile.model.User, com.ss.android.ugc.aweme.base.ui.RemoteImageView):void");
    }

    @JvmStatic
    public static final void a(@Nullable User user, @Nullable String str) {
        String str2;
        Map map;
        User user2 = user;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{user2, str3}, null, f39371a, true, 31882, new Class[]{User.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2, str3}, null, f39371a, true, 31882, new Class[]{User.class, String.class}, Void.TYPE);
            return;
        }
        a aVar = f39372b;
        if (PatchProxy.isSupport(new Object[]{user2, str3}, aVar, a.f39373a, false, 31892, new Class[]{User.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2, str3}, aVar, a.f39373a, false, 31892, new Class[]{User.class, String.class}, Void.TYPE);
            return;
        }
        a aVar2 = aVar;
        Long b2 = aVar2.b(user2);
        if (user2 != null) {
            str2 = user.getUid();
        } else {
            str2 = null;
        }
        if (PatchProxy.isSupport(new Object[]{b2, str3, str2, null}, aVar2, a.f39373a, false, 31894, new Class[]{Long.class, String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{b2, str3, str2, null}, aVar2, a.f39373a, false, 31894, new Class[]{Long.class, String.class, String.class, String.class}, Void.TYPE);
        } else if (b2 != null) {
            b2.longValue();
            if (str3 != null && str2 != null) {
                if (Build.VERSION.SDK_INT >= 19) {
                    map = new ArrayMap(4);
                } else {
                    map = new HashMap();
                }
                map.put("dec_id", String.valueOf(b2.longValue()));
                map.put("enter_from", str3);
                map.put("author_id", str2);
                r.a("show_head_decoration", map);
            }
        }
    }

    @JvmStatic
    public static final void a(@Nullable Context context, @Nullable User user, @Nullable String str) {
        String str2;
        boolean z;
        Context context2 = context;
        User user2 = user;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{context2, user2, str3}, null, f39371a, true, 31885, new Class[]{Context.class, User.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, user2, str3}, null, f39371a, true, 31885, new Class[]{Context.class, User.class, String.class}, Void.TYPE);
            return;
        }
        a aVar = f39372b;
        if (PatchProxy.isSupport(new Object[]{context2, user2, str3}, aVar, a.f39373a, false, 31895, new Class[]{Context.class, User.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, user2, str3}, aVar, a.f39373a, false, 31895, new Class[]{Context.class, User.class, String.class}, Void.TYPE);
        } else if (context2 != null && user2 != null) {
            Uri.Builder appendQueryParameter = Uri.parse("https://aweme.snssdk.com/aweme/in_app/activity/avatar_decoration/").buildUpon().appendQueryParameter("from", str3);
            Long b2 = aVar.b(user2);
            if (b2 != null) {
                str2 = String.valueOf(b2.longValue());
            } else {
                str2 = null;
            }
            CharSequence charSequence = str2;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                appendQueryParameter.appendQueryParameter("dec_id", str2);
            }
            appendQueryParameter.appendQueryParameter("author_id", user.getUid());
            g.a(context2, appendQueryParameter.toString(), (String) null, true, (Map<String, String>) null);
            bg.a(new com.ss.android.ugc.aweme.profile.a.d());
            r.a("click_setting_decoration", MapsKt.mapOf(TuplesKt.to("enter_from", str3), TuplesKt.to("author_id", user.getUid())));
        }
    }
}
