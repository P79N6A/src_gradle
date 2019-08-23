package com.bytedance.android.livesdk.sticker;

import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.gift.model.b;
import com.bytedance.android.livesdk.sticker.api.StickerReportApi;
import com.bytedance.android.livesdk.utils.b.c;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17308a;

    public static void a(long j) {
        long j2 = j;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f17308a, true, 13387, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f17308a, true, 13387, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        List<b> stickerGifts = ((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).getStickerGifts();
        if (stickerGifts.size() != 0) {
            StringBuilder sb = new StringBuilder();
            for (b next : stickerGifts) {
                if (((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).isAssetsDownloaded("effects", next.r)) {
                    if (z) {
                        sb.append(next.f15105d);
                        z = false;
                    } else {
                        sb.append(",");
                        sb.append(next.f15105d);
                    }
                }
            }
            ((com.bytedance.android.livesdk.utils.b.b) ((StickerReportApi) j.q().d().a(StickerReportApi.class)).reportFaceGift(j2, sb.toString()).compose(i.a()).as(c.a())).a(3).subscribe(q.f17310b, r.f17312b);
        }
    }
}
