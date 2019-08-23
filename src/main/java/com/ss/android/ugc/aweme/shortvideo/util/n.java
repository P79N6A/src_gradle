package com.ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.common.utility.DigestUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.b.a.a.a;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.linkselector.LinkSelector;
import com.ss.android.medialib.FFMpegManager;
import com.ss.android.ugc.a.b.d;
import com.ss.android.ugc.a.e;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.share.bv;
import com.ss.android.ugc.aweme.shortvideo.model.GameDuetResource;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.aweme.u.aj;
import com.ss.android.ugc.aweme.util.c;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.aweme.video.b;
import java.io.File;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public class n implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71164a;

    /* renamed from: b  reason: collision with root package name */
    public String f71165b;

    /* renamed from: c  reason: collision with root package name */
    public String f71166c;

    /* renamed from: d  reason: collision with root package name */
    public String f71167d;

    /* renamed from: e  reason: collision with root package name */
    public int f71168e;

    /* renamed from: f  reason: collision with root package name */
    public String f71169f = ((IAVService) ServiceManager.get().getService(IAVService.class)).shortVideoConfig().cacheDir();
    public com.ss.android.ugc.aweme.shortvideo.view.d g;
    public Activity h;
    public String i;
    public Aweme j;
    public int k;
    public int l;
    public GameDuetResource m;
    public boolean n = false;
    public int o;
    private Handler p = new Handler(Looper.getMainLooper());
    private String q = "";
    private boolean r = true;
    private long s;
    private Runnable t = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f71174a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f71174a, false, 80929, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f71174a, false, 80929, new Class[0], Void.TYPE);
                return;
            }
            if (n.this.g != null) {
                com.ss.android.ugc.aweme.shortvideo.view.d dVar = n.this.g;
                int i = 100;
                if (n.this.f71168e < 100) {
                    i = n.this.f71168e;
                }
                dVar.setProgress(i);
            }
        }
    };

    public void onCancel() {
    }

    public void onDownloadPause() {
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f71164a, false, 80915, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f71164a, false, 80915, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        final boolean z2 = z;
        a.b(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f71187a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f71187a, false, 80936, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f71187a, false, 80936, new Class[0], Void.TYPE);
                    return;
                }
                ((IAVService) ServiceManager.get().getService(IAVService.class)).getMusicWaveBean(n.this.f71167d, 3, false, false, -1, new o(this, z2));
            }
        });
    }

    public final void a(boolean z, MusicWaveBean musicWaveBean) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), musicWaveBean}, this, f71164a, false, 80916, new Class[]{Boolean.TYPE, MusicWaveBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), musicWaveBean}, this, f71164a, false, 80916, new Class[]{Boolean.TYPE, MusicWaveBean.class}, Void.TYPE);
            return;
        }
        b();
        if (z) {
            com.bytedance.ies.dmt.ui.d.a.b(this.h.getApplicationContext(), (int) C0906R.string.ac6).a();
        }
        String uuid = UUID.randomUUID().toString();
        r.a("shoot", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", uuid).a("shoot_way", "split").a("_staging_flag", com.ss.android.g.a.b() ^ true ? 1 : 0).a("group_id", this.j.getAid()).f34114b);
        Intent intent = new Intent();
        intent.putExtra("shoot_way", "split");
        intent.putExtra("creation_id", uuid);
        aj.a(this.q);
        intent.putExtra("duet_video_path", this.f71166c);
        intent.putExtra("duet_audio_path", this.f71167d);
        intent.putExtra("duet_video_width", this.k);
        intent.putExtra("duet_video_height", this.l);
        intent.putExtra("duet_from", this.j.getAid());
        intent.putExtra("duet_author", this.j.getAuthor());
        intent.putExtra("music_origin", "split");
        if (musicWaveBean != null) {
            intent.putExtra("music_wave_data", musicWaveBean);
        }
        if (this.n) {
            intent.putExtra("duet_sticker_game", this.m);
            intent.putExtra("first_face_sticker", this.m.gameSticker.getStickerId());
        }
        if (this.j.hasStickerID()) {
            intent.putStringArrayListExtra("reuse_sticker_ids", bv.a(this.j.getStickerIDs()));
        }
        ((IAVService) ServiceManager.get().getService(IAVService.class)).startToolPermissionActivity(this.h, intent);
        String str = "";
        if (!(this.j.getAuthor() == null && this.j.getAuthor().getUid() == null)) {
            str = this.j.getAuthor().getUid();
        }
        r.onEvent(MobClick.obtain().setEventName("shoot").setLabelName("split").setValue(this.j.getAid()).setExtValueString(str));
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f71164a, false, 80911, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71164a, false, 80911, new Class[0], Void.TYPE);
            return;
        }
        a.b(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f71180a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f71180a, false, 80932, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f71180a, false, 80932, new Class[0], Void.TYPE);
                    return;
                }
                if (n.this.h != null) {
                    UIUtils.displayToast((Context) n.this.h, (int) C0906R.string.es, 0);
                }
            }
        });
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f71164a, false, 80918, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71164a, false, 80918, new Class[0], Void.TYPE);
        } else if (this.r) {
            m.a(this);
        } else {
            a.b(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f71190a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f71190a, false, 80938, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f71190a, false, 80938, new Class[0], Void.TYPE);
                        return;
                    }
                    n.this.b();
                    n.this.g = com.ss.android.ugc.aweme.shortvideo.view.d.b(n.this.h, n.this.h.getResources().getString(C0906R.string.c83));
                    n.this.g.setIndeterminate(true);
                }
            });
            a.a(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f71172a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f71172a, false, 80939, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f71172a, false, 80939, new Class[0], Void.TYPE);
                    } else if (!b.b(n.this.f71166c) || !b.b(n.this.f71167d)) {
                        int[] a2 = FFMpegManager.a().a(n.this.f71165b);
                        FFMpegManager.a().b();
                        if (a2[0] != 0) {
                            n.this.c();
                            return;
                        }
                        n.this.k = n.this.a(a2[2] / 2);
                        n.this.l = n.this.a(a2[3] / 2);
                        FFMpegManager.a aVar = new FFMpegManager.a();
                        aVar.o = n.this.k;
                        aVar.p = n.this.l;
                        aVar.f29317c = n.this.f71167d;
                        aVar.f29315a = n.this.f71165b;
                        aVar.f29316b = n.this.f71166c;
                        aVar.f29320f = UIUtils.getScreenWidth(n.this.h);
                        aVar.f29318d = 0;
                        aVar.f29319e = (long) a2[1];
                        aVar.j = 0;
                        aVar.n = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                        aVar.u = true;
                        if (FFMpegManager.a().a(aVar) == 0) {
                            n.this.a();
                        } else {
                            n.this.c();
                        }
                    } else {
                        n.this.a();
                    }
                }
            });
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f71164a, false, 80919, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71164a, false, 80919, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null) {
            try {
                this.g.dismiss();
            } catch (Exception unused) {
            }
            this.g = null;
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f71164a, false, 80920, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71164a, false, 80920, new Class[0], Void.TYPE);
            return;
        }
        a.b(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f71170a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f71170a, false, 80928, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f71170a, false, 80928, new Class[0], Void.TYPE);
                    return;
                }
                if (n.this.h != null) {
                    n.this.b();
                    com.bytedance.ies.dmt.ui.d.a.b(n.this.h.getApplicationContext(), (int) C0906R.string.a7i).a();
                }
            }
        });
    }

    private boolean e() {
        if (PatchProxy.isSupport(new Object[0], this, f71164a, false, 80913, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f71164a, false, 80913, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.h == null) {
            return false;
        } else {
            if (!b.h()) {
                com.bytedance.ies.dmt.ui.d.a.b(this.h.getApplicationContext(), (int) C0906R.string.c1x).a();
                return false;
            } else if (b.i() >= 20971520) {
                return true;
            } else {
                com.bytedance.ies.dmt.ui.d.a.b(this.h.getApplicationContext(), (int) C0906R.string.c1y).a();
                return false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b5, code lost:
        if (r1 == null) goto L_0x00ba;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f71164a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 80914(0x13c12, float:1.13385E-40)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f71164a
            r5 = 0
            r6 = 80914(0x13c12, float:1.13385E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            android.app.Activity r1 = r9.h
            if (r1 == 0) goto L_0x0102
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r2 = com.ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r1 = r1.getService(r2)
            com.ss.android.ugc.aweme.services.IAVService r1 = (com.ss.android.ugc.aweme.services.IAVService) r1
            com.ss.android.ugc.aweme.services.video.IAVPublishService r1 = r1.publishService()
            r2 = 0
            r1.setCurMusic(r2)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r3 = com.ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r1 = r1.getService(r3)
            com.ss.android.ugc.aweme.services.IAVService r1 = (com.ss.android.ugc.aweme.services.IAVService) r1
            com.ss.android.ugc.aweme.services.video.IAVPublishService r1 = r1.publishService()
            r1.removeChallenges()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.j
            com.ss.android.ugc.aweme.music.model.Music r1 = r1.getMusic()
            if (r1 == 0) goto L_0x0080
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r3 = com.ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r1 = r1.getService(r3)
            com.ss.android.ugc.aweme.services.IAVService r1 = (com.ss.android.ugc.aweme.services.IAVService) r1
            com.ss.android.ugc.aweme.services.video.IAVPublishService r1 = r1.publishService()
            com.ss.android.ugc.aweme.shortvideo.o.c r3 = new com.ss.android.ugc.aweme.shortvideo.o.c
            r3.<init>()
            com.ss.android.ugc.aweme.music.util.c r4 = com.ss.android.ugc.aweme.music.util.c.f56796b
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r9.j
            com.ss.android.ugc.aweme.music.model.Music r5 = r5.getMusic()
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r4 = r4.a((com.ss.android.ugc.aweme.music.model.Music) r5)
            com.ss.android.ugc.aweme.shortvideo.e r3 = r3.apply(r4)
            r1.setCurMusic(r3)
        L_0x0080:
            int r1 = r9.k
            if (r1 == 0) goto L_0x0088
            int r1 = r9.l
            if (r1 != 0) goto L_0x00ba
        L_0x0088:
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
            r1.<init>()     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
            java.lang.String r3 = r9.f71166c     // Catch:{ Exception -> 0x00ab }
            r1.setDataSource(r3)     // Catch:{ Exception -> 0x00ab }
            r3 = 18
            java.lang.String r3 = r1.extractMetadata(r3)     // Catch:{ Exception -> 0x00ab }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ Exception -> 0x00ab }
            r9.k = r3     // Catch:{ Exception -> 0x00ab }
            r3 = 19
            java.lang.String r3 = r1.extractMetadata(r3)     // Catch:{ Exception -> 0x00ab }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ Exception -> 0x00ab }
            r9.l = r3     // Catch:{ Exception -> 0x00ab }
            goto L_0x00b7
        L_0x00ab:
            r3 = move-exception
            goto L_0x00b2
        L_0x00ad:
            r0 = move-exception
            r1 = r2
            goto L_0x00fc
        L_0x00b0:
            r3 = move-exception
            r1 = r2
        L_0x00b2:
            com.ss.android.ugc.aweme.framework.a.a.a((java.lang.Exception) r3)     // Catch:{ all -> 0x00fb }
            if (r1 == 0) goto L_0x00ba
        L_0x00b7:
            r1.release()
        L_0x00ba:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.j
            com.ss.android.ugc.aweme.feed.model.GameInfo r1 = r1.getGameInfo()
            if (r1 == 0) goto L_0x00f7
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r1 = com.ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.services.IAVService r0 = (com.ss.android.ugc.aweme.services.IAVService) r0
            com.ss.android.ugc.aweme.services.effect.IEffectService r0 = r0.effectService()
            android.app.Activity r1 = r9.h
            java.lang.String r3 = com.ss.android.ugc.aweme.language.e.b()
            com.ss.android.ugc.aweme.net.y r4 = com.ss.android.ugc.aweme.net.y.a()
            okhttp3.OkHttpClient r4 = r4.b()
            com.ss.android.ugc.aweme.effectplatform.g r0 = r0.createEffectPlatform(r1, r3, r4)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.j
            long r3 = a((com.ss.android.ugc.aweme.feed.model.Aweme) r1)
            java.lang.String r1 = java.lang.String.valueOf(r3)
            com.ss.android.ugc.aweme.shortvideo.util.n$7 r3 = new com.ss.android.ugc.aweme.shortvideo.util.n$7
            r3.<init>()
            r0.a((java.lang.String) r1, (java.lang.String) r2, (com.ss.android.ugc.effectmanager.effect.b.i) r3)
            return
        L_0x00f7:
            r9.a((boolean) r0)
            return
        L_0x00fb:
            r0 = move-exception
        L_0x00fc:
            if (r1 == 0) goto L_0x0101
            r1.release()
        L_0x0101:
            throw r0
        L_0x0102:
            r9.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.util.n.a():void");
    }

    private static long a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f71164a, true, 80925, new Class[]{Aweme.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{aweme}, null, f71164a, true, 80925, new Class[]{Aweme.class}, Long.TYPE)).longValue();
        } else if (aweme.getStickerIDs() == null || aweme.getStickerIDs().isEmpty()) {
            return -1;
        } else {
            try {
                return Long.parseLong(aweme.getStickerIDs().split(",")[0]);
            } catch (NumberFormatException unused) {
                c.a("id format error");
                return -1;
            }
        }
    }

    public void onDownloadStart(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f71164a, false, 80921, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f71164a, false, 80921, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.s = System.currentTimeMillis();
    }

    public void onError(com.ss.android.ugc.a.c cVar) {
        com.ss.android.ugc.a.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f71164a, false, 80924, new Class[]{com.ss.android.ugc.a.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f71164a, false, 80924, new Class[]{com.ss.android.ugc.a.c.class}, Void.TYPE);
            return;
        }
        c();
        if (NetworkUtils.isNetworkAvailable(k.a())) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(PushConstants.WEB_URL, this.i);
                jSONObject.put("from", "duet");
            } catch (JSONException unused) {
            }
            com.ss.android.ugc.aweme.app.n.a("aweme_download_error_rate", 1, jSONObject);
        }
        com.ss.android.ugc.aweme.app.d.a.a("aweme_movie_download_log", "", cVar2.f31520b, cVar2.f31519a, this.i, "duet");
    }

    private void a(String str) {
        final String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f71164a, false, 80912, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f71164a, false, 80912, new Class[]{String.class}, Void.TYPE);
            return;
        }
        a.b(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f71182a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f71182a, false, 80933, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f71182a, false, 80933, new Class[0], Void.TYPE);
                    return;
                }
                if (n.this.h != null) {
                    e.a(com.ss.android.ugc.aweme.framework.core.a.b().a(), str2, "click_duet_button", ad.a().a("login_title", n.this.h.getString(C0906R.string.c7i)).f75487b);
                }
            }
        });
    }

    public void onDownloadSuccess(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f71164a, false, 80923, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f71164a, false, 80923, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (str != null) {
            if (str.length() == 0) {
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new Exception("WaterMarkComposer download file size == 0: " + this.i));
                c();
                return;
            }
            File file = new File(str);
            if (file.exists()) {
                com.ss.android.ugc.traffic.a.y.c(file.length());
            }
            this.f71165b = str;
            f();
        }
        if (NetworkUtils.isNetworkAvailable(k.a())) {
            com.ss.android.ugc.aweme.app.n.a("aweme_download_error_rate", 0, new com.ss.android.ugc.aweme.app.d.c().a("duration", Long.valueOf(System.currentTimeMillis() - this.s)).a("from", "duet").b());
        }
    }

    public final int a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f71164a, false, 80917, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f71164a, false, 80917, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        double d2 = (double) i2;
        Double.isNaN(d2);
        return ((int) Math.round((d2 * 1.0d) / 16.0d)) * 16;
    }

    public void onDownloadProgress(int i2, long j2, long j3) {
        int i3 = i2;
        long j4 = j2;
        long j5 = j3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), new Long(j4), new Long(j5)}, this, f71164a, false, 80922, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), new Long(j4), new Long(j5)}, this, f71164a, false, 80922, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.o = i3;
            this.f71168e = i3;
            a.b(this.t);
        }
    }

    public final void a(Aweme aweme, Activity activity, String str) {
        Aweme aweme2 = aweme;
        Activity activity2 = activity;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{aweme2, activity2, str2}, this, f71164a, false, 80910, new Class[]{Aweme.class, Activity.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, activity2, str2}, this, f71164a, false, 80910, new Class[]{Aweme.class, Activity.class, String.class}, Void.TYPE);
            return;
        }
        this.h = activity2;
        if (!com.ss.android.ugc.aweme.account.d.a().isLogin() && ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().needLoginBeforeRecord()) {
            a(str2);
        } else if (((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().isPublishFinished() || ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().isUnKnown()) {
            this.j = aweme2;
            this.q = str2;
            if (this.j != null && this.j.getAuthor() != null && e() && NetworkUtils.isNetworkAvailable(com.ss.android.ugc.aweme.base.utils.d.a())) {
                ((IAVService) ServiceManager.get().getService(IAVService.class)).getFilterService().refreshData();
                if (this.j.canDuet()) {
                    VideoUrlModel playAddrH264 = this.j.getVideo().getPlayAddrH264();
                    if (playAddrH264 != null && !CollectionUtils.isEmpty(playAddrH264.getUrlList())) {
                        this.i = LinkSelector.a().a(playAddrH264.getUrlList().get(0));
                        String md5Hex = DigestUtils.md5Hex(playAddrH264.getBitRatedRatioUri());
                        this.f71165b = this.f71169f + md5Hex + ".mp4";
                        this.f71166c = this.f71169f + "temp_" + md5Hex + ".mp4";
                        this.f71167d = this.f71169f + "temp_" + md5Hex + ".wav";
                        if (b.b(this.f71165b)) {
                            f();
                            return;
                        }
                        if (this.g == null) {
                            this.g = com.ss.android.ugc.aweme.shortvideo.view.d.b(this.h, this.h.getResources().getString(C0906R.string.a8b));
                        }
                        this.g.setIndeterminate(false);
                        this.g.setProgress(0);
                        if (!b.b(this.f71165b)) {
                            b.a(this.f71169f, false);
                        }
                        com.ss.android.ugc.aweme.video.local.b.a(aweme.getAid(), new e.a().a(this.i).b(this.f71165b).a(), this);
                        this.o = 0;
                        this.p.postDelayed(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f71178a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f71178a, false, 80931, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f71178a, false, 80931, new Class[0], Void.TYPE);
                                    return;
                                }
                                if (n.this.o == 0) {
                                    n.this.c();
                                }
                            }
                        }, 60000);
                    }
                } else if (this.j.getVideo() == null || ((long) this.j.getVideo().getVideoLength()) <= ((IAVService) ServiceManager.get().getService(IAVService.class)).shortVideoConfig().maxRecordingTime()) {
                    c();
                } else {
                    a.b(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f71176a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f71176a, false, 80930, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f71176a, false, 80930, new Class[0], Void.TYPE);
                                return;
                            }
                            n.this.b();
                            if (n.this.h != null) {
                                new AlertDialog.Builder(n.this.h).setTitle(C0906R.string.q0).setMessage(C0906R.string.pz).setNegativeButton(C0906R.string.py, null).show();
                            }
                        }
                    });
                }
            }
        } else {
            d();
        }
    }
}
