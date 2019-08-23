package com.bytedance.android.livesdk.player;

import android.graphics.Point;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.IOException;
import java.util.Map;
import org.json.JSONObject;

public interface ITTLivePlayer {

    public @interface Headers {
    }

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
        SEI_UPDATE;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public enum c {
        VIDEO,
        AUDIO,
        OBS,
        SCREENSHOT;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    void a();

    void a(Surface surface);

    void a(SurfaceHolder surfaceHolder);

    void a(a aVar);

    void a(String str, Map<String, String> map, c cVar) throws IOException;

    void a(boolean z);

    void b();

    void c();

    void d();

    void e();

    boolean f();

    boolean g();

    Point h();

    JSONObject i();
}
