package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.BackStackRecord;
import android.text.TextUtils;
import java.util.ArrayList;

public final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new Parcelable.Creator<BackStackState>() {
        public final BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }

        public final BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }
    };
    final int mBreadCrumbShortTitleRes;
    final CharSequence mBreadCrumbShortTitleText;
    final int mBreadCrumbTitleRes;
    final CharSequence mBreadCrumbTitleText;
    final int mIndex;
    final String mName;
    final int[] mOps;
    final boolean mReorderingAllowed;
    final ArrayList<String> mSharedElementSourceNames;
    final ArrayList<String> mSharedElementTargetNames;
    final int mTransition;
    final int mTransitionStyle;

    public final int describeContents() {
        return 0;
    }

    public BackStackState(Parcel parcel) {
        boolean z;
        this.mOps = parcel.createIntArray();
        this.mTransition = parcel.readInt();
        this.mTransitionStyle = parcel.readInt();
        this.mName = parcel.readString();
        this.mIndex = parcel.readInt();
        this.mBreadCrumbTitleRes = parcel.readInt();
        this.mBreadCrumbTitleText = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mBreadCrumbShortTitleRes = parcel.readInt();
        this.mBreadCrumbShortTitleText = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mSharedElementSourceNames = parcel.createStringArrayList();
        this.mSharedElementTargetNames = parcel.createStringArrayList();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.mReorderingAllowed = z;
    }

    public BackStackState(BackStackRecord backStackRecord) {
        int i;
        int size = backStackRecord.mOps.size();
        this.mOps = new int[(size * 6)];
        if (backStackRecord.mAddToBackStack) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                BackStackRecord.Op op = backStackRecord.mOps.get(i2);
                int i4 = i3 + 1;
                this.mOps[i3] = op.cmd;
                int[] iArr = this.mOps;
                int i5 = i4 + 1;
                if (op.fragment != null) {
                    i = op.fragment.mIndex;
                } else {
                    i = -1;
                }
                iArr[i4] = i;
                int i6 = i5 + 1;
                this.mOps[i5] = op.enterAnim;
                int i7 = i6 + 1;
                this.mOps[i6] = op.exitAnim;
                int i8 = i7 + 1;
                this.mOps[i7] = op.popEnterAnim;
                this.mOps[i8] = op.popExitAnim;
                i2++;
                i3 = i8 + 1;
            }
            this.mTransition = backStackRecord.mTransition;
            this.mTransitionStyle = backStackRecord.mTransitionStyle;
            this.mName = backStackRecord.mName;
            this.mIndex = backStackRecord.mIndex;
            this.mBreadCrumbTitleRes = backStackRecord.mBreadCrumbTitleRes;
            this.mBreadCrumbTitleText = backStackRecord.mBreadCrumbTitleText;
            this.mBreadCrumbShortTitleRes = backStackRecord.mBreadCrumbShortTitleRes;
            this.mBreadCrumbShortTitleText = backStackRecord.mBreadCrumbShortTitleText;
            this.mSharedElementSourceNames = backStackRecord.mSharedElementSourceNames;
            this.mSharedElementTargetNames = backStackRecord.mSharedElementTargetNames;
            this.mReorderingAllowed = backStackRecord.mReorderingAllowed;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public final BackStackRecord instantiate(FragmentManagerImpl fragmentManagerImpl) {
        BackStackRecord backStackRecord = new BackStackRecord(fragmentManagerImpl);
        int i = 0;
        while (i < this.mOps.length) {
            BackStackRecord.Op op = new BackStackRecord.Op();
            int i2 = i + 1;
            op.cmd = this.mOps[i];
            int i3 = i2 + 1;
            int i4 = this.mOps[i2];
            if (i4 >= 0) {
                op.fragment = fragmentManagerImpl.mActive.get(i4);
            } else {
                op.fragment = null;
            }
            int i5 = i3 + 1;
            op.enterAnim = this.mOps[i3];
            int i6 = i5 + 1;
            op.exitAnim = this.mOps[i5];
            int i7 = i6 + 1;
            op.popEnterAnim = this.mOps[i6];
            op.popExitAnim = this.mOps[i7];
            backStackRecord.mEnterAnim = op.enterAnim;
            backStackRecord.mExitAnim = op.exitAnim;
            backStackRecord.mPopEnterAnim = op.popEnterAnim;
            backStackRecord.mPopExitAnim = op.popExitAnim;
            backStackRecord.addOp(op);
            i = i7 + 1;
        }
        backStackRecord.mTransition = this.mTransition;
        backStackRecord.mTransitionStyle = this.mTransitionStyle;
        backStackRecord.mName = this.mName;
        backStackRecord.mIndex = this.mIndex;
        backStackRecord.mAddToBackStack = true;
        backStackRecord.mBreadCrumbTitleRes = this.mBreadCrumbTitleRes;
        backStackRecord.mBreadCrumbTitleText = this.mBreadCrumbTitleText;
        backStackRecord.mBreadCrumbShortTitleRes = this.mBreadCrumbShortTitleRes;
        backStackRecord.mBreadCrumbShortTitleText = this.mBreadCrumbShortTitleText;
        backStackRecord.mSharedElementSourceNames = this.mSharedElementSourceNames;
        backStackRecord.mSharedElementTargetNames = this.mSharedElementTargetNames;
        backStackRecord.mReorderingAllowed = this.mReorderingAllowed;
        backStackRecord.bumpBackStackNesting(1);
        return backStackRecord;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.mOps);
        parcel.writeInt(this.mTransition);
        parcel.writeInt(this.mTransitionStyle);
        parcel.writeString(this.mName);
        parcel.writeInt(this.mIndex);
        parcel.writeInt(this.mBreadCrumbTitleRes);
        TextUtils.writeToParcel(this.mBreadCrumbTitleText, parcel, 0);
        parcel.writeInt(this.mBreadCrumbShortTitleRes);
        TextUtils.writeToParcel(this.mBreadCrumbShortTitleText, parcel, 0);
        parcel.writeStringList(this.mSharedElementSourceNames);
        parcel.writeStringList(this.mSharedElementTargetNames);
        parcel.writeInt(this.mReorderingAllowed ? 1 : 0);
    }
}
