package com.ss.android.ugc.aweme.im.sdk.chat.input.photo;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.a;
import com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoDetailActivity;
import com.ss.android.ugc.aweme.im.sdk.relations.RelationSelectActivity;

public final /* synthetic */ class g implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50842a;

    /* renamed from: b  reason: collision with root package name */
    private final PhotoDetailActivity.AnonymousClass2 f50843b;

    g(PhotoDetailActivity.AnonymousClass2 r1) {
        this.f50843b = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f50842a, false, 50988, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f50842a, false, 50988, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        PhotoDetailActivity.AnonymousClass2 r2 = this.f50843b;
        switch (i) {
            case 0:
                PhotoDetailActivity photoDetailActivity = PhotoDetailActivity.this;
                if (PatchProxy.isSupport(new Object[0], photoDetailActivity, PhotoDetailActivity.f50744a, false, 50978, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], photoDetailActivity, PhotoDetailActivity.f50744a, false, 50978, new Class[0], Void.TYPE);
                    break;
                } else {
                    Bundle bundle = new Bundle();
                    if (photoDetailActivity.h.getMsgType() == 27) {
                        if (photoDetailActivity.l != null) {
                            bundle.putSerializable("share_struct", photoDetailActivity.l.generateShareStruct());
                            bundle.putSerializable("share_content", photoDetailActivity.l);
                        }
                        return;
                    } else if (photoDetailActivity.h.getMsgType() == 2) {
                        if (photoDetailActivity.k != null) {
                            bundle.putSerializable("share_struct", photoDetailActivity.k.generateShareStruct());
                            bundle.putSerializable("share_content", photoDetailActivity.k);
                        }
                        return;
                    }
                    RelationSelectActivity.a((Context) photoDetailActivity, bundle, (a<Boolean>) null);
                    return;
                }
            case 1:
                PhotoDetailActivity.this.c();
                break;
        }
    }
}
