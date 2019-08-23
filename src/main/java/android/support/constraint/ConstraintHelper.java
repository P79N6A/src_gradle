package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.solver.widgets.Helper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;

public abstract class ConstraintHelper extends View {
    protected int mCount;
    protected Helper mHelperWidget;
    protected int[] mIds = new int[32];
    private String mReferenceIds;
    protected boolean mUseViewMeasure;
    protected Context myContext;

    public void onDraw(Canvas canvas) {
    }

    public void updatePostLayout(ConstraintLayout constraintLayout) {
    }

    public void updatePostMeasure(ConstraintLayout constraintLayout) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.mIds, this.mCount);
    }

    public void validateParams() {
        if (this.mHelperWidget != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ((ConstraintLayout.LayoutParams) layoutParams).widget = this.mHelperWidget;
            }
        }
    }

    public ConstraintHelper(Context context) {
        super(context);
        this.myContext = context;
        init(null);
    }

    public void setReferencedIds(int[] iArr) {
        this.mCount = 0;
        for (int tag : iArr) {
            setTag(tag, null);
        }
    }

    private void setIds(String str) {
        if (str != null) {
            int i = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    addID(str.substring(i));
                    return;
                } else {
                    addID(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void init(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 9) {
                    this.mReferenceIds = obtainStyledAttributes.getString(index);
                    setIds(this.mReferenceIds);
                }
            }
        }
    }

    public void updatePreLayout(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.mReferenceIds);
        }
        if (this.mHelperWidget != null) {
            this.mHelperWidget.removeAllIds();
            for (int i = 0; i < this.mCount; i++) {
                View findViewById = constraintLayout.findViewById(this.mIds[i]);
                if (findViewById != null) {
                    this.mHelperWidget.add(constraintLayout.getViewWidget(findViewById));
                }
            }
        }
    }

    private void addID(String str) {
        int i;
        if (str != null && this.myContext != null) {
            String trim = str.trim();
            try {
                i = R$id.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = this.myContext.getResources().getIdentifier(trim, "id", this.myContext.getPackageName());
            }
            if (i == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout)) {
                Object designInformation = ((ConstraintLayout) getParent()).getDesignInformation(0, trim);
                if (designInformation != null && (designInformation instanceof Integer)) {
                    i = ((Integer) designInformation).intValue();
                }
            }
            if (i != 0) {
                setTag(i, null);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.mUseViewMeasure) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.myContext = context;
        init(attributeSet);
    }

    public void setTag(int i, Object obj) {
        if (this.mCount + 1 > this.mIds.length) {
            this.mIds = Arrays.copyOf(this.mIds, this.mIds.length * 2);
        }
        this.mIds[this.mCount] = i;
        this.mCount++;
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.myContext = context;
        init(attributeSet);
    }
}
