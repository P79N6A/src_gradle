package com.ss.android.ugc.aweme.im.sdk.chat.net;

import a.i;
import android.text.TextUtils;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.chat.input.photo.j;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.OnlyPictureContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.SharePoiContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.StoryPictureContent;
import com.ss.android.ugc.aweme.im.sdk.utils.am;
import java.util.List;
import java.util.concurrent.Callable;

public class s extends c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50977a;

    /* renamed from: b  reason: collision with root package name */
    private static am<s> f50978b = new am<s>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50979a;

        public final /* synthetic */ Object a() {
            if (!PatchProxy.isSupport(new Object[0], this, f50979a, false, 51308, new Class[0], s.class)) {
                return new s((byte) 0);
            }
            return (s) PatchProxy.accessDispatch(new Object[0], this, f50979a, false, 51308, new Class[0], s.class);
        }
    };

    private s() {
    }

    public final void a(String str, List<j> list) {
        String str2 = str;
        List<j> list2 = list;
        if (PatchProxy.isSupport(new Object[]{str2, list2}, this, f50977a, false, 51296, new Class[]{String.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, list2}, this, f50977a, false, 51296, new Class[]{String.class, List.class}, Void.TYPE);
        } else if (list2 == null || list.isEmpty()) {
        } else {
            a.a(new t(this, list2, str2));
        }
    }

    public static s a() {
        if (PatchProxy.isSupport(new Object[0], null, f50977a, true, 51294, new Class[0], s.class)) {
            return (s) PatchProxy.accessDispatch(new Object[0], null, f50977a, true, 51294, new Class[0], s.class);
        }
        return (s) f50978b.b();
    }

    /* synthetic */ s(byte b2) {
        this();
    }

    public final void b(n nVar) {
        if (PatchProxy.isSupport(new Object[]{nVar}, this, f50977a, false, 51299, new Class[]{n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar}, this, f50977a, false, 51299, new Class[]{n.class}, Void.TYPE);
            return;
        }
        String a2 = o.a(nVar);
        if (nVar.getMsgType() == 2) {
            y yVar = (y) this.f50916d.get(a2);
            if (yVar != null) {
                yVar.a((x) null);
            }
            return;
        }
        if (nVar.getMsgType() == 27) {
            g gVar = (g) this.f50916d.get(a2);
            if (gVar != null) {
                gVar.f50932d = null;
            }
        }
    }

    public final String a(BaseContent baseContent) {
        String picturePath;
        BaseContent baseContent2 = baseContent;
        if (PatchProxy.isSupport(new Object[]{baseContent2}, this, f50977a, false, 51303, new Class[]{BaseContent.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{baseContent2}, this, f50977a, false, 51303, new Class[]{BaseContent.class}, String.class);
        }
        String str = null;
        if (baseContent2 == null) {
            return null;
        }
        if (baseContent2 instanceof SharePoiContent) {
            UrlModel mapUrl = ((SharePoiContent) baseContent2).getMapUrl();
            if (mapUrl != null && !TextUtils.isEmpty(mapUrl.getUri()) && mapUrl.getUri().startsWith("file://")) {
                picturePath = mapUrl.getUri().substring(7);
            }
            return str;
        } else if (baseContent2 instanceof OnlyPictureContent) {
            OnlyPictureContent onlyPictureContent = (OnlyPictureContent) baseContent2;
            UrlModel url = onlyPictureContent.getUrl();
            if (url == null || (url.getUri() != null && url.getUri().startsWith("file://"))) {
                if (onlyPictureContent.isSendRaw() || !TextUtils.isEmpty(onlyPictureContent.getCompressPath())) {
                    picturePath = onlyPictureContent.getPicturePath();
                } else {
                    picturePath = onlyPictureContent.getCompressPath();
                }
            }
            return str;
        } else {
            if (baseContent2 instanceof StoryPictureContent) {
                StoryPictureContent storyPictureContent = (StoryPictureContent) baseContent2;
                if (storyPictureContent.getUrl() == null) {
                    if (storyPictureContent.isSendRaw() || !TextUtils.isEmpty(storyPictureContent.getCompressPath())) {
                        picturePath = storyPictureContent.getPicturePath();
                    } else {
                        picturePath = storyPictureContent.getCompressPath();
                    }
                }
            }
            return str;
        }
        str = picturePath;
        return str;
    }

    public final ab a(n nVar, BaseContent baseContent) {
        if (PatchProxy.isSupport(new Object[]{nVar, baseContent}, this, f50977a, false, 51300, new Class[]{n.class, BaseContent.class}, ab.class)) {
            return (ab) PatchProxy.accessDispatch(new Object[]{nVar, baseContent}, this, f50977a, false, 51300, new Class[]{n.class, BaseContent.class}, ab.class);
        } else if (baseContent instanceof OnlyPictureContent) {
            return new o(this.i, this.h, (OnlyPictureContent) baseContent, nVar);
        } else {
            if (baseContent instanceof StoryPictureContent) {
                return new g(this.h, (StoryPictureContent) baseContent, nVar);
            }
            return null;
        }
    }

    public final void b(String str, List<j> list) {
        String str2 = str;
        List<j> list2 = list;
        if (PatchProxy.isSupport(new Object[]{str2, list2}, this, f50977a, false, 51297, new Class[]{String.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, list2}, this, f50977a, false, 51297, new Class[]{String.class, List.class}, Void.TYPE);
        } else if (list2 == null || list.size() == 0) {
        } else {
            i.a((Callable<TResult>) new u<TResult>(this, list2, str2)).a(v.f51007b, i.f1052b);
        }
    }

    public final void a(n nVar, x xVar) {
        if (PatchProxy.isSupport(new Object[]{nVar, xVar}, this, f50977a, false, 51298, new Class[]{n.class, x.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar, xVar}, this, f50977a, false, 51298, new Class[]{n.class, x.class}, Void.TYPE);
            return;
        }
        String a2 = o.a(nVar);
        if (nVar.getMsgType() == 2) {
            y yVar = (y) this.f50916d.get(a2);
            if (yVar != null) {
                yVar.a(xVar);
            }
            return;
        }
        if (nVar.getMsgType() == 27) {
            g gVar = (g) this.f50916d.get(a2);
            if (gVar != null) {
                gVar.f50932d = xVar;
            }
        }
    }

    public final void a(String str, x xVar) {
        if (PatchProxy.isSupport(new Object[]{str, xVar}, this, f50977a, false, 51295, new Class[]{String.class, x.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, xVar}, this, f50977a, false, 51295, new Class[]{String.class, x.class}, Void.TYPE);
            return;
        }
        y yVar = new y(this.i);
        yVar.f51014e = str;
        yVar.a(xVar);
        a((ab) yVar);
    }

    public final void a(String str, BaseContent baseContent, x xVar) {
        String str2 = str;
        BaseContent baseContent2 = baseContent;
        x xVar2 = xVar;
        if (PatchProxy.isSupport(new Object[]{str2, baseContent2, xVar2}, this, f50977a, false, 51302, new Class[]{String.class, BaseContent.class, x.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, baseContent2, xVar2}, this, f50977a, false, 51302, new Class[]{String.class, BaseContent.class, x.class}, Void.TYPE);
        } else if ((baseContent2 instanceof SharePoiContent) || (baseContent2 instanceof OnlyPictureContent)) {
            y yVar = new y(this.i);
            yVar.f51014e = str2;
            yVar.a(xVar2);
            a((ab) yVar);
        } else {
            if (baseContent2 instanceof StoryPictureContent) {
                g gVar = new g(this.h, (StoryPictureContent) baseContent2, null);
                gVar.f50932d = xVar2;
                a((ab) gVar);
            }
        }
    }
}
