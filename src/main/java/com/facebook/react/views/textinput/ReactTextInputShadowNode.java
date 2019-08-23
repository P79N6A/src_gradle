package com.facebook.react.views.textinput;

import android.os.Build;
import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.infer.annotation.a;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIViewOperationQueue;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.text.ReactBaseTextShadowNode;
import com.facebook.react.views.text.ReactTextUpdate;
import com.facebook.react.views.view.MeasureUtil;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;
import com.facebook.yoga.b;
import javax.annotation.Nullable;

@VisibleForTesting
public class ReactTextInputShadowNode extends ReactBaseTextShadowNode implements YogaMeasureFunction {
    @Nullable
    private EditText mDummyEditText;
    @Nullable
    private ReactTextInputLocalData mLocalData;
    private int mMostRecentEventCount = -1;
    @Nullable
    private String mText;

    public boolean isVirtualAnchor() {
        return true;
    }

    public boolean isYogaLeafNode() {
        return true;
    }

    @Nullable
    public String getText() {
        return this.mText;
    }

    public ReactTextInputShadowNode() {
        int i = Build.VERSION.SDK_INT;
        this.mTextBreakStrategy = 0;
        setMeasureFunction(this);
    }

    public ReactTextInputShadowNode mutableCopy() {
        return new ReactTextInputShadowNode(this);
    }

    @ReactProp(name = "mostRecentEventCount")
    public void setMostRecentEventCount(int i) {
        this.mMostRecentEventCount = i;
    }

    @ReactProp(name = "text")
    public void setText(@Nullable String str) {
        this.mText = str;
        markUpdated();
    }

    public void setLocalData(Object obj) {
        a.a(obj instanceof ReactTextInputLocalData);
        this.mLocalData = (ReactTextInputLocalData) obj;
        dirty();
    }

    private ReactTextInputShadowNode(ReactTextInputShadowNode reactTextInputShadowNode) {
        super(reactTextInputShadowNode);
        this.mMostRecentEventCount = reactTextInputShadowNode.mMostRecentEventCount;
        this.mText = reactTextInputShadowNode.mText;
        this.mLocalData = reactTextInputShadowNode.mLocalData;
        setMeasureFunction(this);
        ThemedReactContext themedContext = getThemedContext();
        if (themedContext != null) {
            setThemedContext(themedContext);
        }
    }

    public void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue) {
        super.onCollectExtraUpdates(uIViewOperationQueue);
        if (this.mMostRecentEventCount != -1) {
            ReactTextUpdate reactTextUpdate = new ReactTextUpdate(spannedFromShadowNode(this, getText()), this.mMostRecentEventCount, this.mContainsImages, getPadding(0), getPadding(1), getPadding(2), getPadding(3), this.mTextAlign, this.mTextBreakStrategy);
            uIViewOperationQueue.enqueueUpdateExtraData(getReactTag(), reactTextUpdate);
        }
    }

    public void setTextBreakStrategy(@Nullable String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            if (str == null || "simple".equals(str)) {
                this.mTextBreakStrategy = 0;
            } else if ("highQuality".equals(str)) {
                this.mTextBreakStrategy = 1;
            } else if ("balanced".equals(str)) {
                this.mTextBreakStrategy = 2;
            } else {
                throw new JSApplicationIllegalArgumentException("Invalid textBreakStrategy: " + str);
            }
        }
    }

    public void setThemedContext(ThemedReactContext themedReactContext) {
        super.setThemedContext(themedReactContext);
        EditText editText = new EditText(getThemedContext());
        setDefaultPadding(4, (float) editText.getPaddingStart());
        setDefaultPadding(1, (float) editText.getPaddingTop());
        setDefaultPadding(5, (float) editText.getPaddingEnd());
        setDefaultPadding(3, (float) editText.getPaddingBottom());
        this.mDummyEditText = editText;
        this.mDummyEditText.setPadding(0, 0, 0, 0);
        this.mDummyEditText.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    public void setPadding(int i, float f2) {
        super.setPadding(i, f2);
        markUpdated();
    }

    public long measure(YogaNode yogaNode, float f2, YogaMeasureMode yogaMeasureMode, float f3, YogaMeasureMode yogaMeasureMode2) {
        EditText editText = (EditText) a.b(this.mDummyEditText);
        if (this.mLocalData == null) {
            return b.a(0, 0);
        }
        this.mLocalData.apply(editText);
        editText.measure(MeasureUtil.getMeasureSpec(f2, yogaMeasureMode), MeasureUtil.getMeasureSpec(f3, yogaMeasureMode2));
        return b.a(editText.getMeasuredWidth(), editText.getMeasuredHeight());
    }
}
