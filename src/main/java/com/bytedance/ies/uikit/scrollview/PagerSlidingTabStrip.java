package com.bytedance.ies.uikit.scrollview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ugc.uikit.R$styleable;
import java.util.Locale;

public class PagerSlidingTabStrip extends HorizontalScrollView {
    private static final int[] ATTRS = {16842901, 16842904};
    public int currentPosition;
    public float currentPositionOffset;
    private LinearLayout.LayoutParams defaultTabLayoutParams;
    public ViewPager.OnPageChangeListener delegatePageListener;
    private int dividerColor;
    private int dividerPadding;
    private Paint dividerPaint;
    private int dividerWidth;
    private LinearLayout.LayoutParams expandedTabLayoutParams;
    private int indicatorColor;
    private int indicatorHeight;
    private int lastScrollX;
    private Locale locale;
    public boolean mHighlightTitle;
    private boolean overlayIndicator;
    private final PageListener pageListener;
    public ViewPager pager;
    private Paint rectPaint;
    private int scrollOffset;
    private boolean shouldExpand;
    private int tabBackgroundResId;
    private int tabCount;
    private int tabPadding;
    private int tabTextColor;
    private int tabTextSize;
    private Typeface tabTypeface;
    private int tabTypefaceStyle;
    public LinearLayout tabsContainer;
    private boolean textAllCaps;
    private int underlineColor;
    private int underlineHeight;

    public interface IconTabProvider {
        int getPageIconResId(int i);
    }

    class PageListener implements ViewPager.OnPageChangeListener {
        private PageListener() {
        }

        public void onPageScrollStateChanged(int i) {
            if (i == 0) {
                PagerSlidingTabStrip.this.scrollToChild(PagerSlidingTabStrip.this.pager.getCurrentItem(), 0);
            }
            if (PagerSlidingTabStrip.this.delegatePageListener != null) {
                PagerSlidingTabStrip.this.delegatePageListener.onPageScrollStateChanged(i);
            }
        }

        public void onPageSelected(int i) {
            if (PagerSlidingTabStrip.this.mHighlightTitle) {
                PagerSlidingTabStrip.this.updateTabTitleColor();
            }
            if (PagerSlidingTabStrip.this.delegatePageListener != null) {
                PagerSlidingTabStrip.this.delegatePageListener.onPageSelected(i);
            }
        }

        public void onPageScrolled(int i, float f2, int i2) {
            PagerSlidingTabStrip.this.currentPosition = i;
            PagerSlidingTabStrip.this.currentPositionOffset = f2;
            PagerSlidingTabStrip.this.scrollToChild(i, (int) (((float) PagerSlidingTabStrip.this.tabsContainer.getChildAt(i).getWidth()) * f2));
            PagerSlidingTabStrip.this.invalidate();
            if (PagerSlidingTabStrip.this.delegatePageListener != null) {
                PagerSlidingTabStrip.this.delegatePageListener.onPageScrolled(i, f2, i2);
            }
        }
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };
        int currentPosition;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.currentPosition = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.currentPosition);
        }
    }

    public interface TextTabProvider {
        View getTextTabView(int i, ViewGroup viewGroup);

        TextView getTextViewInTab(View view);

        void onTabClick(int i);
    }

    public int getDividerColor() {
        return this.dividerColor;
    }

    public int getDividerPadding() {
        return this.dividerPadding;
    }

    public boolean getHighlightTitle() {
        return this.mHighlightTitle;
    }

    public int getIndicatorColor() {
        return this.indicatorColor;
    }

    public int getIndicatorHeight() {
        return this.indicatorHeight;
    }

    public int getScrollOffset() {
        return this.scrollOffset;
    }

    public boolean getShouldExpand() {
        return this.shouldExpand;
    }

    public int getTabBackground() {
        return this.tabBackgroundResId;
    }

    public int getTabPaddingLeftRight() {
        return this.tabPadding;
    }

    public int getTextColor() {
        return this.tabTextColor;
    }

    public int getTextSize() {
        return this.tabTextSize;
    }

    public int getUnderlineColor() {
        return this.underlineColor;
    }

    public int getUnderlineHeight() {
        return this.underlineHeight;
    }

    public boolean isTextAllCaps() {
        return this.textAllCaps;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.currentPosition = this.currentPosition;
        return savedState;
    }

    private void updateTabStyles() {
        int currentItem = this.pager.getCurrentItem();
        for (int i = 0; i < this.tabCount; i++) {
            View childAt = this.tabsContainer.getChildAt(i);
            childAt.setBackgroundResource(this.tabBackgroundResId);
            TextView textView = null;
            if (this.pager.getAdapter() instanceof TextTabProvider) {
                textView = ((TextTabProvider) this.pager.getAdapter()).getTextViewInTab(childAt);
            }
            if (textView == null && (childAt instanceof TextView)) {
                textView = (TextView) childAt;
            }
            if (textView != null) {
                textView.setTextSize(0, (float) this.tabTextSize);
                textView.setTypeface(this.tabTypeface, this.tabTypefaceStyle);
                if (currentItem != i || !this.mHighlightTitle) {
                    textView.setTextColor(this.tabTextColor);
                } else {
                    textView.setTextColor(this.indicatorColor);
                }
                if (this.textAllCaps) {
                    if (Build.VERSION.SDK_INT >= 14) {
                        textView.setAllCaps(true);
                    } else {
                        textView.setText(textView.getText().toString().toUpperCase(this.locale));
                    }
                }
            }
        }
    }

    public void notifyDataSetChanged() {
        this.tabsContainer.removeAllViews();
        this.tabCount = this.pager.getAdapter().getCount();
        for (int i = 0; i < this.tabCount; i++) {
            if (this.pager.getAdapter() instanceof IconTabProvider) {
                addIconTab(i, ((IconTabProvider) this.pager.getAdapter()).getPageIconResId(i));
            } else {
                addTextTab(i, this.pager.getAdapter().getPageTitle(i).toString());
            }
        }
        updateTabStyles();
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @SuppressLint({"NewApi"})
            public void onGlobalLayout() {
                if (Build.VERSION.SDK_INT < 16) {
                    PagerSlidingTabStrip.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                } else {
                    PagerSlidingTabStrip.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
                PagerSlidingTabStrip.this.currentPosition = PagerSlidingTabStrip.this.pager.getCurrentItem();
                PagerSlidingTabStrip.this.scrollToChild(PagerSlidingTabStrip.this.currentPosition, 0);
            }
        });
    }

    public void updateTabTitleColor() {
        int currentItem = this.pager.getCurrentItem();
        for (int i = 0; i < this.tabCount; i++) {
            View childAt = this.tabsContainer.getChildAt(i);
            TextView textView = null;
            if (this.pager.getAdapter() instanceof TextTabProvider) {
                textView = ((TextTabProvider) this.pager.getAdapter()).getTextViewInTab(childAt);
            }
            if (textView == null && (childAt instanceof TextView)) {
                textView = (TextView) childAt;
            }
            if (textView != null) {
                if (currentItem != i || !this.mHighlightTitle) {
                    textView.setTextColor(this.tabTextColor);
                } else {
                    textView.setTextColor(this.indicatorColor);
                }
            }
        }
    }

    public void setAllCaps(boolean z) {
        this.textAllCaps = z;
    }

    public void setHighlightTitle(boolean z) {
        this.mHighlightTitle = z;
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.delegatePageListener = onPageChangeListener;
    }

    public void setOverlayIndicator(boolean z) {
        this.overlayIndicator = z;
    }

    public void setTabBackground(int i) {
        this.tabBackgroundResId = i;
    }

    public PagerSlidingTabStrip(Context context) {
        this(context, null);
    }

    public void setDividerColor(int i) {
        this.dividerColor = i;
        invalidate();
    }

    public void setDividerPadding(int i) {
        this.dividerPadding = i;
        invalidate();
    }

    public void setIndicatorColor(int i) {
        this.indicatorColor = i;
        invalidate();
    }

    public void setIndicatorHeight(int i) {
        this.indicatorHeight = i;
        invalidate();
    }

    public void setScrollOffset(int i) {
        this.scrollOffset = i;
        invalidate();
    }

    public void setShouldExpand(boolean z) {
        this.shouldExpand = z;
        requestLayout();
    }

    public void setTabPaddingLeftRight(int i) {
        this.tabPadding = i;
        updateTabStyles();
    }

    public void setTextColor(int i) {
        this.tabTextColor = i;
        updateTabStyles();
    }

    public void setTextSize(int i) {
        this.tabTextSize = i;
        updateTabStyles();
    }

    public void setUnderlineColor(int i) {
        this.underlineColor = i;
        invalidate();
    }

    public void setUnderlineHeight(int i) {
        this.underlineHeight = i;
        invalidate();
    }

    public void setDividerColorResource(int i) {
        this.dividerColor = getResources().getColor(i);
        invalidate();
    }

    public void setIndicatorColorResource(int i) {
        this.indicatorColor = getResources().getColor(i);
        invalidate();
    }

    public void setTextColorResource(int i) {
        this.tabTextColor = getResources().getColor(i);
        updateTabStyles();
    }

    public void setUnderlineColorResource(int i) {
        this.underlineColor = getResources().getColor(i);
        invalidate();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.currentPosition = savedState.currentPosition;
        requestLayout();
    }

    public void setViewPager(ViewPager viewPager) {
        this.pager = viewPager;
        if (viewPager.getAdapter() != null) {
            viewPager.setOnPageChangeListener(this.pageListener);
            notifyDataSetChanged();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isInEditMode() && this.tabCount != 0) {
            int height = getHeight();
            if (this.overlayIndicator) {
                this.rectPaint.setColor(this.underlineColor);
                canvas.drawRect(0.0f, (float) (height - this.underlineHeight), (float) this.tabsContainer.getWidth(), (float) height, this.rectPaint);
            }
            this.rectPaint.setColor(this.indicatorColor);
            View childAt = this.tabsContainer.getChildAt(this.currentPosition);
            float left = (float) childAt.getLeft();
            float right = (float) childAt.getRight();
            if (this.currentPositionOffset > 0.0f && this.currentPosition < this.tabCount - 1) {
                View childAt2 = this.tabsContainer.getChildAt(this.currentPosition + 1);
                left = (this.currentPositionOffset * ((float) childAt2.getLeft())) + ((1.0f - this.currentPositionOffset) * left);
                right = (this.currentPositionOffset * ((float) childAt2.getRight())) + ((1.0f - this.currentPositionOffset) * right);
            }
            float f2 = (float) height;
            Canvas canvas2 = canvas;
            canvas2.drawRect(left, (float) (height - this.indicatorHeight), right, f2, this.rectPaint);
            if (!this.overlayIndicator) {
                this.rectPaint.setColor(this.underlineColor);
                canvas.drawRect(0.0f, (float) (height - this.underlineHeight), (float) this.tabsContainer.getWidth(), f2, this.rectPaint);
            }
            this.dividerPaint.setColor(this.dividerColor);
            for (int i = 0; i < this.tabCount - 1; i++) {
                View childAt3 = this.tabsContainer.getChildAt(i);
                canvas.drawLine((float) childAt3.getRight(), (float) this.dividerPadding, (float) childAt3.getRight(), (float) (height - this.dividerPadding), this.dividerPaint);
            }
        }
    }

    public void setTypeface(Typeface typeface, int i) {
        this.tabTypeface = typeface;
        this.tabTypefaceStyle = i;
        updateTabStyles();
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void addIconTab(int i, int i2) {
        ImageButton imageButton = new ImageButton(getContext());
        imageButton.setImageResource(i2);
        addTab(i, imageButton);
    }

    private void addTab(final int i, View view) {
        LinearLayout.LayoutParams layoutParams;
        view.setFocusable(true);
        view.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (!(PagerSlidingTabStrip.this.pager.getAdapter() instanceof TextTabProvider) || PagerSlidingTabStrip.this.pager.getCurrentItem() != i) {
                    PagerSlidingTabStrip.this.pager.setCurrentItem(i);
                } else {
                    ((TextTabProvider) PagerSlidingTabStrip.this.pager.getAdapter()).onTabClick(i);
                }
            }
        });
        view.setPadding(this.tabPadding, 0, this.tabPadding, 0);
        LinearLayout linearLayout = this.tabsContainer;
        if (this.shouldExpand) {
            layoutParams = this.expandedTabLayoutParams;
        } else {
            layoutParams = this.defaultTabLayoutParams;
        }
        linearLayout.addView(view, i, layoutParams);
    }

    private void addTextTab(int i, String str) {
        View view;
        TextView textView = null;
        if (this.pager.getAdapter() instanceof TextTabProvider) {
            TextTabProvider textTabProvider = (TextTabProvider) this.pager.getAdapter();
            view = textTabProvider.getTextTabView(i, this.tabsContainer);
            if (view != null) {
                textView = textTabProvider.getTextViewInTab(view);
            }
        } else {
            view = null;
        }
        if (textView == null) {
            textView = new TextView(getContext());
            view = textView;
        }
        textView.setText(str);
        textView.setGravity(17);
        textView.setSingleLine();
        addTab(i, view);
    }

    public void scrollToChild(int i, int i2) {
        if (this.tabCount != 0) {
            int left = this.tabsContainer.getChildAt(i).getLeft() + i2;
            if (i > 0 || i2 > 0) {
                left -= this.scrollOffset;
            }
            if (left != this.lastScrollX) {
                this.lastScrollX = left;
                scrollTo(left, 0);
            }
        }
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.pageListener = new PageListener();
        this.currentPosition = 0;
        this.currentPositionOffset = 0.0f;
        this.indicatorColor = -10066330;
        this.underlineColor = 436207616;
        this.dividerColor = 436207616;
        this.shouldExpand = false;
        this.textAllCaps = true;
        this.mHighlightTitle = false;
        this.overlayIndicator = false;
        this.scrollOffset = 52;
        this.indicatorHeight = 8;
        this.underlineHeight = 2;
        this.dividerPadding = 12;
        this.tabPadding = 24;
        this.dividerWidth = 1;
        this.tabTextSize = 12;
        this.tabTextColor = -10066330;
        this.tabTypeface = null;
        this.tabTypefaceStyle = 0;
        this.lastScrollX = 0;
        this.tabBackgroundResId = 2130837789;
        setFillViewport(true);
        setWillNotDraw(false);
        this.tabsContainer = new LinearLayout(context);
        this.tabsContainer.setOrientation(0);
        this.tabsContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.tabsContainer);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.scrollOffset = (int) TypedValue.applyDimension(1, (float) this.scrollOffset, displayMetrics);
        this.indicatorHeight = (int) TypedValue.applyDimension(1, (float) this.indicatorHeight, displayMetrics);
        this.underlineHeight = (int) TypedValue.applyDimension(1, (float) this.underlineHeight, displayMetrics);
        this.dividerPadding = (int) TypedValue.applyDimension(1, (float) this.dividerPadding, displayMetrics);
        this.tabPadding = (int) TypedValue.applyDimension(1, (float) this.tabPadding, displayMetrics);
        this.dividerWidth = (int) TypedValue.applyDimension(1, (float) this.dividerWidth, displayMetrics);
        this.tabTextSize = (int) TypedValue.applyDimension(2, (float) this.tabTextSize, displayMetrics);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ATTRS);
        this.tabTextSize = obtainStyledAttributes.getDimensionPixelSize(0, this.tabTextSize);
        this.tabTextColor = obtainStyledAttributes.getColor(1, this.tabTextColor);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.PagerSlidingTabStrip);
        this.indicatorColor = obtainStyledAttributes2.getColor(3, this.indicatorColor);
        this.underlineColor = obtainStyledAttributes2.getColor(12, this.underlineColor);
        this.dividerColor = obtainStyledAttributes2.getColor(1, this.dividerColor);
        this.indicatorHeight = obtainStyledAttributes2.getDimensionPixelSize(4, this.indicatorHeight);
        this.underlineHeight = obtainStyledAttributes2.getDimensionPixelSize(13, this.underlineHeight);
        this.dividerPadding = obtainStyledAttributes2.getDimensionPixelSize(2, this.dividerPadding);
        this.tabPadding = obtainStyledAttributes2.getDimensionPixelSize(9, this.tabPadding);
        this.tabBackgroundResId = obtainStyledAttributes2.getResourceId(8, this.tabBackgroundResId);
        this.shouldExpand = obtainStyledAttributes2.getBoolean(7, this.shouldExpand);
        this.scrollOffset = obtainStyledAttributes2.getDimensionPixelSize(6, this.scrollOffset);
        this.textAllCaps = obtainStyledAttributes2.getBoolean(11, this.textAllCaps);
        obtainStyledAttributes2.recycle();
        this.rectPaint = new Paint();
        this.rectPaint.setAntiAlias(true);
        this.rectPaint.setStyle(Paint.Style.FILL);
        this.dividerPaint = new Paint();
        this.dividerPaint.setAntiAlias(true);
        this.dividerPaint.setStrokeWidth((float) this.dividerWidth);
        this.defaultTabLayoutParams = new LinearLayout.LayoutParams(-2, -1);
        this.expandedTabLayoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
        if (this.locale == null) {
            this.locale = getResources().getConfiguration().locale;
        }
    }
}
