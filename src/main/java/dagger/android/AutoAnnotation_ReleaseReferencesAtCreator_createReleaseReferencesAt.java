package dagger.android;

public final class AutoAnnotation_ReleaseReferencesAtCreator_createReleaseReferencesAt implements ReleaseReferencesAt {

    /* renamed from: a  reason: collision with root package name */
    private final int f4351a;

    public final int a() {
        return this.f4351a;
    }

    public final Class<? extends ReleaseReferencesAt> annotationType() {
        return ReleaseReferencesAt.class;
    }

    public final int hashCode() {
        return this.f4351a ^ 1335633679;
    }

    public final String toString() {
        return "@dagger.android.ReleaseReferencesAt(" + this.f4351a + ')';
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReleaseReferencesAt) || this.f4351a != ((ReleaseReferencesAt) obj).a()) {
            return false;
        }
        return true;
    }
}
