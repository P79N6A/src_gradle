package com.ss.android.ugc.aweme.sticker.prop.fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import java.util.Map;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71724a;

    /* renamed from: b  reason: collision with root package name */
    private final StickerPropDetailFragment f71725b;

    d(StickerPropDetailFragment stickerPropDetailFragment) {
        this.f71725b = stickerPropDetailFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f71724a, false, 82046, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f71724a, false, 82046, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        StickerPropDetailFragment stickerPropDetailFragment = this.f71725b;
        if (((double) view.getAlpha()) >= 1.0E-6d) {
            r.a("click_prop_maker_entrance", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("prop_id", stickerPropDetailFragment.w.id).a("enter_from", "prop_page").f34114b);
            Context context = stickerPropDetailFragment.getContext();
            String str = (String) SharePrefCache.inst().getStickerArtlistUrl().c();
            if (PatchProxy.isSupport(new Object[]{context, str}, stickerPropDetailFragment, StickerPropDetailFragment.v, false, 82034, new Class[]{Context.class, String.class}, Void.TYPE)) {
                StickerPropDetailFragment stickerPropDetailFragment2 = stickerPropDetailFragment;
                PatchProxy.accessDispatch(new Object[]{context, str}, stickerPropDetailFragment2, StickerPropDetailFragment.v, false, 82034, new Class[]{Context.class, String.class}, Void.TYPE);
                return;
            }
            Intent intent = new Intent(context, CrossPlatformActivity.class);
            intent.setData(Uri.parse(str));
            intent.putExtra("bundle_user_webview_title", true);
            context.startActivity(intent);
        }
    }
}
