package com.ss.android.ugc.aweme.story.detail.controller;

import android.arch.lifecycle.LifecycleOwner;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.api.model.b;
import com.ss.android.ugc.aweme.story.api.model.f;
import com.ss.android.ugc.aweme.story.feed.c.g;
import com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment;
import com.ss.android.ugc.aweme.story.feed.jedi.StoryMainHolder2;
import com.ss.android.ugc.aweme.story.feed.viewmodel.ChangeUserModeViewModel;
import com.ss.android.ugc.aweme.story.feed.viewmodel.StoryChange;
import com.ss.android.ugc.aweme.story.metrics.a.a;
import com.ss.android.ugc.aweme.story.metrics.d;
import com.ss.android.ugc.aweme.story.metrics.j;
import com.ss.android.ugc.aweme.story.metrics.n;
import com.ss.android.ugc.aweme.story.player.c;
import com.ss.android.ugc.aweme.video.e;

public class StoryDetailMobController extends LifecycleController {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72405a;

    /* renamed from: b  reason: collision with root package name */
    public f f72406b;

    /* renamed from: c  reason: collision with root package name */
    public UserStory f72407c;
    public long g;
    public b h;
    public String i;
    public boolean j;
    public String k;
    public long l = -1;
    public long m = -1;
    private StoryChange.b n = new StoryChange.b() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72410a;

        public final void a(UserStory userStory) {
            if (PatchProxy.isSupport(new Object[]{userStory}, this, f72410a, false, 83168, new Class[]{UserStory.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{userStory}, this, f72410a, false, 83168, new Class[]{UserStory.class}, Void.TYPE);
                return;
            }
            if (StoryDetailMobController.this.f72407c != null) {
                String a2 = StoryDetailMobController.this.a(StoryDetailMobController.this.f72407c, userStory);
                StoryDetailMobController.this.k = a2;
                if (userStory != null) {
                    new d().a(StoryDetailMobController.this.f72406b.eventType).b(a2).c(g.a(StoryDetailMobController.this.f72407c)).d(g.a(userStory)).e(g.a(userStory)).a(g.b(userStory)).a(userStory.getLogPb()).a(a.a(userStory)).post();
                }
                long currentTimeMillis = System.currentTimeMillis() - StoryDetailMobController.this.g;
                if (currentTimeMillis > 100) {
                    new j().a(StoryDetailMobController.this.f72406b.eventType).b(a2).c(g.a(StoryDetailMobController.this.f72407c)).a(StoryDetailMobController.this.f72407c.getLogPb()).a(g.b(StoryDetailMobController.this.f72407c)).a(a.a(StoryDetailMobController.this.f72407c)).a(currentTimeMillis).post();
                }
                if (TextUtils.equals(a2, "slide_left")) {
                    StoryDetailMobController.this.a(a2);
                } else if (TextUtils.equals(a2, "slide_right")) {
                    StoryDetailMobController.this.a(a2);
                }
                ChangeUserModeViewModel.a(StoryDetailMobController.this.f4119f).setValue("");
                StoryDetailMobController.this.g = System.currentTimeMillis();
            }
            StoryDetailMobController.this.f72407c = userStory;
        }
    };
    private com.ss.android.ugc.aweme.story.player.b o = new com.ss.android.ugc.aweme.story.player.b() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72412a;

        /* renamed from: b  reason: collision with root package name */
        long f72413b = -1;

        public final void a(String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f72412a, false, 83171, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f72412a, false, 83171, new Class[]{String.class}, Void.TYPE);
                return;
            }
            super.a(str);
            StoryDetailMobController.this.m = System.currentTimeMillis();
        }

        public final void b(String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f72412a, false, 83170, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f72412a, false, 83170, new Class[]{String.class}, Void.TYPE);
                return;
            }
            if (StoryDetailMobController.this.c(str)) {
                StoryDetailMobController.this.l = System.currentTimeMillis();
            }
        }

        public final void c(String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f72412a, false, 83172, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f72412a, false, 83172, new Class[]{String.class}, Void.TYPE);
                return;
            }
            super.c(str);
            if (StoryDetailMobController.this.c(str)) {
                StoryDetailMobController.this.b(str);
            }
        }

        public final void e(String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, f72412a, false, 83173, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2}, this, f72412a, false, 83173, new Class[]{String.class}, Void.TYPE);
                return;
            }
            super.e(str);
            StoryDetailMobController.this.b(str2);
        }

        public final void a(e eVar) {
            if (PatchProxy.isSupport(new Object[]{eVar}, this, f72412a, false, 83174, new Class[]{e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar}, this, f72412a, false, 83174, new Class[]{e.class}, Void.TYPE);
                return;
            }
            super.a(eVar);
            if (StoryDetailMobController.this.a(StoryDetailMobController.this.h)) {
                c d2 = c.d();
                Video d3 = g.d(StoryDetailMobController.this.h);
                if (PatchProxy.isSupport(new Object[]{eVar, d3, "service_story_video_error_rate", 1, "type_log_story_video_play", "service_log_media_error"}, d2, c.f73261a, false, 84829, new Class[]{e.class, Video.class, String.class, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
                    c cVar = d2;
                    PatchProxy.accessDispatch(new Object[]{eVar, d3, "service_story_video_error_rate", 1, "type_log_story_video_play", "service_log_media_error"}, cVar, c.f73261a, false, 84829, new Class[]{e.class, Video.class, String.class, Integer.TYPE, String.class, String.class}, Void.TYPE);
                } else if (d2.f73262b != null) {
                    d2.f73262b.a(eVar, d3, "service_story_video_error_rate", 1, "type_log_story_video_play", "service_log_media_error");
                }
            }
        }

        public final void a(com.ss.android.ugc.aweme.video.b.a aVar) {
            com.ss.android.ugc.aweme.video.b.a aVar2 = aVar;
            if (PatchProxy.isSupport(new Object[]{aVar2}, this, f72412a, false, 83169, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar2}, this, f72412a, false, 83169, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE);
                return;
            }
            super.a(aVar);
            if (StoryDetailMobController.this.c(aVar2.f76010a)) {
                StoryDetailMobController.this.l = System.currentTimeMillis();
            }
            if (StoryDetailMobController.this.a(StoryDetailMobController.this.h)) {
                StoryDetailMobController storyDetailMobController = StoryDetailMobController.this;
                if (PatchProxy.isSupport(new Object[0], storyDetailMobController, StoryDetailMobController.f72405a, false, 83164, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], storyDetailMobController, StoryDetailMobController.f72405a, false, 83164, new Class[0], Void.TYPE);
                } else if (storyDetailMobController.m != -1) {
                    long currentTimeMillis = System.currentTimeMillis() - storyDetailMobController.m;
                    c d2 = c.d();
                    if (PatchProxy.isSupport(new Object[]{new Long(currentTimeMillis), "key_story_video_first_frame_time"}, d2, c.f73261a, false, 84831, new Class[]{Long.TYPE, String.class}, Void.TYPE)) {
                        c cVar = d2;
                        PatchProxy.accessDispatch(new Object[]{new Long(currentTimeMillis), "key_story_video_first_frame_time"}, cVar, c.f73261a, false, 84831, new Class[]{Long.TYPE, String.class}, Void.TYPE);
                    } else if (d2.f73262b != null) {
                        d2.f73262b.a(currentTimeMillis, "key_story_video_first_frame_time");
                    }
                    storyDetailMobController.m = -1;
                }
                c d3 = c.d();
                Video d4 = g.d(StoryDetailMobController.this.h);
                if (PatchProxy.isSupport(new Object[]{d4, "service_story_video_play_error_rate"}, d3, c.f73261a, false, 84832, new Class[]{Video.class, String.class}, Void.TYPE)) {
                    c cVar2 = d3;
                    PatchProxy.accessDispatch(new Object[]{d4, "service_story_video_play_error_rate"}, cVar2, c.f73261a, false, 84832, new Class[]{Video.class, String.class}, Void.TYPE);
                } else if (d3.f73262b != null) {
                    d3.f73262b.a(d4, "service_story_video_play_error_rate");
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e0, code lost:
            if (r0 == null) goto L_0x00e2;
         */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0149  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0186  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(boolean r24) {
            /*
                r23 = this;
                r7 = r23
                r8 = 1
                java.lang.Object[] r0 = new java.lang.Object[r8]
                java.lang.Byte r1 = java.lang.Byte.valueOf(r24)
                r9 = 0
                r0[r9] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = f72412a
                java.lang.Class[] r5 = new java.lang.Class[r8]
                java.lang.Class r1 = java.lang.Boolean.TYPE
                r5[r9] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 83175(0x144e7, float:1.16553E-40)
                r1 = r23
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x003e
                java.lang.Object[] r0 = new java.lang.Object[r8]
                java.lang.Byte r1 = java.lang.Byte.valueOf(r24)
                r0[r9] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = f72412a
                r3 = 0
                r4 = 83175(0x144e7, float:1.16553E-40)
                java.lang.Class[] r5 = new java.lang.Class[r8]
                java.lang.Class r1 = java.lang.Boolean.TYPE
                r5[r9] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r23
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x003e:
                super.b((boolean) r24)
                com.ss.android.ugc.aweme.story.detail.controller.StoryDetailMobController r0 = com.ss.android.ugc.aweme.story.detail.controller.StoryDetailMobController.this
                com.ss.android.ugc.aweme.story.detail.controller.StoryDetailMobController r1 = com.ss.android.ugc.aweme.story.detail.controller.StoryDetailMobController.this
                com.ss.android.ugc.aweme.story.api.model.b r1 = r1.h
                boolean r0 = r0.a((com.ss.android.ugc.aweme.story.api.model.b) r1)
                if (r0 == 0) goto L_0x0191
                r0 = -1
                if (r24 == 0) goto L_0x005e
                long r2 = r7.f72413b
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto L_0x0191
                long r0 = java.lang.System.currentTimeMillis()
                r7.f72413b = r0
                return
            L_0x005e:
                long r2 = r7.f72413b
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 == 0) goto L_0x0191
                long r2 = java.lang.System.currentTimeMillis()
                long r4 = r7.f72413b
                long r2 = r2 - r4
                r7.f72413b = r0
                com.ss.android.ugc.aweme.story.detail.controller.StoryDetailMobController r0 = com.ss.android.ugc.aweme.story.detail.controller.StoryDetailMobController.this
                com.ss.android.ugc.aweme.story.api.model.b r0 = r0.h
                java.lang.Object[] r10 = new java.lang.Object[r8]
                r10[r9] = r0
                r11 = 0
                com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.story.feed.c.g.f72502a
                r13 = 1
                r14 = 83730(0x14712, float:1.17331E-40)
                java.lang.Class[] r15 = new java.lang.Class[r8]
                java.lang.Class<com.ss.android.ugc.aweme.story.api.model.b> r1 = com.ss.android.ugc.aweme.story.api.model.b.class
                r15[r9] = r1
                java.lang.Class<java.lang.String> r16 = java.lang.String.class
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
                if (r1 == 0) goto L_0x00a5
                java.lang.Object[] r10 = new java.lang.Object[r8]
                r10[r9] = r0
                r11 = 0
                com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.story.feed.c.g.f72502a
                r13 = 1
                r14 = 83730(0x14712, float:1.17331E-40)
                java.lang.Class[] r15 = new java.lang.Class[r8]
                java.lang.Class<com.ss.android.ugc.aweme.story.api.model.b> r0 = com.ss.android.ugc.aweme.story.api.model.b.class
                r15[r9] = r0
                java.lang.Class<java.lang.String> r16 = java.lang.String.class
            L_0x009d:
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                java.lang.String r0 = (java.lang.String) r0
            L_0x00a3:
                r15 = r0
                goto L_0x00e5
            L_0x00a5:
                com.ss.android.ugc.aweme.story.feed.c.g$a r1 = com.ss.android.ugc.aweme.story.feed.c.g.f72503b
                java.lang.Object[] r10 = new java.lang.Object[r8]
                r10[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.story.feed.c.g.a.f72504a
                r13 = 0
                r14 = 83796(0x14754, float:1.17423E-40)
                java.lang.Class[] r15 = new java.lang.Class[r8]
                java.lang.Class<com.ss.android.ugc.aweme.story.api.model.b> r4 = com.ss.android.ugc.aweme.story.api.model.b.class
                r15[r9] = r4
                java.lang.Class<java.lang.String> r16 = java.lang.String.class
                r11 = r1
                boolean r4 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
                if (r4 == 0) goto L_0x00d4
                java.lang.Object[] r10 = new java.lang.Object[r8]
                r10[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.story.feed.c.g.a.f72504a
                r13 = 0
                r14 = 83796(0x14754, float:1.17423E-40)
                java.lang.Class[] r15 = new java.lang.Class[r8]
                java.lang.Class<com.ss.android.ugc.aweme.story.api.model.b> r0 = com.ss.android.ugc.aweme.story.api.model.b.class
                r15[r9] = r0
                java.lang.Class<java.lang.String> r16 = java.lang.String.class
                r11 = r1
                goto L_0x009d
            L_0x00d4:
                if (r0 == 0) goto L_0x00e2
                com.ss.android.ugc.aweme.story.api.model.LogPbBean r0 = r0.getLogPb()
                if (r0 == 0) goto L_0x00e2
                java.lang.String r0 = r0.getImprId()
                if (r0 != 0) goto L_0x00a3
            L_0x00e2:
                java.lang.String r0 = ""
                goto L_0x00a3
            L_0x00e5:
                com.ss.android.ugc.aweme.story.player.c r0 = com.ss.android.ugc.aweme.story.player.c.d()
                com.ss.android.ugc.aweme.story.detail.controller.StoryDetailMobController r1 = com.ss.android.ugc.aweme.story.detail.controller.StoryDetailMobController.this
                com.ss.android.ugc.aweme.story.api.model.b r1 = r1.h
                com.ss.android.ugc.aweme.story.api.model.LifeStory r1 = r1.getLifeStory()
                com.ss.android.ugc.aweme.feed.model.Video r11 = r1.getVideo()
                com.ss.android.ugc.aweme.story.detail.controller.StoryDetailMobController r1 = com.ss.android.ugc.aweme.story.detail.controller.StoryDetailMobController.this
                com.ss.android.ugc.aweme.story.api.model.b r1 = r1.h
                java.lang.String r12 = com.ss.android.ugc.aweme.story.feed.c.g.b((com.ss.android.ugc.aweme.story.api.model.b) r1)
                java.lang.Long r13 = java.lang.Long.valueOf(r2)
                java.lang.String r14 = "resume"
                java.lang.String r1 = "type_story_video_log_block_report"
                r2 = 6
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r3[r9] = r11
                r3[r8] = r12
                r4 = 2
                r3[r4] = r13
                r5 = 3
                r3[r5] = r14
                r6 = 4
                r3[r6] = r15
                r10 = 5
                r3[r10] = r1
                com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.story.player.c.f73261a
                r19 = 0
                r20 = 84830(0x14b5e, float:1.18872E-40)
                java.lang.Class[] r10 = new java.lang.Class[r2]
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Video> r16 = com.ss.android.ugc.aweme.feed.model.Video.class
                r10[r9] = r16
                java.lang.Class<java.lang.String> r16 = java.lang.String.class
                r10[r8] = r16
                java.lang.Class<java.lang.Long> r16 = java.lang.Long.class
                r10[r4] = r16
                java.lang.Class<java.lang.String> r16 = java.lang.String.class
                r10[r5] = r16
                java.lang.Class<java.lang.String> r16 = java.lang.String.class
                r10[r6] = r16
                java.lang.Class<java.lang.String> r16 = java.lang.String.class
                r17 = 5
                r10[r17] = r16
                java.lang.Class r22 = java.lang.Void.TYPE
                r16 = r3
                r17 = r0
                r21 = r10
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)
                if (r3 == 0) goto L_0x0186
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r3[r9] = r11
                r3[r8] = r12
                r3[r4] = r13
                r3[r5] = r14
                r3[r6] = r15
                r10 = 5
                r3[r10] = r1
                com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.story.player.c.f73261a
                r19 = 0
                r20 = 84830(0x14b5e, float:1.18872E-40)
                java.lang.Class[] r1 = new java.lang.Class[r2]
                java.lang.Class<com.ss.android.ugc.aweme.feed.model.Video> r2 = com.ss.android.ugc.aweme.feed.model.Video.class
                r1[r9] = r2
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r1[r8] = r2
                java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
                r1[r4] = r2
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r1[r5] = r2
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r1[r6] = r2
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r4 = 5
                r1[r4] = r2
                java.lang.Class r22 = java.lang.Void.TYPE
                r16 = r3
                r17 = r0
                r21 = r1
                com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
                return
            L_0x0186:
                com.ss.android.ugc.aweme.main.h.a.a r2 = r0.f73262b
                if (r2 == 0) goto L_0x0191
                com.ss.android.ugc.aweme.main.h.a.a r10 = r0.f73262b
                r16 = r1
                r10.a((com.ss.android.ugc.aweme.feed.model.Video) r11, (java.lang.String) r12, (java.lang.Long) r13, (java.lang.String) r14, (java.lang.String) r15, (java.lang.String) r16)
            L_0x0191:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.detail.controller.StoryDetailMobController.AnonymousClass3.b(boolean):void");
        }
    };

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f72405a, false, 83158, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72405a, false, 83158, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        c.d().a((com.ss.android.ugc.aweme.video.a.a) this.o);
        StoryChange.a(this.f4119f, (LifecycleOwner) this.f4118e, this.n);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f72405a, false, 83160, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72405a, false, 83160, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        StoryChange.a(this.f4119f, this.n);
        c.d().b((com.ss.android.ugc.aweme.video.a.a) this.o);
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f72405a, false, 83157, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72405a, false, 83157, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        this.g = 0;
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f72405a, false, 83156, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72405a, false, 83156, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        this.g = System.currentTimeMillis();
    }

    public final void a() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f72405a, false, 83161, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72405a, false, 83161, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.story.metrics.a aVar = new com.ss.android.ugc.aweme.story.metrics.a();
        aVar.f73138b = "homepage_story";
        aVar.f73139c = (String) ChangeUserModeViewModel.a(this.f4119f).getValue();
        aVar.f73140d = g.a(StoryChange.c(this.f4119f));
        aVar.post();
        long currentTimeMillis = System.currentTimeMillis() - this.g;
        if (currentTimeMillis > 100 && this.f72407c != null) {
            if (TextUtils.isEmpty(this.k)) {
                str = "click_head";
            } else {
                str = this.k;
            }
            new j().a(this.f72406b.eventType).b(str).c(g.a(this.f72407c)).a(this.f72407c.getLogPb()).a(g.b(this.f72407c)).a(a.a(this.f72407c)).a(currentTimeMillis).post();
        }
    }

    public final boolean a(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f72405a, false, 83163, new Class[]{b.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar}, this, f72405a, false, 83163, new Class[]{b.class}, Boolean.TYPE)).booleanValue();
        } else if (bVar == null || bVar.getLifeStory() == null || bVar.getAwemeType() != 14) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean c(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f72405a, false, 83166, new Class[]{String.class}, Boolean.TYPE)) {
            return TextUtils.equals(str2, g.b(StoryChange.b(this.f4119f)));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f72405a, false, 83166, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: com.ss.android.ugc.aweme.story.metrics.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.lang.String r18) {
        /*
            r17 = this;
            r7 = r17
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r2 = f72405a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 83165(0x144dd, float:1.16539E-40)
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0036
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r2 = f72405a
            r3 = 0
            r4 = 83165(0x144dd, float:1.16539E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0036:
            boolean r0 = r17.c(r18)
            r1 = -1
            if (r0 != 0) goto L_0x0044
            long r3 = r7.l
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00cb
        L_0x0044:
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r7.l
            long r3 = r3 - r5
            r7.l = r1
            android.support.v4.app.FragmentActivity r0 = r7.f4119f
            com.ss.android.ugc.aweme.story.api.model.UserStory r0 = com.ss.android.ugc.aweme.story.feed.viewmodel.StoryChange.c(r0)
            com.ss.android.ugc.aweme.story.metrics.g r1 = new com.ss.android.ugc.aweme.story.metrics.g
            r1.<init>()
            boolean r2 = r7.j
            r1.f73176b = r2
            r1.k = r3
            java.lang.String r2 = "homepage_story"
            r1.f73178d = r2
            android.support.v4.app.Fragment r2 = r7.f4118e
            android.support.v4.app.FragmentActivity r2 = r2.getActivity()
            java.lang.String r2 = com.ss.android.ugc.aweme.story.feed.c.e.b(r2)
            r1.f73179e = r2
            java.lang.String r2 = r7.i
            r1.h = r2
            int r0 = com.ss.android.ugc.aweme.story.metrics.a.a.a((com.ss.android.ugc.aweme.story.api.model.UserStory) r0)
            r1.j = r0
            com.ss.android.ugc.aweme.story.api.model.b r0 = r7.h
            java.lang.Object[] r10 = new java.lang.Object[r8]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.story.metrics.g.f73175a
            r13 = 0
            r14 = 84765(0x14b1d, float:1.18781E-40)
            java.lang.Class[] r2 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.story.api.model.b> r3 = com.ss.android.ugc.aweme.story.api.model.b.class
            r2[r9] = r3
            java.lang.Class<com.ss.android.ugc.aweme.story.metrics.g> r16 = com.ss.android.ugc.aweme.story.metrics.g.class
            r11 = r1
            r15 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r2 == 0) goto L_0x00b0
            java.lang.Object[] r10 = new java.lang.Object[r8]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.story.metrics.g.f73175a
            r13 = 0
            r14 = 84765(0x14b1d, float:1.18781E-40)
            java.lang.Class[] r0 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.story.api.model.b> r2 = com.ss.android.ugc.aweme.story.api.model.b.class
            r0[r9] = r2
            java.lang.Class<com.ss.android.ugc.aweme.story.metrics.g> r16 = com.ss.android.ugc.aweme.story.metrics.g.class
            r11 = r1
            r15 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            r1 = r0
            com.ss.android.ugc.aweme.story.metrics.g r1 = (com.ss.android.ugc.aweme.story.metrics.g) r1
            goto L_0x00c8
        L_0x00b0:
            boolean r2 = com.ss.android.ugc.aweme.story.metrics.a.a.a((com.ss.android.ugc.aweme.story.api.model.b) r0)
            r1.f73177c = r2
            java.lang.String r2 = com.ss.android.ugc.aweme.story.feed.c.g.b((com.ss.android.ugc.aweme.story.api.model.b) r0)
            r1.f73180f = r2
            java.lang.String r2 = com.ss.android.ugc.aweme.story.feed.c.g.a((com.ss.android.ugc.aweme.story.api.model.b) r0)
            r1.g = r2
            com.ss.android.ugc.aweme.story.api.model.LogPbBean r0 = com.ss.android.ugc.aweme.story.metrics.a.a.b(r0)
            r1.i = r0
        L_0x00c8:
            r1.post()
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.detail.controller.StoryDetailMobController.b(java.lang.String):void");
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f72405a, false, 83155, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f72405a, false, 83155, new Class[]{String.class}, Void.TYPE);
            return;
        }
        StoryMainHolder2 i2 = ((StoryFeedJediFragment) this.f4118e).i();
        if (i2 != null) {
            com.ss.android.ugc.aweme.story.feed.view.adapter.a i3 = i2.i();
            if (i3 != null) {
                b j2 = i3.j();
                new n().a(j2.isRead()).b(g.c(j2)).a(this.f72406b.eventType).b(str).c(g.b(j2)).d(g.a(j2)).c(false).a(a.a(StoryChange.c(this.f4118e.getActivity()))).a(j2.getLogPb()).post();
            }
        }
    }

    public StoryDetailMobController(FragmentActivity fragmentActivity, Fragment fragment) {
        super(fragmentActivity, fragment);
        if (PatchProxy.isSupport(new Object[0], this, f72405a, false, 83154, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72405a, false, 83154, new Class[0], Void.TYPE);
            return;
        }
        StoryChange.a(this.f4119f, (LifecycleOwner) this.f4118e, (StoryChange.a) new StoryChange.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72408a;

            public final void a(b bVar) {
                String str;
                b bVar2 = bVar;
                boolean z = true;
                if (PatchProxy.isSupport(new Object[]{bVar2}, this, f72408a, false, 83167, new Class[]{b.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bVar2}, this, f72408a, false, 83167, new Class[]{b.class}, Void.TYPE);
                    return;
                }
                StoryDetailMobController.this.h = bVar2;
                StoryDetailMobController.this.i = StoryDetailMobController.this.a(StoryDetailMobController.this.f72407c, StoryChange.c(StoryDetailMobController.this.f4119f));
                StoryDetailMobController.this.j = bVar.isRead();
                String str2 = (String) ChangeUserModeViewModel.a(StoryDetailMobController.this.f4119f).getValue();
                if (str2 != null) {
                    char c2 = 65535;
                    int hashCode = str2.hashCode();
                    if (hashCode != -2004557874) {
                        if (hashCode != -777079990) {
                            if (hashCode == 3005871 && str2.equals("auto")) {
                                c2 = 0;
                            }
                        } else if (str2.equals("click_next")) {
                            c2 = 2;
                        }
                    } else if (str2.equals("click_previous")) {
                        c2 = 1;
                    }
                    switch (c2) {
                        case 0:
                            break;
                        case 1:
                        case 2:
                            z = false;
                            break;
                    }
                    new n().a(bVar.isRead()).b(g.c(bVar)).a(StoryDetailMobController.this.f72406b.eventType).b(str2).c(g.b(bVar)).d(g.a(bVar)).c(z).a(a.a(StoryChange.c(StoryDetailMobController.this.f4118e.getActivity()))).a(bVar.getLogPb()).post();
                    return;
                }
                n a2 = new n().a(bVar.isRead()).b(g.c(bVar)).a(StoryDetailMobController.this.f72406b.eventType);
                StoryDetailMobController storyDetailMobController = StoryDetailMobController.this;
                String str3 = StoryDetailMobController.this.f72406b.eventType;
                if (PatchProxy.isSupport(new Object[]{str3}, storyDetailMobController, StoryDetailMobController.f72405a, false, 83159, new Class[]{String.class}, String.class)) {
                    StoryDetailMobController storyDetailMobController2 = storyDetailMobController;
                    str = (String) PatchProxy.accessDispatch(new Object[]{str3}, storyDetailMobController2, StoryDetailMobController.f72405a, false, 83159, new Class[]{String.class}, String.class);
                } else if (TextUtils.equals(str3, "story_album")) {
                    str = "click_story";
                } else {
                    str = "click_head";
                }
                a2.b(str).c(g.b(bVar)).d(g.a(bVar)).c(false).a(a.a(StoryChange.c(StoryDetailMobController.this.f4118e.getActivity()))).a(bVar.getLogPb()).post();
            }
        });
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0199  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(com.ss.android.ugc.aweme.story.api.model.UserStory r21, com.ss.android.ugc.aweme.story.api.model.UserStory r22) {
        /*
            r20 = this;
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = 2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r8
            r12 = 1
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f72405a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.story.api.model.UserStory> r1 = com.ss.android.ugc.aweme.story.api.model.UserStory.class
            r5[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.story.api.model.UserStory> r1 = com.ss.android.ugc.aweme.story.api.model.UserStory.class
            r5[r12] = r1
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r3 = 0
            r4 = 83162(0x144da, float:1.16535E-40)
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x004a
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f72405a
            r3 = 0
            r4 = 83162(0x144da, float:1.16535E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.story.api.model.UserStory> r1 = com.ss.android.ugc.aweme.story.api.model.UserStory.class
            r5[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.story.api.model.UserStory> r1 = com.ss.android.ugc.aweme.story.api.model.UserStory.class
            r5[r12] = r1
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r1 = r20
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x004a:
            android.support.v4.app.FragmentActivity r0 = r7.f4119f
            com.ss.android.ugc.aweme.arch.widgets.base.b r0 = com.ss.android.ugc.aweme.story.feed.viewmodel.ChangeUserModeViewModel.a(r0)
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r1 = -1
            r2 = 3
            if (r0 == 0) goto L_0x009a
            int r3 = r0.hashCode()
            switch(r3) {
                case -2004557874: goto L_0x008a;
                case -777079990: goto L_0x0080;
                case 3005871: goto L_0x0076;
                case 1089111664: goto L_0x006c;
                case 1670365313: goto L_0x0062;
                default: goto L_0x0061;
            }
        L_0x0061:
            goto L_0x0094
        L_0x0062:
            java.lang.String r3 = "click_close"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0094
            r3 = 3
            goto L_0x0095
        L_0x006c:
            java.lang.String r3 = "slide_down"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0094
            r3 = 4
            goto L_0x0095
        L_0x0076:
            java.lang.String r3 = "auto"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0094
            r3 = 0
            goto L_0x0095
        L_0x0080:
            java.lang.String r3 = "click_next"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0094
            r3 = 2
            goto L_0x0095
        L_0x008a:
            java.lang.String r3 = "click_previous"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0094
            r3 = 1
            goto L_0x0095
        L_0x0094:
            r3 = -1
        L_0x0095:
            switch(r3) {
                case 0: goto L_0x0099;
                case 1: goto L_0x0099;
                case 2: goto L_0x0099;
                case 3: goto L_0x0099;
                case 4: goto L_0x0099;
                default: goto L_0x0098;
            }
        L_0x0098:
            goto L_0x009a
        L_0x0099:
            return r0
        L_0x009a:
            if (r8 != 0) goto L_0x009f
            java.lang.String r0 = ""
            return r0
        L_0x009f:
            android.support.v4.app.FragmentActivity r0 = r7.f4119f
            com.ss.android.ugc.aweme.story.feed.model.LifeFeedModel r0 = com.ss.android.ugc.aweme.story.feed.model.LifeFeedModel.a((android.support.v4.app.FragmentActivity) r0)
            java.lang.Object r0 = r0.d()
            com.ss.android.ugc.aweme.story.feed.model.a r0 = (com.ss.android.ugc.aweme.story.feed.model.a) r0
            java.lang.Object[] r13 = new java.lang.Object[r2]
            r13[r11] = r0
            r13[r12] = r8
            r13[r10] = r9
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.story.feed.c.g.f72502a
            r16 = 1
            r17 = 83719(0x14707, float:1.17315E-40)
            java.lang.Class[] r3 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.story.feed.model.a> r4 = com.ss.android.ugc.aweme.story.feed.model.a.class
            r3[r11] = r4
            java.lang.Class<com.ss.android.ugc.aweme.story.api.model.UserStory> r4 = com.ss.android.ugc.aweme.story.api.model.UserStory.class
            r3[r12] = r4
            java.lang.Class<com.ss.android.ugc.aweme.story.api.model.UserStory> r4 = com.ss.android.ugc.aweme.story.api.model.UserStory.class
            r3[r10] = r4
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r18 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r3 == 0) goto L_0x0101
            java.lang.Object[] r13 = new java.lang.Object[r2]
            r13[r11] = r0
            r13[r12] = r8
            r13[r10] = r9
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.story.feed.c.g.f72502a
            r16 = 1
            r17 = 83719(0x14707, float:1.17315E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.story.feed.model.a> r1 = com.ss.android.ugc.aweme.story.feed.model.a.class
            r0[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.story.api.model.UserStory> r1 = com.ss.android.ugc.aweme.story.api.model.UserStory.class
            r0[r12] = r1
            java.lang.Class<com.ss.android.ugc.aweme.story.api.model.UserStory> r1 = com.ss.android.ugc.aweme.story.api.model.UserStory.class
            r0[r10] = r1
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r18 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
        L_0x00f9:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r11 = r0.booleanValue()
            goto L_0x0194
        L_0x0101:
            com.ss.android.ugc.aweme.story.feed.c.g$a r3 = com.ss.android.ugc.aweme.story.feed.c.g.f72503b
            java.lang.Object[] r13 = new java.lang.Object[r2]
            r13[r11] = r0
            r13[r12] = r8
            r13[r10] = r9
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.story.feed.c.g.a.f72504a
            r16 = 0
            r17 = 83781(0x14745, float:1.17402E-40)
            java.lang.Class[] r4 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.story.feed.model.a> r5 = com.ss.android.ugc.aweme.story.feed.model.a.class
            r4[r11] = r5
            java.lang.Class<com.ss.android.ugc.aweme.story.api.model.UserStory> r5 = com.ss.android.ugc.aweme.story.api.model.UserStory.class
            r4[r12] = r5
            java.lang.Class<com.ss.android.ugc.aweme.story.api.model.UserStory> r5 = com.ss.android.ugc.aweme.story.api.model.UserStory.class
            r4[r10] = r5
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r14 = r3
            r18 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r4 == 0) goto L_0x0155
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r11] = r0
            r1[r12] = r8
            r1[r10] = r9
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.story.feed.c.g.a.f72504a
            r5 = 0
            r6 = 83781(0x14745, float:1.17402E-40)
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.story.feed.model.a> r0 = com.ss.android.ugc.aweme.story.feed.model.a.class
            r8[r11] = r0
            java.lang.Class<com.ss.android.ugc.aweme.story.api.model.UserStory> r0 = com.ss.android.ugc.aweme.story.api.model.UserStory.class
            r8[r12] = r0
            java.lang.Class<com.ss.android.ugc.aweme.story.api.model.UserStory> r0 = com.ss.android.ugc.aweme.story.api.model.UserStory.class
            r8[r10] = r0
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r0 = r1
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r8
            r6 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x00f9
        L_0x0155:
            if (r0 == 0) goto L_0x0190
            java.util.List r0 = r0.getUserStoryList()
            java.lang.String r2 = "userStoryList"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = -1
            r3 = -1
        L_0x0169:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x018e
            java.lang.Object r4 = r0.next()
            com.ss.android.ugc.aweme.story.api.model.UserStory r4 = (com.ss.android.ugc.aweme.story.api.model.UserStory) r4
            com.ss.android.ugc.aweme.story.feed.c.g$a r5 = com.ss.android.ugc.aweme.story.feed.c.g.f72503b
            boolean r5 = r5.a((com.ss.android.ugc.aweme.story.api.model.UserStory) r4, (com.ss.android.ugc.aweme.story.api.model.UserStory) r8)
            if (r5 == 0) goto L_0x017e
            r2 = r1
        L_0x017e:
            com.ss.android.ugc.aweme.story.feed.c.g$a r5 = com.ss.android.ugc.aweme.story.feed.c.g.f72503b
            boolean r4 = r5.a((com.ss.android.ugc.aweme.story.api.model.UserStory) r4, (com.ss.android.ugc.aweme.story.api.model.UserStory) r9)
            if (r4 == 0) goto L_0x0187
            r3 = r1
        L_0x0187:
            if (r2 < 0) goto L_0x018b
            if (r3 >= 0) goto L_0x018e
        L_0x018b:
            int r1 = r1 + 1
            goto L_0x0169
        L_0x018e:
            r1 = r2
            goto L_0x0191
        L_0x0190:
            r3 = -1
        L_0x0191:
            if (r1 >= r3) goto L_0x0194
            r11 = 1
        L_0x0194:
            if (r11 == 0) goto L_0x0199
            java.lang.String r0 = "slide_left"
            return r0
        L_0x0199:
            java.lang.String r0 = "slide_right"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.detail.controller.StoryDetailMobController.a(com.ss.android.ugc.aweme.story.api.model.UserStory, com.ss.android.ugc.aweme.story.api.model.UserStory):java.lang.String");
    }
}
