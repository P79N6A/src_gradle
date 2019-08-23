package android.support.transition;

import android.graphics.Matrix;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi(21)
public class ViewUtilsApi21 extends ViewUtilsApi19 {
    private static Method sSetAnimationMatrixMethod;
    private static boolean sSetAnimationMatrixMethodFetched;
    private static Method sTransformMatrixToGlobalMethod;
    private static boolean sTransformMatrixToGlobalMethodFetched;
    private static Method sTransformMatrixToLocalMethod;
    private static boolean sTransformMatrixToLocalMethodFetched;

    ViewUtilsApi21() {
    }

    private void fetchSetAnimationMatrix() {
        if (!sSetAnimationMatrixMethodFetched) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setAnimationMatrix", new Class[]{Matrix.class});
                sSetAnimationMatrixMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            sSetAnimationMatrixMethodFetched = true;
        }
    }

    private void fetchTransformMatrixToGlobalMethod() {
        if (!sTransformMatrixToGlobalMethodFetched) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToGlobal", new Class[]{Matrix.class});
                sTransformMatrixToGlobalMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            sTransformMatrixToGlobalMethodFetched = true;
        }
    }

    private void fetchTransformMatrixToLocalMethod() {
        if (!sTransformMatrixToLocalMethodFetched) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToLocal", new Class[]{Matrix.class});
                sTransformMatrixToLocalMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            sTransformMatrixToLocalMethodFetched = true;
        }
    }

    public void setAnimationMatrix(@NonNull View view, Matrix matrix) {
        fetchSetAnimationMatrix();
        if (sSetAnimationMatrixMethod != null) {
            try {
                sSetAnimationMatrixMethod.invoke(view, new Object[]{matrix});
            } catch (InvocationTargetException unused) {
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    public void transformMatrixToGlobal(@NonNull View view, @NonNull Matrix matrix) {
        fetchTransformMatrixToGlobalMethod();
        if (sTransformMatrixToGlobalMethod != null) {
            try {
                sTransformMatrixToGlobalMethod.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    public void transformMatrixToLocal(@NonNull View view, @NonNull Matrix matrix) {
        fetchTransformMatrixToLocalMethod();
        if (sTransformMatrixToLocalMethod != null) {
            try {
                sTransformMatrixToLocalMethod.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }
}
