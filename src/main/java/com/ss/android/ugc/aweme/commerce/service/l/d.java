package com.ss.android.ugc.aweme.commerce.service.l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.UIUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commerce.service.l.m;
import com.ss.android.ugc.aweme.commerce.service.models.CommerceUser;
import com.ss.android.ugc.aweme.commerce.service.models.aj;
import com.ss.android.ugc.aweme.commerce.service.models.ak;
import com.ss.android.ugc.aweme.commerce.service.models.am;
import com.ss.android.ugc.aweme.commerce.service.models.c;
import com.ss.android.ugc.aweme.commerce.service.models.f;
import com.ss.android.ugc.aweme.commerce.service.models.h;
import com.ss.android.ugc.aweme.commerce.service.models.j;
import com.ss.android.ugc.aweme.commerce.service.models.k;
import com.ss.android.ugc.aweme.commerce.service.models.r;
import com.ss.android.ugc.aweme.commerce.service.models.y;
import com.ss.android.ugc.aweme.commerce.service.widgets.SnapshotAnimView;
import com.ss.android.ugc.aweme.framework.core.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.taobao.android.dexposed.ClassUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.Nullable;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37991a;

    public static String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f37991a, true, 29971, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f37991a, true, 29971, new Class[]{String.class}, String.class);
        }
        String[] split = str2.split("[.]");
        if (split.length < 2) {
            return str2;
        }
        String str3 = split[1];
        if (TextUtils.equals(str3, "00")) {
            str2 = split[0];
        } else if (str3.endsWith(PushConstants.PUSH_TYPE_NOTIFY)) {
            str2 = split[0] + ClassUtils.PACKAGE_SEPARATOR + str3.charAt(0);
        }
        return str2;
    }

    public static String a(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f37991a, true, 29973, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f37991a, true, 29973, new Class[]{Integer.TYPE}, String.class);
        } else if (i2 % 100 == 0) {
            return String.valueOf(i2 / 100);
        } else {
            if (i2 % 10 == 0) {
                return String.format(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf(((float) i2) / 100.0f)});
            }
            return String.format(Locale.getDefault(), "%.2f", new Object[]{Float.valueOf(((float) i2) / 100.0f)});
        }
    }

    public static void a(Activity activity, View view, Point point, Point point2, View[] viewArr) {
        Activity activity2 = activity;
        View view2 = view;
        Point point3 = point;
        if (PatchProxy.isSupport(new Object[]{activity2, view2, point3, point2, viewArr}, null, f37991a, true, 29976, new Class[]{Activity.class, View.class, Point.class, Point.class, View[].class}, Void.TYPE)) {
            Object[] objArr = {activity2, view2, point3, point2, viewArr};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f37991a, true, 29976, new Class[]{Activity.class, View.class, Point.class, Point.class, View[].class}, Void.TYPE);
            return;
        }
        View findViewById = activity2.findViewById(16908290);
        if (findViewById instanceof FrameLayout) {
            final FrameLayout frameLayout = (FrameLayout) findViewById;
            final int dip2Px = (int) UIUtils.dip2Px(activity2, 20.0f);
            final float dip2Px2 = UIUtils.dip2Px(activity2, 10.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dip2Px, dip2Px);
            int i = dip2Px / 2;
            layoutParams.leftMargin = point3.x - i;
            layoutParams.topMargin = point3.y - i;
            view2.setLayoutParams(layoutParams);
            frameLayout.addView(view2);
            final Point point4 = point;
            final Point point5 = point2;
            final View view3 = view;
            final View[] viewArr2 = viewArr;
            AnonymousClass2 r0 = new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f37992a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f37992a, false, 29986, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f37992a, false, 29986, new Class[0], Void.TYPE);
                        return;
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    if (Build.VERSION.SDK_INT >= 21) {
                        Path path = new Path();
                        path.moveTo((float) (point4.x - (dip2Px / 2)), (float) (point4.y - (dip2Px / 2)));
                        path.quadTo((float) (point4.x - (dip2Px / 2)), (float) (point5.y - (dip2Px / 2)), (float) (point5.x - (dip2Px / 2)), (float) (point5.y - (dip2Px / 2)));
                        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(view3, "X", "Y", path)});
                    } else {
                        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(view3, "X", new float[]{(float) (point4.x - (dip2Px / 2)), (float) (point5.x - (dip2Px / 2))}), ObjectAnimator.ofFloat(view3, "Y", new float[]{(float) (point4.y - (dip2Px / 2)), (float) (point5.y - (dip2Px / 2))})});
                    }
                    float f2 = dip2Px2 / ((float) dip2Px);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view3, "scaleX", new float[]{1.0f, f2});
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view3, "scaleY", new float[]{1.0f, f2});
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(new Animator[]{animatorSet, ofFloat, ofFloat2});
                    animatorSet2.setDuration(500);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view3, "alpha", new float[]{1.0f, 0.0f});
                    ofFloat3.setDuration(270);
                    ArrayList arrayList = new ArrayList();
                    for (View view : viewArr2) {
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "scaleX", new float[]{1.0f, 1.2f});
                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{1.0f, 1.2f});
                        arrayList.add(ofFloat4);
                        arrayList.add(ofFloat5);
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    animatorSet3.playTogether(arrayList);
                    animatorSet3.setDuration(220);
                    ArrayList arrayList2 = new ArrayList();
                    for (View view2 : viewArr2) {
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view2, "scaleX", new float[]{1.2f, 1.0f});
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view2, "scaleY", new float[]{1.2f, 1.0f});
                        arrayList2.add(ofFloat6);
                        arrayList2.add(ofFloat7);
                    }
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    animatorSet4.playTogether(arrayList2);
                    animatorSet4.setDuration(180);
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    animatorSet5.playSequentially(new Animator[]{animatorSet3, animatorSet4});
                    animatorSet5.setStartDelay(20);
                    AnimatorSet animatorSet6 = new AnimatorSet();
                    animatorSet6.playTogether(new Animator[]{ofFloat3, animatorSet5});
                    animatorSet6.setStartDelay(400);
                    AnimatorSet animatorSet7 = new AnimatorSet();
                    animatorSet7.playTogether(new Animator[]{animatorSet2, animatorSet6});
                    animatorSet7.addListener(new AnimatorListenerAdapter() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f37998a;

                        public final void onAnimationEnd(Animator animator) {
                            if (PatchProxy.isSupport(new Object[]{animator}, this, f37998a, false, 29987, new Class[]{Animator.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{animator}, this, f37998a, false, 29987, new Class[]{Animator.class}, Void.TYPE);
                                return;
                            }
                            frameLayout.removeView(view3);
                        }
                    });
                    animatorSet7.start();
                }
            };
            view2.postDelayed(r0, 60);
        }
    }

    public static void a(Activity activity, SnapshotAnimView snapshotAnimView, Rect rect, Rect rect2, View[] viewArr) {
        Activity activity2 = activity;
        SnapshotAnimView snapshotAnimView2 = snapshotAnimView;
        Rect rect3 = rect;
        if (PatchProxy.isSupport(new Object[]{activity2, snapshotAnimView2, rect3, rect2, viewArr}, null, f37991a, true, 29977, new Class[]{Activity.class, SnapshotAnimView.class, Rect.class, Rect.class, View[].class}, Void.TYPE)) {
            Object[] objArr = {activity2, snapshotAnimView2, rect3, rect2, viewArr};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f37991a, true, 29977, new Class[]{Activity.class, SnapshotAnimView.class, Rect.class, Rect.class, View[].class}, Void.TYPE);
            return;
        }
        View findViewById = activity2.findViewById(16908290);
        if (findViewById instanceof FrameLayout) {
            Context applicationContext = activity.getApplicationContext();
            final FrameLayout frameLayout = (FrameLayout) findViewById;
            int i = rect3.left;
            int i2 = rect3.top;
            float dip2Px = UIUtils.dip2Px(applicationContext, 10.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect.width(), rect.height());
            layoutParams.leftMargin = i;
            layoutParams.topMargin = i2;
            snapshotAnimView2.setLayoutParams(layoutParams);
            snapshotAnimView2.f38299c = 0.0f;
            frameLayout.addView(snapshotAnimView2);
            final Rect rect4 = rect2;
            final Rect rect5 = rect;
            final SnapshotAnimView snapshotAnimView3 = snapshotAnimView;
            final float f2 = dip2Px;
            final View[] viewArr2 = viewArr;
            AnonymousClass3 r0 = new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f38000a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f38000a, false, 29988, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f38000a, false, 29988, new Class[0], Void.TYPE);
                        return;
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(snapshotAnimView3, "translationX", new float[]{(float) (rect4.centerX() - rect5.centerX())});
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(snapshotAnimView3, "translationY", new float[]{(float) (rect4.centerY() - rect5.centerY())});
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f38006a;

                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f38006a, false, 29989, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f38006a, false, 29989, new Class[]{ValueAnimator.class}, Void.TYPE);
                                return;
                            }
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            SnapshotAnimView snapshotAnimView = snapshotAnimView3;
                            if (PatchProxy.isSupport(new Object[]{Float.valueOf(floatValue)}, snapshotAnimView, SnapshotAnimView.f38297a, false, 30096, new Class[]{Float.TYPE}, Void.TYPE)) {
                                SnapshotAnimView snapshotAnimView2 = snapshotAnimView;
                                PatchProxy.accessDispatch(new Object[]{Float.valueOf(floatValue)}, snapshotAnimView2, SnapshotAnimView.f38297a, false, 30096, new Class[]{Float.TYPE}, Void.TYPE);
                                return;
                            }
                            int width = snapshotAnimView.getWidth() / 2;
                            int i = width * width;
                            int sqrt = (int) Math.sqrt((double) (i + i));
                            snapshotAnimView.f38299c = ((float) sqrt) - (floatValue * ((float) (sqrt - width)));
                            snapshotAnimView.f38298b.reset();
                            snapshotAnimView.invalidate();
                        }
                    });
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(snapshotAnimView3, "scaleX", new float[]{1.0f, f2 / ((float) snapshotAnimView3.getMeasuredWidth())});
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(snapshotAnimView3, "scaleY", new float[]{1.0f, f2 / ((float) snapshotAnimView3.getMeasuredHeight())});
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat4, ofFloat5, ofFloat3});
                    animatorSet.setDuration(470);
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(snapshotAnimView3, "alpha", new float[]{1.0f, 0.0f});
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ofFloat6);
                    for (View view : viewArr2) {
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, "scaleX", new float[]{1.0f, 1.2f, 1.0f});
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{1.0f, 1.2f, 1.0f});
                        arrayList.add(ofFloat7);
                        arrayList.add(ofFloat8);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(arrayList);
                    animatorSet2.setDuration(250);
                    animatorSet2.setStartDelay(370);
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    animatorSet3.playTogether(new Animator[]{animatorSet, animatorSet2});
                    animatorSet3.addListener(new AnimatorListenerAdapter() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f38008a;

                        public final void onAnimationEnd(Animator animator) {
                            if (PatchProxy.isSupport(new Object[]{animator}, this, f38008a, false, 29990, new Class[]{Animator.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{animator}, this, f38008a, false, 29990, new Class[]{Animator.class}, Void.TYPE);
                                return;
                            }
                            frameLayout.removeView(snapshotAnimView3);
                        }
                    });
                    animatorSet3.start();
                }
            };
            snapshotAnimView2.post(r0);
        }
    }

    public static String a(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, f37991a, true, 29978, new Class[]{Integer.TYPE, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, f37991a, true, 29978, new Class[]{Integer.TYPE, Integer.TYPE}, String.class);
        } else if (i4 <= 0 || i3 <= 0) {
            return "";
        } else {
            if (i4 > i3) {
                return g.a(a.b().f3307e, C0906R.string.z0, a(i), a(i2));
            }
            return g.a(a.b().f3307e, C0906R.string.yz, a(i));
        }
    }

    public static boolean a(h hVar) {
        if (PatchProxy.isSupport(new Object[]{hVar}, null, f37991a, true, 29979, new Class[]{h.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{hVar}, null, f37991a, true, 29979, new Class[]{h.class}, Boolean.TYPE)).booleanValue();
        }
        if (!(hVar == null || hVar.getToutiao() == null)) {
            am virtualPromotion = hVar.getToutiao().getVirtualPromotion();
            if (virtualPromotion != null) {
                return virtualPromotion.isVirtualGoods();
            }
        }
        return false;
    }

    public static void a(ak akVar, y yVar) {
        ak akVar2 = akVar;
        if (PatchProxy.isSupport(new Object[]{akVar2, yVar}, null, f37991a, true, 29982, new Class[]{ak.class, y.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{akVar2, yVar}, null, f37991a, true, 29982, new Class[]{ak.class, y.class}, Void.TYPE);
        } else if (yVar != null) {
            akVar2.f38187a = yVar.getSpecificInfoList();
            akVar2.f38189c = yVar.getSkuList();
            akVar2.f38188b = yVar.getPictureMap();
        }
    }

    public static String a(Context context, int i) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i)}, null, f37991a, true, 29985, new Class[]{Context.class, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i)}, null, f37991a, true, 29985, new Class[]{Context.class, Integer.TYPE}, String.class);
        } else if (i > 999) {
            return g.a(context2, C0906R.string.wh, new Object[0]);
        } else {
            return g.a(context2, C0906R.string.yt, Integer.valueOf(i));
        }
    }

    public static Bitmap a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, null, f37991a, true, 29975, new Class[]{View.class}, Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[]{view2}, null, f37991a, true, 29975, new Class[]{View.class}, Bitmap.class);
        }
        view2.setDrawingCacheEnabled(true);
        view.buildDrawingCache();
        Bitmap createBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view2.setDrawingCacheEnabled(false);
        return createBitmap;
    }

    public static List<j> b(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f37991a, true, 29974, new Class[]{String.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{str2}, null, f37991a, true, 29974, new Class[]{String.class}, List.class);
        }
        try {
            return (List) new Gson().fromJson(str2, new TypeToken<List<j>>() {
            }.getType());
        } catch (Exception unused) {
            return null;
        }
    }

    public static CommerceUser a(User user) {
        String str;
        if (PatchProxy.isSupport(new Object[]{user}, null, f37991a, true, 29970, new Class[]{User.class}, CommerceUser.class)) {
            return (CommerceUser) PatchProxy.accessDispatch(new Object[]{user}, null, f37991a, true, 29970, new Class[]{User.class}, CommerceUser.class);
        } else if (user == null) {
            return null;
        } else {
            CommerceUser commerceUser = new CommerceUser();
            commerceUser.setAvatarMedium(user.getAvatarMedium());
            commerceUser.setHasOrders(user.isHasOrders());
            commerceUser.setNickname(user.getNickname());
            if (TextUtils.isEmpty(user.getUid())) {
                str = "";
            } else {
                str = user.getUid();
            }
            commerceUser.setUid(str);
            commerceUser.setVerifyStatus(user.getVerifyStatus());
            commerceUser.setBindPhone(user.getBindPhone());
            commerceUser.setWithCommerceRights(user.isWithCommerceEntry());
            commerceUser.setWithShopEntry(user.isWithFusionShopEntry());
            commerceUser.setWithNewGoods(user.isWithNewGoods());
            commerceUser.setWithCommerceNewbieTask(user.isWithCommerceNewbieTask());
            commerceUser.setWithItemCommerceEntry(user.isWithItemCommerceEntry());
            commerceUser.setShopMicroApp(user.getShopMicroApp());
            return commerceUser;
        }
    }

    public static boolean b(h hVar) {
        if (PatchProxy.isSupport(new Object[]{hVar}, null, f37991a, true, 29980, new Class[]{h.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{hVar}, null, f37991a, true, 29980, new Class[]{h.class}, Boolean.TYPE)).booleanValue();
        }
        if (!(hVar == null || hVar.getToutiao() == null)) {
            am virtualPromotion = hVar.getToutiao().getVirtualPromotion();
            if (virtualPromotion == null || !virtualPromotion.isVirtualGoods() || !virtualPromotion.getAlreadyBuy()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static ak a(c cVar, String str) {
        boolean z;
        c cVar2 = cVar;
        String str2 = str;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{cVar2, str2}, null, f37991a, true, 29983, new Class[]{c.class, String.class}, ak.class)) {
            return (ak) PatchProxy.accessDispatch(new Object[]{cVar2, str2}, null, f37991a, true, 29983, new Class[]{c.class, String.class}, ak.class);
        } else if (cVar2 == null) {
            return null;
        } else {
            ak akVar = new ak();
            List preferredImages = cVar.preferredImages();
            if (preferredImages != null && !preferredImages.isEmpty()) {
                akVar.l = (UrlModel) preferredImages.get(0);
            }
            akVar.m = cVar.longTitle();
            akVar.n = cVar.getPrice();
            akVar.f38190d = cVar.getPromotionId();
            akVar.f38191e = cVar.getProductId();
            akVar.j = cVar.getCommodityType();
            akVar.C = cVar.getDetailUrl();
            akVar.D = cVar.isTaobaoGood();
            akVar.H = Boolean.valueOf(cVar.hasCoupon());
            if (cVar2 instanceof h) {
                akVar.I = Boolean.valueOf(((h) cVar2).isSelf());
            }
            akVar.J = Integer.valueOf(cVar.getElasticType());
            if (cVar.getElasticType() == 2) {
                z = true;
            } else {
                z = false;
            }
            akVar.t = z;
            if (cVar.isPreSaleGood()) {
                akVar.u = cVar.getToutiao().getPreSale();
            }
            if (cVar.isAppointment()) {
                akVar.v = cVar.getToutiao().getAppointment();
            }
            if (cVar.isSecKillGood()) {
                akVar.w = cVar.getToutiao().getSecKillInfo();
            }
            akVar.P = cVar.getStatus();
            akVar.F = str2;
            if (cVar.getToutiao() != null) {
                akVar.o = cVar.getToutiao().getMinPrice();
                akVar.p = cVar.getToutiao().getMaxPrice();
                if (cVar.getToutiao().getPostType() == 1) {
                    z2 = true;
                }
                akVar.z = z2;
                akVar.A = cVar.getToutiao().getCouponRule();
                akVar.k = cVar.getToutiao().getOriginId();
                akVar.i = cVar.getToutiao().getOriginType();
                akVar.q = cVar.getToutiao().getOrderUrl();
                akVar.r = cVar.getToutiao().getOrderTmaUrl();
                akVar.E = cVar.getToutiao().getImUrl();
                akVar.x = cVar.getToutiao().getCartUrl();
                akVar.y = cVar.getToutiao().getSkuJsonString();
                if (cVar.getToutiao().getReductionInfo() != null) {
                    akVar.B = cVar.getToutiao().getReductionInfo().getFullReduction();
                }
                am virtualPromotion = cVar.getToutiao().getVirtualPromotion();
                if (virtualPromotion != null) {
                    akVar.O = true;
                    akVar.K = Boolean.valueOf(virtualPromotion.isVirtualGoods());
                    akVar.L = Boolean.valueOf(virtualPromotion.getAlreadyBuy());
                }
            }
            return akVar;
        }
    }

    public static ak a(h hVar, String str, String str2) {
        boolean z;
        String str3 = str;
        String str4 = str2;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{hVar, str3, str4}, null, f37991a, true, 29981, new Class[]{h.class, String.class, String.class}, ak.class)) {
            return (ak) PatchProxy.accessDispatch(new Object[]{hVar, str3, str4}, null, f37991a, true, 29981, new Class[]{h.class, String.class, String.class}, ak.class);
        } else if (hVar == null) {
            return null;
        } else {
            ak akVar = new ak();
            List preferredImages = hVar.preferredImages();
            if (preferredImages != null && !preferredImages.isEmpty()) {
                akVar.l = (UrlModel) preferredImages.get(0);
            }
            akVar.m = hVar.longTitle();
            akVar.n = hVar.getPrice();
            akVar.f38190d = hVar.getPromotionId();
            akVar.f38191e = hVar.getProductId();
            akVar.g = hVar.getOriginMediaId();
            akVar.f38192f = hVar.getOriginUserId();
            akVar.h = new k(hVar.getCommodityType(), hVar.getPromotionId(), hVar.isSelf());
            akVar.F = str3;
            akVar.G = str4;
            akVar.I = Boolean.valueOf(hVar.isSelf());
            akVar.H = Boolean.valueOf(hVar.hasCoupon());
            akVar.J = Integer.valueOf(hVar.getElasticType());
            akVar.j = hVar.getCommodityType();
            if (hVar.getElasticType() == 2) {
                z = true;
            } else {
                z = false;
            }
            akVar.t = z;
            if (hVar.isPreSaleGood()) {
                akVar.u = hVar.getToutiao().getPreSale();
            }
            if (hVar.isAppointment()) {
                akVar.v = hVar.getToutiao().getAppointment();
            }
            if (hVar.isSecKillGood()) {
                akVar.w = hVar.getToutiao().getSecKillInfo();
            }
            akVar.P = hVar.getStatus();
            akVar.C = hVar.getDetailUrl();
            akVar.D = hVar.isTaobaoGood();
            r toutiao = hVar.getToutiao();
            if (toutiao != null) {
                akVar.o = toutiao.getMinPrice();
                akVar.p = toutiao.getMaxPrice();
                if (toutiao.getPostType() == 1) {
                    z2 = true;
                }
                akVar.z = z2;
                akVar.A = toutiao.getCouponRule();
                akVar.k = toutiao.getOriginId();
                akVar.i = toutiao.getOriginType();
                akVar.q = toutiao.getOrderUrl();
                akVar.r = toutiao.getOrderTmaUrl();
                akVar.E = toutiao.getImUrl();
                akVar.x = toutiao.getCartUrl();
                if (toutiao.getReductionInfo() != null) {
                    akVar.B = toutiao.getReductionInfo().getFullReduction();
                }
                am virtualPromotion = toutiao.getVirtualPromotion();
                if (virtualPromotion != null) {
                    akVar.O = true;
                    akVar.K = Boolean.valueOf(virtualPromotion.isVirtualGoods());
                    akVar.L = Boolean.valueOf(virtualPromotion.getAlreadyBuy());
                }
            }
            return akVar;
        }
    }

    public static aj a(Context context, f fVar, boolean z, boolean z2) {
        String str;
        Object[] objArr;
        ChangeQuickRedirect changeQuickRedirect;
        boolean z3;
        int i;
        Class<String> cls;
        m.a aVar;
        Class[] clsArr;
        String str2;
        Object[] objArr2;
        ChangeQuickRedirect changeQuickRedirect2;
        boolean z4;
        int i2;
        Class<String> cls2;
        m.a aVar2;
        Class[] clsArr2;
        String str3;
        Object[] objArr3;
        ChangeQuickRedirect changeQuickRedirect3;
        boolean z5;
        int i3;
        Class[] clsArr3;
        Class<String> cls3;
        m.a aVar3;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, fVar, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, null, f37991a, true, 29984, new Class[]{Context.class, f.class, Boolean.TYPE, Boolean.TYPE}, aj.class)) {
            return (aj) PatchProxy.accessDispatch(new Object[]{context2, fVar, Byte.valueOf(z), Byte.valueOf(z2)}, null, f37991a, true, 29984, new Class[]{Context.class, f.class, Boolean.TYPE, Boolean.TYPE}, aj.class);
        }
        aj ajVar = new aj();
        ajVar.f38181a = fVar.getCouponMetaId();
        ajVar.h = fVar.getCouponRange();
        ajVar.k = fVar.getType();
        ajVar.j = z;
        if (fVar.getApplyType() != null) {
            ajVar.g = fVar.getApplyType();
        }
        switch (fVar.getType() % 10) {
            case 1:
                if (fVar.getDiscount() != null) {
                    float floatValue = fVar.getDiscount().floatValue();
                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(floatValue)}, null, m.f38041a, true, 30023, new Class[]{Float.TYPE}, String.class)) {
                        objArr3 = new Object[]{Float.valueOf(floatValue)};
                        aVar3 = null;
                        changeQuickRedirect3 = m.f38041a;
                        z5 = true;
                        i3 = 30023;
                        clsArr3 = new Class[]{Float.TYPE};
                        cls3 = String.class;
                    } else {
                        m.a aVar4 = m.f38042b;
                        if (PatchProxy.isSupport(new Object[]{Float.valueOf(floatValue)}, aVar4, m.a.f38043a, false, 30034, new Class[]{Float.TYPE}, String.class)) {
                            objArr3 = new Object[]{Float.valueOf(floatValue)};
                            changeQuickRedirect3 = m.a.f38043a;
                            z5 = false;
                            i3 = 30034;
                            clsArr3 = new Class[]{Float.TYPE};
                            cls3 = String.class;
                            aVar3 = aVar4;
                        } else {
                            int i4 = (int) floatValue;
                            if (i4 % 10 == 0) {
                                str3 = String.valueOf(i4 / 10);
                            } else {
                                str3 = String.valueOf(((float) i4) / 10.0f);
                            }
                            ajVar.f38185e = str3;
                        }
                    }
                    str3 = (String) PatchProxy.accessDispatch(objArr3, aVar3, changeQuickRedirect3, z5, i3, clsArr3, cls3);
                    ajVar.f38185e = str3;
                }
                if (!(fVar.getDiscountLimit() == null || fVar.getDiscountLimit().intValue() % 100 == 0)) {
                    ajVar.f38186f = g.a(context2, C0906R.string.yk, Integer.valueOf(fVar.getDiscountLimit().intValue() / 100));
                    break;
                }
            case 2:
                ajVar.f38184d = e.a(fVar.getCredit()).replace("¥ ", "");
                ajVar.f38186f = g.a(context2, C0906R.string.yn, new Object[0]);
                break;
            case 3:
                ajVar.f38184d = e.a(fVar.getCredit()).replace("¥ ", "");
                ajVar.f38186f = g.a(context2, C0906R.string.zs, Long.valueOf(fVar.getThreshold() / 100));
                break;
        }
        if (fVar.getPeriodType() != null) {
            switch (fVar.getPeriodType().intValue()) {
                case 1:
                    if (z2) {
                        long startTime = fVar.getStartTime();
                        long expireTime = fVar.getExpireTime();
                        if (!PatchProxy.isSupport(new Object[]{context2, new Long(startTime), new Long(expireTime)}, null, m.f38041a, true, 30022, new Class[]{Context.class, Long.TYPE, Long.TYPE}, String.class)) {
                            m.a aVar5 = m.f38042b;
                            if (!PatchProxy.isSupport(new Object[]{context2, new Long(startTime), new Long(expireTime)}, aVar5, m.a.f38043a, false, 30033, new Class[]{Context.class, Long.TYPE, Long.TYPE}, String.class)) {
                                if (context2 == null || startTime == 0 || expireTime == 0) {
                                    str2 = "";
                                } else {
                                    m.a aVar6 = aVar5;
                                    str2 = g.f38016b.a(context2, C0906R.string.xm, aVar6.c(startTime), aVar6.c(expireTime));
                                }
                                ajVar.i = str2;
                                break;
                            } else {
                                objArr2 = new Object[]{context2, new Long(startTime), new Long(expireTime)};
                                changeQuickRedirect2 = m.a.f38043a;
                                z4 = false;
                                i2 = 30033;
                                cls2 = String.class;
                                aVar2 = aVar5;
                                clsArr2 = new Class[]{Context.class, Long.TYPE, Long.TYPE};
                            }
                        } else {
                            objArr2 = new Object[]{context2, new Long(startTime), new Long(expireTime)};
                            aVar2 = null;
                            changeQuickRedirect2 = m.f38041a;
                            z4 = true;
                            i2 = 30022;
                            cls2 = String.class;
                            clsArr2 = new Class[]{Context.class, Long.TYPE, Long.TYPE};
                        }
                        str2 = (String) PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, z4, i2, clsArr2, cls2);
                        ajVar.i = str2;
                    } else {
                        long startTime2 = fVar.getStartTime();
                        long expireTime2 = fVar.getExpireTime();
                        if (!PatchProxy.isSupport(new Object[]{context2, new Long(startTime2), new Long(expireTime2)}, null, m.f38041a, true, 30020, new Class[]{Context.class, Long.TYPE, Long.TYPE}, String.class)) {
                            m.a aVar7 = m.f38042b;
                            if (!PatchProxy.isSupport(new Object[]{context2, new Long(startTime2), new Long(expireTime2)}, aVar7, m.a.f38043a, false, 30031, new Class[]{Context.class, Long.TYPE, Long.TYPE}, String.class)) {
                                if (context2 == null || startTime2 == 0 || expireTime2 == 0) {
                                    str = "";
                                } else {
                                    m.a aVar8 = aVar7;
                                    str = g.f38016b.a(context2, C0906R.string.xm, aVar8.b(startTime2), aVar8.b(expireTime2));
                                }
                                ajVar.i = str;
                                break;
                            } else {
                                objArr = new Object[]{context2, new Long(startTime2), new Long(expireTime2)};
                                changeQuickRedirect = m.a.f38043a;
                                z3 = false;
                                i = 30031;
                                cls = String.class;
                                aVar = aVar7;
                                clsArr = new Class[]{Context.class, Long.TYPE, Long.TYPE};
                            }
                        } else {
                            objArr = new Object[]{context2, new Long(startTime2), new Long(expireTime2)};
                            aVar = null;
                            changeQuickRedirect = m.f38041a;
                            z3 = true;
                            i = 30020;
                            cls = String.class;
                            clsArr = new Class[]{Context.class, Long.TYPE, Long.TYPE};
                        }
                        str = (String) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, z3, i, clsArr, cls);
                        ajVar.i = str;
                    }
                    break;
                case 2:
                    ajVar.i = g.a(context2, C0906R.string.xq, fVar.getValidPeriod());
                    break;
            }
        }
        if (fVar.getType() == 1 || fVar.getType() == 2 || fVar.getType() == 3) {
            ajVar.f38182b = g.a(context2, C0906R.string.yv, new Object[0]);
            ajVar.f38183c = fVar.getCouponName();
        } else {
            ajVar.f38182b = g.a(context2, C0906R.string.zj, new Object[0]);
            ajVar.f38183c = fVar.getShopName();
        }
        return ajVar;
    }
}
