import java.time.DayOfWeek;

/**
 * WeeklyRoutine enhanced interface.
 */
public interface WeeklyRoutine extends WeeklyRoutineKernel {
    /**
     * Gets the muscle group for a day.
     */
    String getMuscleGroup(DayOfWeek day);

    /**
     * Gets the notes for a day.
     */
    String getNotes(DayOfWeek day);

    /**
     * Clears a specific day's plan.
     */
    void clearDay(DayOfWeek day);
}