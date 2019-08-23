package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.os.Build;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.C0906R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ImageViewUtils {
    private static Method sAnimateTransformMethod;
    private static boolean sAnimateTransformMethodFetched;

    private ImageViewUtils() {
    }

    private static void fetchAnimateTransformMethod() {
        if (!sAnimateTransformMethodFetched) {
            try {
                Method declaredMethod = ImageView.class.getDeclaredMethod("animateTransform", new Class[]{Matrix.class});
                sAnimateTransformMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            sAnimateTransformMethodFetched = true;
        }
    }

    static void startAnimateTransform(ImageView imageView) {
        if (Build.VERSION.SDK_INT < 21) {
            ImageView.ScaleType scaleType = imageView.getScaleType();
            imageView.setTag(C0906R.id.cje, scaleType);
            if (scaleType == ImageView.ScaleType.MATRIX) {
                imageView.setTag(C0906R.id.cj_, imageView.getImageMatrix());
            } else {
                imageView.setScaleType(ImageView.ScaleType.MATRIX);
            }
            imageView.setImageMatrix(MatrixUtils.IDENTITY_MATRIX);
        }
    }

    static void reserveEndAnimateTransform(final ImageView imageView, Animator animator) {
        if (Build.VERSION.SDK_INT < 21) {
            animator.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    ImageView.ScaleType scaleType = (ImageView.ScaleType) imageView.getTag(C0906R.id.cje);
                    imageView.setScaleType(scaleType);
                    imageView.setTag(C0906R.id.cje, null);
                    if (scaleType == ImageView.ScaleType.MATRIX) {
                        imageView.setImageMatrix((Matrix) imageView.getTag(C0906R.id.cj_));
                        imageView.setTag(C0906R.id.cj_, null);
                    }
                    animator.removeListener(this);
                }
            });
        }
    }

    static void animateTransform(ImageView imageView, Matrix matrix) {
        if (Build.VERSION.SDK_INT < 21) {
            imageView.setImageMatrix(matrix);
            return;
        }
        fetchAnimateTransformMethod();
        if (sAnimateTransformMethod != null) {
            try {
                sAnimateTransformMethod.invoke(imageView, new Object[]{matrix});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }
}
