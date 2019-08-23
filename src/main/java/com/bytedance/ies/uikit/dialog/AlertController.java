package com.bytedance.ies.uikit.dialog;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.ss.android.ugc.aweme.C0906R;
import java.lang.ref.WeakReference;

public class AlertController {
    public ListAdapter mAdapter;
    private int mAlertDialogLayout;
    private final View.OnClickListener mButtonHandler = new View.OnClickListener() {
        public void onClick(View view) {
            Message message;
            if (view == AlertController.this.mButtonPositive && AlertController.this.mButtonPositiveMessage != null) {
                message = Message.obtain(AlertController.this.mButtonPositiveMessage);
            } else if (view == AlertController.this.mButtonNegative && AlertController.this.mButtonNegativeMessage != null) {
                message = Message.obtain(AlertController.this.mButtonNegativeMessage);
            } else if (view != AlertController.this.mButtonNeutral || AlertController.this.mButtonNeutralMessage == null) {
                message = null;
            } else {
                message = Message.obtain(AlertController.this.mButtonNeutralMessage);
            }
            if (message != null) {
                message.sendToTarget();
            }
            AlertController.this.mHandler.obtainMessage(1, AlertController.this.mDialogInterface).sendToTarget();
        }
    };
    public Button mButtonNegative;
    public Message mButtonNegativeMessage;
    private CharSequence mButtonNegativeText;
    public Button mButtonNeutral;
    public Message mButtonNeutralMessage;
    private CharSequence mButtonNeutralText;
    private int mButtonPanelLayoutHint;
    private int mButtonPanelSideLayout;
    public Button mButtonPositive;
    public Message mButtonPositiveMessage;
    private CharSequence mButtonPositiveText;
    public int mCheckedItem = -1;
    public final Context mContext;
    private View mCustomTitleView;
    public final DialogInterface mDialogInterface;
    private boolean mForceInverseBackground;
    public Handler mHandler;
    private Drawable mIcon;
    private int mIconId;
    private ImageView mIconView;
    public int mListItemLayout;
    public int mListLayout;
    public ListView mListView;
    private CharSequence mMessage;
    private TextView mMessageView;
    public int mMultiChoiceItemLayout;
    public ScrollView mScrollView;
    public int mSingleChoiceItemLayout;
    private CharSequence mTitle;
    private TextView mTitleView;
    private View mView;
    private int mViewLayoutResId;
    private int mViewSpacingBottom;
    private int mViewSpacingLeft;
    private int mViewSpacingRight;
    private boolean mViewSpacingSpecified;
    private int mViewSpacingTop;
    private final Window mWindow;

    public static class AlertParams {
        public ListAdapter mAdapter;
        public boolean mCancelable;
        public int mCheckedItem = -1;
        public boolean[] mCheckedItems;
        public final Context mContext;
        public Cursor mCursor;
        public View mCustomTitleView;
        public boolean mForceInverseBackground;
        public Drawable mIcon;
        public int mIconAttrId;
        public int mIconId;
        public final LayoutInflater mInflater;
        public String mIsCheckedColumn;
        public boolean mIsMultiChoice;
        public boolean mIsSingleChoice;
        public CharSequence[] mItems;
        public String mLabelColumn;
        public CharSequence mMessage;
        public DialogInterface.OnClickListener mNegativeButtonListener;
        public CharSequence mNegativeButtonText;
        public DialogInterface.OnClickListener mNeutralButtonListener;
        public CharSequence mNeutralButtonText;
        public DialogInterface.OnCancelListener mOnCancelListener;
        public DialogInterface.OnMultiChoiceClickListener mOnCheckboxClickListener;
        public DialogInterface.OnClickListener mOnClickListener;
        public DialogInterface.OnDismissListener mOnDismissListener;
        public AdapterView.OnItemSelectedListener mOnItemSelectedListener;
        public DialogInterface.OnKeyListener mOnKeyListener;
        public OnPrepareListViewListener mOnPrepareListViewListener;
        public DialogInterface.OnClickListener mPositiveButtonListener;
        public CharSequence mPositiveButtonText;
        public boolean mRecycleOnMeasure = true;
        public CharSequence mTitle;
        public View mView;
        public int mViewLayoutResId;
        public int mViewSpacingBottom;
        public int mViewSpacingLeft;
        public int mViewSpacingRight;
        public boolean mViewSpacingSpecified;
        public int mViewSpacingTop;

        public interface OnPrepareListViewListener {
            void onPrepareListView(ListView listView);
        }

        public AlertParams(Context context) {
            this.mContext = context;
            this.mCancelable = true;
            this.mInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v1 */
        /* JADX WARNING: type inference failed for: r1v22, types: [com.bytedance.ies.uikit.dialog.AlertController$CheckedItemAdapter] */
        /* JADX WARNING: type inference failed for: r1v23, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r1v30, types: [com.bytedance.ies.uikit.dialog.AlertController$AlertParams$2] */
        /* JADX WARNING: type inference failed for: r1v31, types: [com.bytedance.ies.uikit.dialog.AlertController$AlertParams$1] */
        /* JADX WARNING: Multi-variable type inference failed */
        @android.annotation.SuppressLint({"NewApi"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void createListView(final com.bytedance.ies.uikit.dialog.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.mInflater
                int r1 = r11.mListLayout
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                com.bytedance.ies.uikit.dialog.RecycleListView r0 = (com.bytedance.ies.uikit.dialog.RecycleListView) r0
                boolean r1 = r10.mIsMultiChoice
                r8 = 1
                if (r1 == 0) goto L_0x0035
                android.database.Cursor r1 = r10.mCursor
                if (r1 != 0) goto L_0x0026
                com.bytedance.ies.uikit.dialog.AlertController$AlertParams$1 r9 = new com.bytedance.ies.uikit.dialog.AlertController$AlertParams$1
                android.content.Context r3 = r10.mContext
                int r4 = r11.mMultiChoiceItemLayout
                r5 = 2131170287(0x7f0713ef, float:1.7954928E38)
                java.lang.CharSequence[] r6 = r10.mItems
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006e
            L_0x0026:
                com.bytedance.ies.uikit.dialog.AlertController$AlertParams$2 r9 = new com.bytedance.ies.uikit.dialog.AlertController$AlertParams$2
                android.content.Context r3 = r10.mContext
                android.database.Cursor r4 = r10.mCursor
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006e
            L_0x0035:
                boolean r1 = r10.mIsSingleChoice
                if (r1 == 0) goto L_0x003d
                int r1 = r11.mSingleChoiceItemLayout
            L_0x003b:
                r4 = r1
                goto L_0x0040
            L_0x003d:
                int r1 = r11.mListItemLayout
                goto L_0x003b
            L_0x0040:
                android.database.Cursor r1 = r10.mCursor
                r2 = 2131170287(0x7f0713ef, float:1.7954928E38)
                if (r1 != 0) goto L_0x0058
                android.widget.ListAdapter r1 = r10.mAdapter
                if (r1 == 0) goto L_0x004e
                android.widget.ListAdapter r1 = r10.mAdapter
                goto L_0x006d
            L_0x004e:
                com.bytedance.ies.uikit.dialog.AlertController$CheckedItemAdapter r1 = new com.bytedance.ies.uikit.dialog.AlertController$CheckedItemAdapter
                android.content.Context r3 = r10.mContext
                java.lang.CharSequence[] r5 = r10.mItems
                r1.<init>(r3, r4, r2, r5)
                goto L_0x006d
            L_0x0058:
                android.widget.SimpleCursorAdapter r1 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.mContext
                android.database.Cursor r5 = r10.mCursor
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r7 = r10.mLabelColumn
                r9 = 0
                r6[r9] = r7
                int[] r7 = new int[r8]
                r7[r9] = r2
                r2 = r1
                r2.<init>(r3, r4, r5, r6, r7)
            L_0x006d:
                r9 = r1
            L_0x006e:
                com.bytedance.ies.uikit.dialog.AlertController$AlertParams$OnPrepareListViewListener r1 = r10.mOnPrepareListViewListener
                if (r1 == 0) goto L_0x0077
                com.bytedance.ies.uikit.dialog.AlertController$AlertParams$OnPrepareListViewListener r1 = r10.mOnPrepareListViewListener
                r1.onPrepareListView(r0)
            L_0x0077:
                r11.mAdapter = r9
                int r1 = r10.mCheckedItem
                r11.mCheckedItem = r1
                android.content.DialogInterface$OnClickListener r1 = r10.mOnClickListener
                if (r1 == 0) goto L_0x008a
                com.bytedance.ies.uikit.dialog.AlertController$AlertParams$3 r1 = new com.bytedance.ies.uikit.dialog.AlertController$AlertParams$3
                r1.<init>(r11)
                r0.setOnItemClickListener(r1)
                goto L_0x0096
            L_0x008a:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.mOnCheckboxClickListener
                if (r1 == 0) goto L_0x0096
                com.bytedance.ies.uikit.dialog.AlertController$AlertParams$4 r1 = new com.bytedance.ies.uikit.dialog.AlertController$AlertParams$4
                r1.<init>(r0, r11)
                r0.setOnItemClickListener(r1)
            L_0x0096:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.mOnItemSelectedListener
                if (r1 == 0) goto L_0x009f
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.mOnItemSelectedListener
                r0.setOnItemSelectedListener(r1)
            L_0x009f:
                boolean r1 = r10.mIsSingleChoice
                if (r1 == 0) goto L_0x00a7
                r0.setChoiceMode(r8)
                goto L_0x00af
            L_0x00a7:
                boolean r1 = r10.mIsMultiChoice
                if (r1 == 0) goto L_0x00af
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00af:
                boolean r1 = r10.mRecycleOnMeasure
                r0.mRecycleOnMeasure = r1
                r11.mListView = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.uikit.dialog.AlertController.AlertParams.createListView(com.bytedance.ies.uikit.dialog.AlertController):void");
        }

        public void apply(AlertController alertController) {
            if (this.mCustomTitleView != null) {
                alertController.setCustomTitle(this.mCustomTitleView);
            } else {
                if (this.mTitle != null) {
                    alertController.setTitle(this.mTitle);
                }
                if (this.mIcon != null) {
                    alertController.setIcon(this.mIcon);
                }
                if (this.mIconId != 0) {
                    alertController.setIcon(this.mIconId);
                }
                if (this.mIconAttrId != 0) {
                    alertController.setIcon(alertController.getIconAttributeResId(this.mIconAttrId));
                }
            }
            if (this.mMessage != null) {
                alertController.setMessage(this.mMessage);
            }
            if (this.mPositiveButtonText != null) {
                alertController.setButton(-1, this.mPositiveButtonText, this.mPositiveButtonListener, null);
            }
            if (this.mNegativeButtonText != null) {
                alertController.setButton(-2, this.mNegativeButtonText, this.mNegativeButtonListener, null);
            }
            if (this.mNeutralButtonText != null) {
                alertController.setButton(-3, this.mNeutralButtonText, this.mNeutralButtonListener, null);
            }
            if (this.mForceInverseBackground) {
                alertController.setInverseBackgroundForced(true);
            }
            if (!(this.mItems == null && this.mCursor == null && this.mAdapter == null)) {
                createListView(alertController);
            }
            if (this.mView == null) {
                if (this.mViewLayoutResId != 0) {
                    alertController.setView(this.mViewLayoutResId);
                }
            } else if (this.mViewSpacingSpecified) {
                alertController.setView(this.mView, this.mViewSpacingLeft, this.mViewSpacingTop, this.mViewSpacingRight, this.mViewSpacingBottom);
            } else {
                alertController.setView(this.mView);
            }
        }
    }

    static final class ButtonHandler extends Handler {
        private WeakReference<DialogInterface> mDialog;

        public ButtonHandler(DialogInterface dialogInterface) {
            this.mDialog = new WeakReference<>(dialogInterface);
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                switch (i) {
                    case -3:
                    case -2:
                    case -1:
                        ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.mDialog.get(), message.what);
                        return;
                }
            } else {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    static class CheckedItemAdapter extends ArrayAdapter<CharSequence> {
        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }

        public CheckedItemAdapter(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }
    }

    private static boolean shouldCenterSingleButton(Context context) {
        return false;
    }

    public ListView getListView() {
        return this.mListView;
    }

    private int selectContentView() {
        if (this.mButtonPanelSideLayout == 0) {
            return this.mAlertDialogLayout;
        }
        if (this.mButtonPanelLayoutHint == 1) {
            return this.mButtonPanelSideLayout;
        }
        return this.mAlertDialogLayout;
    }

    public void installContent() {
        this.mWindow.requestFeature(1);
        this.mWindow.setContentView(selectContentView());
        setupView();
        setupDecor();
    }

    private void setupDecor() {
        if (Build.VERSION.SDK_INT >= 20) {
            View decorView = this.mWindow.getDecorView();
            final View findViewById = this.mWindow.findViewById(C0906R.id.bwc);
            if (!(findViewById == null || decorView == null)) {
                decorView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                    @SuppressLint({"NewApi"})
                    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        if (windowInsets.isRound()) {
                            int dimensionPixelOffset = AlertController.this.mContext.getResources().getDimensionPixelOffset(C0906R.dimen.bw);
                            findViewById.setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
                        }
                        return windowInsets.consumeSystemWindowInsets();
                    }
                });
                decorView.setFitsSystemWindows(true);
                decorView.requestApplyInsets();
            }
        }
    }

    private boolean setupButtons() {
        boolean z;
        this.mButtonPositive = (Button) this.mWindow.findViewById(C0906R.id.pi);
        this.mButtonPositive.setOnClickListener(this.mButtonHandler);
        if (TextUtils.isEmpty(this.mButtonPositiveText)) {
            this.mButtonPositive.setVisibility(8);
            z = false;
        } else {
            this.mButtonPositive.setText(this.mButtonPositiveText);
            this.mButtonPositive.setVisibility(0);
            z = true;
        }
        this.mButtonNegative = (Button) this.mWindow.findViewById(C0906R.id.pj);
        this.mButtonNegative.setOnClickListener(this.mButtonHandler);
        if (TextUtils.isEmpty(this.mButtonNegativeText)) {
            this.mButtonNegative.setVisibility(8);
        } else {
            this.mButtonNegative.setText(this.mButtonNegativeText);
            this.mButtonNegative.setVisibility(0);
            z |= true;
        }
        this.mButtonNeutral = (Button) this.mWindow.findViewById(C0906R.id.pk);
        this.mButtonNeutral.setOnClickListener(this.mButtonHandler);
        if (TextUtils.isEmpty(this.mButtonNeutralText)) {
            this.mButtonNeutral.setVisibility(8);
        } else {
            this.mButtonNeutral.setText(this.mButtonNeutralText);
            this.mButtonNeutral.setVisibility(0);
            z |= true;
        }
        if (shouldCenterSingleButton(this.mContext)) {
            if (z) {
                centerButton(this.mButtonPositive);
            } else if (z) {
                centerButton(this.mButtonNegative);
            } else if (z) {
                centerButton(this.mButtonNeutral);
            }
        }
        if (z) {
            return true;
        }
        return false;
    }

    private void setupView() {
        View view;
        boolean z;
        View view2;
        ViewGroup viewGroup = (ViewGroup) this.mWindow.findViewById(C0906R.id.yt);
        setupContent(viewGroup);
        boolean z2 = setupButtons();
        ViewGroup viewGroup2 = (ViewGroup) this.mWindow.findViewById(C0906R.id.d4q);
        boolean z3 = setupTitle(viewGroup2);
        View findViewById = this.mWindow.findViewById(C0906R.id.pq);
        if (!z2) {
            findViewById.setVisibility(8);
            if (!(this.mMessage != null || this.mListView == null || this.mListView.getParent() == null)) {
                this.mListView.setPadding(this.mListView.getPaddingLeft(), this.mListView.getPaddingTop(), this.mListView.getPaddingRight(), this.mListView.getPaddingTop());
            }
        }
        FrameLayout frameLayout = (FrameLayout) this.mWindow.findViewById(C0906R.id.a21);
        boolean z4 = false;
        if (this.mView != null) {
            view = this.mView;
        } else if (this.mViewLayoutResId != 0) {
            view = LayoutInflater.from(this.mContext).inflate(this.mViewLayoutResId, frameLayout, false);
        } else {
            view = null;
        }
        if (view != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !canTextInput(view)) {
            this.mWindow.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout2 = (FrameLayout) this.mWindow.findViewById(C0906R.id.a20);
            frameLayout2.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.mViewSpacingSpecified) {
                frameLayout2.setPadding(this.mViewSpacingLeft, this.mViewSpacingTop, this.mViewSpacingRight, this.mViewSpacingBottom);
            }
            if (this.mListView != null) {
                ((LinearLayout.LayoutParams) frameLayout.getLayoutParams()).weight = 0.0f;
            }
        } else {
            frameLayout.setVisibility(8);
        }
        if (z3) {
            if (this.mMessage == null && view == null && this.mListView == null) {
                view2 = this.mWindow.findViewById(C0906R.id.d3f);
            } else {
                view2 = this.mWindow.findViewById(C0906R.id.d3d);
            }
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        if (viewGroup.getVisibility() == 0) {
            z4 = true;
        }
        if (z2 && z3 && !z && !z4) {
            UIUtils.updateLayoutMargin(viewGroup2, -3, -3, -3, (int) UIUtils.dip2Px(this.mContext, 16.0f));
        }
        setBackground(null, viewGroup2, viewGroup, frameLayout, findViewById, z3, z, z2);
    }

    public void setCustomTitle(View view) {
        this.mCustomTitleView = view;
    }

    public void setInverseBackgroundForced(boolean z) {
        this.mForceInverseBackground = z;
    }

    public void setView(View view) {
        this.mView = view;
        this.mViewLayoutResId = 0;
        this.mViewSpacingSpecified = false;
    }

    public void setMessage(CharSequence charSequence) {
        this.mMessage = charSequence;
        if (this.mMessageView != null) {
            this.mMessageView.setText(charSequence);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.mTitle = charSequence;
        if (this.mTitleView != null) {
            this.mTitleView.setText(charSequence);
        }
    }

    public void setView(int i) {
        this.mView = null;
        this.mViewLayoutResId = i;
        this.mViewSpacingSpecified = false;
    }

    public Button getButton(int i) {
        switch (i) {
            case -3:
                return this.mButtonNeutral;
            case -2:
                return this.mButtonNegative;
            case -1:
                return this.mButtonPositive;
            default:
                return null;
        }
    }

    public int getIconAttributeResId(int i) {
        TypedValue typedValue = new TypedValue();
        this.mContext.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    public void setIcon(int i) {
        this.mIcon = null;
        this.mIconId = i;
        if (this.mIconView != null) {
            if (i != 0) {
                this.mIconView.setImageResource(this.mIconId);
                return;
            }
            this.mIconView.setVisibility(8);
        }
    }

    static boolean canTextInput(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (canTextInput(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void centerButton(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
        View findViewById = this.mWindow.findViewById(C0906R.id.bap);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        View findViewById2 = this.mWindow.findViewById(C0906R.id.cee);
        if (findViewById2 != null) {
            findViewById2.setVisibility(0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.mIcon = drawable;
        this.mIconId = 0;
        if (this.mIconView != null) {
            if (drawable != null) {
                this.mIconView.setImageDrawable(drawable);
                return;
            }
            this.mIconView.setVisibility(8);
        }
    }

    private void setupContent(ViewGroup viewGroup) {
        this.mScrollView = (ScrollView) this.mWindow.findViewById(C0906R.id.ck6);
        this.mScrollView.setFocusable(false);
        this.mMessageView = (TextView) this.mWindow.findViewById(C0906R.id.bmn);
        if (this.mMessageView != null) {
            if (this.mMessage != null) {
                this.mMessageView.setText(this.mMessage);
            } else {
                this.mMessageView.setVisibility(8);
                this.mScrollView.removeView(this.mMessageView);
                if (this.mListView != null) {
                    ViewGroup viewGroup2 = (ViewGroup) this.mScrollView.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(this.mScrollView);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(this.mListView, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroup.setVisibility(8);
                }
            }
            final View findViewById = this.mWindow.findViewById(C0906R.id.ck5);
            final View findViewById2 = this.mWindow.findViewById(C0906R.id.ck4);
            if (!(findViewById == null && findViewById2 == null)) {
                if (this.mMessage != null) {
                    this.mScrollView.post(new Runnable() {
                        public void run() {
                            AlertController.manageScrollIndicators(AlertController.this.mScrollView, findViewById, findViewById2);
                        }
                    });
                } else if (this.mListView != null) {
                    this.mListView.setOnScrollListener(new AbsListView.OnScrollListener() {
                        public void onScrollStateChanged(AbsListView absListView, int i) {
                        }

                        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                            AlertController.manageScrollIndicators(absListView, findViewById, findViewById2);
                        }
                    });
                    this.mListView.post(new Runnable() {
                        public void run() {
                            AlertController.manageScrollIndicators(AlertController.this.mListView, findViewById, findViewById2);
                        }
                    });
                } else {
                    if (findViewById != null) {
                        viewGroup.removeView(findViewById);
                    }
                    if (findViewById2 != null) {
                        viewGroup.removeView(findViewById2);
                    }
                }
            }
        }
    }

    private boolean setupTitle(ViewGroup viewGroup) {
        if (this.mCustomTitleView != null) {
            viewGroup.addView(this.mCustomTitleView, 0, new ViewGroup.LayoutParams(-1, -2));
            this.mWindow.findViewById(C0906R.id.d3z).setVisibility(8);
        } else {
            this.mIconView = (ImageView) this.mWindow.findViewById(C0906R.id.aq8);
            if (!TextUtils.isEmpty(this.mTitle)) {
                this.mTitleView = (TextView) this.mWindow.findViewById(C0906R.id.e5);
                this.mTitleView.setText(this.mTitle);
                if (this.mIconId != 0) {
                    this.mIconView.setImageResource(this.mIconId);
                } else if (this.mIcon != null) {
                    this.mIconView.setImageDrawable(this.mIcon);
                } else {
                    this.mTitleView.setPadding(this.mIconView.getPaddingLeft(), this.mIconView.getPaddingTop(), this.mIconView.getPaddingRight(), this.mIconView.getPaddingBottom());
                    this.mIconView.setVisibility(8);
                }
            } else {
                this.mWindow.findViewById(C0906R.id.d3z).setVisibility(8);
                this.mIconView.setVisibility(8);
                viewGroup.setVisibility(8);
                return false;
            }
        }
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.mScrollView == null || !this.mScrollView.executeKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.mScrollView == null || !this.mScrollView.executeKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public AlertController(Context context, DialogInterface dialogInterface, Window window) {
        this.mContext = context;
        this.mDialogInterface = dialogInterface;
        this.mWindow = window;
        this.mHandler = new ButtonHandler(dialogInterface);
        this.mAlertDialogLayout = C0906R.layout.adc;
        this.mButtonPanelSideLayout = 0;
        this.mListLayout = C0906R.layout.ade;
        this.mMultiChoiceItemLayout = C0906R.layout.adg;
        this.mSingleChoiceItemLayout = C0906R.layout.adh;
        this.mListItemLayout = C0906R.layout.adf;
    }

    public static void manageScrollIndicators(View view, View view2, View view3) {
        int i;
        if (Build.VERSION.SDK_INT >= 14) {
            int i2 = 4;
            if (view2 != null) {
                if (view.canScrollVertically(-1)) {
                    i = 0;
                } else {
                    i = 4;
                }
                view2.setVisibility(i);
            }
            if (view3 != null) {
                if (view.canScrollVertically(1)) {
                    i2 = 0;
                }
                view3.setVisibility(i2);
            }
        }
    }

    public void setButton(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message) {
        if (message == null && onClickListener != null) {
            message = this.mHandler.obtainMessage(i, onClickListener);
        }
        switch (i) {
            case -3:
                this.mButtonNeutralText = charSequence;
                this.mButtonNeutralMessage = message;
                return;
            case -2:
                this.mButtonNegativeText = charSequence;
                this.mButtonNegativeMessage = message;
                return;
            case -1:
                this.mButtonPositiveText = charSequence;
                this.mButtonPositiveMessage = message;
                return;
            default:
                throw new IllegalArgumentException("Button does not exist");
        }
    }

    public void setView(View view, int i, int i2, int i3, int i4) {
        this.mView = view;
        this.mViewLayoutResId = 0;
        this.mViewSpacingSpecified = true;
        this.mViewSpacingLeft = i;
        this.mViewSpacingTop = i2;
        this.mViewSpacingRight = i3;
        this.mViewSpacingBottom = i4;
    }

    private void setBackground(TypedArray typedArray, View view, View view2, View view3, View view4, boolean z, boolean z2, boolean z3) {
        ListView listView = this.mListView;
        if (listView != null && this.mAdapter != null) {
            listView.setAdapter(this.mAdapter);
            int i = this.mCheckedItem;
            if (i >= 0) {
                listView.setItemChecked(i, true);
                listView.setSelection(i);
            }
        }
    }
}
