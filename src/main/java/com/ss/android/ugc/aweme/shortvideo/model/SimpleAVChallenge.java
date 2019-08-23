package com.ss.android.ugc.aweme.shortvideo.model;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.shortvideo.c;

public class SimpleAVChallenge {
    private static final Gson GSON = a.f61120c;
    public static ChangeQuickRedirect changeQuickRedirect;
    public String challengeName;
    public String cid;
    public String stickerId;
    public int type;
    public int userCount;
    public long viewCount = -1;

    public c parse2AVChallenge() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77667, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77667, new Class[0], c.class);
        }
        c cVar = new c();
        cVar.cid = this.cid;
        cVar.challengeName = this.challengeName;
        cVar.type = this.type;
        cVar.stickerId = this.stickerId;
        cVar.viewCount = this.viewCount;
        cVar.userCount = this.userCount;
        return cVar;
    }

    public static SimpleAVChallenge deserializeFromJson(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 77666, new Class[]{String.class}, SimpleAVChallenge.class)) {
            return (SimpleAVChallenge) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 77666, new Class[]{String.class}, SimpleAVChallenge.class);
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            try {
                return (SimpleAVChallenge) GSON.fromJson(str2, SimpleAVChallenge.class);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static SimpleAVChallenge fromAVChallenge(c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, null, changeQuickRedirect, true, 77668, new Class[]{c.class}, SimpleAVChallenge.class)) {
            return (SimpleAVChallenge) PatchProxy.accessDispatch(new Object[]{cVar2}, null, changeQuickRedirect, true, 77668, new Class[]{c.class}, SimpleAVChallenge.class);
        }
        SimpleAVChallenge simpleAVChallenge = new SimpleAVChallenge();
        simpleAVChallenge.cid = cVar2.cid;
        simpleAVChallenge.challengeName = cVar2.challengeName;
        simpleAVChallenge.type = cVar2.type;
        simpleAVChallenge.stickerId = cVar2.stickerId;
        simpleAVChallenge.viewCount = cVar2.viewCount;
        simpleAVChallenge.userCount = cVar2.userCount;
        return simpleAVChallenge;
    }

    public static String serializeToStr(SimpleAVChallenge simpleAVChallenge) {
        SimpleAVChallenge simpleAVChallenge2 = simpleAVChallenge;
        if (PatchProxy.isSupport(new Object[]{simpleAVChallenge2}, null, changeQuickRedirect, true, 77665, new Class[]{SimpleAVChallenge.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{simpleAVChallenge2}, null, changeQuickRedirect, true, 77665, new Class[]{SimpleAVChallenge.class}, String.class);
        } else if (simpleAVChallenge2 == null) {
            return null;
        } else {
            try {
                return GSON.toJson((Object) simpleAVChallenge2);
            } catch (Exception unused) {
                return null;
            }
        }
    }
}
