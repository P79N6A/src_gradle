package com.google.android.gms.internal;

import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import java.io.IOException;

public final class aec extends ada<aec> implements Cloneable {
    private int zzctV = -1;
    private int zzctW = 0;

    public aec() {
        this.zzcrZ = null;
        this.zzcsi = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: zzMe */
    public aec clone() {
        try {
            return (aec) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aec)) {
            return false;
        }
        aec aec = (aec) obj;
        if (this.zzctV == aec.zzctV && this.zzctW == aec.zzctW) {
            return (this.zzcrZ == null || this.zzcrZ.isEmpty()) ? aec.zzcrZ == null || aec.zzcrZ.isEmpty() : this.zzcrZ.equals(aec.zzcrZ);
        }
        return false;
    }

    public final int hashCode() {
        return ((((((getClass().getName().hashCode() + 527) * 31) + this.zzctV) * 31) + this.zzctW) * 31) + ((this.zzcrZ == null || this.zzcrZ.isEmpty()) ? 0 : this.zzcrZ.hashCode());
    }

    public final /* synthetic */ ada zzLL() throws CloneNotSupportedException {
        return (aec) clone();
    }

    public final /* synthetic */ adg zzLM() throws CloneNotSupportedException {
        return (aec) clone();
    }

    public final /* synthetic */ adg zza(acx acx) throws IOException {
        int i;
        while (true) {
            int zzLy = acx.zzLy();
            if (zzLy == 0) {
                return this;
            }
            if (zzLy == 8) {
                i = acx.getPosition();
                int zzLA = acx.zzLA();
                switch (zzLA) {
                    case -1:
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case e.l /*?: ONE_ARG  (7 int)*/:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                    case 13:
                    case 14:
                    case 15:
                    case SearchJediMixFeedAdapter.f42514c /*?: ONE_ARG  (16 int)*/:
                    case 17:
                        this.zzctV = zzLA;
                        continue;
                }
            } else if (zzLy == 16) {
                i = acx.getPosition();
                int zzLA2 = acx.zzLA();
                if (zzLA2 != 100) {
                    switch (zzLA2) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case e.l /*?: ONE_ARG  (7 int)*/:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                        case 13:
                        case 14:
                        case 15:
                        case SearchJediMixFeedAdapter.f42514c /*?: ONE_ARG  (16 int)*/:
                            break;
                    }
                }
                this.zzctW = zzLA2;
            } else if (!super.zza(acx, zzLy)) {
                return this;
            }
            acx.zzcp(i);
            zza(acx, zzLy);
        }
    }

    public final void zza(acy acy) throws IOException {
        if (this.zzctV != -1) {
            acy.zzr(1, this.zzctV);
        }
        if (this.zzctW != 0) {
            acy.zzr(2, this.zzctW);
        }
        super.zza(acy);
    }

    /* access modifiers changed from: protected */
    public final int zzn() {
        int zzn = super.zzn();
        if (this.zzctV != -1) {
            zzn += acy.zzs(1, this.zzctV);
        }
        return this.zzctW != 0 ? zzn + acy.zzs(2, this.zzctW) : zzn;
    }
}
