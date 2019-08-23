package com.ss.android.ugc.aweme.profile.d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.language.I18nManagerService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.widget.RemarkEditDialog;
import com.ss.android.ugc.aweme.utils.ex;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61479a;

    /* renamed from: b  reason: collision with root package name */
    private static final SimpleDateFormat f61480b;

    public interface a extends RemarkEditDialog.a {
        void b();
    }

    public static boolean a(User user) {
        if (!PatchProxy.isSupport(new Object[]{user}, null, f61479a, true, 70002, new Class[]{User.class}, Boolean.TYPE)) {
            return TextUtils.equals(user.getUid(), d.a().getCurUserId());
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, null, f61479a, true, 70002, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
    }

    static {
        Locale locale;
        if (PatchProxy.isSupport(new Object[0], null, f61479a, true, 70000, new Class[0], Locale.class)) {
            locale = (Locale) PatchProxy.accessDispatch(new Object[0], null, f61479a, true, 70000, new Class[0], Locale.class);
        } else if (com.ss.android.g.a.a()) {
            locale = ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getCountryLocale();
        } else {
            locale = Locale.getDefault();
        }
        f61480b = new SimpleDateFormat("yyyy-MM-dd", locale);
    }

    public static int a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f61479a, true, 70001, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, null, f61479a, true, 70001, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        try {
            Calendar instance = Calendar.getInstance();
            int i = instance.get(1);
            int i2 = instance.get(2);
            int i3 = instance.get(5);
            instance.setTime(f61480b.parse(str2));
            int i4 = instance.get(1);
            int i5 = instance.get(2);
            int i6 = instance.get(5);
            int i7 = i - i4;
            if (i2 < i5 || (i2 == i5 && i3 < i6)) {
                i7--;
            }
            if (i7 < 0) {
                i7 = 0;
            }
            return i7;
        } catch (ParseException unused) {
            return 0;
        }
    }

    private static void a(View view, boolean z) {
        float f2;
        final View view2 = view;
        final boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{view2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f61479a, true, 70006, new Class[]{View.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Byte.valueOf(z)}, null, f61479a, true, 70006, new Class[]{View.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        boolean z3 = !z2;
        if (z2) {
            f2 = 0.0f;
        } else {
            f2 = 1.0f;
        }
        view2.setAlpha(f2);
        view2.setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "alpha", new float[]{z3 ? 1.0f : 0.0f, z2 ? 1.0f : 0.0f});
        ofFloat.setDuration(300);
        ofFloat.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61485a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f61485a, false, 70011, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f61485a, false, 70011, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                super.onAnimationEnd(animator);
                if (!z2) {
                    view2.setVisibility(8);
                }
            }
        });
        ofFloat.start();
    }

    public static void a(User user, int i, View view, String str, boolean z, a aVar) {
        User user2 = user;
        int i2 = i;
        View view2 = view;
        String str2 = str;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{user2, Integer.valueOf(i), view2, str2, Byte.valueOf(z ? (byte) 1 : 0), aVar2}, null, f61479a, true, 70005, new Class[]{User.class, Integer.TYPE, View.class, String.class, Boolean.TYPE, a.class}, Void.TYPE)) {
            Object[] objArr = {user2, Integer.valueOf(i), view2, str2, Byte.valueOf(z), aVar2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f61479a, true, 70005, new Class[]{User.class, Integer.TYPE, View.class, String.class, Boolean.TYPE, a.class}, Void.TYPE);
        } else if (!com.ss.android.g.a.a() && !ex.e(user) && user2 != null && view2 != null) {
            if (i2 != 1 && i2 != 2) {
                if (view.getVisibility() == 0) {
                    a(view2, false);
                }
                if (!TextUtils.isEmpty(user.getRemarkName())) {
                    user2.setRemarkName(null);
                }
                aVar.b();
            } else if (TextUtils.isEmpty(user.getRemarkName())) {
                if (!z || view.getVisibility() == 0) {
                    view2.setAlpha(1.0f);
                    view2.setVisibility(0);
                } else {
                    a(view2, true);
                }
                view2.setOnClickListener(new t(str2, user2, aVar2));
                r.a("edit_remarks", (Map) new com.ss.android.ugc.aweme.app.d.d().a("enter_from", str2).a("action_type", "show").f34114b);
            } else {
                view2.setVisibility(0);
                view2.setOnClickListener(new u(str2, user2, aVar2));
            }
        }
    }

    @SuppressLint({"SetTextI18n"})
    public static void a(User user, int i, TextView textView, View view, String str, boolean z) {
        if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i), textView, view, str, Byte.valueOf(z ? (byte) 1 : 0)}, null, f61479a, true, 70003, new Class[]{User.class, Integer.TYPE, TextView.class, View.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {user, Integer.valueOf(i), textView, view, str, Byte.valueOf(z)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f61479a, true, 70003, new Class[]{User.class, Integer.TYPE, TextView.class, View.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(user, i, textView, view, false, str, z);
    }

    @SuppressLint({"SetTextI18n"})
    private static void a(User user, int i, TextView textView, View view, boolean z, String str, boolean z2) {
        final User user2 = user;
        final TextView textView2 = textView;
        if (PatchProxy.isSupport(new Object[]{user2, Integer.valueOf(i), textView2, view, (byte) 0, str, Byte.valueOf(z2 ? (byte) 1 : 0)}, null, f61479a, true, 70004, new Class[]{User.class, Integer.TYPE, TextView.class, View.class, Boolean.TYPE, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2, Integer.valueOf(i), textView2, view, (byte) 0, str, Byte.valueOf(z2)}, null, f61479a, true, 70004, new Class[]{User.class, Integer.TYPE, TextView.class, View.class, Boolean.TYPE, String.class, Boolean.TYPE}, Void.TYPE);
        } else if (!com.ss.android.g.a.a() && !ex.e(user) && user2 != null && textView2 != null && view != null) {
            a(user, i, view, str, z2, (a) new a(false) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f61481a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f61481a, false, 70010, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f61481a, false, 70010, new Class[0], Void.TYPE);
                    } else if (!TextUtils.isEmpty(user2.getRemarkName())) {
                        textView2.setText(user2.getRemarkName());
                    } else if (false) {
                        TextView textView = textView2;
                        textView.setText("@" + user2.getNickname());
                    } else {
                        textView2.setText(user2.getNickname());
                    }
                }

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f61481a, false, 70009, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f61481a, false, 70009, new Class[0], Void.TYPE);
                    } else if (false) {
                        TextView textView = textView2;
                        textView.setText("@" + user2.getNickname());
                    } else {
                        textView2.setText(user2.getNickname());
                    }
                }
            });
        }
    }
}
