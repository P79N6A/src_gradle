package com.ss.android.ugc.playerkit.videoview;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.playerkit.b;
import com.ss.android.ugc.playerkit.c.c;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f77762a = true;

    public static boolean a(Video video, c.a aVar) {
        if (!f77762a || !b.a((UrlModel) video.getPlayAddrH265()) || !b.a(aVar)) {
            return false;
        }
        return true;
    }
}
