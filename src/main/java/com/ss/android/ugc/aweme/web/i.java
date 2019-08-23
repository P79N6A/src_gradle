package com.ss.android.ugc.aweme.web;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.ProfileShareActivity;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import org.json.JSONObject;

public final class i implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76636a;

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        if (PatchProxy.isSupport(new Object[]{hVar, jSONObject}, this, f76636a, false, 89894, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar, jSONObject}, this, f76636a, false, 89894, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        Activity e2 = p.a().e();
        if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
            e.a(e2, "", "share_single_song");
            return;
        }
        User curUser = com.ss.android.ugc.aweme.account.d.a().getCurUser();
        if (curUser != null && !a.a()) {
            boolean booleanValue = ((Boolean) SharePrefCache.inst().getOriginalMusiciaShareStyle().c()).booleanValue();
            if (PatchProxy.isSupport(new Object[]{e2, Byte.valueOf(booleanValue ? (byte) 1 : 0), "musician_share", curUser}, null, ProfileShareActivity.f64514a, true, 73173, new Class[]{Context.class, Boolean.TYPE, String.class, User.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{e2, Byte.valueOf(booleanValue), "musician_share", curUser}, null, ProfileShareActivity.f64514a, true, 73173, new Class[]{Context.class, Boolean.TYPE, String.class, User.class}, Void.TYPE);
                return;
            }
            Intent intent = new Intent(e2, ProfileShareActivity.class);
            intent.putExtra("show_original_share", booleanValue);
            intent.putExtra(AllStoryActivity.f73306b, curUser);
            intent.putExtra("from", "musician_share");
            e2.startActivity(intent);
        }
    }
}
