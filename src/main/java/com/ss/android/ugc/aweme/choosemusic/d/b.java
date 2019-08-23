package com.ss.android.ugc.aweme.choosemusic.d;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.choosemusic.f.d;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import java.util.ArrayList;

public final /* synthetic */ class b implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35812a;

    /* renamed from: b  reason: collision with root package name */
    private final a f35813b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f35814c;

    /* renamed from: d  reason: collision with root package name */
    private final String f35815d;

    /* renamed from: e  reason: collision with root package name */
    private final Music f35816e;

    b(a aVar, boolean z, String str, Music music) {
        this.f35813b = aVar;
        this.f35814c = z;
        this.f35815d = str;
        this.f35816e = music;
    }

    public final Object then(i iVar) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f35812a, false, 26738, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f35812a, false, 26738, new Class[]{i.class}, Object.class);
        }
        a aVar = this.f35813b;
        boolean z2 = this.f35814c;
        String str = this.f35815d;
        Music music = this.f35816e;
        if (!iVar.c()) {
            if (iVar.d()) {
                if (!z2) {
                    aVar.f35805c.a("pick_status", (Object) 1);
                } else {
                    aVar.f35805c.a("status_pick_load_more", (Object) 1);
                }
            } else if (iVar.b()) {
                if (!z2) {
                    ArrayList arrayList = new ArrayList();
                    v vVar = (v) iVar.e();
                    aVar.f35805c.a("data_banner", (Object) vVar.f35865a);
                    MusicCollectionItem musicCollectionItem = new MusicCollectionItem();
                    musicCollectionItem.mcName = aVar.f35807e.getString(C0906R.string.bwg);
                    arrayList.add(new r(d.a(vVar.f35867c), musicCollectionItem, 1));
                    arrayList.add(new u(vVar.f35866b));
                    aVar.f35805c.a("radio_cursor", (Object) Integer.valueOf(vVar.f35870f));
                    DataCenter dataCenter = aVar.f35805c;
                    if (vVar.f35869e != 1) {
                        z = false;
                    }
                    dataCenter.a("show_music_radio", (Object) Boolean.valueOf(z));
                    if (str != null && vVar.f35868d != null && vVar.f35868d.size() > 0) {
                        aVar.f35805c.a("data_sticker_music_from_video", (Object) Boolean.FALSE);
                        aVar.f35805c.a("data_sticker", (Object) vVar.f35868d);
                    } else if (music != null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(music);
                        aVar.f35805c.a("data_sticker_music_from_video", (Object) Boolean.TRUE);
                        aVar.f35805c.a("data_sticker", (Object) arrayList2);
                    }
                    aVar.f35805c.a("list", (Object) arrayList);
                    aVar.f35805c.a("pick_status", (Object) 0);
                } else {
                    v vVar2 = (v) iVar.e();
                    aVar.f35805c.a("pick_list_more", (Object) d.a(vVar2.f35867c));
                    aVar.f35805c.a("radio_cursor", (Object) Integer.valueOf(vVar2.f35870f));
                }
            }
        }
        return null;
    }
}
