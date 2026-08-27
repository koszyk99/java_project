public class Task {
    private String name;
    private boolean done;
    
    public Task(String name, boolean done) {
        this.name = name;
        this.done = done;
    }

    // getter
    public String getName() {
        return name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
