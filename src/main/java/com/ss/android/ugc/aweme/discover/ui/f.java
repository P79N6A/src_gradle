package com.ss.android.ugc.aweme.discover.ui;

import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.ui.DiscoverDetailPageFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.o.a;
import com.ss.android.ugc.aweme.shortvideo.o.c;
import com.ss.android.ugc.aweme.u.aj;
import java.util.UUID;
import java.util.concurrent.Callable;

public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43162a;

    /* renamed from: b  reason: collision with root package name */
    private final DiscoverDetailPageFragment.AnonymousClass7 f43163b;

    /* renamed from: c  reason: collision with root package name */
    private final String f43164c;

    /* renamed from: d  reason: collision with root package name */
    private final MusicModel f43165d;

    f(DiscoverDetailPageFragment.AnonymousClass7 r1, String str, MusicModel musicModel) {
        this.f43163b = r1;
        this.f43164c = str;
        this.f43165d = musicModel;
    }

    public final Object call() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f43162a, false, 37461, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f43162a, false, 37461, new Class[0], Object.class);
        }
        DiscoverDetailPageFragment.AnonymousClass7 r1 = this.f43163b;
        String str = this.f43164c;
        MusicModel musicModel = this.f43165d;
        DiscoverDetailPageFragment discoverDetailPageFragment = DiscoverDetailPageFragment.this;
        if (PatchProxy.isSupport(new Object[]{str, musicModel}, discoverDetailPageFragment, DiscoverDetailPageFragment.g, false, 37448, new Class[]{String.class, MusicModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, musicModel}, discoverDetailPageFragment, DiscoverDetailPageFragment.g, false, 37448, new Class[]{String.class, MusicModel.class}, Void.TYPE);
        } else {
            if (musicModel.getMusic().getChallenge() != null) {
                ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().addChallenge(a.b(musicModel.getMusic().getChallenge()));
            } else {
                ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().removeChallenges();
            }
            Intent intent = new Intent();
            intent.putExtra("path", str);
            if ("direct_shoot".equals(((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().getShootWay()) && 2 == ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().getMusicChooseType()) {
                if (((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().getCurMusic() != null) {
                    z = true;
                }
                intent.putExtra("extra_clear_dialog_show_needed", z);
            }
            intent.putExtra("reverse_video_record_show_planD", true);
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setCurMusic(new c().apply(musicModel));
            intent.putExtra("shoot_way", discoverDetailPageFragment.j.subtype == 8 ? "playlist_artist" : "playlist_music");
            String uuid = UUID.randomUUID().toString();
            intent.putExtra("creation_id", uuid);
            discoverDetailPageFragment.a(uuid, discoverDetailPageFragment.j.subtype == 8 ? "playlist_artist" : "playlist_music");
            aj.a(discoverDetailPageFragment.f3012c.getEventType());
            intent.putExtra("translation_type", 3);
            ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity(discoverDetailPageFragment.getActivity(), intent, true, true, ((IAVService) ServiceManager.get().getService(IAVService.class)).isRecording());
        }
        return null;
    }
}
