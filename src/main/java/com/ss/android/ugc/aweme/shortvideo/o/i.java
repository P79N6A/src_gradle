package com.ss.android.ugc.aweme.shortvideo.o;

import com.google.common.a.f;
import com.google.common.collect.az;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import java.util.ArrayList;
import java.util.List;

public final class i implements f<TextExtraStruct, AVTextExtraStruct> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68809a;

    public static ArrayList<AVTextExtraStruct> a(List<TextExtraStruct> list) {
        List<TextExtraStruct> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, null, f68809a, true, 80111, new Class[]{List.class}, ArrayList.class)) {
            return (ArrayList) PatchProxy.accessDispatch(new Object[]{list2}, null, f68809a, true, 80111, new Class[]{List.class}, ArrayList.class);
        } else if (list2 == null) {
            return null;
        } else {
            return az.a((Iterable<? extends E>) az.a(list2, new i()));
        }
    }

    public final /* synthetic */ Object apply(Object obj) {
        TextExtraStruct textExtraStruct = (TextExtraStruct) obj;
        if (PatchProxy.isSupport(new Object[]{textExtraStruct}, this, f68809a, false, 80110, new Class[]{TextExtraStruct.class}, AVTextExtraStruct.class)) {
            return (AVTextExtraStruct) PatchProxy.accessDispatch(new Object[]{textExtraStruct}, this, f68809a, false, 80110, new Class[]{TextExtraStruct.class}, AVTextExtraStruct.class);
        }
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.setStarAtlasTag(textExtraStruct.isStarAtlasTag());
        aVTextExtraStruct.setCid(textExtraStruct.getCid());
        aVTextExtraStruct.setHashTagName(textExtraStruct.getHashTagName());
        aVTextExtraStruct.setUserId(textExtraStruct.getUserId());
        aVTextExtraStruct.setAtUserType(textExtraStruct.getAtUserType());
        aVTextExtraStruct.setType(textExtraStruct.getType());
        aVTextExtraStruct.setStart(textExtraStruct.getStart());
        aVTextExtraStruct.setEnd(textExtraStruct.getEnd());
        aVTextExtraStruct.setAwemeId(textExtraStruct.getAwemeId());
        return aVTextExtraStruct;
    }
}
