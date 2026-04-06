import java.util.Map;
import java.time.DayOfWeek;
import java.util.HashMap;

/**
 * weekly routine MVP version.
 */
public class WeeklyRoutine {
    /**
      * representation of routine.
      */
     private Map<DayOfWeek, Map<String, String>> routine;

     /**
      * constructors.
      */
     public WeeklyRoutine() {
        this.routine = new HashMap<>();
     }

     /**
      * kernel.
      */

     /**
      * helps set day for weekly plan.
      * @param day
      * @param muscleGroup
      * @param note
      */
     public void setDay(DayOfWeek day, String muscleGroup, String note) {
        Map<String, String> days = new HashMap<>();
        days.put("muscleGroup", muscleGroup);
        days.put("note", note);
        this.routine.put(day, days);
     }

     /**
      * helps get the muscle user planed to practice at this day.
      * @param day
      * @return String
      */
     public String getMuscleGroup(DayOfWeek day) {
        Map<String, String> map = this.routine.get(day);
        return map.get("muscleGroup");
     }

     /**
      * helps get notes for this day.
      * @param day
      * @return String
      */
     public String getNotes(DayOfWeek day) {
        Map<String, String> map = this.routine.get(day);
        return map.get("note");
     }

     /**
      * clears all the data of this day.
      * @param day
      */
     public void clearDay(DayOfWeek day){
        Map<String, String> map = this.routine.get(day);
        map.clear();
     }

     /**
      * main method.
      * @param args
      */
     public static void main(String[] args) {
        System.out.println("Weekly routine");

        WeeklyRoutine myPlan = new WeeklyRoutine();

        myPlan.setDay(DayOfWeek.MONDAY, "chest", "Bench Press");
        String muscle = myPlan.getMuscleGroup(DayOfWeek.MONDAY);
        String note = myPlan.getNotes(DayOfWeek.MONDAY);
        System.out.println(muscle);
        System.out.println(note);
        myPlan.clearDay(DayOfWeek.MONDAY);
        System.out.println(myPlan);
     }
}
