package com.bytedance.android.livesdk.player;

import com.bytedance.android.livesdk.player.ITTLivePlayer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.c.a.a;
import org.json.JSONObject;

public final class l implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16836a;

    /* renamed from: b  reason: collision with root package name */
    public ITTLivePlayer.a f16837b;

    /* renamed from: c  reason: collision with root package name */
    private com.bytedance.android.livesdk.player.a.a f16838c;

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f16836a, false, 12755, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f16836a, false, 12755, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(ITTLivePlayer.b.RENDERING_START, 0, "player start render");
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f16836a, false, 12756, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16836a, false, 12756, new Class[0], Void.TYPE);
            return;
        }
        a(ITTLivePlayer.b.BUFFERING_START, 0, "player start buffer");
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f16836a, false, 12757, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16836a, false, 12757, new Class[0], Void.TYPE);
            return;
        }
        a(ITTLivePlayer.b.BUFFERING_END, 0, "player end buffer");
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f16836a, false, 12758, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16836a, false, 12758, new Class[0], Void.TYPE);
            return;
        }
        a(ITTLivePlayer.b.PLAY_COMPLETED, 0, "play complete");
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f16836a, false, 12759, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16836a, false, 12759, new Class[0], Void.TYPE);
            return;
        }
        a(ITTLivePlayer.b.PREPARED, 0, "player is prepared");
    }

    public l(com.bytedance.android.livesdk.player.a.a aVar) {
        this.f16838c = aVar;
    }

    public final void a(com.ss.c.a.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f16836a, false, 12754, new Class[]{com.ss.c.a.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f16836a, false, 12754, new Class[]{com.ss.c.a.a.a.class}, Void.TYPE);
            return;
        }
        if (aVar != null) {
            if (aVar.code != 0) {
                ITTLivePlayer.b bVar = ITTLivePlayer.b.PREPARE_FAILED;
                int i = aVar.code;
                a(bVar, i, "prepare failed.code:" + aVar.code);
            }
            a(ITTLivePlayer.b.MEDIA_ERROR, aVar.code, aVar.getInfoJSON());
        }
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f16836a, false, 12761, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f16836a, false, 12761, new Class[]{String.class}, Void.TYPE);
            return;
        }
        a(ITTLivePlayer.b.SEI_UPDATE, 0, str2);
    }

    public final void a(JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{jSONObject}, this, f16836a, false, 12762, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject}, this, f16836a, false, 12762, new Class[]{JSONObject.class}, Void.TYPE);
            return;
        }
        if (this.f16838c != null) {
            this.f16838c.a(jSONObject);
        }
    }

    public final void a(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f16836a, false, 12760, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f16836a, false, 12760, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(ITTLivePlayer.b.VIDEO_SIZE_CHANGED, (i4 << 16) | i3, "videoSizeChanged, width: " + i3 + ", height: " + i4);
    }

    private void a(ITTLivePlayer.b bVar, int i, String str) {
        ITTLivePlayer.b bVar2 = bVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{bVar2, Integer.valueOf(i), str2}, this, f16836a, false, 12763, new Class[]{ITTLivePlayer.b.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2, Integer.valueOf(i), str2}, this, f16836a, false, 12763, new Class[]{ITTLivePlayer.b.class, Integer.TYPE, String.class}, Void.TYPE);
        } else if (this.f16837b != null) {
            this.f16837b.a(bVar, i, str2);
        }
    }
}
