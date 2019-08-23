package com.ss.android.ugc.aweme.effect;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43741a;

    public static boolean a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f43741a, true, 38556, new Class[]{String.class}, Boolean.TYPE)) {
            return "trans".equals(str2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f43741a, true, 38556, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    public static ArrayList<EffectModel> a() {
        if (PatchProxy.isSupport(new Object[0], null, f43741a, true, 38543, new Class[0], ArrayList.class)) {
            return (ArrayList) PatchProxy.accessDispatch(new Object[0], null, f43741a, true, 38543, new Class[0], ArrayList.class);
        }
        ArrayList<EffectModel> arrayList = new ArrayList<>();
        arrayList.add(a(a.f61119b.getString(C0906R.string.cjv), 2, PushConstants.PUSH_TYPE_NOTIFY, 2130839436));
        arrayList.add(a(a.f61119b.getString(C0906R.string.cjp), 2, PushConstants.PUSH_TYPE_THROUGH_MESSAGE, 2130839571));
        arrayList.add(a(a.f61119b.getString(C0906R.string.cjq), 2, PushConstants.PUSH_TYPE_UPLOAD_LOG, 2130839569));
        arrayList.add(a(a.f61119b.getString(C0906R.string.cjr), 2, "3", 2130839570));
        return arrayList;
    }

    private static int a(List<String> list) {
        if (PatchProxy.isSupport(new Object[]{list}, null, f43741a, true, 38555, new Class[]{List.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{list}, null, f43741a, true, 38555, new Class[]{List.class}, Integer.TYPE)).intValue();
        } else if (list == null) {
            return 0;
        } else {
            for (String next : list) {
                if (next.contains("duration:")) {
                    return Integer.parseInt(next.substring("duration:".length()));
                }
            }
            return 0;
        }
    }

    public static boolean b(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f43741a, true, 38557, new Class[]{String.class}, Boolean.TYPE)) {
            return "sticker".equals(str2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f43741a, true, 38557, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    public static boolean a(EffectModel effectModel) {
        EffectModel effectModel2 = effectModel;
        if (PatchProxy.isSupport(new Object[]{effectModel2}, null, f43741a, true, 38558, new Class[]{EffectModel.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{effectModel2}, null, f43741a, true, 38558, new Class[]{EffectModel.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            if (Integer.parseInt(effectModel2.key) < 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static EffectModel a(int i, Effect effect, String str) {
        int i2;
        Effect effect2 = effect;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), effect2, str2}, null, f43741a, true, 38552, new Class[]{Integer.TYPE, Effect.class, String.class}, EffectModel.class)) {
            return (EffectModel) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), effect2, str2}, null, f43741a, true, 38552, new Class[]{Integer.TYPE, Effect.class, String.class}, EffectModel.class);
        }
        EffectModel effectModel = new EffectModel();
        effectModel.name = effect2.name;
        effectModel.hint = effect2.hint;
        effectModel.key = effect2.effect_id;
        effectModel.type = 1;
        effectModel.iconUrl = effect2.icon_url.url_list.get(0);
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f43741a, true, 38553, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f43741a, true, 38553, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else {
            int[] a2 = c.a();
            i2 = a2[i % a2.length];
        }
        effectModel.color = i2;
        effectModel.resDir = effect2.unzipPath;
        effectModel.duration = a(effect.getTags());
        effectModel.category = str2;
        return effectModel;
    }

    private static EffectModel a(String str, int i, String str2, int i2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, 2, str4, Integer.valueOf(i2)}, null, f43741a, true, 38547, new Class[]{String.class, Integer.TYPE, String.class, Integer.TYPE}, EffectModel.class)) {
            return (EffectModel) PatchProxy.accessDispatch(new Object[]{str3, 2, str4, Integer.valueOf(i2)}, null, f43741a, true, 38547, new Class[]{String.class, Integer.TYPE, String.class, Integer.TYPE}, EffectModel.class);
        }
        EffectModel effectModel = new EffectModel();
        effectModel.name = str3;
        effectModel.type = 2;
        effectModel.key = str4;
        effectModel.imagePath = i2;
        return effectModel;
    }
}
