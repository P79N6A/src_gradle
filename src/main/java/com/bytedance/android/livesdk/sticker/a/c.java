package com.bytedance.android.livesdk.sticker.a;

import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.List;
import java.util.Map;

public interface c {

    public interface a {
        void a(String str, com.bytedance.android.livesdk.sticker.b.a aVar, String str2, float f2);
    }

    public interface b {
        void a(boolean z, String str, com.bytedance.android.livesdk.sticker.b.a aVar);
    }

    List<com.bytedance.android.livesdk.sticker.b.a> a(String str);

    Map<String, Map<String, com.bytedance.android.livesdk.sticker.b.a>> a();

    void a(a aVar);

    void a(b bVar);

    void a(d dVar);

    void a(EffectChannelResponse effectChannelResponse);

    void a(String str, float f2);

    void a(String str, com.bytedance.android.livesdk.sticker.b.a aVar);

    void b();

    void b(a aVar);

    void b(b bVar);

    void b(String str);

    void b(String str, com.bytedance.android.livesdk.sticker.b.a aVar);

    Float c(String str);
}
