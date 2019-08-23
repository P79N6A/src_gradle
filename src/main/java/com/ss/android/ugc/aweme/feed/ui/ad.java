package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.festival.christmas.view.FeedStickerTagView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.e;
import com.ss.android.ugc.aweme.shortvideo.o.c;
import com.ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity;
import com.ss.android.ugc.aweme.u.aa;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONObject;

public final class ad {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46392a;

    /* renamed from: b  reason: collision with root package name */
    public View f46393b;

    /* renamed from: c  reason: collision with root package name */
    public FeedStickerTagView f46394c;

    /* renamed from: d  reason: collision with root package name */
    public Aweme f46395d;

    /* renamed from: e  reason: collision with root package name */
    private int f46396e;

    /* renamed from: f  reason: collision with root package name */
    private String f46397f;
    private JSONObject g;

    public ad(TextView textView) {
        this.f46393b = textView;
    }

    public ad(FeedStickerTagView feedStickerTagView) {
        this.f46394c = feedStickerTagView;
    }

    public static boolean a(@NonNull Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f46392a, true, 42721, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f46392a, true, 42721, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (!((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().enableStickerDetailsEntrance() || aweme.getStickerEntranceInfo() == null || TextUtils.isEmpty(aweme.getStickerEntranceInfo().name)) {
            return false;
        } else {
            return true;
        }
    }

    public final void b(@NonNull Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f46392a, false, 42731, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f46392a, false, 42731, new Class[]{Aweme.class}, Void.TYPE);
        } else if (this.f46394c != null) {
            d(aweme);
            a(aweme, this.f46394c.getContext());
        }
    }

    public final void c(@NonNull Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f46392a, false, 42732, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f46392a, false, 42732, new Class[]{Aweme.class}, Void.TYPE);
        } else if (this.f46393b != null) {
            d(aweme);
            a(aweme, this.f46393b.getContext());
        }
    }

    private void d(@NonNull Aweme aweme) {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f46392a, false, 42729, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f46392a, false, 42729, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        if (this.g == null) {
            str = "";
        } else {
            str = this.g.optString("request_id");
        }
        LogPbBean logPbBean = new LogPbBean();
        logPbBean.setImprId(str);
        if (aweme.getStickerEntranceInfo() != null) {
            str2 = aweme.getStickerEntranceInfo().id;
        } else {
            str2 = "";
        }
        r.a("enter_prop_detail", new t().a("log_pb", ai.a().a(logPbBean)).a("author_id", aweme.getAuthorUid()).a("group_id", aweme.getAid()).a("impr_type", aa.s(aweme)).a("prop_id", str2).a("enter_from", this.f46397f).a());
    }

    private void a(@NonNull Aweme aweme, Context context) {
        e eVar;
        String str;
        String a2;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{aweme, context2}, this, f46392a, false, 42730, new Class[]{Aweme.class, Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, context2}, this, f46392a, false, 42730, new Class[]{Aweme.class, Context.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(aweme.getStickerIDs())) {
            ArrayList arrayList = new ArrayList();
            for (String str2 : aweme.getStickerIDs().split(",")) {
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            }
            String aid = aweme.getAid();
            if (aweme.getMusic() != null) {
                eVar = new c().apply(com.ss.android.ugc.aweme.music.util.c.f56796b.a(aweme.getMusic()));
            } else {
                eVar = null;
            }
            e eVar2 = eVar;
            Music music = aweme.getMusic();
            if (PatchProxy.isSupport(new Object[0], this, f46392a, false, 42733, new Class[0], String.class)) {
                a2 = (String) PatchProxy.accessDispatch(new Object[0], this, f46392a, false, 42733, new Class[0], String.class);
            } else {
                if (this.g == null) {
                    str = "";
                } else {
                    str = this.g.optString("request_id");
                }
                LogPbBean logPbBean = new LogPbBean();
                logPbBean.setImprId(str);
                a2 = ai.a().a(logPbBean);
            }
            String str3 = a2;
            if (PatchProxy.isSupport(new Object[]{context2, aid, eVar2, music, arrayList, str3}, null, StickerPropDetailActicity.f71661a, true, 81986, new Class[]{Context.class, String.class, e.class, Serializable.class, ArrayList.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2, aid, eVar2, music, arrayList, str3}, null, StickerPropDetailActicity.f71661a, true, 81986, new Class[]{Context.class, String.class, e.class, Serializable.class, ArrayList.class, String.class}, Void.TYPE);
                return;
            }
            Intent a3 = StickerPropDetailActicity.a(context, aid, eVar2, music, arrayList, "reuse");
            a3.putExtra("extra_log_pb", str3);
            context2.startActivity(a3);
        }
    }

    public final void a(int i, String str, JSONObject jSONObject) {
        this.f46396e = i;
        this.f46397f = str;
        this.g = jSONObject;
    }
}
