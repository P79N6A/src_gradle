package android.support.constraint.solver;

import java.util.Arrays;

public class SolverVariable {
    private static int uniqueConstantId = 1;
    private static int uniqueErrorId = 1;
    private static int uniqueId = 1;
    private static int uniqueSlackId = 1;
    private static int uniqueUnrestrictedId = 1;
    public float computedValue;
    int definitionId = -1;
    public int id = -1;
    ArrayRow[] mClientEquations = new ArrayRow[8];
    int mClientEquationsCount;
    private String mName;
    Type mType;
    public int strength;
    float[] strengthVector = new float[7];
    public int usageInRowCount;

    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public String getName() {
        return this.mName;
    }

    static void increaseErrorId() {
        uniqueErrorId++;
    }

    /* access modifiers changed from: package-private */
    public void clearStrengths() {
        for (int i = 0; i < 7; i++) {
            this.strengthVector[i] = 0.0f;
        }
    }

    public void reset() {
        this.mName = null;
        this.mType = Type.UNKNOWN;
        this.strength = 0;
        this.id = -1;
        this.definitionId = -1;
        this.computedValue = 0.0f;
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
    }

    public String toString() {
        return "" + this.mName;
    }

    /* access modifiers changed from: package-private */
    public String strengthsToString() {
        String str = this + "[";
        boolean z = false;
        boolean z2 = true;
        for (int i = 0; i < this.strengthVector.length; i++) {
            String str2 = str + this.strengthVector[i];
            if (this.strengthVector[i] > 0.0f) {
                z = false;
            } else if (this.strengthVector[i] < 0.0f) {
                z = true;
            }
            if (this.strengthVector[i] != 0.0f) {
                z2 = false;
            }
            if (i < this.strengthVector.length - 1) {
                str = str2 + ", ";
            } else {
                str = str2 + "] ";
            }
        }
        if (z) {
            str = str + " (-)";
        }
        if (!z2) {
            return str;
        }
        return str + " (*)";
    }

    public void setName(String str) {
        this.mName = str;
    }

    public final void updateReferencesWithNewDefinition(ArrayRow arrayRow) {
        int i = this.mClientEquationsCount;
        for (int i2 = 0; i2 < i; i2++) {
            this.mClientEquations[i2].variables.updateFromRow(this.mClientEquations[i2], arrayRow, false);
        }
        this.mClientEquationsCount = 0;
    }

    public final void addToRow(ArrayRow arrayRow) {
        int i = 0;
        while (i < this.mClientEquationsCount) {
            if (this.mClientEquations[i] != arrayRow) {
                i++;
            } else {
                return;
            }
        }
        if (this.mClientEquationsCount >= this.mClientEquations.length) {
            this.mClientEquations = (ArrayRow[]) Arrays.copyOf(this.mClientEquations, this.mClientEquations.length * 2);
        }
        this.mClientEquations[this.mClientEquationsCount] = arrayRow;
        this.mClientEquationsCount++;
    }

    public final void removeFromRow(ArrayRow arrayRow) {
        int i = this.mClientEquationsCount;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.mClientEquations[i2] == arrayRow) {
                for (int i3 = 0; i3 < (i - i2) - 1; i3++) {
                    int i4 = i2 + i3;
                    this.mClientEquations[i4] = this.mClientEquations[i4 + 1];
                }
                this.mClientEquationsCount--;
                return;
            }
        }
    }

    public void setType(Type type, String str) {
        this.mType = type;
    }

    public SolverVariable(Type type, String str) {
        this.mType = type;
    }

    public SolverVariable(String str, Type type) {
        this.mName = str;
        this.mType = type;
    }

    private static String getUniqueName(Type type, String str) {
        if (str != null) {
            return str + uniqueErrorId;
        }
        switch (type) {
            case UNRESTRICTED:
                StringBuilder sb = new StringBuilder("U");
                int i = uniqueUnrestrictedId + 1;
                uniqueUnrestrictedId = i;
                sb.append(i);
                return sb.toString();
            case CONSTANT:
                StringBuilder sb2 = new StringBuilder("C");
                int i2 = uniqueConstantId + 1;
                uniqueConstantId = i2;
                sb2.append(i2);
                return sb2.toString();
            case SLACK:
                StringBuilder sb3 = new StringBuilder("S");
                int i3 = uniqueSlackId + 1;
                uniqueSlackId = i3;
                sb3.append(i3);
                return sb3.toString();
            case ERROR:
                StringBuilder sb4 = new StringBuilder("e");
                int i4 = uniqueErrorId + 1;
                uniqueErrorId = i4;
                sb4.append(i4);
                return sb4.toString();
            case UNKNOWN:
                StringBuilder sb5 = new StringBuilder("V");
                int i5 = uniqueId + 1;
                uniqueId = i5;
                sb5.append(i5);
                return sb5.toString();
            default:
                throw new AssertionError(type.name());
        }
    }
}
