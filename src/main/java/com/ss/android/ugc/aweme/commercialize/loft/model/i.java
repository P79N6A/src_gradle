package com.ss.android.ugc.aweme.commercialize.loft.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/loft/model/LoftUtil;", "", "()V", "THREE_DAY", "", "isAnimationResAvailable", "", "loft", "Lcom/ss/android/ugc/aweme/commercialize/loft/model/Loft;", "isExpired", "isValidLoft", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39273a;

    /* renamed from: b  reason: collision with root package name */
    public static final i f39274b = new i();

    private i() {
    }

    @JvmStatic
    public static final boolean a(@NotNull a aVar) {
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, null, f39273a, true, 31344, new Class[]{a.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar2}, null, f39273a, true, 31344, new Class[]{a.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "loft");
        CharSequence id = aVar.getId();
        if (id == null || id.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && aVar.getAnimationRes() != null) {
            b animationRes = aVar.getAnimationRes();
            Boolean bool = null;
            if (animationRes != null) {
                str = animationRes.getDownloadUrl();
            } else {
                str = null;
            }
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 && aVar.getVideoList() != null) {
                List<j> videoList = aVar.getVideoList();
                if (videoList != null) {
                    Collection collection = videoList;
                    if (collection == null || collection.isEmpty()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    bool = Boolean.valueOf(z3);
                }
                if (bool == null) {
                    Intrinsics.throwNpe();
                }
                if (bool.booleanValue()) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @JvmStatic
    public static final boolean b(@NotNull a aVar) {
        boolean z;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, null, f39273a, true, 31345, new Class[]{a.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar2}, null, f39273a, true, 31345, new Class[]{a.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "loft");
        CharSequence id = aVar.getId();
        if (id == null || id.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || aVar.getEndTime() == null) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis() - 259200000;
        Integer endTime = aVar.getEndTime();
        if (endTime == null) {
            Intrinsics.throwNpe();
        }
        if (currentTimeMillis > ((long) endTime.intValue()) * 1000 || aVar.getStatus() == h.f39271d) {
            return true;
        }
        return false;
    }

    @JvmStatic
    public static final boolean c(@NotNull a aVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, null, f39273a, true, 31346, new Class[]{a.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar2}, null, f39273a, true, 31346, new Class[]{a.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "loft");
        CharSequence id = aVar.getId();
        if (id == null || id.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || aVar.getAnimationRes() == null || !a(aVar)) {
            return false;
        }
        b animationRes = aVar.getAnimationRes();
        if (animationRes == null) {
            Intrinsics.throwNpe();
        }
        CharSequence floatLeftTopUri = animationRes.getFloatLeftTopUri();
        if (floatLeftTopUri == null || floatLeftTopUri.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            CharSequence floatRightTopUri = animationRes.getFloatRightTopUri();
            if (floatRightTopUri == null || floatRightTopUri.length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                CharSequence floatLeftBottomUri = animationRes.getFloatLeftBottomUri();
                if (floatLeftBottomUri == null || floatLeftBottomUri.length() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    CharSequence floatRightBottomUri = animationRes.getFloatRightBottomUri();
                    if (floatRightBottomUri == null || floatRightBottomUri.length() == 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (!z5) {
                        CharSequence backgroundUri = animationRes.getBackgroundUri();
                        if (backgroundUri == null || backgroundUri.length() == 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (!z6) {
                            CharSequence goodsBackgroundUri = animationRes.getGoodsBackgroundUri();
                            if (goodsBackgroundUri == null || goodsBackgroundUri.length() == 0) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (!z7) {
                                CharSequence goodsUri = animationRes.getGoodsUri();
                                if (goodsUri == null || goodsUri.length() == 0) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                if (!z8) {
                                    CharSequence logoLeftUri = animationRes.getLogoLeftUri();
                                    if (logoLeftUri == null || logoLeftUri.length() == 0) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    if (!z9) {
                                        CharSequence logoRightUri = animationRes.getLogoRightUri();
                                        if (logoRightUri == null || logoRightUri.length() == 0) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        if (!z10) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
