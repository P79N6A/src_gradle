package com.ss.android.ugc.aweme.commercialize.feed;

import a.i;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.dmt.ui.b.a;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.log.x;
import com.ss.android.ugc.aweme.commercialize.utils.al;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.commercialize.utils.l;
import com.ss.android.ugc.aweme.commercialize.utils.m;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.panel.h;
import com.ss.android.ugc.aweme.longvideo.j;
import com.ss.android.ugc.aweme.main.u;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

public enum am implements d, h, h, u {
    RAW_AD {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final void handleVideoEventAvailable(Context context, Aweme aweme) {
        }

        public final boolean isAd() {
            return true;
        }

        public final void onPageSelected(Context context, Aweme aweme) {
        }

        public final void clickUserName(Context context, Aweme aweme) {
            if (PatchProxy.isSupport(new Object[]{context, aweme}, this, changeQuickRedirect, false, 30777, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, aweme}, this, changeQuickRedirect, false, 30777, new Class[]{Context.class, Aweme.class}, Void.TYPE);
                return;
            }
            if (RAW_AD.isRealAuthor) {
                g.e(context, aweme);
                if (c.x(aweme)) {
                    g.d(context, aweme);
                }
            } else if (RAW_AD.hasLandPage) {
                g.e(context, aweme);
                g.d(context, aweme);
            }
        }

        public final void flingToIndexChange(Context context, Aweme aweme) {
            if (PatchProxy.isSupport(new Object[]{context, aweme}, this, changeQuickRedirect, false, 30783, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, aweme}, this, changeQuickRedirect, false, 30783, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            } else if (RAW_AD.isRealAuthor) {
                g.k(context, aweme);
            } else if (!a.a() || !RAW_AD.isDownloadMode) {
                if (RAW_AD.hasLandPage) {
                    g.k(context, aweme);
                    g.d(context, aweme);
                }
            } else if (RAW_AD.allowJumpToGooglePlay) {
                g.k(context, aweme);
                g.d(context, aweme);
            } else {
                g.k(context, aweme);
            }
        }

        public final void clickMusic(Context context, Aweme aweme) {
            Context context2 = context;
            Aweme aweme2 = aweme;
            if (PatchProxy.isSupport(new Object[]{context2, aweme2}, this, changeQuickRedirect, false, 30778, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2, aweme2}, this, changeQuickRedirect, false, 30778, new Class[]{Context.class, Aweme.class}, Void.TYPE);
                return;
            }
            if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, g.f39316a, true, 31584, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, g.f39316a, true, 31584, new Class[]{Context.class, Aweme.class}, Void.TYPE);
                return;
            }
            g.b(context2, "music_click", aweme2, g.f(context2, aweme2, "raw ad music click"));
        }

        public final void onEnd(Context context, Aweme aweme) {
            boolean z;
            Context context2 = context;
            Aweme aweme2 = aweme;
            if (PatchProxy.isSupport(new Object[]{context2, aweme2}, this, changeQuickRedirect, false, 30782, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2, aweme2}, this, changeQuickRedirect, false, 30782, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            } else if (!c.F(aweme).booleanValue() || !aweme.withFakeUser()) {
                if (a.a()) {
                    if (RAW_AD.isDownloadMode && !RAW_AD.isRealAuthor) {
                        g.k(context, aweme);
                        if (RAW_AD.allowJumpToGooglePlay) {
                            g.d(context, aweme);
                            if (com.ss.android.ugc.aweme.commercialize.utils.g.a(context, aweme)) {
                                return;
                            }
                        }
                    }
                    if (isVastAndHttpUri(aweme2)) {
                        g.k(context, aweme);
                        g.d(context, aweme);
                        if (com.ss.android.ugc.aweme.commercialize.utils.g.a(context2, aweme2, (String) null, (String) null)) {
                            return;
                        }
                    }
                }
                com.bytedance.ies.dmt.ui.d.a.b(context2, (int) C0906R.string.c_).a();
            } else {
                if (PatchProxy.isSupport(new Object[]{aweme2}, null, c.f39774a, true, 32301, new Class[]{Aweme.class}, Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme2}, null, c.f39774a, true, 32301, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
                } else {
                    if (a.a()) {
                        AwemeRawAd P = c.P(aweme);
                        if (P != null && P.isPopUps()) {
                            String openUrl = P.getOpenUrl();
                            if (!TextUtils.isEmpty(openUrl)) {
                                z = com.ss.android.ugc.aweme.commercialize.utils.g.c(openUrl);
                            }
                        }
                    }
                    z = false;
                }
                if (z) {
                    if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, com.ss.android.ugc.aweme.commercialize.utils.g.f39783a, true, 32373, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, com.ss.android.ugc.aweme.commercialize.utils.g.f39783a, true, 32373, new Class[]{Context.class, Aweme.class}, Void.TYPE);
                        return;
                    }
                    new a.C0185a(context2).b((int) C0906R.string.cc).a((int) C0906R.string.a0v, (DialogInterface.OnClickListener) new l(context2, aweme2)).b((int) C0906R.string.pm, (DialogInterface.OnClickListener) new m(context2, aweme2)).a().a();
                    if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, g.f39316a, true, 31547, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, g.f39316a, true, 31547, new Class[]{Context.class, Aweme.class}, Void.TYPE);
                        return;
                    }
                    g.b(context2, "open_url_window_show", aweme2, g.f(context2, aweme2, "raw open url window show"));
                    return;
                }
                com.ss.android.ugc.aweme.commercialize.utils.g.b(context, aweme);
                g.k(context, aweme);
                g.d(context, aweme);
            }
        }

        public final void onVideoPageChange(Context context, Aweme aweme) {
            Context context2 = context;
            Aweme aweme2 = aweme;
            int i = 2;
            if (PatchProxy.isSupport(new Object[]{context2, aweme2}, this, changeQuickRedirect, false, 30781, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2, aweme2}, this, changeQuickRedirect, false, 30781, new Class[]{Context.class, Aweme.class}, Void.TYPE);
                return;
            }
            if (com.ss.android.g.a.a()) {
                a a2 = a.a();
                String aid = aweme.getAid();
                if (PatchProxy.isSupport(new Object[]{aid}, a2, a.f38772a, false, 30552, new Class[]{String.class}, Void.TYPE)) {
                    a aVar = a2;
                    PatchProxy.accessDispatch(new Object[]{aid}, aVar, a.f38772a, false, 30552, new Class[]{String.class}, Void.TYPE);
                } else {
                    if (!a2.f38775b.contains(aid)) {
                        a2.f38775b.add(aid);
                    }
                    if (PatchProxy.isSupport(new Object[]{aid}, a2, a.f38772a, false, 30553, new Class[]{String.class}, Void.TYPE)) {
                        a aVar2 = a2;
                        PatchProxy.accessDispatch(new Object[]{aid}, aVar2, a.f38772a, false, 30553, new Class[]{String.class}, Void.TYPE);
                    } else {
                        i.a((Callable<TResult>) new b<TResult>(aid), (Executor) i.f1051a);
                    }
                }
            }
            if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, g.f39316a, true, 31489, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, g.f39316a, true, 31489, new Class[]{Context.class, Aweme.class}, Void.TYPE);
                return;
            }
            HashMap hashMap = new HashMap();
            if (c.Q(aweme)) {
                HashMap hashMap2 = new HashMap();
                if (com.ss.android.ugc.aweme.commercialize.splash.h.d()) {
                    i = 1;
                }
                hashMap2.put("awemelaunch", String.valueOf(i));
                hashMap.put("ad_extra_data", new Gson().toJson((Object) hashMap2));
            }
            g.b(context2, "show", aweme2, g.a(context2, aweme2, "raw ad show", false, (Map<String, String>) hashMap));
            if (PatchProxy.isSupport(new Object[]{aweme2}, null, g.f39316a, true, 31720, new Class[]{Aweme.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aweme2}, null, g.f39316a, true, 31720, new Class[]{Aweme.class}, Void.TYPE);
            } else if (aweme2 != null) {
                g.a((g.a) new com.ss.android.ugc.aweme.commercialize.log.h(aweme2), (Collection<String>) aweme.getRawAdShowTrackUrlList(), false);
            }
            if (com.ss.android.g.a.a()) {
                com.ss.android.ugc.aweme.commercialize.utils.am.c(aweme);
            }
            n.a("ctr_monitor", "ctr_show", g.a(g.f(context2, aweme2, "raw ad show")));
        }

        public final void clickDiggContainer(Context context, Aweme aweme, boolean z) {
            if (PatchProxy.isSupport(new Object[]{context, aweme, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 30775, new Class[]{Context.class, Aweme.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, aweme, Byte.valueOf(z)}, this, changeQuickRedirect, false, 30775, new Class[]{Context.class, Aweme.class, Boolean.TYPE}, Void.TYPE);
            } else if (z) {
                g.l(context, aweme);
            } else {
                g.m(context, aweme);
            }
        }

        public final void play(Context context, Aweme aweme, int i) {
            if (PatchProxy.isSupport(new Object[]{context, aweme, Integer.valueOf(i)}, this, changeQuickRedirect, false, 30772, new Class[]{Context.class, Aweme.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, aweme, Integer.valueOf(i)}, this, changeQuickRedirect, false, 30772, new Class[]{Context.class, Aweme.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            g.b(context, aweme, i);
        }

        public final void rePlay(Context context, Aweme aweme, int i) {
            if (PatchProxy.isSupport(new Object[]{context, aweme, Integer.valueOf(i)}, this, changeQuickRedirect, false, 30773, new Class[]{Context.class, Aweme.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, aweme, Integer.valueOf(i)}, this, changeQuickRedirect, false, 30773, new Class[]{Context.class, Aweme.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            g.b(context, aweme, i);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x006c, code lost:
            if (com.ss.android.ugc.aweme.commercialize.utils.c.x(r22) != false) goto L_0x0088;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void clickAvatar(android.content.Context r21, com.ss.android.ugc.aweme.feed.model.Aweme r22, java.lang.String r23) {
            /*
                r20 = this;
                r2 = 3
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r10 = 0
                r3[r10] = r21
                r11 = 1
                r3[r11] = r22
                r12 = 2
                r3[r12] = r23
                com.meituan.robust.ChangeQuickRedirect r5 = changeQuickRedirect
                java.lang.Class[] r8 = new java.lang.Class[r2]
                java.lang.Class<android.content.Context> r4 = android.content.Context.class
                r8[r10] = r4
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r4 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r8[r11] = r4
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                r8[r12] = r4
                java.lang.Class r9 = java.lang.Void.TYPE
                r6 = 0
                r7 = 30776(0x7838, float:4.3126E-41)
                r4 = r20
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
                if (r3 == 0) goto L_0x004f
                java.lang.Object[] r13 = new java.lang.Object[r2]
                r13[r10] = r21
                r13[r11] = r22
                r13[r12] = r23
                com.meituan.robust.ChangeQuickRedirect r15 = changeQuickRedirect
                r16 = 0
                r17 = 30776(0x7838, float:4.3126E-41)
                java.lang.Class[] r0 = new java.lang.Class[r2]
                java.lang.Class<android.content.Context> r1 = android.content.Context.class
                r0[r10] = r1
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r0[r11] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r0[r12] = r1
                java.lang.Class r19 = java.lang.Void.TYPE
                r14 = r20
                r18 = r0
                com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
                return
            L_0x004f:
                com.ss.android.ugc.aweme.commercialize.feed.am r2 = RAW_AD
                boolean r2 = r2.isRealAuthor
                if (r2 == 0) goto L_0x006f
                boolean r2 = com.ss.android.ugc.aweme.commercialize.utils.c.u(r22)
                if (r2 == 0) goto L_0x0065
                com.ss.android.ugc.aweme.profile.model.User r2 = r22.getAuthor()
                boolean r2 = com.ss.android.ugc.aweme.utils.ex.p(r2)
                if (r2 != 0) goto L_0x0068
            L_0x0065:
                com.ss.android.ugc.aweme.commercialize.log.g.e((android.content.Context) r21, (com.ss.android.ugc.aweme.feed.model.Aweme) r22)
            L_0x0068:
                boolean r2 = com.ss.android.ugc.aweme.commercialize.utils.c.x(r22)
                if (r2 == 0) goto L_0x008b
                goto L_0x0088
            L_0x006f:
                com.ss.android.ugc.aweme.commercialize.feed.am r2 = RAW_AD
                boolean r2 = r2.hasLandPage
                if (r2 == 0) goto L_0x008b
                boolean r2 = com.ss.android.ugc.aweme.commercialize.utils.c.u(r22)
                if (r2 == 0) goto L_0x0085
                com.ss.android.ugc.aweme.profile.model.User r2 = r22.getAuthor()
                boolean r2 = com.ss.android.ugc.aweme.utils.ex.p(r2)
                if (r2 != 0) goto L_0x0088
            L_0x0085:
                com.ss.android.ugc.aweme.commercialize.log.g.e((android.content.Context) r21, (com.ss.android.ugc.aweme.feed.model.Aweme) r22)
            L_0x0088:
                com.ss.android.ugc.aweme.commercialize.log.g.c((android.content.Context) r21, (com.ss.android.ugc.aweme.feed.model.Aweme) r22, (java.lang.String) r23)
            L_0x008b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.feed.am.AnonymousClass1.clickAvatar(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):void");
        }

        public final boolean enterAdPage(Context context, Aweme aweme, boolean z) {
            if (PatchProxy.isSupport(new Object[]{context, aweme, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 30779, new Class[]{Context.class, Aweme.class, Boolean.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, aweme, Byte.valueOf(z)}, this, changeQuickRedirect, false, 30779, new Class[]{Context.class, Aweme.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
            } else if (!com.ss.android.g.a.a()) {
                return false;
            } else {
                if (RAW_AD.hasLandPage && z) {
                    g.b(context, aweme);
                    g.d(context, aweme);
                }
                if (RAW_AD.isRealAuthor || !RAW_AD.hasLandPage) {
                    return false;
                }
                return true;
            }
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean clickAdTransform(android.content.Context r29, com.ss.android.ugc.aweme.feed.model.Aweme r30, int r31) {
            /*
                r28 = this;
                r0 = r29
                r1 = r30
                r2 = r31
                r3 = 3
                java.lang.Object[] r4 = new java.lang.Object[r3]
                r11 = 0
                r4[r11] = r0
                r12 = 1
                r4[r12] = r1
                java.lang.Integer r5 = java.lang.Integer.valueOf(r31)
                r13 = 2
                r4[r13] = r5
                com.meituan.robust.ChangeQuickRedirect r6 = changeQuickRedirect
                java.lang.Class[] r9 = new java.lang.Class[r3]
                java.lang.Class<android.content.Context> r5 = android.content.Context.class
                r9[r11] = r5
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r5 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r9[r12] = r5
                java.lang.Class r5 = java.lang.Integer.TYPE
                r9[r13] = r5
                java.lang.Class r10 = java.lang.Boolean.TYPE
                r7 = 0
                r8 = 30780(0x783c, float:4.3132E-41)
                r5 = r28
                boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
                if (r4 == 0) goto L_0x0064
                java.lang.Object[] r14 = new java.lang.Object[r3]
                r14[r11] = r0
                r14[r12] = r1
                java.lang.Integer r0 = java.lang.Integer.valueOf(r31)
                r14[r13] = r0
                com.meituan.robust.ChangeQuickRedirect r16 = changeQuickRedirect
                r17 = 0
                r18 = 30780(0x783c, float:4.3132E-41)
                java.lang.Class[] r0 = new java.lang.Class[r3]
                java.lang.Class<android.content.Context> r1 = android.content.Context.class
                r0[r11] = r1
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r0[r12] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r0[r13] = r1
                java.lang.Class r20 = java.lang.Boolean.TYPE
                r15 = r28
                r19 = r0
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                return r0
            L_0x0064:
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r4 = r30.getAwemeRawAd()
                java.lang.String r4 = r4.getType()
                boolean r5 = android.text.TextUtils.isEmpty(r4)
                if (r5 == 0) goto L_0x0073
                return r11
            L_0x0073:
                if (r1 != 0) goto L_0x0076
                return r11
            L_0x0076:
                boolean r5 = r30.isAd()
                if (r5 != 0) goto L_0x007d
                return r11
            L_0x007d:
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r5 = r30.getAwemeRawAd()
                java.lang.String r5 = r5.getOpenUrl()
                if (r2 != r12) goto L_0x00ed
                com.ss.android.ugc.aweme.commercialize.feed.am r6 = RAW_AD
                boolean r6 = r6.hasLandPage
                if (r6 != 0) goto L_0x0093
                com.ss.android.ugc.aweme.commercialize.feed.am r6 = RAW_AD
                boolean r6 = r6.hasOpenUrl
                if (r6 == 0) goto L_0x00ed
            L_0x0093:
                boolean r6 = com.ss.android.ugc.aweme.commercialize.im.f.b((java.lang.String) r5)
                if (r6 == 0) goto L_0x00e7
                java.lang.Object[] r14 = new java.lang.Object[r13]
                r14[r11] = r0
                r14[r12] = r1
                r15 = 0
                com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
                r17 = 1
                r18 = 31578(0x7b5a, float:4.425E-41)
                java.lang.Class[] r6 = new java.lang.Class[r13]
                java.lang.Class<android.content.Context> r7 = android.content.Context.class
                r6[r11] = r7
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r7 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r6[r12] = r7
                java.lang.Class r20 = java.lang.Void.TYPE
                r19 = r6
                boolean r6 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)
                if (r6 == 0) goto L_0x00d9
                java.lang.Object[] r14 = new java.lang.Object[r13]
                r14[r11] = r0
                r14[r12] = r1
                r15 = 0
                com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
                r17 = 1
                r18 = 31578(0x7b5a, float:4.425E-41)
                java.lang.Class[] r6 = new java.lang.Class[r13]
                java.lang.Class<android.content.Context> r7 = android.content.Context.class
                r6[r11] = r7
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r7 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r6[r12] = r7
                java.lang.Class r20 = java.lang.Void.TYPE
                r19 = r6
                com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
                goto L_0x00ea
            L_0x00d9:
                java.lang.String r6 = "draw_ad"
                java.lang.String r7 = "click_message"
                java.lang.String r8 = "raw ad click"
                org.json.JSONObject r8 = com.ss.android.ugc.aweme.commercialize.log.g.a((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (java.lang.String) r8, (boolean) r11)
                com.ss.android.ugc.aweme.commercialize.log.g.a((android.content.Context) r0, (java.lang.String) r6, (java.lang.String) r7, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (org.json.JSONObject) r8)
                goto L_0x00ea
            L_0x00e7:
                com.ss.android.ugc.aweme.commercialize.log.g.b((android.content.Context) r29, (com.ss.android.ugc.aweme.feed.model.Aweme) r30)
            L_0x00ea:
                com.ss.android.ugc.aweme.commercialize.log.g.d((android.content.Context) r29, (com.ss.android.ugc.aweme.feed.model.Aweme) r30)
            L_0x00ed:
                java.util.HashMap r6 = new java.util.HashMap
                r6.<init>()
                r7 = -1
                int r8 = r4.hashCode()
                switch(r8) {
                    case -1354573786: goto L_0x0137;
                    case 96801: goto L_0x012d;
                    case 117588: goto L_0x0123;
                    case 3083120: goto L_0x0119;
                    case 3148996: goto L_0x010f;
                    case 957829685: goto L_0x0105;
                    case 1893962841: goto L_0x00fb;
                    default: goto L_0x00fa;
                }
            L_0x00fa:
                goto L_0x0141
            L_0x00fb:
                java.lang.String r8 = "redpacket"
                boolean r4 = r4.equals(r8)
                if (r4 == 0) goto L_0x0141
                r4 = 6
                goto L_0x0142
            L_0x0105:
                java.lang.String r8 = "counsel"
                boolean r4 = r4.equals(r8)
                if (r4 == 0) goto L_0x0141
                r4 = 0
                goto L_0x0142
            L_0x010f:
                java.lang.String r8 = "form"
                boolean r4 = r4.equals(r8)
                if (r4 == 0) goto L_0x0141
                r4 = 5
                goto L_0x0142
            L_0x0119:
                java.lang.String r8 = "dial"
                boolean r4 = r4.equals(r8)
                if (r4 == 0) goto L_0x0141
                r4 = 4
                goto L_0x0142
            L_0x0123:
                java.lang.String r8 = "web"
                boolean r4 = r4.equals(r8)
                if (r4 == 0) goto L_0x0141
                r4 = 1
                goto L_0x0142
            L_0x012d:
                java.lang.String r8 = "app"
                boolean r4 = r4.equals(r8)
                if (r4 == 0) goto L_0x0141
                r4 = 3
                goto L_0x0142
            L_0x0137:
                java.lang.String r8 = "coupon"
                boolean r4 = r4.equals(r8)
                if (r4 == 0) goto L_0x0141
                r4 = 2
                goto L_0x0142
            L_0x0141:
                r4 = -1
            L_0x0142:
                r8 = 20
                r9 = 19
                r10 = 12
                r14 = 14
                r15 = 0
                r7 = 11
                switch(r4) {
                    case 0: goto L_0x0557;
                    case 1: goto L_0x0557;
                    case 2: goto L_0x04d1;
                    case 3: goto L_0x0372;
                    case 4: goto L_0x02da;
                    case 5: goto L_0x0284;
                    case 6: goto L_0x0152;
                    default: goto L_0x0150;
                }
            L_0x0150:
                goto L_0x069c
            L_0x0152:
                if (r2 != r13) goto L_0x01a4
                java.lang.Object[] r2 = new java.lang.Object[r13]
                r2[r11] = r0
                r2[r12] = r1
                r22 = 0
                com.meituan.robust.ChangeQuickRedirect r23 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
                r24 = 1
                r25 = 31585(0x7b61, float:4.426E-41)
                java.lang.Class[] r3 = new java.lang.Class[r13]
                java.lang.Class<android.content.Context> r4 = android.content.Context.class
                r3[r11] = r4
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r4 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r3[r12] = r4
                java.lang.Class r27 = java.lang.Void.TYPE
                r21 = r2
                r26 = r3
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r21, r22, r23, r24, r25, r26, r27)
                if (r2 == 0) goto L_0x0194
                java.lang.Object[] r3 = new java.lang.Object[r13]
                r3[r11] = r0
                r3[r12] = r1
                r4 = 0
                com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
                r6 = 1
                r7 = 31585(0x7b61, float:4.426E-41)
                java.lang.Class[] r8 = new java.lang.Class[r13]
                java.lang.Class<android.content.Context> r2 = android.content.Context.class
                r8[r11] = r2
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r8[r12] = r2
                java.lang.Class r9 = java.lang.Void.TYPE
                com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
                goto L_0x019f
            L_0x0194:
                java.lang.String r2 = "click_redpacket"
                java.lang.String r3 = "raw ad click red packet"
                org.json.JSONObject r3 = com.ss.android.ugc.aweme.commercialize.log.g.f(r0, r1, r3)
                com.ss.android.ugc.aweme.commercialize.log.g.b((android.content.Context) r0, (java.lang.String) r2, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (org.json.JSONObject) r3)
            L_0x019f:
                com.ss.android.ugc.aweme.commercialize.log.g.d((android.content.Context) r29, (com.ss.android.ugc.aweme.feed.model.Aweme) r30)
                goto L_0x069c
            L_0x01a4:
                if (r2 != r3) goto L_0x01f0
                java.lang.Object[] r4 = new java.lang.Object[r13]
                r4[r11] = r0
                r4[r12] = r1
                r5 = 0
                com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
                r7 = 1
                r8 = 31600(0x7b70, float:4.4281E-41)
                java.lang.Class[] r9 = new java.lang.Class[r13]
                java.lang.Class<android.content.Context> r2 = android.content.Context.class
                r9[r11] = r2
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r9[r12] = r2
                java.lang.Class r10 = java.lang.Void.TYPE
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
                if (r2 == 0) goto L_0x01e0
                java.lang.Object[] r3 = new java.lang.Object[r13]
                r3[r11] = r0
                r3[r12] = r1
                r4 = 0
                com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
                r6 = 1
                r7 = 31600(0x7b70, float:4.4281E-41)
                java.lang.Class[] r8 = new java.lang.Class[r13]
                java.lang.Class<android.content.Context> r2 = android.content.Context.class
                r8[r11] = r2
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r8[r12] = r2
                java.lang.Class r9 = java.lang.Void.TYPE
                com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
                goto L_0x01eb
            L_0x01e0:
                java.lang.String r2 = "click_redpacket"
                java.lang.String r3 = "raw ad background click red packet"
                org.json.JSONObject r3 = com.ss.android.ugc.aweme.commercialize.log.g.f(r0, r1, r3)
                com.ss.android.ugc.aweme.commercialize.log.g.c((android.content.Context) r0, (java.lang.String) r2, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (org.json.JSONObject) r3)
            L_0x01eb:
                com.ss.android.ugc.aweme.commercialize.log.g.b((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (java.util.Map<java.lang.String, java.lang.String>) r15)
                goto L_0x069c
            L_0x01f0:
                r3 = 9
                if (r2 != r3) goto L_0x069c
                java.lang.Object[] r4 = new java.lang.Object[r13]
                r4[r11] = r0
                r4[r12] = r1
                r5 = 0
                com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
                r7 = 1
                r8 = 31631(0x7b8f, float:4.4324E-41)
                java.lang.Class[] r9 = new java.lang.Class[r13]
                java.lang.Class<android.content.Context> r2 = android.content.Context.class
                r9[r11] = r2
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r9[r12] = r2
                java.lang.Class r10 = java.lang.Void.TYPE
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
                if (r2 == 0) goto L_0x022e
                java.lang.Object[] r3 = new java.lang.Object[r13]
                r3[r11] = r0
                r3[r12] = r1
                r4 = 0
                com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
                r6 = 1
                r7 = 31631(0x7b8f, float:4.4324E-41)
                java.lang.Class[] r8 = new java.lang.Class[r13]
                java.lang.Class<android.content.Context> r2 = android.content.Context.class
                r8[r11] = r2
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r8[r12] = r2
                java.lang.Class r9 = java.lang.Void.TYPE
                com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
                goto L_0x023c
            L_0x022e:
                java.lang.String r2 = "click"
                java.lang.String r3 = "raw feed red packet coupon click"
                org.json.JSONObject r3 = com.ss.android.ugc.aweme.commercialize.log.g.a((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (java.lang.String) r3, (boolean) r12)
                com.ss.android.ugc.aweme.commercialize.log.g.f(r0, r2, r1, r3)
                com.ss.android.ugc.aweme.commercialize.log.g.b((com.ss.android.ugc.aweme.feed.model.Aweme) r30)
            L_0x023c:
                java.lang.Object[] r4 = new java.lang.Object[r13]
                r4[r11] = r0
                r4[r12] = r1
                r5 = 0
                com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
                r7 = 1
                r8 = 31632(0x7b90, float:4.4326E-41)
                java.lang.Class[] r9 = new java.lang.Class[r13]
                java.lang.Class<android.content.Context> r2 = android.content.Context.class
                r9[r11] = r2
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r9[r12] = r2
                java.lang.Class r10 = java.lang.Void.TYPE
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
                if (r2 == 0) goto L_0x0277
                java.lang.Object[] r3 = new java.lang.Object[r13]
                r3[r11] = r0
                r3[r12] = r1
                r4 = 0
                com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
                r6 = 1
                r7 = 31632(0x7b90, float:4.4326E-41)
                java.lang.Class[] r8 = new java.lang.Class[r13]
                java.lang.Class<android.content.Context> r0 = android.content.Context.class
                r8[r11] = r0
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r8[r12] = r0
                java.lang.Class r9 = java.lang.Void.TYPE
                com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
                goto L_0x069c
            L_0x0277:
                java.lang.String r2 = "click_redpacket"
                java.lang.String r3 = "raw feed red packet coupon click red packet"
                org.json.JSONObject r3 = com.ss.android.ugc.aweme.commercialize.log.g.f(r0, r1, r3)
                com.ss.android.ugc.aweme.commercialize.log.g.f(r0, r2, r1, r3)
                goto L_0x069c
            L_0x0284:
                if (r2 != r13) goto L_0x02d0
                java.lang.Object[] r4 = new java.lang.Object[r13]
                r4[r11] = r0
                r4[r12] = r1
                r5 = 0
                com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
                r7 = 1
                r8 = 31562(0x7b4a, float:4.4228E-41)
                java.lang.Class[] r9 = new java.lang.Class[r13]
                java.lang.Class<android.content.Context> r2 = android.content.Context.class
                r9[r11] = r2
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r9[r12] = r2
                java.lang.Class r10 = java.lang.Void.TYPE
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
                if (r2 == 0) goto L_0x02c0
                java.lang.Object[] r3 = new java.lang.Object[r13]
                r3[r11] = r0
                r3[r12] = r1
                r4 = 0
                com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
                r6 = 1
                r7 = 31562(0x7b4a, float:4.4228E-41)
                java.lang.Class[] r8 = new java.lang.Class[r13]
                java.lang.Class<android.content.Context> r2 = android.content.Context.class
                r8[r11] = r2
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r8[r12] = r2
                java.lang.Class r9 = java.lang.Void.TYPE
                com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
                goto L_0x02cb
            L_0x02c0:
                java.lang.String r2 = "click_form"
                java.lang.String r3 = "raw ad form click"
                org.json.JSONObject r3 = com.ss.android.ugc.aweme.commercialize.log.g.f(r0, r1, r3)
                com.ss.android.ugc.aweme.commercialize.log.g.b((android.content.Context) r0, (java.lang.String) r2, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (org.json.JSONObject) r3)
            L_0x02cb:
                com.ss.android.ugc.aweme.commercialize.log.g.d((android.content.Context) r29, (com.ss.android.ugc.aweme.feed.model.Aweme) r30)
                goto L_0x069c
            L_0x02d0:
                if (r2 != r3) goto L_0x069c
                com.ss.android.ugc.aweme.commercialize.log.g.p(r29, r30)
                com.ss.android.ugc.aweme.commercialize.log.g.b((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (java.util.Map<java.lang.String, java.lang.String>) r15)
                goto L_0x069c
            L_0x02da:
                if (r2 != r13) goto L_0x0326
                java.lang.Object[] r4 = new java.lang.Object[r13]
                r4[r11] = r0
                r4[r12] = r1
                r5 = 0
                com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
                r7 = 1
                r8 = 31561(0x7b49, float:4.4226E-41)
                java.lang.Class[] r9 = new java.lang.Class[r13]
                java.lang.Class<android.content.Context> r2 = android.content.Context.class
                r9[r11] = r2
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r9[r12] = r2
                java.lang.Class r10 = java.lang.Void.TYPE
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
                if (r2 == 0) goto L_0x0316
                java.lang.Object[] r3 = new java.lang.Object[r13]
                r3[r11] = r0
                r3[r12] = r1
                r4 = 0
                com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
                r6 = 1
                r7 = 31561(0x7b49, float:4.4226E-41)
                java.lang.Class[] r8 = new java.lang.Class[r13]
                java.lang.Class<android.content.Context> r2 = android.content.Context.class
                r8[r11] = r2
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r8[r12] = r2
                java.lang.Class r9 = java.lang.Void.TYPE
                com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
                goto L_0x0321
            L_0x0316:
                java.lang.String r2 = "click_call"
                java.lang.String r3 = "raw ad phone click"
                org.json.JSONObject r3 = com.ss.android.ugc.aweme.commercialize.log.g.f(r0, r1, r3)
                com.ss.android.ugc.aweme.commercialize.log.g.b((android.content.Context) r0, (java.lang.String) r2, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (org.json.JSONObject) r3)
            L_0x0321:
                com.ss.android.ugc.aweme.commercialize.log.g.d((android.content.Context) r29, (com.ss.android.ugc.aweme.feed.model.Aweme) r30)
                goto L_0x069c
            L_0x0326:
                if (r2 != r3) goto L_0x069c
                java.lang.Object[] r4 = new java.lang.Object[r13]
                r4[r11] = r0
                r4[r12] = r1
                r5 = 0
                com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
                r7 = 1
                r8 = 31557(0x7b45, float:4.4221E-41)
                java.lang.Class[] r9 = new java.lang.Class[r13]
                java.lang.Class<android.content.Context> r2 = android.content.Context.class
                r9[r11] = r2
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r9[r12] = r2
                java.lang.Class r10 = java.lang.Void.TYPE
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
                if (r2 == 0) goto L_0x0362
                java.lang.Object[] r3 = new java.lang.Object[r13]
                r3[r11] = r0
                r3[r12] = r1
                r4 = 0
                com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
                r6 = 1
                r7 = 31557(0x7b45, float:4.4221E-41)
                java.lang.Class[] r8 = new java.lang.Class[r13]
                java.lang.Class<android.content.Context> r2 = android.content.Context.class
                r8[r11] = r2
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r8[r12] = r2
                java.lang.Class r9 = java.lang.Void.TYPE
                com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
                goto L_0x036d
            L_0x0362:
                java.lang.String r2 = "click_call"
                java.lang.String r3 = "raw ad background phone click"
                org.json.JSONObject r3 = com.ss.android.ugc.aweme.commercialize.log.g.f(r0, r1, r3)
                com.ss.android.ugc.aweme.commercialize.log.g.c((android.content.Context) r0, (java.lang.String) r2, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (org.json.JSONObject) r3)
            L_0x036d:
                com.ss.android.ugc.aweme.commercialize.log.g.b((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (java.util.Map<java.lang.String, java.lang.String>) r15)
                goto L_0x069c
            L_0x0372:
                boolean r4 = com.ss.android.g.a.a()
                if (r4 == 0) goto L_0x0482
                if (r2 != r13) goto L_0x0421
                java.lang.Object[] r3 = new java.lang.Object[r13]
                r3[r11] = r0
                r3[r12] = r1
                r22 = 0
                com.meituan.robust.ChangeQuickRedirect r23 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
                r24 = 1
                r25 = 31602(0x7b72, float:4.4284E-41)
                java.lang.Class[] r4 = new java.lang.Class[r13]
                java.lang.Class<android.content.Context> r5 = android.content.Context.class
                r4[r11] = r5
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r5 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r4[r12] = r5
                java.lang.Class r27 = java.lang.Void.TYPE
                r21 = r3
                r26 = r4
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r21, r22, r23, r24, r25, r26, r27)
                if (r3 == 0) goto L_0x03c0
                java.lang.Object[] r3 = new java.lang.Object[r13]
                r3[r11] = r0
                r3[r12] = r1
                r22 = 0
                com.meituan.robust.ChangeQuickRedirect r23 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
                r24 = 1
                r25 = 31602(0x7b72, float:4.4284E-41)
                java.lang.Class[] r4 = new java.lang.Class[r13]
                java.lang.Class<android.content.Context> r5 = android.content.Context.class
                r4[r11] = r5
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r5 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r4[r12] = r5
                java.lang.Class r27 = java.lang.Void.TYPE
                r21 = r3
                r26 = r4
                com.meituan.robust.PatchProxy.accessDispatch(r21, r22, r23, r24, r25, r26, r27)
                goto L_0x03cb
            L_0x03c0:
                java.lang.String r3 = "click_start"
                java.lang.String r4 = "raw download ad click start"
                org.json.JSONObject r4 = com.ss.android.ugc.aweme.commercialize.log.g.f(r0, r1, r4)
                com.ss.android.ugc.aweme.commercialize.log.g.e(r0, r3, r1, r4)
            L_0x03cb:
                java.lang.Object[] r3 = new java.lang.Object[r13]
                r3[r11] = r0
                r3[r12] = r1
                r22 = 0
                com.meituan.robust.ChangeQuickRedirect r23 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
                r24 = 1
                r25 = 31601(0x7b71, float:4.4282E-41)
                java.lang.Class[] r4 = new java.lang.Class[r13]
                java.lang.Class<android.content.Context> r5 = android.content.Context.class
                r4[r11] = r5
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r5 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r4[r12] = r5
                java.lang.Class r27 = java.lang.Void.TYPE
                r21 = r3
                r26 = r4
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r21, r22, r23, r24, r25, r26, r27)
                if (r3 == 0) goto L_0x0412
                java.lang.Object[] r3 = new java.lang.Object[r13]
                r3[r11] = r0
                r3[r12] = r1
                r22 = 0
                com.meituan.robust.ChangeQuickRedirect r23 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
                r24 = 1
                r25 = 31601(0x7b71, float:4.4282E-41)
                java.lang.Class[] r4 = new java.lang.Class[r13]
                java.lang.Class<android.content.Context> r5 = android.content.Context.class
                r4[r11] = r5
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r5 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r4[r12] = r5
                java.lang.Class r27 = java.lang.Void.TYPE
                r21 = r3
                r26 = r4
                com.meituan.robust.PatchProxy.accessDispatch(r21, r22, r23, r24, r25, r26, r27)
                goto L_0x0482
            L_0x0412:
                java.lang.String r3 = "click"
                java.lang.String r4 = "raw download ad click"
                org.json.JSONObject r4 = com.ss.android.ugc.aweme.commercialize.log.g.a((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (java.lang.String) r4, (boolean) r12)
                com.ss.android.ugc.aweme.commercialize.log.g.e(r0, r3, r1, r4)
                com.ss.android.ugc.aweme.commercialize.log.g.b((com.ss.android.ugc.aweme.feed.model.Aweme) r30)
                goto L_0x0482
            L_0x0421:
                if (r2 != r3) goto L_0x0478
                java.lang.Object[] r3 = new java.lang.Object[r13]
                r3[r11] = r0
                r3[r12] = r1
                r22 = 0
                com.meituan.robust.ChangeQuickRedirect r23 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
                r24 = 1
                r25 = 31554(0x7b42, float:4.4217E-41)
                java.lang.Class[] r4 = new java.lang.Class[r13]
                java.lang.Class<android.content.Context> r5 = android.content.Context.class
                r4[r11] = r5
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r5 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r4[r12] = r5
                java.lang.Class r27 = java.lang.Void.TYPE
                r21 = r3
                r26 = r4
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r21, r22, r23, r24, r25, r26, r27)
                if (r3 == 0) goto L_0x0469
                java.lang.Object[] r3 = new java.lang.Object[r13]
                r3[r11] = r0
                r3[r12] = r1
                r22 = 0
                com.meituan.robust.ChangeQuickRedirect r23 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
                r24 = 1
                r25 = 31554(0x7b42, float:4.4217E-41)
                java.lang.Class[] r4 = new java.lang.Class[r13]
                java.lang.Class<android.content.Context> r5 = android.content.Context.class
                r4[r11] = r5
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r5 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r4[r12] = r5
                java.lang.Class r27 = java.lang.Void.TYPE
                r21 = r3
                r26 = r4
                com.meituan.robust.PatchProxy.accessDispatch(r21, r22, r23, r24, r25, r26, r27)
                goto L_0x0474
            L_0x0469:
                java.lang.String r3 = "click_start"
                java.lang.String r4 = "raw ad background click"
                org.json.JSONObject r4 = com.ss.android.ugc.aweme.commercialize.log.g.f(r0, r1, r4)
                com.ss.android.ugc.aweme.commercialize.log.g.c((android.content.Context) r0, (java.lang.String) r3, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (org.json.JSONObject) r4)
            L_0x0474:
                com.ss.android.ugc.aweme.commercialize.log.g.b((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (java.util.Map<java.lang.String, java.lang.String>) r6)
                goto L_0x0482
            L_0x0478:
                r3 = 8
                if (r2 != r3) goto L_0x0482
                com.ss.android.ugc.aweme.commercialize.log.g.C(r29, r30)
                com.ss.android.ugc.aweme.commercialize.log.g.D(r29, r30)
            L_0x0482:
                if (r2 != r7) goto L_0x0490
                java.lang.String r2 = "refer"
                java.lang.String r3 = "photo"
                r6.put(r2, r3)
                com.ss.android.ugc.aweme.commercialize.log.g.b((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (java.util.Map<java.lang.String, java.lang.String>) r6)
                goto L_0x069c
            L_0x0490:
                if (r2 != r9) goto L_0x049e
                java.lang.String r2 = "refer"
                java.lang.String r3 = "image"
                r6.put(r2, r3)
                com.ss.android.ugc.aweme.commercialize.log.g.b((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (java.util.Map<java.lang.String, java.lang.String>) r6)
                goto L_0x069c
            L_0x049e:
                if (r2 != r14) goto L_0x04ac
                java.lang.String r2 = "refer"
                java.lang.String r3 = "name"
                r6.put(r2, r3)
                com.ss.android.ugc.aweme.commercialize.log.g.b((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (java.util.Map<java.lang.String, java.lang.String>) r6)
                goto L_0x069c
            L_0x04ac:
                if (r2 == r10) goto L_0x04c5
                if (r2 != r8) goto L_0x04b1
                goto L_0x04c5
            L_0x04b1:
                r3 = 13
                if (r2 == r3) goto L_0x04b9
                r3 = 15
                if (r2 != r3) goto L_0x069c
            L_0x04b9:
                java.lang.String r2 = "refer"
                java.lang.String r3 = "hot_region"
                r6.put(r2, r3)
                com.ss.android.ugc.aweme.commercialize.log.g.b((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (java.util.Map<java.lang.String, java.lang.String>) r6)
                goto L_0x069c
            L_0x04c5:
                java.lang.String r2 = "refer"
                java.lang.String r3 = "title"
                r6.put(r2, r3)
                com.ss.android.ugc.aweme.commercialize.log.g.b((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (java.util.Map<java.lang.String, java.lang.String>) r6)
                goto L_0x069c
            L_0x04d1:
                if (r2 != r13) goto L_0x04db
                com.ss.android.ugc.aweme.commercialize.log.g.r(r29, r30)
                com.ss.android.ugc.aweme.commercialize.log.g.d((android.content.Context) r29, (com.ss.android.ugc.aweme.feed.model.Aweme) r30)
                goto L_0x069c
            L_0x04db:
                if (r2 != r3) goto L_0x052d
                java.lang.Object[] r14 = new java.lang.Object[r13]
                r14[r11] = r0
                r14[r12] = r1
                r15 = 0
                com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
                r17 = 1
                r18 = 31556(0x7b44, float:4.422E-41)
                java.lang.Class[] r2 = new java.lang.Class[r13]
                java.lang.Class<android.content.Context> r3 = android.content.Context.class
                r2[r11] = r3
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r2[r12] = r3
                java.lang.Class r20 = java.lang.Void.TYPE
                r19 = r2
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)
                if (r2 == 0) goto L_0x051d
                java.lang.Object[] r14 = new java.lang.Object[r13]
                r14[r11] = r0
                r14[r12] = r1
                r15 = 0
                com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
                r17 = 1
                r18 = 31556(0x7b44, float:4.422E-41)
                java.lang.Class[] r2 = new java.lang.Class[r13]
                java.lang.Class<android.content.Context> r3 = android.content.Context.class
                r2[r11] = r3
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r2[r12] = r3
                java.lang.Class r20 = java.lang.Void.TYPE
                r19 = r2
                com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
                goto L_0x0528
            L_0x051d:
                java.lang.String r2 = "click_coupon"
                java.lang.String r3 = "raw ad background coupon click"
                org.json.JSONObject r3 = com.ss.android.ugc.aweme.commercialize.log.g.f(r0, r1, r3)
                com.ss.android.ugc.aweme.commercialize.log.g.c((android.content.Context) r0, (java.lang.String) r2, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (org.json.JSONObject) r3)
            L_0x0528:
                com.ss.android.ugc.aweme.commercialize.log.g.b((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (java.util.Map<java.lang.String, java.lang.String>) r6)
                goto L_0x069c
            L_0x052d:
                if (r2 != r7) goto L_0x053b
                java.lang.String r2 = "refer"
                java.lang.String r3 = "photo"
                r6.put(r2, r3)
                com.ss.android.ugc.aweme.commercialize.log.g.b((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (java.util.Map<java.lang.String, java.lang.String>) r6)
                goto L_0x069c
            L_0x053b:
                if (r2 != r14) goto L_0x0549
                java.lang.String r2 = "refer"
                java.lang.String r3 = "name"
                r6.put(r2, r3)
                com.ss.android.ugc.aweme.commercialize.log.g.b((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (java.util.Map<java.lang.String, java.lang.String>) r6)
                goto L_0x069c
            L_0x0549:
                if (r2 != r10) goto L_0x069c
                java.lang.String r2 = "refer"
                java.lang.String r3 = "title"
                r6.put(r2, r3)
                com.ss.android.ugc.aweme.commercialize.log.g.b((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (java.util.Map<java.lang.String, java.lang.String>) r6)
                goto L_0x069c
            L_0x0557:
                if (r2 != r13) goto L_0x05ef
                boolean r2 = com.ss.android.ugc.aweme.commercialize.im.f.b((java.lang.String) r5)
                if (r2 == 0) goto L_0x05a5
                java.lang.Object[] r3 = new java.lang.Object[r13]
                r3[r11] = r0
                r3[r12] = r1
                r4 = 0
                com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
                r6 = 1
                r7 = 31571(0x7b53, float:4.424E-41)
                java.lang.Class[] r8 = new java.lang.Class[r13]
                java.lang.Class<android.content.Context> r2 = android.content.Context.class
                r8[r11] = r2
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r8[r12] = r2
                java.lang.Class r9 = java.lang.Void.TYPE
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
                if (r2 == 0) goto L_0x0599
                java.lang.Object[] r3 = new java.lang.Object[r13]
                r3[r11] = r0
                r3[r12] = r1
                r4 = 0
                com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
                r6 = 1
                r7 = 31571(0x7b53, float:4.424E-41)
                java.lang.Class[] r8 = new java.lang.Class[r13]
                java.lang.Class<android.content.Context> r2 = android.content.Context.class
                r8[r11] = r2
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r8[r12] = r2
                java.lang.Class r9 = java.lang.Void.TYPE
                com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
                goto L_0x05ea
            L_0x0599:
                java.lang.String r2 = "click_message"
                java.lang.String r3 = "raw ad click"
                org.json.JSONObject r3 = com.ss.android.ugc.aweme.commercialize.log.g.a((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (java.lang.String) r3, (boolean) r11)
                com.ss.android.ugc.aweme.commercialize.log.g.b((android.content.Context) r0, (java.lang.String) r2, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (org.json.JSONObject) r3)
                goto L_0x05ea
            L_0x05a5:
                java.lang.Object[] r4 = new java.lang.Object[r13]
                r4[r11] = r0
                r4[r12] = r1
                r5 = 0
                com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
                r7 = 1
                r8 = 31559(0x7b47, float:4.4224E-41)
                java.lang.Class[] r9 = new java.lang.Class[r13]
                java.lang.Class<android.content.Context> r2 = android.content.Context.class
                r9[r11] = r2
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r9[r12] = r2
                java.lang.Class r10 = java.lang.Void.TYPE
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
                if (r2 == 0) goto L_0x05df
                java.lang.Object[] r3 = new java.lang.Object[r13]
                r3[r11] = r0
                r3[r12] = r1
                r4 = 0
                com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
                r6 = 1
                r7 = 31559(0x7b47, float:4.4224E-41)
                java.lang.Class[] r8 = new java.lang.Class[r13]
                java.lang.Class<android.content.Context> r2 = android.content.Context.class
                r8[r11] = r2
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r8[r12] = r2
                java.lang.Class r9 = java.lang.Void.TYPE
                com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
                goto L_0x05ea
            L_0x05df:
                java.lang.String r2 = "click_button"
                java.lang.String r3 = "raw ad button click"
                org.json.JSONObject r3 = com.ss.android.ugc.aweme.commercialize.log.g.f(r0, r1, r3)
                com.ss.android.ugc.aweme.commercialize.log.g.b((android.content.Context) r0, (java.lang.String) r2, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (org.json.JSONObject) r3)
            L_0x05ea:
                com.ss.android.ugc.aweme.commercialize.log.g.d((android.content.Context) r29, (com.ss.android.ugc.aweme.feed.model.Aweme) r30)
                goto L_0x069c
            L_0x05ef:
                if (r2 != r3) goto L_0x0653
                boolean r2 = com.ss.android.ugc.aweme.commercialize.im.f.b((java.lang.String) r5)
                if (r2 == 0) goto L_0x0645
                java.lang.Object[] r14 = new java.lang.Object[r13]
                r14[r11] = r0
                r14[r12] = r1
                r15 = 0
                com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
                r17 = 1
                r18 = 31572(0x7b54, float:4.4242E-41)
                java.lang.Class[] r2 = new java.lang.Class[r13]
                java.lang.Class<android.content.Context> r3 = android.content.Context.class
                r2[r11] = r3
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r2[r12] = r3
                java.lang.Class r20 = java.lang.Void.TYPE
                r19 = r2
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)
                if (r2 == 0) goto L_0x0637
                java.lang.Object[] r14 = new java.lang.Object[r13]
                r14[r11] = r0
                r14[r12] = r1
                r15 = 0
                com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.commercialize.log.g.f39316a
                r17 = 1
                r18 = 31572(0x7b54, float:4.4242E-41)
                java.lang.Class[] r2 = new java.lang.Class[r13]
                java.lang.Class<android.content.Context> r3 = android.content.Context.class
                r2[r11] = r3
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = com.ss.android.ugc.aweme.feed.model.Aweme.class
                r2[r12] = r3
                java.lang.Class r20 = java.lang.Void.TYPE
                r19 = r2
                com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
                goto L_0x0648
            L_0x0637:
                java.lang.String r2 = "background_ad"
                java.lang.String r3 = "click_message"
                java.lang.String r4 = "raw ad click"
                org.json.JSONObject r4 = com.ss.android.ugc.aweme.commercialize.log.g.a((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (java.lang.String) r4, (boolean) r11)
                com.ss.android.ugc.aweme.commercialize.log.g.a((android.content.Context) r0, (java.lang.String) r2, (java.lang.String) r3, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (org.json.JSONObject) r4)
                goto L_0x0648
            L_0x0645:
                com.ss.android.ugc.aweme.commercialize.log.g.p(r29, r30)
            L_0x0648:
                java.lang.String r2 = "refer"
                java.lang.String r3 = "more_button"
                r6.put(r2, r3)
                com.ss.android.ugc.aweme.commercialize.log.g.b((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (java.util.Map<java.lang.String, java.lang.String>) r6)
                goto L_0x069c
            L_0x0653:
                if (r2 != r7) goto L_0x0660
                java.lang.String r2 = "refer"
                java.lang.String r3 = "photo"
                r6.put(r2, r3)
                com.ss.android.ugc.aweme.commercialize.log.g.b((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (java.util.Map<java.lang.String, java.lang.String>) r6)
                goto L_0x069c
            L_0x0660:
                if (r2 != r9) goto L_0x066d
                java.lang.String r2 = "refer"
                java.lang.String r3 = "image"
                r6.put(r2, r3)
                com.ss.android.ugc.aweme.commercialize.log.g.b((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (java.util.Map<java.lang.String, java.lang.String>) r6)
                goto L_0x069c
            L_0x066d:
                if (r2 != r14) goto L_0x067a
                java.lang.String r2 = "refer"
                java.lang.String r3 = "name"
                r6.put(r2, r3)
                com.ss.android.ugc.aweme.commercialize.log.g.b((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (java.util.Map<java.lang.String, java.lang.String>) r6)
                goto L_0x069c
            L_0x067a:
                if (r2 == r10) goto L_0x0692
                if (r2 != r8) goto L_0x067f
                goto L_0x0692
            L_0x067f:
                r3 = 13
                if (r2 == r3) goto L_0x0687
                r3 = 21
                if (r2 != r3) goto L_0x069c
            L_0x0687:
                java.lang.String r2 = "refer"
                java.lang.String r3 = "hot_region"
                r6.put(r2, r3)
                com.ss.android.ugc.aweme.commercialize.log.g.b((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (java.util.Map<java.lang.String, java.lang.String>) r6)
                goto L_0x069c
            L_0x0692:
                java.lang.String r2 = "refer"
                java.lang.String r3 = "title"
                r6.put(r2, r3)
                com.ss.android.ugc.aweme.commercialize.log.g.b((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (java.util.Map<java.lang.String, java.lang.String>) r6)
            L_0x069c:
                com.ss.android.ugc.aweme.commercialize.feed.am r0 = RAW_AD
                boolean r0 = r0.isRealAuthor
                if (r0 != 0) goto L_0x06a9
                com.ss.android.ugc.aweme.commercialize.feed.am r0 = RAW_AD
                boolean r0 = r0.hasLandPage
                if (r0 == 0) goto L_0x06a9
                return r12
            L_0x06a9:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.feed.am.AnonymousClass1.clickAdTransform(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, int):boolean");
        }

        public final void onPlayCompleted(Context context, Aweme aweme, long j, int i) {
            Context context2 = context;
            Aweme aweme2 = aweme;
            long j2 = j;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[]{context2, aweme2, new Long(j2), Integer.valueOf(i)}, this, changeQuickRedirect, false, 30774, new Class[]{Context.class, Aweme.class, Long.TYPE, Integer.TYPE}, Void.TYPE)) {
                Object[] objArr = {context2, aweme2, new Long(j2), Integer.valueOf(i)};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 30774, new Class[]{Context.class, Aweme.class, Long.TYPE, Integer.TYPE}, Void.TYPE);
            } else if (x.a(aweme)) {
                Video a2 = j.f53966b.a(aweme2);
                if (a2 != null) {
                    i2 = a2.getDuration();
                }
                g.b(context2, aweme2, j2 + x.b(), i2);
                x.c();
            } else {
                if (PatchProxy.isSupport(new Object[]{context2, aweme2, new Long(j2), Integer.valueOf(i)}, null, g.f39316a, true, 31504, new Class[]{Context.class, Aweme.class, Long.TYPE, Integer.TYPE}, Void.TYPE)) {
                    Object[] objArr3 = {context2, aweme2, new Long(j2), Integer.valueOf(i)};
                    Object[] objArr4 = objArr3;
                    PatchProxy.accessDispatch(objArr4, null, g.f39316a, true, 31504, new Class[]{Context.class, Aweme.class, Long.TYPE, Integer.TYPE}, Void.TYPE);
                } else if (aweme2 != null && aweme.getAwemeRawAd() != null) {
                    HashMap hashMap = new HashMap();
                    if (com.ss.android.g.a.a()) {
                        hashMap.put("play_order", Integer.valueOf(i));
                    }
                    if (al.e(aweme)) {
                        hashMap.put("is_pre_valid_action", Integer.valueOf(al.d(aweme) ? 1 : 0));
                    }
                    JSONObject a3 = g.a(context2, aweme2, "raw ad over duration", false, g.a((Map<String, Object>) hashMap));
                    try {
                        a3.put("duration", j2);
                        if (aweme.getVideo() != null) {
                            i2 = aweme.getVideo().getVideoLength();
                        }
                        a3.put("video_length", i2);
                    } catch (JSONException unused) {
                    }
                    al.b(aweme);
                    g.b(context2, "over", aweme2, a3);
                    g.d(aweme);
                }
            }
        }

        public final void destroyBreak(Context context, Aweme aweme, String str, long j, int i) {
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{context, aweme, str, new Long(j2), Integer.valueOf(i)}, this, changeQuickRedirect, false, 30771, new Class[]{Context.class, Aweme.class, String.class, Long.TYPE, Integer.TYPE}, Void.TYPE)) {
                Object[] objArr = {context, aweme, str, new Long(j2), Integer.valueOf(i)};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 30771, new Class[]{Context.class, Aweme.class, String.class, Long.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            logBreak(context, aweme, str, j, i);
        }

        public final void changePageBreak(Context context, Aweme aweme, Aweme aweme2, String str, long j, int i) {
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{context, aweme, aweme2, str, new Long(j2), Integer.valueOf(i)}, this, changeQuickRedirect, false, 30770, new Class[]{Context.class, Aweme.class, Aweme.class, String.class, Long.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, aweme, aweme2, str, new Long(j2), Integer.valueOf(i)}, this, changeQuickRedirect, false, 30770, new Class[]{Context.class, Aweme.class, Aweme.class, String.class, Long.TYPE, Integer.TYPE}, Void.TYPE);
            } else if (str != null && aweme2 != null) {
                if (aweme == null || !TextUtils.equals(aweme2.getAid(), aweme.getAid())) {
                    logBreak(context, aweme2, str, j, i);
                }
            }
        }
    },
    NONE {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final boolean clickAdTransform(Context context, Aweme aweme, int i) {
            return false;
        }

        public final void clickAvatar(Context context, Aweme aweme, String str) {
        }

        public final void clickDiggContainer(Context context, Aweme aweme, boolean z) {
        }

        public final void clickMusic(Context context, Aweme aweme) {
        }

        public final void clickUserName(Context context, Aweme aweme) {
        }

        public final void destroyBreak(Context context, Aweme aweme, String str, long j, int i) {
        }

        public final boolean enterAdPage(Context context, Aweme aweme, boolean z) {
            return false;
        }

        public final void flingToIndexChange(Context context, Aweme aweme) {
        }

        public final void handleVideoEventAvailable(Context context, Aweme aweme) {
        }

        public final boolean isAd() {
            return false;
        }

        public final void onEnd(Context context, Aweme aweme) {
        }

        public final void onPageSelected(Context context, Aweme aweme) {
        }

        public final void onPlayCompleted(Context context, Aweme aweme, long j, int i) {
        }

        public final void onVideoPageChange(Context context, Aweme aweme) {
        }

        public final void play(Context context, Aweme aweme, int i) {
        }

        public final void rePlay(Context context, Aweme aweme, int i) {
        }

        public final void changePageBreak(Context context, Aweme aweme, Aweme aweme2, String str, long j, int i) {
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{context, aweme, aweme2, str, new Long(j2), Integer.valueOf(i)}, this, changeQuickRedirect, false, 30784, new Class[]{Context.class, Aweme.class, Aweme.class, String.class, Long.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, aweme, aweme2, str, new Long(j2), Integer.valueOf(i)}, this, changeQuickRedirect, false, 30784, new Class[]{Context.class, Aweme.class, Aweme.class, String.class, Long.TYPE, Integer.TYPE}, Void.TYPE);
            } else if (str != null && aweme2 != null) {
                if (aweme == null || !TextUtils.equals(aweme2.getAid(), aweme.getAid())) {
                    logBreak(context, aweme2, str, j, i);
                }
            }
        }
    };
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean allowJumpToGooglePlay;
    private boolean enableComment;
    public boolean hasLandPage;
    public boolean hasOpenUrl;
    public boolean isDownloadMode;
    public boolean isRealAuthor;
    private boolean isWebMode;

    public boolean enableComment() {
        return this.enableComment;
    }

    public boolean isDownloadMode() {
        return this.isDownloadMode;
    }

    public boolean isRealAuthor() {
        return this.isRealAuthor;
    }

    public boolean hasLandPage() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 30764, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 30764, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (isAd() && this.hasLandPage) {
            z = true;
        }
        return z;
    }

    public boolean hasOpenUrl() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 30765, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 30765, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (isAd() && this.hasOpenUrl) {
            z = true;
        }
        return z;
    }

    public boolean isVastAndHttpUri(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, changeQuickRedirect, false, 30768, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, this, changeQuickRedirect, false, 30768, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || !aweme.isAd() || !RAW_AD.isWebMode || RAW_AD.isRealAuthor) {
            return false;
        } else {
            if (!com.ss.android.ugc.aweme.commercialize.utils.am.e(aweme) && !com.ss.android.ugc.aweme.commercialize.utils.am.f(aweme)) {
                return false;
            }
            String webUrl = aweme.getAwemeRawAd().getWebUrl();
            if (TextUtils.isEmpty(webUrl)) {
                return false;
            }
            return com.ss.android.ugc.aweme.commercialize.utils.g.a(Uri.parse(webUrl));
        }
    }

    public static am valueOf(Aweme aweme) {
        boolean z;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{aweme}, null, changeQuickRedirect, true, 30763, new Class[]{Aweme.class}, am.class)) {
            return (am) PatchProxy.accessDispatch(new Object[]{aweme}, null, changeQuickRedirect, true, 30763, new Class[]{Aweme.class}, am.class);
        } else if (!aweme.isAd() || aweme.getAwemeRawAd() == null) {
            NONE.hasLandPage = false;
            am amVar = NONE;
            if (aweme.getAuthor() == null || aweme.getAuthor().isAdFake()) {
                z = false;
            } else {
                z = true;
            }
            amVar.isRealAuthor = z;
            NONE.enableComment = !aweme.isCmtSwt();
            NONE.hasOpenUrl = false;
            NONE.isDownloadMode = false;
            NONE.isWebMode = false;
            NONE.allowJumpToGooglePlay = false;
            return NONE;
        } else {
            RAW_AD.hasLandPage = !TextUtils.isEmpty(aweme.getAwemeRawAd().getWebUrl());
            am amVar2 = RAW_AD;
            if (aweme.getAuthor() != null && !aweme.getAuthor().isAdFake()) {
                z2 = true;
            }
            amVar2.isRealAuthor = z2;
            RAW_AD.enableComment = true ^ aweme.isCmtSwt();
            String openUrl = aweme.getAwemeRawAd().getOpenUrl();
            RAW_AD.hasOpenUrl = com.ss.android.ugc.aweme.commercialize.utils.g.b(openUrl);
            RAW_AD.isDownloadMode = TextUtils.equals(aweme.getAwemeRawAd().getType(), PushConstants.EXTRA_APPLICATION_PENDING_INTENT);
            RAW_AD.isWebMode = TextUtils.equals(aweme.getAwemeRawAd().getType(), "web");
            RAW_AD.allowJumpToGooglePlay = aweme.getAwemeRawAd().allowJumpToPlayStore();
            return RAW_AD;
        }
    }

    public void clickAvatar(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, this, changeQuickRedirect, false, 30769, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, this, changeQuickRedirect, false, 30769, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{this, context2, aweme2}, null, i.f38833a, true, 30589, new Class[]{h.class, Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this, context2, aweme2}, null, i.f38833a, true, 30589, new Class[]{h.class, Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        clickAvatar(context2, aweme2, null);
    }

    private void logLongVideoBreakOrOver(Context context, Aweme aweme, long j) {
        int i;
        Context context2 = context;
        Aweme aweme2 = aweme;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, new Long(j2)}, this, changeQuickRedirect, false, 30767, new Class[]{Context.class, Aweme.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2, new Long(j2)}, this, changeQuickRedirect, false, 30767, new Class[]{Context.class, Aweme.class, Long.TYPE}, Void.TYPE);
            return;
        }
        Video a2 = j.f53966b.a(aweme2);
        if (a2 != null) {
            i = a2.getDuration();
        } else {
            i = 0;
        }
        if (x.f2922d) {
            g.b(context2, aweme2, j2 + x.b(), i);
        } else {
            long b2 = j2 + x.b();
            if (PatchProxy.isSupport(new Object[]{context2, aweme2, new Long(b2), Integer.valueOf(i)}, null, g.f39316a, true, 31780, new Class[]{Context.class, Aweme.class, Long.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2, aweme2, new Long(b2), Integer.valueOf(i)}, null, g.f39316a, true, 31780, new Class[]{Context.class, Aweme.class, Long.TYPE, Integer.TYPE}, Void.TYPE);
            } else if (!com.ss.android.g.a.a() && aweme2 != null && aweme.isAd()) {
                HashMap hashMap = new HashMap();
                if (al.e(aweme)) {
                    hashMap.put("is_pre_valid_action", Integer.valueOf(al.d(aweme) ? 1 : 0));
                }
                JSONObject a3 = g.a(context2, aweme2, "raw ad over duration", false, g.a((Map<String, Object>) hashMap));
                try {
                    a3.put("duration", b2);
                    a3.put("video_length", i);
                } catch (JSONException unused) {
                }
                al.a(aweme2, b2);
                g.b(context2, "break", aweme2, a3);
            }
        }
        x.c();
    }

    public void logBreak(Context context, Aweme aweme, String str, long j, int i) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        String str2 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, str2, new Long(j2), Integer.valueOf(i)}, this, changeQuickRedirect, false, 30766, new Class[]{Context.class, Aweme.class, String.class, Long.TYPE, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {context2, aweme2, str2, new Long(j2), Integer.valueOf(i)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 30766, new Class[]{Context.class, Aweme.class, String.class, Long.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (aweme2 != null && TextUtils.equals(str2, aweme.getAid()) && aweme.isAd()) {
            if (x.a(aweme)) {
                logLongVideoBreakOrOver(context2, aweme2, j2);
            } else {
                g.a(context2, aweme2, j2, i);
            }
        }
    }
}
