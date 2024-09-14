package org.example;

public class Ticket {
    private long id;
    private Shuttle shuttle;
    private User user;
    private String status;

    public Shuttle getShuttle() {
        return shuttle;
    }

    public void setShuttle(Shuttle shuttle) {
        this.shuttle = shuttle;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
