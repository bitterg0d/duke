import java.text.ParseException;

public class Task {
    protected String description;
    protected boolean isDone;
    protected String type;
    protected String deadline;
    protected String event;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "\u2713" : "\u2718"); //return tick or X symbols
    }

    public String getType() {
        /*
        if (type.equals("todo")) {
            return "T";
        } else if (type.equals("deadline")) {
            return "D";
        } else if (type.equals("event")){
            return "E";
        }
        */
        return "error";
    }

    public String getDesc() {
        return this.description;
    }

    public String getAt() {
        return "";
    }

    public String getBy() {
        return "";
    }

    public String getDone() {
        return this.isDone ? "1" : "0";
    }

    /* mutators */

    public void isDone(boolean boo) {
        this.isDone = boo;
    }

    public void addType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "[" + this.getStatusIcon() + "] " + description;
    }

    public String toFile() throws ParseException {
        return "";
    }
}