package com.ss.android.ugc.aweme.feed.preload;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.video.f;
import com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;
import com.ss.android.ugc.c.c;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45769a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f45770b;

    /* renamed from: c  reason: collision with root package name */
    private PreloadStrategyConfig f45771c;

    /* renamed from: d  reason: collision with root package name */
    private String f45772d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f45773e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f45774f;

    private static void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f45769a, true, 41967, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f45769a, true, 41967, new Class[]{String.class}, Void.TYPE);
        } else if (AbTestManager.a().d().enableSpeedMonitor()) {
            c[] c2 = com.ss.android.ugc.c.b.a().c();
            if (c2 != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (int length = c2.length - 1; length >= 0; length--) {
                        c cVar = c2[length];
                        if (cVar != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("file_size", cVar.f77198c);
                            jSONObject2.put("cost_time", cVar.f77199d);
                            if (length > 0) {
                                int i = length - 1;
                                if (c2[i] != null) {
                                    jSONObject2.put("interval_time", cVar.f77200e - c2[i].f77200e);
                                    jSONArray.put(jSONObject2);
                                }
                            }
                            jSONObject2.put("interval_time", 0);
                            jSONArray.put(jSONObject2);
                        }
                    }
                    jSONObject.put("group_id", str2);
                    jSONObject.put("speed_record", jSONArray);
                    jSONObject.put("internet_speed", com.ss.android.ugc.c.b.e());
                    jSONObject.put("strategy", 0);
                    jSONObject.put("access", NetworkUtils.getNetworkAccessType(d.a()));
                    jSONObject.put("signal", f.a(d.a()).b(d.a()));
                } catch (Exception unused) {
                }
                r.a("video_speed_monitor", jSONObject);
                com.ss.android.ugc.aweme.t.b.b("video_speed_monitor", jSONObject);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.util.List<com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig>} */
    /* JADX WARNING: type inference failed for: r0v28, types: [boolean] */
    /* JADX WARNING: type inference failed for: r0v47 */
    /* JADX WARNING: type inference failed for: r0v51 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0317  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r32, long r33, long r35, @android.support.annotation.NonNull com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter r37, int r38, boolean r39) {
        /*
            r31 = this;
            r7 = r31
            r8 = r32
            r9 = r33
            r11 = r35
            r13 = r37
            r14 = r38
            r15 = r39
            r6 = 6
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r5 = 0
            r0[r5] = r8
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r9)
            r4 = 1
            r0[r4] = r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r11)
            r3 = 2
            r0[r3] = r1
            r16 = 3
            r0[r16] = r13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r38)
            r2 = 4
            r0[r2] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r39)
            r17 = 5
            r0[r17] = r1
            com.meituan.robust.ChangeQuickRedirect r18 = f45769a
            java.lang.Class[] r1 = new java.lang.Class[r6]
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r1[r5] = r19
            java.lang.Class r19 = java.lang.Long.TYPE
            r1[r4] = r19
            java.lang.Class r19 = java.lang.Long.TYPE
            r1[r3] = r19
            java.lang.Class<com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter> r19 = com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter.class
            r1[r16] = r19
            java.lang.Class r19 = java.lang.Integer.TYPE
            r1[r2] = r19
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r1[r17] = r19
            java.lang.Class r19 = java.lang.Void.TYPE
            r20 = 0
            r21 = 41966(0xa3ee, float:5.8807E-41)
            r22 = r1
            r1 = r31
            r2 = r18
            r14 = 2
            r3 = r20
            r14 = 1
            r4 = r21
            r14 = 0
            r5 = r22
            r14 = 6
            r6 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00cd
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r1 = 0
            r0[r1] = r8
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r9)
            r2 = 1
            r0[r2] = r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r11)
            r2 = 2
            r0[r2] = r1
            r0[r16] = r13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r38)
            r2 = 4
            r0[r2] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r39)
            r0[r17] = r1
            com.meituan.robust.ChangeQuickRedirect r1 = f45769a
            r3 = 0
            r4 = 41966(0xa3ee, float:5.8807E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r8 = 0
            r5[r8] = r6
            java.lang.Class r6 = java.lang.Long.TYPE
            r8 = 1
            r5[r8] = r6
            java.lang.Class r6 = java.lang.Long.TYPE
            r8 = 2
            r5[r8] = r6
            java.lang.Class<com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter> r6 = com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter.class
            r5[r16] = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            r5[r2] = r6
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r5[r17] = r2
            java.lang.Class r2 = java.lang.Void.TYPE
            r32 = r0
            r33 = r31
            r34 = r1
            r35 = r3
            r36 = r4
            r37 = r5
            r38 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r32, r33, r34, r35, r36, r37, r38)
            return
        L_0x00cd:
            r2 = 4
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r37.c((int) r38)
            if (r0 == 0) goto L_0x0548
            com.ss.android.ugc.aweme.feed.model.Video r1 = r0.getVideo()
            if (r1 != 0) goto L_0x00dc
            goto L_0x0548
        L_0x00dc:
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            if (r0 != 0) goto L_0x00e3
            return
        L_0x00e3:
            com.ss.android.ugc.aweme.setting.AbTestManager r1 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            boolean r1 = r1.bp()
            if (r1 == 0) goto L_0x013d
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r4 = 0
            r3[r4] = r0
            r25 = 0
            com.meituan.robust.ChangeQuickRedirect r26 = com.ss.android.ugc.aweme.video.i.f76114a
            r27 = 1
            r28 = 88933(0x15b65, float:1.24622E-40)
            java.lang.Class[] r5 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Video> r1 = com.ss.android.ugc.aweme.feed.model.Video.class
            r5[r4] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.VideoUrlModel> r30 = com.ss.android.ugc.aweme.feed.model.VideoUrlModel.class
            r24 = r3
            r29 = r5
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r24, r25, r26, r27, r28, r29, r30)
            if (r1 == 0) goto L_0x0130
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r4 = 0
            r3[r4] = r0
            r25 = 0
            com.meituan.robust.ChangeQuickRedirect r26 = com.ss.android.ugc.aweme.video.i.f76114a
            r27 = 1
            r28 = 88933(0x15b65, float:1.24622E-40)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Video> r1 = com.ss.android.ugc.aweme.feed.model.Video.class
            r0[r4] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.VideoUrlModel> r30 = com.ss.android.ugc.aweme.feed.model.VideoUrlModel.class
            r24 = r3
            r29 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r24, r25, r26, r27, r28, r29, r30)
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r0 = (com.ss.android.ugc.aweme.feed.model.VideoUrlModel) r0
            goto L_0x0141
        L_0x0130:
            com.ss.android.ugc.playerkit.c.a r1 = com.ss.android.ugc.playerkit.c.a.r()
            com.ss.android.ugc.playerkit.c.c$a r1 = r1.a()
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r0 = com.ss.android.ugc.aweme.video.i.a(r0, r1)
            goto L_0x0141
        L_0x013d:
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r0 = r0.getProperPlayAddr()
        L_0x0141:
            if (r0 == 0) goto L_0x0547
            boolean r1 = android.text.TextUtils.isEmpty(r32)
            if (r1 == 0) goto L_0x014b
            goto L_0x0547
        L_0x014b:
            java.lang.String r1 = r0.getBitRatedRatioUri()
            boolean r3 = android.text.TextUtils.equals(r8, r1)
            if (r3 != 0) goto L_0x0156
            return
        L_0x0156:
            java.lang.String r3 = r7.f45772d
            boolean r3 = android.text.TextUtils.equals(r1, r3)
            if (r3 != 0) goto L_0x0172
            r3 = 0
            r7.f45774f = r3
            r4 = 1
            r7.f45773e = r4
            r7.f45772d = r1
            r7.f45770b = r3
            com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig r1 = r7.f45771c
            if (r1 == 0) goto L_0x0175
            com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig r1 = r7.f45771c
            r1.clearFlag()
            goto L_0x0175
        L_0x0172:
            r3 = 0
            r7.f45773e = r3
        L_0x0175:
            int r1 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x0187
            boolean r1 = r7.f45774f
            if (r1 != 0) goto L_0x0187
            r1 = 1
            r7.f45774f = r1
            java.lang.String r0 = r0.getSourceId()
            a(r0)
        L_0x0187:
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            r1 = 0
            java.lang.Object[] r3 = new java.lang.Object[r1]
            com.meituan.robust.ChangeQuickRedirect r26 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r27 = 0
            r28 = 71899(0x118db, float:1.00752E-40)
            java.lang.Class[] r4 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.setting.x> r30 = com.ss.android.ugc.aweme.setting.x.class
            r24 = r3
            r25 = r0
            r29 = r4
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r24, r25, r26, r27, r28, r29, r30)
            r3 = 0
            if (r1 == 0) goto L_0x01c1
            r1 = 0
            java.lang.Object[] r4 = new java.lang.Object[r1]
            com.meituan.robust.ChangeQuickRedirect r26 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r27 = 0
            r28 = 71899(0x118db, float:1.00752E-40)
            java.lang.Class[] r5 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.setting.x> r30 = com.ss.android.ugc.aweme.setting.x.class
            r24 = r4
            r25 = r0
            r29 = r5
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r24, r25, r26, r27, r28, r29, r30)
            com.ss.android.ugc.aweme.setting.x r0 = (com.ss.android.ugc.aweme.setting.x) r0
            goto L_0x01d6
        L_0x01c1:
            com.ss.android.ugc.aweme.setting.x r1 = r0.q
            if (r1 == 0) goto L_0x01c8
            com.ss.android.ugc.aweme.setting.x r0 = r0.q
            goto L_0x01d6
        L_0x01c8:
            com.ss.android.ugc.aweme.setting.model.AbTestModel r1 = r0.d()
            if (r1 != 0) goto L_0x01d0
            r0 = r3
            goto L_0x01d6
        L_0x01d0:
            com.ss.android.ugc.aweme.setting.x r1 = r1.smartPreload
            r0.q = r1
            com.ss.android.ugc.aweme.setting.x r0 = r0.q
        L_0x01d6:
            r4 = 100
            if (r0 == 0) goto L_0x043c
            int r1 = com.ss.android.ugc.c.b.e()
            int r1 = r1 * 8
            int r1 = r1 * 1000
            r3 = 819200(0xc8000, float:1.147944E-39)
            int r6 = r0.a()
            if (r1 > r6) goto L_0x0204
            boolean r1 = r7.f45770b
            if (r1 != 0) goto L_0x0203
            long r3 = r11 * r4
            long r3 = r3 / r9
            int r1 = r0.f64468b
            long r5 = (long) r1
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x01fa
            goto L_0x0203
        L_0x01fa:
            int r4 = r0.f64470d
            int r0 = r0.f64469c
            int r3 = r0 * 1024
        L_0x0200:
            r0 = 1
            goto L_0x0269
        L_0x0203:
            return
        L_0x0204:
            int r6 = r0.a()
            if (r1 <= r6) goto L_0x0227
            int r6 = r0.b()
            if (r1 > r6) goto L_0x0227
            boolean r1 = r7.f45770b
            if (r1 != 0) goto L_0x0226
            long r3 = r11 * r4
            long r3 = r3 / r9
            int r1 = r0.h
            long r5 = (long) r1
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x021f
            goto L_0x0226
        L_0x021f:
            int r4 = r0.j
            int r0 = r0.i
            int r3 = r0 * 1024
            goto L_0x0200
        L_0x0226:
            return
        L_0x0227:
            int r6 = r0.b()
            if (r1 <= r6) goto L_0x024a
            int r6 = r0.c()
            if (r1 > r6) goto L_0x024a
            boolean r1 = r7.f45770b
            if (r1 != 0) goto L_0x0249
            long r3 = r11 * r4
            long r3 = r3 / r9
            int r1 = r0.f64471e
            long r5 = (long) r1
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x0242
            goto L_0x0249
        L_0x0242:
            int r4 = r0.g
            int r0 = r0.f64472f
            int r3 = r0 * 1024
            goto L_0x0200
        L_0x0249:
            return
        L_0x024a:
            int r6 = r0.c()
            if (r1 <= r6) goto L_0x0267
            boolean r1 = r7.f45770b
            if (r1 != 0) goto L_0x0266
            long r3 = r11 * r4
            long r3 = r3 / r9
            int r1 = r0.k
            long r5 = (long) r1
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x025f
            goto L_0x0266
        L_0x025f:
            int r4 = r0.m
            int r0 = r0.l
            int r3 = r0 * 1024
            goto L_0x0200
        L_0x0266:
            return
        L_0x0267:
            r0 = 1
            r4 = 1
        L_0x0269:
            r7.f45770b = r0
            java.lang.Object[] r1 = new java.lang.Object[r14]
            r5 = 0
            r1[r5] = r8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r1[r0] = r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r5 = 2
            r1[r5] = r0
            r1[r16] = r13
            java.lang.Integer r0 = java.lang.Integer.valueOf(r38)
            r1[r2] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r39)
            r1[r17] = r0
            r25 = 0
            com.meituan.robust.ChangeQuickRedirect r26 = f45769a
            r27 = 1
            r28 = 41968(0xa3f0, float:5.881E-41)
            java.lang.Class[] r0 = new java.lang.Class[r14]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r6 = 0
            r0[r6] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r6 = 1
            r0[r6] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r6 = 2
            r0[r6] = r5
            java.lang.Class<com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter> r5 = com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter.class
            r0[r16] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r0[r2] = r5
            java.lang.Class r5 = java.lang.Boolean.TYPE
            r0[r17] = r5
            java.lang.Class r30 = java.lang.Void.TYPE
            r24 = r1
            r29 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r24, r25, r26, r27, r28, r29, r30)
            if (r0 == 0) goto L_0x0317
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r1 = 0
            r0[r1] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r3 = 1
            r0[r3] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r3 = 2
            r0[r3] = r1
            r0[r16] = r13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r38)
            r0[r2] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r39)
            r0[r17] = r1
            r1 = 0
            com.meituan.robust.ChangeQuickRedirect r3 = f45769a
            r4 = 1
            r5 = 41968(0xa3f0, float:5.881E-41)
            java.lang.Class[] r6 = new java.lang.Class[r14]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r9 = 0
            r6[r9] = r8
            java.lang.Class r8 = java.lang.Integer.TYPE
            r9 = 1
            r6[r9] = r8
            java.lang.Class r8 = java.lang.Integer.TYPE
            r9 = 2
            r6[r9] = r8
            java.lang.Class<com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter> r8 = com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter.class
            r6[r16] = r8
            java.lang.Class r8 = java.lang.Integer.TYPE
            r6[r2] = r8
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r6[r17] = r2
            java.lang.Class r2 = java.lang.Void.TYPE
            r32 = r0
            r33 = r1
            r34 = r3
            r35 = r4
            r36 = r5
            r37 = r6
            r38 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r32, r33, r34, r35, r36, r37, r38)
            goto L_0x0546
        L_0x0317:
            com.ss.android.ugc.aweme.video.preload.g r0 = com.ss.android.ugc.aweme.video.preload.g.f()
            com.ss.android.ugc.aweme.video.preload.b r0 = r0.h()
            r0.a((int) r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r37.c((int) r38)
            if (r0 == 0) goto L_0x0546
            com.ss.android.ugc.aweme.feed.model.Video r1 = r0.getVideo()
            if (r1 != 0) goto L_0x0330
            goto L_0x0546
        L_0x0330:
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            if (r0 == 0) goto L_0x043b
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r0 = r0.getProperPlayAddr()
            if (r0 == 0) goto L_0x0546
            boolean r1 = android.text.TextUtils.isEmpty(r32)
            if (r1 == 0) goto L_0x0344
            goto L_0x0546
        L_0x0344:
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r5 = 0
            r3[r5] = r0
            r18 = 0
            com.meituan.robust.ChangeQuickRedirect r19 = com.ss.android.ugc.aweme.video.preload.f.f76214a
            r20 = 1
            r21 = 89189(0x15c65, float:1.2498E-40)
            java.lang.Class[] r6 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.VideoUrlModel> r1 = com.ss.android.ugc.aweme.feed.model.VideoUrlModel.class
            r6[r5] = r1
            java.lang.Class<java.lang.String> r23 = java.lang.String.class
            r17 = r3
            r22 = r6
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r17, r18, r19, r20, r21, r22, r23)
            if (r1 == 0) goto L_0x0387
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r5 = 0
            r3[r5] = r0
            r18 = 0
            com.meituan.robust.ChangeQuickRedirect r19 = com.ss.android.ugc.aweme.video.preload.f.f76214a
            r20 = 1
            r21 = 89189(0x15c65, float:1.2498E-40)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.VideoUrlModel> r1 = com.ss.android.ugc.aweme.feed.model.VideoUrlModel.class
            r0[r5] = r1
            java.lang.Class<java.lang.String> r23 = java.lang.String.class
            r17 = r3
            r22 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r17, r18, r19, r20, r21, r22, r23)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x038b
        L_0x0387:
            java.lang.String r0 = r0.getBitRatedRatioUri()
        L_0x038b:
            boolean r0 = android.text.TextUtils.equals(r8, r0)
            if (r0 == 0) goto L_0x043b
            com.ss.android.ugc.aweme.video.preload.g r0 = com.ss.android.ugc.aweme.video.preload.g.f()
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r13.h
            java.lang.Object[] r8 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r39)
            r5 = 0
            r8[r5] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r38)
            r6 = 1
            r8[r6] = r3
            r3 = 2
            r8[r3] = r1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r8[r16] = r3
            com.meituan.robust.ChangeQuickRedirect r10 = com.ss.android.ugc.aweme.video.preload.g.f76257a
            r11 = 0
            r12 = 89251(0x15ca3, float:1.25067E-40)
            java.lang.Class[] r13 = new java.lang.Class[r2]
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r13[r5] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r13[r6] = r3
            java.lang.Class<java.util.List> r3 = java.util.List.class
            r5 = 2
            r13[r5] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r13[r16] = r3
            java.lang.Class r14 = java.lang.Void.TYPE
            r9 = r0
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r8, r9, r10, r11, r12, r13, r14)
            if (r3 == 0) goto L_0x0419
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Byte r5 = java.lang.Byte.valueOf(r39)
            r6 = 0
            r3[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r38)
            r8 = 1
            r3[r8] = r5
            r5 = 2
            r3[r5] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r3[r16] = r1
            com.meituan.robust.ChangeQuickRedirect r1 = com.ss.android.ugc.aweme.video.preload.g.f76257a
            r4 = 0
            r5 = 89251(0x15ca3, float:1.25067E-40)
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r2[r6] = r9
            java.lang.Class r6 = java.lang.Integer.TYPE
            r2[r8] = r6
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r8 = 2
            r2[r8] = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            r2[r16] = r6
            java.lang.Class r6 = java.lang.Void.TYPE
            r32 = r3
            r33 = r0
            r34 = r1
            r35 = r4
            r36 = r5
            r37 = r2
            r38 = r6
            com.meituan.robust.PatchProxy.accessDispatch(r32, r33, r34, r35, r36, r37, r38)
            goto L_0x0546
        L_0x0419:
            com.ss.android.ugc.aweme.setting.AbTestManager r2 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            int r2 = r2.aY()
            r3 = 2
            if (r2 != r3) goto L_0x042a
            boolean r2 = com.ss.android.ugc.aweme.video.w.a()
            if (r2 != 0) goto L_0x043b
        L_0x042a:
            boolean r2 = com.ss.android.ugc.aweme.video.preload.g.b.a()
            if (r2 == 0) goto L_0x043b
            r2 = r38
            r3 = 0
            com.ss.android.ugc.aweme.feed.model.Aweme[] r1 = com.ss.android.ugc.aweme.video.preload.g.a(r15, r1, r4, r2, r3)
            r2 = -1
            r0.a((com.ss.android.ugc.aweme.feed.model.Aweme[]) r1, (int) r2)
        L_0x043b:
            return
        L_0x043c:
            r2 = r38
            boolean r0 = r7.f45773e
            if (r0 == 0) goto L_0x04e4
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            r1 = 0
            java.lang.Object[] r6 = new java.lang.Object[r1]
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r19 = 0
            r20 = 71969(0x11921, float:1.0085E-40)
            java.lang.Class[] r8 = new java.lang.Class[r1]
            java.lang.Class<java.util.List> r22 = java.util.List.class
            r16 = r6
            r17 = r0
            r21 = r8
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)
            if (r6 == 0) goto L_0x047b
            java.lang.Object[] r3 = new java.lang.Object[r1]
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r19 = 0
            r20 = 71969(0x11921, float:1.0085E-40)
            java.lang.Class[] r6 = new java.lang.Class[r1]
            java.lang.Class<java.util.List> r22 = java.util.List.class
            r16 = r3
            r17 = r0
            r21 = r6
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            r3 = r0
            java.util.List r3 = (java.util.List) r3
            goto L_0x0484
        L_0x047b:
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = r0.d()
            if (r0 != 0) goto L_0x0482
            goto L_0x0484
        L_0x0482:
            java.util.List<com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig> r3 = r0.smartPreloadStrategyList
        L_0x0484:
            if (r3 == 0) goto L_0x04e4
            int r0 = r3.size()
            if (r0 <= 0) goto L_0x04e4
            r0 = 0
            java.lang.Object r0 = r3.get(r0)
            com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig r0 = (com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig) r0
            long r0 = r0.getNetworkLower()
            r4 = 0
            long r0 = java.lang.Math.max(r0, r4)
            int r4 = r3.size()
            r5 = 1
            int r4 = r4 - r5
            java.lang.Object r4 = r3.get(r4)
            com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig r4 = (com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig) r4
            long r4 = r4.getNetworkUpper()
            r14 = 25000(0x61a8, double:1.23516E-319)
            long r4 = java.lang.Math.min(r4, r14)
            int r6 = com.ss.android.ugc.c.b.e()
            long r14 = (long) r6
            long r0 = java.lang.Math.max(r0, r14)
            long r0 = java.lang.Math.min(r0, r4)
            java.util.Iterator r3 = r3.iterator()
        L_0x04c4:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04e4
            java.lang.Object r4 = r3.next()
            com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig r4 = (com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig) r4
            if (r4 == 0) goto L_0x04c4
            long r5 = r4.getNetworkLower()
            int r8 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r8 < 0) goto L_0x04c4
            long r5 = r4.getNetworkUpper()
            int r8 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r8 > 0) goto L_0x04c4
            r7.f45771c = r4
        L_0x04e4:
            com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig r0 = r7.f45771c
            if (r0 != 0) goto L_0x04f6
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = r0.d()
            com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig r0 = r0.getPreloadStrategyConfig()
            r7.f45771c = r0
        L_0x04f6:
            java.util.List r0 = java.util.Collections.emptyList()
            com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig r1 = r7.f45771c
            java.util.List r1 = r1.getTasks()
            java.util.Iterator r1 = r1.iterator()
        L_0x0504:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0535
            java.lang.Object r3 = r1.next()
            com.ss.android.ugc.aweme.video.preload.model.PreloadTask r3 = (com.ss.android.ugc.aweme.video.preload.model.PreloadTask) r3
            boolean r4 = r3.alreadyPreload
            if (r4 != 0) goto L_0x0533
            r4 = 100
            long r14 = r11 * r4
            int r6 = r3.progress
            long r4 = (long) r6
            long r4 = r4 * r9
            int r6 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0533
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x052c
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x052c:
            r0.add(r3)
            r4 = 1
            r3.alreadyPreload = r4
            goto L_0x0504
        L_0x0533:
            r4 = 1
            goto L_0x0504
        L_0x0535:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0546
            com.ss.android.ugc.aweme.video.preload.g r1 = com.ss.android.ugc.aweme.video.preload.g.f()
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = r13.h
            r4 = r39
            r1.a(r4, r2, r3, r0)
        L_0x0546:
            return
        L_0x0547:
            return
        L_0x0548:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.preload.b.a(java.lang.String, long, long, com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter, int, boolean):void");
    }
}
