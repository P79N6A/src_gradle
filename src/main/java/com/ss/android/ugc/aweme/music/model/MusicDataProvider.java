package com.ss.android.ugc.aweme.music.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.b.b.b;
import java.util.ArrayList;
import java.util.Iterator;

public class MusicDataProvider {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static ArrayList<MusicModel> getMusicModel(ArrayList<b> arrayList) {
        if (PatchProxy.isSupport(new Object[]{arrayList}, null, changeQuickRedirect, true, 60011, new Class[]{ArrayList.class}, ArrayList.class)) {
            return (ArrayList) PatchProxy.accessDispatch(new Object[]{arrayList}, null, changeQuickRedirect, true, 60011, new Class[]{ArrayList.class}, ArrayList.class);
        } else if (arrayList == null || arrayList.isEmpty()) {
            return null;
        } else {
            ArrayList<MusicModel> arrayList2 = new ArrayList<>();
            Iterator<b> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                b next = it2.next();
                MusicModel musicModel = new MusicModel();
                musicModel.setAlbum(next.i);
                musicModel.setAllRate(next.k);
                musicModel.setCollectionType(MusicModel.CollectionType.NOT_COLLECTED);
                musicModel.setDuration(next.m);
                musicModel.setMusicId(next.j);
                musicModel.setName(next.f77137c);
                musicModel.setPath(next.f77136b);
                musicModel.setMusicType(MusicModel.MusicType.BAIDU);
                musicModel.setPicBig(next.g);
                musicModel.setPicHuge(next.f77140f);
                musicModel.setPicPremium(next.f77139e);
                musicModel.setPicSmall(next.h);
                musicModel.setSinger(next.f77138d);
                musicModel.setSongId(next.f77135a);
                musicModel.setSourcePlatform(next.l);
                arrayList2.add(musicModel);
            }
            return arrayList2;
        }
    }
}
