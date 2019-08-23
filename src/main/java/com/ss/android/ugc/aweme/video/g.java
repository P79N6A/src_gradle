package com.ss.android.ugc.aweme.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.player.sdk.api.IPlayer;
import com.ss.android.ugc.aweme.player.sdk.api.b;
import com.ss.android.ugc.aweme.video.e.d;
import com.ss.android.ugc.playerkit.c.c;
import org.json.JSONObject;

public final class g implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76084a;

    public final IPlayer a(c.a aVar) {
        c.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f76084a, false, 88927, new Class[]{c.a.class}, IPlayer.class)) {
            return (IPlayer) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f76084a, false, 88927, new Class[]{c.a.class}, IPlayer.class);
        }
        if (!PatchProxy.isSupport(new Object[]{aVar2}, null, d.f76057a, true, 89331, new Class[]{c.a.class}, IPlayer.class)) {
            return d.a(aVar2, false);
        }
        return (IPlayer) PatchProxy.accessDispatch(new Object[]{aVar2}, null, d.f76057a, true, 89331, new Class[]{c.a.class}, IPlayer.class);
    }

    private JSONObject a(long j, boolean z, boolean z2) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f76084a, false, 88928, new Class[]{Long.TYPE, Boolean.TYPE, Boolean.TYPE}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{new Long(j2), Byte.valueOf(z), Byte.valueOf(z2)}, this, f76084a, false, 88928, new Class[]{Long.TYPE, Boolean.TYPE, Boolean.TYPE}, JSONObject.class);
        }
        com.ss.android.ugc.aweme.app.d.c a2 = com.ss.android.ugc.aweme.app.d.c.a();
        com.ss.android.ugc.aweme.app.d.c a3 = a2.a("duration", j2);
        a3.a("is_cache", Boolean.valueOf(z));
        a3.a("h265", Boolean.valueOf(z2));
        a3.a("video_duration", Long.valueOf(o.b().d()));
        com.ss.android.ugc.aweme.video.e.c.a(a3);
        return a3.b();
    }

    public final void b(String str, long j, c.a aVar, boolean z, boolean z2) {
        String str2;
        String str3 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str3, new Long(j2), aVar, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f76084a, false, 88926, new Class[]{String.class, Long.TYPE, c.a.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {str3, new Long(j2), aVar, Byte.valueOf(z), Byte.valueOf(z2)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f76084a, false, 88926, new Class[]{String.class, Long.TYPE, c.a.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (j2 > 0) {
            switch (aVar) {
                case EXO:
                    str2 = "aweme_movie_play_exo";
                    break;
                case TT:
                    str2 = "aweme_movie_play_tt";
                    break;
                case IjkHardware:
                    str2 = "aweme_movie_ijk_hardware";
                    break;
                case TT_IJK_ENGINE:
                    str2 = "aweme_movie_tt_ijk_engine";
                    break;
                case TT_HARDWARE:
                    str2 = "aweme_movie_tt_hardware";
                    break;
                default:
                    str2 = "aweme_movie_play";
                    break;
            }
            n.a(str2, str3, (float) j2);
            r.onEvent(MobClick.obtain().setEventName(str2).setLabelName("perf_monitor").setExtValueLong(j2));
            n.a(str3, a(j2, z, z2));
        }
    }

    public final void a(String str, long j, c.a aVar, boolean z, boolean z2) {
        String str2;
        String str3 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str3, new Long(j2), aVar, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f76084a, false, 88925, new Class[]{String.class, Long.TYPE, c.a.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {str3, new Long(j2), aVar, Byte.valueOf(z), Byte.valueOf(z2)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f76084a, false, 88925, new Class[]{String.class, Long.TYPE, c.a.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (j2 > 0) {
            switch (aVar) {
                case EXO:
                    str2 = "aweme_movie_play_exo";
                    break;
                case TT:
                    str2 = "aweme_movie_play_tt";
                    break;
                case IjkHardware:
                    str2 = "aweme_movie_ijk_hardware";
                    break;
                case TT_IJK_ENGINE:
                    str2 = "aweme_movie_tt_ijk_engine";
                    break;
                default:
                    str2 = "aweme_movie_play";
                    break;
            }
            n.a(str2, str3, (float) j2);
            n.a(str3, a(j2, z, z2));
        }
    }
}
