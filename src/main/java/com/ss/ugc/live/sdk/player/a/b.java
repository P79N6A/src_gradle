package com.ss.ugc.live.sdk.player.a;

import android.content.Context;
import android.net.Uri;
import android.util.SparseIntArray;
import android.view.Surface;
import com.ss.ttm.player.TTMediaPlayer;
import com.ss.ttm.player.TTPlayerConfiger;
import com.ss.ugc.live.sdk.player.ILivePlayer;
import com.ss.ugc.live.sdk.player.a;
import java.io.IOException;
import java.util.Map;

public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private static final SparseIntArray f78746a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f78747b;

    /* renamed from: c  reason: collision with root package name */
    private final TTMediaPlayer f78748c;

    /* renamed from: d  reason: collision with root package name */
    private final d f78749d;

    /* renamed from: e  reason: collision with root package name */
    private ILivePlayer.a f78750e;

    public final void f() {
        this.f78748c.release();
    }

    public final boolean g() {
        return this.f78748c.isPlaying();
    }

    public final void j() {
        this.f78748c.reset();
    }

    public final void l() {
        this.f78748c.start();
    }

    public final void m() {
        this.f78748c.pause();
    }

    public final void n() {
        this.f78748c.stop();
    }

    public final long h() {
        return this.f78748c.getLongOption(72, 0);
    }

    public final long i() {
        return this.f78748c.getLongOption(73, 0);
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        f78746a = sparseIntArray;
        sparseIntArray.put(0, 0);
        f78746a.put(1, 1);
        f78746a.put(2, 2);
        f78746a.put(3, 3);
    }

    public final void k() {
        this.f78748c.setIntOption(38, 0);
        this.f78748c.setIntOption(87, 1);
        TTPlayerConfiger.setValue(11, true);
        this.f78748c.prepareAsync();
    }

    public final void a(Surface surface) {
        this.f78748c.setSurface(surface);
        this.f78748c.setScreenOnWhilePlaying(true);
    }

    public final void b(ILivePlayer.a aVar) {
        if (this.f78749d != null) {
            this.f78749d.f78755a = aVar;
        } else {
            this.f78750e = aVar;
        }
    }

    public final void a(String str, Map<String, String> map) throws IOException {
        Uri uri;
        try {
            if (str.indexOf("://") <= 0) {
                uri = Uri.parse("file://" + str);
            } else {
                uri = Uri.parse(str);
            }
            this.f78748c.setDataSource(this.f78747b, uri, map);
        } catch (IOException unused) {
        }
    }

    b(c cVar, TTMediaPlayer tTMediaPlayer) {
        super(new a(cVar.f78753c, tTMediaPlayer));
        this.f78747b = cVar.f78751a;
        this.f78748c = tTMediaPlayer;
        this.f78749d = new d(tTMediaPlayer);
        if (this.f78750e != null) {
            this.f78749d.f78755a = this.f78750e;
            this.f78750e = null;
        }
        tTMediaPlayer.setOnPreparedListener(this.f78749d);
        tTMediaPlayer.setOnErrorListener(this.f78749d);
        tTMediaPlayer.setOnInfoListener(this.f78749d);
        tTMediaPlayer.setOnLogListener(this.f78749d);
        tTMediaPlayer.setOnCompletionListener(this.f78749d);
        tTMediaPlayer.setOnVideoSizeChangedListener(this.f78749d);
        tTMediaPlayer.setOnExternInfoListener(this.f78749d);
        tTMediaPlayer.setIntOption(52, 1);
        tTMediaPlayer.setIntOption(24, 5);
    }
}
