package android.arch.persistence.db;

import java.util.regex.Pattern;

public final class SupportSQLiteQueryBuilder {
    private static final Pattern sLimitPattern = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");
    private Object[] mBindArgs;
    private String[] mColumns;
    private boolean mDistinct;
    private String mGroupBy;
    private String mHaving;
    private String mLimit;
    private String mOrderBy;
    private String mSelection;
    private final String mTable;

    public final SupportSQLiteQueryBuilder distinct() {
        this.mDistinct = true;
        return this;
    }

    public final SupportSQLiteQuery create() {
        if (!isEmpty(this.mGroupBy) || isEmpty(this.mHaving)) {
            StringBuilder sb = new StringBuilder(120);
            sb.append("SELECT ");
            if (this.mDistinct) {
                sb.append("DISTINCT ");
            }
            if (this.mColumns == null || this.mColumns.length == 0) {
                sb.append(" * ");
            } else {
                appendColumns(sb, this.mColumns);
            }
            sb.append(" FROM ");
            sb.append(this.mTable);
            appendClause(sb, " WHERE ", this.mSelection);
            appendClause(sb, " GROUP BY ", this.mGroupBy);
            appendClause(sb, " HAVING ", this.mHaving);
            appendClause(sb, " ORDER BY ", this.mOrderBy);
            appendClause(sb, " LIMIT ", this.mLimit);
            return new SimpleSQLiteQuery(sb.toString(), this.mBindArgs);
        }
        throw new IllegalArgumentException("HAVING clauses are only permitted when using a groupBy clause");
    }

    public final SupportSQLiteQueryBuilder columns(String[] strArr) {
        this.mColumns = strArr;
        return this;
    }

    public final SupportSQLiteQueryBuilder groupBy(String str) {
        this.mGroupBy = str;
        return this;
    }

    public final SupportSQLiteQueryBuilder having(String str) {
        this.mHaving = str;
        return this;
    }

    public final SupportSQLiteQueryBuilder orderBy(String str) {
        this.mOrderBy = str;
        return this;
    }

    private SupportSQLiteQueryBuilder(String str) {
        this.mTable = str;
    }

    public static SupportSQLiteQueryBuilder builder(String str) {
        return new SupportSQLiteQueryBuilder(str);
    }

    private static boolean isEmpty(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    public final SupportSQLiteQueryBuilder limit(String str) {
        if (isEmpty(str) || sLimitPattern.matcher(str).matches()) {
            this.mLimit = str;
            return this;
        }
        throw new IllegalArgumentException("invalid LIMIT clauses:" + str);
    }

    public final SupportSQLiteQueryBuilder selection(String str, Object[] objArr) {
        this.mSelection = str;
        this.mBindArgs = objArr;
        return this;
    }

    private static void appendColumns(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(' ');
    }

    private static void appendClause(StringBuilder sb, String str, String str2) {
        if (!isEmpty(str2)) {
            sb.append(str);
            sb.append(str2);
        }
    }
}
