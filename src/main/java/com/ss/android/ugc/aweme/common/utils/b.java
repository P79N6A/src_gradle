package com.ss.android.ugc.aweme.common.utils;

import android.animation.TypeEvaluator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004JH\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00032\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/common/utils/PositionEvaluator;", "Landroid/animation/TypeEvaluator;", "Lkotlin/Pair;", "", "()V", "evaluate", "fraction", "startValue", "endValue", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b implements TypeEvaluator<Pair<? extends Float, ? extends Float>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40309a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f40310b = new b();

    private b() {
    }

    public final /* synthetic */ Object evaluate(float f2, Object obj, Object obj2) {
        Pair pair = (Pair) obj;
        Pair pair2 = (Pair) obj2;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), pair, pair2}, this, f40309a, false, 33539, new Class[]{Float.TYPE, Pair.class, Pair.class}, Pair.class)) {
            return (Pair) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), pair, pair2}, this, f40309a, false, 33539, new Class[]{Float.TYPE, Pair.class, Pair.class}, Pair.class);
        } else if (pair == null || pair2 == null) {
            return new Pair(Float.valueOf(0.0f), Float.valueOf(0.0f));
        } else {
            return new Pair(Float.valueOf(((((Number) pair2.getFirst()).floatValue() - ((Number) pair.getFirst()).floatValue()) * f2) + ((Number) pair.getFirst()).floatValue()), Float.valueOf(((((Number) pair2.getSecond()).floatValue() - ((Number) pair.getSecond()).floatValue()) * f2) + ((Number) pair.getSecond()).floatValue()));
        }
    }
}
