package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commercialize.feed.e;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.z;
import com.ss.android.ugc.aweme.music.util.c;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.u.n;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.ex;
import com.ss.android.ugc.aweme.utils.u;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class f extends e {
    public static ChangeQuickRedirect l;
    protected e m;
    protected View.OnClickListener n = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46665a;

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            if (PatchProxy.isSupport(new Object[]{view}, this, f46665a, false, 42458, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f46665a, false, 42458, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (a.a()) {
                if (f.this.f3210b.getMusic() != null) {
                    str3 = String.valueOf(f.this.f3210b.getMusic().getId());
                } else {
                    str3 = "";
                }
                r.a("homepage_hot_click_cover", (Map) d.a().a("music_id", str3).a("author_id", f.this.f3210b.getAuthorUid()).a("group_id", f.this.f3210b.getAid()).f34114b);
            }
            if (!ex.b()) {
                if (f.this.c()) {
                    if (!f.this.f() && f.this.m != null) {
                        f.this.m.f();
                    }
                } else if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                    if (u.f75965b.a(f.this.f3210b)) {
                        com.bytedance.ies.dmt.ui.d.a.b(f.this.h, (int) C0906R.string.du6).a();
                    } else if (f.this.f3210b.isCanPlay() || !com.ss.android.ugc.aweme.music.util.d.a(f.this.f3210b)) {
                        if (f.this.f3210b.getMusic() != null && f.this.m != null && f.this.m.d() && !f.this.f3210b.getMusic().isAuthorDeleted()) {
                            f.this.m.f();
                            if (f.this.f3210b.getMusic() == null || com.ss.android.ugc.aweme.music.util.d.a(c.f56796b.a(f.this.f3210b.getMusic()), f.this.h, true)) {
                                h.a().a((Activity) f.this.h, j.a("aweme://music/detail/" + f.this.f3210b.getMusic().getMid()).a("aweme_id", f.this.f3210b.getAid()).a("extra_music_from", f.this.f3211c).a("sticker_id", f.this.f3210b.getStickerIDs()).a());
                                if (f.this.f3210b.getMusic() == null) {
                                    str = "";
                                } else {
                                    str = String.valueOf(f.this.f3210b.getMusic().getMid());
                                }
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("music_id", str);
                                    jSONObject.put("enter_method", "click_cover");
                                    jSONObject.put("group_id", f.this.f3210b.getAid());
                                    if (f.this.f3210b.isImage()) {
                                        str2 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                                    } else {
                                        str2 = PushConstants.PUSH_TYPE_NOTIFY;
                                    }
                                    jSONObject.put("is_photo", str2);
                                    jSONObject.put("request_id", aa.a(f.this.f3210b, f.this.f3214f));
                                    if (!TextUtils.isEmpty(aa.e(f.this.f3210b))) {
                                        jSONObject.put("poi_id", aa.e(f.this.f3210b));
                                    }
                                    if (aa.c(f.this.f3211c)) {
                                        jSONObject.put("poi_type", aa.h(f.this.f3210b));
                                        jSONObject.put("poi_channel", aa.b());
                                        jSONObject.put("city_info", aa.a());
                                        jSONObject.put("distance_info", aa.i(f.this.f3210b));
                                    }
                                } catch (JSONException unused) {
                                }
                                if (f.this.g != null) {
                                    f.this.g.a("feed_internal_event", (Object) new ar(35, f.this.f3210b));
                                }
                                r.onEvent(MobClick.obtain().setEventName("song_cover").setLabelName(f.this.f3211c).setValue(f.this.f3210b.getAid()).setExtValueString(str).setJsonObject(jSONObject));
                                n f2 = ((n) ((n) new n().f(f.this.f3210b).a(f.this.h)).b(f.this.f3211c).a("click_cover")).c(f.this.f3210b.getAid()).f(str);
                                f2.t = (String) f.this.g.b("playlist_type", "");
                                f2.v = (String) f.this.g.b("playlist_id", "");
                                f2.u = (String) f.this.g.b("playlist_id_key", "");
                                f2.g(aa.a(f.this.f3210b, f.this.f3214f)).e();
                                z.a(z.c.MUSICAL);
                            } else {
                                return;
                            }
                        }
                        bg.a(new com.ss.android.ugc.aweme.main.a.a());
                    } else if (f.this.f3210b.isImage()) {
                        com.bytedance.ies.dmt.ui.d.a.b(f.this.h, (int) C0906R.string.b0y).a();
                    } else {
                        com.bytedance.ies.dmt.ui.d.a.b(f.this.h, (int) C0906R.string.drx).a();
                    }
                }
            }
        }
    };

    public void a(View view) {
    }

    public void a(DataCenter dataCenter) {
    }

    public final void b() {
    }

    public final boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 42457, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, l, false, 42457, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (super.d() || (a.a() && this.f3210b != null && this.f3210b.isWithPromotionalMusic())) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean f() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 42456, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, l, false, 42456, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (a.a() && this.f3210b.isAd() && this.f3210b.isWithPromotionalMusic()) {
            return TextUtils.equals(this.f3211c, "homepage_hot");
        } else {
            return false;
        }
    }

    public f(View view) {
        super(view);
    }

    public final void b(VideoItemParams videoItemParams) {
        VideoItemParams videoItemParams2 = videoItemParams;
        if (PatchProxy.isSupport(new Object[]{videoItemParams2}, this, l, false, 42455, new Class[]{VideoItemParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{videoItemParams2}, this, l, false, 42455, new Class[]{VideoItemParams.class}, Void.TYPE);
            return;
        }
        super.b(videoItemParams);
        if (videoItemParams2 != null) {
            this.m = videoItemParams2.mAdViewController;
        }
    }
}
