package com.ss.android.ugc.aweme.profile.presenter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.f;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.profile.api.FollowApi;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.dr;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;

public class i extends com.ss.android.ugc.aweme.account.c.a<com.ss.android.ugc.aweme.common.a<FollowStatus>, m> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f61631b;

    /* renamed from: c  reason: collision with root package name */
    public String f61632c;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61638a;

        /* renamed from: b  reason: collision with root package name */
        private h f61639b = new h();

        public final h a() {
            if (PatchProxy.isSupport(new Object[0], this, f61638a, false, 67586, new Class[0], h.class)) {
                return (h) PatchProxy.accessDispatch(new Object[0], this, f61638a, false, 67586, new Class[0], h.class);
            } else if (this.f61639b.f61627c != -1) {
                return this.f61639b;
            } else {
                throw new IllegalStateException("You must set an action.");
            }
        }

        public final a a(int i) {
            this.f61639b.f61627c = i;
            return this;
        }

        public final a b(int i) {
            this.f61639b.f61628d = i;
            return this;
        }

        public final a c(int i) {
            this.f61639b.f61629e = i;
            return this;
        }

        public final a d(@Nullable String str) {
            this.f61639b.g = str;
            return this;
        }

        public final a e(@Nullable String str) {
            this.f61639b.i = str;
            return this;
        }

        public final a a(@Nullable Aweme aweme) {
            this.f61639b.h = aweme;
            return this;
        }

        public final a b(@NotNull String str) {
            this.f61639b.f61626b = str;
            return this;
        }

        public final a c(@Nullable String str) {
            this.f61639b.f61630f = str;
            return this;
        }

        public final a a(@NonNull String str) {
            this.f61639b.f61625a = str;
            return this;
        }
    }

    public i() {
        c();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f61631b, false, 67576, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61631b, false, 67576, new Class[0], Void.TYPE);
            return;
        }
        a(new com.ss.android.ugc.aweme.common.a<FollowStatus>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61633a;

            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length != 9) {
                    return false;
                }
                return true;
            }

            public final boolean sendRequest(final Object... objArr) {
                if (PatchProxy.isSupport(new Object[]{objArr}, this, f61633a, false, 67583, new Class[]{Object[].class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f61633a, false, 67583, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
                } else if (!super.sendRequest(objArr)) {
                    return false;
                } else {
                    i.this.f61632c = objArr[0];
                    m.a().a(this.mHandler, new Callable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f61635a;

                        public final Object call() throws Exception {
                            FollowStatus followStatus;
                            if (PatchProxy.isSupport(new Object[0], this, f61635a, false, 67585, new Class[0], Object.class)) {
                                return PatchProxy.accessDispatch(new Object[0], this, f61635a, false, 67585, new Class[0], Object.class);
                            }
                            Aweme aweme = (Aweme) objArr[5];
                            String str = (String) objArr[6];
                            try {
                                if (objArr.length >= 9) {
                                    followStatus = FollowApi.a((String) objArr[0], (String) objArr[8], ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue(), com.ss.android.ugc.aweme.app.constants.a.a((String) objArr[3]), (String) objArr[4], ((Integer) objArr[7]).intValue());
                                } else {
                                    followStatus = FollowApi.a((String) objArr[0], dr.a().a((String) objArr[0]), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue(), com.ss.android.ugc.aweme.app.constants.a.a((String) objArr[3]), (String) objArr[4], ((Integer) objArr[7]).intValue());
                                }
                                AnonymousClass1.this.a(((Integer) objArr[1]).intValue(), aweme, str, followStatus);
                                return followStatus;
                            } catch (com.ss.android.ugc.aweme.base.api.a.b.a e2) {
                                if (e2.getErrorCode() == 2149 && c.x(aweme)) {
                                    AnonymousClass1.this.a(((Integer) objArr[1]).intValue(), aweme, str, new FollowStatus((String) objArr[0], 0, e2.getErrorCode()));
                                }
                                throw e2;
                            }
                        }
                    }, 0);
                    return true;
                }
            }

            /* JADX WARNING: Code restructure failed: missing block: B:14:0x008f, code lost:
                if (r1.equals("feed") == false) goto L_0x009c;
             */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x00a1  */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x00a9  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void a(int r23, com.ss.android.ugc.aweme.feed.model.Aweme r24, java.lang.String r25, com.ss.android.ugc.aweme.profile.model.FollowStatus r26) {
                /*
                    r22 = this;
                    r0 = r24
                    r1 = r25
                    r2 = r26
                    r3 = 4
                    java.lang.Object[] r4 = new java.lang.Object[r3]
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r23)
                    r11 = 0
                    r4[r11] = r5
                    r12 = 1
                    r4[r12] = r0
                    r13 = 2
                    r4[r13] = r1
                    r14 = 3
                    r4[r14] = r2
                    com.meituan.robust.ChangeQuickRedirect r6 = f61633a
                    java.lang.Class[] r9 = new java.lang.Class[r3]
                    java.lang.Class r5 = java.lang.Integer.TYPE
                    r9[r11] = r5
                    java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r5 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                    r9[r12] = r5
                    java.lang.Class<java.lang.String> r5 = java.lang.String.class
                    r9[r13] = r5
                    java.lang.Class<com.ss.android.ugc.aweme.profile.model.FollowStatus> r5 = com.ss.android.ugc.aweme.profile.model.FollowStatus.class
                    r9[r14] = r5
                    java.lang.Class r10 = java.lang.Void.TYPE
                    r7 = 0
                    r8 = 67584(0x10800, float:9.4705E-41)
                    r5 = r22
                    boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
                    if (r4 == 0) goto L_0x006c
                    java.lang.Object[] r15 = new java.lang.Object[r3]
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r23)
                    r15[r11] = r4
                    r15[r12] = r0
                    r15[r13] = r1
                    r15[r14] = r2
                    com.meituan.robust.ChangeQuickRedirect r17 = f61633a
                    r18 = 0
                    r19 = 67584(0x10800, float:9.4705E-41)
                    java.lang.Class[] r0 = new java.lang.Class[r3]
                    java.lang.Class r1 = java.lang.Integer.TYPE
                    r0[r11] = r1
                    java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                    r0[r12] = r1
                    java.lang.Class<java.lang.String> r1 = java.lang.String.class
                    r0[r13] = r1
                    java.lang.Class<com.ss.android.ugc.aweme.profile.model.FollowStatus> r1 = com.ss.android.ugc.aweme.profile.model.FollowStatus.class
                    r0[r14] = r1
                    java.lang.Class r21 = java.lang.Void.TYPE
                    r16 = r22
                    r20 = r0
                    com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
                    return
                L_0x006c:
                    if (r1 == 0) goto L_0x00b2
                    r3 = r23
                    if (r3 != r12) goto L_0x00b2
                    boolean r3 = com.ss.android.ugc.aweme.commercialize.utils.c.x(r24)
                    if (r3 != 0) goto L_0x0079
                    goto L_0x00b2
                L_0x0079:
                    r3 = -1
                    int r4 = r25.hashCode()
                    r5 = -485371922(0xffffffffe311cfee, float:-2.6897608E21)
                    if (r4 == r5) goto L_0x0092
                    r5 = 3138974(0x2fe59e, float:4.39864E-39)
                    if (r4 == r5) goto L_0x0089
                    goto L_0x009c
                L_0x0089:
                    java.lang.String r4 = "feed"
                    boolean r1 = r1.equals(r4)
                    if (r1 == 0) goto L_0x009c
                    goto L_0x009d
                L_0x0092:
                    java.lang.String r4 = "homepage"
                    boolean r1 = r1.equals(r4)
                    if (r1 == 0) goto L_0x009c
                    r11 = 1
                    goto L_0x009d
                L_0x009c:
                    r11 = -1
                L_0x009d:
                    switch(r11) {
                        case 0: goto L_0x00a9;
                        case 1: goto L_0x00a1;
                        default: goto L_0x00a0;
                    }
                L_0x00a0:
                    goto L_0x00b1
                L_0x00a1:
                    android.content.Context r1 = com.ss.android.common.applog.GlobalContext.getContext()
                    com.ss.android.ugc.aweme.commercialize.log.g.b((android.content.Context) r1, (com.ss.android.ugc.aweme.feed.model.Aweme) r0, (com.ss.android.ugc.aweme.profile.model.FollowStatus) r2)
                    goto L_0x00b1
                L_0x00a9:
                    android.content.Context r1 = com.ss.android.common.applog.GlobalContext.getContext()
                    com.ss.android.ugc.aweme.commercialize.log.g.a((android.content.Context) r1, (com.ss.android.ugc.aweme.feed.model.Aweme) r0, (com.ss.android.ugc.aweme.profile.model.FollowStatus) r2)
                    return
                L_0x00b1:
                    return
                L_0x00b2:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.presenter.i.AnonymousClass1.a(int, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, com.ss.android.ugc.aweme.profile.model.FollowStatus):void");
            }
        });
    }

    public final void b() {
        FollowStatus followStatus;
        if (PatchProxy.isSupport(new Object[0], this, f61631b, false, 67580, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61631b, false, 67580, new Class[0], Void.TYPE);
            return;
        }
        if (this.f2978e == null) {
            followStatus = null;
        } else {
            followStatus = (FollowStatus) this.f2978e.getData();
        }
        if (followStatus != null && followStatus.followStatus == 1) {
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).trackAppsFlyerEvent("mus_af_follow", followStatus.userId);
        }
        if (followStatus != null) {
            if (this.f2979f != null) {
                ((m) this.f2979f).onFollowSuccess(followStatus);
                bg.a(followStatus);
                f.a().b().postValue(followStatus);
            }
            User user = new User();
            user.setUid(followStatus.userId);
            user.setFollowStatus(followStatus.followStatus);
            b.a().updateIMUserFollowStatus(b.a(user));
            if (PatchProxy.isSupport(new Object[]{followStatus}, this, f61631b, false, 67582, new Class[]{FollowStatus.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{followStatus}, this, f61631b, false, 67582, new Class[]{FollowStatus.class}, Void.TYPE);
            } else if (com.ss.android.g.a.b() && followStatus != null && followStatus.followStatus == 0) {
                bg.a(followStatus.cpoyToWatchStatus());
            }
        }
    }

    public final boolean a(Object... objArr) {
        if (!PatchProxy.isSupport(new Object[]{objArr}, this, f61631b, false, 67577, new Class[]{Object[].class}, Boolean.TYPE)) {
            return super.a(objArr);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f61631b, false, 67577, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f61631b, false, 67579, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f61631b, false, 67579, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f2979f != null) {
            ((m) this.f2979f).onFollowFail(exc);
            String str = this.f61632c;
            if (PatchProxy.isSupport(new Object[]{str}, this, f61631b, false, 67581, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f61631b, false, 67581, new Class[]{String.class}, Void.TYPE);
                return;
            }
            FollowStatus followStatus = new FollowStatus();
            followStatus.userId = str;
            followStatus.followStatus = 0;
            followStatus.isFollowSucess = false;
            bg.a(followStatus);
            f.a().b().postValue(followStatus);
        }
    }

    public final boolean a(@Nullable h hVar) {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2}, this, f61631b, false, 67578, new Class[]{h.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{hVar2}, this, f61631b, false, 67578, new Class[]{h.class}, Boolean.TYPE)).booleanValue();
        }
        if (hVar2 != null) {
            if (super.a(hVar2.f61625a, Integer.valueOf(hVar2.f61627c), Integer.valueOf(hVar2.f61628d), hVar2.f61630f, hVar2.g, hVar2.h, hVar2.i, Integer.valueOf(hVar2.f61629e), hVar2.f61626b)) {
                return true;
            }
        }
        return false;
    }
}
