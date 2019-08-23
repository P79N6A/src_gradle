package com.ss.android.ugc.aweme.live.alphaplayer.b;

import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.text.TextUtils;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.live.alphaplayer.a.a;
import java.io.IOException;

public final class b extends a<b> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53229a;

    /* renamed from: b  reason: collision with root package name */
    private MediaPlayer f53230b = new MediaPlayer();

    /* renamed from: c  reason: collision with root package name */
    private MediaMetadataRetriever f53231c = new MediaMetadataRetriever();

    /* renamed from: d  reason: collision with root package name */
    private String f53232d;

    /* renamed from: e  reason: collision with root package name */
    private MediaPlayer.OnCompletionListener f53233e = new MediaPlayer.OnCompletionListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53234a;

        public final void onCompletion(MediaPlayer mediaPlayer) {
            if (PatchProxy.isSupport(new Object[]{mediaPlayer}, this, f53234a, false, 55603, new Class[]{MediaPlayer.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{mediaPlayer}, this, f53234a, false, 55603, new Class[]{MediaPlayer.class}, Void.TYPE);
                return;
            }
            if (b.this.h != null) {
                b.this.h.a(b.this.f53228f);
            }
        }
    };
    private MediaPlayer.OnPreparedListener k = new MediaPlayer.OnPreparedListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53236a;

        public final void onPrepared(MediaPlayer mediaPlayer) {
            if (PatchProxy.isSupport(new Object[]{mediaPlayer}, this, f53236a, false, 55604, new Class[]{MediaPlayer.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{mediaPlayer}, this, f53236a, false, 55604, new Class[]{MediaPlayer.class}, Void.TYPE);
                return;
            }
            if (b.this.i != null) {
                b.this.i.a(b.this.f53228f);
            }
        }
    };
    private MediaPlayer.OnErrorListener l = new MediaPlayer.OnErrorListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53238a;

        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, f53238a, false, 55605, new Class[]{MediaPlayer.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, f53238a, false, 55605, new Class[]{MediaPlayer.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
            }
            if (b.this.j != null) {
                int i3 = i;
                int i4 = i2;
                b.this.j.a(b.this.f53228f, i, i2, "");
            }
            return false;
        }
    };

    public b() {
        this.f53230b.setOnCompletionListener(this.f53233e);
        this.f53230b.setOnPreparedListener(this.k);
        this.f53230b.setOnErrorListener(this.l);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f53229a, false, 55594, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53229a, false, 55594, new Class[0], Void.TYPE);
            return;
        }
        this.f53230b.prepareAsync();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f53229a, false, 55595, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53229a, false, 55595, new Class[0], Void.TYPE);
            return;
        }
        this.f53230b.start();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f53229a, false, 55596, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53229a, false, 55596, new Class[0], Void.TYPE);
            return;
        }
        this.f53230b.pause();
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f53229a, false, 55597, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53229a, false, 55597, new Class[0], Void.TYPE);
            return;
        }
        this.f53230b.stop();
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f53229a, false, 55598, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53229a, false, 55598, new Class[0], Void.TYPE);
            return;
        }
        this.f53230b.reset();
        this.f53232d = null;
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f53229a, false, 55599, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53229a, false, 55599, new Class[0], Void.TYPE);
            return;
        }
        this.f53230b.release();
        this.f53232d = null;
    }

    public final a h() throws Exception {
        if (PatchProxy.isSupport(new Object[0], this, f53229a, false, 55602, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], this, f53229a, false, 55602, new Class[0], a.class);
        } else if (!TextUtils.isEmpty(this.f53232d)) {
            this.f53231c.setDataSource(this.f53232d);
            String extractMetadata = this.f53231c.extractMetadata(18);
            String extractMetadata2 = this.f53231c.extractMetadata(19);
            if (!TextUtils.isEmpty(extractMetadata) && !TextUtils.isEmpty(extractMetadata2)) {
                return new a(Integer.parseInt(this.f53231c.extractMetadata(18)), Integer.parseInt(this.f53231c.extractMetadata(19)));
            }
            throw new Exception("retriever get metadata failure");
        } else {
            throw new Exception("dataSource is null, please set setDataSource firstly");
        }
    }

    public final void a(Surface surface) {
        Surface surface2 = surface;
        if (PatchProxy.isSupport(new Object[]{surface2}, this, f53229a, false, 55592, new Class[]{Surface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surface2}, this, f53229a, false, 55592, new Class[]{Surface.class}, Void.TYPE);
            return;
        }
        this.f53230b.setSurface(surface2);
    }

    public final void a(String str) throws IOException {
        if (PatchProxy.isSupport(new Object[]{str}, this, f53229a, false, 55593, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f53229a, false, 55593, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f53232d = str;
        this.f53230b.setDataSource(str);
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f53229a, false, 55601, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f53229a, false, 55601, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f53230b.setScreenOnWhilePlaying(z);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f53229a, false, 55600, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f53229a, false, 55600, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f53230b.setLooping(false);
    }
}
