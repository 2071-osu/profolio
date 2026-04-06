import java.time.DayOfWeek;

/**
 * Layered implementations of secondary methods for {@code WeeklyRoutine}.
 */
public abstract class WeeklyRoutineSecondary implements WeeklyRoutine {

    /*
     * ---------------------------------------------------------------- 1.
     * Common Object Methods
     * ----------------------------------------------------------------
     */

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("{");
        boolean first = true;

        for (DayOfWeek day : DayOfWeek.values()) {
            if (this.hasDay(day)) {
                if (!first) {
                    result.append(", ");
                }
                result.append(day.name()).append(": [Muscle: ");
                result.append(this.getMuscleGroup(day)).append(", Note: ");
                result.append(this.getNotes(day)).append("]");
                first = false;
            }
        }
        result.append("}");
        return result.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof WeeklyRoutine)) {
            return false;
        }

        WeeklyRoutine other = (WeeklyRoutine) obj;

        for (DayOfWeek day : DayOfWeek.values()) {
            boolean thisHasDay = this.hasDay(day);
            boolean otherHasDay = other.hasDay(day);

            if (thisHasDay != otherHasDay) {
                return false;
            }
            if (thisHasDay) {
                if (!this.getMuscleGroup(day)
                        .equals(other.getMuscleGroup(day))) {
                    return false;
                }
                if (!this.getNotes(day).equals(other.getNotes(day))) {
                    return false;
                }
            }
        }
        return true;
    }

    /*
     * ---------------------------------------------------------------- 2.
     * Secondary Methods
     * ----------------------------------------------------------------
     */

    @Override
    public void clear() {
        for (DayOfWeek day : DayOfWeek.values()) {
            if (this.hasDay(day)) {
                this.removeDay(day);
            }
        }
    }
}