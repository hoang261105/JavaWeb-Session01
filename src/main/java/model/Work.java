package model;

public class Work {
    private static int count = 0;
    private int id;
    private String name;
    private boolean status;

    public Work(String name) {
        this.id = ++count;
        this.name = name;
        this.status = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
