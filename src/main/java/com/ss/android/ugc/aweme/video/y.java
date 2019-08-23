package com.ss.android.ugc.aweme.video;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.player.sdk.api.IPlayer;
import org.json.JSONException;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76281a;

    static String a(IPlayer.e eVar, String str) {
        IPlayer.e eVar2 = eVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{eVar2, str2}, null, f76281a, true, 89063, new Class[]{IPlayer.e.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{eVar2, str2}, null, f76281a, true, 89063, new Class[]{IPlayer.e.class, String.class}, String.class);
        } else if (eVar2 == null) {
            return null;
        } else {
            if (eVar2.f59118b != null) {
                IjkMediaMeta parse = IjkMediaMeta.parse(eVar2.f59118b);
                if (parse == null) {
                    return null;
                }
                return parse.getString(str2);
            } else if (TextUtils.isEmpty(eVar2.f59117a)) {
                return null;
            } else {
                try {
                    return new JSONObject(eVar2.f59117a).getString(str2);
                } catch (JSONException unused) {
                    return null;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.ss.android.ugc.aweme.player.sdk.api.IPlayer$e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(com.ss.android.ugc.playerkit.videoview.g r19, java.lang.String r20) {
        /*
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r19
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f76281a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.playerkit.videoview.g> r4 = com.ss.android.ugc.playerkit.videoview.g.class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r4 = 0
            r6 = 1
            r7 = 89058(0x15be2, float:1.24797E-40)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0046
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r19
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f76281a
            r15 = 1
            r16 = 89058(0x15be2, float:1.24797E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.playerkit.videoview.g> r1 = com.ss.android.ugc.playerkit.videoview.g.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0046:
            java.lang.Object[] r2 = new java.lang.Object[r11]
            r2[r10] = r19
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = f76281a
            r5 = 1
            r6 = 89067(0x15beb, float:1.2481E-40)
            java.lang.Class[] r7 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.playerkit.videoview.g> r8 = com.ss.android.ugc.playerkit.videoview.g.class
            r7[r10] = r8
            java.lang.Class<com.ss.android.ugc.aweme.player.sdk.api.IPlayer$e> r8 = com.ss.android.ugc.aweme.player.sdk.api.IPlayer.e.class
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x007c
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r10] = r19
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f76281a
            r15 = 1
            r16 = 89067(0x15beb, float:1.2481E-40)
            java.lang.Class[] r0 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.playerkit.videoview.g> r2 = com.ss.android.ugc.playerkit.videoview.g.class
            r0[r10] = r2
            java.lang.Class<com.ss.android.ugc.aweme.player.sdk.api.IPlayer$e> r18 = com.ss.android.ugc.aweme.player.sdk.api.IPlayer.e.class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            r3 = r0
            com.ss.android.ugc.aweme.player.sdk.api.IPlayer$e r3 = (com.ss.android.ugc.aweme.player.sdk.api.IPlayer.e) r3
            goto L_0x0087
        L_0x007c:
            if (r19 != 0) goto L_0x007f
            goto L_0x0087
        L_0x007f:
            com.ss.android.ugc.aweme.player.sdk.api.IPlayer$e r0 = r19.X()
            if (r0 != 0) goto L_0x0086
            goto L_0x0087
        L_0x0086:
            r3 = r0
        L_0x0087:
            java.lang.String r0 = a((com.ss.android.ugc.aweme.player.sdk.api.IPlayer.e) r3, (java.lang.String) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.y.a(com.ss.android.ugc.playerkit.videoview.g, java.lang.String):java.lang.String");
    }
}
