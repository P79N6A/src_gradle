package com.ss.android.ugc.aweme.player.sdk.b;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.player.sdk.api.IPlayer;
import com.ss.android.ugc.aweme.player.sdk.api.d;
import com.ss.ugc.live.sdk.player.ILivePlayer;
import com.ss.ugc.live.sdk.player.b;
import java.io.IOException;
import java.util.Map;
import org.json.JSONObject;

public final class c implements IPlayer, ILivePlayer.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59136a;

    /* renamed from: b  reason: collision with root package name */
    private ILivePlayer f59137b;

    /* renamed from: c  reason: collision with root package name */
    private IPlayer.c f59138c;

    /* renamed from: com.ss.android.ugc.aweme.player.sdk.b.c$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f59142a = new int[ILivePlayer.b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|(3:15|16|18)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.ss.ugc.live.sdk.player.ILivePlayer$b[] r0 = com.ss.ugc.live.sdk.player.ILivePlayer.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f59142a = r0
                int[] r0 = f59142a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.ss.ugc.live.sdk.player.ILivePlayer$b r1 = com.ss.ugc.live.sdk.player.ILivePlayer.b.RENDERING_START     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f59142a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.ss.ugc.live.sdk.player.ILivePlayer$b r1 = com.ss.ugc.live.sdk.player.ILivePlayer.b.MEDIA_ERROR     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f59142a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.ss.ugc.live.sdk.player.ILivePlayer$b r1 = com.ss.ugc.live.sdk.player.ILivePlayer.b.PLAY_COMPLETED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f59142a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.ss.ugc.live.sdk.player.ILivePlayer$b r1 = com.ss.ugc.live.sdk.player.ILivePlayer.b.PREPARED     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f59142a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.ss.ugc.live.sdk.player.ILivePlayer$b r1 = com.ss.ugc.live.sdk.player.ILivePlayer.b.VIDEO_SIZE_CHANGED     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f59142a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.ss.ugc.live.sdk.player.ILivePlayer$b r1 = com.ss.ugc.live.sdk.player.ILivePlayer.b.SEI_UPDATE     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f59142a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.ss.ugc.live.sdk.player.ILivePlayer$b r1 = com.ss.ugc.live.sdk.player.ILivePlayer.b.BUFFERING_START     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f59142a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.ss.ugc.live.sdk.player.ILivePlayer$b r1 = com.ss.ugc.live.sdk.player.ILivePlayer.b.BUFFERING_END     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.player.sdk.b.c.AnonymousClass2.<clinit>():void");
        }
    }

    class a implements ILivePlayer {
        public final void a() {
        }

        public final void a(Surface surface) {
        }

        public final void a(ILivePlayer.a aVar) {
        }

        public final void a(String str, Map<String, String> map, ILivePlayer.c cVar) throws IOException {
        }

        public final void b() {
        }

        public final void c() {
        }

        public final void d() {
        }

        public final void e() {
        }

        public final void f() {
        }

        public final boolean g() {
            return false;
        }

        public final long h() {
            return 0;
        }

        public final long i() {
            return 0;
        }

        a() {
        }
    }

    public final void a(float f2) {
    }

    public final void a(float f2, float f3) {
    }

    public final void a(long j) {
    }

    public final void a(IPlayer.b bVar) {
    }

    public final void a(d dVar) {
    }

    public final void a(com.ss.android.ugc.playerkit.a.a aVar) {
    }

    public final void a(String str, com.ss.android.ugc.aweme.player.sdk.api.a aVar) {
    }

    public final void a(boolean z) {
    }

    public final void b(Surface surface) {
    }

    public final boolean b(boolean z) {
        return false;
    }

    public final boolean f() {
        return false;
    }

    public final boolean g() {
        return false;
    }

    public final boolean h() {
        return false;
    }

    public final void i() {
    }

    public final boolean j() {
        return false;
    }

    public final long l() {
        return 0;
    }

    public final long m() {
        return 0;
    }

    public final String n() {
        return null;
    }

    public final String o() {
        return "";
    }

    public final IPlayer.e p() {
        return null;
    }

    public final IPlayer.d q() {
        return null;
    }

    public final void a(ILivePlayer.b bVar, int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{bVar, Integer.valueOf(i), str2}, this, f59136a, false, 64253, new Class[]{ILivePlayer.b.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar, Integer.valueOf(i), str2}, this, f59136a, false, 64253, new Class[]{ILivePlayer.b.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        switch (AnonymousClass2.f59142a[bVar.ordinal()]) {
            case 1:
                this.f59138c.b();
                return;
            case 2:
                int i2 = i;
                this.f59138c.a(0, i, str2);
                return;
            case 3:
                this.f59138c.c();
                return;
            case 4:
                this.f59138c.a();
                return;
            case 5:
                return;
            case 6:
                return;
            case e.l:
                this.f59138c.a(true);
                return;
            case 8:
                this.f59138c.a(false);
                break;
        }
    }

    public final void a(String str, Map<String, Object> map) throws IOException {
        if (PatchProxy.isSupport(new Object[]{str, map}, this, f59136a, false, 64254, new Class[]{String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, map}, this, f59136a, false, 64254, new Class[]{String.class, Map.class}, Void.TYPE);
            return;
        }
        this.f59137b.a(str, null, ((Boolean) map.get("stream_type")).booleanValue() ? ILivePlayer.c.AUDIO : ILivePlayer.c.VIDEO);
        this.f59137b.b();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f59136a, false, 64255, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59136a, false, 64255, new Class[0], Void.TYPE);
            return;
        }
        this.f59137b.c();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f59136a, false, 64256, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59136a, false, 64256, new Class[0], Void.TYPE);
            return;
        }
        this.f59137b.d();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f59136a, false, 64257, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59136a, false, 64257, new Class[0], Void.TYPE);
            return;
        }
        this.f59137b.e();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f59136a, false, 64258, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59136a, false, 64258, new Class[0], Void.TYPE);
            return;
        }
        this.f59137b.f();
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f59136a, false, 64259, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59136a, false, 64259, new Class[0], Void.TYPE);
            return;
        }
        this.f59137b.a();
    }

    public final boolean k() {
        if (!PatchProxy.isSupport(new Object[0], this, f59136a, false, 64266, new Class[0], Boolean.TYPE)) {
            return this.f59137b.g();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f59136a, false, 64266, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final float a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f59136a, false, 64264, new Class[]{Integer.TYPE}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f59136a, false, 64264, new Class[]{Integer.TYPE}, Float.TYPE)).floatValue();
        }
        float f2 = -1.0f;
        if (this.f59137b == null) {
            return -1.0f;
        }
        switch (i) {
            case 6:
                f2 = (float) this.f59137b.h();
                break;
            case e.l:
                f2 = (float) this.f59137b.i();
                break;
        }
        return f2;
    }

    public final void a(Surface surface) {
        Surface surface2 = surface;
        if (PatchProxy.isSupport(new Object[]{surface2}, this, f59136a, false, 64260, new Class[]{Surface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surface2}, this, f59136a, false, 64260, new Class[]{Surface.class}, Void.TYPE);
            return;
        }
        this.f59137b.a(surface2);
    }

    public final void a(IPlayer.c cVar) {
        this.f59138c = cVar;
    }

    public c(Context context, SparseIntArray sparseIntArray, final com.ss.android.ugc.playerkit.a.c cVar) {
        try {
            com.ss.ugc.live.sdk.player.a.c cVar2 = new com.ss.ugc.live.sdk.player.a.c(context);
            cVar2.f78752b = false;
            cVar2.f78753c = new b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f59139a;

                public final void a(JSONObject jSONObject) {
                    if (PatchProxy.isSupport(new Object[]{jSONObject}, this, f59139a, false, 64267, new Class[]{JSONObject.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{jSONObject}, this, f59139a, false, 64267, new Class[]{JSONObject.class}, Void.TYPE);
                    }
                }
            };
            if (sparseIntArray != null) {
                for (int i = 0; i < sparseIntArray.size(); i++) {
                    cVar2.f78754d.append(sparseIntArray.keyAt(i), sparseIntArray.valueAt(i));
                }
            }
            this.f59137b = cVar2.a();
        } catch (Exception unused) {
            this.f59137b = new a();
        }
        this.f59137b.a((ILivePlayer.a) this);
    }
}
