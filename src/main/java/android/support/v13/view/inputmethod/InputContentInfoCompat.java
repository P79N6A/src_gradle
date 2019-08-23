package android.support.v13.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.view.inputmethod.InputContentInfo;

public final class InputContentInfoCompat {
    private final InputContentInfoCompatImpl mImpl;

    @RequiresApi(25)
    static final class InputContentInfoCompatApi25Impl implements InputContentInfoCompatImpl {
        @NonNull
        final InputContentInfo mObject;

        @Nullable
        public final Object getInputContentInfo() {
            return this.mObject;
        }

        @NonNull
        public final Uri getContentUri() {
            return this.mObject.getContentUri();
        }

        @NonNull
        public final ClipDescription getDescription() {
            return this.mObject.getDescription();
        }

        @Nullable
        public final Uri getLinkUri() {
            return this.mObject.getLinkUri();
        }

        public final void releasePermission() {
            this.mObject.releasePermission();
        }

        public final void requestPermission() {
            this.mObject.requestPermission();
        }

        InputContentInfoCompatApi25Impl(@NonNull Object obj) {
            this.mObject = (InputContentInfo) obj;
        }

        InputContentInfoCompatApi25Impl(@NonNull Uri uri, @NonNull ClipDescription clipDescription, @Nullable Uri uri2) {
            this.mObject = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    static final class InputContentInfoCompatBaseImpl implements InputContentInfoCompatImpl {
        @NonNull
        private final Uri mContentUri;
        @NonNull
        private final ClipDescription mDescription;
        @Nullable
        private final Uri mLinkUri;

        @Nullable
        public final Object getInputContentInfo() {
            return null;
        }

        public final void releasePermission() {
        }

        public final void requestPermission() {
        }

        @NonNull
        public final Uri getContentUri() {
            return this.mContentUri;
        }

        @NonNull
        public final ClipDescription getDescription() {
            return this.mDescription;
        }

        @Nullable
        public final Uri getLinkUri() {
            return this.mLinkUri;
        }

        InputContentInfoCompatBaseImpl(@NonNull Uri uri, @NonNull ClipDescription clipDescription, @Nullable Uri uri2) {
            this.mContentUri = uri;
            this.mDescription = clipDescription;
            this.mLinkUri = uri2;
        }
    }

    interface InputContentInfoCompatImpl {
        @NonNull
        Uri getContentUri();

        @NonNull
        ClipDescription getDescription();

        @Nullable
        Object getInputContentInfo();

        @Nullable
        Uri getLinkUri();

        void releasePermission();

        void requestPermission();
    }

    @NonNull
    public final Uri getContentUri() {
        return this.mImpl.getContentUri();
    }

    @NonNull
    public final ClipDescription getDescription() {
        return this.mImpl.getDescription();
    }

    @Nullable
    public final Uri getLinkUri() {
        return this.mImpl.getLinkUri();
    }

    public final void releasePermission() {
        this.mImpl.releasePermission();
    }

    public final void requestPermission() {
        this.mImpl.requestPermission();
    }

    @Nullable
    public final Object unwrap() {
        return this.mImpl.getInputContentInfo();
    }

    private InputContentInfoCompat(@NonNull InputContentInfoCompatImpl inputContentInfoCompatImpl) {
        this.mImpl = inputContentInfoCompatImpl;
    }

    @Nullable
    public static InputContentInfoCompat wrap(@Nullable Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new InputContentInfoCompat(new InputContentInfoCompatApi25Impl(obj));
        }
        return null;
    }

    public InputContentInfoCompat(@NonNull Uri uri, @NonNull ClipDescription clipDescription, @Nullable Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.mImpl = new InputContentInfoCompatApi25Impl(uri, clipDescription, uri2);
        } else {
            this.mImpl = new InputContentInfoCompatBaseImpl(uri, clipDescription, uri2);
        }
    }
}
