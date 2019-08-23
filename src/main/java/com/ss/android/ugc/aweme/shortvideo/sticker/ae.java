package com.ss.android.ugc.aweme.shortvideo.sticker;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.sticker.unlock.j;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.model.d;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class ae {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69286a;

    /* renamed from: b  reason: collision with root package name */
    public static Map<String, List<String>> f69287b = new HashMap();

    public static boolean a(String str, @Nullable FaceStickerBean faceStickerBean) {
        String str2 = str;
        FaceStickerBean faceStickerBean2 = faceStickerBean;
        if (!PatchProxy.isSupport(new Object[]{str2, faceStickerBean2}, null, f69286a, true, 78790, new Class[]{String.class, FaceStickerBean.class}, Boolean.TYPE)) {
            return faceStickerBean2 != null && faceStickerBean2 != FaceStickerBean.NONE && Lists.notEmpty(faceStickerBean.getTags()) && faceStickerBean.getTags().contains(str2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2, faceStickerBean2}, null, f69286a, true, 78790, new Class[]{String.class, FaceStickerBean.class}, Boolean.TYPE)).booleanValue();
    }

    public static boolean a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f69286a, true, 78803, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f69286a, true, 78803, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        ArrayList unlockedStickerIds = ((IAVService) ServiceManager.get().getService(IAVService.class)).unLockStickerManagerService().getUnlockedStickerIds();
        if (unlockedStickerIds == null || unlockedStickerIds.size() == 0) {
            return false;
        }
        return unlockedStickerIds.contains(str2);
    }

    public static boolean a(Effect effect) {
        if (effect == null || effect.effect_type != 2) {
            return false;
        }
        return true;
    }

    public static boolean b(Effect effect) {
        if (effect == null || effect.source != 1) {
            return false;
        }
        return true;
    }

    private static boolean o(Effect effect) {
        if (effect == null || effect.effect_type != 0) {
            return false;
        }
        return true;
    }

    public static boolean a(ah ahVar) {
        ah ahVar2 = ahVar;
        if (PatchProxy.isSupport(new Object[]{ahVar2}, null, f69286a, true, 78769, new Class[]{ah.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{ahVar2}, null, f69286a, true, 78769, new Class[]{ah.class}, Boolean.TYPE)).booleanValue();
        } else if (ahVar2 == null || !a(ahVar2.f69295b)) {
            return false;
        } else {
            return true;
        }
    }

    private static int b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f69286a, true, 78782, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, null, f69286a, true, 78782, new Class[]{String.class}, Integer.TYPE)).intValue();
        } else if (TextUtils.isEmpty(str)) {
            return -1;
        } else {
            try {
                return new JSONObject(str2).getInt("lock_type");
            } catch (Exception unused) {
                return -1;
            }
        }
    }

    public static boolean c(@Nullable ah ahVar) {
        ah ahVar2 = ahVar;
        if (PatchProxy.isSupport(new Object[]{ahVar2}, null, f69286a, true, 78772, new Class[]{ah.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{ahVar2}, null, f69286a, true, 78772, new Class[]{ah.class}, Boolean.TYPE)).booleanValue();
        } else if (ahVar2 == null || !c(ahVar2.f69295b)) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean d(@Nullable ah ahVar) {
        ah ahVar2 = ahVar;
        if (PatchProxy.isSupport(new Object[]{ahVar2}, null, f69286a, true, 78795, new Class[]{ah.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{ahVar2}, null, f69286a, true, 78795, new Class[]{ah.class}, Boolean.TYPE)).booleanValue();
        } else if (ahVar2 == null || !p(ahVar2.f69295b)) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean e(@Nullable Effect effect) {
        if (PatchProxy.isSupport(new Object[]{effect}, null, f69286a, true, 78776, new Class[]{Effect.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{effect}, null, f69286a, true, 78776, new Class[]{Effect.class}, Boolean.TYPE)).booleanValue();
        } else if (effect == null || !effect.getTags().contains("text2d")) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean f(@Nullable Effect effect) {
        if (PatchProxy.isSupport(new Object[]{effect}, null, f69286a, true, 78778, new Class[]{Effect.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{effect}, null, f69286a, true, 78778, new Class[]{Effect.class}, Boolean.TYPE)).booleanValue();
        } else if (effect == null || !effect.getTags().contains("strong_beat")) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean g(@Nullable Effect effect) {
        if (PatchProxy.isSupport(new Object[]{effect}, null, f69286a, true, 78780, new Class[]{Effect.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{effect}, null, f69286a, true, 78780, new Class[]{Effect.class}, Boolean.TYPE)).booleanValue();
        } else if (effect == null) {
            return false;
        } else {
            for (String contains : effect.getTags()) {
                if (contains.contains("lock")) {
                    return true;
                }
            }
            return h(effect);
        }
    }

    public static boolean h(@Nullable Effect effect) {
        Effect effect2 = effect;
        if (PatchProxy.isSupport(new Object[]{effect2}, null, f69286a, true, 78781, new Class[]{Effect.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{effect2}, null, f69286a, true, 78781, new Class[]{Effect.class}, Boolean.TYPE)).booleanValue();
        } else if (effect2 == null) {
            return false;
        } else {
            String str = effect2.extra;
            if (str != null && b(str) == 1) {
                return true;
            }
            return false;
        }
    }

    public static boolean i(Effect effect) {
        Effect effect2 = effect;
        if (PatchProxy.isSupport(new Object[]{effect2}, null, f69286a, true, 78783, new Class[]{Effect.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{effect2}, null, f69286a, true, 78783, new Class[]{Effect.class}, Boolean.TYPE)).booleanValue();
        } else if (!g(effect) || h(effect)) {
            return false;
        } else {
            String str = effect2.effect_id;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            for (String equals : ((IAVService) ServiceManager.get().getService(IAVService.class)).unLockStickerManagerService().getUnlockedStickerIds()) {
                if (TextUtils.equals(str, equals)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean j(@Nullable Effect effect) {
        if (PatchProxy.isSupport(new Object[]{effect}, null, f69286a, true, 78784, new Class[]{Effect.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{effect}, null, f69286a, true, 78784, new Class[]{Effect.class}, Boolean.TYPE)).booleanValue();
        } else if (effect == null) {
            return false;
        } else {
            for (String contains : effect.getTags()) {
                if (contains.contains(":1")) {
                    return true;
                }
            }
            return false;
        }
    }

    public static String k(@Nullable Effect effect) {
        if (PatchProxy.isSupport(new Object[]{effect}, null, f69286a, true, 78785, new Class[]{Effect.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{effect}, null, f69286a, true, 78785, new Class[]{Effect.class}, String.class);
        } else if (effect == null) {
            return "default";
        } else {
            for (String next : effect.getTags()) {
                if (next.contains("lock")) {
                    if (next.split(":").length == 3) {
                        return next.split(":")[2];
                    }
                    return "default";
                }
            }
            return "default";
        }
    }

    public static boolean l(@Nullable Effect effect) {
        if (PatchProxy.isSupport(new Object[]{effect}, null, f69286a, true, 78792, new Class[]{Effect.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{effect}, null, f69286a, true, 78792, new Class[]{Effect.class}, Boolean.TYPE)).booleanValue();
        } else if (effect == null || effect.getTags() == null || effect.getTags().isEmpty()) {
            return false;
        } else {
            for (String next : effect.getTags()) {
                if (next != null && next.contains("challenge")) {
                    return true;
                }
            }
            return false;
        }
    }

    public static boolean m(@NonNull Effect effect) {
        if (!PatchProxy.isSupport(new Object[]{effect}, null, f69286a, true, 78793, new Class[]{Effect.class}, Boolean.TYPE)) {
            return effect.getTags().contains("douyin_card");
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{effect}, null, f69286a, true, 78793, new Class[]{Effect.class}, Boolean.TYPE)).booleanValue();
    }

    public static boolean n(Effect effect) {
        Effect effect2 = effect;
        if (PatchProxy.isSupport(new Object[]{effect2}, null, f69286a, true, 78802, new Class[]{Effect.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{effect2}, null, f69286a, true, 78802, new Class[]{Effect.class}, Boolean.TYPE)).booleanValue();
        }
        ArrayList unlockedStickerIds = ((IAVService) ServiceManager.get().getService(IAVService.class)).unLockStickerManagerService().getUnlockedStickerIds();
        if (unlockedStickerIds == null || unlockedStickerIds.size() == 0) {
            return false;
        }
        return unlockedStickerIds.contains(effect2.effect_id);
    }

    private static boolean p(@Nullable Effect effect) {
        if (PatchProxy.isSupport(new Object[]{effect}, null, f69286a, true, 78794, new Class[]{Effect.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{effect}, null, f69286a, true, 78794, new Class[]{Effect.class}, Boolean.TYPE)).booleanValue();
        } else if (effect == null || !effect.getTags().contains("hw_beauty")) {
            return false;
        } else {
            return true;
        }
    }

    public static long b(@Nullable FaceStickerBean faceStickerBean) {
        FaceStickerBean faceStickerBean2 = faceStickerBean;
        if (PatchProxy.isSupport(new Object[]{faceStickerBean2}, null, f69286a, true, 78797, new Class[]{FaceStickerBean.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{faceStickerBean2}, null, f69286a, true, 78797, new Class[]{FaceStickerBean.class}, Long.TYPE)).longValue();
        } else if (faceStickerBean2 == null || faceStickerBean2 == FaceStickerBean.NONE || Lists.isEmpty(faceStickerBean.getTags())) {
            return 0;
        } else {
            for (String next : faceStickerBean.getTags()) {
                if (next != null && next.startsWith("time:")) {
                    try {
                        return Long.parseLong(next.substring(5, next.length()));
                    } catch (Exception unused) {
                    }
                }
            }
            return 0;
        }
    }

    public static boolean c(@Nullable Effect effect) {
        Effect effect2 = effect;
        if (PatchProxy.isSupport(new Object[]{effect2}, null, f69286a, true, 78773, new Class[]{Effect.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{effect2}, null, f69286a, true, 78773, new Class[]{Effect.class}, Boolean.TYPE)).booleanValue();
        } else if (effect2 == null || !effect2.types.contains("Game2DV2")) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean d(@Nullable Effect effect) {
        Effect effect2 = effect;
        if (PatchProxy.isSupport(new Object[]{effect2}, null, f69286a, true, 78775, new Class[]{Effect.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{effect2}, null, f69286a, true, 78775, new Class[]{Effect.class}, Boolean.TYPE)).booleanValue();
        } else if (effect2 == null || !effect2.types.contains("AR")) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean b(ah ahVar) {
        ah ahVar2 = ahVar;
        if (PatchProxy.isSupport(new Object[]{ahVar2}, null, f69286a, true, 78771, new Class[]{ah.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{ahVar2}, null, f69286a, true, 78771, new Class[]{ah.class}, Boolean.TYPE)).booleanValue();
        } else if (ahVar2 == null || !o(ahVar2.f69295b)) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean a(@Nullable FaceStickerBean faceStickerBean) {
        if (PatchProxy.isSupport(new Object[]{faceStickerBean}, null, f69286a, true, 78796, new Class[]{FaceStickerBean.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{faceStickerBean}, null, f69286a, true, 78796, new Class[]{FaceStickerBean.class}, Boolean.TYPE)).booleanValue();
        } else if (faceStickerBean == null || Lists.isEmpty(faceStickerBean.getTags())) {
            return false;
        } else {
            for (String next : faceStickerBean.getTags()) {
                if (next != null && next.contains("bCanUseAmazing")) {
                    return true;
                }
            }
            return false;
        }
    }

    public static boolean b(@Nullable d dVar) {
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, null, f69286a, true, 78787, new Class[]{d.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{dVar2}, null, f69286a, true, 78787, new Class[]{d.class}, Boolean.TYPE)).booleanValue();
        } else if (dVar2 == null) {
            return false;
        } else {
            String str = dVar2.extra;
            if (!TextUtils.isEmpty(str) && !a(dVar2.id) && dVar2.commerceSticker != null && b(str) == 1) {
                return true;
            }
            return false;
        }
    }

    public static boolean a(@Nullable d dVar) {
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, null, f69286a, true, 78786, new Class[]{d.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{dVar2}, null, f69286a, true, 78786, new Class[]{d.class}, Boolean.TYPE)).booleanValue();
        } else if (dVar2 == null) {
            return false;
        } else {
            if ((!Lists.notEmpty(dVar2.mTags) || !dVar2.mTags.contains("lock")) && !b(dVar)) {
                return false;
            }
            return true;
        }
    }

    public static List<String> a(Context context, String str) {
        List<String> list;
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, f69286a, true, 78801, new Class[]{Context.class, String.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{context2, str2}, null, f69286a, true, 78801, new Class[]{Context.class, String.class}, List.class);
        } else if (f69287b.keySet().contains(str2)) {
            return f69287b.get(str2);
        } else {
            j jVar = new j(context2, str2);
            if (PatchProxy.isSupport(new Object[0], jVar, j.f70218a, false, 79865, new Class[0], List.class)) {
                list = (List) PatchProxy.accessDispatch(new Object[0], jVar, j.f70218a, false, 79865, new Class[0], List.class);
            } else {
                list = new ArrayList<>(jVar.f70223f);
            }
            f69287b.put(str2, list);
            String str3 = "本地已经提示过的贴纸列表";
            while (list.iterator().hasNext()) {
                str3 = str3 + r2.next() + " , ";
            }
            return list;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: com.ss.android.ugc.aweme.sticker.model.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r21, com.ss.android.ugc.aweme.sticker.model.d r22, java.lang.String r23) {
        /*
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            r12 = 1
            r4[r12] = r1
            r13 = 2
            r4[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = f69286a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r9[r11] = r5
            java.lang.Class<com.ss.android.ugc.aweme.sticker.model.d> r5 = com.ss.android.ugc.aweme.sticker.model.d.class
            r9[r12] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r13] = r5
            java.lang.Class r10 = java.lang.Boolean.TYPE
            r5 = 0
            r7 = 1
            r8 = 78789(0x133c5, float:1.10407E-40)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x005c
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r0
            r14[r12] = r1
            r14[r13] = r2
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = f69286a
            r17 = 1
            r18 = 78789(0x133c5, float:1.10407E-40)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.sticker.model.d> r1 = com.ss.android.ugc.aweme.sticker.model.d.class
            r0[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r13] = r1
            java.lang.Class r20 = java.lang.Boolean.TYPE
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x005c:
            boolean r3 = b((com.ss.android.ugc.aweme.sticker.model.d) r22)
            if (r3 != 0) goto L_0x0063
            return r11
        L_0x0063:
            java.lang.String r3 = r1.id
            boolean r3 = a((java.lang.String) r3)
            if (r3 == 0) goto L_0x006c
            return r11
        L_0x006c:
            com.ss.android.ugc.aweme.utils.a r3 = com.ss.android.ugc.aweme.utils.a.f75468b
            java.lang.String r4 = "show_toast"
            com.ss.android.ugc.aweme.shortvideo.bj r5 = com.ss.android.ugc.aweme.shortvideo.bj.a()
            java.lang.String r6 = "prop_id"
            java.lang.String r7 = r1.id
            com.ss.android.ugc.aweme.shortvideo.bj r5 = r5.a((java.lang.String) r6, (java.lang.String) r7)
            java.lang.String r6 = "scene_id"
            java.lang.String r7 = "1001"
            com.ss.android.ugc.aweme.shortvideo.bj r5 = r5.a((java.lang.String) r6, (java.lang.String) r7)
            java.lang.String r6 = "enter_from"
            com.ss.android.ugc.aweme.shortvideo.bj r5 = r5.a((java.lang.String) r6, (java.lang.String) r2)
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.f65805b
            r3.a(r4, r5)
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r11] = r1
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f69286a
            r16 = 1
            r17 = 78788(0x133c4, float:1.10406E-40)
            java.lang.Class[] r3 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.sticker.model.d> r4 = com.ss.android.ugc.aweme.sticker.model.d.class
            r3[r11] = r4
            java.lang.Class<com.ss.android.ugc.aweme.sticker.model.b> r19 = com.ss.android.ugc.aweme.sticker.model.b.class
            r18 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            r4 = 0
            if (r3 == 0) goto L_0x00ca
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r11] = r1
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f69286a
            r16 = 1
            r17 = 78788(0x133c4, float:1.10406E-40)
            java.lang.Class[] r3 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.sticker.model.d> r4 = com.ss.android.ugc.aweme.sticker.model.d.class
            r3[r11] = r4
            java.lang.Class<com.ss.android.ugc.aweme.sticker.model.b> r19 = com.ss.android.ugc.aweme.sticker.model.b.class
            r18 = r3
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            r4 = r3
            com.ss.android.ugc.aweme.sticker.model.b r4 = (com.ss.android.ugc.aweme.sticker.model.b) r4
            goto L_0x00d6
        L_0x00ca:
            if (r1 != 0) goto L_0x00cd
            goto L_0x00d6
        L_0x00cd:
            com.ss.android.ugc.aweme.sticker.model.a r3 = r1.commerceSticker
            if (r3 != 0) goto L_0x00d2
            goto L_0x00d6
        L_0x00d2:
            com.ss.android.ugc.aweme.sticker.model.b r4 = r3.getCommerceStickerUnlockInfo()
        L_0x00d6:
            com.bytedance.ies.dmt.ui.b.a$a r3 = new com.bytedance.ies.dmt.ui.b.a$a
            r3.<init>(r0)
            if (r4 != 0) goto L_0x00e0
            java.lang.String r4 = ""
            goto L_0x00e2
        L_0x00e0:
            java.lang.String r4 = r4.desc
        L_0x00e2:
            com.bytedance.ies.dmt.ui.b.a$a r3 = r3.b((java.lang.String) r4)
            r4 = 2131559036(0x7f0d027c, float:1.8743405E38)
            android.content.DialogInterface$OnClickListener r5 = com.ss.android.ugc.aweme.shortvideo.sticker.af.f69289b
            com.bytedance.ies.dmt.ui.b.a$a r3 = r3.b((int) r4, (android.content.DialogInterface.OnClickListener) r5)
            r4 = 2131559614(0x7f0d04be, float:1.8744577E38)
            com.ss.android.ugc.aweme.shortvideo.sticker.ag r5 = new com.ss.android.ugc.aweme.shortvideo.sticker.ag
            r5.<init>(r1, r2, r0)
            com.bytedance.ies.dmt.ui.b.a$a r0 = r3.a((int) r4, (android.content.DialogInterface.OnClickListener) r5)
            com.bytedance.ies.dmt.ui.b.a r0 = r0.a()
            r0.b()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.ae.a(android.content.Context, com.ss.android.ugc.aweme.sticker.model.d, java.lang.String):boolean");
    }
}
