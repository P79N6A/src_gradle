package com.ss.android.ugc.aweme.challenge.ui;

import android.os.Build;
import android.support.v4.text.BidiFormatter;
import android.support.v4.view.ViewCompat;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.utils.ey;
import java.text.Bidi;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35583a;

    public static void a(Challenge challenge, TextView textView, ViewGroup viewGroup, TextView textView2, ImageView imageView, boolean z) {
        boolean z2;
        boolean z3;
        String str;
        String charSequence;
        int i;
        int i2;
        boolean z4;
        int i3;
        int i4;
        int i5;
        int i6;
        TextView textView3 = textView;
        ViewGroup viewGroup2 = viewGroup;
        TextView textView4 = textView2;
        ImageView imageView2 = imageView;
        int i7 = 0;
        if (PatchProxy.isSupport(new Object[]{challenge, textView3, viewGroup2, textView4, imageView2, (byte) 1}, null, f35583a, true, 25996, new Class[]{Challenge.class, TextView.class, ViewGroup.class, TextView.class, ImageView.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{challenge, textView3, viewGroup2, textView4, imageView2, (byte) 1}, null, f35583a, true, 25996, new Class[]{Challenge.class, TextView.class, ViewGroup.class, TextView.class, ImageView.class, Boolean.TYPE}, Void.TYPE);
        } else if (challenge != null) {
            Integer num = (Integer) SharePrefCache.inst().getShowHashTagBg().c();
            if (!a.a() || !(num == null || num.intValue() == 0)) {
                z2 = false;
            } else {
                z2 = true;
            }
            String content = challenge.getChallengeAnnouncement().getContent();
            if (!TextUtils.isEmpty(content)) {
                if (PatchProxy.isSupport(new Object[]{content, textView3}, null, f35583a, true, 25998, new Class[]{String.class, View.class}, Boolean.TYPE)) {
                    z3 = ((Boolean) PatchProxy.accessDispatch(new Object[]{content, textView3}, null, f35583a, true, 25998, new Class[]{String.class, View.class}, Boolean.TYPE)).booleanValue();
                } else {
                    if (ey.a(textView.getContext())) {
                        i6 = -1;
                    } else {
                        i6 = -2;
                    }
                    z3 = new Bidi(content, i6).baseIsLeftToRight();
                }
                if (PatchProxy.isSupport(new Object[]{textView3, viewGroup2, Byte.valueOf(z3 ? (byte) 1 : 0)}, null, f35583a, true, 25999, new Class[]{TextView.class, ViewGroup.class, Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{textView3, viewGroup2, Byte.valueOf(z3)}, null, f35583a, true, 25999, new Class[]{TextView.class, ViewGroup.class, Boolean.TYPE}, Void.TYPE);
                } else {
                    boolean a2 = ey.a(viewGroup.getContext());
                    ViewGroup viewGroup3 = (ViewGroup) textView.getParent();
                    if (z3) {
                        i3 = 0;
                    } else {
                        i3 = 1;
                    }
                    ViewCompat.setLayoutDirection(viewGroup3, i3);
                    if (z3) {
                        i4 = 3;
                    } else {
                        i4 = 5;
                    }
                    textView3.setGravity(i4);
                    if (Build.VERSION.SDK_INT >= 17) {
                        if (z3) {
                            i5 = 3;
                        } else {
                            i5 = 2;
                        }
                        textView3.setTextDirection(i5);
                        viewGroup2.setLayoutDirection(a2 ? 1 : 0);
                    }
                }
                if (PatchProxy.isSupport(new Object[]{content, Byte.valueOf(z3)}, null, f35583a, true, 26000, new Class[]{String.class, Boolean.TYPE}, String.class)) {
                    str = (String) PatchProxy.accessDispatch(new Object[]{content, Byte.valueOf(z3)}, null, f35583a, true, 26000, new Class[]{String.class, Boolean.TYPE}, String.class);
                } else {
                    if (!z3) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    String unicodeWrap = BidiFormatter.getInstance(z4).unicodeWrap(content);
                    if (z3) {
                        str = "‭" + unicodeWrap + 8237;
                    } else {
                        str = unicodeWrap.replaceAll("(?<!^)(#)([a-zA-Z0-9])", "‎$1‎$2");
                    }
                }
                if (!TextUtils.equals(textView.getText(), str)) {
                    if (!TextUtils.isEmpty(textView.getText())) {
                        if (PatchProxy.isSupport(new Object[]{textView3, viewGroup2, textView4, imageView2, Byte.valueOf(z2 ? (byte) 1 : 0)}, null, f35583a, true, 26001, new Class[]{TextView.class, ViewGroup.class, TextView.class, ImageView.class, Boolean.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{textView3, viewGroup2, textView4, imageView2, Byte.valueOf(z2)}, null, f35583a, true, 26001, new Class[]{TextView.class, ViewGroup.class, TextView.class, ImageView.class, Boolean.TYPE}, Void.TYPE);
                        } else {
                            imageView2.setSelected(false);
                            if (textView4 != null) {
                                textView4.setText(o.b(C0906R.string.ac0));
                            }
                            imageView2.setRotation(0.0f);
                            textView.getLayoutParams().height = -2;
                            if (z2) {
                                i2 = (int) UIUtils.dip2Px(imageView.getContext(), 20.0f);
                            } else {
                                i2 = (int) imageView.getResources().getDimension(C0906R.dimen.fy);
                            }
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
                            if (z2) {
                                marginLayoutParams.bottomMargin = i2;
                            } else {
                                marginLayoutParams.topMargin = i2;
                            }
                            viewGroup2.setLayoutParams(marginLayoutParams);
                        }
                    }
                    int i8 = 32;
                    if (z2) {
                        i8 = 64;
                    }
                    int screenWidth = (int) (((float) UIUtils.getScreenWidth(textView.getContext())) - UIUtils.dip2Px(textView.getContext(), (float) i8));
                    SpannableString spannableString = new SpannableString(str);
                    if (textView4 == null) {
                        charSequence = "";
                    } else {
                        charSequence = textView2.getText().toString();
                    }
                    f fVar = new f(textView.getPaint(), screenWidth, true, charSequence, 2);
                    com.ss.android.ugc.aweme.challenge.b bVar = new com.ss.android.ugc.aweme.challenge.b(challenge.getCid(), challenge.getChallengeName(), true);
                    bVar.f35312a = fVar;
                    SpannableString a3 = bVar.a(spannableString);
                    boolean z5 = fVar.f35603c;
                    if (bVar.f35348e) {
                        textView3.setText(a3);
                        textView3.setMovementMethod(r.a());
                    } else {
                        textView3.setText(a3);
                    }
                    if (z5) {
                        DynamicLayout dynamicLayout = new DynamicLayout(spannableString.toString(), textView.getPaint(), screenWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                        int height = dynamicLayout.getHeight();
                        if (!z5 || TextUtils.isEmpty(str)) {
                            i = 8;
                        } else {
                            i = 0;
                        }
                        textView4.setVisibility(i);
                        if (!z5 || TextUtils.isEmpty(str)) {
                            i7 = 8;
                        }
                        imageView2.setVisibility(i7);
                        c cVar = new c(textView, height, dynamicLayout, spannableString, imageView, textView2, viewGroup, z2, a3);
                        textView3.post(cVar);
                        return;
                    }
                    imageView2.setVisibility(8);
                    textView4.setVisibility(8);
                }
            }
        }
    }
}
