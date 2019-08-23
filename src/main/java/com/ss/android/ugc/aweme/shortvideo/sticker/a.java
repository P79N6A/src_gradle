package com.ss.android.ugc.aweme.shortvideo.sticker;

import a.g;
import a.i;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.sticker.model.e;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69248a;

    /* renamed from: b  reason: collision with root package name */
    private Context f69249b;

    /* renamed from: c  reason: collision with root package name */
    private Effect f69250c;

    /* renamed from: d  reason: collision with root package name */
    private LinearLayout f69251d;

    /* renamed from: e  reason: collision with root package name */
    private RemoteImageView f69252e;

    /* renamed from: f  reason: collision with root package name */
    private DmtTextView f69253f;
    private DmtTextView g;
    private Map<String, com.ss.android.ugc.aweme.sticker.model.a> h = new HashMap();

    private void a(com.ss.android.ugc.aweme.sticker.model.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f69248a, false, 78540, new Class[]{com.ss.android.ugc.aweme.sticker.model.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f69248a, false, 78540, new Class[]{com.ss.android.ugc.aweme.sticker.model.a.class}, Void.TYPE);
        } else if (aVar == null) {
            this.f69251d.setVisibility(8);
        } else {
            com.ss.android.ugc.aweme.utils.a.f75468b.a("show_toast", d.a().a("toast_type", "prop").a("prop_id", aVar.getId()).a("enter_from", "video_shoot_page").f34114b);
            this.f69251d.setVisibility(0);
            UrlModel screenIcon = aVar.getScreenIcon();
            if (screenIcon != null) {
                this.f69252e.setVisibility(0);
                com.ss.android.ugc.aweme.shortvideo.util.a.a(this.f69252e, screenIcon);
            } else {
                this.f69252e.setVisibility(8);
            }
            this.f69253f.setText(aVar.getScreenDesc());
            long expireTime = aVar.getExpireTime();
            String format = new SimpleDateFormat("yyyy.MM.dd", Locale.getDefault()).format(new Date(1000 * expireTime));
            if (expireTime == 0 || TextUtils.isEmpty(format)) {
                this.g.setVisibility(8);
                return;
            }
            this.g.setVisibility(0);
            this.g.setText(this.f69249b.getString(C0906R.string.bkv, new Object[]{format}));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void a(String str, i iVar) throws Exception {
        if (!TextUtils.equals(this.f69250c.effect_id, str)) {
            return null;
        }
        if (iVar.c() || iVar.d()) {
            a(this.h.get(str));
            return null;
        }
        try {
            com.ss.android.ugc.aweme.sticker.model.a aVar = ((e) iVar.e()).mStickers.get(0).commerceSticker;
            this.h.put(str, aVar);
            a(aVar);
        } catch (Exception unused) {
        }
        return null;
    }

    a(@NonNull LinearLayout linearLayout, Context context) {
        this.f69249b = context;
        if (PatchProxy.isSupport(new Object[]{linearLayout}, this, f69248a, false, 78538, new Class[]{LinearLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{linearLayout}, this, f69248a, false, 78538, new Class[]{LinearLayout.class}, Void.TYPE);
            return;
        }
        this.f69251d = linearLayout;
        this.f69252e = (RemoteImageView) linearLayout.findViewById(C0906R.id.xe);
        this.f69253f = (DmtTextView) linearLayout.findViewById(C0906R.id.xd);
        this.g = (DmtTextView) linearLayout.findViewById(C0906R.id.xg);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(@Nullable Effect effect, int i) {
        if (PatchProxy.isSupport(new Object[]{effect, Integer.valueOf(i)}, this, f69248a, false, 78539, new Class[]{Effect.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{effect, Integer.valueOf(i)}, this, f69248a, false, 78539, new Class[]{Effect.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (effect == null || i == 0 || !effect.is_busi) {
            this.f69251d.setVisibility(8);
            return false;
        } else if (this.h.containsKey(effect.effect_id)) {
            a(this.h.get(effect.effect_id));
            return true;
        } else {
            this.f69250c = effect;
            String str = effect.effect_id;
            i.a((Callable<TResult>) new b<TResult>(str)).a((g<TResult, TContinuationResult>) new c<TResult,TContinuationResult>(this, str), i.f1052b);
            return true;
        }
    }
}
