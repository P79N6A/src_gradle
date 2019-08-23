package com.ss.android.ugc.aweme.photomovie;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.port.in.a;

public final /* synthetic */ class s implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59027a;

    /* renamed from: b  reason: collision with root package name */
    private final PhotoMoviePublishFragment f59028b;

    s(PhotoMoviePublishFragment photoMoviePublishFragment) {
        this.f59028b = photoMoviePublishFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f59027a, false, 64036, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f59027a, false, 64036, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        PhotoMoviePublishFragment photoMoviePublishFragment = this.f59028b;
        if (!((Boolean) a.o.c().a()).booleanValue()) {
            a.o.c().a(Boolean.TRUE);
            new a.C0185a(photoMoviePublishFragment.getContext()).a((int) C0906R.string.aij).b((int) C0906R.string.sj).a((int) C0906R.string.b4b, (DialogInterface.OnClickListener) null).a().a();
            return;
        }
        photoMoviePublishFragment.c();
        Intent intent = new Intent(photoMoviePublishFragment.getActivity(), com.ss.android.ugc.aweme.port.in.a.f61121d.a());
        intent.setFlags(335544320);
        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT", true);
        photoMoviePublishFragment.startActivity(intent);
    }
}
