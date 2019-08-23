package android.support.transition;

import android.view.View;

public abstract class VisibilityPropagation extends TransitionPropagation {
    private static final String[] VISIBILITY_PROPAGATION_VALUES = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    public String[] getPropagationProperties() {
        return VISIBILITY_PROPAGATION_VALUES;
    }

    public int getViewX(TransitionValues transitionValues) {
        return getViewCoordinate(transitionValues, 0);
    }

    public int getViewY(TransitionValues transitionValues) {
        return getViewCoordinate(transitionValues, 1);
    }

    public int getViewVisibility(TransitionValues transitionValues) {
        if (transitionValues == null) {
            return 8;
        }
        Integer num = (Integer) transitionValues.values.get("android:visibilityPropagation:visibility");
        if (num == null) {
            return 8;
        }
        return num.intValue();
    }

    public void captureValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        Integer num = (Integer) transitionValues.values.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        transitionValues.values.put("android:visibilityPropagation:visibility", num);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        iArr[0] = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iArr[0] + (view.getWidth() / 2);
        iArr[1] = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iArr[1] + (view.getHeight() / 2);
        transitionValues.values.put("android:visibilityPropagation:center", iArr);
    }

    private static int getViewCoordinate(TransitionValues transitionValues, int i) {
        if (transitionValues == null) {
            return -1;
        }
        int[] iArr = (int[]) transitionValues.values.get("android:visibilityPropagation:center");
        if (iArr == null) {
            return -1;
        }
        return iArr[i];
    }
}