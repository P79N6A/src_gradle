package android.view;

import android.support.constraint.ConstraintLayout;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public final class a extends View {
    public static void a(View view) {
        view.onFinishInflate();
    }

    public static ViewGroup.MarginLayoutParams a(ViewGroup viewGroup, int i, int i2) {
        if (viewGroup instanceof RelativeLayout) {
            return new RelativeLayout.LayoutParams(i, i2);
        }
        if (viewGroup instanceof LinearLayout) {
            return new LinearLayout.LayoutParams(i, i2);
        }
        if (viewGroup instanceof FrameLayout) {
            return new FrameLayout.LayoutParams(i, i2);
        }
        if (viewGroup instanceof ConstraintLayout) {
            return new ConstraintLayout.LayoutParams(i, i2);
        }
        return new ViewGroup.MarginLayoutParams(i, i2);
    }
}
