package android.support.design.animation;

import android.util.Property;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.C0906R;

public class ChildrenAlphaProperty extends Property<ViewGroup, Float> {
    public static final Property<ViewGroup, Float> CHILDREN_ALPHA = new ChildrenAlphaProperty("childrenAlpha");

    private ChildrenAlphaProperty(String str) {
        super(Float.class, str);
    }

    public Float get(ViewGroup viewGroup) {
        Float f2 = (Float) viewGroup.getTag(C0906R.id.bny);
        if (f2 != null) {
            return f2;
        }
        return Float.valueOf(1.0f);
    }

    public void set(ViewGroup viewGroup, Float f2) {
        float floatValue = f2.floatValue();
        viewGroup.setTag(C0906R.id.bny, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}
