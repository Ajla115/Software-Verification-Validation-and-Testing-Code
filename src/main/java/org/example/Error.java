package org.example;

/*1. Create a class Error with the following attributes:
a. error message
b. file name
c. line number
d. severity level (can range from 0 to 7)
e. date and time of occurrence (no need to complicate, this can be a string)
2. Create a constructor for the given class
3. Create a method that will return the type of error. “Notice” errors have a severity level between 0 and 1.
“Warnings” start from 2 and go up to 4. 5 and 6 are “errors” and 7 is a “critical failure”.
4. Create a method that checks if an error is “urgent” and needs to be fixed immediately. Urgent errors have a severity level of at least 5
5. Create 2 unit tests for all the methods (one positive assertion and one negative assertion).
6. Make sure that the “urgent error” tests are run first, and then “type of error” tests.
*/
public class Error {
    private String errorMessage;
    private String fileName;
    private int lineNumber;
    private int severityLevel;
    private String dateAndTime;


    public Error(String errorMessage, String fileName, int lineNumber, int severityLevel, String dateAndTime){
        this.errorMessage = errorMessage;
        this.fileName = fileName;
        this.severityLevel = severityLevel;
        this.dateAndTime = dateAndTime;
    }

    public String typeOfError(int severityLevel){
        if(severityLevel >= 0 && severityLevel <= 1){
            return "Notice";
        }
        else if(severityLevel >= 2 && severityLevel <= 4){
            return "Warnings";
        }
        else if(severityLevel >= 5 && severityLevel <= 6){
            System.out.println("Errors");

        }
        else if(severityLevel == 7){
            return "Critical failure";
        }

        else {
            return "Wrong input. Please enter a number between 0 and 7.";
        }

        return null;
    }

    public boolean checkIfUrgent(int severityLevel){
        if(severityLevel >= 5){
            System.out.println("The error is urgent and needs to be fixed immediately");
            return true;
        }
        return false;
    }
}
