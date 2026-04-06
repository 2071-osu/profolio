import java.time.DayOfWeek;

import java.time.DayOfWeek;

public interface WeeklyRoutine {

    /**
     * Checks if a specific day has a plan.
     * * @param day the day of the week to check
     * @return true if the day has a plan, false otherwise
     */
    boolean hasDay(DayOfWeek day);

    /**
     * Sets the plan for a specific day.
     * * @param day the day of the week
     * @param muscleGroup the muscle group to train
     * @param note specific notes for the workout
     */
    void setDay(DayOfWeek day, String muscleGroup, String note);

    /**
     * Gets the muscle group for a specific day.
     * * @param day the day of the week
     * @return the muscle group
     * @requires this.hasDay(day)
     */
    String getMuscleGroup(DayOfWeek day);

    /**
     * Gets the notes for a specific day.
     * * @param day the day of the week
     * @return the notes
     * @requires this.hasDay(day)
     */
    String getNotes(DayOfWeek day);

    /**
     * Removes the plan for a specific day.
     * * @param day the day of the week
     * @requires this.hasDay(day)
     */
    void removeDay(DayOfWeek day);

    /**
     * Clears all plans for the week.
     */
    void clear();
}