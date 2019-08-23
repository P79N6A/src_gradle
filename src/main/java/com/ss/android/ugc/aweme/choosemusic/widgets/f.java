package com.ss.android.ugc.aweme.choosemusic.widgets;

import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity;
import com.ss.android.ugc.aweme.choosemusic.b.c;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;

public final /* synthetic */ class f implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36196a;

    /* renamed from: b  reason: collision with root package name */
    private final MusicClassWidget f36197b;

    f(MusicClassWidget musicClassWidget) {
        this.f36197b = musicClassWidget;
    }

    public final void a(MusicCollectionItem musicCollectionItem, int i) {
        MusicCollectionItem musicCollectionItem2 = musicCollectionItem;
        if (PatchProxy.isSupport(new Object[]{musicCollectionItem2, Integer.valueOf(i)}, this, f36196a, false, 27007, new Class[]{MusicCollectionItem.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicCollectionItem2, Integer.valueOf(i)}, this, f36196a, false, 27007, new Class[]{MusicCollectionItem.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        MusicClassWidget musicClassWidget = this.f36197b;
        Intent intent = new Intent(musicClassWidget.f2709d, MusicDetailListActivity.class);
        intent.putExtra("music_type", 2);
        intent.putExtra("music_class_id", musicCollectionItem2.mcId);
        intent.putExtra("music_class_name", musicCollectionItem2.mcName);
        intent.putExtra("music_category_is_hot", musicCollectionItem2.isHot);
        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", musicClassWidget.m);
        intent.putExtra("music_class_enter_method", "click_category_list");
        musicClassWidget.a(intent, musicClassWidget.l);
        com.ss.android.ugc.aweme.choosemusic.f.c.a(musicCollectionItem2.mcName, "click_category_list", "", "change_music_page", musicCollectionItem2.mcId);
    }
}
