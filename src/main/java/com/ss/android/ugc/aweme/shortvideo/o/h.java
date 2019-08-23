package com.ss.android.ugc.aweme.shortvideo.o;

import com.google.common.a.f;
import com.google.common.collect.az;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import java.util.ArrayList;
import java.util.List;

public final class h implements f<AVTextExtraStruct, TextExtraStruct> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68808a;

    public static ArrayList<TextExtraStruct> a(List<AVTextExtraStruct> list) {
        List<AVTextExtraStruct> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, null, f68808a, true, 80109, new Class[]{List.class}, ArrayList.class)) {
            return (ArrayList) PatchProxy.accessDispatch(new Object[]{list2}, null, f68808a, true, 80109, new Class[]{List.class}, ArrayList.class);
        } else if (list2 == null) {
            return null;
        } else {
            return az.a((Iterable<? extends E>) az.a(list2, new h()));
        }
    }

    public final /* synthetic */ Object apply(Object obj) {
        AVTextExtraStruct aVTextExtraStruct = (AVTextExtraStruct) obj;
        if (PatchProxy.isSupport(new Object[]{aVTextExtraStruct}, this, f68808a, false, 80108, new Class[]{AVTextExtraStruct.class}, TextExtraStruct.class)) {
            return (TextExtraStruct) PatchProxy.accessDispatch(new Object[]{aVTextExtraStruct}, this, f68808a, false, 80108, new Class[]{AVTextExtraStruct.class}, TextExtraStruct.class);
        }
        TextExtraStruct textExtraStruct = new TextExtraStruct();
        textExtraStruct.setCid(aVTextExtraStruct.getCid());
        textExtraStruct.setHashTagName(aVTextExtraStruct.getHashTagName());
        textExtraStruct.setUserId(aVTextExtraStruct.getUserId());
        textExtraStruct.setAtUserType(aVTextExtraStruct.getAtUserType());
        textExtraStruct.setType(aVTextExtraStruct.getType());
        textExtraStruct.setStart(aVTextExtraStruct.getStart());
        textExtraStruct.setEnd(aVTextExtraStruct.getEnd());
        textExtraStruct.setAwemeId(aVTextExtraStruct.getAwemeId());
        return textExtraStruct;
    }
}
