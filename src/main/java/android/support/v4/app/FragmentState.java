package android.support.v4.app;

import android.arch.lifecycle.ViewModelStore;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new Parcelable.Creator<FragmentState>() {
        public final FragmentState[] newArray(int i) {
            return new FragmentState[i];
        }

        public final FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }
    };
    final Bundle mArguments;
    final String mClassName;
    final int mContainerId;
    final boolean mDetached;
    final int mFragmentId;
    final boolean mFromLayout;
    final boolean mHidden;
    final int mIndex;
    Fragment mInstance;
    final boolean mRetainInstance;
    Bundle mSavedFragmentState;
    final String mTag;

    public final int describeContents() {
        return 0;
    }

    FragmentState(Fragment fragment) {
        this.mClassName = fragment.getClass().getName();
        this.mIndex = fragment.mIndex;
        this.mFromLayout = fragment.mFromLayout;
        this.mFragmentId = fragment.mFragmentId;
        this.mContainerId = fragment.mContainerId;
        this.mTag = fragment.mTag;
        this.mRetainInstance = fragment.mRetainInstance;
        this.mDetached = fragment.mDetached;
        this.mArguments = fragment.mArguments;
        this.mHidden = fragment.mHidden;
    }

    FragmentState(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        this.mClassName = parcel.readString();
        this.mIndex = parcel.readInt();
        boolean z4 = false;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.mFromLayout = z;
        this.mFragmentId = parcel.readInt();
        this.mContainerId = parcel.readInt();
        this.mTag = parcel.readString();
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mRetainInstance = z2;
        if (parcel.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.mDetached = z3;
        this.mArguments = parcel.readBundle();
        this.mHidden = parcel.readInt() != 0 ? true : z4;
        this.mSavedFragmentState = parcel.readBundle();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mClassName);
        parcel.writeInt(this.mIndex);
        parcel.writeInt(this.mFromLayout ? 1 : 0);
        parcel.writeInt(this.mFragmentId);
        parcel.writeInt(this.mContainerId);
        parcel.writeString(this.mTag);
        parcel.writeInt(this.mRetainInstance ? 1 : 0);
        parcel.writeInt(this.mDetached ? 1 : 0);
        parcel.writeBundle(this.mArguments);
        parcel.writeInt(this.mHidden ? 1 : 0);
        parcel.writeBundle(this.mSavedFragmentState);
    }

    public final Fragment instantiate(FragmentHostCallback fragmentHostCallback, FragmentContainer fragmentContainer, Fragment fragment, FragmentManagerNonConfig fragmentManagerNonConfig, ViewModelStore viewModelStore) {
        if (this.mInstance == null) {
            Context context = fragmentHostCallback.getContext();
            if (this.mArguments != null) {
                this.mArguments.setClassLoader(context.getClassLoader());
            }
            if (fragmentContainer != null) {
                this.mInstance = fragmentContainer.instantiate(context, this.mClassName, this.mArguments);
            } else {
                this.mInstance = Fragment.instantiate(context, this.mClassName, this.mArguments);
            }
            if (this.mSavedFragmentState != null) {
                this.mSavedFragmentState.setClassLoader(context.getClassLoader());
                this.mInstance.mSavedFragmentState = this.mSavedFragmentState;
            }
            this.mInstance.setIndex(this.mIndex, fragment);
            this.mInstance.mFromLayout = this.mFromLayout;
            this.mInstance.mRestored = true;
            this.mInstance.mFragmentId = this.mFragmentId;
            this.mInstance.mContainerId = this.mContainerId;
            this.mInstance.mTag = this.mTag;
            this.mInstance.mRetainInstance = this.mRetainInstance;
            this.mInstance.mDetached = this.mDetached;
            this.mInstance.mHidden = this.mHidden;
            this.mInstance.mFragmentManager = fragmentHostCallback.mFragmentManager;
        }
        this.mInstance.mChildNonConfig = fragmentManagerNonConfig;
        this.mInstance.mViewModelStore = viewModelStore;
        return this.mInstance;
    }
}
