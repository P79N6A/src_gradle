package com.ss.android.ugc.aweme.challenge.ui;

import android.annotation.SuppressLint;
import android.os.Build;
import android.support.v4.text.BidiFormatter;
import android.support.v4.view.ViewCompat;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.challenge.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.hotsearch.RankingListActivity;
import com.ss.android.ugc.aweme.hotsearch.d.h;
import com.ss.android.ugc.aweme.music.ui.aa;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ey;
import com.ss.android.ugc.bytex.a.a.a;
import java.text.Bidi;
import java.util.Map;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35681a;

    public static void a(Challenge challenge, TextView textView) {
        Challenge challenge2 = challenge;
        TextView textView2 = textView;
        if (PatchProxy.isSupport(new Object[]{challenge2, textView2}, null, f35681a, true, 26163, new Class[]{Challenge.class, TextView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{challenge2, textView2}, null, f35681a, true, 26163, new Class[]{Challenge.class, TextView.class}, Void.TYPE);
            return;
        }
        User author = challenge.getAuthor();
        if (!challenge.isCommerce() || author == null) {
            textView2.setVisibility(8);
            return;
        }
        textView2.setVisibility(0);
        textView2.setText(author.getNickname());
        textView2.setOnClickListener(new k(author, challenge2));
    }

    @SuppressLint({"RtlHardcoded"})
    public static void a(String str, TextView textView, boolean z) {
        int i;
        SpannableStringBuilder a2;
        boolean z2;
        TextView textView2 = textView;
        int i2 = 3;
        if (PatchProxy.isSupport(new Object[]{str, textView2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f35681a, true, 26161, new Class[]{String.class, TextView.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, textView2, Byte.valueOf(z)}, null, f35681a, true, 26161, new Class[]{String.class, TextView.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append("#");
        spannableStringBuilder.append(String.valueOf(str));
        if (Build.VERSION.SDK_INT >= 17) {
            if (((View) textView.getParent()).getLayoutDirection() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                i2 = 5;
            }
            textView2.setGravity(i2);
        }
        if (z) {
            if (PatchProxy.isSupport(new Object[]{textView2, spannableStringBuilder}, null, f35681a, true, 26162, new Class[]{TextView.class, SpannableStringBuilder.class}, SpannableStringBuilder.class)) {
                a2 = (SpannableStringBuilder) PatchProxy.accessDispatch(new Object[]{textView2, spannableStringBuilder}, null, f35681a, true, 26162, new Class[]{TextView.class, SpannableStringBuilder.class}, SpannableStringBuilder.class);
            } else {
                spannableStringBuilder.append("  ");
                spannableStringBuilder.setSpan(new aa(textView.getContext(), 2130838991), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 18);
                spannableStringBuilder.setSpan(new ClickableSpan() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f35686a;

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f35686a, false, 26173, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f35686a, false, 26173, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        RankingListActivity.a(view.getContext());
                        r.a("hot_search_icon", (Map) d.a().a("account_type", "click").a("enter_from", "challenge").f34114b);
                    }
                }, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 18);
                if (textView.getContext() != null) {
                    i = a.a(textView.getContext().getResources(), 2130838991).getIntrinsicWidth();
                } else {
                    i = 164;
                }
                a2 = h.a(spannableStringBuilder, textView.getPaint(), textView.getMeasuredWidth(), textView.getMaxLines(), 1, i);
            }
            spannableStringBuilder = a2;
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
        }
        textView2.setText(spannableStringBuilder);
    }

    public static void a(Challenge challenge, TextView textView, ViewGroup viewGroup, TextView textView2, ImageView imageView, boolean z) {
        boolean z2;
        boolean z3;
        String str;
        String str2;
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
        if (PatchProxy.isSupport(new Object[]{challenge, textView3, viewGroup2, textView4, imageView2, (byte) 1}, null, f35681a, true, 26159, new Class[]{Challenge.class, TextView.class, ViewGroup.class, TextView.class, ImageView.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{challenge, textView3, viewGroup2, textView4, imageView2, (byte) 1}, null, f35681a, true, 26159, new Class[]{Challenge.class, TextView.class, ViewGroup.class, TextView.class, ImageView.class, Boolean.TYPE}, Void.TYPE);
        } else if (challenge != null) {
            Integer num = (Integer) SharePrefCache.inst().getShowHashTagBg().c();
            if (!com.ss.android.g.a.a() || !(num == null || num.intValue() == 0)) {
                z2 = false;
            } else {
                z2 = true;
            }
            String desc = challenge.getDesc();
            String challengeName = challenge.getChallengeName();
            String cid = challenge.getCid();
            if (!TextUtils.isEmpty(desc)) {
                if (PatchProxy.isSupport(new Object[]{desc, textView3}, null, f35681a, true, 26164, new Class[]{String.class, View.class}, Boolean.TYPE)) {
                    z3 = ((Boolean) PatchProxy.accessDispatch(new Object[]{desc, textView3}, null, f35681a, true, 26164, new Class[]{String.class, View.class}, Boolean.TYPE)).booleanValue();
                } else {
                    if (ey.a(textView.getContext())) {
                        i6 = -1;
                    } else {
                        i6 = -2;
                    }
                    z3 = new Bidi(desc, i6).baseIsLeftToRight();
                }
                if (PatchProxy.isSupport(new Object[]{textView3, viewGroup2, Byte.valueOf(z3 ? (byte) 1 : 0)}, null, f35681a, true, 26165, new Class[]{TextView.class, ViewGroup.class, Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{textView3, viewGroup2, Byte.valueOf(z3)}, null, f35681a, true, 26165, new Class[]{TextView.class, ViewGroup.class, Boolean.TYPE}, Void.TYPE);
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
                if (PatchProxy.isSupport(new Object[]{desc, Byte.valueOf(z3)}, null, f35681a, true, 26166, new Class[]{String.class, Boolean.TYPE}, String.class)) {
                    str = (String) PatchProxy.accessDispatch(new Object[]{desc, Byte.valueOf(z3)}, null, f35681a, true, 26166, new Class[]{String.class, Boolean.TYPE}, String.class);
                } else {
                    if (!z3) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    String unicodeWrap = BidiFormatter.getInstance(z4).unicodeWrap(desc);
                    if (z3) {
                        str = "‭" + unicodeWrap + 8237;
                    } else {
                        str = unicodeWrap.replaceAll("(?<!^)(#)([a-zA-Z0-9])", "‎$1‎$2");
                    }
                }
                if (!TextUtils.equals(textView.getText(), str)) {
                    if (!TextUtils.isEmpty(textView.getText())) {
                        if (PatchProxy.isSupport(new Object[]{textView3, viewGroup2, textView4, imageView2, Byte.valueOf(z2 ? (byte) 1 : 0)}, null, f35681a, true, 26167, new Class[]{TextView.class, ViewGroup.class, TextView.class, ImageView.class, Boolean.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{textView3, viewGroup2, textView4, imageView2, Byte.valueOf(z2)}, null, f35681a, true, 26167, new Class[]{TextView.class, ViewGroup.class, TextView.class, ImageView.class, Boolean.TYPE}, Void.TYPE);
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
                    int i7 = 32;
                    if (z2) {
                        i7 = 64;
                    }
                    int screenWidth = (int) (((float) UIUtils.getScreenWidth(textView.getContext())) - UIUtils.dip2Px(textView.getContext(), (float) i7));
                    SpannableString spannableString = new SpannableString(str);
                    if (textView4 == null) {
                        str2 = "";
                    } else {
                        str2 = textView2.getText().toString();
                    }
                    f fVar = new f(textView.getPaint(), screenWidth, true, str2);
                    b bVar = new b(cid, challengeName, true);
                    bVar.f35312a = fVar;
                    SpannableString a3 = bVar.a(spannableString);
                    boolean z5 = fVar.f35603c;
                    if (bVar.f35348e) {
                        textView3.setText(a3);
                        textView3.setMovementMethod(r.a());
                    } else {
                        textView3.setText(a3);
                    }
                    int i8 = 8;
                    if (z5) {
                        if (!z5 || TextUtils.isEmpty(challenge.getDesc())) {
                            i = 8;
                        } else {
                            i = 0;
                        }
                        textView4.setVisibility(i);
                        if (z5 && !TextUtils.isEmpty(challenge.getDesc())) {
                            i8 = 0;
                        }
                        imageView2.setVisibility(i8);
                        j jVar = new j(textView, spannableString, imageView, textView2, viewGroup, z2, a3);
                        textView3.post(jVar);
                        return;
                    }
                    imageView2.setVisibility(8);
                    textView4.setVisibility(8);
                }
            }
        }
    }
}
