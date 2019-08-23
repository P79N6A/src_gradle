package com.bytedance.android.livesdk.sticker;

import android.content.Context;
import com.bytedance.android.live.base.model.f;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.effect.model.FilterModel;
import com.bytedance.android.livesdk.sticker.b.a;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.util.List;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17284a;

    public static String a(String str, a aVar) {
        String str2 = str;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str2, aVar2}, null, f17284a, true, 13364, new Class[]{String.class, a.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, aVar2}, null, f17284a, true, 13364, new Class[]{String.class, a.class}, String.class);
        } else if (!Lists.isEmpty(aVar2.g)) {
            return a(str2, aVar2.g);
        } else {
            return null;
        }
    }

    public static String a(String str, FilterModel filterModel) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, filterModel}, null, f17284a, true, 13365, new Class[]{String.class, FilterModel.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, filterModel}, null, f17284a, true, 13365, new Class[]{String.class, FilterModel.class}, String.class);
        } else if (!Lists.isEmpty(filterModel.getTags())) {
            return a(str2, filterModel.getTags());
        } else {
            return null;
        }
    }

    private static String a(String str, List<String> list) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, list}, null, f17284a, true, 13366, new Class[]{String.class, List.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, list}, null, f17284a, true, 13366, new Class[]{String.class, List.class}, String.class);
        }
        for (String next : list) {
            if (next.startsWith(str2)) {
                String[] split = next.split(":");
                if (split.length == 2) {
                    return split[1];
                }
            }
        }
        return null;
    }

    public static boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f17284a, true, 13353, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f17284a, true, 13353, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (((Integer) LiveSettingKeys.DISABLE_ROOM_STICKER_NEW_BACK.a()).intValue() == 0) {
            z = true;
        }
        return z;
    }

    private static f a(UrlModel urlModel) {
        UrlModel urlModel2 = urlModel;
        if (PatchProxy.isSupport(new Object[]{urlModel2}, null, f17284a, true, 13355, new Class[]{UrlModel.class}, f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[]{urlModel2}, null, f17284a, true, 13355, new Class[]{UrlModel.class}, f.class);
        } else if (urlModel2 == null) {
            return new f();
        } else {
            f fVar = new f();
            fVar.f7710b = urlModel2.uri;
            fVar.f7711c = urlModel2.url_list;
            return fVar;
        }
    }

    public static a a(Effect effect) {
        Effect effect2 = effect;
        if (PatchProxy.isSupport(new Object[]{effect2}, null, f17284a, true, 13358, new Class[]{Effect.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{effect2}, null, f17284a, true, 13358, new Class[]{Effect.class}, a.class);
        }
        a aVar = new a();
        aVar.f17250b = a(effect2.icon_url);
        aVar.f17251c = a(effect2.file_url);
        aVar.f17254f = effect2.types;
        aVar.m = effect2.name;
        aVar.n = effect2.id;
        aVar.f17252d = Long.valueOf(effect2.effect_id).longValue();
        aVar.q = effect2.zipPath;
        aVar.r = effect2.unzipPath;
        aVar.f17254f = effect2.types;
        aVar.v = effect2.type;
        aVar.u = effect2.hint;
        aVar.p = effect2.device_platform;
        aVar.x = effect2.app_version;
        aVar.w = effect2.sdk_version;
        aVar.s = effect2.downloaded;
        aVar.g = effect.getTags();
        aVar.l = effect2.tags_updated_at;
        aVar.k = effect2.effect_id;
        aVar.f17253e = effect2.name;
        aVar.j = effect2;
        return aVar;
    }

    private static UrlModel a(f fVar) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, null, f17284a, true, 13356, new Class[]{f.class}, UrlModel.class)) {
            return (UrlModel) PatchProxy.accessDispatch(new Object[]{fVar2}, null, f17284a, true, 13356, new Class[]{f.class}, UrlModel.class);
        } else if (fVar2 == null) {
            return new UrlModel();
        } else {
            UrlModel urlModel = new UrlModel();
            urlModel.uri = fVar2.f7710b;
            urlModel.url_list = fVar2.f7711c;
            return urlModel;
        }
    }

    public static Effect a(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, null, f17284a, true, 13359, new Class[]{a.class}, Effect.class)) {
            return (Effect) PatchProxy.accessDispatch(new Object[]{aVar2}, null, f17284a, true, 13359, new Class[]{a.class}, Effect.class);
        } else if (aVar2.j != null) {
            return aVar2.j;
        } else {
            Effect effect = new Effect();
            effect.id = aVar.a();
            effect.file_url = a(aVar2.f17251c);
            effect.icon_url = a(aVar2.f17250b);
            effect.zipPath = aVar2.q;
            effect.unzipPath = aVar2.r;
            effect.types = aVar2.f17254f;
            effect.hint = aVar2.u;
            effect.tags = aVar2.g;
            effect.device_platform = aVar2.p;
            effect.app_version = aVar2.x;
            effect.sdk_version = aVar2.w;
            effect.downloaded = aVar2.s;
            effect.effect_id = aVar2.k;
            effect.tags_updated_at = aVar2.l;
            return effect;
        }
    }

    public static String a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f17284a, true, 13367, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context}, null, f17284a, true, 13367, new Class[]{Context.class}, String.class);
        } else if (context == null) {
            return null;
        } else {
            if (com.bytedance.android.live.core.utils.h.a(context) == null) {
                return null;
            }
            String str = r0.getAbsolutePath() + File.separator + "live" + File.separator + "sticker";
            File file = new File(str);
            if (file.exists() || file.mkdirs()) {
                return str;
            }
            return null;
        }
    }
}
