package com.ss.android.ugc.aweme.shortvideo.model;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;

public class VEEffectSelectOp {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int action;
    public EffectModel mEffectModel;
    public EffectPointModel mPreviousModel;
    public int mTimePosition;
    public final int mType;

    private VEEffectSelectOp(int i) {
        this.mType = i;
    }

    public static VEEffectSelectOp selectTrans(EffectModel effectModel) {
        EffectModel effectModel2 = effectModel;
        if (PatchProxy.isSupport(new Object[]{effectModel2}, null, changeQuickRedirect, true, 77677, new Class[]{EffectModel.class}, VEEffectSelectOp.class)) {
            return (VEEffectSelectOp) PatchProxy.accessDispatch(new Object[]{effectModel2}, null, changeQuickRedirect, true, 77677, new Class[]{EffectModel.class}, VEEffectSelectOp.class);
        }
        VEEffectSelectOp vEEffectSelectOp = new VEEffectSelectOp(2);
        vEEffectSelectOp.mEffectModel = effectModel2;
        return vEEffectSelectOp;
    }

    public static VEEffectSelectOp selectTime(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 77676, new Class[]{Integer.TYPE}, VEEffectSelectOp.class)) {
            return (VEEffectSelectOp) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 77676, new Class[]{Integer.TYPE}, VEEffectSelectOp.class);
        }
        VEEffectSelectOp vEEffectSelectOp = new VEEffectSelectOp(1);
        vEEffectSelectOp.mTimePosition = i;
        return vEEffectSelectOp;
    }

    public static VEEffectSelectOp selectFilter(int i, EffectModel effectModel) {
        EffectModel effectModel2 = effectModel;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), effectModel2}, null, changeQuickRedirect, true, 77678, new Class[]{Integer.TYPE, EffectModel.class}, VEEffectSelectOp.class)) {
            return (VEEffectSelectOp) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), effectModel2}, null, changeQuickRedirect, true, 77678, new Class[]{Integer.TYPE, EffectModel.class}, VEEffectSelectOp.class);
        }
        VEEffectSelectOp vEEffectSelectOp = new VEEffectSelectOp(3);
        vEEffectSelectOp.mEffectModel = effectModel2;
        vEEffectSelectOp.action = i;
        return vEEffectSelectOp;
    }

    public static VEEffectSelectOp selectSticker(EffectModel effectModel, @Nullable EffectPointModel effectPointModel) {
        EffectModel effectModel2 = effectModel;
        EffectPointModel effectPointModel2 = effectPointModel;
        if (PatchProxy.isSupport(new Object[]{effectModel2, effectPointModel2}, null, changeQuickRedirect, true, 77679, new Class[]{EffectModel.class, EffectPointModel.class}, VEEffectSelectOp.class)) {
            return (VEEffectSelectOp) PatchProxy.accessDispatch(new Object[]{effectModel2, effectPointModel2}, null, changeQuickRedirect, true, 77679, new Class[]{EffectModel.class, EffectPointModel.class}, VEEffectSelectOp.class);
        }
        VEEffectSelectOp vEEffectSelectOp = new VEEffectSelectOp(4);
        vEEffectSelectOp.mEffectModel = effectModel2;
        vEEffectSelectOp.mPreviousModel = effectPointModel2;
        return vEEffectSelectOp;
    }
}
