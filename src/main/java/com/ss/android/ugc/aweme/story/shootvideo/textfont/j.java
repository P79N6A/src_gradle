package com.ss.android.ugc.aweme.story.shootvideo.textfont;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.TextStickerCompileResult;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.d;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o;

public final /* synthetic */ class j implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74213a;

    /* renamed from: b  reason: collision with root package name */
    private final o f74214b;

    j(o oVar) {
        this.f74214b = oVar;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f74213a, false, 86162, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f74213a, false, 86162, new Class[]{i.class}, Object.class);
        }
        o oVar = this.f74214b;
        if (iVar.e() != null) {
            return new TextStickerCompileResult(oVar.h(), (d) iVar.e());
        }
        return null;
    }
}
