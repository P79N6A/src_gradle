package android.support.v7.widget.helper;

import android.graphics.Canvas;
import android.os.Build;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.ss.android.ugc.aweme.C0906R;

public class ItemTouchUIUtilImpl implements ItemTouchUIUtil {
    static final ItemTouchUIUtil INSTANCE = new ItemTouchUIUtilImpl();

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, View view, float f2, float f3, int i, boolean z) {
    }

    public void onSelected(View view) {
    }

    ItemTouchUIUtilImpl() {
    }

    public void clearView(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            Object tag = view.getTag(C0906R.id.ay1);
            if (tag != null && (tag instanceof Float)) {
                ViewCompat.setElevation(view, ((Float) tag).floatValue());
            }
            view.setTag(C0906R.id.ay1, null);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    private static float findMaxElevation(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f2 = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != view) {
                float elevation = ViewCompat.getElevation(childAt);
                if (elevation > f2) {
                    f2 = elevation;
                }
            }
        }
        return f2;
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, View view, float f2, float f3, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 21 && z && view.getTag(C0906R.id.ay1) == null) {
            Float valueOf = Float.valueOf(ViewCompat.getElevation(view));
            ViewCompat.setElevation(view, findMaxElevation(recyclerView, view) + 1.0f);
            view.setTag(C0906R.id.ay1, valueOf);
        }
        view.setTranslationX(f2);
        view.setTranslationY(f3);
    }
}
