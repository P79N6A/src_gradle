package com.ss.android.ugc.aweme.shortvideo.i;

import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.share.bv;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.aweme.u.aj;
import java.util.Map;
import java.util.UUID;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68204a;

    /* renamed from: b  reason: collision with root package name */
    private final a f68205b;

    /* renamed from: c  reason: collision with root package name */
    private final MusicWaveBean f68206c;

    g(a aVar, MusicWaveBean musicWaveBean) {
        this.f68205b = aVar;
        this.f68206c = musicWaveBean;
    }

    public final void run() {
        i iVar;
        if (PatchProxy.isSupport(new Object[0], this, f68204a, false, 78293, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68204a, false, 78293, new Class[0], Void.TYPE);
            return;
        }
        a aVar = this.f68205b;
        MusicWaveBean musicWaveBean = this.f68206c;
        aVar.e();
        String uuid = UUID.randomUUID().toString();
        r.a("shoot", (Map) d.a().a("creation_id", uuid).a("shoot_way", "react").a("_staging_flag", a.b() ^ true ? 1 : 0).a("group_id", aVar.f68177c.getAid()).f34114b);
        Intent intent = new Intent();
        intent.putExtra("shoot_way", "react");
        intent.putExtra("creation_id", uuid);
        intent.putExtra("music_origin", "react");
        if (musicWaveBean != null) {
            intent.putExtra("music_wave_data", musicWaveBean);
        }
        if (aVar.f68177c.hasStickerID()) {
            intent.putStringArrayListExtra("reuse_sticker_ids", bv.a(aVar.f68177c.getStickerIDs()));
        }
        aj.a(aVar.g);
        if (PatchProxy.isSupport(new Object[0], aVar, a.f68175a, false, 78284, new Class[0], i.class)) {
            iVar = (i) PatchProxy.accessDispatch(new Object[0], aVar, a.f68175a, false, 78284, new Class[0], i.class);
        } else {
            iVar = new i();
            iVar.videoPath = aVar.j;
            iVar.wavPath = aVar.k;
            iVar.videoWidth = aVar.n;
            iVar.videoHeight = aVar.o;
            iVar.reactionViewId = aVar.f68177c.getAid();
            iVar.reactionOriginId = (aVar.f68179e == null ? aVar.f68177c : aVar.f68179e).getAid();
            iVar.reactionFromId = aVar.f68178d.getAid();
            iVar.reactionFromAuthor = aVar.f68178d.getAuthor();
            iVar.nonReacted = aVar.f68180f;
        }
        intent.putExtra("reaction_params", iVar);
        ((IAVService) ServiceManager.get().getService(IAVService.class)).startToolPermissionActivity(aVar.f68176b, intent);
        String str = "";
        if (!(aVar.f68178d.getAuthor() == null && aVar.f68178d.getAuthor().getUid() == null)) {
            str = aVar.f68178d.getAuthor().getUid();
        }
        r.onEvent(MobClick.obtain().setEventName("shoot").setLabelName("react").setValue(aVar.f68177c.getAid()).setExtValueString(str));
    }
}
