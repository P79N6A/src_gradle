package com.ss.android.ugc.aweme.shortvideo.i;

import a.g;
import a.i;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.DigestUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.linkselector.LinkSelector;
import com.ss.android.ugc.a.e;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.React;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.view.d;
import com.ss.android.ugc.aweme.utils.ad;
import java.util.Map;
import java.util.concurrent.Callable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68175a;

    /* renamed from: b  reason: collision with root package name */
    public Activity f68176b;

    /* renamed from: c  reason: collision with root package name */
    public Aweme f68177c;

    /* renamed from: d  reason: collision with root package name */
    public Aweme f68178d;

    /* renamed from: e  reason: collision with root package name */
    public Aweme f68179e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f68180f;
    public String g;
    public String h;
    public String i;
    String j;
    String k;
    public int l;
    public d m;
    int n;
    int o;
    public AlertDialog p;
    public Runnable q = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68181a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f68181a, false, 78295, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f68181a, false, 78295, new Class[0], Void.TYPE);
                return;
            }
            if (a.this.m != null) {
                d dVar = a.this.m;
                int i = 100;
                if (a.this.l < 100) {
                    i = a.this.l;
                }
                dVar.setProgress(i);
            }
        }
    };
    private React r;
    private String s = ((IAVService) ServiceManager.get().getService(IAVService.class)).shortVideoConfig().cacheDir();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.i.a$a  reason: collision with other inner class name */
    class C0717a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68183a;

        private C0717a() {
        }

        public final void onClick(View view) {
            String str;
            if (PatchProxy.isSupport(new Object[]{view}, this, f68183a, false, 78296, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f68183a, false, 78296, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (view.getId() == C0906R.id.caf) {
                a.this.f68178d = a.this.f68179e;
                a.this.f68180f = true;
            } else if (view.getId() == C0906R.id.cag) {
                a.this.f68178d = a.this.f68177c;
            }
            a.this.p.dismiss();
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("group_id", a.this.f68178d.getAid()).a("origin_group_id", a.this.f68179e.getAid()).a("enter_from", a.this.g);
            if (view.getId() == C0906R.id.caf) {
                str = "from_react_origin";
            } else {
                str = "from_react_react";
            }
            r.a("click_react", (Map) a2.a("react_mode", str).f34114b);
            a.this.a();
        }

        /* synthetic */ C0717a(a aVar, byte b2) {
            this();
        }
    }

    class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68186a;

        private b() {
        }

        public final void onClick(View view) {
            String str;
            String str2;
            if (PatchProxy.isSupport(new Object[]{view}, this, f68186a, false, 78297, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f68186a, false, 78297, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            a.this.p.dismiss();
            if (view.getId() != C0906R.id.caf || !a.this.f68179e.getStatus().isDelete()) {
                com.bytedance.ies.dmt.ui.d.a.b(a.this.f68176b.getApplicationContext(), (int) C0906R.string.bvj).a();
            } else {
                com.bytedance.ies.dmt.ui.d.a.b(a.this.f68176b.getApplicationContext(), (int) C0906R.string.bvk).a();
            }
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("group_id", a.this.f68177c.getAid()).a("origin_group_id", a.this.f68179e.getAid()).a("enter_from", a.this.g);
            if (view.getId() == C0906R.id.caf) {
                str = "from_react_origin";
            } else {
                str = "from_react_react";
            }
            r.a("click_react", (Map) a2.a("react_mode", str).f34114b);
            com.ss.android.ugc.aweme.app.d.d a3 = com.ss.android.ugc.aweme.app.d.d.a().a("group_id", a.this.f68177c.getAid()).a("origin_group_id", a.this.f68179e.getAid());
            if (view.getId() == C0906R.id.caf) {
                str2 = "from_react_origin";
            } else {
                str2 = "from_react_react";
            }
            r.a("react_fail", (Map) a3.a("react_mode", str2).f34114b);
        }

        /* synthetic */ b(a aVar, byte b2) {
            this();
        }
    }

    class c extends com.ss.android.ugc.aweme.shortvideo.i.a.c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68192a;

        public final void onError(com.ss.android.ugc.a.c cVar) {
            if (PatchProxy.isSupport(new Object[]{cVar}, this, f68192a, false, 78300, new Class[]{com.ss.android.ugc.a.c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar}, this, f68192a, false, 78300, new Class[]{com.ss.android.ugc.a.c.class}, Void.TYPE);
                return;
            }
            super.onError(cVar);
            a.this.d();
        }

        public final void onDownloadSuccess(String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f68192a, false, 78299, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f68192a, false, 78299, new Class[]{String.class}, Void.TYPE);
                return;
            }
            super.onDownloadSuccess(str);
            if (str != null) {
                if (str.length() == 0) {
                    a.this.d();
                    com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new Exception("WaterMarkComposer download file size == 0: " + a.this.h));
                    return;
                }
                a.this.i = str;
                a.this.b();
            }
        }

        c(String str, String str2) {
            super(str, str2);
        }

        public final void onDownloadProgress(int i, long j, long j2) {
            long j3 = j;
            long j4 = j2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j3), new Long(j4)}, this, f68192a, false, 78298, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j3), new Long(j4)}, this, f68192a, false, 78298, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE);
                return;
            }
            super.onDownloadProgress(i, j, j2);
            if (a.this.f68176b != null) {
                a.this.l = i;
                com.ss.android.b.a.a.a.b(a.this.q);
            }
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f68175a, false, 78281, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68175a, false, 78281, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.b.a.a.a.b(new d(this));
        com.ss.android.b.a.a.a.a(new e(this));
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f68175a, false, 78285, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68175a, false, 78285, new Class[0], Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new h<TResult>(this), i.f1052b);
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (PatchProxy.isSupport(new Object[0], this, f68175a, false, 78287, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68175a, false, 78287, new Class[0], Void.TYPE);
            return;
        }
        if (this.m != null) {
            try {
                this.m.dismiss();
            } catch (Exception unused) {
            }
        }
        this.m = null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void f() throws Exception {
        if (this.f68176b != null) {
            if (!NetworkUtils.isNetworkAvailable(com.ss.android.ugc.aweme.base.utils.d.a())) {
                e();
                com.bytedance.ies.dmt.ui.d.a.b(com.ss.android.ugc.aweme.base.utils.d.a(), (int) C0906R.string.bgg).a();
            } else {
                e();
                com.bytedance.ies.dmt.ui.d.a.b(com.ss.android.ugc.aweme.base.utils.d.a(), (int) C0906R.string.a7i).a();
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b9, code lost:
        if (r0 == null) goto L_0x00be;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c() {
        /*
            r10 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f68175a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 78282(0x131ca, float:1.09696E-40)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f68175a
            r5 = 0
            r6 = 78282(0x131ca, float:1.09696E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            android.app.Activity r0 = r10.f68176b
            if (r0 == 0) goto L_0x00e2
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r1 = com.ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.services.IAVService r0 = (com.ss.android.ugc.aweme.services.IAVService) r0
            com.ss.android.ugc.aweme.services.video.IAVPublishService r0 = r0.publishService()
            r1 = 0
            r0.setCurMusic(r1)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r2 = com.ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r0 = r0.getService(r2)
            com.ss.android.ugc.aweme.services.IAVService r0 = (com.ss.android.ugc.aweme.services.IAVService) r0
            com.ss.android.ugc.aweme.services.video.IAVPublishService r0 = r0.publishService()
            r0.removeChallenges()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r10.f68178d
            com.ss.android.ugc.aweme.music.model.Music r0 = r0.getMusic()
            if (r0 == 0) goto L_0x0080
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r2 = com.ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r0 = r0.getService(r2)
            com.ss.android.ugc.aweme.services.IAVService r0 = (com.ss.android.ugc.aweme.services.IAVService) r0
            com.ss.android.ugc.aweme.services.video.IAVPublishService r0 = r0.publishService()
            com.ss.android.ugc.aweme.shortvideo.o.c r2 = new com.ss.android.ugc.aweme.shortvideo.o.c
            r2.<init>()
            com.ss.android.ugc.aweme.music.util.c r3 = com.ss.android.ugc.aweme.music.util.c.f56796b
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r10.f68178d
            com.ss.android.ugc.aweme.music.model.Music r4 = r4.getMusic()
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r3 = r3.a((com.ss.android.ugc.aweme.music.model.Music) r4)
            com.ss.android.ugc.aweme.shortvideo.e r2 = r2.apply(r3)
            r0.setCurMusic(r2)
        L_0x0080:
            int r0 = r10.n
            if (r0 == 0) goto L_0x0088
            int r0 = r10.o
            if (r0 != 0) goto L_0x00be
        L_0x0088:
            android.media.MediaMetadataRetriever r0 = new android.media.MediaMetadataRetriever     // Catch:{ Exception -> 0x00b2, all -> 0x00ad }
            r0.<init>()     // Catch:{ Exception -> 0x00b2, all -> 0x00ad }
            java.lang.String r1 = r10.j     // Catch:{ Exception -> 0x00ab }
            r0.setDataSource(r1)     // Catch:{ Exception -> 0x00ab }
            r1 = 18
            java.lang.String r1 = r0.extractMetadata(r1)     // Catch:{ Exception -> 0x00ab }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x00ab }
            r10.n = r1     // Catch:{ Exception -> 0x00ab }
            r1 = 19
            java.lang.String r1 = r0.extractMetadata(r1)     // Catch:{ Exception -> 0x00ab }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x00ab }
            r10.o = r1     // Catch:{ Exception -> 0x00ab }
            goto L_0x00bb
        L_0x00ab:
            r1 = move-exception
            goto L_0x00b6
        L_0x00ad:
            r0 = move-exception
            r9 = r1
            r1 = r0
            r0 = r9
            goto L_0x00dc
        L_0x00b2:
            r0 = move-exception
            r9 = r1
            r1 = r0
            r0 = r9
        L_0x00b6:
            com.ss.android.ugc.aweme.framework.a.a.a((java.lang.Exception) r1)     // Catch:{ all -> 0x00db }
            if (r0 == 0) goto L_0x00be
        L_0x00bb:
            r0.release()
        L_0x00be:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r1 = com.ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r0 = r0.getService(r1)
            r1 = r0
            com.ss.android.ugc.aweme.services.IAVService r1 = (com.ss.android.ugc.aweme.services.IAVService) r1
            java.lang.String r2 = r10.k
            r3 = 4
            r4 = 0
            r5 = 0
            r6 = -1
            com.ss.android.ugc.aweme.shortvideo.i.f r8 = new com.ss.android.ugc.aweme.shortvideo.i.f
            r8.<init>(r10)
            r1.getMusicWaveBean(r2, r3, r4, r5, r6, r8)
            return
        L_0x00db:
            r1 = move-exception
        L_0x00dc:
            if (r0 == 0) goto L_0x00e1
            r0.release()
        L_0x00e1:
            throw r1
        L_0x00e2:
            r10.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.i.a.c():void");
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f68175a, false, 78280, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68175a, false, 78280, new Class[0], Void.TYPE);
            return;
        }
        VideoUrlModel playAddrH264 = this.f68178d.getVideo().getPlayAddrH264();
        if (playAddrH264 != null && !CollectionUtils.isEmpty(playAddrH264.getUrlList())) {
            this.h = LinkSelector.a().a(playAddrH264.getUrlList().get(0));
            String md5Hex = DigestUtils.md5Hex(playAddrH264.getBitRatedRatioUri());
            this.i = this.s + md5Hex + ".mp4";
            this.j = this.s + "temp_" + md5Hex + ".mp4";
            this.k = this.s + "temp_" + md5Hex + ".wav";
            if (com.ss.android.ugc.aweme.video.b.b(this.i)) {
                b();
                return;
            }
            com.ss.android.ugc.aweme.video.b.a(this.s, false);
            if (this.m == null) {
                this.m = d.b(this.f68176b, this.f68176b.getResources().getString(C0906R.string.a8b));
            }
            this.m.setIndeterminate(false);
            this.m.setProgress(0);
            com.ss.android.ugc.aweme.video.local.b.a(this.f68178d.getAid(), new e.a().a(this.h).b(this.i).a(), new c(this.h, this.g));
        }
    }

    /* access modifiers changed from: package-private */
    public int a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f68175a, false, 78286, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f68175a, false, 78286, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        double d2 = (double) i2;
        Double.isNaN(d2);
        return ((int) Math.round((d2 * 1.0d) / 16.0d)) * 16;
    }

    /* access modifiers changed from: package-private */
    public void a(MusicWaveBean musicWaveBean) {
        MusicWaveBean musicWaveBean2 = musicWaveBean;
        if (PatchProxy.isSupport(new Object[]{musicWaveBean2}, this, f68175a, false, 78283, new Class[]{MusicWaveBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicWaveBean2}, this, f68175a, false, 78283, new Class[]{MusicWaveBean.class}, Void.TYPE);
            return;
        }
        com.ss.android.b.a.a.a.b(new g(this, musicWaveBean2));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void a(i iVar) throws Exception {
        e();
        if (!iVar.d()) {
            this.r = (React) iVar.e();
            if (!PatchProxy.isSupport(new Object[0], this, f68175a, false, 78279, new Class[0], Void.TYPE)) {
                if (this.r.getOrigin() != null) {
                    this.f68179e = this.r.getOrigin();
                    AlertDialog.Builder builder = new AlertDialog.Builder(this.f68176b);
                    View inflate = this.f68176b.getLayoutInflater().inflate(C0906R.layout.ark, null);
                    builder.setView(inflate);
                    TextView textView = (TextView) inflate.findViewById(C0906R.id.caf);
                    TextView textView2 = (TextView) inflate.findViewById(C0906R.id.cag);
                    C0717a aVar = new C0717a(this, (byte) 0);
                    b bVar = new b(this, (byte) 0);
                    if (this.r.getReactionPermission(this.f68177c, this.f68179e) != 0) {
                        r.a("react_choice_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("group_id", this.f68177c.getAid()).a("origin_group_id", this.f68179e.getAid()).a("enter_from", this.g).f34114b);
                    }
                    switch (this.r.getReactionPermission(this.f68177c, this.f68179e)) {
                        case 0:
                            r.a("react_fail", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("group_id", this.f68177c.getAid()).a("origin_group_id", this.f68179e.getAid()).a("react_mode", "from_react").f34114b);
                            com.bytedance.ies.dmt.ui.d.a.c(this.f68176b.getApplicationContext(), (int) C0906R.string.bvj).a();
                            e();
                            break;
                        case 1:
                            textView.setOnClickListener(aVar);
                            textView2.setOnClickListener(bVar);
                            this.p = builder.create();
                            this.p.show();
                            break;
                        case 2:
                            textView.setOnClickListener(bVar);
                            textView2.setOnClickListener(aVar);
                            this.p = builder.create();
                            this.p.show();
                            break;
                        case 3:
                            textView.setOnClickListener(aVar);
                            textView2.setOnClickListener(aVar);
                            this.p = builder.create();
                            this.p.show();
                            break;
                    }
                } else {
                    this.f68179e = this.f68177c;
                    this.f68178d = this.f68177c;
                    this.f68180f = true;
                    if (this.r.getReactable() || this.f68178d.getAuthor().isMe()) {
                        r.a("click_react", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("group_id", this.f68178d.getAid()).a("origin_group_id", this.f68179e.getAid()).a("enter_from", this.g).a("react_mode", "from_origin").f34114b);
                        a();
                    } else {
                        r.a("react_fail", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("group_id", this.f68178d.getAid()).a("origin_group_id", this.f68179e.getAid()).a("react_mode", "from_origin").f34114b);
                        com.bytedance.ies.dmt.ui.d.a.c(this.f68176b.getApplicationContext(), (int) C0906R.string.bvj).a();
                        e();
                    }
                }
            } else {
                PatchProxy.accessDispatch(new Object[0], this, f68175a, false, 78279, new Class[0], Void.TYPE);
            }
        } else {
            d();
        }
        return null;
    }

    public final void a(Activity activity, Aweme aweme, String str) {
        Activity activity2 = activity;
        Aweme aweme2 = aweme;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{activity2, aweme2, str2}, this, f68175a, false, 78278, new Class[]{Activity.class, Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, aweme2, str2}, this, f68175a, false, 78278, new Class[]{Activity.class, Aweme.class, String.class}, Void.TYPE);
            return;
        }
        this.f68176b = activity2;
        this.f68177c = aweme2;
        this.g = str2;
        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
        if (iAVService != null && iAVService.needLoginBeforeRecord()) {
            com.ss.android.ugc.aweme.login.e.a(activity2, str2, "click_react_button", ad.a().a("login_title", activity2.getString(C0906R.string.c7i)).f75487b);
        } else if (!((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().isPublishFinished() && !((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().isUnKnown()) {
            UIUtils.displayToast(com.ss.android.ugc.aweme.base.utils.d.a(), (int) C0906R.string.es, 0);
        } else if (this.f68177c != null && this.f68177c.getAuthor() != null && com.ss.android.ugc.aweme.shortvideo.i.a.a.a()) {
            if (!NetworkUtils.isNetworkAvailable(com.ss.android.ugc.aweme.base.utils.d.a())) {
                com.bytedance.ies.dmt.ui.d.a.b(com.ss.android.ugc.aweme.base.utils.d.a(), (int) C0906R.string.bgg).a();
                return;
            }
            this.m = d.b(this.f68176b, this.f68176b.getResources().getString(C0906R.string.a8b));
            this.m.setIndeterminate(true);
            i.a((Callable<TResult>) new b<TResult>(this)).a((g<TResult, TContinuationResult>) new c<TResult,TContinuationResult>(this), i.f1052b);
        }
    }
}
