public class Student {
    private String studentID;
    private String studentName;
    private String[] extraActivities;

    public Student(String studentID, String studentName, int totalExtraActivities) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.extraActivities = new String[totalExtraActivities];
    }

    // Getters and Setters
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String[] getExtraActivities() {
        return extraActivities;
    }

    public void setExtraActivities(String[] extraActivities) {
        this.extraActivities = extraActivities;
    }

    public void addExtraActivity(int activityIndex, String activity) {
        if (activityIndex >= 0 && activityIndex < extraActivities.length) {
            extraActivities[activityIndex] = activity;
        } else {
            System.out.println("Invalid activity index provided.");
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("ID: " + studentID + "\nName: " + studentName + "\nExtra Activities: ");
        for (String activity : extraActivities) {
            if (activity != null) {
                result.append(activity).append(", ");
            }
        }
        return result.toString();
    }
}