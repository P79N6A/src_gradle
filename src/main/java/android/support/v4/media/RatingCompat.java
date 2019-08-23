package android.support.v4.media;

import android.media.Rating;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new Parcelable.Creator<RatingCompat>() {
        public final RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }

        public final RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }
    };
    private Object mRatingObj;
    private final int mRatingStyle;
    private final float mRatingValue;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface StarStyle {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Style {
    }

    public final int describeContents() {
        return this.mRatingStyle;
    }

    public final int getRatingStyle() {
        return this.mRatingStyle;
    }

    public final boolean isRated() {
        if (this.mRatingValue >= 0.0f) {
            return true;
        }
        return false;
    }

    public final float getPercentRating() {
        if (this.mRatingStyle != 6 || !isRated()) {
            return -1.0f;
        }
        return this.mRatingValue;
    }

    public final float getStarRating() {
        switch (this.mRatingStyle) {
            case 3:
            case 4:
            case 5:
                if (isRated()) {
                    return this.mRatingValue;
                }
                break;
        }
        return -1.0f;
    }

    public final boolean hasHeart() {
        if (this.mRatingStyle == 1 && this.mRatingValue == 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean isThumbUp() {
        if (this.mRatingStyle == 2 && this.mRatingValue == 1.0f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.mRatingStyle);
        sb.append(" rating=");
        if (this.mRatingValue < 0.0f) {
            str = "unrated";
        } else {
            str = String.valueOf(this.mRatingValue);
        }
        sb.append(str);
        return sb.toString();
    }

    public final Object getRating() {
        if (this.mRatingObj == null && Build.VERSION.SDK_INT >= 19) {
            if (isRated()) {
                switch (this.mRatingStyle) {
                    case 1:
                        this.mRatingObj = Rating.newHeartRating(hasHeart());
                        break;
                    case 2:
                        this.mRatingObj = Rating.newThumbRating(isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        this.mRatingObj = Rating.newStarRating(this.mRatingStyle, getStarRating());
                        break;
                    case 6:
                        this.mRatingObj = Rating.newPercentageRating(getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                this.mRatingObj = Rating.newUnratedRating(this.mRatingStyle);
            }
        }
        return this.mRatingObj;
    }

    public static RatingCompat newHeartRating(boolean z) {
        float f2;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        return new RatingCompat(1, f2);
    }

    public static RatingCompat newThumbRating(boolean z) {
        float f2;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        return new RatingCompat(2, f2);
    }

    public static RatingCompat newPercentageRating(float f2) {
        if (f2 < 0.0f || f2 > 100.0f) {
            return null;
        }
        return new RatingCompat(6, f2);
    }

    public static RatingCompat newUnratedRating(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i, -1.0f);
            default:
                return null;
        }
    }

    public static RatingCompat fromRating(Object obj) {
        RatingCompat ratingCompat;
        if (obj == null || Build.VERSION.SDK_INT < 19) {
            return null;
        }
        Rating rating = (Rating) obj;
        int ratingStyle = rating.getRatingStyle();
        if (rating.isRated()) {
            switch (ratingStyle) {
                case 1:
                    ratingCompat = newHeartRating(rating.hasHeart());
                    break;
                case 2:
                    ratingCompat = newThumbRating(rating.isThumbUp());
                    break;
                case 3:
                case 4:
                case 5:
                    ratingCompat = newStarRating(ratingStyle, rating.getStarRating());
                    break;
                case 6:
                    ratingCompat = newPercentageRating(rating.getPercentRating());
                    break;
                default:
                    return null;
            }
        } else {
            ratingCompat = newUnratedRating(ratingStyle);
        }
        ratingCompat.mRatingObj = obj;
        return ratingCompat;
    }

    RatingCompat(int i, float f2) {
        this.mRatingStyle = i;
        this.mRatingValue = f2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mRatingStyle);
        parcel.writeFloat(this.mRatingValue);
    }

    public static RatingCompat newStarRating(int i, float f2) {
        float f3;
        switch (i) {
            case 3:
                f3 = 3.0f;
                break;
            case 4:
                f3 = 4.0f;
                break;
            case 5:
                f3 = 5.0f;
                break;
            default:
                return null;
        }
        if (f2 < 0.0f || f2 > f3) {
            return null;
        }
        return new RatingCompat(i, f2);
    }
}
