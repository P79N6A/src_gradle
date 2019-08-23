package com.ss.ugc.live.sdk.player;

import android.view.Surface;
import java.io.IOException;
import java.util.Map;

public interface ILivePlayer {

    public @interface ImageLayout {
    }

    public interface a {
        void a(b bVar, int i, String str);
    }

    public enum b {
        PREPARED,
        PREPARE_FAILED,
        VIDEO_SIZE_CHANGED,
        PLAY_COMPLETED,
        MEDIA_ERROR,
        RENDERING_START,
        BUFFERING_START,
        BUFFERING_END,
        SEI_UPDATE
    }

    public enum c {
        VIDEO,
        AUDIO,
        OBS,
        SCREENSHOT
    }

    void a();

    void a(Surface surface);

    void a(a aVar);

    void a(String str, Map<String, String> map, c cVar) throws IOException;

    void b();

    void c();

    void d();

    void e();

    void f();

    boolean g();

    long h();

    long i();
}
