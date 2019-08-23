package com.ss.android.ugc.aweme.shortvideo.presenter;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.a.e;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicList;
import com.ss.android.ugc.aweme.shortvideo.model.MusicListModel;
import com.ss.android.ugc.b.a;
import com.ss.android.ugc.b.c;
import java.io.File;
import java.util.List;

public final class d extends b<MusicListModel, c> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68826a;

    public final void b() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f68826a, false, 78189, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68826a, false, 78189, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        if (((MusicListModel) this.f2978e).getData() == null) {
            a(new Exception());
            return;
        }
        List<Music> list = ((MusicList) ((MusicListModel) this.f2978e).getData()).musicList;
        if (CollectionUtils.isEmpty(list)) {
            a(new IllegalArgumentException("empty music list."));
            return;
        }
        Music music = list.get(0);
        if (music.getPlayUrl() == null || CollectionUtils.isEmpty(music.getPlayUrl().getUrlList())) {
            a(new IllegalArgumentException("music exists but no valid play url."));
            return;
        }
        String str2 = music.getPlayUrl().getUrlList().get(0);
        String b2 = c.a().b();
        if (!a.a(b2)) {
            new File(b2).mkdirs();
        }
        if (b2.endsWith("/")) {
            str = b2 + a.b(str2);
        } else {
            str = b2 + File.separator + a.b(str2);
        }
        if (com.ss.android.ugc.aweme.video.b.b(str)) {
            if (this.f2979f != null) {
                ((c) this.f2979f).a((MusicList) ((MusicListModel) this.f2978e).getData(), str);
            }
            return;
        }
        final e a2 = new e.a().a(str2).b(str).a();
        com.ss.android.b.a.a.a.a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f68827a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f68827a, false, 78191, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f68827a, false, 78191, new Class[0], Void.TYPE);
                    return;
                }
                com.ss.android.ugc.aweme.app.application.initialization.a.a(a2, (com.ss.android.ugc.a.b.d) new com.ss.android.ugc.a.b.d() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f68830a;

                    public final void onDownloadPause() {
                    }

                    public final void onDownloadProgress(int i, long j, long j2) {
                    }

                    public final void onDownloadStart(int i) {
                    }

                    public final void onCancel() {
                        if (PatchProxy.isSupport(new Object[0], this, f68830a, false, 78193, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f68830a, false, 78193, new Class[0], Void.TYPE);
                            return;
                        }
                        com.ss.android.b.a.a.a.b(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f68835a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f68835a, false, 78196, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f68835a, false, 78196, new Class[0], Void.TYPE);
                                    return;
                                }
                                if (d.this.f2979f != null) {
                                    ((c) d.this.f2979f).a(new Exception("cancelled"), "task is cancelled");
                                }
                            }
                        });
                    }

                    public final void onDownloadSuccess(String str) {
                        final String str2 = str;
                        if (PatchProxy.isSupport(new Object[]{str2}, this, f68830a, false, 78192, new Class[]{String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str2}, this, f68830a, false, 78192, new Class[]{String.class}, Void.TYPE);
                            return;
                        }
                        com.ss.android.b.a.a.a.b(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f68832a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f68832a, false, 78195, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f68832a, false, 78195, new Class[0], Void.TYPE);
                                    return;
                                }
                                if (d.this.f2979f != null) {
                                    ((c) d.this.f2979f).a((MusicList) ((MusicListModel) d.this.f2978e).getData(), str2);
                                }
                            }
                        });
                    }

                    public final void onError(com.ss.android.ugc.a.c cVar) {
                        final com.ss.android.ugc.a.c cVar2 = cVar;
                        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f68830a, false, 78194, new Class[]{com.ss.android.ugc.a.c.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f68830a, false, 78194, new Class[]{com.ss.android.ugc.a.c.class}, Void.TYPE);
                            return;
                        }
                        com.ss.android.b.a.a.a.b(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f68837a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f68837a, false, 78197, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f68837a, false, 78197, new Class[0], Void.TYPE);
                                    return;
                                }
                                if (d.this.f2979f != null) {
                                    ((c) d.this.f2979f).a(new Exception(cVar2.f31520b), cVar2.f31520b);
                                }
                            }
                        });
                    }
                });
            }
        });
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f68826a, false, 78190, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f68826a, false, 78190, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        super.a(exc);
        if (this.f2979f != null) {
            ((c) this.f2979f).a(exc, "");
        }
    }
}
