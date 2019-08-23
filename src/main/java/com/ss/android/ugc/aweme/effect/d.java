package com.ss.android.ugc.aweme.effect;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.medialib.model.EffectFileInfo;
import com.ss.android.medialib.model.EffectModel;
import com.ss.android.medialib.player.EffectConfig;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43740a;

    @NonNull
    public static EffectConfig a(@Nullable List<EffectPointModel> list, boolean z, int i) {
        int i2;
        int i3;
        List<EffectPointModel> list2 = list;
        char c2 = 0;
        int i4 = 1;
        if (PatchProxy.isSupport(new Object[]{list2, Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i)}, null, f43740a, true, 38537, new Class[]{List.class, Boolean.TYPE, Integer.TYPE}, EffectConfig.class)) {
            return (EffectConfig) PatchProxy.accessDispatch(new Object[]{list2, Byte.valueOf(z), Integer.valueOf(i)}, null, f43740a, true, 38537, new Class[]{List.class, Boolean.TYPE, Integer.TYPE}, EffectConfig.class);
        }
        if (list2 == null) {
            i2 = 0;
        } else {
            i2 = list.size();
        }
        EffectModel[] effectModelArr = new EffectModel[i2];
        EffectFileInfo[] effectFileInfoArr = new EffectFileInfo[i2];
        int i5 = 0;
        while (i5 < i2) {
            EffectPointModel effectPointModel = list2.get(i5);
            Object[] objArr = new Object[i4];
            objArr[c2] = effectPointModel;
            ChangeQuickRedirect changeQuickRedirect = f43740a;
            Class[] clsArr = new Class[i4];
            clsArr[c2] = EffectPointModel.class;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, 38539, clsArr, EffectPointModel.class)) {
                Object[] objArr2 = new Object[i4];
                objArr2[c2] = effectPointModel;
                ChangeQuickRedirect changeQuickRedirect2 = f43740a;
                Class[] clsArr2 = new Class[i4];
                clsArr2[c2] = EffectPointModel.class;
                effectPointModel = (EffectPointModel) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, 38539, clsArr2, EffectPointModel.class);
            } else {
                String key = effectPointModel.getKey();
                if (PushConstants.PUSH_TYPE_WITHDRAW_NOTIFICATION.equals(key)) {
                    effectPointModel.setKey("7778");
                    effectPointModel.setResDir(com.ss.android.ugc.aweme.effectplatform.d.a() + File.separator + "1affdb4d5f33b7e99a052b66ec941819");
                } else if ("5".equals(key)) {
                    effectPointModel.setKey("7779");
                    effectPointModel.setResDir(com.ss.android.ugc.aweme.effectplatform.d.a() + File.separator + "53d18e52dc34ba68a72a6c8dcb4d7038");
                } else if ("6".equals(key)) {
                    effectPointModel.setKey("7780");
                    effectPointModel.setResDir(com.ss.android.ugc.aweme.effectplatform.d.a() + File.separator + "53899e5b1044d0e96b075d8ac8f99f00");
                } else if ("7".equals(key)) {
                    effectPointModel.setKey("7781");
                    effectPointModel.setResDir(com.ss.android.ugc.aweme.effectplatform.d.a() + File.separator + "a0e184d4d6bf7e32a629d425f8b37f69");
                } else if ("8".equals(key)) {
                    effectPointModel.setKey("7782");
                    effectPointModel.setResDir(com.ss.android.ugc.aweme.effectplatform.d.a() + File.separator + "f5836e3fe6c59ee1da264e768903b713");
                } else if ("9".equals(key)) {
                    effectPointModel.setKey("7783");
                    effectPointModel.setResDir(com.ss.android.ugc.aweme.effectplatform.d.a() + File.separator + "d492b66348b9dde8509ee382f61d89c9");
                }
            }
            try {
                i3 = Integer.parseInt(effectPointModel.getKey());
            } catch (NumberFormatException unused) {
                i3 = 0;
            }
            if (!z || i <= 0) {
                effectModelArr[i5] = new EffectModel(i3, (int) TimeUnit.MILLISECONDS.toMicros((long) effectPointModel.getStartPoint()), (int) TimeUnit.MILLISECONDS.toMicros((long) effectPointModel.getEndPoint()));
            } else {
                effectModelArr[i5] = new EffectModel(i3, (int) TimeUnit.MILLISECONDS.toMicros((long) (i - effectPointModel.getEndPoint())), (int) TimeUnit.MILLISECONDS.toMicros((long) (i - effectPointModel.getStartPoint())));
            }
            effectFileInfoArr[i5] = new EffectFileInfo(i3, effectPointModel.getResDir());
            i5++;
            c2 = 0;
            i4 = 1;
        }
        EffectConfig effectConfig = new EffectConfig();
        effectConfig.setEffectType(1).setEffectFileInfos(effectFileInfoArr).setEffectModels(effectModelArr).setEffectBuildChainType(1);
        return effectConfig;
    }
}
