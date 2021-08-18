package com.thorinhood.data;

import com.thorinhood.heroes.Hero;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class ActionInfo {
    @NonNull
    protected final String action;
    protected final Hero doneBy;
    protected final Hero doneTo;
    protected final Integer value;

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        if (doneBy != null) {
            result.append(doneBy).append(" ");
        }
        result.append(value != null ? String.format(action, value) : action);
        if (doneTo != null) {
            result.append(" ").append(doneTo);
        }
        return result.toString();
    }

}
