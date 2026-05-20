package az.edu.ada.wm2.courseservice.exception;

public class PrerequisiteNotMetException extends RuntimeException{
    public PrerequisiteNotMetException(Long prerequisiteCourseId, Long studentId) {
        super("Student " + studentId + " does not meet prerequisite conditions. They have not taken the " + prerequisiteCourseId);
    }
}
