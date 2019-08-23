package com.ss.android.ugc.b.d;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.a.e;
import com.ss.android.ugc.b.a.c;
import com.ss.android.ugc.b.a.d;
import com.ss.android.ugc.b.a.e;
import java.io.File;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class a implements MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener {

    /* renamed from: a  reason: collision with root package name */
    public d f77152a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.b.a.a f77153b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.a.b.d f77154c;

    /* renamed from: d  reason: collision with root package name */
    public e f77155d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.b.a.b f77156e;

    /* renamed from: f  reason: collision with root package name */
    public c f77157f;
    public Context g;
    public String h;
    public int i = 0;
    public int j = 0;
    private MediaPlayer k;
    private com.ss.android.ugc.b.c.a l;
    private String m = a.class.getName();
    private ScheduledThreadPoolExecutor n;
    private boolean o;

    /* renamed from: com.ss.android.ugc.b.d.a$a  reason: collision with other inner class name */
    class C0805a extends AbsDownloadListener {

        /* renamed from: b  reason: collision with root package name */
        private com.ss.android.ugc.b.b.a f77162b;

        public final void onCanceled(DownloadInfo downloadInfo) {
            if (a.this.f77154c != null) {
                a.this.f77154c.onCancel();
            }
        }

        public final void onPause(DownloadInfo downloadInfo) {
            if (a.this.f77154c != null) {
                a.this.f77154c.onDownloadPause();
            }
        }

        public final void onStart(DownloadInfo downloadInfo) {
            if (a.this.f77154c != null) {
                a.this.f77154c.onDownloadStart(downloadInfo.getId());
            }
        }

        public final void onProgress(DownloadInfo downloadInfo) {
            if (downloadInfo.getTotalBytes() > 0) {
                int curBytes = (int) ((downloadInfo.getCurBytes() * 100) / downloadInfo.getTotalBytes());
                if (a.this.f77154c != null) {
                    a.this.f77154c.onDownloadProgress(curBytes, downloadInfo.getCurBytes(), downloadInfo.getTotalBytes());
                }
                a.this.j = curBytes;
                if (!(a.this.f77153b == null || this.f77162b == null)) {
                    a.this.f77153b.a(this.f77162b.f77131a, curBytes, 4);
                }
            }
        }

        public final void onSuccessed(DownloadInfo downloadInfo) {
            String str;
            if (downloadInfo.getSavePath().endsWith("/")) {
                str = downloadInfo.getSavePath() + downloadInfo.getName();
            } else {
                str = downloadInfo.getSavePath() + File.separator + downloadInfo.getName();
            }
            if (a.this.f77154c != null) {
                a.this.f77154c.onDownloadSuccess(str);
            }
            if (a.this.f77153b != null) {
                a.this.f77153b.b(str, 4);
            }
        }

        public C0805a(com.ss.android.ugc.b.b.a aVar) {
            this.f77162b = aVar;
        }

        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            if (a.this.f77154c != null) {
                a.this.f77154c.onError(com.ss.android.ugc.a.c.a().a(baseException.getErrorCode()).a(baseException.getMessage()));
            }
            if (a.this.f77153b != null && this.f77162b != null) {
                a.this.f77153b.a(this.f77162b.f77131a, 4, (Exception) baseException);
            }
        }
    }

    class b implements com.ss.android.ugc.a.b.d {

        /* renamed from: b  reason: collision with root package name */
        private com.ss.android.ugc.b.b.a f77164b;

        /* renamed from: c  reason: collision with root package name */
        private String f77165c;

        public final void onCancel() {
            if (a.this.f77154c != null) {
                a.this.f77154c.onCancel();
            }
        }

        public final void onDownloadPause() {
            if (a.this.f77154c != null) {
                a.this.f77154c.onDownloadPause();
            }
        }

        public final void onDownloadStart(int i) {
            if (a.this.f77154c != null) {
                a.this.f77154c.onDownloadStart(i);
            }
        }

        public final void onDownloadSuccess(String str) {
            if (a.this.f77154c != null) {
                a.this.f77154c.onDownloadSuccess(str);
            }
            if (a.this.f77153b != null) {
                File file = new File(str);
                if (!file.exists() || file.length() == 0) {
                    onError(com.ss.android.ugc.a.c.a().a("file is not exist"));
                } else {
                    a.this.f77153b.b(str, 4);
                }
            }
        }

        public final void onError(com.ss.android.ugc.a.c cVar) {
            if (cVar.f31519a == 8) {
                if (a.this.f77154c != null) {
                    a.this.f77154c.onError(cVar);
                }
                if (!(a.this.f77153b == null || this.f77164b == null)) {
                    a.this.f77153b.a(this.f77164b.f77131a, 4, new Exception(cVar.f31520b + "       *** 重试次数 *** : " + a.this.i));
                }
            } else if (a.this.i < 3) {
                if (com.ss.android.ugc.b.a.a(this.f77165c)) {
                    new File(this.f77165c).delete();
                }
                com.ss.android.ugc.a.d.a().a(new e.a().a(this.f77164b.f77131a).b(this.f77165c).a(), (com.ss.android.ugc.a.b.d) new b(this.f77164b, this.f77165c));
                a.this.i++;
            } else {
                if (!(a.this.f77153b == null || this.f77164b == null)) {
                    a.this.f77153b.a(this.f77164b.f77131a, 4, new Exception(cVar.f31520b + "       *** 重试次数 *** : " + a.this.i));
                }
                if (a.this.f77154c != null) {
                    a.this.f77154c.onError(cVar);
                }
            }
        }

        public b(com.ss.android.ugc.b.b.a aVar, String str) {
            this.f77164b = aVar;
            this.f77165c = str;
        }

        public final void onDownloadProgress(int i, long j, long j2) {
            if (a.this.f77154c != null) {
                a.this.f77154c.onDownloadProgress(i, j, j2);
            }
            a.this.j = i;
            if (a.this.f77153b != null && this.f77164b != null) {
                a.this.f77153b.a(this.f77164b.f77131a, i, 4);
            }
        }
    }

    public final void a() {
        c();
    }

    public final void b() {
        try {
            this.o = true;
            if (this.k != null && this.k.isPlaying()) {
                this.k.pause();
            }
        } catch (IllegalStateException unused) {
        }
    }

    public final void c() {
        try {
            if (this.k != null) {
                b();
                this.k.release();
                this.k = null;
            }
        } catch (IllegalStateException unused) {
        }
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        if (this.f77156e != null) {
            this.f77156e.a();
        }
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        try {
            if (!this.o && this.k != null) {
                this.k.start();
                if (this.f77152a != null) {
                    this.f77152a.a(4, this.k.getDuration());
                }
            }
        } catch (IllegalStateException unused) {
        }
    }

    public final void a(final com.ss.android.ugc.b.b.a aVar) {
        String str;
        if (aVar != null && !TextUtils.isEmpty(this.h)) {
            this.i = 0;
            if (this.h.endsWith("/")) {
                str = this.h + com.ss.android.ugc.b.a.b(aVar.f77131a);
            } else {
                str = this.h + File.separator + com.ss.android.ugc.b.a.b(aVar.f77131a);
            }
            File file = new File(str);
            if (!file.exists() || file.length() == 0) {
                com.ss.android.ugc.b.a.a(str, true);
            } else if (this.f77153b != null) {
                this.f77153b.b(str, 4);
                return;
            }
            com.ss.android.ugc.a.d.a().a(new e.a().a(aVar.f77131a).b(str).a(aVar.f77134d).a(), (com.ss.android.ugc.a.b.d) new b(aVar, str));
            this.j = 0;
            if (com.ss.android.ugc.b.c.a().f77146e) {
                try {
                    if (this.n != null) {
                        this.n.shutdown();
                        this.n = null;
                        this.n = new ScheduledThreadPoolExecutor(1);
                    } else {
                        this.n = new ScheduledThreadPoolExecutor(1);
                    }
                    this.n.schedule(new Runnable() {
                        public final void run() {
                            if (a.this.j == 0 && a.this.f77153b != null) {
                                a.this.f77153b.a(aVar.f77131a, 4, new Exception("cancel by user because timeout"));
                            }
                        }
                    }, (long) com.ss.android.ugc.b.c.f77141f, TimeUnit.MILLISECONDS);
                } catch (Exception unused) {
                }
            }
        }
    }

    public final void b(com.ss.android.ugc.b.b.a aVar) {
        String str;
        if (aVar != null) {
            if (this.h.endsWith("/")) {
                str = this.h + com.ss.android.ugc.b.a.b(aVar.f77131a);
            } else {
                str = this.h + File.separator + com.ss.android.ugc.b.a.b(aVar.f77131a);
            }
            File file = new File(str);
            if (!file.exists() || file.length() <= 0 || this.f77153b == null) {
                Downloader.with(this.g).url(aVar.f77131a).savePath(this.h).name(com.ss.android.ugc.b.a.b(aVar.f77131a)).retryCount(3).showNotification(false).mainThreadListener(new C0805a(aVar)).download();
            } else {
                this.f77153b.b(str, 4);
            }
        }
    }

    public final void a(String str, boolean z) {
        if (this.l == null) {
            this.l = new com.ss.android.ugc.b.c.a(this.f77155d);
        }
        this.l.a(str, z);
    }

    public final void a(com.ss.android.ugc.b.b.a aVar, boolean z) {
        if (aVar != null) {
            this.o = false;
            if (this.k == null) {
                this.k = new MediaPlayer();
                this.k.setOnErrorListener(new MediaPlayer.OnErrorListener() {
                    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                        if (a.this.f77157f != null) {
                            a.this.f77157f.a(i, i2);
                        }
                        a.this.c();
                        return false;
                    }
                });
            }
            Uri parse = Uri.parse(aVar.f77131a);
            try {
                this.k.reset();
                this.k.setAudioStreamType(3);
                if (aVar.f77134d != null) {
                    this.k.setDataSource(this.g, parse, aVar.f77134d);
                } else {
                    this.k.setDataSource(this.g, parse);
                }
                this.k.setLooping(z);
                this.k.prepareAsync();
                this.k.setOnPreparedListener(this);
                this.k.setOnCompletionListener(this);
            } catch (Exception unused) {
                c();
                if (this.f77157f != null) {
                    this.f77157f.a(0, 0);
                }
            }
        }
    }
}
