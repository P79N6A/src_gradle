package com.ss.android.ugc.aweme.video.bitrate;

import android.content.Context;
import com.bytedance.ttnet.TTNetInit;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.feed.model.BitRate;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.ss.android.ugc.aweme.video.preload.g;
import com.ss.android.ugc.lib.video.bitrate.regulator.a.f;
import com.ss.android.ugc.lib.video.bitrate.regulator.b;
import com.ss.android.ugc.lib.video.bitrate.regulator.b.c;
import com.ss.android.ugc.lib.video.bitrate.regulator.b.d;
import com.ss.android.ugc.lib.video.bitrate.regulator.b.e;
import com.ss.android.ugc.playerkit.session.Session;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76015a = null;

    /* renamed from: b  reason: collision with root package name */
    public static int f76016b = -1;

    public static void a(f fVar, VideoUrlModel videoUrlModel) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2, videoUrlModel}, null, f76015a, true, 89073, new Class[]{f.class, VideoUrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2, videoUrlModel}, null, f76015a, true, 89073, new Class[]{f.class, VideoUrlModel.class}, Void.TYPE);
            return;
        }
        try {
            b bVar = fVar2.f77679c;
            if (AbTestManager.a().aa() && !VideoBitRateABManager.a().f76002c) {
                bVar = new b(7, "gear config is not init");
            }
            if (bVar != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("bitrate_not_match_code", bVar.getCode());
                jSONObject.put("bitrate_not_match_msg", bVar.getMessage());
                if (videoUrlModel != null) {
                    jSONObject.put("group_id", videoUrlModel.getSourceId());
                }
                n.a("video_bitrate_not_match", jSONObject);
            }
        } catch (JSONException unused) {
        }
    }

    public static Map<String, Object> a(Context context, VideoUrlModel videoUrlModel, double d2, e eVar) {
        c.b bVar;
        c.b bVar2;
        int i;
        long j;
        int i2;
        c.b bVar3;
        Context context2 = context;
        double d3 = d2;
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{context2, videoUrlModel, Double.valueOf(d2), eVar2}, null, f76015a, true, 89074, new Class[]{Context.class, VideoUrlModel.class, Double.TYPE, e.class}, Map.class)) {
            Object[] objArr = {context2, videoUrlModel, Double.valueOf(d2), eVar2};
            return (Map) PatchProxy.accessDispatch(objArr, null, f76015a, true, 89074, new Class[]{Context.class, VideoUrlModel.class, Double.TYPE, e.class}, Map.class);
        } else if (!(eVar2 instanceof c)) {
            return d.b.a().a((int) d3).f77700b;
        } else {
            if (PatchProxy.isSupport(new Object[0], null, c.b.f77695a, true, 90501, new Class[0], c.b.class)) {
                bVar = (c.b) PatchProxy.accessDispatch(new Object[0], null, c.b.f77695a, true, 90501, new Class[0], c.b.class);
            } else {
                bVar = new c.b();
            }
            int duration = (int) (videoUrlModel.getDuration() / 1000.0d);
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(duration)}, bVar, c.b.f77695a, false, 90503, new Class[]{Integer.TYPE}, c.b.class)) {
                c.b bVar4 = bVar;
                bVar2 = (c.b) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(duration)}, bVar4, c.b.f77695a, false, 90503, new Class[]{Integer.TYPE}, c.b.class);
            } else {
                bVar.f77696b.put("video_duration", Integer.valueOf(duration));
                bVar2 = bVar;
            }
            int i3 = (int) d3;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i3)}, bVar2, c.b.f77695a, false, 90502, new Class[]{Integer.TYPE}, c.b.class)) {
                c.b bVar5 = bVar2;
                c.b bVar6 = (c.b) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3)}, bVar5, c.b.f77695a, false, 90502, new Class[]{Integer.TYPE}, c.b.class);
            } else {
                Map<String, Object> map = bVar2.f77696b;
                int i4 = i3 / 8000;
                if (i4 < 0) {
                    i4 = 0;
                }
                map.put("internet_speed", Integer.valueOf(i4));
            }
            try {
                com.bytedance.frameworks.baselib.network.http.cronet.a.b networkQuality = TTNetInit.getNetworkQuality();
                bVar.a(networkQuality.f19794a).b(networkQuality.f19796c).c(networkQuality.f19795b);
            } catch (Exception unused) {
                bVar.a(0).b(0).c(0);
            }
            try {
                bVar.d(com.ss.android.ugc.aweme.video.f.a(context).b(context2));
            } catch (Exception unused2) {
                bVar.d(Integer.MIN_VALUE);
            }
            try {
                NetworkUtils.h networkType = NetworkUtils.getNetworkType(context);
                if (networkType == null) {
                    i2 = 0;
                } else {
                    i2 = networkType.getValue();
                }
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, bVar, c.b.f77695a, false, 90508, new Class[]{Integer.TYPE}, c.b.class)) {
                    c.b bVar7 = bVar;
                    bVar3 = (c.b) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, bVar7, c.b.f77695a, false, 90508, new Class[]{Integer.TYPE}, c.b.class);
                } else {
                    bVar.f77696b.put("access", Integer.valueOf(i2));
                    bVar3 = bVar;
                }
                bVar3.e(Integer.valueOf(NetworkUtils.getNetworkOperatorCode(context)).intValue());
            } catch (NumberFormatException unused3) {
                bVar.e(0);
            }
            List<Session> a2 = com.ss.android.ugc.playerkit.session.a.a().a(3, videoUrlModel.getUri());
            if (a2.size() > 0) {
                ArrayList arrayList = new ArrayList(3);
                ArrayList arrayList2 = new ArrayList(3);
                ArrayList arrayList3 = new ArrayList(3);
                ArrayList arrayList4 = new ArrayList(3);
                ArrayList arrayList5 = new ArrayList(3);
                for (Session next : a2) {
                    arrayList.add(Integer.valueOf((int) next.speed));
                    arrayList2.add(Integer.valueOf(next.blockCnt));
                    arrayList3.add(Integer.valueOf(next.blockTime));
                    arrayList4.add(Integer.valueOf(next.bitrate));
                    arrayList5.add(Integer.valueOf(next.playTime));
                }
                bVar.a((List<Integer>) arrayList).b((List<Integer>) arrayList2).c((List<Integer>) arrayList3).d((List<Integer>) arrayList4).e((List<Integer>) arrayList5);
            } else {
                bVar.a(Collections.emptyList()).b(Collections.emptyList()).c(Collections.emptyList()).d(Collections.emptyList()).e(Collections.emptyList());
            }
            ArrayList arrayList6 = new ArrayList();
            for (BitRate urlKey : videoUrlModel.getBitRate()) {
                String urlKey2 = urlKey.getUrlKey();
                if (PatchProxy.isSupport(new Object[]{urlKey2}, null, f76015a, true, 89075, new Class[]{String.class}, Integer.TYPE)) {
                    i = ((Integer) PatchProxy.accessDispatch(new Object[]{urlKey2}, null, f76015a, true, 89075, new Class[]{String.class}, Integer.TYPE)).intValue();
                } else {
                    g f2 = g.f();
                    if (PatchProxy.isSupport(new Object[]{urlKey2}, f2, g.f76257a, false, 89242, new Class[]{String.class}, Long.TYPE)) {
                        g gVar = f2;
                        j = ((Long) PatchProxy.accessDispatch(new Object[]{urlKey2}, gVar, g.f76257a, false, 89242, new Class[]{String.class}, Long.TYPE)).longValue();
                    } else {
                        j = f2.g().a(urlKey2);
                    }
                    long j2 = j / 1024;
                    if (j2 > 0) {
                        i = (int) j2;
                    } else {
                        i = 0;
                    }
                }
                arrayList6.add(Integer.valueOf(i));
            }
            if (PatchProxy.isSupport(new Object[]{arrayList6}, bVar, c.b.f77695a, false, 90516, new Class[]{List.class}, c.b.class)) {
                c.b bVar8 = bVar;
                c.b bVar9 = (c.b) PatchProxy.accessDispatch(new Object[]{arrayList6}, bVar8, c.b.f77695a, false, 90516, new Class[]{List.class}, c.b.class);
            } else {
                bVar.f77696b.put("cache_size_list", arrayList6);
            }
            return bVar.a();
        }
    }
}
