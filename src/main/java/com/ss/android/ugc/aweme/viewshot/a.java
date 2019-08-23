package com.ss.android.ugc.aweme.viewshot;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.support.annotation.NonNull;
import android.support.v4.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Locale;
import java.util.Stack;
import javax.annotation.Nullable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76541a;

    /* renamed from: b  reason: collision with root package name */
    public static final Matrix f76542b = new Matrix();

    @NonNull
    static String a(@NonNull View view) {
        boolean z;
        String str;
        String str2;
        String str3;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, null, f76541a, true, 89750, new Class[]{View.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{view2}, null, f76541a, true, 89750, new Class[]{View.class}, String.class);
        }
        StringBuilder sb = new StringBuilder(8192);
        sb.append("\n");
        Resources resources = view.getResources();
        Stack stack = new Stack();
        stack.push(Pair.create("", view2));
        while (!stack.empty()) {
            Pair pair = (Pair) stack.pop();
            View view3 = (View) pair.second;
            String str4 = (String) pair.first;
            if (stack.empty() || !str4.equals(((Pair) stack.peek()).first)) {
                z = true;
            } else {
                z = false;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str4);
            if (z) {
                str = "└── ";
            } else {
                str = "├── ";
            }
            sb2.append(str);
            String sb3 = sb2.toString();
            String simpleName = view3.getClass().getSimpleName();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb3);
            sb4.append(simpleName);
            if (PatchProxy.isSupport(new Object[]{resources, view3}, null, f76541a, true, 89751, new Class[]{Resources.class, View.class}, String.class)) {
                str2 = (String) PatchProxy.accessDispatch(new Object[]{resources, view3}, null, f76541a, true, 89751, new Class[]{Resources.class, View.class}, String.class);
            } else {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(" id=");
                sb5.append(view3.getId());
                sb5.append(a(resources, view3));
                int visibility = view3.getVisibility();
                if (visibility == 0) {
                    sb5.append(", V--");
                } else if (visibility == 4) {
                    sb5.append(", -I-");
                } else if (visibility != 8) {
                    sb5.append(", ---");
                } else {
                    sb5.append(", --G");
                }
                if (!view3.getMatrix().equals(f76542b)) {
                    sb5.append(", matrix=");
                    sb5.append(view3.getMatrix().toShortString());
                    if (!(0.0f == view3.getRotation() && 0.0f == view3.getRotationX() && 0.0f == view3.getRotationY())) {
                        sb5.append(", rotate=[");
                        sb5.append(view3.getRotation());
                        sb5.append(",");
                        sb5.append(view3.getRotationX());
                        sb5.append(",");
                        sb5.append(view3.getRotationY());
                        sb5.append("]");
                        if (!(((float) (view3.getWidth() / 2)) == view3.getPivotX() && ((float) (view3.getHeight() / 2)) == view3.getPivotY())) {
                            sb5.append(", pivot=[");
                            sb5.append(view3.getPivotX());
                            sb5.append(",");
                            sb5.append(view3.getPivotY());
                            sb5.append("]");
                        }
                    }
                    if (!(0.0f == view3.getTranslationX() && 0.0f == view3.getTranslationY() && 0.0f == view3.getTranslationZ())) {
                        sb5.append(", translate=[");
                        sb5.append(view3.getTranslationX());
                        sb5.append(",");
                        sb5.append(view3.getTranslationY());
                        sb5.append(",");
                        sb5.append(view3.getTranslationZ());
                        sb5.append("]");
                    }
                    if (!(1.0f == view3.getScaleX() && 1.0f == view3.getScaleY())) {
                        sb5.append(", scale=[");
                        sb5.append(view3.getScaleX());
                        sb5.append(",");
                        sb5.append(view3.getScaleY());
                        sb5.append("]");
                    }
                }
                if (!(view3.getPaddingStart() == 0 && view3.getPaddingTop() == 0 && view3.getPaddingEnd() == 0 && view3.getPaddingBottom() == 0)) {
                    sb5.append(", padding=[");
                    sb5.append(view3.getPaddingStart());
                    sb5.append(",");
                    sb5.append(view3.getPaddingTop());
                    sb5.append(",");
                    sb5.append(view3.getPaddingEnd());
                    sb5.append(",");
                    sb5.append(view3.getPaddingBottom());
                    sb5.append("]");
                }
                ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (!(marginLayoutParams.leftMargin == 0 && marginLayoutParams.topMargin == 0 && marginLayoutParams.rightMargin == 0 && marginLayoutParams.bottomMargin == 0)) {
                        sb5.append(", margin=[");
                        sb5.append(marginLayoutParams.leftMargin);
                        sb5.append(",");
                        sb5.append(marginLayoutParams.topMargin);
                        sb5.append(",");
                        sb5.append(marginLayoutParams.rightMargin);
                        sb5.append(",");
                        sb5.append(marginLayoutParams.bottomMargin);
                        sb5.append("]");
                    }
                }
                sb5.append(", position=[");
                sb5.append(view3.getLeft());
                sb5.append(",");
                sb5.append(view3.getTop());
                sb5.append("]");
                sb5.append(", size=[");
                sb5.append(view3.getWidth());
                sb5.append(",");
                sb5.append(view3.getHeight());
                sb5.append("]");
                if (view3 instanceof TextView) {
                    sb5.append(", text=\"");
                    sb5.append(((TextView) view3).getText());
                    sb5.append("\"");
                }
                str2 = sb5.toString();
            }
            sb4.append(str2);
            sb.append(sb4.toString());
            sb.append("\n");
            if (view3 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view3;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(str4);
                    if (z) {
                        str3 = "    ";
                    } else {
                        str3 = "│   ";
                    }
                    sb6.append(str3);
                    stack.push(Pair.create(sb6.toString(), viewGroup.getChildAt(childCount)));
                }
            }
        }
        return sb.toString();
    }

    @NonNull
    private static String a(@Nullable Resources resources, @NonNull View view) {
        Resources resources2 = resources;
        if (PatchProxy.isSupport(new Object[]{resources2, view}, null, f76541a, true, 89752, new Class[]{Resources.class, View.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{resources2, view}, null, f76541a, true, 89752, new Class[]{Resources.class, View.class}, String.class);
        } else if (resources2 == null) {
            return "";
        } else {
            try {
                return " / " + resources2.getResourceEntryName(view.getId());
            } catch (Throwable unused) {
                return "";
            }
        }
    }

    public static int a(@NonNull String str, @NonNull String str2) {
        int i;
        if (PatchProxy.isSupport(new Object[]{str, str2}, null, f76541a, true, 89748, new Class[]{String.class, String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str, str2}, null, f76541a, true, 89748, new Class[]{String.class, String.class}, Integer.TYPE)).intValue();
        }
        String str3 = str2;
        int i2 = 0;
        while (str3.length() > 0) {
            int indexOf = str3.indexOf("\n");
            if (indexOf < 0) {
                i = 200;
            } else {
                i = indexOf + 1;
            }
            int min = Math.min(str3.length(), Math.min(i, 200));
            String.format(Locale.US, "%02d: %s", new Object[]{Integer.valueOf(i2), str3.substring(0, min)});
            str3 = str3.substring(min);
            i2++;
        }
        return i2;
    }
}
