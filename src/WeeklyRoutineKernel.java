import components.standard.Standard;

/**
 * WeeklyRoutine kernel component with primary methods.
 *
 * @mathmodel type WeeklyRoutineKernel is modeled by map of (day: DAY_OF_WEEK,
 *            tasks: set of string)
 * @initially {@code
 * default:
 * ensures this = {MONDAY: {}, TUESDAY: {}, ..., SUNDAY: {}}
 * }
 */
public interface WeeklyRoutineKernel extends Standard<WeeklyRoutine> {

    /**
     * Enumeration for the days of the week.
     */
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    /**
     * Adds a task to a specific day in {@code this}.
     *
     * @param day
     *            the day to add the task to
     * @param task
     *            the description of the task
     * @updates this
     * @requires task is not already scheduled for that day
     * @ensures this = #this with {(day, task) added to its set}
     */
    void addTask(Day day, String task);

    /**
     * Removes a task from a specific day in {@code this}.
     *
     * @param day
     *            the day to remove from
     * @param task
     *            the task to be removed
     * @updates this
     * @requires (day, task) is in this
     * @ensures this = #this with {(day, task) removed from its set}
     */
    void removeTask(Day day, String task);

    /**
     * Reports the number of tasks scheduled for a specific day.
     *
     * @param day
     *            the day to check
     * @return the number of tasks on that day
     * @ensures daySize = |this.tasks(day)|
     */
    int daySize(Day day);

    /**
     * Reports whether a specific task is scheduled for a given day.
     *
     * @param day
     *            the day to check
     * @param task
     *            the task to look for
     * @return true iff the task exists on that day
     * @ensures hasTask = (task is in this.tasks(day))
     */
    boolean hasTask(Day day, String task);
}
