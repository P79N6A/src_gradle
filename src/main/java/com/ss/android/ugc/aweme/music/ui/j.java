package com.ss.android.ugc.aweme.music.ui;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.music.adapter.ThirdMusicCoverAdapter;
import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final /* synthetic */ class j implements ThirdMusicCoverAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56709a;

    /* renamed from: b  reason: collision with root package name */
    private final MusicDetailFragment f56710b;

    /* renamed from: c  reason: collision with root package name */
    private final List f56711c;

    j(MusicDetailFragment musicDetailFragment, List list) {
        this.f56710b = musicDetailFragment;
        this.f56711c = list;
    }

    public final void a(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f56709a, false, 60248, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f56709a, false, 60248, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        MusicDetailFragment musicDetailFragment = this.f56710b;
        List list = this.f56711c;
        if (i2 >= 0 && i2 < list.size()) {
            ExternalMusicInfo externalMusicInfo = (ExternalMusicInfo) list.get(i2);
            if (PatchProxy.isSupport(new Object[]{externalMusicInfo}, musicDetailFragment, MusicDetailFragment.f3621f, false, 60196, new Class[]{ExternalMusicInfo.class}, Void.TYPE)) {
                MusicDetailFragment musicDetailFragment2 = musicDetailFragment;
                ChangeQuickRedirect changeQuickRedirect = MusicDetailFragment.f3621f;
                PatchProxy.accessDispatch(new Object[]{externalMusicInfo}, musicDetailFragment2, changeQuickRedirect, false, 60196, new Class[]{ExternalMusicInfo.class}, Void.TYPE);
            } else {
                r.a("click_listen_complete_entrance", (Map) d.a().a("enter_from", "single_song").a("music_id", musicDetailFragment.j).f34114b);
                Intent intent = new Intent(musicDetailFragment.getContext(), CrossPlatformActivity.class);
                if (externalMusicInfo != null && !TextUtils.isEmpty(externalMusicInfo.getJumpUrl())) {
                    intent.setData(Uri.parse(externalMusicInfo.getJumpUrl()));
                }
                intent.putExtra("hide_nav_bar", false);
                intent.putExtra("bundle_user_webview_title", true);
                intent.putExtra("bundle_forbidden_jump", true);
                musicDetailFragment.startActivity(intent);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("music_id", externalMusicInfo.getPartnerSongId());
            hashMap.put("music_from", externalMusicInfo.getPartnerName());
            r.a("click_copyright_music", (Map) hashMap);
        }
    }
}
