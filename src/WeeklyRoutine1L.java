import java.time.DayOfWeek;
import java.util.HashMap;
import java.util.Map;

/**
 * {@code WeeklyRoutine} represented as a {@code Map} with primary methods
 * implemented. * @convention $this.routine != null and for all day in
 * $this.routine.keySet(), $this.routine.get(day).muscleGroup != null
 *
 * @correspondence this = { (d, m, n) : d is in $this.routine.keySet(), m =
 *                 $this.routine.get(d).muscleGroup, n =
 *                 $this.routine.get(d).note }
 */
public class WeeklyRoutine1L extends WeeklyRoutineSecondary {

    /*
     * Private inner class to hold workout details.
     */
    private static class DayPlan {
        String muscleGroup;
        String note;

        DayPlan(String muscleGroup, String note) {
            this.muscleGroup = muscleGroup;
            this.note = note;
        }
    }

    /*
     * The internal representation.
     */
    private Map<DayOfWeek, DayPlan> routine;

    /**
     * Creator of initial representation.
     */
    private void createNewRep() {
        this.routine = new HashMap<>();
    }

    /*
     * Constructors -----------------------------------------------------------
     */

    public WeeklyRoutine1L() {
        this.createNewRep();
    }

    /*
     * Standard Methods -------------------------------------------------------
     */

    @Override
    public final void clear() {
        this.createNewRep();
    }

    @Override
    public final WeeklyRoutine newInstance() {
        return new WeeklyRoutine1L();
    }

    @Override
    public final void transferFrom(WeeklyRoutine source) {
        assert source instanceof WeeklyRoutine1L : "Violation of: source is WeeklyRoutine1L";
        WeeklyRoutine1L localSource = (WeeklyRoutine1L) source;
        this.routine = localSource.routine;
        localSource.createNewRep();
    }

    /*
     * Kernel Methods ---------------------------------------------------------
     */

    @Override
    public final void setDay(DayOfWeek day, String muscleGroup, String note) {
        assert day != null : "Violation of: day is not null";
        assert muscleGroup != null : "Violation of: muscleGroup is not null";

        DayPlan plan = new DayPlan(muscleGroup, note);
        this.routine.put(day, plan);
    }

    @Override
    public final boolean hasDay(DayOfWeek day) {
        assert day != null : "Violation of: day is not null";
        return this.routine.containsKey(day);
    }

    @Override
    public final int size() {
        return this.routine.size();
    }
}