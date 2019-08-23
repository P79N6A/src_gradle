package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.utils.a;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67232a;

    /* renamed from: b  reason: collision with root package name */
    private final InfoStickerEditView f67233b;

    c(InfoStickerEditView infoStickerEditView) {
        this.f67233b = infoStickerEditView;
    }

    public final void run() {
        String str;
        d dVar;
        String str2;
        a aVar;
        String str3;
        if (PatchProxy.isSupport(new Object[0], this, f67232a, false, 76772, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67232a, false, 76772, new Class[0], Void.TYPE);
            return;
        }
        InfoStickerEditView infoStickerEditView = this.f67233b;
        if (!(infoStickerEditView.l == null || infoStickerEditView.l.f67198a == null || infoStickerEditView.m == -1 || infoStickerEditView.l.f67199b == 2)) {
            if (infoStickerEditView.l.f67199b == 1) {
                aVar = a.f75468b;
                str2 = "prop_delete";
                dVar = d.a().a("creation_id", infoStickerEditView.i.creationId).a("draft_id", infoStickerEditView.i.draftId).a("enter_from", infoStickerEditView.w ? "edit_post_page" : "video_edit_page").a("prop_id", infoStickerEditView.l.f67198a.f67432c.stickerId);
                str = "shoot_way";
                str3 = infoStickerEditView.i.mShootWay;
            } else if (infoStickerEditView.m == 2) {
                aVar = a.f75468b;
                str2 = "prop_adjust";
                dVar = d.a().a("creation_id", infoStickerEditView.i.creationId).a("draft_id", infoStickerEditView.i.draftId).a("enter_from", infoStickerEditView.w ? "edit_post_page" : "video_edit_page").a("prop_id", infoStickerEditView.l.f67198a.f67432c.stickerId).a("shoot_way", infoStickerEditView.i.mShootWay);
                str = "enter_method";
                str3 = infoStickerEditView.l.f67199b == 0 ? "finger_gesture" : "click_button";
            }
            aVar.a(str2, dVar.a(str, str3).f34114b);
        }
    }
}
