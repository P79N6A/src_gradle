package com.ss.android.ugc.aweme.story.shootvideo.edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.a.d;
import com.ss.android.ugc.aweme.story.shootvideo.brushsticker.a;
import com.ss.android.ugc.aweme.story.shootvideo.publish.f;
import com.ss.android.ugc.aweme.video.b;
import java.util.concurrent.Callable;

public final /* synthetic */ class o implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73502a;

    /* renamed from: b  reason: collision with root package name */
    private final a f73503b;

    /* renamed from: c  reason: collision with root package name */
    private final String f73504c;

    o(a aVar, String str) {
        this.f73503b = aVar;
        this.f73504c = str;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f73502a, false, 85254, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f73502a, false, 85254, new Class[0], Object.class);
        }
        a aVar = this.f73503b;
        String str = this.f73504c;
        a aVar2 = aVar.m;
        if (PatchProxy.isSupport(new Object[]{str}, aVar2, a.f73402b, false, 85170, new Class[]{String.class}, Integer.TYPE)) {
            ((Integer) PatchProxy.accessDispatch(new Object[]{str}, aVar2, a.f73402b, false, 85170, new Class[]{String.class}, Integer.TYPE)).intValue();
        } else if (aVar2.f73405e != null) {
            b.a(str, true);
            aVar2.f73405e.n.end2DBrush(str);
        }
        f fVar = aVar.p;
        if (PatchProxy.isSupport(new Object[]{str}, fVar, f.f73713a, false, 85426, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, fVar, f.f73713a, false, 85426, new Class[]{String.class}, Void.TYPE);
        } else if (b.b(str)) {
            if (!fVar.f73714b.hasInfoStickers()) {
                fVar.f73714b.infoStickerModel = new com.ss.android.ugc.aweme.n.a(d.a(fVar.f73714b.mPath));
            }
            int i = 1;
            for (com.ss.android.ugc.aweme.n.b next : fVar.f73714b.infoStickerModel.stickers) {
                if (next.layerWeight < i) {
                    i = next.layerWeight;
                }
            }
            com.ss.android.ugc.aweme.n.b bVar = new com.ss.android.ugc.aweme.n.b("", str, "", i - 1, false, 0, fVar.f73714b.videoType == 9 ? com.ss.android.ugc.aweme.port.in.a.L.b(e.a.StoryImagePlayTime) : fVar.f73714b.mVideoLength);
            bVar.isImageStickerLayer = true;
            fVar.f73714b.infoStickerModel.stickers.add(bVar);
        }
        aVar.a(str, "/sdcard/Download/paint.png");
        return Boolean.TRUE;
    }
}
