package com.ss.android.ugc.aweme.profile.d;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class r implements q {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61464a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f61465b = ((int) UIUtils.dip2Px(k.a(), 4.0f));

    /* renamed from: d  reason: collision with root package name */
    private static final int f61466d = ((int) UIUtils.dip2Px(k.a(), 20.0f));

    /* renamed from: e  reason: collision with root package name */
    private static final int f61467e = ((int) UIUtils.dip2Px(k.a(), 5.0f));

    /* renamed from: f  reason: collision with root package name */
    private static final int f61468f = ((int) UIUtils.dip2Px(k.a(), 3.0f));
    private static final int g = ((int) UIUtils.dip2Px(k.a(), 2.0f));

    /* renamed from: c  reason: collision with root package name */
    Drawable f61469c;
    private final Context h;
    private final LinearLayout i;
    private boolean j;
    private View.OnClickListener k;
    private View.OnClickListener l;
    private View.OnClickListener m;
    private View.OnClickListener n;
    private View.OnClickListener o;
    private View.OnClickListener p;
    private int q;
    private int r;

    protected static class a {

        /* renamed from: a  reason: collision with root package name */
        int f61476a;

        /* renamed from: b  reason: collision with root package name */
        String f61477b;

        /* renamed from: c  reason: collision with root package name */
        TextView f61478c;

        a(int i, TextView textView) {
            this.f61476a = i;
            this.f61478c = textView;
        }
    }

    @DrawableRes
    private static int a(int i2) {
        switch (i2) {
            case 1:
                return 2130839500;
            case 2:
                return 2130839587;
            default:
                return 0;
        }
    }

    private static int b(int i2) {
        switch (i2) {
            case 1:
                return C0906R.string.b9u;
            case 2:
                return C0906R.string.aek;
            default:
                return 0;
        }
    }

    private GradientDrawable b() {
        if (PatchProxy.isSupport(new Object[0], this, f61464a, false, 69992, new Class[0], GradientDrawable.class)) {
            return (GradientDrawable) PatchProxy.accessDispatch(new Object[0], this, f61464a, false, 69992, new Class[0], GradientDrawable.class);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius((float) g);
        return gradientDrawable;
    }

    private TextView a() {
        if (PatchProxy.isSupport(new Object[0], this, f61464a, false, 69991, new Class[0], TextView.class)) {
            return (TextView) PatchProxy.accessDispatch(new Object[0], this, f61464a, false, 69991, new Class[0], TextView.class);
        }
        DmtTextView dmtTextView = new DmtTextView(this.i.getContext());
        dmtTextView.setPadding(f61467e, 0, f61467e, 0);
        dmtTextView.setTextSize(1, 12.0f);
        dmtTextView.setTextColor(this.h.getResources().getColor(C0906R.color.zx));
        dmtTextView.setGravity(17);
        dmtTextView.setBackground(b());
        if (Build.VERSION.SDK_INT >= 23) {
            dmtTextView.setForeground(this.f61469c);
        }
        return dmtTextView;
    }

    public final void a(View.OnClickListener onClickListener) {
        this.k = onClickListener;
    }

    public final void b(View.OnClickListener onClickListener) {
        this.l = onClickListener;
    }

    public final void c(View.OnClickListener onClickListener) {
        this.m = onClickListener;
    }

    public final void d(View.OnClickListener onClickListener) {
        this.n = onClickListener;
    }

    public final void e(View.OnClickListener onClickListener) {
        this.p = onClickListener;
    }

    public final void f(View.OnClickListener onClickListener) {
        this.o = onClickListener;
    }

    public r(@NonNull LinearLayout linearLayout) {
        this(linearLayout, Integer.MAX_VALUE);
    }

    private boolean e(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f61464a, false, 69993, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, this, f61464a, false, 69993, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        } else if (user.getShowGenderStrategy() == 0 && user.getGender() == 0) {
            return false;
        } else {
            return true;
        }
    }

    private boolean f(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f61464a, false, 69994, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, this, f61464a, false, 69994, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(user.getBirthday()) || s.a(user.getBirthday()) <= 0 || user.getBirthdayHideLevel() == 1) {
            return false;
        } else {
            return true;
        }
    }

    private boolean g(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f61464a, false, 69995, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, this, f61464a, false, 69995, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        } else if (user.isHideCity() || (TextUtils.isEmpty(user.getIsoCountryCode()) && TextUtils.isEmpty(user.getCity()))) {
            return false;
        } else {
            return true;
        }
    }

    private boolean h(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f61464a, false, 69996, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, this, f61464a, false, 69996, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        } else if (!TextUtils.isEmpty(user.getSchoolName())) {
            return true;
        } else {
            return false;
        }
    }

    private int a(a aVar) {
        a aVar2 = aVar;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f61464a, false, 69998, new Class[]{a.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f61464a, false, 69998, new Class[]{a.class}, Integer.TYPE)).intValue();
        }
        if (!TextUtils.isEmpty(aVar2.f61477b)) {
            int measureText = ((int) aVar2.f61478c.getPaint().measureText(aVar2.f61477b)) + aVar2.f61478c.getPaddingLeft() + aVar2.f61478c.getPaddingRight();
            if (aVar2.f61476a == 1 || aVar2.f61476a == 0) {
                Drawable[] compoundDrawables = aVar2.f61478c.getCompoundDrawables();
                if (compoundDrawables.length > 0 && compoundDrawables[0] != null) {
                    i2 = measureText + compoundDrawables[0].getIntrinsicWidth() + f61468f;
                }
            }
            i2 = measureText;
        }
        return i2;
    }

    private static String c(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, f61464a, true, 69987, new Class[]{User.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{user}, null, f61464a, true, 69987, new Class[]{User.class}, String.class);
        } else if (TextUtils.isEmpty(user.getIsoCountryCode())) {
            return user.getCity();
        } else {
            StringBuilder sb = new StringBuilder();
            if (user.getIsoCountryCode() != null) {
                if (!TextUtils.equals(user.getIsoCountryCode(), "CN")) {
                    sb.append(user.getCountry());
                } else if (!TextUtils.isEmpty(user.getProvince())) {
                    sb.append(user.getProvince());
                    if (!TextUtils.equals(user.getProvince(), "台湾") && !TextUtils.equals(user.getProvince(), user.getCityName())) {
                        sb.append("·");
                        sb.append(user.getCityName());
                    }
                } else {
                    sb.append(user.getCityName());
                    if (!TextUtils.equals(user.getCityName(), "香港") && !TextUtils.equals(user.getCityName(), "澳门")) {
                        if (!TextUtils.isEmpty(user.getCityName())) {
                            sb.append("·");
                        }
                        sb.append(user.getDistrict());
                    }
                }
            }
            return sb.toString();
        }
    }

    public final void a(@Nullable User user) {
        List<a> list;
        LinearLayout.LayoutParams layoutParams;
        if (PatchProxy.isSupport(new Object[]{user}, this, f61464a, false, 69984, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f61464a, false, 69984, new Class[]{User.class}, Void.TYPE);
            return;
        }
        this.i.removeAllViews();
        if (user != null) {
            if (user.isMe()) {
                list = b(user);
            } else {
                list = d(user);
            }
            Collections.sort(list, new Comparator<a>() {
                public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                    return ((a) obj).f61476a - ((a) obj2).f61476a;
                }
            });
            for (int i2 = 0; i2 < list.size(); i2++) {
                a aVar = list.get(i2);
                if (aVar.f61476a == 10) {
                    layoutParams = new LinearLayout.LayoutParams(0, f61466d);
                    layoutParams.weight = 1.0f;
                    aVar.f61478c.setEllipsize(TextUtils.TruncateAt.END);
                    aVar.f61478c.setMaxLines(1);
                } else if (aVar.f61476a == 3) {
                    layoutParams = new LinearLayout.LayoutParams(-2, f61466d);
                } else {
                    layoutParams = new LinearLayout.LayoutParams(-2, f61466d);
                }
                if (i2 > 0) {
                    layoutParams.leftMargin = f61465b;
                }
                if (this.j && Build.VERSION.SDK_INT >= 17) {
                    layoutParams.setMarginStart(f61465b);
                }
                this.i.addView(aVar.f61478c, layoutParams);
            }
            this.i.invalidate();
        }
    }

    private List<a> b(@NonNull User user) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{user}, this, f61464a, false, 69986, new Class[]{User.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{user}, this, f61464a, false, 69986, new Class[]{User.class}, List.class);
        }
        ArrayList arrayList = new ArrayList();
        a aVar = new a(11, a());
        StringBuilder sb = new StringBuilder();
        if (!e(user) || !f(user)) {
            if (e(user) && user.getShowGenderStrategy() != 1) {
                a aVar2 = new a(1, a());
                Resources resources = this.h.getResources();
                user.getGender();
                ((GradientDrawable) aVar2.f61478c.getBackground()).setColor(resources.getColor(C0906R.color.a0k));
                aVar2.f61478c.setCompoundDrawablesWithIntrinsicBounds(a(user.getGender()), 0, 0, 0);
                aVar2.f61478c.setCompoundDrawablePadding((int) UIUtils.dip2Px(this.h, 1.5f));
                aVar2.f61478c.setText(b(user.getGender()));
                aVar2.f61478c.setOnClickListener(this.k);
                arrayList.add(aVar2);
                sb.append(this.h.getString(C0906R.string.brn));
            } else if (f(user)) {
                a aVar3 = new a(2, a());
                Resources resources2 = this.h.getResources();
                user.getGender();
                ((GradientDrawable) aVar3.f61478c.getBackground()).setColor(resources2.getColor(C0906R.color.a0k));
                aVar3.f61478c.setText(this.h.getString(C0906R.string.du, new Object[]{Integer.valueOf(s.a(user.getBirthday()))}));
                aVar3.f61478c.setOnClickListener(this.l);
                arrayList.add(aVar3);
                sb.append(this.h.getString(C0906R.string.brn));
            } else {
                sb.append(this.h.getString(C0906R.string.aio));
                sb.append(this.h.getString(C0906R.string.brn));
            }
            z = true;
        } else {
            a aVar4 = new a(0, a());
            Resources resources3 = this.h.getResources();
            user.getGender();
            ((GradientDrawable) aVar4.f61478c.getBackground()).setColor(resources3.getColor(C0906R.color.a0k));
            if (user.getShowGenderStrategy() != 1) {
                aVar4.f61478c.setCompoundDrawablesWithIntrinsicBounds(a(user.getGender()), 0, 0, 0);
                aVar4.f61478c.setCompoundDrawablePadding((int) UIUtils.dip2Px(this.h, 1.5f));
            }
            aVar4.f61478c.setText(this.h.getString(C0906R.string.du, new Object[]{Integer.valueOf(s.a(user.getBirthday()))}));
            aVar4.f61478c.setOnClickListener(this.k);
            arrayList.add(aVar4);
            z = false;
        }
        if (g(user)) {
            a aVar5 = new a(3, a());
            ((GradientDrawable) aVar5.f61478c.getBackground()).setColor(this.h.getResources().getColor(C0906R.color.a0k));
            String c2 = c(user);
            if (!TextUtils.isEmpty(c2)) {
                aVar5.f61478c.setText(c2);
                aVar5.f61478c.setOnClickListener(this.m);
                arrayList.add(aVar5);
            }
        } else {
            if (z) {
                sb.append("、");
            }
            sb.append(this.h.getString(C0906R.string.b7b));
            z = true;
        }
        if (h(user)) {
            a aVar6 = new a(10, a());
            ((GradientDrawable) aVar6.f61478c.getBackground()).setColor(this.h.getResources().getColor(C0906R.color.a0k));
            aVar6.f61478c.setText(user.getSchoolName());
            aVar6.f61478c.setOnClickListener(this.o);
            arrayList.add(aVar6);
        } else {
            if (z) {
                sb.append("、");
            }
            sb.append(this.h.getString(C0906R.string.ue));
            z = true;
        }
        if (z) {
            ((GradientDrawable) aVar.f61478c.getBackground()).setColor(this.h.getResources().getColor(C0906R.color.a0k));
            aVar.f61478c.setCompoundDrawablePadding(4);
            aVar.f61478c.setText(this.h.getString(C0906R.string.bfs, new Object[]{sb.toString()}));
            aVar.f61478c.setCompoundDrawablesWithIntrinsicBounds(2130838766, 0, 0, 0);
            aVar.f61478c.setTextColor(this.h.getResources().getColor(C0906R.color.zy));
            aVar.f61478c.setOnClickListener(this.p);
            arrayList.add(aVar);
        }
        return arrayList;
    }

    private List<a> d(@NonNull User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f61464a, false, 69988, new Class[]{User.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{user}, this, f61464a, false, 69988, new Class[]{User.class}, List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (e(user) && f(user)) {
            a aVar = new a(0, a());
            Resources resources = this.h.getResources();
            user.getGender();
            ((GradientDrawable) aVar.f61478c.getBackground()).setColor(resources.getColor(C0906R.color.a0k));
            if (user.getShowGenderStrategy() != 1) {
                aVar.f61478c.setCompoundDrawablesWithIntrinsicBounds(a(user.getGender()), 0, 0, 0);
                aVar.f61478c.setCompoundDrawablePadding((int) UIUtils.dip2Px(this.h, 1.5f));
            }
            aVar.f61477b = this.h.getString(C0906R.string.du, new Object[]{Integer.valueOf(s.a(user.getBirthday()))});
            aVar.f61478c.setText(this.h.getString(C0906R.string.du, new Object[]{Integer.valueOf(s.a(user.getBirthday()))}));
            arrayList.add(aVar);
        } else if (e(user) && user.getShowGenderStrategy() != 1) {
            a aVar2 = new a(1, a());
            Resources resources2 = this.h.getResources();
            user.getGender();
            ((GradientDrawable) aVar2.f61478c.getBackground()).setColor(resources2.getColor(C0906R.color.a0k));
            aVar2.f61478c.setCompoundDrawablesWithIntrinsicBounds(a(user.getGender()), 0, 0, 0);
            aVar2.f61478c.setCompoundDrawablePadding((int) UIUtils.dip2Px(this.h, 1.5f));
            aVar2.f61478c.setText(b(user.getGender()));
            aVar2.f61477b = this.h.getString(b(user.getGender()));
            arrayList.add(aVar2);
        } else if (f(user)) {
            a aVar3 = new a(2, a());
            Resources resources3 = this.h.getResources();
            user.getGender();
            ((GradientDrawable) aVar3.f61478c.getBackground()).setColor(resources3.getColor(C0906R.color.a0k));
            aVar3.f61478c.setText(this.h.getString(C0906R.string.du, new Object[]{Integer.valueOf(s.a(user.getBirthday()))}));
            aVar3.f61477b = this.h.getString(C0906R.string.du, new Object[]{Integer.valueOf(s.a(user.getBirthday()))});
            arrayList.add(aVar3);
        }
        if (g(user)) {
            String c2 = c(user);
            if (!TextUtils.isEmpty(c2)) {
                a aVar4 = new a(3, a());
                ((GradientDrawable) aVar4.f61478c.getBackground()).setColor(this.h.getResources().getColor(C0906R.color.a0k));
                aVar4.f61478c.setText(c2);
                aVar4.f61477b = c2;
                arrayList.add(aVar4);
            }
        }
        if (h(user)) {
            a aVar5 = new a(10, a());
            ((GradientDrawable) aVar5.f61478c.getBackground()).setColor(this.h.getResources().getColor(C0906R.color.a0k));
            aVar5.f61478c.setText(user.getSchoolName());
            aVar5.f61478c.setOnClickListener(this.o);
            aVar5.f61477b = user.getSchoolName();
            arrayList.add(aVar5);
        }
        return arrayList;
    }

    public r(@NonNull final LinearLayout linearLayout, final int i2) {
        this.q = Integer.MAX_VALUE;
        this.r = Integer.MAX_VALUE;
        this.h = linearLayout.getContext();
        this.i = linearLayout;
        this.q = i2;
        if (i2 < Integer.MAX_VALUE) {
            this.i.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f61470a;

                public final void onGlobalLayout() {
                    int i = 0;
                    if (PatchProxy.isSupport(new Object[0], this, f61470a, false, 69999, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f61470a, false, 69999, new Class[0], Void.TYPE);
                        return;
                    }
                    int childCount = linearLayout.getChildCount() - 1;
                    int i2 = 0;
                    while (true) {
                        if (i >= linearLayout.getChildCount()) {
                            break;
                        }
                        i2 += ((TextView) linearLayout.getChildAt(i)).getMeasuredWidth();
                        if (i > 0) {
                            i2 += r.f61465b;
                        }
                        if (i2 >= i2) {
                            childCount = i - 1;
                            break;
                        }
                        i++;
                    }
                    while (true) {
                        childCount++;
                        if (childCount < linearLayout.getChildCount()) {
                            linearLayout.removeViewAt(childCount);
                        } else {
                            linearLayout.invalidate();
                            return;
                        }
                    }
                }
            });
            this.j = ey.a(linearLayout.getContext());
        }
        TypedArray obtainStyledAttributes = this.h.obtainStyledAttributes(new int[]{C0906R.attr.a1z});
        this.f61469c = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
    }

    public final void a(@Nullable User user, int i2) {
        List<a> list;
        if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i2)}, this, f61464a, false, 69985, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i2)}, this, f61464a, false, 69985, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.i.removeAllViews();
        this.i.setVisibility(0);
        if (user != null) {
            if (user.isMe()) {
                list = b(user);
            } else {
                list = d(user);
            }
            Collections.sort(list, new Comparator<a>() {
                public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                    return ((a) obj).f61476a - ((a) obj2).f61476a;
                }
            });
            this.q = i2;
            this.r = i2;
            if (list.isEmpty()) {
                this.i.setVisibility(8);
                return;
            }
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                a aVar = list.get(i5);
                if (aVar.f61476a == 3) {
                    i3 = a(aVar);
                } else if (aVar.f61476a == 10) {
                    i4 = a(aVar);
                }
            }
            for (int i6 = 0; i6 < list.size(); i6++) {
                a aVar2 = list.get(i6);
                int a2 = a(aVar2);
                if (a2 <= this.r && (aVar2.f61476a != 3 || i3 + i4 + f61465b <= this.r || i3 >= this.r || i4 >= this.r)) {
                    this.r -= a2 + f61465b;
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, f61466d);
                    if (i6 > 0) {
                        layoutParams.leftMargin = f61465b;
                    }
                    if (this.j && Build.VERSION.SDK_INT >= 17) {
                        layoutParams.setMarginStart(f61465b);
                    }
                    this.i.addView(aVar2.f61478c, layoutParams);
                }
            }
            this.i.invalidate();
        }
    }
}
