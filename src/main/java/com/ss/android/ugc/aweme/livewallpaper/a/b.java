package com.ss.android.ugc.aweme.livewallpaper.a;

import a.g;
import a.i;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.common.utility.DigestUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.image.CloseableImage;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.linkselector.LinkSelector;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.livewallpaper.c.c;
import com.ss.android.ugc.aweme.livewallpaper.c.e;
import java.util.List;
import java.util.concurrent.Callable;

public final class b extends a {
    public static ChangeQuickRedirect k;

    public final void onCancel() {
    }

    public final void onDownloadPause() {
    }

    public final void onDownloadStart(int i) {
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 56040, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 56040, new Class[0], Void.TYPE);
            return;
        }
        b(this.i);
        e.b(0, "");
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 56041, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 56041, new Class[0], Void.TYPE);
            return;
        }
        a();
        a.b(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f53580a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f53580a, false, 56050, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f53580a, false, 56050, new Class[0], Void.TYPE);
                    return;
                }
                if (b.this.f53572c != null && !b.this.f53572c.isFinishing()) {
                    b.this.b();
                    com.bytedance.ies.dmt.ui.d.a.b((Context) b.this.f53572c, (int) C0906R.string.a7i).a();
                }
            }
        });
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 56048, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 56048, new Class[0], Void.TYPE);
            return;
        }
        a.b(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f53595a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f53595a, false, 56057, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f53595a, false, 56057, new Class[0], Void.TYPE);
                    return;
                }
                b.this.b();
            }
        });
    }

    private void h() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 56044, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 56044, new Class[0], Void.TYPE);
        } else if (e.a((Context) this.f53572c, this.f53572c.getPackageName())) {
            c.a().a("video_share", new com.ss.android.ugc.aweme.livewallpaper.c.a(this.f53571b.getAid()));
        } else {
            if (this.f53572c instanceof AmeSSActivity) {
                ((AmeSSActivity) this.f53572c).setOnActivityResultListener(new AmeSSActivity.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f53584a;

                    public final void a(int i, int i2, Intent intent) {
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f53584a, false, 56052, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f53584a, false, 56052, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
                            return;
                        }
                        if (i == 100 && e.a((Context) b.this.f53572c, b.this.f53572c.getPackageName())) {
                            com.bytedance.ies.dmt.ui.d.a.a(GlobalContext.getContext(), (int) C0906R.string.c4j).a();
                            e.a(b.this.f53571b.getAid(), "paper_set", true);
                            e.a(0, "");
                        }
                    }
                });
            }
        }
    }

    public final String d() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 56039, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, k, false, 56039, new Class[0], String.class);
        } else if (this.f53572c == null || this.f53572c.isFinishing()) {
            return "";
        } else {
            return this.f53572c.getString(C0906R.string.b6u);
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 56038, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 56038, new Class[0], Void.TYPE);
            return;
        }
        this.f53575f = e.a();
        this.g = DigestUtils.md5Hex(this.f53571b.getVideo().getPlayAddrH264().getUri());
        this.i = this.f53575f + this.g + ".mp4";
        this.h = this.f53575f + "temp/" + this.g + ".mp4";
        if (!com.ss.android.ugc.aweme.video.b.b(this.h)) {
            com.ss.android.ugc.aweme.video.b.a(this.h, true);
        }
    }

    public b(Activity activity) {
        super(activity);
        this.f53572c = activity;
    }

    public final boolean b(Aweme aweme) {
        String str;
        if (PatchProxy.isSupport(new Object[]{aweme}, this, k, false, 56037, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, this, k, false, 56037, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        }
        Video video = aweme.getVideo();
        if (video == null) {
            return false;
        }
        VideoUrlModel playAddrH264 = video.getPlayAddrH264();
        if (playAddrH264 == null) {
            return false;
        }
        List<String> urlList = playAddrH264.getUrlList();
        if (CollectionUtils.isEmpty(urlList)) {
            return false;
        }
        if (urlList.size() > 2) {
            str = urlList.get(2);
        } else {
            str = urlList.get(0);
        }
        this.f53574e = LinkSelector.a().a(str);
        if (!TextUtils.isEmpty(this.f53574e)) {
            return true;
        }
        return false;
    }

    public final void b(String str) {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{str}, this, k, false, 56043, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, k, false, 56043, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.f53572c != null && !this.f53572c.isFinishing() && com.ss.android.ugc.aweme.video.b.b(str) && this.f53571b != null) {
            Video video = this.f53571b.getVideo();
            if (video != null) {
                i2 = video.getWidth();
                i = video.getHeight();
            } else {
                i = 0;
            }
            c.a().f53674b.setId(this.f53571b.getAid());
            c.a().f53674b.setVideoPath(str);
            c.a().f53674b.setWidth(i2);
            c.a().f53674b.setHeight(i);
            c.a().f53674b.setSource("video_share");
            h();
            c.a().b();
            c.a().a(this.f53572c);
        }
    }

    public final void onDownloadSuccess(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, k, false, 56036, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, k, false, 56036, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (str != null) {
            this.h = str;
            if (str.length() == 0) {
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new Exception("LiveWallPaperHelper download file size == 0: " + this.f53574e));
                f();
                e.b(1, "file size == 0");
                return;
            }
            if (PatchProxy.isSupport(new Object[]{str}, this, k, false, 56045, new Class[]{String.class}, Boolean.TYPE)) {
                ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, k, false, 56045, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
            } else {
                String trim = str.trim();
                String substring = trim.substring(trim.lastIndexOf("/") + 1);
                this.i = this.f53575f + substring;
                com.ss.android.ugc.aweme.video.b.c(str, this.i);
            }
            if (PatchProxy.isSupport(new Object[0], this, k, false, 56042, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, k, false, 56042, new Class[0], Void.TYPE);
            } else {
                a();
                a.b(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f53582a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f53582a, false, 56051, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f53582a, false, 56051, new Class[0], Void.TYPE);
                            return;
                        }
                        b.this.b();
                        b.this.b(b.this.i);
                    }
                });
            }
            e.b(0, "");
        }
    }

    public final void c(final Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, k, false, 56046, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, k, false, 56046, new Class[]{Aweme.class}, Void.TYPE);
        } else if (aweme == null || e.a(this.f53572c, aweme.getAid())) {
        } else {
            if (this.f53572c == null || this.f53572c.isFinishing() || NetworkUtils.isNetworkAvailable(this.f53572c)) {
                Video video = aweme.getVideo();
                if (video != null) {
                    UrlModel cover = video.getCover();
                    if (cover != null) {
                        a(d());
                        com.ss.android.ugc.aweme.base.c.a(cover, (c.a) new c.a() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f53586a;

                            public final void a(Exception exc) {
                                if (PatchProxy.isSupport(new Object[]{exc}, this, f53586a, false, 56054, new Class[]{Exception.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{exc}, this, f53586a, false, 56054, new Class[]{Exception.class}, Void.TYPE);
                                    return;
                                }
                                if (b.this.f53572c != null && !b.this.f53572c.isFinishing()) {
                                    com.bytedance.ies.dmt.ui.d.a.b((Context) b.this.f53572c, (int) C0906R.string.a7i).a();
                                    b.this.b();
                                    e.b(1, "request image fail " + exc.getMessage());
                                }
                            }

                            public final void a(DataSource<CloseableReference<CloseableImage>> dataSource) {
                                if (PatchProxy.isSupport(new Object[]{dataSource}, this, f53586a, false, 56053, new Class[]{DataSource.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{dataSource}, this, f53586a, false, 56053, new Class[]{DataSource.class}, Void.TYPE);
                                    return;
                                }
                                b bVar = b.this;
                                Aweme aweme = aweme;
                                if (PatchProxy.isSupport(new Object[]{aweme}, bVar, b.k, false, 56047, new Class[]{Aweme.class}, Void.TYPE)) {
                                    Object[] objArr = {aweme};
                                    b bVar2 = bVar;
                                    ChangeQuickRedirect changeQuickRedirect = b.k;
                                    PatchProxy.accessDispatch(objArr, bVar2, changeQuickRedirect, false, 56047, new Class[]{Aweme.class}, Void.TYPE);
                                } else if (aweme == null || aweme.getVideo() == null) {
                                    bVar.g();
                                    e.b(1, "aweme is empty");
                                } else {
                                    UrlModel cover = aweme.getVideo().getCover();
                                    if (cover == null) {
                                        bVar.g();
                                        e.b(1, "cover is empty");
                                        return;
                                    }
                                    i.a((Callable<TResult>) new Callable<Boolean>(cover, aweme) {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f53591a;

                                        /* renamed from: b  reason: collision with root package name */
                                        final /* synthetic */ UrlModel f53592b;

                                        /* renamed from: c  reason: collision with root package name */
                                        final /* synthetic */ Aweme f53593c;

                                        public final /* synthetic */ Object call() throws Exception {
                                            if (PatchProxy.isSupport(new Object[0], this, f53591a, false, 56056, new Class[0], Boolean.class)) {
                                                return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f53591a, false, 56056, new Class[0], Boolean.class);
                                            }
                                            List<String> urlList = this.f53592b.getUrlList();
                                            if (CollectionUtils.isEmpty(urlList)) {
                                                b.this.g();
                                                e.b(1, "urlList is empty");
                                            } else {
                                                for (String next : urlList) {
                                                    if (next != null) {
                                                        String a2 = com.ss.android.ugc.aweme.base.c.a(next);
                                                        if (com.ss.android.ugc.aweme.video.b.b(a2)) {
                                                            int lastIndexOf = a2.lastIndexOf("/") + 1;
                                                            if (lastIndexOf >= 0 && lastIndexOf < a2.length()) {
                                                                if (!TextUtils.isEmpty(a2.substring(lastIndexOf))) {
                                                                    String str = e.a() + r4;
                                                                    if (com.ss.android.ugc.aweme.video.b.b(str) || com.ss.android.ugc.aweme.video.b.c(a2, str)) {
                                                                        b bVar = b.this;
                                                                        Aweme aweme = this.f53593c;
                                                                        if (PatchProxy.isSupport(new Object[]{aweme, str}, bVar, b.k, false, 56049, new Class[]{Aweme.class, String.class}, Void.TYPE)) {
                                                                            PatchProxy.accessDispatch(new Object[]{aweme, str}, bVar, b.k, false, 56049, new Class[]{Aweme.class, String.class}, Void.TYPE);
                                                                        } else {
                                                                            a.b(new Runnable(str, aweme) {

                                                                                /* renamed from: a  reason: collision with root package name */
                                                                                public static ChangeQuickRedirect f53597a;

                                                                                /* renamed from: b  reason: collision with root package name */
                                                                                final /* synthetic */ String f53598b;

                                                                                /* renamed from: c  reason: collision with root package name */
                                                                                final /* synthetic */ Aweme f53599c;

                                                                                public final void run() {
                                                                                    if (PatchProxy.isSupport(new Object[0], this, f53597a, false, 56058, new Class[0], Void.TYPE)) {
                                                                                        PatchProxy.accessDispatch(new Object[0], this, f53597a, false, 56058, new Class[0], Void.TYPE);
                                                                                        return;
                                                                                    }
                                                                                    com.ss.android.ugc.aweme.livewallpaper.c.c.a().f53674b.setThumbnailPath(this.f53598b);
                                                                                    b.this.a(this.f53599c);
                                                                                }

                                                                                {
                                                                                    this.f53598b = r2;
                                                                                    this.f53599c = r3;
                                                                                }
                                                                            });
                                                                        }
                                                                        return Boolean.TRUE;
                                                                    }
                                                                } else {
                                                                    continue;
                                                                }
                                                            }
                                                        } else {
                                                            continue;
                                                        }
                                                    }
                                                }
                                            }
                                            return Boolean.FALSE;
                                        }

                                        {
                                            this.f53592b = r2;
                                            this.f53593c = r3;
                                        }
                                    }).a((g<TResult, TContinuationResult>) new g<Boolean, Object>() {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f53589a;

                                        public final Object then(i<Boolean> iVar) throws Exception {
                                            if (PatchProxy.isSupport(new Object[]{iVar}, this, f53589a, false, 56055, new Class[]{i.class}, Object.class)) {
                                                return PatchProxy.accessDispatch(new Object[]{iVar}, this, f53589a, false, 56055, new Class[]{i.class}, Object.class);
                                            }
                                            if (iVar == null || !((Boolean) iVar.e()).booleanValue()) {
                                                b.this.g();
                                                e.b(1, "copy video thumbnail fail");
                                            }
                                            return null;
                                        }
                                    });
                                }
                            }
                        });
                    } else {
                        return;
                    }
                }
                return;
            }
            com.bytedance.ies.dmt.ui.d.a.b((Context) this.f53572c, this.f53572c.getString(C0906R.string.c2j)).a();
        }
    }
}
