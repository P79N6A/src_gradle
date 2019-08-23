package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.v4.app.Person;
import android.support.v4.text.BidiFormatter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.widget.RemoteViews;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.bytex.a.a.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class NotificationCompat {

    public static class Action {
        public PendingIntent actionIntent;
        public int icon;
        private boolean mAllowGeneratedReplies;
        private final RemoteInput[] mDataOnlyRemoteInputs;
        final Bundle mExtras;
        private final RemoteInput[] mRemoteInputs;
        private final int mSemanticAction;
        boolean mShowsUserInterface;
        public CharSequence title;

        public static final class Builder {
            private boolean mAllowGeneratedReplies;
            private final Bundle mExtras;
            private final int mIcon;
            private final PendingIntent mIntent;
            private ArrayList<RemoteInput> mRemoteInputs;
            private int mSemanticAction;
            private boolean mShowsUserInterface;
            private final CharSequence mTitle;

            public final Bundle getExtras() {
                return this.mExtras;
            }

            /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object[]] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final android.support.v4.app.NotificationCompat.Action build() {
                /*
                    r14 = this;
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    java.util.ArrayList<android.support.v4.app.RemoteInput> r2 = r14.mRemoteInputs
                    if (r2 == 0) goto L_0x002e
                    java.util.ArrayList<android.support.v4.app.RemoteInput> r2 = r14.mRemoteInputs
                    java.util.Iterator r2 = r2.iterator()
                L_0x0014:
                    boolean r3 = r2.hasNext()
                    if (r3 == 0) goto L_0x002e
                    java.lang.Object r3 = r2.next()
                    android.support.v4.app.RemoteInput r3 = (android.support.v4.app.RemoteInput) r3
                    boolean r4 = r3.isDataOnly()
                    if (r4 == 0) goto L_0x002a
                    r0.add(r3)
                    goto L_0x0014
                L_0x002a:
                    r1.add(r3)
                    goto L_0x0014
                L_0x002e:
                    boolean r2 = r0.isEmpty()
                    r3 = 0
                    if (r2 == 0) goto L_0x0037
                    r10 = r3
                    goto L_0x0044
                L_0x0037:
                    int r2 = r0.size()
                    android.support.v4.app.RemoteInput[] r2 = new android.support.v4.app.RemoteInput[r2]
                    java.lang.Object[] r0 = r0.toArray(r2)
                    android.support.v4.app.RemoteInput[] r0 = (android.support.v4.app.RemoteInput[]) r0
                    r10 = r0
                L_0x0044:
                    boolean r0 = r1.isEmpty()
                    if (r0 == 0) goto L_0x004c
                L_0x004a:
                    r9 = r3
                    goto L_0x005a
                L_0x004c:
                    int r0 = r1.size()
                    android.support.v4.app.RemoteInput[] r0 = new android.support.v4.app.RemoteInput[r0]
                    java.lang.Object[] r0 = r1.toArray(r0)
                    r3 = r0
                    android.support.v4.app.RemoteInput[] r3 = (android.support.v4.app.RemoteInput[]) r3
                    goto L_0x004a
                L_0x005a:
                    android.support.v4.app.NotificationCompat$Action r0 = new android.support.v4.app.NotificationCompat$Action
                    int r5 = r14.mIcon
                    java.lang.CharSequence r6 = r14.mTitle
                    android.app.PendingIntent r7 = r14.mIntent
                    android.os.Bundle r8 = r14.mExtras
                    boolean r11 = r14.mAllowGeneratedReplies
                    int r12 = r14.mSemanticAction
                    boolean r13 = r14.mShowsUserInterface
                    r4 = r0
                    r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.NotificationCompat.Action.Builder.build():android.support.v4.app.NotificationCompat$Action");
            }

            public final Builder extend(Extender extender) {
                extender.extend(this);
                return this;
            }

            public final Builder setAllowGeneratedReplies(boolean z) {
                this.mAllowGeneratedReplies = z;
                return this;
            }

            public final Builder setSemanticAction(int i) {
                this.mSemanticAction = i;
                return this;
            }

            public final Builder setShowsUserInterface(boolean z) {
                this.mShowsUserInterface = z;
                return this;
            }

            public final Builder addExtras(Bundle bundle) {
                if (bundle != null) {
                    this.mExtras.putAll(bundle);
                }
                return this;
            }

            public final Builder addRemoteInput(RemoteInput remoteInput) {
                if (this.mRemoteInputs == null) {
                    this.mRemoteInputs = new ArrayList<>();
                }
                this.mRemoteInputs.add(remoteInput);
                return this;
            }

            public Builder(Action action) {
                this(action.icon, action.title, action.actionIntent, new Bundle(action.mExtras), action.getRemoteInputs(), action.getAllowGeneratedReplies(), action.getSemanticAction(), action.mShowsUserInterface);
            }

            public Builder(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i, charSequence, pendingIntent, new Bundle(), null, true, 0, true);
            }

            private Builder(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, boolean z, int i2, boolean z2) {
                ArrayList<RemoteInput> arrayList;
                this.mAllowGeneratedReplies = true;
                this.mShowsUserInterface = true;
                this.mIcon = i;
                this.mTitle = Builder.limitCharSequenceLength(charSequence);
                this.mIntent = pendingIntent;
                this.mExtras = bundle;
                if (remoteInputArr == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList<>(Arrays.asList(remoteInputArr));
                }
                this.mRemoteInputs = arrayList;
                this.mAllowGeneratedReplies = z;
                this.mSemanticAction = i2;
                this.mShowsUserInterface = z2;
            }
        }

        public interface Extender {
            Builder extend(Builder builder);
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface SemanticAction {
        }

        public static final class WearableExtender implements Extender {
            private CharSequence mCancelLabel;
            private CharSequence mConfirmLabel;
            private int mFlags = 1;
            private CharSequence mInProgressLabel;

            @Deprecated
            public final CharSequence getCancelLabel() {
                return this.mCancelLabel;
            }

            @Deprecated
            public final CharSequence getConfirmLabel() {
                return this.mConfirmLabel;
            }

            @Deprecated
            public final CharSequence getInProgressLabel() {
                return this.mInProgressLabel;
            }

            public WearableExtender() {
            }

            public final boolean getHintDisplayActionInline() {
                if ((this.mFlags & 4) != 0) {
                    return true;
                }
                return false;
            }

            public final boolean getHintLaunchesActivity() {
                if ((this.mFlags & 2) != 0) {
                    return true;
                }
                return false;
            }

            public final boolean isAvailableOffline() {
                if ((this.mFlags & 1) != 0) {
                    return true;
                }
                return false;
            }

            public final WearableExtender clone() {
                WearableExtender wearableExtender = new WearableExtender();
                wearableExtender.mFlags = this.mFlags;
                wearableExtender.mInProgressLabel = this.mInProgressLabel;
                wearableExtender.mConfirmLabel = this.mConfirmLabel;
                wearableExtender.mCancelLabel = this.mCancelLabel;
                return wearableExtender;
            }

            @Deprecated
            public final WearableExtender setCancelLabel(CharSequence charSequence) {
                this.mCancelLabel = charSequence;
                return this;
            }

            @Deprecated
            public final WearableExtender setConfirmLabel(CharSequence charSequence) {
                this.mConfirmLabel = charSequence;
                return this;
            }

            @Deprecated
            public final WearableExtender setInProgressLabel(CharSequence charSequence) {
                this.mInProgressLabel = charSequence;
                return this;
            }

            public final WearableExtender setAvailableOffline(boolean z) {
                setFlag(1, z);
                return this;
            }

            public final WearableExtender setHintDisplayActionInline(boolean z) {
                setFlag(4, z);
                return this;
            }

            public final WearableExtender setHintLaunchesActivity(boolean z) {
                setFlag(2, z);
                return this;
            }

            public WearableExtender(Action action) {
                Bundle bundle = action.getExtras().getBundle("android.wearable.EXTENSIONS");
                if (bundle != null) {
                    this.mFlags = bundle.getInt("flags", 1);
                    this.mInProgressLabel = bundle.getCharSequence("inProgressLabel");
                    this.mConfirmLabel = bundle.getCharSequence("confirmLabel");
                    this.mCancelLabel = bundle.getCharSequence("cancelLabel");
                }
            }

            public final Builder extend(Builder builder) {
                Bundle bundle = new Bundle();
                if (this.mFlags != 1) {
                    bundle.putInt("flags", this.mFlags);
                }
                if (this.mInProgressLabel != null) {
                    bundle.putCharSequence("inProgressLabel", this.mInProgressLabel);
                }
                if (this.mConfirmLabel != null) {
                    bundle.putCharSequence("confirmLabel", this.mConfirmLabel);
                }
                if (this.mCancelLabel != null) {
                    bundle.putCharSequence("cancelLabel", this.mCancelLabel);
                }
                builder.getExtras().putBundle("android.wearable.EXTENSIONS", bundle);
                return builder;
            }

            private void setFlag(int i, boolean z) {
                if (z) {
                    this.mFlags = i | this.mFlags;
                    return;
                }
                this.mFlags = (i ^ -1) & this.mFlags;
            }
        }

        public PendingIntent getActionIntent() {
            return this.actionIntent;
        }

        public boolean getAllowGeneratedReplies() {
            return this.mAllowGeneratedReplies;
        }

        public RemoteInput[] getDataOnlyRemoteInputs() {
            return this.mDataOnlyRemoteInputs;
        }

        public Bundle getExtras() {
            return this.mExtras;
        }

        public int getIcon() {
            return this.icon;
        }

        public RemoteInput[] getRemoteInputs() {
            return this.mRemoteInputs;
        }

        public int getSemanticAction() {
            return this.mSemanticAction;
        }

        public boolean getShowsUserInterface() {
            return this.mShowsUserInterface;
        }

        public CharSequence getTitle() {
            return this.title;
        }

        public Action(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true);
        }

        Action(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, RemoteInput[] remoteInputArr2, boolean z, int i2, boolean z2) {
            this.mShowsUserInterface = true;
            this.icon = i;
            this.title = Builder.limitCharSequenceLength(charSequence);
            this.actionIntent = pendingIntent;
            this.mExtras = bundle == null ? new Bundle() : bundle;
            this.mRemoteInputs = remoteInputArr;
            this.mDataOnlyRemoteInputs = remoteInputArr2;
            this.mAllowGeneratedReplies = z;
            this.mSemanticAction = i2;
            this.mShowsUserInterface = z2;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface BadgeIconType {
    }

    public static class BigPictureStyle extends Style {
        private Bitmap mBigLargeIcon;
        private boolean mBigLargeIconSet;
        private Bitmap mPicture;

        public BigPictureStyle() {
        }

        public BigPictureStyle bigPicture(Bitmap bitmap) {
            this.mPicture = bitmap;
            return this;
        }

        public BigPictureStyle(Builder builder) {
            setBuilder(builder);
        }

        public BigPictureStyle bigLargeIcon(Bitmap bitmap) {
            this.mBigLargeIcon = bitmap;
            this.mBigLargeIconSet = true;
            return this;
        }

        public BigPictureStyle setBigContentTitle(CharSequence charSequence) {
            this.mBigContentTitle = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        public BigPictureStyle setSummaryText(CharSequence charSequence) {
            this.mSummaryText = Builder.limitCharSequenceLength(charSequence);
            this.mSummaryTextSet = true;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(this.mBigContentTitle).bigPicture(this.mPicture);
                if (this.mBigLargeIconSet) {
                    bigPicture.bigLargeIcon(this.mBigLargeIcon);
                }
                if (this.mSummaryTextSet) {
                    bigPicture.setSummaryText(this.mSummaryText);
                }
            }
        }
    }

    public static class BigTextStyle extends Style {
        private CharSequence mBigText;

        public BigTextStyle() {
        }

        public BigTextStyle(Builder builder) {
            setBuilder(builder);
        }

        public BigTextStyle bigText(CharSequence charSequence) {
            this.mBigText = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        public BigTextStyle setBigContentTitle(CharSequence charSequence) {
            this.mBigContentTitle = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        public BigTextStyle setSummaryText(CharSequence charSequence) {
            this.mSummaryText = Builder.limitCharSequenceLength(charSequence);
            this.mSummaryTextSet = true;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(this.mBigContentTitle).bigText(this.mBigText);
                if (this.mSummaryTextSet) {
                    bigText.setSummaryText(this.mSummaryText);
                }
            }
        }
    }

    public static class Builder {
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public ArrayList<Action> mActions;
        int mBadgeIcon;
        RemoteViews mBigContentView;
        String mCategory;
        String mChannelId;
        int mColor;
        boolean mColorized;
        boolean mColorizedSet;
        CharSequence mContentInfo;
        PendingIntent mContentIntent;
        CharSequence mContentText;
        CharSequence mContentTitle;
        RemoteViews mContentView;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Context mContext;
        Bundle mExtras;
        PendingIntent mFullScreenIntent;
        int mGroupAlertBehavior;
        String mGroupKey;
        boolean mGroupSummary;
        RemoteViews mHeadsUpContentView;
        ArrayList<Action> mInvisibleActions;
        Bitmap mLargeIcon;
        boolean mLocalOnly;
        Notification mNotification;
        int mNumber;
        @Deprecated
        public ArrayList<String> mPeople;
        int mPriority;
        int mProgress;
        boolean mProgressIndeterminate;
        int mProgressMax;
        Notification mPublicVersion;
        CharSequence[] mRemoteInputHistory;
        String mShortcutId;
        boolean mShowWhen;
        String mSortKey;
        Style mStyle;
        CharSequence mSubText;
        RemoteViews mTickerView;
        long mTimeout;
        boolean mUseChronometer;
        int mVisibility;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews getBigContentView() {
            return this.mBigContentView;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public int getColor() {
            return this.mColor;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews getContentView() {
            return this.mContentView;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews getHeadsUpContentView() {
            return this.mHeadsUpContentView;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public int getPriority() {
            return this.mPriority;
        }

        @Deprecated
        public Notification getNotification() {
            return build();
        }

        public Notification build() {
            return new NotificationCompatBuilder(this).build();
        }

        public Bundle getExtras() {
            if (this.mExtras == null) {
                this.mExtras = new Bundle();
            }
            return this.mExtras;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public long getWhenIfShowing() {
            if (this.mShowWhen) {
                return this.mNotification.when;
            }
            return 0;
        }

        public Builder extend(Extender extender) {
            extender.extend(this);
            return this;
        }

        public Builder setBadgeIconType(int i) {
            this.mBadgeIcon = i;
            return this;
        }

        public Builder setCategory(String str) {
            this.mCategory = str;
            return this;
        }

        public Builder setChannelId(@NonNull String str) {
            this.mChannelId = str;
            return this;
        }

        public Builder setColor(@ColorInt int i) {
            this.mColor = i;
            return this;
        }

        public Builder setContentIntent(PendingIntent pendingIntent) {
            this.mContentIntent = pendingIntent;
            return this;
        }

        public Builder setCustomBigContentView(RemoteViews remoteViews) {
            this.mBigContentView = remoteViews;
            return this;
        }

        public Builder setCustomContentView(RemoteViews remoteViews) {
            this.mContentView = remoteViews;
            return this;
        }

        public Builder setCustomHeadsUpContentView(RemoteViews remoteViews) {
            this.mHeadsUpContentView = remoteViews;
            return this;
        }

        public Builder setExtras(Bundle bundle) {
            this.mExtras = bundle;
            return this;
        }

        public Builder setGroup(String str) {
            this.mGroupKey = str;
            return this;
        }

        public Builder setGroupAlertBehavior(int i) {
            this.mGroupAlertBehavior = i;
            return this;
        }

        public Builder setGroupSummary(boolean z) {
            this.mGroupSummary = z;
            return this;
        }

        public Builder setLocalOnly(boolean z) {
            this.mLocalOnly = z;
            return this;
        }

        public Builder setNumber(int i) {
            this.mNumber = i;
            return this;
        }

        public Builder setPriority(int i) {
            this.mPriority = i;
            return this;
        }

        public Builder setPublicVersion(Notification notification) {
            this.mPublicVersion = notification;
            return this;
        }

        public Builder setRemoteInputHistory(CharSequence[] charSequenceArr) {
            this.mRemoteInputHistory = charSequenceArr;
            return this;
        }

        public Builder setShortcutId(String str) {
            this.mShortcutId = str;
            return this;
        }

        public Builder setShowWhen(boolean z) {
            this.mShowWhen = z;
            return this;
        }

        public Builder setSortKey(String str) {
            this.mSortKey = str;
            return this;
        }

        public Builder setTimeoutAfter(long j) {
            this.mTimeout = j;
            return this;
        }

        public Builder setUsesChronometer(boolean z) {
            this.mUseChronometer = z;
            return this;
        }

        public Builder setVisibility(int i) {
            this.mVisibility = i;
            return this;
        }

        @Deprecated
        public Builder(Context context) {
            this(context, null);
        }

        public Builder addAction(Action action) {
            this.mActions.add(action);
            return this;
        }

        @RequiresApi(21)
        public Builder addInvisibleAction(Action action) {
            this.mInvisibleActions.add(action);
            return this;
        }

        public Builder addPerson(String str) {
            this.mPeople.add(str);
            return this;
        }

        public Builder setAutoCancel(boolean z) {
            setFlag(16, z);
            return this;
        }

        public Builder setColorized(boolean z) {
            this.mColorized = z;
            this.mColorizedSet = true;
            return this;
        }

        public Builder setContent(RemoteViews remoteViews) {
            this.mNotification.contentView = remoteViews;
            return this;
        }

        public Builder setContentInfo(CharSequence charSequence) {
            this.mContentInfo = limitCharSequenceLength(charSequence);
            return this;
        }

        public Builder setContentText(CharSequence charSequence) {
            this.mContentText = limitCharSequenceLength(charSequence);
            return this;
        }

        public Builder setContentTitle(CharSequence charSequence) {
            this.mContentTitle = limitCharSequenceLength(charSequence);
            return this;
        }

        public Builder setDeleteIntent(PendingIntent pendingIntent) {
            this.mNotification.deleteIntent = pendingIntent;
            return this;
        }

        public Builder setLargeIcon(Bitmap bitmap) {
            this.mLargeIcon = reduceLargeIconSize(bitmap);
            return this;
        }

        public Builder setOngoing(boolean z) {
            setFlag(2, z);
            return this;
        }

        public Builder setOnlyAlertOnce(boolean z) {
            setFlag(8, z);
            return this;
        }

        public Builder setSmallIcon(int i) {
            this.mNotification.icon = i;
            return this;
        }

        public Builder setSubText(CharSequence charSequence) {
            this.mSubText = limitCharSequenceLength(charSequence);
            return this;
        }

        public Builder setVibrate(long[] jArr) {
            this.mNotification.vibrate = jArr;
            return this;
        }

        public Builder setWhen(long j) {
            this.mNotification.when = j;
            return this;
        }

        public Builder setStyle(Style style) {
            if (this.mStyle != style) {
                this.mStyle = style;
                if (this.mStyle != null) {
                    this.mStyle.setBuilder(this);
                }
            }
            return this;
        }

        public Builder setTicker(CharSequence charSequence) {
            this.mNotification.tickerText = limitCharSequenceLength(charSequence);
            return this;
        }

        protected static CharSequence limitCharSequenceLength(CharSequence charSequence) {
            if (charSequence == null) {
                return charSequence;
            }
            if (charSequence.length() > 5120) {
                charSequence = charSequence.subSequence(0, 5120);
            }
            return charSequence;
        }

        public Builder addExtras(Bundle bundle) {
            if (bundle != null) {
                if (this.mExtras == null) {
                    this.mExtras = new Bundle(bundle);
                } else {
                    this.mExtras.putAll(bundle);
                }
            }
            return this;
        }

        public Builder setDefaults(int i) {
            this.mNotification.defaults = i;
            if ((i & 4) != 0) {
                this.mNotification.flags |= 1;
            }
            return this;
        }

        public Builder setSound(Uri uri) {
            this.mNotification.sound = uri;
            this.mNotification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                this.mNotification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        private Bitmap reduceLargeIconSize(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.mContext.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C0906R.dimen.d2);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C0906R.dimen.d1);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double d2 = (double) dimensionPixelSize;
            double max = (double) Math.max(1, bitmap.getWidth());
            Double.isNaN(d2);
            Double.isNaN(max);
            double d3 = d2 / max;
            double d4 = (double) dimensionPixelSize2;
            double max2 = (double) Math.max(1, bitmap.getHeight());
            Double.isNaN(d4);
            Double.isNaN(max2);
            double min = Math.min(d3, d4 / max2);
            double width = (double) bitmap.getWidth();
            Double.isNaN(width);
            double height = (double) bitmap.getHeight();
            Double.isNaN(height);
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(width * min), (int) Math.ceil(height * min), true);
        }

        public Builder setFullScreenIntent(PendingIntent pendingIntent, boolean z) {
            this.mFullScreenIntent = pendingIntent;
            setFlag(SearchJediMixFeedAdapter.f42517f, z);
            return this;
        }

        public Builder setSmallIcon(int i, int i2) {
            this.mNotification.icon = i;
            this.mNotification.iconLevel = i2;
            return this;
        }

        private void setFlag(int i, boolean z) {
            if (z) {
                Notification notification = this.mNotification;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.mNotification;
            notification2.flags = (i ^ -1) & notification2.flags;
        }

        public Builder setTicker(CharSequence charSequence, RemoteViews remoteViews) {
            this.mNotification.tickerText = limitCharSequenceLength(charSequence);
            this.mTickerView = remoteViews;
            return this;
        }

        public Builder(@NonNull Context context, @NonNull String str) {
            this.mActions = new ArrayList<>();
            this.mInvisibleActions = new ArrayList<>();
            this.mShowWhen = true;
            this.mLocalOnly = false;
            this.mColor = 0;
            this.mVisibility = 0;
            this.mBadgeIcon = 0;
            this.mGroupAlertBehavior = 0;
            this.mNotification = new Notification();
            this.mContext = context;
            this.mChannelId = str;
            this.mNotification.when = System.currentTimeMillis();
            this.mNotification.audioStreamType = -1;
            this.mPriority = 0;
            this.mPeople = new ArrayList<>();
        }

        public Builder setSound(Uri uri, int i) {
            this.mNotification.sound = uri;
            this.mNotification.audioStreamType = i;
            if (Build.VERSION.SDK_INT >= 21) {
                this.mNotification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(i).build();
            }
            return this;
        }

        public Builder setProgress(int i, int i2, boolean z) {
            this.mProgressMax = i;
            this.mProgress = i2;
            this.mProgressIndeterminate = z;
            return this;
        }

        public Builder addAction(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.mActions.add(new Action(i, charSequence, pendingIntent));
            return this;
        }

        @RequiresApi(21)
        public Builder addInvisibleAction(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            return addInvisibleAction(new Action(i, charSequence, pendingIntent));
        }

        public Builder setLights(@ColorInt int i, int i2, int i3) {
            int i4;
            this.mNotification.ledARGB = i;
            this.mNotification.ledOnMS = i2;
            this.mNotification.ledOffMS = i3;
            if (this.mNotification.ledOnMS == 0 || this.mNotification.ledOffMS == 0) {
                i4 = 0;
            } else {
                i4 = 1;
            }
            this.mNotification.flags = i4 | (this.mNotification.flags & -2);
            return this;
        }
    }

    public static final class CarExtender implements Extender {
        private int mColor;
        private Bitmap mLargeIcon;
        private UnreadConversation mUnreadConversation;

        public static class UnreadConversation {
            private final long mLatestTimestamp;
            private final String[] mMessages;
            private final String[] mParticipants;
            private final PendingIntent mReadPendingIntent;
            private final RemoteInput mRemoteInput;
            private final PendingIntent mReplyPendingIntent;

            public static class Builder {
                private long mLatestTimestamp;
                private final List<String> mMessages = new ArrayList();
                private final String mParticipant;
                private PendingIntent mReadPendingIntent;
                private RemoteInput mRemoteInput;
                private PendingIntent mReplyPendingIntent;

                public UnreadConversation build() {
                    UnreadConversation unreadConversation = new UnreadConversation((String[]) this.mMessages.toArray(new String[this.mMessages.size()]), this.mRemoteInput, this.mReplyPendingIntent, this.mReadPendingIntent, new String[]{this.mParticipant}, this.mLatestTimestamp);
                    return unreadConversation;
                }

                public Builder setLatestTimestamp(long j) {
                    this.mLatestTimestamp = j;
                    return this;
                }

                public Builder setReadPendingIntent(PendingIntent pendingIntent) {
                    this.mReadPendingIntent = pendingIntent;
                    return this;
                }

                public Builder addMessage(String str) {
                    this.mMessages.add(str);
                    return this;
                }

                public Builder(String str) {
                    this.mParticipant = str;
                }

                public Builder setReplyAction(PendingIntent pendingIntent, RemoteInput remoteInput) {
                    this.mRemoteInput = remoteInput;
                    this.mReplyPendingIntent = pendingIntent;
                    return this;
                }
            }

            public long getLatestTimestamp() {
                return this.mLatestTimestamp;
            }

            public String[] getMessages() {
                return this.mMessages;
            }

            public String[] getParticipants() {
                return this.mParticipants;
            }

            public PendingIntent getReadPendingIntent() {
                return this.mReadPendingIntent;
            }

            public RemoteInput getRemoteInput() {
                return this.mRemoteInput;
            }

            public PendingIntent getReplyPendingIntent() {
                return this.mReplyPendingIntent;
            }

            public String getParticipant() {
                if (this.mParticipants.length > 0) {
                    return this.mParticipants[0];
                }
                return null;
            }

            UnreadConversation(String[] strArr, RemoteInput remoteInput, PendingIntent pendingIntent, PendingIntent pendingIntent2, String[] strArr2, long j) {
                this.mMessages = strArr;
                this.mRemoteInput = remoteInput;
                this.mReadPendingIntent = pendingIntent2;
                this.mReplyPendingIntent = pendingIntent;
                this.mParticipants = strArr2;
                this.mLatestTimestamp = j;
            }
        }

        public CarExtender() {
        }

        @ColorInt
        public final int getColor() {
            return this.mColor;
        }

        public final Bitmap getLargeIcon() {
            return this.mLargeIcon;
        }

        public final UnreadConversation getUnreadConversation() {
            return this.mUnreadConversation;
        }

        public final CarExtender setColor(@ColorInt int i) {
            this.mColor = i;
            return this;
        }

        public final CarExtender setLargeIcon(Bitmap bitmap) {
            this.mLargeIcon = bitmap;
            return this;
        }

        public final CarExtender setUnreadConversation(UnreadConversation unreadConversation) {
            this.mUnreadConversation = unreadConversation;
            return this;
        }

        public CarExtender(Notification notification) {
            Bundle bundle;
            if (Build.VERSION.SDK_INT >= 21) {
                if (NotificationCompat.getExtras(notification) == null) {
                    bundle = null;
                } else {
                    bundle = NotificationCompat.getExtras(notification).getBundle("android.car.EXTENSIONS");
                }
                if (bundle != null) {
                    this.mLargeIcon = (Bitmap) bundle.getParcelable("large_icon");
                    this.mColor = bundle.getInt("app_color", 0);
                    this.mUnreadConversation = getUnreadConversationFromBundle(bundle.getBundle("car_conversation"));
                }
            }
        }

        public final Builder extend(Builder builder) {
            if (Build.VERSION.SDK_INT < 21) {
                return builder;
            }
            Bundle bundle = new Bundle();
            if (this.mLargeIcon != null) {
                bundle.putParcelable("large_icon", this.mLargeIcon);
            }
            if (this.mColor != 0) {
                bundle.putInt("app_color", this.mColor);
            }
            if (this.mUnreadConversation != null) {
                bundle.putBundle("car_conversation", getBundleForUnreadConversation(this.mUnreadConversation));
            }
            builder.getExtras().putBundle("android.car.EXTENSIONS", bundle);
            return builder;
        }

        @RequiresApi(21)
        private static Bundle getBundleForUnreadConversation(@NonNull UnreadConversation unreadConversation) {
            String str;
            Bundle bundle = new Bundle();
            if (unreadConversation.getParticipants() == null || unreadConversation.getParticipants().length <= 1) {
                str = null;
            } else {
                str = unreadConversation.getParticipants()[0];
            }
            Parcelable[] parcelableArr = new Parcelable[unreadConversation.getMessages().length];
            for (int i = 0; i < parcelableArr.length; i++) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("text", unreadConversation.getMessages()[i]);
                bundle2.putString("author", str);
                parcelableArr[i] = bundle2;
            }
            bundle.putParcelableArray("messages", parcelableArr);
            RemoteInput remoteInput = unreadConversation.getRemoteInput();
            if (remoteInput != null) {
                bundle.putParcelable("remote_input", new RemoteInput.Builder(remoteInput.getResultKey()).setLabel(remoteInput.getLabel()).setChoices(remoteInput.getChoices()).setAllowFreeFormInput(remoteInput.getAllowFreeFormInput()).addExtras(remoteInput.getExtras()).build());
            }
            bundle.putParcelable("on_reply", unreadConversation.getReplyPendingIntent());
            bundle.putParcelable("on_read", unreadConversation.getReadPendingIntent());
            bundle.putStringArray("participants", unreadConversation.getParticipants());
            bundle.putLong("timestamp", unreadConversation.getLatestTimestamp());
            return bundle;
        }

        @RequiresApi(21)
        private static UnreadConversation getUnreadConversationFromBundle(@Nullable Bundle bundle) {
            String[] strArr;
            Bundle bundle2 = bundle;
            RemoteInput remoteInput = null;
            if (bundle2 == null) {
                return null;
            }
            Parcelable[] parcelableArray = bundle2.getParcelableArray("messages");
            if (parcelableArray != null) {
                String[] strArr2 = new String[parcelableArray.length];
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= strArr2.length) {
                        z = true;
                        break;
                    } else if (!(parcelableArray[i] instanceof Bundle)) {
                        break;
                    } else {
                        strArr2[i] = ((Bundle) parcelableArray[i]).getString("text");
                        if (strArr2[i] == null) {
                            break;
                        }
                        i++;
                    }
                }
                if (!z) {
                    return null;
                }
                strArr = strArr2;
            } else {
                strArr = null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle2.getParcelable("on_read");
            PendingIntent pendingIntent2 = (PendingIntent) bundle2.getParcelable("on_reply");
            RemoteInput remoteInput2 = (RemoteInput) bundle2.getParcelable("remote_input");
            String[] stringArray = bundle2.getStringArray("participants");
            if (stringArray == null || stringArray.length != 1) {
                return null;
            }
            if (remoteInput2 != null) {
                remoteInput = new RemoteInput(remoteInput2.getResultKey(), remoteInput2.getLabel(), remoteInput2.getChoices(), remoteInput2.getAllowFreeFormInput(), remoteInput2.getExtras(), null);
            }
            UnreadConversation unreadConversation = new UnreadConversation(strArr, remoteInput, pendingIntent2, pendingIntent, stringArray, bundle2.getLong("timestamp"));
            return unreadConversation;
        }
    }

    public static class DecoratedCustomViewStyle extends Style {
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (Build.VERSION.SDK_INT >= 24) {
                notificationBuilderWithBuilderAccessor.getBuilder().setStyle(new Notification.DecoratedCustomViewStyle());
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews bigContentView = this.mBuilder.getBigContentView();
            if (bigContentView == null) {
                bigContentView = this.mBuilder.getContentView();
            }
            if (bigContentView == null) {
                return null;
            }
            return createRemoteViews(bigContentView, true);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (Build.VERSION.SDK_INT < 24 && this.mBuilder.getContentView() != null) {
                return createRemoteViews(this.mBuilder.getContentView(), false);
            }
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            RemoteViews remoteViews;
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews headsUpContentView = this.mBuilder.getHeadsUpContentView();
            if (headsUpContentView != null) {
                remoteViews = headsUpContentView;
            } else {
                remoteViews = this.mBuilder.getContentView();
            }
            if (headsUpContentView == null) {
                return null;
            }
            return createRemoteViews(remoteViews, true);
        }

        private RemoteViews generateActionButton(Action action) {
            boolean z;
            int i;
            if (action.actionIntent == null) {
                z = true;
            } else {
                z = false;
            }
            String packageName = this.mBuilder.mContext.getPackageName();
            if (z) {
                i = C0906R.layout.aaz;
            } else {
                i = C0906R.layout.aay;
            }
            RemoteViews remoteViews = new RemoteViews(packageName, i);
            remoteViews.setImageViewBitmap(C0906R.id.ad, createColoredBitmap(action.getIcon(), this.mBuilder.mContext.getResources().getColor(C0906R.color.x_)));
            remoteViews.setTextViewText(C0906R.id.al, action.title);
            if (!z) {
                remoteViews.setOnClickPendingIntent(C0906R.id.aa, action.actionIntent);
            }
            if (Build.VERSION.SDK_INT >= 15) {
                remoteViews.setContentDescription(C0906R.id.aa, action.title);
            }
            return remoteViews;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0041  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private android.widget.RemoteViews createRemoteViews(android.widget.RemoteViews r7, boolean r8) {
            /*
                r6 = this;
                r0 = 1
                r1 = 0
                r2 = 2131690930(0x7f0f05b2, float:1.9010918E38)
                android.widget.RemoteViews r2 = r6.applyStandardTemplate(r0, r2, r1)
                r3 = 2131165233(0x7f070031, float:1.7944677E38)
                r2.removeAllViews(r3)
                if (r8 == 0) goto L_0x003d
                android.support.v4.app.NotificationCompat$Builder r8 = r6.mBuilder
                java.util.ArrayList<android.support.v4.app.NotificationCompat$Action> r8 = r8.mActions
                if (r8 == 0) goto L_0x003d
                android.support.v4.app.NotificationCompat$Builder r8 = r6.mBuilder
                java.util.ArrayList<android.support.v4.app.NotificationCompat$Action> r8 = r8.mActions
                int r8 = r8.size()
                r4 = 3
                int r8 = java.lang.Math.min(r8, r4)
                if (r8 <= 0) goto L_0x003d
                r4 = 0
            L_0x0027:
                if (r4 >= r8) goto L_0x003e
                android.support.v4.app.NotificationCompat$Builder r5 = r6.mBuilder
                java.util.ArrayList<android.support.v4.app.NotificationCompat$Action> r5 = r5.mActions
                java.lang.Object r5 = r5.get(r4)
                android.support.v4.app.NotificationCompat$Action r5 = (android.support.v4.app.NotificationCompat.Action) r5
                android.widget.RemoteViews r5 = r6.generateActionButton(r5)
                r2.addView(r3, r5)
                int r4 = r4 + 1
                goto L_0x0027
            L_0x003d:
                r0 = 0
            L_0x003e:
                if (r0 == 0) goto L_0x0041
                goto L_0x0043
            L_0x0041:
                r1 = 8
            L_0x0043:
                r2.setViewVisibility(r3, r1)
                r8 = 2131165223(0x7f070027, float:1.7944657E38)
                r2.setViewVisibility(r8, r1)
                r6.buildIntoRemoteViews(r2, r7)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.NotificationCompat.DecoratedCustomViewStyle.createRemoteViews(android.widget.RemoteViews, boolean):android.widget.RemoteViews");
        }
    }

    public interface Extender {
        Builder extend(Builder builder);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface GroupAlertBehavior {
    }

    public static class InboxStyle extends Style {
        private ArrayList<CharSequence> mTexts = new ArrayList<>();

        public InboxStyle() {
        }

        public InboxStyle setBigContentTitle(CharSequence charSequence) {
            this.mBigContentTitle = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        public InboxStyle addLine(CharSequence charSequence) {
            this.mTexts.add(Builder.limitCharSequenceLength(charSequence));
            return this;
        }

        public InboxStyle setSummaryText(CharSequence charSequence) {
            this.mSummaryText = Builder.limitCharSequenceLength(charSequence);
            this.mSummaryTextSet = true;
            return this;
        }

        public InboxStyle(Builder builder) {
            setBuilder(builder);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(this.mBigContentTitle);
                if (this.mSummaryTextSet) {
                    bigContentTitle.setSummaryText(this.mSummaryText);
                }
                Iterator<CharSequence> it2 = this.mTexts.iterator();
                while (it2.hasNext()) {
                    bigContentTitle.addLine(it2.next());
                }
            }
        }
    }

    public static class MessagingStyle extends Style {
        @Nullable
        private CharSequence mConversationTitle;
        @Nullable
        private Boolean mIsGroupConversation;
        private final List<Message> mMessages = new ArrayList();
        private Person mUser;

        public static final class Message {
            @Nullable
            private String mDataMimeType;
            @Nullable
            private Uri mDataUri;
            private Bundle mExtras;
            @Nullable
            private final Person mPerson;
            private final CharSequence mText;
            private final long mTimestamp;

            @Nullable
            public final String getDataMimeType() {
                return this.mDataMimeType;
            }

            @Nullable
            public final Uri getDataUri() {
                return this.mDataUri;
            }

            @NonNull
            public final Bundle getExtras() {
                return this.mExtras;
            }

            @Nullable
            public final Person getPerson() {
                return this.mPerson;
            }

            @NonNull
            public final CharSequence getText() {
                return this.mText;
            }

            public final long getTimestamp() {
                return this.mTimestamp;
            }

            @Nullable
            @Deprecated
            public final CharSequence getSender() {
                if (this.mPerson == null) {
                    return null;
                }
                return this.mPerson.getName();
            }

            private Bundle toBundle() {
                Bundle bundle = new Bundle();
                if (this.mText != null) {
                    bundle.putCharSequence("text", this.mText);
                }
                bundle.putLong("time", this.mTimestamp);
                if (this.mPerson != null) {
                    bundle.putCharSequence("sender", this.mPerson.getName());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", this.mPerson.toAndroidPerson());
                    } else {
                        bundle.putBundle("person", this.mPerson.toBundle());
                    }
                }
                if (this.mDataMimeType != null) {
                    bundle.putString("type", this.mDataMimeType);
                }
                if (this.mDataUri != null) {
                    bundle.putParcelable("uri", this.mDataUri);
                }
                if (this.mExtras != null) {
                    bundle.putBundle("extras", this.mExtras);
                }
                return bundle;
            }

            @NonNull
            static Bundle[] getBundleArrayForMessages(List<Message> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bundleArr[i] = list.get(i).toBundle();
                }
                return bundleArr;
            }

            @NonNull
            static List<Message> getMessagesFromBundleArray(Parcelable[] parcelableArr) {
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (int i = 0; i < parcelableArr.length; i++) {
                    if (parcelableArr[i] instanceof Bundle) {
                        Message messageFromBundle = getMessageFromBundle(parcelableArr[i]);
                        if (messageFromBundle != null) {
                            arrayList.add(messageFromBundle);
                        }
                    }
                }
                return arrayList;
            }

            @Nullable
            static Message getMessageFromBundle(Bundle bundle) {
                Person person;
                try {
                    if (bundle.containsKey("text")) {
                        if (bundle.containsKey("time")) {
                            if (bundle.containsKey("person")) {
                                person = Person.fromBundle(bundle.getBundle("person"));
                            } else if (bundle.containsKey("sender_person") && Build.VERSION.SDK_INT >= 28) {
                                person = Person.fromAndroidPerson((Person) bundle.getParcelable("sender_person"));
                            } else if (bundle.containsKey("sender")) {
                                person = new Person.Builder().setName(bundle.getCharSequence("sender")).build();
                            } else {
                                person = null;
                            }
                            Message message = new Message(bundle.getCharSequence("text"), bundle.getLong("time"), person);
                            if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                                message.setData(bundle.getString("type"), (Uri) bundle.getParcelable("uri"));
                            }
                            if (bundle.containsKey("extras")) {
                                message.getExtras().putAll(bundle.getBundle("extras"));
                            }
                            return message;
                        }
                    }
                    return null;
                } catch (ClassCastException unused) {
                    return null;
                }
            }

            public final Message setData(String str, Uri uri) {
                this.mDataMimeType = str;
                this.mDataUri = uri;
                return this;
            }

            public Message(CharSequence charSequence, long j, @Nullable Person person) {
                this.mExtras = new Bundle();
                this.mText = charSequence;
                this.mTimestamp = j;
                this.mPerson = person;
            }

            @Deprecated
            public Message(CharSequence charSequence, long j, CharSequence charSequence2) {
                this(charSequence, j, new Person.Builder().setName(charSequence2).build());
            }
        }

        @Nullable
        public CharSequence getConversationTitle() {
            return this.mConversationTitle;
        }

        public List<Message> getMessages() {
            return this.mMessages;
        }

        public Person getUser() {
            return this.mUser;
        }

        @Deprecated
        public CharSequence getUserDisplayName() {
            return this.mUser.getName();
        }

        private MessagingStyle() {
        }

        private boolean hasMessagesWithoutSender() {
            for (int size = this.mMessages.size() - 1; size >= 0; size--) {
                Message message = this.mMessages.get(size);
                if (message.getPerson() != null && message.getPerson().getName() == null) {
                    return true;
                }
            }
            return false;
        }

        public boolean isGroupConversation() {
            if (this.mBuilder == null || this.mBuilder.mContext.getApplicationInfo().targetSdkVersion >= 28 || this.mIsGroupConversation != null) {
                if (this.mIsGroupConversation != null) {
                    return this.mIsGroupConversation.booleanValue();
                }
                return false;
            } else if (this.mConversationTitle != null) {
                return true;
            } else {
                return false;
            }
        }

        @Nullable
        private Message findLatestIncomingMessage() {
            for (int size = this.mMessages.size() - 1; size >= 0; size--) {
                Message message = this.mMessages.get(size);
                if (message.getPerson() != null && !TextUtils.isEmpty(message.getPerson().getName())) {
                    return message;
                }
            }
            if (!this.mMessages.isEmpty()) {
                return this.mMessages.get(this.mMessages.size() - 1);
            }
            return null;
        }

        public MessagingStyle setConversationTitle(@Nullable CharSequence charSequence) {
            this.mConversationTitle = charSequence;
            return this;
        }

        public MessagingStyle setGroupConversation(boolean z) {
            this.mIsGroupConversation = Boolean.valueOf(z);
            return this;
        }

        @NonNull
        private TextAppearanceSpan makeFontColorSpan(int i) {
            TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i), null);
            return textAppearanceSpan;
        }

        public MessagingStyle(@NonNull Person person) {
            if (!TextUtils.isEmpty(person.getName())) {
                this.mUser = person;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }

        public MessagingStyle addMessage(Message message) {
            this.mMessages.add(message);
            if (this.mMessages.size() > 25) {
                this.mMessages.remove(0);
            }
            return this;
        }

        @Deprecated
        public MessagingStyle(@NonNull CharSequence charSequence) {
            this.mUser = new Person.Builder().setName(charSequence).build();
        }

        @Nullable
        public static MessagingStyle extractMessagingStyleFromNotification(Notification notification) {
            Bundle extras = NotificationCompat.getExtras(notification);
            if (extras != null && !extras.containsKey("android.selfDisplayName") && !extras.containsKey("android.messagingStyleUser")) {
                return null;
            }
            try {
                MessagingStyle messagingStyle = new MessagingStyle();
                messagingStyle.restoreFromCompatExtras(extras);
                return messagingStyle;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        private CharSequence makeMessageLine(Message message) {
            boolean z;
            int i;
            CharSequence charSequence;
            CharSequence charSequence2;
            BidiFormatter instance = BidiFormatter.getInstance();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (Build.VERSION.SDK_INT >= 21) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = -16777216;
            } else {
                i = -1;
            }
            if (message.getPerson() == null) {
                charSequence = "";
            } else {
                charSequence = message.getPerson().getName();
            }
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = this.mUser.getName();
                if (z && this.mBuilder.getColor() != 0) {
                    i = this.mBuilder.getColor();
                }
            }
            CharSequence unicodeWrap = instance.unicodeWrap(charSequence);
            spannableStringBuilder.append(unicodeWrap);
            spannableStringBuilder.setSpan(makeFontColorSpan(i), spannableStringBuilder.length() - unicodeWrap.length(), spannableStringBuilder.length(), 33);
            if (message.getText() == null) {
                charSequence2 = "";
            } else {
                charSequence2 = message.getText();
            }
            spannableStringBuilder.append("  ").append(instance.unicodeWrap(charSequence2));
            return spannableStringBuilder;
        }

        public void addCompatExtras(Bundle bundle) {
            super.addCompatExtras(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.mUser.getName());
            bundle.putBundle("android.messagingStyleUser", this.mUser.toBundle());
            bundle.putCharSequence("android.hiddenConversationTitle", this.mConversationTitle);
            if (this.mConversationTitle != null && this.mIsGroupConversation.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.mConversationTitle);
            }
            if (!this.mMessages.isEmpty()) {
                bundle.putParcelableArray("android.messages", Message.getBundleArrayForMessages(this.mMessages));
            }
            if (this.mIsGroupConversation != null) {
                bundle.putBoolean("android.isGroupConversation", this.mIsGroupConversation.booleanValue());
            }
        }

        /* access modifiers changed from: protected */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public void restoreFromCompatExtras(Bundle bundle) {
            this.mMessages.clear();
            if (bundle.containsKey("android.messagingStyleUser")) {
                this.mUser = Person.fromBundle(bundle.getBundle("android.messagingStyleUser"));
            } else {
                this.mUser = new Person.Builder().setName(bundle.getString("android.selfDisplayName")).build();
            }
            this.mConversationTitle = bundle.getCharSequence("android.conversationTitle");
            if (this.mConversationTitle == null) {
                this.mConversationTitle = bundle.getCharSequence("android.hiddenConversationTitle");
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
            if (parcelableArray != null) {
                this.mMessages.addAll(Message.getMessagesFromBundleArray(parcelableArray));
            }
            if (bundle.containsKey("android.isGroupConversation")) {
                this.mIsGroupConversation = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            boolean z;
            CharSequence charSequence;
            CharSequence charSequence2;
            Notification.MessagingStyle messagingStyle;
            Notification.MessagingStyle.Message message;
            CharSequence charSequence3;
            android.app.Person person;
            setGroupConversation(isGroupConversation());
            if (Build.VERSION.SDK_INT >= 24) {
                if (Build.VERSION.SDK_INT >= 28) {
                    messagingStyle = new Notification.MessagingStyle(this.mUser.toAndroidPerson());
                } else {
                    messagingStyle = new Notification.MessagingStyle(this.mUser.getName());
                }
                if (this.mIsGroupConversation.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                    messagingStyle.setConversationTitle(this.mConversationTitle);
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    messagingStyle.setGroupConversation(this.mIsGroupConversation.booleanValue());
                }
                for (Message next : this.mMessages) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        Person person2 = next.getPerson();
                        CharSequence text = next.getText();
                        long timestamp = next.getTimestamp();
                        if (person2 == null) {
                            person = null;
                        } else {
                            person = person2.toAndroidPerson();
                        }
                        new Notification.MessagingStyle.Message(text, timestamp, person);
                    } else {
                        if (next.getPerson() != null) {
                            charSequence3 = next.getPerson().getName();
                        } else {
                            charSequence3 = null;
                        }
                        message = new Notification.MessagingStyle.Message(next.getText(), next.getTimestamp(), charSequence3);
                    }
                    if (next.getDataMimeType() != null) {
                        message.setData(next.getDataMimeType(), next.getDataUri());
                    }
                    messagingStyle.addMessage(message);
                }
                messagingStyle.setBuilder(notificationBuilderWithBuilderAccessor.getBuilder());
                return;
            }
            Message findLatestIncomingMessage = findLatestIncomingMessage();
            if (this.mConversationTitle != null && this.mIsGroupConversation.booleanValue()) {
                notificationBuilderWithBuilderAccessor.getBuilder().setContentTitle(this.mConversationTitle);
            } else if (findLatestIncomingMessage != null) {
                notificationBuilderWithBuilderAccessor.getBuilder().setContentTitle("");
                if (findLatestIncomingMessage.getPerson() != null) {
                    notificationBuilderWithBuilderAccessor.getBuilder().setContentTitle(findLatestIncomingMessage.getPerson().getName());
                }
            }
            if (findLatestIncomingMessage != null) {
                Notification.Builder builder = notificationBuilderWithBuilderAccessor.getBuilder();
                if (this.mConversationTitle != null) {
                    charSequence2 = makeMessageLine(findLatestIncomingMessage);
                } else {
                    charSequence2 = findLatestIncomingMessage.getText();
                }
                builder.setContentText(charSequence2);
            }
            if (Build.VERSION.SDK_INT >= 16) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (this.mConversationTitle != null || hasMessagesWithoutSender()) {
                    z = true;
                } else {
                    z = false;
                }
                for (int size = this.mMessages.size() - 1; size >= 0; size--) {
                    Message message2 = this.mMessages.get(size);
                    if (z) {
                        charSequence = makeMessageLine(message2);
                    } else {
                        charSequence = message2.getText();
                    }
                    if (size != this.mMessages.size() - 1) {
                        spannableStringBuilder.insert(0, "\n");
                    }
                    spannableStringBuilder.insert(0, charSequence);
                }
                new Notification.BigTextStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(null).bigText(spannableStringBuilder);
            }
        }

        public MessagingStyle addMessage(CharSequence charSequence, long j, Person person) {
            addMessage(new Message(charSequence, j, person));
            return this;
        }

        @Deprecated
        public MessagingStyle addMessage(CharSequence charSequence, long j, CharSequence charSequence2) {
            this.mMessages.add(new Message(charSequence, j, new Person.Builder().setName(charSequence2).build()));
            if (this.mMessages.size() > 25) {
                this.mMessages.remove(0);
            }
            return this;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface NotificationVisibility {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface StreamType {
    }

    public static abstract class Style {
        CharSequence mBigContentTitle;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        protected Builder mBuilder;
        CharSequence mSummaryText;
        boolean mSummaryTextSet;

        private static float constrain(float f2, float f3, float f4) {
            return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public void addCompatExtras(Bundle bundle) {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        /* access modifiers changed from: protected */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public void restoreFromCompatExtras(Bundle bundle) {
        }

        public Notification build() {
            if (this.mBuilder != null) {
                return this.mBuilder.build();
            }
            return null;
        }

        private int calculateTopPadding() {
            Resources resources = this.mBuilder.mContext.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C0906R.dimen.kk);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C0906R.dimen.kl);
            float constrain = (constrain(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - constrain) * ((float) dimensionPixelSize)) + (constrain * ((float) dimensionPixelSize2)));
        }

        public void setBuilder(Builder builder) {
            if (this.mBuilder != builder) {
                this.mBuilder = builder;
                if (this.mBuilder != null) {
                    this.mBuilder.setStyle(this);
                }
            }
        }

        private void hideNormalContent(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(C0906R.id.title, 8);
            remoteViews.setViewVisibility(C0906R.id.d06, 8);
            remoteViews.setViewVisibility(C0906R.id.text, 8);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Bitmap createColoredBitmap(int i, int i2) {
            return createColoredBitmap(i, i2, 0);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public void buildIntoRemoteViews(RemoteViews remoteViews, RemoteViews remoteViews2) {
            hideNormalContent(remoteViews);
            remoteViews.removeAllViews(C0906R.id.bt6);
            remoteViews.addView(C0906R.id.bt6, remoteViews2.clone());
            remoteViews.setViewVisibility(C0906R.id.bt6, 0);
            if (Build.VERSION.SDK_INT >= 21) {
                remoteViews.setViewPadding(C0906R.id.bt7, 0, calculateTopPadding(), 0, 0);
            }
        }

        private Bitmap createColoredBitmap(int i, int i2, int i3) {
            int i4;
            Drawable a2 = a.a(this.mBuilder.mContext.getResources(), i);
            if (i3 == 0) {
                i4 = a2.getIntrinsicWidth();
            } else {
                i4 = i3;
            }
            if (i3 == 0) {
                i3 = a2.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(i4, i3, Bitmap.Config.ARGB_8888);
            a2.setBounds(0, 0, i4, i3);
            if (i2 != 0) {
                a2.mutate().setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
            }
            a2.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        /* JADX WARNING: Removed duplicated region for block: B:64:0x019c  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x01a8  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x01b4  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x01d6  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0218  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x021a  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x0224  */
        @android.support.annotation.RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.widget.RemoteViews applyStandardTemplate(boolean r16, int r17, boolean r18) {
            /*
                r15 = this;
                r0 = r15
                android.support.v4.app.NotificationCompat$Builder r2 = r0.mBuilder
                android.content.Context r2 = r2.mContext
                android.content.res.Resources r2 = r2.getResources()
                android.widget.RemoteViews r9 = new android.widget.RemoteViews
                android.support.v4.app.NotificationCompat$Builder r3 = r0.mBuilder
                android.content.Context r3 = r3.mContext
                java.lang.String r3 = r3.getPackageName()
                r4 = r17
                r9.<init>(r3, r4)
                android.support.v4.app.NotificationCompat$Builder r3 = r0.mBuilder
                int r3 = r3.getPriority()
                r4 = -1
                r10 = 1
                r11 = 0
                if (r3 >= r4) goto L_0x0025
                r3 = 1
                goto L_0x0026
            L_0x0025:
                r3 = 0
            L_0x0026:
                int r5 = android.os.Build.VERSION.SDK_INT
                r6 = 21
                r12 = 16
                r7 = 2131167184(0x7f0707d0, float:1.7948634E38)
                if (r5 < r12) goto L_0x005b
                int r5 = android.os.Build.VERSION.SDK_INT
                if (r5 >= r6) goto L_0x005b
                r5 = 2131168609(0x7f070d61, float:1.7951525E38)
                if (r3 == 0) goto L_0x004b
                java.lang.String r3 = "setBackgroundResource"
                r8 = 2130840311(0x7f020af7, float:1.7285657E38)
                r9.setInt(r5, r3, r8)
                java.lang.String r3 = "setBackgroundResource"
                r5 = 2130840318(0x7f020afe, float:1.7285671E38)
                r9.setInt(r7, r3, r5)
                goto L_0x005b
            L_0x004b:
                java.lang.String r3 = "setBackgroundResource"
                r8 = 2130840310(0x7f020af6, float:1.7285655E38)
                r9.setInt(r5, r3, r8)
                java.lang.String r3 = "setBackgroundResource"
                r5 = 2130840317(0x7f020afd, float:1.728567E38)
                r9.setInt(r7, r3, r5)
            L_0x005b:
                android.support.v4.app.NotificationCompat$Builder r3 = r0.mBuilder
                android.graphics.Bitmap r3 = r3.mLargeIcon
                r13 = 8
                if (r3 == 0) goto L_0x00bd
                int r3 = android.os.Build.VERSION.SDK_INT
                if (r3 < r12) goto L_0x0072
                r9.setViewVisibility(r7, r11)
                android.support.v4.app.NotificationCompat$Builder r3 = r0.mBuilder
                android.graphics.Bitmap r3 = r3.mLargeIcon
                r9.setImageViewBitmap(r7, r3)
                goto L_0x0075
            L_0x0072:
                r9.setViewVisibility(r7, r13)
            L_0x0075:
                if (r16 == 0) goto L_0x0105
                android.support.v4.app.NotificationCompat$Builder r1 = r0.mBuilder
                android.app.Notification r1 = r1.mNotification
                int r1 = r1.icon
                if (r1 == 0) goto L_0x0105
                r1 = 2131427740(0x7f0b019c, float:1.8477105E38)
                int r1 = r2.getDimensionPixelSize(r1)
                r3 = 2131427742(0x7f0b019e, float:1.8477109E38)
                int r3 = r2.getDimensionPixelSize(r3)
                int r3 = r3 * 2
                int r3 = r1 - r3
                int r5 = android.os.Build.VERSION.SDK_INT
                r7 = 2131169491(0x7f0710d3, float:1.7953314E38)
                if (r5 < r6) goto L_0x00ac
                android.support.v4.app.NotificationCompat$Builder r4 = r0.mBuilder
                android.app.Notification r4 = r4.mNotification
                int r4 = r4.icon
                android.support.v4.app.NotificationCompat$Builder r5 = r0.mBuilder
                int r5 = r5.getColor()
                android.graphics.Bitmap r1 = r15.createIconWithBackground(r4, r1, r3, r5)
                r9.setImageViewBitmap(r7, r1)
                goto L_0x00b9
            L_0x00ac:
                android.support.v4.app.NotificationCompat$Builder r1 = r0.mBuilder
                android.app.Notification r1 = r1.mNotification
                int r1 = r1.icon
                android.graphics.Bitmap r1 = r15.createColoredBitmap(r1, r4)
                r9.setImageViewBitmap(r7, r1)
            L_0x00b9:
                r9.setViewVisibility(r7, r11)
                goto L_0x0105
            L_0x00bd:
                if (r16 == 0) goto L_0x0105
                android.support.v4.app.NotificationCompat$Builder r1 = r0.mBuilder
                android.app.Notification r1 = r1.mNotification
                int r1 = r1.icon
                if (r1 == 0) goto L_0x0105
                r9.setViewVisibility(r7, r11)
                int r1 = android.os.Build.VERSION.SDK_INT
                if (r1 < r6) goto L_0x00f8
                r1 = 2131427737(0x7f0b0199, float:1.8477099E38)
                int r1 = r2.getDimensionPixelSize(r1)
                r3 = 2131427734(0x7f0b0196, float:1.8477093E38)
                int r3 = r2.getDimensionPixelSize(r3)
                int r1 = r1 - r3
                r3 = 2131427743(0x7f0b019f, float:1.847711E38)
                int r3 = r2.getDimensionPixelSize(r3)
                android.support.v4.app.NotificationCompat$Builder r4 = r0.mBuilder
                android.app.Notification r4 = r4.mNotification
                int r4 = r4.icon
                android.support.v4.app.NotificationCompat$Builder r5 = r0.mBuilder
                int r5 = r5.getColor()
                android.graphics.Bitmap r1 = r15.createIconWithBackground(r4, r1, r3, r5)
                r9.setImageViewBitmap(r7, r1)
                goto L_0x0105
            L_0x00f8:
                android.support.v4.app.NotificationCompat$Builder r1 = r0.mBuilder
                android.app.Notification r1 = r1.mNotification
                int r1 = r1.icon
                android.graphics.Bitmap r1 = r15.createColoredBitmap(r1, r4)
                r9.setImageViewBitmap(r7, r1)
            L_0x0105:
                android.support.v4.app.NotificationCompat$Builder r1 = r0.mBuilder
                java.lang.CharSequence r1 = r1.mContentTitle
                if (r1 == 0) goto L_0x0115
                r1 = 2131170404(0x7f071464, float:1.7955165E38)
                android.support.v4.app.NotificationCompat$Builder r3 = r0.mBuilder
                java.lang.CharSequence r3 = r3.mContentTitle
                r9.setTextViewText(r1, r3)
            L_0x0115:
                android.support.v4.app.NotificationCompat$Builder r1 = r0.mBuilder
                java.lang.CharSequence r1 = r1.mContentText
                r3 = 2131170286(0x7f0713ee, float:1.7954926E38)
                if (r1 == 0) goto L_0x0127
                android.support.v4.app.NotificationCompat$Builder r1 = r0.mBuilder
                java.lang.CharSequence r1 = r1.mContentText
                r9.setTextViewText(r3, r1)
                r1 = 1
                goto L_0x0128
            L_0x0127:
                r1 = 0
            L_0x0128:
                int r4 = android.os.Build.VERSION.SDK_INT
                if (r4 >= r6) goto L_0x0134
                android.support.v4.app.NotificationCompat$Builder r4 = r0.mBuilder
                android.graphics.Bitmap r4 = r4.mLargeIcon
                if (r4 == 0) goto L_0x0134
                r4 = 1
                goto L_0x0135
            L_0x0134:
                r4 = 0
            L_0x0135:
                android.support.v4.app.NotificationCompat$Builder r5 = r0.mBuilder
                java.lang.CharSequence r5 = r5.mContentInfo
                r6 = 2131167336(0x7f070868, float:1.7948943E38)
                if (r5 == 0) goto L_0x014b
                android.support.v4.app.NotificationCompat$Builder r1 = r0.mBuilder
                java.lang.CharSequence r1 = r1.mContentInfo
                r9.setTextViewText(r6, r1)
                r9.setViewVisibility(r6, r11)
            L_0x0148:
                r1 = 1
                r14 = 1
                goto L_0x0182
            L_0x014b:
                android.support.v4.app.NotificationCompat$Builder r5 = r0.mBuilder
                int r5 = r5.mNumber
                if (r5 <= 0) goto L_0x017d
                r1 = 2131296289(0x7f090021, float:1.821049E38)
                int r1 = r2.getInteger(r1)
                android.support.v4.app.NotificationCompat$Builder r4 = r0.mBuilder
                int r4 = r4.mNumber
                if (r4 <= r1) goto L_0x0169
                r1 = 2131562698(0x7f0d10ca, float:1.8750832E38)
                java.lang.String r1 = r2.getString(r1)
                r9.setTextViewText(r6, r1)
                goto L_0x0179
            L_0x0169:
                java.text.NumberFormat r1 = java.text.NumberFormat.getIntegerInstance()
                android.support.v4.app.NotificationCompat$Builder r4 = r0.mBuilder
                int r4 = r4.mNumber
                long r4 = (long) r4
                java.lang.String r1 = r1.format(r4)
                r9.setTextViewText(r6, r1)
            L_0x0179:
                r9.setViewVisibility(r6, r11)
                goto L_0x0148
            L_0x017d:
                r9.setViewVisibility(r6, r13)
                r14 = r1
                r1 = r4
            L_0x0182:
                android.support.v4.app.NotificationCompat$Builder r4 = r0.mBuilder
                java.lang.CharSequence r4 = r4.mSubText
                if (r4 == 0) goto L_0x01ab
                int r4 = android.os.Build.VERSION.SDK_INT
                if (r4 < r12) goto L_0x01ab
                android.support.v4.app.NotificationCompat$Builder r4 = r0.mBuilder
                java.lang.CharSequence r4 = r4.mSubText
                r9.setTextViewText(r3, r4)
                android.support.v4.app.NotificationCompat$Builder r4 = r0.mBuilder
                java.lang.CharSequence r4 = r4.mContentText
                r5 = 2131170288(0x7f0713f0, float:1.795493E38)
                if (r4 == 0) goto L_0x01a8
                android.support.v4.app.NotificationCompat$Builder r4 = r0.mBuilder
                java.lang.CharSequence r4 = r4.mContentText
                r9.setTextViewText(r5, r4)
                r9.setViewVisibility(r5, r11)
                r4 = 1
                goto L_0x01ac
            L_0x01a8:
                r9.setViewVisibility(r5, r13)
            L_0x01ab:
                r4 = 0
            L_0x01ac:
                if (r4 == 0) goto L_0x01ca
                int r4 = android.os.Build.VERSION.SDK_INT
                if (r4 < r12) goto L_0x01ca
                if (r18 == 0) goto L_0x01bf
                r4 = 2131427744(0x7f0b01a0, float:1.8477113E38)
                int r2 = r2.getDimensionPixelSize(r4)
                float r2 = (float) r2
                r9.setTextViewTextSize(r3, r11, r2)
            L_0x01bf:
                r4 = 2131168013(0x7f070b0d, float:1.7950316E38)
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r3 = r9
                r3.setViewPadding(r4, r5, r6, r7, r8)
            L_0x01ca:
                android.support.v4.app.NotificationCompat$Builder r2 = r0.mBuilder
                long r2 = r2.getWhenIfShowing()
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 == 0) goto L_0x0213
                android.support.v4.app.NotificationCompat$Builder r1 = r0.mBuilder
                boolean r1 = r1.mUseChronometer
                if (r1 == 0) goto L_0x0201
                int r1 = android.os.Build.VERSION.SDK_INT
                if (r1 < r12) goto L_0x0201
                r1 = 2131165912(0x7f0702d8, float:1.7946055E38)
                r9.setViewVisibility(r1, r11)
                java.lang.String r2 = "setBase"
                android.support.v4.app.NotificationCompat$Builder r3 = r0.mBuilder
                long r3 = r3.getWhenIfShowing()
                long r5 = android.os.SystemClock.elapsedRealtime()
                long r7 = java.lang.System.currentTimeMillis()
                long r5 = r5 - r7
                long r3 = r3 + r5
                r9.setLong(r1, r2, r3)
                java.lang.String r2 = "setStarted"
                r9.setBoolean(r1, r2, r10)
                goto L_0x0212
            L_0x0201:
                r1 = 2131170387(0x7f071453, float:1.795513E38)
                r9.setViewVisibility(r1, r11)
                java.lang.String r2 = "setTime"
                android.support.v4.app.NotificationCompat$Builder r3 = r0.mBuilder
                long r3 = r3.getWhenIfShowing()
                r9.setLong(r1, r2, r3)
            L_0x0212:
                r1 = 1
            L_0x0213:
                r2 = 2131169501(0x7f0710dd, float:1.7953334E38)
                if (r1 == 0) goto L_0x021a
                r1 = 0
                goto L_0x021c
            L_0x021a:
                r1 = 8
            L_0x021c:
                r9.setViewVisibility(r2, r1)
                r1 = 2131168014(0x7f070b0e, float:1.7950318E38)
                if (r14 == 0) goto L_0x0225
                r13 = 0
            L_0x0225:
                r9.setViewVisibility(r1, r13)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.NotificationCompat.Style.applyStandardTemplate(boolean, int, boolean):android.widget.RemoteViews");
        }

        private Bitmap createIconWithBackground(int i, int i2, int i3, int i4) {
            if (i4 == 0) {
                i4 = 0;
            }
            Bitmap createColoredBitmap = createColoredBitmap(2130840316, i4, i2);
            Canvas canvas = new Canvas(createColoredBitmap);
            Drawable mutate = a.a(this.mBuilder.mContext.getResources(), i).mutate();
            mutate.setFilterBitmap(true);
            int i5 = (i2 - i3) / 2;
            int i6 = i3 + i5;
            mutate.setBounds(i5, i5, i6, i6);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return createColoredBitmap;
        }
    }

    public static final class WearableExtender implements Extender {
        private ArrayList<Action> mActions = new ArrayList<>();
        private Bitmap mBackground;
        private String mBridgeTag;
        private int mContentActionIndex = -1;
        private int mContentIcon;
        private int mContentIconGravity = 8388613;
        private int mCustomContentHeight;
        private int mCustomSizePreset = 0;
        private String mDismissalId;
        private PendingIntent mDisplayIntent;
        private int mFlags = 1;
        private int mGravity = 80;
        private int mHintScreenTimeout;
        private ArrayList<Notification> mPages = new ArrayList<>();

        public final List<Action> getActions() {
            return this.mActions;
        }

        public final Bitmap getBackground() {
            return this.mBackground;
        }

        public final String getBridgeTag() {
            return this.mBridgeTag;
        }

        public final int getContentAction() {
            return this.mContentActionIndex;
        }

        @Deprecated
        public final int getContentIcon() {
            return this.mContentIcon;
        }

        @Deprecated
        public final int getContentIconGravity() {
            return this.mContentIconGravity;
        }

        @Deprecated
        public final int getCustomContentHeight() {
            return this.mCustomContentHeight;
        }

        @Deprecated
        public final int getCustomSizePreset() {
            return this.mCustomSizePreset;
        }

        public final String getDismissalId() {
            return this.mDismissalId;
        }

        public final PendingIntent getDisplayIntent() {
            return this.mDisplayIntent;
        }

        @Deprecated
        public final int getGravity() {
            return this.mGravity;
        }

        @Deprecated
        public final int getHintScreenTimeout() {
            return this.mHintScreenTimeout;
        }

        public final List<Notification> getPages() {
            return this.mPages;
        }

        public final WearableExtender clearActions() {
            this.mActions.clear();
            return this;
        }

        public final WearableExtender clearPages() {
            this.mPages.clear();
            return this;
        }

        public final boolean getContentIntentAvailableOffline() {
            if ((this.mFlags & 1) != 0) {
                return true;
            }
            return false;
        }

        public final boolean getHintAmbientBigPicture() {
            if ((this.mFlags & 32) != 0) {
                return true;
            }
            return false;
        }

        @Deprecated
        public final boolean getHintAvoidBackgroundClipping() {
            if ((this.mFlags & 16) != 0) {
                return true;
            }
            return false;
        }

        public final boolean getHintContentIntentLaunchesActivity() {
            if ((this.mFlags & 64) != 0) {
                return true;
            }
            return false;
        }

        @Deprecated
        public final boolean getHintHideIcon() {
            if ((this.mFlags & 2) != 0) {
                return true;
            }
            return false;
        }

        @Deprecated
        public final boolean getHintShowBackgroundOnly() {
            if ((this.mFlags & 4) != 0) {
                return true;
            }
            return false;
        }

        public final boolean getStartScrollBottom() {
            if ((this.mFlags & 8) != 0) {
                return true;
            }
            return false;
        }

        public WearableExtender() {
        }

        public final WearableExtender clone() {
            WearableExtender wearableExtender = new WearableExtender();
            wearableExtender.mActions = new ArrayList<>(this.mActions);
            wearableExtender.mFlags = this.mFlags;
            wearableExtender.mDisplayIntent = this.mDisplayIntent;
            wearableExtender.mPages = new ArrayList<>(this.mPages);
            wearableExtender.mBackground = this.mBackground;
            wearableExtender.mContentIcon = this.mContentIcon;
            wearableExtender.mContentIconGravity = this.mContentIconGravity;
            wearableExtender.mContentActionIndex = this.mContentActionIndex;
            wearableExtender.mCustomSizePreset = this.mCustomSizePreset;
            wearableExtender.mCustomContentHeight = this.mCustomContentHeight;
            wearableExtender.mGravity = this.mGravity;
            wearableExtender.mHintScreenTimeout = this.mHintScreenTimeout;
            wearableExtender.mDismissalId = this.mDismissalId;
            wearableExtender.mBridgeTag = this.mBridgeTag;
            return wearableExtender;
        }

        public final WearableExtender setBackground(Bitmap bitmap) {
            this.mBackground = bitmap;
            return this;
        }

        public final WearableExtender setBridgeTag(String str) {
            this.mBridgeTag = str;
            return this;
        }

        public final WearableExtender setContentAction(int i) {
            this.mContentActionIndex = i;
            return this;
        }

        @Deprecated
        public final WearableExtender setContentIcon(int i) {
            this.mContentIcon = i;
            return this;
        }

        @Deprecated
        public final WearableExtender setContentIconGravity(int i) {
            this.mContentIconGravity = i;
            return this;
        }

        @Deprecated
        public final WearableExtender setCustomContentHeight(int i) {
            this.mCustomContentHeight = i;
            return this;
        }

        @Deprecated
        public final WearableExtender setCustomSizePreset(int i) {
            this.mCustomSizePreset = i;
            return this;
        }

        public final WearableExtender setDismissalId(String str) {
            this.mDismissalId = str;
            return this;
        }

        public final WearableExtender setDisplayIntent(PendingIntent pendingIntent) {
            this.mDisplayIntent = pendingIntent;
            return this;
        }

        @Deprecated
        public final WearableExtender setGravity(int i) {
            this.mGravity = i;
            return this;
        }

        @Deprecated
        public final WearableExtender setHintScreenTimeout(int i) {
            this.mHintScreenTimeout = i;
            return this;
        }

        public final WearableExtender addAction(Action action) {
            this.mActions.add(action);
            return this;
        }

        public final WearableExtender addActions(List<Action> list) {
            this.mActions.addAll(list);
            return this;
        }

        public final WearableExtender addPage(Notification notification) {
            this.mPages.add(notification);
            return this;
        }

        public final WearableExtender addPages(List<Notification> list) {
            this.mPages.addAll(list);
            return this;
        }

        public final WearableExtender setContentIntentAvailableOffline(boolean z) {
            setFlag(1, z);
            return this;
        }

        public final WearableExtender setHintAmbientBigPicture(boolean z) {
            setFlag(32, z);
            return this;
        }

        @Deprecated
        public final WearableExtender setHintAvoidBackgroundClipping(boolean z) {
            setFlag(16, z);
            return this;
        }

        public final WearableExtender setHintContentIntentLaunchesActivity(boolean z) {
            setFlag(64, z);
            return this;
        }

        @Deprecated
        public final WearableExtender setHintHideIcon(boolean z) {
            setFlag(2, z);
            return this;
        }

        @Deprecated
        public final WearableExtender setHintShowBackgroundOnly(boolean z) {
            setFlag(4, z);
            return this;
        }

        public final WearableExtender setStartScrollBottom(boolean z) {
            setFlag(8, z);
            return this;
        }

        @RequiresApi(20)
        private static Notification.Action getActionFromActionCompat(Action action) {
            Bundle bundle;
            Notification.Action.Builder builder = new Notification.Action.Builder(action.getIcon(), action.getTitle(), action.getActionIntent());
            if (action.getExtras() != null) {
                bundle = new Bundle(action.getExtras());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
            if (Build.VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(action.getAllowGeneratedReplies());
            }
            builder.addExtras(bundle);
            RemoteInput[] remoteInputs = action.getRemoteInputs();
            if (remoteInputs != null) {
                for (RemoteInput addRemoteInput : RemoteInput.fromCompat(remoteInputs)) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            return builder.build();
        }

        public WearableExtender(Notification notification) {
            Bundle bundle;
            Bundle extras = NotificationCompat.getExtras(notification);
            if (extras != null) {
                bundle = extras.getBundle("android.wearable.EXTENSIONS");
            } else {
                bundle = null;
            }
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("actions");
                if (Build.VERSION.SDK_INT >= 16 && parcelableArrayList != null) {
                    Action[] actionArr = new Action[parcelableArrayList.size()];
                    for (int i = 0; i < actionArr.length; i++) {
                        if (Build.VERSION.SDK_INT >= 20) {
                            actionArr[i] = NotificationCompat.getActionCompatFromAction((Notification.Action) parcelableArrayList.get(i));
                        } else if (Build.VERSION.SDK_INT >= 16) {
                            actionArr[i] = NotificationCompatJellybean.getActionFromBundle((Bundle) parcelableArrayList.get(i));
                        }
                    }
                    Collections.addAll(this.mActions, actionArr);
                }
                this.mFlags = bundle.getInt("flags", 1);
                this.mDisplayIntent = (PendingIntent) bundle.getParcelable("displayIntent");
                Notification[] notificationArrayFromBundle = NotificationCompat.getNotificationArrayFromBundle(bundle, "pages");
                if (notificationArrayFromBundle != null) {
                    Collections.addAll(this.mPages, notificationArrayFromBundle);
                }
                this.mBackground = (Bitmap) bundle.getParcelable("background");
                this.mContentIcon = bundle.getInt("contentIcon");
                this.mContentIconGravity = bundle.getInt("contentIconGravity", 8388613);
                this.mContentActionIndex = bundle.getInt("contentActionIndex", -1);
                this.mCustomSizePreset = bundle.getInt("customSizePreset", 0);
                this.mCustomContentHeight = bundle.getInt("customContentHeight");
                this.mGravity = bundle.getInt("gravity", 80);
                this.mHintScreenTimeout = bundle.getInt("hintScreenTimeout");
                this.mDismissalId = bundle.getString("dismissalId");
                this.mBridgeTag = bundle.getString("bridgeTag");
            }
        }

        public final Builder extend(Builder builder) {
            Bundle bundle = new Bundle();
            if (!this.mActions.isEmpty()) {
                if (Build.VERSION.SDK_INT >= 16) {
                    ArrayList arrayList = new ArrayList(this.mActions.size());
                    Iterator<Action> it2 = this.mActions.iterator();
                    while (it2.hasNext()) {
                        Action next = it2.next();
                        if (Build.VERSION.SDK_INT >= 20) {
                            arrayList.add(getActionFromActionCompat(next));
                        } else if (Build.VERSION.SDK_INT >= 16) {
                            arrayList.add(NotificationCompatJellybean.getBundleForAction(next));
                        }
                    }
                    bundle.putParcelableArrayList("actions", arrayList);
                } else {
                    bundle.putParcelableArrayList("actions", null);
                }
            }
            if (this.mFlags != 1) {
                bundle.putInt("flags", this.mFlags);
            }
            if (this.mDisplayIntent != null) {
                bundle.putParcelable("displayIntent", this.mDisplayIntent);
            }
            if (!this.mPages.isEmpty()) {
                bundle.putParcelableArray("pages", (Parcelable[]) this.mPages.toArray(new Notification[this.mPages.size()]));
            }
            if (this.mBackground != null) {
                bundle.putParcelable("background", this.mBackground);
            }
            if (this.mContentIcon != 0) {
                bundle.putInt("contentIcon", this.mContentIcon);
            }
            if (this.mContentIconGravity != 8388613) {
                bundle.putInt("contentIconGravity", this.mContentIconGravity);
            }
            if (this.mContentActionIndex != -1) {
                bundle.putInt("contentActionIndex", this.mContentActionIndex);
            }
            if (this.mCustomSizePreset != 0) {
                bundle.putInt("customSizePreset", this.mCustomSizePreset);
            }
            if (this.mCustomContentHeight != 0) {
                bundle.putInt("customContentHeight", this.mCustomContentHeight);
            }
            if (this.mGravity != 80) {
                bundle.putInt("gravity", this.mGravity);
            }
            if (this.mHintScreenTimeout != 0) {
                bundle.putInt("hintScreenTimeout", this.mHintScreenTimeout);
            }
            if (this.mDismissalId != null) {
                bundle.putString("dismissalId", this.mDismissalId);
            }
            if (this.mBridgeTag != null) {
                bundle.putString("bridgeTag", this.mBridgeTag);
            }
            builder.getExtras().putBundle("android.wearable.EXTENSIONS", bundle);
            return builder;
        }

        private void setFlag(int i, boolean z) {
            if (z) {
                this.mFlags = i | this.mFlags;
                return;
            }
            this.mFlags = (i ^ -1) & this.mFlags;
        }
    }

    public static int getBadgeIconType(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getBadgeIconType();
        }
        return 0;
    }

    public static String getCategory(Notification notification) {
        if (Build.VERSION.SDK_INT >= 21) {
            return notification.category;
        }
        return null;
    }

    public static String getChannelId(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getChannelId();
        }
        return null;
    }

    @RequiresApi(19)
    public static CharSequence getContentTitle(Notification notification) {
        return notification.extras.getCharSequence("android.title");
    }

    public static int getGroupAlertBehavior(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getGroupAlertBehavior();
        }
        return 0;
    }

    public static String getShortcutId(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getShortcutId();
        }
        return null;
    }

    public static long getTimeoutAfter(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getTimeoutAfter();
        }
        return 0;
    }

    public static int getActionCount(Notification notification) {
        if (Build.VERSION.SDK_INT >= 19) {
            if (notification.actions != null) {
                return notification.actions.length;
            }
            return 0;
        } else if (Build.VERSION.SDK_INT >= 16) {
            return NotificationCompatJellybean.getActionCount(notification);
        } else {
            return 0;
        }
    }

    @Nullable
    public static Bundle getExtras(Notification notification) {
        if (Build.VERSION.SDK_INT >= 19) {
            return notification.extras;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return NotificationCompatJellybean.getExtras(notification);
        }
        return null;
    }

    public static String getGroup(Notification notification) {
        if (Build.VERSION.SDK_INT >= 20) {
            return notification.getGroup();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            return notification.extras.getString("android.support.groupKey");
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return NotificationCompatJellybean.getExtras(notification).getString("android.support.groupKey");
        }
        return null;
    }

    @RequiresApi(21)
    public static List<Action> getInvisibleActions(Notification notification) {
        ArrayList arrayList = new ArrayList();
        Bundle bundle = notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle == null) {
            return arrayList;
        }
        Bundle bundle2 = bundle.getBundle("invisible_actions");
        if (bundle2 != null) {
            for (int i = 0; i < bundle2.size(); i++) {
                arrayList.add(NotificationCompatJellybean.getActionFromBundle(bundle2.getBundle(Integer.toString(i))));
            }
        }
        return arrayList;
    }

    public static boolean getLocalOnly(Notification notification) {
        if (Build.VERSION.SDK_INT >= 20) {
            if ((notification.flags & 256) != 0) {
                return true;
            }
            return false;
        } else if (Build.VERSION.SDK_INT >= 19) {
            return notification.extras.getBoolean("android.support.localOnly");
        } else {
            if (Build.VERSION.SDK_INT >= 16) {
                return NotificationCompatJellybean.getExtras(notification).getBoolean("android.support.localOnly");
            }
            return false;
        }
    }

    public static String getSortKey(Notification notification) {
        if (Build.VERSION.SDK_INT >= 20) {
            return notification.getSortKey();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            return notification.extras.getString("android.support.sortKey");
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return NotificationCompatJellybean.getExtras(notification).getString("android.support.sortKey");
        }
        return null;
    }

    public static boolean isGroupSummary(Notification notification) {
        if (Build.VERSION.SDK_INT >= 20) {
            if ((notification.flags & 512) != 0) {
                return true;
            }
            return false;
        } else if (Build.VERSION.SDK_INT >= 19) {
            return notification.extras.getBoolean("android.support.isGroupSummary");
        } else {
            if (Build.VERSION.SDK_INT >= 16) {
                return NotificationCompatJellybean.getExtras(notification).getBoolean("android.support.isGroupSummary");
            }
            return false;
        }
    }

    @RequiresApi(20)
    static Action getActionCompatFromAction(Notification.Action action) {
        RemoteInput[] remoteInputArr;
        boolean z;
        int i;
        RemoteInput[] remoteInputs = action.getRemoteInputs();
        if (remoteInputs == null) {
            remoteInputArr = null;
        } else {
            RemoteInput[] remoteInputArr2 = new RemoteInput[remoteInputs.length];
            for (int i2 = 0; i2 < remoteInputs.length; i2++) {
                RemoteInput remoteInput = remoteInputs[i2];
                RemoteInput remoteInput2 = new RemoteInput(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), remoteInput.getExtras(), null);
                remoteInputArr2[i2] = remoteInput2;
            }
            remoteInputArr = remoteInputArr2;
        }
        if (Build.VERSION.SDK_INT < 24) {
            z = action.getExtras().getBoolean("android.support.allowGeneratedReplies");
        } else if (action.getExtras().getBoolean("android.support.allowGeneratedReplies") || action.getAllowGeneratedReplies()) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        boolean z3 = action.getExtras().getBoolean("android.support.action.showsUserInterface", true);
        if (Build.VERSION.SDK_INT >= 28) {
            i = action.getSemanticAction();
        } else {
            i = action.getExtras().getInt("android.support.action.semanticAction", 0);
        }
        Action action2 = new Action(action.icon, action.title, action.actionIntent, action.getExtras(), remoteInputArr, null, z2, i, z3);
        return action2;
    }

    static Notification[] getNotificationArrayFromBundle(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Notification[]) || parcelableArray == null) {
            return (Notification[]) parcelableArray;
        }
        Notification[] notificationArr = new Notification[parcelableArray.length];
        for (int i = 0; i < parcelableArray.length; i++) {
            notificationArr[i] = (Notification) parcelableArray[i];
        }
        bundle.putParcelableArray(str, notificationArr);
        return notificationArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.os.Bundle} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.v4.app.NotificationCompat.Action getAction(android.app.Notification r3, int r4) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 20
            if (r0 < r1) goto L_0x000f
            android.app.Notification$Action[] r3 = r3.actions
            r3 = r3[r4]
            android.support.v4.app.NotificationCompat$Action r3 = getActionCompatFromAction(r3)
            return r3
        L_0x000f:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            r2 = 0
            if (r0 < r1) goto L_0x0036
            android.app.Notification$Action[] r0 = r3.actions
            r0 = r0[r4]
            android.os.Bundle r3 = r3.extras
            java.lang.String r1 = "android.support.actionExtras"
            android.util.SparseArray r3 = r3.getSparseParcelableArray(r1)
            if (r3 == 0) goto L_0x002b
            java.lang.Object r3 = r3.get(r4)
            r2 = r3
            android.os.Bundle r2 = (android.os.Bundle) r2
        L_0x002b:
            int r3 = r0.icon
            java.lang.CharSequence r4 = r0.title
            android.app.PendingIntent r0 = r0.actionIntent
            android.support.v4.app.NotificationCompat$Action r3 = android.support.v4.app.NotificationCompatJellybean.readAction(r3, r4, r0, r2)
            return r3
        L_0x0036:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x0041
            android.support.v4.app.NotificationCompat$Action r3 = android.support.v4.app.NotificationCompatJellybean.getAction(r3, r4)
            return r3
        L_0x0041:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.NotificationCompat.getAction(android.app.Notification, int):android.support.v4.app.NotificationCompat$Action");
    }
}
