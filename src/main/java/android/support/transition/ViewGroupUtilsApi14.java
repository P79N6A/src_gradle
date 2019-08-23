package android.support.transition;

import android.animation.LayoutTransition;
import android.support.annotation.NonNull;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.C0906R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ViewGroupUtilsApi14 {
    private static Method sCancelMethod;
    private static boolean sCancelMethodFetched;
    private static LayoutTransition sEmptyLayoutTransition;
    private static Field sLayoutSuppressedField;
    private static boolean sLayoutSuppressedFieldFetched;

    private ViewGroupUtilsApi14() {
    }

    private static void cancelLayoutTransition(LayoutTransition layoutTransition) {
        if (!sCancelMethodFetched) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                sCancelMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            sCancelMethodFetched = true;
        }
        if (sCancelMethod != null) {
            try {
                sCancelMethod.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException unused3) {
            }
        }
    }

    static void suppressLayout(@NonNull ViewGroup viewGroup, boolean z) {
        boolean z2 = false;
        if (sEmptyLayoutTransition == null) {
            AnonymousClass1 r0 = new LayoutTransition() {
                public final boolean isChangingLayout() {
                    return true;
                }
            };
            sEmptyLayoutTransition = r0;
            r0.setAnimator(2, null);
            sEmptyLayoutTransition.setAnimator(0, null);
            sEmptyLayoutTransition.setAnimator(1, null);
            sEmptyLayoutTransition.setAnimator(3, null);
            sEmptyLayoutTransition.setAnimator(4, null);
        }
        if (z) {
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null) {
                if (layoutTransition.isRunning()) {
                    cancelLayoutTransition(layoutTransition);
                }
                if (layoutTransition != sEmptyLayoutTransition) {
                    viewGroup.setTag(C0906R.id.d6i, layoutTransition);
                }
            }
            viewGroup.setLayoutTransition(sEmptyLayoutTransition);
            return;
        }
        viewGroup.setLayoutTransition(null);
        if (!sLayoutSuppressedFieldFetched) {
            try {
                Field declaredField = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
                sLayoutSuppressedField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            sLayoutSuppressedFieldFetched = true;
        }
        if (sLayoutSuppressedField != null) {
            try {
                boolean z3 = sLayoutSuppressedField.getBoolean(viewGroup);
                if (z3) {
                    try {
                        sLayoutSuppressedField.setBoolean(viewGroup, false);
                    } catch (IllegalAccessException unused2) {
                    }
                }
                z2 = z3;
            } catch (IllegalAccessException unused3) {
            }
        }
        if (z2) {
            viewGroup.requestLayout();
        }
        LayoutTransition layoutTransition2 = (LayoutTransition) viewGroup.getTag(C0906R.id.d6i);
        if (layoutTransition2 != null) {
            viewGroup.setTag(C0906R.id.d6i, null);
            viewGroup.setLayoutTransition(layoutTransition2);
        }
    }
}
