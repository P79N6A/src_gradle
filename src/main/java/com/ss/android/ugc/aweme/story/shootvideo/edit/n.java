package com.ss.android.ugc.aweme.story.shootvideo.edit;

import a.g;
import a.i;
import android.graphics.Bitmap;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.n.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.a.d;
import com.ss.android.ugc.aweme.story.shootvideo.c;
import com.ss.android.ugc.aweme.story.shootvideo.publish.f;
import com.ss.android.ugc.aweme.video.b;

public final /* synthetic */ class n implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73499a;

    /* renamed from: b  reason: collision with root package name */
    private final a f73500b;

    /* renamed from: c  reason: collision with root package name */
    private final String f73501c;

    n(a aVar, String str) {
        this.f73500b = aVar;
        this.f73501c = str;
    }

    public final Object then(i iVar) {
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f73499a, false, 85253, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f73499a, false, 85253, new Class[]{i.class}, Object.class);
        }
        a aVar = this.f73500b;
        String str = this.f73501c;
        if (iVar.e() == null) {
            return Boolean.FALSE;
        }
        c.a((Bitmap) iVar.e(), str);
        if (aVar.A.g()) {
            f fVar = aVar.p;
            String str2 = aVar.A.v;
            if (PatchProxy.isSupport(new Object[]{str, str2}, fVar, f.f73713a, false, 85425, new Class[]{String.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, str2}, fVar, f.f73713a, false, 85425, new Class[]{String.class, String.class}, Void.TYPE);
            } else if (b.b(str)) {
                if (!fVar.f73714b.hasInfoStickers()) {
                    fVar.f73714b.infoStickerModel = new a(d.a(fVar.f73714b.mPath));
                }
                if (fVar.f73714b.infoStickerModel.stickers.size() > 0) {
                    i2 = 1;
                    for (com.ss.android.ugc.aweme.n.b next : fVar.f73714b.infoStickerModel.stickers) {
                        if (next.layerWeight > i2) {
                            i2 = next.layerWeight;
                        }
                    }
                } else {
                    i2 = 1;
                }
                int b2 = fVar.f73714b.videoType == 9 ? com.ss.android.ugc.aweme.port.in.a.L.b(e.a.StoryImagePlayTime) : fVar.f73714b.mVideoLength;
                if (!StringUtils.isEmpty(str2)) {
                    i2++;
                    com.ss.android.ugc.aweme.n.b bVar = new com.ss.android.ugc.aweme.n.b(str2, str, "", i2, false, 0, b2);
                    bVar.type = 1;
                    fVar.f73714b.infoStickerModel.stickers.add(bVar);
                }
                com.ss.android.ugc.aweme.n.b bVar2 = new com.ss.android.ugc.aweme.n.b("", str, "", i2 + 1, false, 0, b2);
                bVar2.isImageStickerLayer = true;
                bVar2.type = 2;
                fVar.f73714b.infoStickerModel.stickers.add(bVar2);
            }
        } else {
            f fVar2 = aVar.p;
            if (PatchProxy.isSupport(new Object[]{str}, fVar2, f.f73713a, false, 85424, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, fVar2, f.f73713a, false, 85424, new Class[]{String.class}, Void.TYPE);
            } else if (b.b(str)) {
                if (!fVar2.f73714b.hasInfoStickers()) {
                    fVar2.f73714b.infoStickerModel = new a(d.a(fVar2.f73714b.mPath));
                }
                if (fVar2.f73714b.infoStickerModel.stickers.size() > 0) {
                    i = 1;
                    for (com.ss.android.ugc.aweme.n.b next2 : fVar2.f73714b.infoStickerModel.stickers) {
                        if (next2.layerWeight > i) {
                            i = next2.layerWeight;
                        }
                    }
                } else {
                    i = 1;
                }
                com.ss.android.ugc.aweme.n.b bVar3 = new com.ss.android.ugc.aweme.n.b("", str, "", i + 1, false, 0, fVar2.f73714b.videoType == 9 ? com.ss.android.ugc.aweme.port.in.a.L.b(e.a.StoryImagePlayTime) : fVar2.f73714b.mVideoLength);
                fVar2.f73714b.infoStickerModel.stickers.add(bVar3);
                bVar3.isImageStickerLayer = true;
            }
        }
        aVar.a(str, "/sdcard/Download/text.png");
        return Boolean.TRUE;
    }
}
